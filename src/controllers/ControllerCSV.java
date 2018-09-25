/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewCSV;
import models.ModelCSV;

/**
 *
 * @author manl_
 */
public class ControllerCSV {
    ModelCSV modelCSV;
    ViewCSV viewCSV;
    
    ActionListener al = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == viewCSV.jb_niuevo)
                jb_nuevo_actionPerformed();
            else if(e.getSource() == viewCSV.jb_guardar)
                jb_guardar_actionPerformed();
        }
    };   
    public void jb_nuevo_actionPerformed(){
        viewCSV.jtf_nombre.setText(null);
        modelCSV.setNombre(null);
        viewCSV.jtf_email.setText(null);
        modelCSV.setEmail(null);
    }

    public ControllerCSV(ModelCSV modelCSV, ViewCSV viewCSV) {
        this.modelCSV = modelCSV;
        this.viewCSV = viewCSV;
        this.viewCSV.jb_niuevo.addActionListener(al);
        this.viewCSV.jb_guardar.addActionListener(al);
        initComponents();
    }
    public void jb_guardar_actionPerformed(){
       modelCSV.readFile();
       modelCSV.setNombre(viewCSV.jtf_nombre.getText());
       modelCSV.setEmail(viewCSV.jtf_email.getText());
       modelCSV.writeFile();
    }
    public void initComponents(){
       this.viewCSV.setVisible(true);
    }
}
