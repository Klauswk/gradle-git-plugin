package com.github.klauswk

import org.eclipse.jgit.api.Git
import org.eclipse.jgit.lib.Repository
import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.TaskAction

class CurrentBranchTask extends DefaultTask {

    final Property<String> gitFolder = project.objects.property(String)

    @Override
    String getDescription() {
        return "Gradle Simple Task Implementation Example Getting current Branch"
    }

    @Override
    String getGroup() {
       return "Release"
    }

    @TaskAction
    void getBranch() {
        def git = Git.open(new File(gitFolder.get() + "/.git"))
                .checkout()

            Repository repository = git.getRepository()

            println repository.getBranch()
        }
}