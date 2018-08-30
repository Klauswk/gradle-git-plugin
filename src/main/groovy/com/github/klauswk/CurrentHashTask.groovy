package com.github.klauswk

import org.eclipse.jgit.api.Git
import org.eclipse.jgit.revwalk.RevWalk
import org.eclipse.jgit.storage.file.FileRepositoryBuilder
import org.eclipse.jgit.lib.Repository
import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.TaskAction

class CurrentHashTask extends DefaultTask {

    final Property<String> gitFolder = project.objects.property(String)

    @Override
    String getDescription() {
        return "Gradle Simple Task Implementation Example Getting current commit hash"
    }

    @Override
    String getGroup() {
       return "Release"
    }

    @TaskAction
    void getCommit() {
        def git = Git.open(new File(gitFolder.get() + "/.git"))
                .checkout()

            Repository repository = git.getRepository()

            RevWalk revCommits = new RevWalk(repository)

            def commit = revCommits.parseCommit(repository.findRef("refs/heads/" + repository.getBranch()).getObjectId())

            println commit.getId().toString().substring(7,48)

            revCommits.dispose()
        }
}