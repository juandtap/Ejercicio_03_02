/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_02;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Diego
 */
public class Ventana05 extends JFrame{
    private JPanel jpanelPrincipal;
    private ArrayList<JPanel> jpanelList;
    private ArrayList<JLabel> jlabelList;
    private ArrayList<JComboBox> jcomboBoxList;

    public Ventana05(String title) throws HeadlessException {
        super(title);
        this.setSize(1000, 170);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.jpanelPrincipal = new JPanel();
        this.setContentPane(this.jpanelPrincipal);
        this.jpanelPrincipal.setLayout(new FlowLayout());
        this.jpanelPrincipal.setBackground(Color.WHITE);
        this.jpanelList = new ArrayList<>();
        
        iniciarPaneles();
        iniciarEtiquetas();
        iniciarComboBoxs();
    }
    
    private void iniciarPaneles(){
        for (int i = 0; i < 7; i++) {
            this.jpanelList.add(new JPanel());
            this.jpanelList.get(i).setLayout(new FlowLayout());
            this.jpanelList.get(i).setBackground(Color.WHITE);
            this.jpanelList.get(i).setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
            this.jpanelPrincipal.add(this.jpanelList.get(i));
        }
    }
    
    private void iniciarEtiquetas(){
        this.jlabelList = new ArrayList<>();
        this.jlabelList.add(new JLabel("Sede:"));
        this.jlabelList.add(new JLabel("Campus/Extension:"));
        this.jlabelList.add(new JLabel("Carrera:"));
        this.jlabelList.add(new JLabel("Codigo de Proyecto:"));
        this.jlabelList.add(new JLabel("Modalidad:"));
        this.jlabelList.add(new JLabel("Periodo Academico:"));
        this.jlabelList.add(new JLabel("Fecha Inicio Claes: 28/06/2022 al 06/08/2022"));
        
        for (int i = 0; i < 7; i++) {
            this.jpanelList.get(i).add(this.jlabelList.get(i));
        }
    }
    
    private void iniciarComboBoxs(){
        this.jcomboBoxList = new ArrayList<>();
        
        for (int i = 0; i < 6; i++) {
            this.jcomboBoxList.add(new JComboBox());
        }
        
        
        // combo 1
        this.jcomboBoxList.get(0).addItem("Matriz Cuenca");
        this.jcomboBoxList.get(0).addItem("Matriz Quito");
        this.jcomboBoxList.get(0).addItem("Matriz Guayaquil");
        // combo 2
        this.jcomboBoxList.get(1).addItem("El Vecino");
        this.jcomboBoxList.get(1).addItem("El Giron");
        
        //combo 3
        
        this.jcomboBoxList.get(2).addItem("AGROPECUARIA");
        this.jcomboBoxList.get(2).addItem("COMPUTACION");
        this.jcomboBoxList.get(2).addItem("ELECTRONICA");
        this.jcomboBoxList.get(2).addItem("TELECOMUNICACIONES");
        this.jcomboBoxList.get(2).addItem("MECATRONICA");
        
        // combo 4
        
        this.jcomboBoxList.get(3).addItem("AGROPECUARIA [REDISENIO] -NUEVA O REDISENIO");
        this.jcomboBoxList.get(3).addItem("COMPUTACION [REDISENIO]");
        
        // combo 5
        
        this.jcomboBoxList.get(4).addItem("PRESENCIAL");
        this.jcomboBoxList.get(4).addItem("VIRTUA");
        this.jcomboBoxList.get(4).addItem("HIBRIDAL");
        
        // combo 6
        this.jcomboBoxList.get(5).addItem("2022 - 2022");
        this.jcomboBoxList.get(5).addItem("2022 - 2023");
        this.jcomboBoxList.get(5).addItem("2023 - 2023");
        
        for (int i = 0; i < 6; i++) {
            this.jpanelList.get(i).add(this.jcomboBoxList.get(i));
        }
        
    }
    
    
}
