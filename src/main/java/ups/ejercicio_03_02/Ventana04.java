/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Panel;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Diego

 */

//Ventana Crear Grupo

public class Ventana04 extends JFrame{
    
    private JPanel jpanelPrincipal;
    private JPanel jpanelDatos1;
    private JPanel jpanelDatos2;
    private JPanel jpanelDatos3;
    
    private ArrayList<JPanel> jpanelList;
    private ArrayList<JLabel> jlabelList;
    
    private JTextArea jtextAreaGrupo;
    private JTextField jtextCupos;
    private JComboBox jcomboBoxAutorizacion;
    private JComboBox jcomboBoxJornada;
    private JComboBox jcomboBoxCambioGrupo;

    
  
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
        this.jpanelPrincipal.setLayout(new BoxLayout(this.jpanelPrincipal, BoxLayout.Y_AXIS));
        this.jpanelPrincipal.setBorder(new EmptyBorder(10, 10, 10, 10));
        
         this.jpanelList = new ArrayList<>();
        
        
        iniciarPanelDatos1();
        iniciarPanelDatos2();
        iniciarPanelDatos3();
        iniciarEtiquetas();
       // configurarFuente();
        iniciarBotones();
        iniciarTextArea();
        iniciarTextField();
        
    }
    
    private void iniciarPanelDatos1(){
        this.jpanelDatos1 = new JPanel();
        // Borde Arriba, izq, abajo, der
        this.jpanelDatos1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
        this.jpanelPrincipal.add(this.jpanelDatos1);
        this.jpanelDatos1.setLayout(new GridLayout(7,2));
        
       
        
       
        
        
        // Colorea los paneles
        for (int i = 0; i < 14; i++) {
             
            this.jpanelList.add(new JPanel());
            
            this.jpanelDatos1.add(this.jpanelList.get(i)); 
            
            if (i%2 == 0){
                 
                this.jpanelList.get(i).setBackground(Color.LIGHT_GRAY); 
              
            } else{
                
                this.jpanelList.get(i).setBackground(Color.WHITE);
                   
            }
            
            this.jpanelList.get(i).setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
            
            
            this.jpanelList.get(i).setLayout(new BoxLayout(this.jpanelList.get(i), BoxLayout.Y_AXIS));
        }
        
        
    }
    
    private void iniciarPanelDatos2(){
        this.jpanelDatos2 = new JPanel();
        this.jpanelPrincipal.add(this.jpanelDatos2);
        this.jpanelList.add(new JPanel());
        this.jpanelList.add(new JPanel());
        this.jpanelList.get(14).setBackground(Color.LIGHT_GRAY);
        this.jpanelList.get(15).setBackground(Color.WHITE);
        this.jpanelList.get(14).setLayout(new BoxLayout(this.jpanelList.get(14), BoxLayout.Y_AXIS));
        this.jpanelList.get(15).setLayout(new BoxLayout(this.jpanelList.get(15), BoxLayout.Y_AXIS));
        
        this.jpanelDatos2.setLayout(new GridLayout(1, 2));
        this.jpanelDatos2.add(this.jpanelList.get(14));
        this.jpanelDatos2.add(this.jpanelList.get(15));
        
        this.jpanelList.get(14).setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        this.jpanelList.get(15).setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        

    }
    
    
    private void iniciarPanelDatos3(){
        this.jpanelDatos3 = new JPanel();
        this.jpanelPrincipal.add(this.jpanelDatos3);
        this.jpanelDatos3.setLayout(new GridLayout(6,2));
        // paneles 16 a 27 (12paneles)
        for (int i = 16; i < 28; i++) {
            this.jpanelList.add(new JPanel());
            this.jpanelDatos3.add(jpanelList.get(i));
            if (i%2 == 0){
                this.jpanelList.get(i).setBackground(Color.LIGHT_GRAY);
            } else{
                this.jpanelList.get(i).setBackground(Color.WHITE);
            }
             this.jpanelList.get(i).setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
            
            
            this.jpanelList.get(i).setLayout(new BoxLayout(this.jpanelList.get(i), BoxLayout.Y_AXIS));
            
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
        this.jlabelList.add(new JLabel("Modalidad: "));
        this.jlabelList.add(new JLabel("PRECENCIAL"));
        this.jlabelList.add(new JLabel("Carrera: "));
        this.jlabelList.add(new JLabel("AGROPECUARIA"));
        this.jlabelList.add(new JLabel("Codigo de Proyecto: "));
        this.jlabelList.add(new JLabel("AGROPECUARIA [REDISENO] - NUEVA O REDISENO"));
        this.jlabelList.add(new JLabel("Asignatura: "));
        this.jlabelList.add(new JLabel("E-CV-IAG-003 BOTANICA"));
        this.jlabelList.add(new JLabel("Nombre de Grupo:  *"));
        this.jlabelList.add(new JLabel(""));
        this.jlabelList.add(new JLabel("Cupos por Grupo: *"));
        this.jlabelList.add(new JLabel(""));
        this.jlabelList.add(new JLabel("Autorizacion calificacion sobre 100: "));
        this.jlabelList.add(new JLabel(""));
        this.jlabelList.add(new JLabel("Seleccionar Jornada del Grupo: "));
        this.jlabelList.add(new JLabel(""));
        this.jlabelList.add(new JLabel("Oferta para estudiantes: "));
        this.jlabelList.add(new JLabel(""));
        this.jlabelList.add(new JLabel("Aplica Cambio de Grupo: "));
        this.jlabelList.add(new JLabel(""));
        

        for (int i = 0; i < this.jlabelList.size(); i++) {
            this.jpanelList.get(i).add(this.jlabelList.get(i));
            
            if(i%2 != 0){
               this.jlabelList.get(i).setForeground(Color.GRAY);
            }
        }
    }
    
    private void configurarFuente(){
        
        for (int i = 0; i < this.jlabelList.size(); i++) {
             this.jlabelList.get(i).setFont(new Font("",Font.PLAIN,11));
        }
       
    }
    
    private void iniciarBotones(){
        this.jpanelList.get(26).setLayout(new FlowLayout(0));
        this.jpanelList.get(26).setBackground(Color.WHITE);
        
        this.jpanelList.get(26).add(new JButton("Guardar"));
        this.jpanelList.get(26).add(new JButton("Cancelar"));
    }
    
    private void iniciarTextArea(){
        this.jtextAreaGrupo = new JTextArea("GRUPO 1",3, 10);
        this.jtextAreaGrupo.setForeground(Color.GRAY);
        JLabel jlabel1 = new JLabel("91 caracteres restantes");
        jlabel1.setForeground(Color.GRAY);
        this.jtextAreaGrupo.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY));
        this.jpanelList.get(15).setLayout(new BorderLayout());
        this.jpanelList.get(15).add(this.jtextAreaGrupo, BorderLayout.NORTH);
        this.jpanelList.get(15).add(jlabel1,BorderLayout.SOUTH);
    }
    
    private void iniciarTextField(){
        this.jtextCupos = new JTextField("                                      ");
        
        this.jpanelList.get(17).setLayout(new FlowLayout(0));
        this.jpanelList.get(17).add(this.jtextCupos);
    }
    
    private void iniciarComboBoxs(){
        jcomboBoxAutorizacion = new JComboBox();
        jcomboBoxCambioGrupo = new JComboBox();
        jcomboBoxJornada = new JComboBox();
        
    }
    
}
