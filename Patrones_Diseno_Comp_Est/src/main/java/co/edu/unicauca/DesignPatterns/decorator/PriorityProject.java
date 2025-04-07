package co.edu.unicauca.DesignPatterns.decorator;

import co.edu.unicauca.DesignPatterns.domain.entities.Project;

public class PriorityProject extends ProjectDecorator {
    public PriorityProject(Project project) {
        super(project);
    }

    @Override
    public String getDescription() {
        return project.getProjectTitle() + " [High Priority]";
    }
}