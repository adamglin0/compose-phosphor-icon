# Phosphor Icons for Compose Multiplatform

A Kotlin Multiplatform library for using [Phosphor Icons](https://phosphoricons.com/) in Compose Multiplatform.

![Maven Central Version](https://img.shields.io/maven-central/v/com.adamglin/phosphor-icon)

---

## Install

This library supports these platforms:

1. [x] Android
2. [x] iOS
3. [x] Desktop (JVM)
4. [x] Web (JS / WasmJS)

**In your Kotlin module:**

```kotlin
implementation("com.adamglin:phosphor-icon:$version")
```

## Usage

```kotlin
Icon(imageVector = PhosphorIcons.Bold.AirTrafficControl, contentDescription = null)
```

## Build By Yourself

#### run data_converter.kts

   ```bash
   kotlinc -script download-and-preprocessing.kts
   ```

this script will download phosphor icon origin files
from [this url](https://phosphoricons.com/assets/phosphor-icons.zip) in /temp folder.
And unzip it, rename all files with PascalCase style. Final, script will reset the icon size to 24.dp(as Material3 Icons)
#### run svg-to-compose.main.kts

```bash
kotlinc -script svg-to-compose.main.kts
```

this script will generate all icons in `phosphor/src/commainMain/kotlin`

## Sample

<img width="254" alt="image" src="https://github.com/user-attachments/assets/865cb40c-62b1-42c1-b109-b4a053ea9e4a">

