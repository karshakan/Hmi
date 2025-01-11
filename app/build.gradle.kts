plugins {
    alias(libs.plugins.android.library) // Change from 'android.application' to 'android.library'
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.luxo.luxolib5"
    compileSdk = 35

    defaultConfig {
        // Remove `applicationId` as it is not needed for libraries
        minSdk = 35

       // versionCode = 1 // Optional, but good to keep track
      //  versionName = "1.0"

        consumerProguardFiles("consumer-rules.pro") // Optional: ProGuard rules for the library consumers
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
