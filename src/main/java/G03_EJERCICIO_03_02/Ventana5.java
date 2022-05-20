package G03_EJERCICIO_03_02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class Ventana5 extends JFrame {

    private JPanel jPanel;
    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    private List<JComboBox> jComboBoxList;
    private List<JButton> jButtonList;

    public Ventana5(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 300);
        this.setLocation(700, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel);
    }

    public void iniciarComponentes() {
        this.jPanel = new JPanel();
        this.jPanel.setBackground(Color.WHITE);
        this.jPanel.setLayout(new GridLayout(7, 1));
        this.iniciarPaneles();
    }

    public void iniciarPaneles() {

        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanel.add(this.jPanelList.get(0));
        this.jPanelList.get(0).setLayout(new BoxLayout(this.jPanelList.get(0), BoxLayout.X_AXIS));
        this.jPanel.add(this.jPanelList.get(1));
        this.jPanelList.get(1).setLayout(new BoxLayout(this.jPanelList.get(1), BoxLayout.X_AXIS));
        this.jPanel.add(this.jPanelList.get(2));
        this.jPanelList.get(2).setLayout(new BoxLayout(this.jPanelList.get(2), BoxLayout.X_AXIS));
        this.jPanel.add(this.jPanelList.get(3));
        this.jPanelList.get(3).setLayout(new BoxLayout(this.jPanelList.get(3), BoxLayout.X_AXIS));
        this.jPanel.add(this.jPanelList.get(4));
        this.jPanelList.get(4).setLayout(new BoxLayout(this.jPanelList.get(4), BoxLayout.X_AXIS));
        this.jPanel.add(this.jPanelList.get(5));
        this.jPanelList.get(5).setLayout(new BoxLayout(this.jPanelList.get(5), BoxLayout.X_AXIS));
        this.jPanel.add(this.jPanelList.get(6));
        this.jPanelList.get(6).setLayout(new BoxLayout(this.jPanelList.get(6), BoxLayout.X_AXIS));

    }

    public void iniciarEtiquetas() {

        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Sede: "));
        this.jLabelList.add(new JLabel("Campus/Extension: "));
        this.jLabelList.add(new JLabel("Carrera: "));
        this.jLabelList.add(new JLabel("Codigo del Proyecto "));
        this.jLabelList.add(new JLabel("Modalidad: *"));
        this.jLabelList.add(new JLabel("Periodo Academico: "));
        this.jLabelList.add(new JLabel("Fecha Inicio de Clases: *"));
        this.jLabelList.add(new JLabel("28/03/2022 al 06/08/2022"));
        
    }
}
