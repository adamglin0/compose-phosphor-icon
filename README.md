# Phosphor Icon For Compose Multiplatform

A kotlin platform library for using [phosphor icon](https://phosphoricons.com/) in compose multiplatform.

![Maven Central Version](https://img.shields.io/maven-central/v/com.adamglin/phosphor-icon)

---

## Install

compose-shadow supports platforms below.

1. [x] android
2. [x] ios
3. [x] desktop(jvm)

#### in your kotlin  module

```kotlin
implementation("com.adamglin:phosphor-icon:$version")
```

## Using

```kotlin
Icon(imageVector = PhosphorIcons.Bold.`Air-traffic-control-bold`, contentDescription = null)
```

## Build By Yourself

#### run first.kts

   ```bash
   kotlinc -script first.kts
   ```

this script will download phosphor icon origin files
from [this url](https://phosphoricons.com/assets/phosphor-icons.zip) in /temp folder.
And unzip it, rename all files as

./temp/phosphor-icons/bold/airplane-tilt-bold.svg -> ./temp/phosphor-icons/bold/AirplaneTilt.svg

#### Download [SVG to Compose](https://plugins.jetbrains.com/plugin/index?xmlId=by.overpass.svg-to-compose-intellij&utm_source=product&utm_medium=link&utm_campaign=IC&utm_content=2024.2) Intellij Plugin

#### Generate by SVG To Compose


## Sample

<img width="254" alt="image" src="https://github.com/user-attachments/assets/865cb40c-62b1-42c1-b109-b4a053ea9e4a">

