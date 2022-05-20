/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_02;

/**
 *
 * @author Paul Aguaiza
 */
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
public class Ventana01 extends JFrame {
    private JPanel jPanelPrincipal;
    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    private JTextField jTextField;
    private JComboBox jcomboBox1Sede;
    private JComboBox jcomboBox2Id;
    private JButton jButtonIngresar;
    
    
    public Ventana01(String title) throws HeadlessException {
        super(title);
        this.setSize(500,300);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        this.jPanelPrincipal = new JPanel();
        this.setContentPane(jPanelPrincipal);
        this.jPanelPrincipal.setLayout(new GridLayout(4,2));
        
        iniciarPaneles();
        iniciarEtiquetas();
        iniciarBotones();
        iniciarText();
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
        
         for (int i = 0; i <= 7; i++) {
            jPanelPrincipal.add(this.jPanelList.get(i));
        }
        
         for (int i = 0; i <= 7; i++) {
            jPanelList.get(i).setBackground(Color.WHITE);
        }
    }
    private void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Seleccione una sede: *"));
        this.jLabelList.add(new JLabel("Tipo documento: "));
        this.jLabelList.add(new JLabel("Ingrese su identificacion: *"));
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(4).add(this.jLabelList.get(2));
    }
    private void iniciarBotones(){
        this.jPanelList.get(6).add(new JButton("Ingresar"));
        
    }
    
    private void iniciarText(){
        this.jTextField = new JTextField();
        this.jTextField.setColumns(20);
        this.jPanelList.get(5).add(jTextField);
    
    }
    
    private void iniciarComboBox(){
        this.jcomboBox1Sede = new JComboBox();
        this.jcomboBox1Sede.addItem(" Matriz Cuenca ");
        this.jcomboBox1Sede.addItem(" Guayaquil ");
        this.jcomboBox1Sede.addItem(" Quito ");
        this.jPanelList.get(1).add(this.jcomboBox1Sede);
        
        this.jcomboBox2Id = new JComboBox();
        this.jcomboBox2Id.addItem(" Cedula ");
        this.jcomboBox2Id.addItem(" Pasaporte ");
        this.jPanelList.get(3).add(this.jcomboBox2Id);
   
    }
    
    
    

}
