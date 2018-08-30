package com.github.klauswk

import org.gradle.api.Project
import org.gradle.api.provider.Property

class GitConfigExtension {
    final Property<String> gitFolder

    GitConfigExtension(Project project) {
        gitFolder = project.objects.property(String)
        gitFolder.set('')
    }
}
