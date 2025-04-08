package co.edu.unicauca.DesignPatterns.domain.adapter;

import co.edu.unicauca.DesignPatterns.domain.entities.Project;
import org.json.JSONObject;

public class ProjectAdapter implements ProjectDataProvider {

    private ExternalProjectService externalService;

    public ProjectAdapter(ExternalProjectService externalService) {
        this.externalService = externalService;
    }

    @Override
    public Project getProject() {
        String jsonData = externalService.getProjectData();
        JSONObject jsonObject = new JSONObject(jsonData);
        String title = jsonObject.getString("title");
        return new Project(title);
    }
}

