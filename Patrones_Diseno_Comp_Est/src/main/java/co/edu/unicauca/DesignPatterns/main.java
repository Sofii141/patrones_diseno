package co.edu.unicauca.DesignPatterns;

import co.edu.unicauca.DesignPatterns.decorator.PriorityProject;
import co.edu.unicauca.DesignPatterns.domain.TemplateMethod.BusinessEvaluator;
import co.edu.unicauca.DesignPatterns.domain.TemplateMethod.TechnicalEvaluator;
import co.edu.unicauca.DesignPatterns.domain.adapter.ExternalProjectService;
import co.edu.unicauca.DesignPatterns.domain.adapter.ProjectAdapter;
import co.edu.unicauca.DesignPatterns.domain.adapter.ProjectDataProvider;
import co.edu.unicauca.DesignPatterns.domain.entities.Project;
import co.edu.unicauca.DesignPatterns.domain.facade.PlatformFacade;

public class main {
    //Patrón Template Method
    public static void main(String[] args) {

        Project project = new Project("Academic Management System");

        // TEMPLATE
        System.out.println("TEMPLATE METHOD PATTERN");
        TechnicalEvaluator technicalEvaluator = new TechnicalEvaluator();
        technicalEvaluator.evaluate(project);

        BusinessEvaluator businessEvaluator = new BusinessEvaluator();
        businessEvaluator.evaluate(project);

        //STATE
        System.out.println("Initial state: " + project.getState());

        project.approve();
        System.out.println("Current Status: " + project.getState());

        project.assign();
        System.out.println("Current Status: " + project.getState());

        project.complete();
        System.out.println("Current Status: " + project.getState());

        project.complete(); // Intentar completar nuevamente

        //DECORATOR
        System.out.println("DECORATOR PATTERN");
        PriorityProject priorityProject = new PriorityProject(project);
        System.out.println("Project description: " +
                priorityProject.getDescription());

        //ADAPTER
        System.out.println("ADAPTER PATTERN");
        ExternalProjectService externalService = new ExternalProjectService();
        ProjectDataProvider adapter = new ProjectAdapter(externalService);
        Project adaptedProject = adapter.getProject();
        System.out.println("Project created from external service: " + adaptedProject.getProjectTitle());

        //FACADE
        System.out.println("FACADE PATTERN");
        PlatformFacade platform = new PlatformFacade();
        platform.manageProject(project);

    }
}
