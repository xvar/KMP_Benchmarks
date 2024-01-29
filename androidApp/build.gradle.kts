plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
    id("org.jetbrains.compose")
}

android {
    namespace = "com.example.kmp_sample_gen.android"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.example.kmp_sample_gen.android"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlin {
        jvmToolchain(17)
    }
}

dependencies {
    implementation(projects.shared)
    implementation(compose.runtime)
    implementation(compose.foundation)
    implementation(libs.androidx.activity.compose)
    implementation(compose.material)
    implementation(libs.compose.material3)
}
