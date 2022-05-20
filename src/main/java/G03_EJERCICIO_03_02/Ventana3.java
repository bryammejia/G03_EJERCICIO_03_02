package G03_EJERCICIO_03_02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import static java.awt.FlowLayout.RIGHT;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class Ventana3 extends JFrame {

    private JPanel jPanel;
    private List<JLabel> jLabelList;
    private List<JPanel> jPanelList;
    private List<JComboBox> jComboBoxList;

    public Ventana3(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 500);
        this.setLocation(10, 10);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel);
    }

    public void iniciarComponentes() {

        this.jPanel = new JPanel();
        this.jPanel.setBackground(Color.WHITE);
        this.jPanel.setLayout(new GridLayout(7, 1));
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarCombos();

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
        this.jPanel.add(this.jPanelList.get(1));
        this.jPanel.add(this.jPanelList.get(2));
        this.jPanel.add(this.jPanelList.get(3));
        this.jPanel.add(this.jPanelList.get(4));
        this.jPanel.add(this.jPanelList.get(5));
        this.jPanel.add(this.jPanelList.get(6));

    }

    public void iniciarEtiquetas() {

        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Periodo Academico: "));
        this.jLabelList.add(new JLabel("2022-2022"));
        this.jLabelList.add(new JLabel("Carrera: *"));
        this.jLabelList.add(new JLabel("Modalidad: *"));
        this.jLabelList.add(new JLabel("Sede: *"));
        this.jLabelList.add(new JLabel("Campus: *"));
        this.jLabelList.add(new JLabel("Jornada: *"));
        this.jLabelList.add(new JLabel("Fecha de Registro: "));
        this.jLabelList.add(new JLabel("20/05/2022 "));

        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(0).add(this.jLabelList.get(1));
        this.jPanelList.get(1).add(this.jLabelList.get(2));
        this.jPanelList.get(2).add(this.jLabelList.get(3));
        this.jPanelList.get(3).add(this.jLabelList.get(4));
        this.jPanelList.get(4).add(this.jLabelList.get(5));
        this.jPanelList.get(5).add(this.jLabelList.get(6));
        this.jPanelList.get(6).add(this.jLabelList.get(7));
        this.jPanelList.get(6).add(this.jLabelList.get(8));

    }

    public void iniciarCombos() {

        this.jComboBoxList = new ArrayList<>();
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());

        this.jComboBoxList.get(0).addItem("Escoga una Opcion");
        this.jComboBoxList.get(0).addItem("Computacion");
        this.jComboBoxList.get(0).addItem("Telecomunicaciones");
        this.jComboBoxList.get(0).addItem("Arquitectura");
        this.jPanelList.get(1).add(this.jComboBoxList.get(0));

        this.jComboBoxList.get(1).addItem("Escoga una Opcion");
        this.jComboBoxList.get(1).addItem("Presencial");
        this.jComboBoxList.get(1).addItem("Virtual");
        this.jComboBoxList.get(1).addItem("Semi Presencial");
        this.jPanelList.get(2).add(this.jComboBoxList.get(1));

        this.jComboBoxList.get(2).addItem("Escoga una Opcion");
        this.jComboBoxList.get(2).addItem("MATRIZ CUENCA");
        this.jComboBoxList.get(2).addItem("QUITO");
        this.jComboBoxList.get(2).addItem("GUAYAQUIL");
        this.jPanelList.get(3).add(this.jComboBoxList.get(2));

        this.jComboBoxList.get(3).addItem("Escoga una Opcion");
        this.jComboBoxList.get(3).addItem("EL VECINO");
        this.jComboBoxList.get(3).addItem("GIRON");
        this.jComboBoxList.get(3).addItem("");
        this.jPanelList.get(4).add(this.jComboBoxList.get(3));

        this.jComboBoxList.get(4).addItem("Escoga una Opcion");
        this.jComboBoxList.get(4).addItem("MATUTINA");
        this.jComboBoxList.get(4).addItem("VESPERTINA");
        this.jComboBoxList.get(4).addItem("NOCTURNA");
        this.jPanelList.get(5).add(this.jComboBoxList.get(4));

    }

}
