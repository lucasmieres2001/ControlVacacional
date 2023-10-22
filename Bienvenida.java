import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener {
private JTextField Nombre;
private JLabel Coca,SubTitulo,IngresarNombre,Derechos;
private JButton BotonAceptar;
public static String texto = "";

public Bienvenida() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(null);
    setTitle("Bienvenido");
    getContentPane().setBackground(new Color (255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    Coca = new JLabel(imagen);
    Coca.setBounds(25,15,300,150);
    add(Coca);

    SubTitulo = new JLabel("Sistema de control vacacional");
    SubTitulo.setBounds(25,150,320,50);
    SubTitulo.setFont(new Font("Andale Mono", 3, 20));
    SubTitulo.setForeground(new Color(255,255,255));
    add(SubTitulo);

    IngresarNombre = new JLabel("Por favor, ingrese su nombre");
    IngresarNombre.setFont(new Font("Andale Mono",2,13));
    IngresarNombre.setBounds(25,215,250,40);
    IngresarNombre.setForeground(new Color(255,255,255));
    add(IngresarNombre);

    Nombre = new JTextField();
    Nombre.setBounds(25,260,300,30);
    Nombre.setBackground(new Color(200,200,200));
    Nombre.setForeground(new Color(255,0,0));
    Nombre.setFont(new Font("Roboto",3,18));
    add(Nombre);

    BotonAceptar = new JButton("Ingresar");
    BotonAceptar.setForeground(new Color(255,0,0));
    BotonAceptar.setBounds(90,330,150,50);
    BotonAceptar.addActionListener(this);
    add(BotonAceptar);

    Derechos = new JLabel("©2017 The Coca-Cola Company");
    Derechos.setBounds(90,390,350,40);
    Derechos.setForeground(new Color(255,255,255));
    add(Derechos);
    }

public void actionPerformed(ActionEvent e){
if(e.getSource() == BotonAceptar){
    texto = Nombre.getText().trim();
    if(texto.equals("")){
JOptionPane.showMessageDialog(null, "Por favor, ingresa tu usuario");
    }else{
    TerminosYcondiciones interfaz = new TerminosYcondiciones();
    interfaz.setBounds(0,0,750,500);
    interfaz.setVisible(true);
    interfaz.setResizable(false);
    interfaz.setLocationRelativeTo(null);
    this.setVisible(false);
    }
        }
    }

public static void main(String args[]){
    Bienvenida interfaz = new Bienvenida();
    interfaz.setBounds(0,0,370,600);
    interfaz.setVisible(true);
    interfaz.setResizable(false);
    interfaz.setLocationRelativeTo(null);
}
}












