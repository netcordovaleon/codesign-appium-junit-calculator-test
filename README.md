# APPIUM TEST EXAMPLE

*Author: Luis Córdova Leon*

## Requirements:

- Real ANDROID devices or Emulator from Android SDK.
- Setup JAVA_HOME variable environment.
- Setup MAVEN_HOME variable environmet.
- Setup GRADLE_HOME variable environmet.
- Setup ANDROID_HOME variable environment.
- Install Appium from NodeJS packages


## Install Appium
Require NodeJS
```bash
npm install -g appium
```

## Usage

Open gitbash or linux terminal and execute command:

```nodejs
appium
```

Response:
```
[Appium] Welcome to Appium v1.18.0
[Appium] Appium REST http interface listener started on 0.0.0.0:4723
[HTTP] --> POST /wd/hub/session
```

If you use your real cellphone, you should connect with USB and Check "USB Debugging = ENABLE"

After that run JUnitTest with IDE IntelliJ or another or run this command:

```java
mvn clean install
```

## License
NO LICENCES