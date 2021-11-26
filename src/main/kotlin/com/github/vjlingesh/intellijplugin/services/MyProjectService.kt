package com.github.vjlingesh.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.vjlingesh.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
