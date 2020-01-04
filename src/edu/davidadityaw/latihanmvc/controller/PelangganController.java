/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.davidadityaw.latihanmvc.controller;

import edu.davidadityaw.latihanmvc.model.PelangganModel;
import edu.davidadityaw.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 * Nama  : David Aditya Winarto
 * NIM   : 10118071
 * Kelas : IF-2
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelangganView view) {
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();
        
        if (nama.equals("") && email.equals("") && noTelp.equals("")) {
            
        } else {
            model.resetForm();
        }
        
    }
    
    public void simpanForm(PelangganView view) {
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTelp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        } else if (noTelp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No. Telp Masih Kosong");
        } else {
            model.simpanForm();
        }
        
    }

    public void setModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
