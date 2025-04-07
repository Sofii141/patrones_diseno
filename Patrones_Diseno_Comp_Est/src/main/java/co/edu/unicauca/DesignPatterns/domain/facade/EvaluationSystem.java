package co.edu.unicauca.DesignPatterns.domain.facade;

import co.edu.unicauca.DesignPatterns.domain.entities.Project;

public class EvaluationSystem {
    public boolean evaluate(Project project) {
        System.out.println("Evaluating project: " + project.getProjectTitle());
        return Math.random() > 0.3; // 70% probability of approval
    }

}
