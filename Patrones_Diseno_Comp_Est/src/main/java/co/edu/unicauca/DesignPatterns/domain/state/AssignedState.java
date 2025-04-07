package co.edu.unicauca.DesignPatterns.domain.state;

import co.edu.unicauca.DesignPatterns.domain.entities.Project;

public class AssignedState implements ProjectState {
    @Override
    public void approve(Project project) {
        System.out.println("Project is already assigned, cannot approve again.");
    }

    @Override
    public void reject(Project project) {
        System.out.println("Assigned project cannot be rejected.");
    }

    @Override
    public void assign(Project project) {
        System.out.println("Project is already assigned.");
    }

    @Override
    public void complete(Project project) {
        project.setState(new CompletedState());
        System.out.println("Project completed!");
    }

    @Override
    public String toString() {
        return "AssignedState";
    }
}
