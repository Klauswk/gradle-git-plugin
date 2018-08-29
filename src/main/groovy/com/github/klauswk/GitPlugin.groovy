package com.github.klauswk;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

class GitPlugin implements Plugin<Project> {

    @Override
	void apply(Project project) {
        project.tasks.create('hello',Greeting)
    }
}
