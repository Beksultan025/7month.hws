// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    id(Plugins.AGP.application) version Versions.AGP apply false
    id(Plugins.AGP.library) version Versions.AGP apply false
    id(Plugins.Kotlin.kotlin) version Versions.kotlin apply false
    id(Plugins.DaggerHilt.hilt) version Versions.daggerHilt apply false
    id("org.jetbrains.kotlin.jvm") version "1.7.10" apply false
}
