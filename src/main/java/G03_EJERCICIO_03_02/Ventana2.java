
package G03_EJERCICIO_03_02;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class Ventana2 extends JFrame {

     private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JCheckBox> jCheckboxList;
    private JComboBox jComboBox1;
    
    
    public Ventana2(String title) throws HeadlessException {
        super(title);
        this.setSize(550,400);
        this.setLocation(310,5);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setLayout(new GridLayout(10,1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
    }
    
    public void iniciarPaneles(){
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
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanel1.add(this.jPanelList.get(6));
        this.jPanel1.add(this.jPanelList.get(7));
        this.jPanel1.add(this.jPanelList.get(8));
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("APELLIDOS: "));
        this.jLabelList.add(new JLabel("Mejia Morocho"));
        this.jLabelList.add(new JLabel("NOMBRES : "));
        this.jLabelList.add(new JLabel("Bryam Andres"));
        this.jLabelList.add(new JLabel("NACIONALIDAD: "));
        this.jLabelList.add(new JLabel("Ecuatoriana"));
        this.jLabelList.add(new JLabel("GENERO: "));
        this.jLabelList.add(new JLabel("Masculino"));
        this.jLabelList.add(new JLabel("CORREO ELECTRONICO PERSONAL: "));
        this.jLabelList.add(new JLabel("andresmejiajr10@gmail.com"));
        this.jLabelList.add(new JLabel("Fecha Nacimiento: "));
        this.jLabelList.add(new JLabel("06/06/2002"));
        this.jLabelList.add(new JLabel("Telefono Domicilio: "));
        this.jLabelList.add(new JLabel("(07)4085864"));
        this.jLabelList.add(new JLabel("Telefono Celular: "));
        this.jLabelList.add(new JLabel("0988094043"));
        this.jLabelList.add(new JLabel("WhatsApp: "));
  
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(0).add(this.jLabelList.get(1));
        this.jPanelList.get(1).add(this.jLabelList.get(2));
        this.jPanelList.get(1).add(this.jLabelList.get(3));
        this.jPanelList.get(2).add(this.jLabelList.get(4));
        this.jPanelList.get(2).add(this.jLabelList.get(5));
        this.jPanelList.get(3).add(this.jLabelList.get(6));
        this.jPanelList.get(3).add(this.jLabelList.get(7));
        this.jPanelList.get(4).add(this.jLabelList.get(8));
        this.jPanelList.get(4).add(this.jLabelList.get(9));
        this.jPanelList.get(5).add(this.jLabelList.get(10));
        this.jPanelList.get(5).add(this.jLabelList.get(11));
        this.jPanelList.get(6).add(this.jLabelList.get(12));
        this.jPanelList.get(6).add(this.jLabelList.get(13));
        this.jPanelList.get(7).add(this.jLabelList.get(14));
        this.jPanelList.get(7).add(this.jLabelList.get(15));
        this.jPanelList.get(8).add(this.jLabelList.get(16));
        
    }
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.get(0).setColumns(10);
        this.jPanelList.get(8).add(this.jTextFieldList.get(0));
    }
    
    
    
}
