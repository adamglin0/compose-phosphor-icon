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

## Versions

| lib   | phosphor-icon | CMP   | Kotlin |
|-------|---------------|-------|--------|
| 1.0.0 | 2.1.0         | 1.7.1 | 2.0.21 |

## Build By Yourself

   ```bash
   kotlinc -script run.main.kts
   ```

#### what's the script do?

1. download phosphor-icons-zip
2. unzip it
3. reset all path's default size
4. convert svg to compose path

this script will generate all icons in `phosphor/src/commainMain/kotlin`

## Sample

<img width="254" alt="image" src="https://github.com/user-attachments/assets/865cb40c-62b1-42c1-b109-b4a053ea9e4a">

