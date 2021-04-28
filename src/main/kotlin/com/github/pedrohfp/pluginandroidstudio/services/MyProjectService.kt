package com.github.pedrohfp.pluginandroidstudio.services

import com.github.pedrohfp.pluginandroidstudio.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
