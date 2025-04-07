package co.edu.unicauca.DesignPatterns.domain.entities;

import co.edu.unicauca.DesignPatterns.domain.state.PendingState;
import co.edu.unicauca.DesignPatterns.domain.state.ProjectState;

public class Project {
    private String projectTitle;
    private ProjectState state;

    public Project(String projectTitle) {
        this.projectTitle = projectTitle;
        this.state = new PendingState(); // Estado inicial
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public ProjectState getState() {
        return state;
    }

    public void setState(ProjectState state) {
        this.state = state;
    }
    public void approve() {
        state.approve(this);
    }

    public void reject() {
        state.reject(this);
    }

    public void assign() {
        state.assign(this);
    }

    public void complete() {
        state.complete(this);
    }

}
