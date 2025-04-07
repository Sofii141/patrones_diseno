package co.edu.unicauca.DesignPatterns.decorator;

import co.edu.unicauca.DesignPatterns.domain.entities.Project;

public abstract class ProjectDecorator extends Project{
    protected Project project;

    public ProjectDecorator(Project project) {
        super(project.getProjectTitle());
        this.project = project;
    }

    public String getDescription() {
        return "Description: " + project.getProjectTitle();
    }

}
