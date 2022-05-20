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
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Paul Aguaiza
 */
public class Ventana03 extends JFrame {
    private JPanel jPanelPrincipal;
    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    private JTextField jTextField;
   
    
    
    public Ventana03(String title) throws HeadlessException {
        super(title);
        this.setSize(600,500);
        this.setLocation(50, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        this.jPanelPrincipal = new JPanel();
        this.setContentPane(jPanelPrincipal);
        this.jPanelPrincipal.setLayout(new GridLayout(9,2));
        
        iniciarPaneles();
        iniciarEtiquetas();
        iniciarText();
        
    
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
         this.jPanelPrincipal.setBorder(BorderFactory.createTitledBorder("Personal"));
          
    }
    private void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel(" Apellidos: "));
        this.jLabelList.add(new JLabel(" Moreira Quiñonez "));
        this.jLabelList.add(new JLabel(" Nombres: "));
        this.jLabelList.add(new JLabel(" Wellington Omar "));
        this.jLabelList.add(new JLabel(" Nacionalidad: "));
        this.jLabelList.add(new JLabel(" ECUATORIANA "));
        this.jLabelList.add(new JLabel(" Genero: "));
        this.jLabelList.add(new JLabel(" Masculino "));
        this.jLabelList.add(new JLabel(" Correo electronico personal: "));
        this.jLabelList.add(new JLabel(" omar69@gmail.com "));
        this.jLabelList.add(new JLabel(" Fecha de nacimiento: "));
        this.jLabelList.add(new JLabel(" 17-05-2022 "));
        this.jLabelList.add(new JLabel(" Telefono domicilio: "));
        this.jLabelList.add(new JLabel(" 4199321 "));
        this.jLabelList.add(new JLabel(" Nombres: "));
        this.jLabelList.add(new JLabel(" Telefono celular: "));
        this.jLabelList.add(new JLabel(" 0987654321 "));
        this.jLabelList.add(new JLabel(" Whatsapp: ")); 
        
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jLabelList.get(5));
        this.jPanelList.get(6).add(this.jLabelList.get(6));
        this.jPanelList.get(7).add(this.jLabelList.get(7));
        this.jPanelList.get(8).add(this.jLabelList.get(8));
        this.jPanelList.get(9).add(this.jLabelList.get(9));
        this.jPanelList.get(10).add(this.jLabelList.get(10));
        this.jPanelList.get(11).add(this.jLabelList.get(11));
        this.jPanelList.get(12).add(this.jLabelList.get(12));
        this.jPanelList.get(13).add(this.jLabelList.get(13));
        this.jPanelList.get(14).add(this.jLabelList.get(14));
    }
   
    private void iniciarText(){
        this.jTextField = new JTextField();
        this.jTextField.setColumns(15);
        this.jPanelList.get(15).add(jTextField);
    
    }
    
   
    
    
    

}
