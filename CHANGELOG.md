# Changelog

## [Unreleased](https://github.com/SURFnet/tiqr-app-android/tree/HEAD)

[4.1.1]

- Allow logging in without opening the Push Notification

**Full Changelog**: https://github.com/Tiqr/tiqr-app-android/compare/v4.0.23...v4.1.0

[4.0.23]

- Disable tokenexchange
- Merge pull request #49 from Tiqr/bugfix/tiqr-3x58_samsung_black_screen
- Update core, SDK version to 34, and camera libraries (#48)
- Allow all domain names to use Tiqr
- Merge pull request #44 from Tiqr/feature/add-kanazawa
- Fix for TIQR-339: Black screen on QR-code scanner (Samsung A23)
- Update core (Pushnotification remove large icon - TIQR-337)
- Update core (push-notification-colors TIQR-337)
- Add dark theme

**Full Changelog**: https://github.com/Tiqr/tiqr-app-android/compare/v4.0.3...v4.0.23

[4.0.3]

## Other Changes
* Use correct core/data branche (https://github.com/Tiqr/tiqr-app-android/commit/5b729021a7d050bb9e8ab9d74b0972e76bcab334 by @welsinga, https://github.com/Tiqr/tiqr-app-android/commit/8219c25de9f7614bdd8dadbb44a53eef6c11f49f by @welsinga)
* Mitigations against task hijacking (https://github.com/Tiqr/tiqr-app-android/commit/384ed5113eea44e04b6bc53951a42ad6a051cfdf by @dzolnai)
* Make it run on Java 11 (https://github.com/Tiqr/tiqr-app-android/commit/80d543fa3d9b71a47fb9e95d7e371c2c9ef6d64c by @welsinga)
* Use library by github submodule (https://github.com/Tiqr/tiqr-app-android/commit/9f0b992a8eae128b0b93ddd99185f1228cc6a039 by @welsinga)
* Bump library versions (https://github.com/Tiqr/tiqr-app-android/commit/6fa1403baa455295a8939503e925cb34135ab7a2 by @dzolnai)
* Fix distribution script (https://github.com/Tiqr/tiqr-app-android/commit/c6963c5926a62bdb2ea78808e802aa250f9e2200 by @dzolnai)
* Multiple domain names enforced now (https://github.com/Tiqr/tiqr-app-android/commit/936a21caeee97008fa606ebed838519b230a2070 by @dzolnai)
* Change enforced host (https://github.com/Tiqr/tiqr-app-android/commit/63dfe12ce522096f093c743211240d147ed82c5b by @dzolnai)
* Add token exchange base URL parameter (https://github.com/Tiqr/tiqr-app-android/commit/abbce42afa1f9e73f4b4b3643aa0b9f70085f3fb by @dzolnai)
* Update tiqr with the latest library (https://github.com/Tiqr/tiqr-app-android/commit/cece3e4471280576190a78745ccb1e386bc0417d by @dzolnai)
* Tryfix for Bio (https://github.com/Tiqr/tiqr-app-android/commit/b49d7a7c7b36e3ed59a0889ea1b702fff9a81e3c by @welsinga)
* Fix issue with kerning (https://github.com/Tiqr/tiqr-app-android/commit/473df96f3939c298a291e3e090017819d895d8d8 by @welsinga)
* Update core lib version (https://github.com/Tiqr/tiqr-app-android/commit/5c5fb2e8a9c255c37adf7ad1b0aec0d6873df451 by @welsinga)
* Fix pincode size (https://github.com/Tiqr/tiqr-app-android/commit/6dd3a1b676ac7da836168656f972c57227847faa by @welsinga)
* Change font size (https://github.com/Tiqr/tiqr-app-android/commit/d10433cc732ee30d42ebd208d3dc3aec882b3453 by @welsinga)
* Minor fixes (https://github.com/Tiqr/tiqr-app-android/commit/19635b625c652a4c4ccb3f3762cb73947d09ce1b by @dima-ko)
* Fixed bottom surf icon (https://github.com/Tiqr/tiqr-app-android/commit/82f3baa173ce1f38c937b6d7fd8ca4c43b1e9e02 by @dima-ko)
* Fixed "Powered by SURF" icon (https://github.com/Tiqr/tiqr-app-android/commit/74d8f04481bfbc4c46948f0343ed9f78beab2a0e by @dima-ko)
* Adapt SURF branding (https://github.com/Tiqr/tiqr-app-android/commit/0b05d4aa4a9b5854370cd9c322f14a71f30376b1 by @dima-ko)
* SURFnet/tiqr-client-android into f/TIQR-224-2 (https://github.com/Tiqr/tiqr-app-android/commit/f71369a1761701aba2772de7a3f042635c8ead7c by @dima-ko, https://github.com/Tiqr/tiqr-app-android/commit/ea058084ac2583ddba54f929e3f1cb36e70eb7a0 by @dima-ko)
* Replaced data and core modules with maven dependencies (https://github.com/Tiqr/tiqr-app-android/commit/207d0e84b532663c28c4683fe80c3537c577bf54 by @dima-ko)
* SURFnet/tiqr-client-android into feature/TIQR-211_maven_accessible_core (https://github.com/Tiqr/tiqr-app-android/commit/04a2648b2a75682d9121ab354cd5f4ee4bb0d652)
* remove java 8 from workflow (https://github.com/Tiqr/tiqr-app-android/commit/e6a36b8fea8cc63a84e70a255281dea8ec9a2a2c)
* add empty line to data gradle (https://github.com/Tiqr/tiqr-app-android/commit/02d0ea456b2ca0c565e4112e1c07d62ae66d8f1e)
* make core library accessible on maven central (https://github.com/Tiqr/tiqr-app-android/commit/17dce4b994e924707724f7b07b89be1ce550ee92)
* downgrade ruby to fix build issues (https://github.com/Tiqr/tiqr-app-android/commit/190678e19df226973d3f50f45ae92ec00f4f83f9)
* Sources and resources moved from app to core module (https://github.com/Tiqr/tiqr-app-android/commit/9ff453a26069dcbe2e20f334945dda7f1f1a2f50 by @dima-ko)
* Created Core module (https://github.com/Tiqr/tiqr-app-android/commit/aca860320c6d1657929abfd42e2a1c10f8300b59 by @dima-ko)
* Fix handling of multiple identities (https://github.com/Tiqr/tiqr-app-android/commit/0a5c1328cb6b37134fb2cb629f892e207be1bc38 by @dzolnai)
* Make data classes immutable (https://github.com/Tiqr/tiqr-app-android/commit/2dc04ebc081b44f968979f0efd044de11172f477 by @dzolnai)
* No need for imagemagick (https://github.com/Tiqr/tiqr-app-android/commit/a8e693a0346652515f602b5ac34aa1fb3a79e81b by @dzolnai)
* Do not add badge (https://github.com/Tiqr/tiqr-app-android/commit/7f769a87b25f4cd834a378d28cb7f08b8b01559a by @dzolnai)
* Fix parameter type (https://github.com/Tiqr/tiqr-app-android/commit/e1da59ef101ed2c4460b1041128195fa9b26eeb6 by @dzolnai)
* Increase metaspace size (https://github.com/Tiqr/tiqr-app-android/commit/e3c092bf9d4dce1804c45e36b3f9e40a03096b01 by @dzolnai)
* Add extension to keystore name (https://github.com/Tiqr/tiqr-app-android/commit/81e0f873f85c260a1e19d7c725ae153fe7c5639e by @dzolnai)
* Add badge plugin (https://github.com/Tiqr/tiqr-app-android/commit/77e9446bfb804cdff0e073f8fbd35c4c249baffa by @dzolnai)
* Fix indenting and syntax (https://github.com/Tiqr/tiqr-app-android/commit/5bd1b582dfc43dc7b6146d0e1e735d31f2ea3842 by @dzolnai)
* Make it an array (https://github.com/Tiqr/tiqr-app-android/commit/e20d706c7de787d9a4654055eb7d0c709b6ff745 by @dzolnai)
* Add missing commas (https://github.com/Tiqr/tiqr-app-android/commit/0727fee3f8ca7619a9fdbacdccc7007a17a2cfa6 by @dzolnai)
* Add Gemfile (https://github.com/Tiqr/tiqr-app-android/commit/cfbdb1560352b9fce01de12f57f4057504e051e2 by @dzolnai)
* Fix lane name (https://github.com/Tiqr/tiqr-app-android/commit/076ae9737c24ab7623956886ff2c3d67d3894276 by @dzolnai)
* Fix component missing (https://github.com/Tiqr/tiqr-app-android/commit/d7c2bcd5fffafe9f74181f6adf575e602e0ed9c1 by @dzolnai)
* Remove unused code for possible crashfix (https://github.com/Tiqr/tiqr-app-android/commit/9b661fb8d12102dd7b5f868ca86df99fff876b21 by @dzolnai)
* Fix crash on Android 4.4 (https://github.com/Tiqr/tiqr-app-android/commit/b291c8474d76cfef38de992b9b9bfc65c788bbc5 by @dzolnai)
* Fix multidex (https://github.com/Tiqr/tiqr-app-android/commit/c53dccf2adce10f115c796a9cecb93210bb4f37a by @dzolnai)
* Fix typecast crash (https://github.com/Tiqr/tiqr-app-android/commit/c698632904f8426dd6284df2282c6dffe76e3503 by @dzolnai)
* Fix indentation (https://github.com/Tiqr/tiqr-app-android/commit/a88f39de402c6247a5fa2db0f923661f4ea0ecec by @dzolnai)
* Fix identity selection code (https://github.com/Tiqr/tiqr-app-android/commit/f37c1d635fe47ba3194f8a1c9a214874375694d4 by @dzolnai)
* Fix keyboard show reliability (https://github.com/Tiqr/tiqr-app-android/commit/0b33d8e5baebf39f421773ce28766ba4d3eec76e by @dzolnai)
* Fix issue with removed keys on wrong PIN (https://github.com/Tiqr/tiqr-app-android/commit/2f5a52629ce345e7850ec180c1f6c3ed5ab43dd0 by @dzolnai)
* //github.com/SURFnet/tiqr-client-android into develop (https://github.com/Tiqr/tiqr-app-android/commit/9bc1903e229c72a153699dd0583da8f747d7f3f4)
* Reconvert char array code to Kotlin to fix login issue (https://github.com/Tiqr/tiqr-app-android/commit/d4608f586bac166c1cf55077243401fa49131706 by @dzolnai)
* Fix crash on new API usage (https://github.com/Tiqr/tiqr-app-android/commit/69b4a14435fd2240591b0197cfe8ab958fc4b67c by @dzolnai)
* Fix crash with Firebase (https://github.com/Tiqr/tiqr-app-android/commit/5a14d0a89f77efab986b34bbbe00c2d3c6986a98 by @dzolnai)
* Fix crash with ZXing (https://github.com/Tiqr/tiqr-app-android/commit/70317f550c2dff40c9d5703d02ef4528277c71d4 by @dzolnai)
* Added missing ebtries to default locale (https://github.com/Tiqr/tiqr-app-android/commit/7d202899d6b01e66857e390ff48699079d4cb165)
* //github.com/SURFnet/tiqr-client-android into feature/shared_lib_to_kotlin (https://github.com/Tiqr/tiqr-app-android/commit/656c37b357f118d2ed971797cc8079c26a147f82)
* Add extra logging to enrollment calls (https://github.com/Tiqr/tiqr-app-android/commit/2657b7bf412a1a7d8028eaf1b787068c8fcfac62 by @dzolnai)
* //github.com/SURFnet/tiqr-client-android/issu… (https://github.com/Tiqr/tiqr-app-android/pull/37 https://github.com/Tiqr/tiqr-app-android/commit/945e5266bf33fbd752e413ced82bf5abb16cda90 by @andrei-egeniq)
* Fix for incorrect tokenexchange URL (https://github.com/Tiqr/tiqr-app-android/commit/50444249b4ad212b11d2e00dd2a6130ac01ed0c3 by @dzolnai)
* //github.com/SURFnet/tiqr-client-android (https://github.com/Tiqr/tiqr-app-android/commit/03e1c41cb0be2c8f58cc266f39c16465068fcc8d by @welsinga, https://github.com/Tiqr/tiqr-app-android/commit/5a0a6618c3e2beef3445491673a7f41cf78a4feb by @andrei-egeniq)
* 1 preview (https://github.com/Tiqr/tiqr-app-android/commit/0f34ed89425f3c56c721b5303e73102eec9134cd by @andrei-egeniq)
* petercv/tiqr (https://github.com/Tiqr/tiqr-app-android/commit/c9724992e01615afbdf40e6b1447089357214ca7 by @petercv)
* OCRA: String rawKey -> hexKey; Q length < 4 check. (https://github.com/Tiqr/tiqr-app-android/commit/dac805207137078f5b50d4aa7ed675ea2f151b04 by @comel)
* OCRA: fix indentation. (https://github.com/Tiqr/tiqr-app-android/commit/aaec6c251ca4a67928c225ad811ac073d7f880b3 by @comel)
* OCRA: check timestamp length. (https://github.com/Tiqr/tiqr-app-android/commit/c515beb16750ff1d9001b9cad0f737db031c4cc3 by @comel)
* OCRAWrapper: InvalidChallengeException fix. (https://github.com/Tiqr/tiqr-app-android/commit/203dca64e09a7f3626216cb77374806557a6d3f1 by @comel)
* use new OCRA in OCRAWrapper. (https://github.com/Tiqr/tiqr-app-android/commit/d0b66415d495d4b6086927fc2318bb37f1443ff4 by @comel)
* new OCRA implementation. (https://github.com/Tiqr/tiqr-app-android/commit/5fb1aaced88a0e5d179f8063af320cde1a7bab7d)

**Full Changelog**: https://github.com/Tiqr/tiqr-app-android/compare/v4.0.2...v4.0.3


[earlier](https://github.com/SURFnet/tiqr-app-android/compare/test_TIQR-211_maven_accessible_core...HEAD)

**Merged pull requests:**

- TIQR-251: Tryfix for Bio [\#15](https://github.com/SURFnet/tiqr-app-android/pull/15) ([welsinga](https://github.com/welsinga))
- TIQR-248: Fix issue with kerning [\#14](https://github.com/SURFnet/tiqr-app-android/pull/14) ([welsinga](https://github.com/welsinga))
- TIQR-250: Update core lib version [\#13](https://github.com/SURFnet/tiqr-app-android/pull/13) ([welsinga](https://github.com/welsinga))
- TIQR-254: Change footer size [\#12](https://github.com/SURFnet/tiqr-app-android/pull/12) ([welsinga](https://github.com/welsinga))
- TIQR-225: Minor fixes [\#11](https://github.com/SURFnet/tiqr-app-android/pull/11) ([dima-ko](https://github.com/dima-ko))
- TIQR-225: Fixed bottom surf icon [\#10](https://github.com/SURFnet/tiqr-app-android/pull/10) ([dima-ko](https://github.com/dima-ko))
- TIQR-225: Fixed "Powered by SURF" icon [\#9](https://github.com/SURFnet/tiqr-app-android/pull/9) ([dima-ko](https://github.com/dima-ko))
- TIQR-225: Adapt SURF branding [\#8](https://github.com/SURFnet/tiqr-app-android/pull/8) ([dima-ko](https://github.com/dima-ko))
- TIQR-233: Fix Tiqr app crashing [\#7](https://github.com/SURFnet/tiqr-app-android/pull/7) ([sarahachem](https://github.com/sarahachem))
- TIQR-237:  Fix app name for firebase distribution [\#6](https://github.com/SURFnet/tiqr-app-android/pull/6) ([sarahachem](https://github.com/sarahachem))
- TIQR-0000 remove wrong logo [\#5](https://github.com/SURFnet/tiqr-app-android/pull/5) ([sarahachem](https://github.com/sarahachem))
- TIQR-237: add testing flavor [\#4](https://github.com/SURFnet/tiqr-app-android/pull/4) ([sarahachem](https://github.com/sarahachem))
- TIQR-0000: Remove publish script and fix firebase distribution [\#3](https://github.com/SURFnet/tiqr-app-android/pull/3) ([sarahachem](https://github.com/sarahachem))
- Revert app changes to show tiqr app [\#2](https://github.com/SURFnet/tiqr-app-android/pull/2) ([dima-ko](https://github.com/dima-ko))
- TIQR-224: Replaced data and core modules with maven dependencies [\#1](https://github.com/SURFnet/tiqr-app-android/pull/1) ([dima-ko](https://github.com/dima-ko))

## [test_TIQR-211_maven_accessible_core](https://github.com/SURFnet/tiqr-app-android/tree/test_TIQR-211_maven_accessible_core) (2021-11-10)

[Full Changelog](https://github.com/SURFnet/tiqr-app-android/compare/3.1.0...test_TIQR-211_maven_accessible_core)

## [3.1.0](https://github.com/SURFnet/tiqr-app-android/tree/3.1.0) (2021-01-14)

[Full Changelog](https://github.com/SURFnet/tiqr-app-android/compare/v3.0.10...3.1.0)

## [v3.0.10](https://github.com/SURFnet/tiqr-app-android/tree/v3.0.10) (2020-11-20)

[Full Changelog](https://github.com/SURFnet/tiqr-app-android/compare/v3.0.9...v3.0.10)

## [v3.0.9](https://github.com/SURFnet/tiqr-app-android/tree/v3.0.9) (2020-11-13)

[Full Changelog](https://github.com/SURFnet/tiqr-app-android/compare/v3.0.6...v3.0.9)

## [v3.0.6](https://github.com/SURFnet/tiqr-app-android/tree/v3.0.6) (2020-10-06)

[Full Changelog](https://github.com/SURFnet/tiqr-app-android/compare/3.0.5...v3.0.6)

## [3.0.5](https://github.com/SURFnet/tiqr-app-android/tree/3.0.5) (2020-07-02)

[Full Changelog](https://github.com/SURFnet/tiqr-app-android/compare/3.0.4...3.0.5)

## [3.0.4](https://github.com/SURFnet/tiqr-app-android/tree/3.0.4) (2020-07-01)

[Full Changelog](https://github.com/SURFnet/tiqr-app-android/compare/v3.0...3.0.4)

## [v3.0](https://github.com/SURFnet/tiqr-app-android/tree/v3.0) (2019-03-27)

[Full Changelog](https://github.com/SURFnet/tiqr-app-android/compare/0c752d6ff42b85bea1eba5f38b918bf68aa35876...v3.0)



\* *This Changelog was automatically generated by [github_changelog_generator](https://github.com/github-changelog-generator/github-changelog-generator)*
