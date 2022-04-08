# UpgradeableSpawnersAPI - Integrate UpgradeableSpawners into your Plugin

[![](https://jitpack.io/v/Angeschossen/LandsAPI.svg)](https://jitpack.io/#Angeschossen/UpgradeableSpawnersAPI)

Include the API with Maven:

```xml

<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
<dependency>
    <groupId>com.github.angeschossen</groupId>
    <artifactId>UpgradeableSpawnersAPI</artifactId>
    <version>INSERT VERSION HERE</version>
    <scope>provided</scope>
</dependency>
</dependencies>
```

Include the API with Gradle:

```groovy
repositories {
	maven { url 'https://jitpack.io' }
}
dependencies {
    compileOnly "com.github.angeschossen:UpgradeableSpawnersAPI:INSERT VERSION HERE"
}
```

Alternatively you can download the jar file from here: https://github.com/Angeschossen/UpgradeableSpawnersAPI/releases

## Usage

Please make sure to add softdepend: [UpgradeableSpawners] to your plugin.yml.
All methods can be found in the UpgradeableSpawnersAPI class: https://github.com/Angeschossen/UpgradeableSpawnersAPI/blob/master/src/main/java/me/angeschossen/upgradeablespawners/api/UpgradeableSpawnersAPI.java
