/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import models.ModelCSV;
import views.ViewCSV;
import controllers.ControllerCSV;

/**
 *
 * @author manl_
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelCSV modelCSV = new ModelCSV();
        ViewCSV viewCSV = new ViewCSV(); 
        ControllerCSV controllercsv = new ControllerCSV(modelCSV, viewCSV);
    }
    
}
