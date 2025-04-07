package co.edu.unicauca.DesignPatterns.domain.state;

import co.edu.unicauca.DesignPatterns.domain.entities.Project;

public class PendingState implements ProjectState {
    @Override
    public void approve(Project project) {
        project.setState(new ApprovedState());
        System.out.println("Project approved.");
    }

    @Override
    public void reject(Project project) {
        project.setState(new RejectState());
        System.out.println("Project rejected.");
    }

    @Override
    public void assign(Project project) {
        System.out.println("Cannot assign a project that is pending approval.");
    }

    @Override
    public void complete(Project project) {
        System.out.println("Cannot complete a pending project.");
    }

    @Override
    public String toString() {
        return "PendingState";
    }
}
