/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Paul Aguaiza
 */
public class Ventana02 extends JFrame {
    
private JPanel jPanelPrincipal;
    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    private JTextField jTextField;
    private JComboBox jcomboBoxCarrera,jcomboBoxModalidad, jcomboBoxSede;
    private JComboBox jcomboBoxCampus,jcomboBoxJornada;
    private JButton jButtonIngresar;
    
    
    public Ventana02(String title) throws HeadlessException {
        super(title);
        this.setSize(600,500);
        this.setLocation(50, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        this.jPanelPrincipal = new JPanel();
        this.setContentPane(jPanelPrincipal);
        this.jPanelPrincipal.setLayout(new GridLayout(8,2));
        
        iniciarPaneles();
        iniciarEtiquetas();
        iniciarBotones();
        iniciarComboBox();
    
    }
    
    private void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        for (int i = 0; i <= 15; i++) {
            jPanelPrincipal.add(this.jPanelList.get(i));
        }
        
         for (int i = 0; i <= 15; i++) {
            jPanelList.get(i).setBackground(Color.WHITE);
        }
        
    }
    private void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Periodo Academico: *"));
        this.jLabelList.add(new JLabel("2022-2022"));
        this.jLabelList.add(new JLabel("Carrera: * "));
        this.jLabelList.add(new JLabel("Modalidad: *"));
        this.jLabelList.add(new JLabel("Sede: *"));
        this.jLabelList.add(new JLabel("Campus: *"));
        this.jLabelList.add(new JLabel("Jornada: *"));
        this.jLabelList.add(new JLabel("Fecha de Registro: "));
        this.jLabelList.add(new JLabel("20/05/2022"));
        
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(4).add(this.jLabelList.get(3));
        this.jPanelList.get(6).add(this.jLabelList.get(4));
        this.jPanelList.get(8).add(this.jLabelList.get(5));
        this.jPanelList.get(10).add(this.jLabelList.get(6));
        this.jPanelList.get(12).add(this.jLabelList.get(7));
        this.jPanelList.get(13).add(this.jLabelList.get(8));
    }
    private void iniciarBotones(){
        this.jPanelList.get(15).add(new JButton("Siguiente"));
     
        
    }
    private void iniciarComboBox(){
        this.jcomboBoxCarrera = new JComboBox();
        this.jcomboBoxCarrera.addItem(" Electronica y Automatizacion ");
        this.jcomboBoxCarrera.addItem(" Telecomunicaciones ");
        this.jcomboBoxCarrera.addItem(" Computacion ");
        this.jPanelList.get(3).add(this.jcomboBoxCarrera);
        
        this.jcomboBoxModalidad = new JComboBox();
        this.jcomboBoxModalidad.addItem(" Presencial ");
        this.jcomboBoxModalidad.addItem(" En linea ");
        this.jPanelList.get(5).add(this.jcomboBoxModalidad);
        
        this.jcomboBoxSede = new JComboBox();
        this.jcomboBoxSede.addItem(" Matriz Cuenca ");
        this.jcomboBoxSede.addItem(" Quito ");
        this.jcomboBoxSede.addItem(" Guayaquil ");
        this.jPanelList.get(7).add(this.jcomboBoxSede);
        
        this.jcomboBoxCampus = new JComboBox();
        this.jcomboBoxCampus .addItem(" Campus El Vecino ");
        this.jcomboBoxCampus.addItem(" Campus El Giron ");
        this.jcomboBoxCampus.addItem(" Campus Sur ");
        this.jcomboBoxCampus.addItem(" Campus Centenario ");
        this.jcomboBoxCampus.addItem(" Campus Maria Auxiliadora ");
        this.jPanelList.get(9).add(this.jcomboBoxCampus);
        
        this.jcomboBoxJornada = new JComboBox();
        this.jcomboBoxJornada .addItem(" Seleccione una opcion ");
        this.jcomboBoxJornada .addItem(" Matutina ");
        this.jcomboBoxJornada .addItem(" Vespertina ");
        this.jcomboBoxJornada .addItem(" Diurna ");
        this.jPanelList.get(11).add(this.jcomboBoxJornada );
   
   
    }
    
}
