
package G03_EJERCICIO_03_02;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author USER
 */
public class Ventana4 extends JFrame{

    private JPanel jPanel;
    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    
    public Ventana4(String title) throws HeadlessException {
        super(title);
        this.setSize(600, 800);
        this.setLocation(650, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel);
    }
    
    public void iniciarComponentes(){
        this.jPanel = new JPanel();
        this.jPanel.setBackground(Color.WHITE);
        this.jPanel.setLayout(new GridLayout(14,2));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        
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
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanel.add(this.jPanelList.get(0));
        this.jPanel.add(this.jPanelList.get(1));
        this.jPanel.add(this.jPanelList.get(2));
        this.jPanel.add(this.jPanelList.get(3));
        this.jPanel.add(this.jPanelList.get(4));
        this.jPanel.add(this.jPanelList.get(5));
        this.jPanel.add(this.jPanelList.get(6));
        this.jPanel.add(this.jPanelList.get(7));
        this.jPanel.add(this.jPanelList.get(8));
        this.jPanel.add(this.jPanelList.get(9));
        this.jPanel.add(this.jPanelList.get(10));
        this.jPanel.add(this.jPanelList.get(11));
        this.jPanel.add(this.jPanelList.get(12));
        this.jPanel.add(this.jPanelList.get(13));
         
    }
    
    public void iniciarEtiquetas(){
        
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Periodo Academico: "));
        this.jLabelList.add(new JLabel("  2022-2022 "));
        this.jLabelList.add(new JLabel("Sede: "));
        this.jLabelList.add(new JLabel("  MATRIZ CUENCA"));
        this.jLabelList.add(new JLabel("Campus/Extension: *"));
        this.jLabelList.add(new JLabel("  EL VECINO"));
        this.jLabelList.add(new JLabel("Modalidad: *"));
        this.jLabelList.add(new JLabel("  PRESENCIAL"));
        this.jLabelList.add(new JLabel("Carrera: *"));
        this.jLabelList.add(new JLabel("  AGROPECUARIA"));
        this.jLabelList.add(new JLabel("Codigo de Proyecto: *"));
        this.jLabelList.add(new JLabel("  AGROPECUARIA[REDISEÑO] NUEVA O REDISEÑO"));
        this.jLabelList.add(new JLabel("Asignatura: *"));
        this.jLabelList.add(new JLabel("  E-CV-IAG-003 BOTANICA"));
        this.jLabelList.add(new JLabel("Nombre del Grupo: * "));
        this.jLabelList.add(new JLabel("Cupos por Grupo: * "));
        this.jLabelList.add(new JLabel("Autorizacion calificacion sobre 100: "));
        this.jLabelList.add(new JLabel("Seleccionar Jornada del Grupo: "));
        this.jLabelList.add(new JLabel("Ofertas para Estudiantes: *"));
        this.jLabelList.add(new JLabel("Aplica cambio de Grupo: *"));
        
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
        this.jPanelList.get(8).add(this.jLabelList.get(15));
        this.jPanelList.get(9).add(this.jLabelList.get(16));
        this.jPanelList.get(10).add(this.jLabelList.get(17));
        this.jPanelList.get(11).add(this.jLabelList.get(18));
        this.jPanelList.get(12).add(this.jLabelList.get(19));
        
    }
    
    public void iniciarTextos(){
        
        JTextField boton = new JTextField(10);
        
        
        
        
        
        
    }
    
    
    
}
