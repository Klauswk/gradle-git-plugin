# gradle-git-plugin
An simple example of gradle plugin with jgit

To build, run `./gradlew fatjar`, this will generate the correct jar in `builds/libs/`.

The plugin name is fully base on the `gradlePlugin` found in the `build.gradle`

```
gradlePlugin {
    plugins {
        simplePlugin {
            id = 'com.github.klauswk'
            implementationClass = 'com.github.klauswk.GitPlugin'
        }
    }
}
```

Then it can be imported using `buildScript` on any other project.

```
buildscript {    
    dependencies {
        classpath group: 'com.github.klauswk', name: 'git-plugin', version: '0.0.1-SNAPSHOT'
    }
}
```

This will search for the jar in `com/github/klauswk/git-plugin/0.0.1-SNAPSHOT/`

References:


https://www.thedroidsonroids.com/blog/how-to-create-gradle-plugin-in-kotlin

https://docs.gradle.org/current/userguide/tutorial_using_tasks.html

https://docs.gradle.org/current/userguide/custom_plugins.html#custom_plugins

http://www.vogella.com/tutorials/JGit/article.html

https://www.eclipse.org/jgit/

