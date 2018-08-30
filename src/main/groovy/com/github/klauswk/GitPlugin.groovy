package com.github.klauswk;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

class GitPlugin implements Plugin<Project> {

    @Override
	void apply(Project project) {
        def extension = project.extensions.create('gitConfigExtension', GitConfigExtension, project)

        project.tasks.create('branch',CurrentBranchTask) {
            gitFolder = extension.gitFolder
        }

        project.tasks.create('commit',CurrentHashTask) {
            gitFolder = extension.gitFolder
        }
    }
}
