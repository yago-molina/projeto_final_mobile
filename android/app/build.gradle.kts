android {
    namespace = "com.example.projetofinal"
    compileSdk = 34 // Define explicitamente a versão do SDK

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    defaultConfig {
        applicationId = "com.example.projetofinal"
        minSdk = 21
        targetSdk = 34 // Define explicitamente o targetSdk
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}