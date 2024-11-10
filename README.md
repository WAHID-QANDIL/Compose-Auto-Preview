<h1 align="center">Compose Auto Preview</h1><br>

<div align="center">
<a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
<a href="https://android-arsenal.com/api?level=23" rel="nofollow">
    <img alt="API" src="https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat" style="max-width: 100%;">
</a>
  <img src="https://img.shields.io/badge/Platform-Android-brightgreen.svg?logo=android" alt="Badge Android" />
  <img src="https://img.shields.io/badge/iOS-13%2B-blue.svg?logo=apple" alt="iOS 13+ Badge" />

<a href="https://github.com/WAHID-QANDIL">

<a href="https://github.com/WAHID-QANDIL/"><img alt="Profile" src="https://img.shields.io/badge/github-%23181717.svg?&style=for-the-badge&logo=github&logoColor=white" height="20"/></a>
</div>




# How to
[![](https://jitpack.io/v/WAHID-QANDIL/Compose-Auto-Preview.svg)](https://jitpack.io/#WAHID-QANDIL/Compose-Auto-Preview)


To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

    gradle
    maven
    sbt
    leiningen

Add it in your root build.gradle at the end of repositories:

	dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.WAHID-QANDIL:Compose-Auto-Preview:Tag'
	}

