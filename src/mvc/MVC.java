/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc;

import controller.APIController;
import controller.Controller;
import model.APIModel;
import model.Model;
import view.APIView;
import view.Chefe;
import view.Login;

/**
 *
 * @author philippe.kpsales
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        APIModel m = new Model();
        APIController c = new Controller();
        APIView v = new Login();
        
        v.mensagem();
        
        v = new Chefe();
        v.mensagem();
    }
    
}
