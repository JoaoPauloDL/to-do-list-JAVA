/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package todoApp;

import controller.ProjectController;
import java.sql.SQLException;
import java.util.List;
import model.Project;

public class App {
   
    public static void main(String[] args) throws SQLException {
        
        ProjectController pc = new ProjectController();
        
        Project project = new Project();
        
        project.setName("teste");
        project.setDescription("description");
        pc.save(project);
        
        //ProjectController pc = new ProjectController();
        
        //Project project = new Project();
        //project.setId(1);
        //project.setName("nome alterado");
        //project.setDescription("description");
        
        
      
        //pc.update(project);
        
        //List<Project>  projects = pc.getAll();
        //System.out.println("total de projetos = " + projects.size());
       
       //pc.removeById(1);
        
    }
}
