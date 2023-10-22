import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class TerminosYcondiciones extends JFrame implements ActionListener, ChangeListener{
//'String names ="";' está funcionando para alojar los datos de la clase "Bienvenida" que seria el login (lo declaro dentro de la clase);
private JLabel logoCoca,titulo;
private JTextArea Condiciones; 
private JCheckBox palomita;
private JButton botonSi,botonNo;
String names = "";

public TerminosYcondiciones(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ForainDate = new Bienvenida();
    names = ForainDate.texto;

    titulo = new JLabel("TÉRMINOS Y CONDICIONES");
    titulo.setFont(new Font("Andale Mono",3,18));
    titulo.setForeground(Color.BLACK);
    titulo.setBounds(250,5,350,30);
    add(titulo);

    Condiciones = new JTextArea("Esta aplicación ah sido programada por Lucas Nahuel Mieres," + 
                                "\n Todos los derechos intelectuales de esta aplicación son propiedad del mismo." +
                                "\n GitHub del creador:  \n https://github.com/lucasmieres2001");
    Condiciones.setBounds(20,40,690,300);
    Condiciones.setEditable(false);
    Condiciones.setBackground(new Color(0,0,0));
    Condiciones.setForeground(new Color(190,190,0));
    Condiciones.setFont(new Font("Andale Mono",3,17));
    add(Condiciones);

// Acá hago uso de la String "names" la cual importé de mi clase Bienvenida:
//-----------------------------------------------------------
    palomita = new JCheckBox("Yo " + names + " Acepto.");
//-----------------------------------------------------------
    palomita.setBounds(10,360,300,30);
    palomita.addChangeListener(this);
    add(palomita);

    botonSi = new JButton("Acepto");
    botonSi.setEnabled(false);
    botonSi.setBounds(10,400,150,30);
    botonSi.addActionListener(this);
    add(botonSi);

    botonNo = new JButton("No acepto");
    botonNo.setBounds(190,400,150,30);
    botonNo.setEnabled(true);
    botonNo.addActionListener(this);
    add(botonNo);

    ImageIcon imagen = new ImageIcon("images/coca-cola.png");
    logoCoca = new JLabel(imagen);
    logoCoca.setBounds(380,340,300,110);
    add(logoCoca);
}

public void stateChanged(ChangeEvent e){
    //Condicional para que cuando Checkbox sea "true" el boton de acepto esté habilitado y visceversa;
if(palomita.isSelected()==true){
    botonSi.setEnabled(true);
    botonNo.setEnabled(false);
        }else{
            botonSi.setEnabled(false);
            botonNo.setEnabled(true);
            }
        }

public void actionPerformed(ActionEvent e){
    //Condicional para que boton "aceptar" nos redireccione a la interfaz principal o, en caso contrario, nos redireccione al Login;
if(e.getSource()== botonSi){
    MenuPrincipal interfaz = new MenuPrincipal();
    interfaz.setBounds(0,0,640,535);
    interfaz.setVisible(true);
    interfaz.setResizable(false);
    interfaz.setLocationRelativeTo(null);
    this.setVisible(false);
}else if(e.getSource()==botonNo){
    Bienvenida interfaz = new Bienvenida();
    interfaz.setBounds(0,0,370,600);
    interfaz.setVisible(true);
    interfaz.setResizable(false);
    interfaz.setLocationRelativeTo(null);
    this.setVisible(false);
            }
        }

public static void main(String args[]){
    TerminosYcondiciones interfaz = new TerminosYcondiciones();
    interfaz.setBounds(0,0,750,500);
    interfaz.setVisible(true);
    interfaz.setResizable(false);
    interfaz.setLocationRelativeTo(null);
    }   
}