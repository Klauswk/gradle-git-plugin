package com.github.klauswk;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

class Greeting extends DefaultTask {

    @Override
    String getDescription() {
        return "Gradle Simple Task Implementation Example Getting current commit hash"
    }

    @Override
    String getGroup() {
       return "Build";
    }

    @TaskAction
    void printMessage() {
            print ""
        }
}