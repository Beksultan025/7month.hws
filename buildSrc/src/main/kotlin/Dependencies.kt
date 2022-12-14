object Versions {
    const val core = "1.9.0"
    const val appCompact = "1.5.1"
    const val material = "1.7.0"
    const val constraintLayout = "2.1.4"
    const val junit = "4.13.2"
    const val androidJunit = "1.1.4"
    const val espressoCore = "3.5.0"

    const val fragment = "1.5.4"


    const val room = "2.4.3"

    const val coroutines = "1.6.4"

    const val daggerHilt = "2.44"

    const val navigation = "2.5.2"

    const val lifecycle = "2.5.1"

    const val viewBindingDelegate = "1.5.6"


    const val AGP = "7.3.0"
    const val kotlin = "1.7.10"
}

object Dependencies {

    object UI {
        const val core = "androidx.core:core-ktx:${Versions.core}"
        const val appCompact = "androidx.appcompat:appcompat:${Versions.appCompact}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val junit = "junit:junit:${Versions.junit}"
        const val androidJunit = "androidx.test.ext:junit:${Versions.androidJunit}"
        const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"

        const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"

    }

    object Room {
        const val runtime = "androidx.room:room-runtime:${Versions.room}"
        const val room = "androidx.room:room-ktx:${Versions.room}"
        const val compiler = "androidx.room:room-compiler:${Versions.room}"
    }

    object Coroutines {
        const val android =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        const val core =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    }

    object DaggerHilt {
        const val android = "com.google.dagger:hilt-android:${Versions.daggerHilt}"
        const val compiler = "com.google.dagger:hilt-compiler:${Versions.daggerHilt}"
    }

    object Navigation {
        const val fragment =
            "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val UI = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    }

    object Lifecycle {
        const val viewModel =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        const val runtime =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    }

    object ViewBinding {
        const val delegate =
            "com.github.kirich1409:viewbindingpropertydelegate-noreflection:${Versions.viewBindingDelegate}"
    }

    object Javax {
        const val inject = "javax.inject:javax.inject:1"
    }
}

object Plugins {
    object AGP{
        const val application = "com.android.application"
        const val library = "com.android.library"
        const val java = "java-library"
    }
    object Kotlin{
        const val kotlin = "org.jetbrains.kotlin.android"
        const val kapt = "kotlin-kapt"
        const val jvm = "org.jetbrains.kotlin.jvm"

    }
    object DaggerHilt{
        const val hilt = "com.google.dagger.hilt.android"
    }
}