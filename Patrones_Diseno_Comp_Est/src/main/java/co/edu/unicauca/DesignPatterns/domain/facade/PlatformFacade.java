package co.edu.unicauca.DesignPatterns.domain.facade;

import co.edu.unicauca.DesignPatterns.domain.entities.Project;

/**
 * Fachada que simplifica la interacción entre los diferentes subsistemas de la
 * plataforma (Ej.: gestión de proyectos, evaluación y asignación de
 * estudiantes).
 */
public class PlatformFacade {

    private EvaluationSystem evaluation;
    private AssignmentSystem assignment;

    public PlatformFacade() {
        this.evaluation = new EvaluationSystem();
        this.assignment = new AssignmentSystem();
    }

    public void manageProject(Project project) {
        if (evaluation.evaluate(project)) {
            if (assignment.assign(project)) {
                System.out.println("Project successfully managed and assigned.");
            } else {
                System.out.println("Project approved but no student available.");
            }
        } else {
            System.out.println("Project evaluation failed.");
        }
    }
}

