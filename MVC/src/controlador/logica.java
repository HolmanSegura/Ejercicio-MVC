/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import modelo.persona;
import vista.formulario;

/**
 *
 * @author SuperUs
 */
public class logica implements ActionListener {

    private formulario form;
    private persona persona;

    public logica(formulario form, persona persona) {
        this.form = form;
        this.persona = persona;
        this.form.jButton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        persona.setNombre(form.jTextField1.getText());
        persona = new persona(form.jTextField1.getText());
        DefaultListModel lista = new DefaultListModel();
        lista.addElement(persona.getNombre());
        form.jList1.setModel(lista);
    }

}
