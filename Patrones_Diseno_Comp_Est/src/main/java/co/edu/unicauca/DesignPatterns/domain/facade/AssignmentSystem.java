package co.edu.unicauca.DesignPatterns.domain.facade;

import co.edu.unicauca.DesignPatterns.domain.entities.Project;

public class AssignmentSystem {
    public boolean assign(Project project) {
        System.out.println("Assigning project to a student: " + project.getProjectTitle());
        return Math.random() > 0.2; // 80% probabilidad de asignar
    }
}

