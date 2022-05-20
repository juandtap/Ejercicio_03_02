/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;

/**
 *
 * @author Diego

 */

//Ventana Crear Grupo

public class Ventana04 extends JFrame{
    
    private JPanel jpanelPrincipal;
    private JPanel jpanelDatos;
    
    private ArrayList<JPanel> jpanelList;
    private ArrayList<JLabel> jlabelList;

    public Ventana04(String title) throws HeadlessException {
        super(title);
        this.setSize(700, 580);
        this.setLocationRelativeTo(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        this.jpanelPrincipal = new JPanel();
        this.setContentPane(this.jpanelPrincipal);
       
        
        iniciarPanelDatos();
        iniciarEtiquetas();
        iniciarBotones();
        iniciarTextArea();
        iniciarIncrementador();
        
    }
    
    private void iniciarPanelDatos(){
        this.jpanelDatos = new JPanel();
        // Borde Arriba, izq, abajo, der
        this.jpanelDatos.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
        this.jpanelPrincipal.add(this.jpanelDatos);
        this.jpanelDatos.setLayout(new GridLayout(14, 2));
        
        this.jpanelList = new ArrayList<>();
        
        for (int i = 0; i < 28; i++) {
            this.jpanelList.add(new JPanel());
            this.jpanelDatos.add(this.jpanelList.get(i));   
        }
        
        // Colorea los paneles
        for (int i = 0; i < 26; i++) {
            
            if (i%2 == 0){
                 
                this.jpanelList.get(i).setBackground(Color.LIGHT_GRAY); 
              
            } else{
                this.jpanelList.get(i).setBackground(Color.WHITE);
                   
            }
            
            this.jpanelList.get(i).setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
            
        }
        
        
    }
    
    private void iniciarEtiquetas(){
        this.jlabelList = new ArrayList<>();
        this.jlabelList.add(new JLabel("Periodo Academico: "));
        this.jlabelList.add(new JLabel("2022 - 2022"));
        this.jlabelList.add(new JLabel("Sede: "));
        this.jlabelList.add(new JLabel("MATRIZ CUENCA"));
        this.jlabelList.add(new JLabel("Campus/Extencion: "));
        this.jlabelList.add(new JLabel("EL VECINO"));
        this.jlabelList.add(new JLabel("Carrera: "));
        this.jlabelList.add(new JLabel("AGROPECUARIA"));
        this.jlabelList.add(new JLabel("Codigo de Proyecto: "));
        this.jlabelList.add(new JLabel("AGROPECUARIA [REDISENO] - NUEVA O REDISENO"));
        this.jlabelList.add(new JLabel("Asignatura: "));
        this.jlabelList.add(new JLabel("E-CV-IAG-003 BOTANICA"));
        this.jlabelList.add(new JLabel("Nombre de Grupo:  *"));
        this.jlabelList.add(new JLabel(""));
        this.jlabelList.add(new JLabel("Cupos por Grupo: *"));

        for (int i = 0; i < this.jlabelList.size(); i++) {
            this.jpanelList.get(i).add(this.jlabelList.get(i));
            if(i%2 != 0){
               this.jlabelList.get(i).setForeground(Color.GRAY);
            }
        }
    }
    
    private void iniciarBotones(){
        
        this.jpanelList.get(26).add(new JButton("Guardar"));
        this.jpanelList.get(26).add(new JButton("Cancelar"));
    }
    
    private void iniciarTextArea(){
        JTextArea jtextAreaGrupo = new JTextArea("GRUPO 1",2, 20);
        JLabel jlabel1 = new JLabel("91 caracteres restantes");
        jlabel1.setForeground(Color.GRAY);
        jtextAreaGrupo.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
        this.jpanelList.get(13).setLayout(new BorderLayout());
        this.jpanelList.get(13).add(jtextAreaGrupo, BorderLayout.NORTH);
        this.jpanelList.get(13).add(jlabel1,BorderLayout.SOUTH);
    }
    
    private void iniciarIncrementador(){
        JSpinner jspinner1 = new JSpinner();
        jspinner1.setPreferredSize(new Dimension(100, 20));
        this.jpanelList.get(15).add(jspinner1);
    }
    
}
