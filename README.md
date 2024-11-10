
# How to
[![](https://jitpack.io/v/WAHID-QANDIL/Compose-Auto-Preview.svg)](https://jitpack.io/#WAHID-QANDIL/Compose-Auto-Preview)
![Weekly download statistics](https://jitpack.io/v/USER/REPO/week.svg)
![Monthly download statistics](https://jitpack.io/v/USER/REPO/month.svg)

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

