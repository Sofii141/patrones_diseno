package co.edu.unicauca.DesignPatterns.domain.TemplateMethod;

import co.edu.unicauca.DesignPatterns.domain.entities.Project;

public class TechnicalEvaluator extends ProjectEvaluator{

    @Override
    protected void reviewDocumentation(Project project){
        System.out.println("Technical review of project:"+ project.getProjectTitle());
    }

    @Override
    protected void makeDecision(Project project){
        System.out.println("Technical Project approved...");
    }

    @Override
    protected void validateRequirements(Project project){
        System.out.println("Technical Validating requirements...");
    }
}
