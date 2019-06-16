buildscript {

    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.5.0-beta04")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.31")
    }

}

allprojects {

    repositories {
        google()
        jcenter()
    }

}

tasks.withType(Delete::class) {
    delete(rootProject.buildDir)
}