package co.edu.unicauca.DesignPatterns.domain.state;

import co.edu.unicauca.DesignPatterns.domain.entities.Project;

public class ApprovedState implements ProjectState {
    @Override
    public void approve(Project project) {
        System.out.println("Project is already approved.");
    }

    @Override
    public void reject(Project project) {
        System.out.println("Approved project cannot be rejected.");
    }

    @Override
    public void assign(Project project) {
        project.setState(new AssignedState());
        System.out.println("Project assigned to a student.");
    }

    @Override
    public void complete(Project project) {
        System.out.println("Cannot complete a project that has not been assigned.");
    }

    @Override
    public String toString() {
        return "ApprovedState";
    }
}
