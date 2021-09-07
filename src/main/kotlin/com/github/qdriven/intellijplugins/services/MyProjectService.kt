package com.github.qdriven.intellijplugins.services

import com.github.qdriven.intellijplugins.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
