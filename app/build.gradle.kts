plugins {
    id(Plugins.AGP.application)
    id(Plugins.Kotlin.kotlin)
    id(Plugins.Kotlin.kapt)
    id(Plugins.DaggerHilt.hilt)
}

android {
    namespace = "com.example.a7monthclasswork1"

    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        applicationId = "com.example.a7monthclasswork1"
        minSdk = AndroidConfig.minSdk
        targetSdk = AndroidConfig.targetSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility =JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(project(":domain"))
    implementation(project(":data"))

    //UI
    implementation (Dependencies.UI.core)
    implementation(Dependencies.UI.appCompact)
    implementation (Dependencies.UI.material)
    implementation (Dependencies.UI.constraintLayout)
    testImplementation (Dependencies.UI.junit)
    androidTestImplementation (Dependencies.UI.androidJunit)
    androidTestImplementation (Dependencies.UI.espressoCore)
    implementation (Dependencies.UI.fragment)

    //Room
    implementation (Dependencies.Room.runtime)
    implementation (Dependencies.Room.room)
    kapt (Dependencies.Room.compiler)

    // Coroutines
    implementation(Dependencies.Coroutines.android)
    implementation(Dependencies.Coroutines.core)

    // Dagger-Hilt
    implementation(Dependencies.DaggerHilt.android)
    kapt (Dependencies.DaggerHilt.compiler)

    //Navigation
    implementation (Dependencies.Navigation.fragment)
    implementation (Dependencies.Navigation.UI)

    //Lifecycle
    implementation (Dependencies.Lifecycle.viewModel)
    implementation (Dependencies.Lifecycle.runtime)

    //ViewBindingDelegate
    implementation (Dependencies.ViewBinding.delegate)


    //Room
    implementation(Dependencies.Room.room)
    implementation(Dependencies.Room.compiler)
    implementation(Dependencies.Room.runtime)
}