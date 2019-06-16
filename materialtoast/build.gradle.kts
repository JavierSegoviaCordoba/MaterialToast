import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("com.jfrog.bintray") version ("1.8.4")
    id("maven-publish")
}

val libGroupId = "com.javiersc"
val libArtifact = "MaterialToast"
val libVariantName = "materialtoast"
val libVariantVersionName = "release"
val libVersion = "1.0.0"
val libWebsite = "https://github.com/JavierSegoviaCordoba/MaterialToast/"
val libDescription = "The usual Toasty, but with steroids."
val libVSC = "https://github.com/JavierSegoviaCordoba/MaterialToast.git"
val libIssueTracker = "https://github.com/JavierSegoviaCordoba/MaterialToast/issues/"
val libLicense = "Apache-2.0"
val libLabel1 = "Android"
val libLabel2 = "Kotlin"
val libLabel3 = "Material Design"
val libLabel4 = "Toast"

android {
    compileSdkVersion(28)
    buildToolsVersion("29.0.0")

    defaultConfig {
        minSdkVersion(15)
        targetSdkVersion(28)
        versionCode = 1
        versionName = libVersion

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    lintOptions {
        isAbortOnError = false
    }

}

repositories {
    jcenter()
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation("androidx.appcompat:appcompat:1.0.2")
    implementation("androidx.core:core-ktx:1.0.2")
    implementation("com.google.android.material:material:1.1.0-alpha07")
}

val sourcesJar: Jar by tasks.creating(Jar::class) {
    archiveClassifier.set("sources")
    from(android.sourceSets.getByName("main").java.srcDirs)
}


val localProperties = gradleLocalProperties(rootDir)
val publicationName = libArtifact

bintray {
    user = localProperties.getProperty("bintrayUser")
    key = localProperties.getProperty("bintrayKey")
    publish = true
    pkg.apply {
        repo = libArtifact
        name = libArtifact
        userOrg = user
        description = libDescription
        websiteUrl = libWebsite
        setLicenses(libLicense)
        issueTrackerUrl = libIssueTracker
        vcsUrl = libVSC
        version.apply { name = libVersion }
        setLabels(libLabel1, libLabel2, libLabel3, libLabel4)
    }
    setPublications(publicationName)
}

publishing {
    publications {
        create<MavenPublication>(publicationName) {
            groupId = libGroupId
            artifactId = project.name
            version = libVersion
            artifact(sourcesJar)
            artifact("$buildDir/outputs/aar/materialtoast-release.aar")
        }
    }
}
