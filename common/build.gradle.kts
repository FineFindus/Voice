import deps.Deps
import deps.Versions

plugins {
  id("com.android.library")
  id("kotlin-android")
}

android {

  compileSdkVersion(Versions.compileSdk)

  defaultConfig {
    minSdkVersion(Versions.minSdk)
    targetSdkVersion(Versions.targetSdk)
  }

  compileOptions {
    sourceCompatibility = Versions.sourceCompatibility
    targetCompatibility = Versions.targetCompatibility
  }
}

dependencies {
  implementation(project(":ffmpeg"))
  implementation(project(":core"))
  implementation(Deps.Kotlin.std)
  implementation(Deps.AndroidX.appCompat)
  implementation(Deps.Kotlin.coroutines)
  implementation(Deps.Dagger.core)
  implementation(Deps.timber)
  implementation(Deps.AndroidX.appCompat)
  implementation(Deps.material)

  testImplementation(Deps.truth)
  testImplementation(Deps.junit)
}
