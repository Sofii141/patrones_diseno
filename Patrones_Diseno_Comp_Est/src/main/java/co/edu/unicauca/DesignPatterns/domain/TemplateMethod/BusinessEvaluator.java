package co.edu.unicauca.DesignPatterns.domain.TemplateMethod;

import co.edu.unicauca.DesignPatterns.domain.entities.Project;

public class BusinessEvaluator extends ProjectEvaluator{

    @Override
    protected void reviewDocumentation(Project project){
        System.out.println("Business feasibility review of project:"+ project.getProjectTitle());
    }

    @Override
    protected void makeDecision(Project project){
        System.out.println("Project approved based on business analysis...");
    }

    @Override
    protected void validateRequirements(Project project){
        System.out.println("Analyzing business impact and feasibility");
    }
}
