package com.github.erlichg.pycharmplugintest.services

import com.intellij.openapi.project.Project
import com.github.erlichg.pycharmplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
