import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("com.android.application")
    id("dagger.hilt.android.plugin")
    id("kotlin-parcelize")
    id("com.google.devtools.ksp")
}

if (JavaVersion.current() < JavaVersion.VERSION_21) {
    throw GradleException("Please use JDK ${JavaVersion.VERSION_21} or above")
}

fun String.runCommand(workingDir: File = file("./")): String {
    return providers.exec {
        commandLine(*this@runCommand.split("\\s".toRegex()).toTypedArray())
        workingDir(workingDir)
    }.standardOutput.asText.get().trim()
}

val isAppDebuggable = providers.environmentVariable("CI").orNull != "true"

android {
    namespace = "org.tiqr.authenticator"

    compileSdk = libs.versions.android.sdk.compile.get().toInt()

    val gitTagCount = "git tag --list".runCommand().split('\n').size
    val gitTag = "git describe --tags --dirty".runCommand()
    val gitCoreSha = "git submodule status".runCommand().substring(0, 8)
    val ciRunCount = providers.environmentVariable("GITHUB_RUN_NUMBER").map { it.toInt() }.getOrElse(0)

    defaultConfig {
        applicationId = "org.tiqr.authenticator"
        //add 24 to versioncode, to match previous manual releases
        versionCode = gitTagCount + 24 + ciRunCount
        versionName = gitTag.trim().drop(1) + " core($gitCoreSha)"

        logger.lifecycle("Building version $versionName($versionCode)", "info")


        minSdk = libs.versions.android.sdk.min.get().toInt()
        targetSdk = libs.versions.android.sdk.target.get().toInt()

        testInstrumentationRunner = "org.tiqr.authenticator.runner.HiltAndroidTestRunner"

        manifestPlaceholders["tiqr_config_base_url"] = "https://demo.tiqr.org"
        manifestPlaceholders["tiqr_config_token_exchange_base_url"] = "https://tx.tiqr.org/"
        manifestPlaceholders["tiqr_config_protocol_version"] = "2"
        manifestPlaceholders["tiqr_config_protocol_compatibility_mode"] = "true"
        manifestPlaceholders["tiqr_config_enforce_challenge_hosts"] = ""
        manifestPlaceholders["tiqr_config_enroll_path_param"] = "tiqrenroll"
        manifestPlaceholders["tiqr_config_auth_path_param"] = "tiqrauth"
        manifestPlaceholders["tiqr_config_enroll_scheme"] = "tiqrenroll"
        manifestPlaceholders["tiqr_config_auth_scheme"] = "tiqrauth"
        manifestPlaceholders["tiqr_config_token_exchange_enabled"] = "false"
        manifestPlaceholders["tiqr_config_in_app_update_check_enabled"] = "true"

        // only package supported languages
        resourceConfigurations += listOf(
            "en",
            "da",
            "de",
            "es",
            "fr",
            "fy",
            "hr",
            "ja",
            "lt",
            "nl",
            "no",
            "ro",
            "sk",
            "sl",
            "sr",
            "tr"
        )
    }

    buildTypes {
        getByName("debug") {
            isDebuggable = isAppDebuggable
            isMinifyEnabled = false
            isShrinkResources = false
            applicationIdSuffix = ".staging"
            signingConfig = if (isAppDebuggable) {
                signingConfigs.getByName("debug")
            } else {
                null
            }
        }
        getByName("release") {
            isDebuggable = isAppDebuggable
            isMinifyEnabled = false
            isShrinkResources = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )

            signingConfig = if (isAppDebuggable) {
                signingConfigs.getByName("debug")
            } else {
                null
            }
        }
    }

    buildFeatures {
        dataBinding = false
        viewBinding = true
        buildConfig = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }


    lint {
        abortOnError = false
    }
}

kotlin {
    jvmToolchain(21)
}
dependencies {
    implementation(project(":data"))
    implementation(project(":core"))

    implementation(libs.kotlin.stdlib)
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.androidx.core)
    implementation(libs.kotlinx.coroutines.playServices)

    implementation(libs.androidx.activity)
    implementation(libs.androidx.autofill)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core)
    implementation(libs.androidx.concurrent)
    implementation(libs.androidx.lifecycle.common)
    implementation(libs.androidx.lifecycle.livedata)
    implementation(libs.androidx.localBroadcastManager)
    implementation(libs.androidx.navigation.fragment)
    implementation(libs.androidx.navigation.ui)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.splashscreen)
    implementation(libs.google.android.material)
    implementation(libs.google.mlkit.barcode)
    implementation(libs.google.firebase.messaging)

    implementation(libs.dagger.hilt.android)
    implementation(libs.dagger.hilt.fragment)
    ksp(libs.dagger.hilt.compiler)

    implementation(libs.permission)
    implementation(libs.coil)
    implementation(libs.betterLink)

    api(libs.moshi.moshi)
    ksp(libs.moshi.codegen)

    api(libs.okhttp.okhttp)
    api(libs.okhttp.logging)

    api(libs.retrofit.retrofit)
    implementation(libs.retrofit.converter.moshi)
    implementation(libs.retrofit.converter.scalars)

    api(libs.timber)

    testImplementation(libs.junit)
    androidTestImplementation(libs.junit)
    androidTestImplementation(libs.androidx.testing.core)
    androidTestImplementation(libs.androidx.testing.junit)
    androidTestImplementation(libs.androidx.testing.rules)
    androidTestImplementation(libs.androidx.testing.epsresso)
    androidTestImplementation(libs.androidx.testing.uiautomator)
    androidTestImplementation(libs.kotlinx.coroutines.test)

    androidTestImplementation(libs.dagger.hilt.testing)
    kspAndroidTest(libs.dagger.hilt.compiler)
}

// Disable analytics
configurations {
    all {
        exclude(group = "com.google.firebase", module = "firebase-core")
        exclude(group = "com.google.firebase", module = "firebase-analytics")
        exclude(group = "com.google.firebase", module = "firebase-measurement-connector")
    }
}

apply {
    plugin("com.google.gms.google-services")
}
