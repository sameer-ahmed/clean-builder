package com.github.sameerahmed.cleanbuilder.services

import com.intellij.openapi.project.Project
import com.github.sameerahmed.cleanbuilder.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
