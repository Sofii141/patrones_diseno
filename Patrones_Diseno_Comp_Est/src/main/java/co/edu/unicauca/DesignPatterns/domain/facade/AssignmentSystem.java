package co.edu.unicauca.DesignPatterns.domain.facade;

import co.edu.unicauca.DesignPatterns.domain.entities.Project;

public class AssignmentSystem {
    public boolean assign(Project project) {
        System.out.println("Project successfully managed and assigned.");
        return true;
    }
}
