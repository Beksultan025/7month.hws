plugins {
    id(Plugins.AGP.library)
    id(Plugins.Kotlin.kotlin)
    id(Plugins.Kotlin.kapt)
}

android {
    namespace = "com.example.data"
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        minSdk = AndroidConfig.minSdk
        targetSdk = AndroidConfig.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(project(":domain"))

    //UI
    implementation(Dependencies.UI.core)
    testImplementation(Dependencies.UI.junit)
    androidTestImplementation(Dependencies.UI.androidJunit)

    //Dagger-Hilt
    implementation(Dependencies.DaggerHilt.compiler)
    implementation(Dependencies.DaggerHilt.android)

    //Room
    implementation(Dependencies.Room.room)
    implementation(Dependencies.Room.compiler)
    implementation(Dependencies.Room.runtime)

    //Coroutines
    implementation(Dependencies.Coroutines.android)
}