plugins {
    id(Plugins.AGP.java)
    id(Plugins.Kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {

    //Coroutines
    implementation(Dependencies.Coroutines.core)

    //Inject
    implementation(Dependencies.Javax.inject)
}