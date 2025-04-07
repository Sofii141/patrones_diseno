package co.edu.unicauca.DesignPatterns.domain.state;

import co.edu.unicauca.DesignPatterns.domain.entities.Project;

/**
 * Interface que maneja el ciclo de vida del proyecto
 */
public interface ProjectState {
    void approve(Project project);

    void reject(Project project);

    void assign(Project project);

    void complete(Project project);
}
