import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MenuPrincipal extends JFrame implements ActionListener{
private JMenuBar bar;
private JMenu menu1,menu2,menu3,menu4;
private JMenuItem item1,item2,item3,item4,item5,item6,item7;
private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
private JTextField text1,text2,text3;
private JComboBox combo1,combo2;
private JTextArea area;
String names = "";

public MenuPrincipal(){
    //Configuraciones generales
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Pantalla Principal");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    getContentPane().setBackground(Color.RED);
    Bienvenida ForainDate = new Bienvenida();
    names = ForainDate.texto;

    //Menú
    bar = new JMenuBar();
    bar.setBackground(Color.RED);
    setJMenuBar(bar);

    menu1 = new JMenu("Opciones");
    menu1.setForeground(Color.WHITE);
    bar.add(menu1);
    menu2 = new JMenu("Color de fondo");
    menu2.setForeground(Color.BLACK);
    menu1.add(menu2);
    menu3 = new JMenu("Calcular");
    menu3.setForeground(Color.WHITE);
    bar.add(menu3);
    menu4 = new JMenu("Acerca de");
    menu4.setForeground(Color.WHITE);
    bar.add(menu4);

    item1 = new JMenuItem("Rojo");
    item1.addActionListener(this);
    menu2.add(item1);
    item2 = new JMenuItem("Negro");
    item2.addActionListener(this);
    menu2.add(item2);
    item3 = new JMenuItem("Morado");
    item3.addActionListener(this);
    menu2.add(item3);

    item4 = new JMenuItem("Limpiar");
    item4.addActionListener(this);
    menu1.add(item4);
    item5 = new JMenuItem("Salir");
    item5.addActionListener(this);
    menu1.add(item5);
    item6 = new JMenuItem("Vacaciones");
    item6.addActionListener(this);
    menu3.add(item6);
    

    item7 = new JMenuItem("Acerca del creador");
    item7.addActionListener(this);
    menu4.add(item7);

    //Labels
    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    label1 = new JLabel(imagen);
    label1.setBounds(0,0,300,150);
    add(label1);

    label2 = new JLabel("¡Bienvenido " + names + "!");
    label2.setBounds(340,10,300,150);
    label2.setFont(new Font("Andale Mono", 3,25));
    label2.setForeground(Color.WHITE);
    add(label2);

    label3 = new JLabel("Datos del trabajador para el calculo de vacaciones");
    label3.setBounds(60,100,550,150);
    label3.setFont(new Font("Andale Mono", 3,22));
    label3.setForeground(Color.WHITE);
    add(label3);

    label4 = new JLabel("Nombre Completo:");
    label4.setFont(new Font("Andale Mono",0,12));
    label4.setForeground(Color.WHITE);
    label4.setBounds(10,215,200,20);
    add(label4);

    label5 = new JLabel("Apellido Paterno:");
    label5.setFont(new Font("Andale Mono",0,12));
    label5.setForeground(Color.WHITE);
    label5.setBounds(10,270,200,20);
    add(label5);

    label6 = new JLabel("Apellido Materno:");
    label6.setFont(new Font("Andale Mono",0,12));
    label6.setForeground(Color.WHITE);
    label6.setBounds(10,320,200,20);
    add(label6);

    label7 = new JLabel("Selecciona el departamento:");
    label7.setFont(new Font("Andale Mono",0,12));
    label7.setForeground(Color.WHITE);
    label7.setBounds(300,215,200,20);
    add(label7);

    label8 = new JLabel("Selecciona la antigüedad:");
    label8.setFont(new Font("Andale Mono",0,12));
    label8.setForeground(Color.WHITE);
    label8.setBounds(300,270,200,20);
    add(label8);

    label9 = new JLabel("Resultado del cálculo:");
    label9.setFont(new Font("Andale Mono",0,12));
    label9.setForeground(Color.WHITE);
    label9.setBounds(300,320,200,20);
    add(label9);

    label10 = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
    label10.setForeground(Color.WHITE);
    label10.setBounds(130,445,370,20);
    add(label10);

    //TextFields
    text1 = new JTextField();
    text1.setBounds(10,240,150,20);
    add(text1);

    text2 = new JTextField();
    text2.setBounds(10,290,150,20);
    add(text2);

    text3 = new JTextField();
    text3.setBounds(10,340,150,20);
    add(text3);

    //ComboBox
    combo1 = new JComboBox();
    combo1.setBounds(300,235,200,20);
    add(combo1);
    combo1.addItem("");
    combo1.addItem("Atención al cliente");
    combo1.addItem("Departamento de logística");
    combo1.addItem("Departamento de gerencia");

    combo2 = new JComboBox();
    combo2.setBounds(300,290,200,20);
    add(combo2);
    combo2.addItem("");
    combo2.addItem("1 año de servicio");
    combo2.addItem("2 a 6 años de servicio");
    combo2.addItem("7 años o más de servicio");
    //JTextArea
    area = new JTextArea("Por favor, coloque todos sus datos \n" + 
                         "y dirijase a la pestaña 'Calcular' para \n" +
                         "calcular sus vacaciones.");
    area.setEditable(false);
    area.setFont(new Font("Andale Mono", 3,14));
    area.setForeground(Color.RED);
    area.setBackground(new Color(200,200,200));
    area.setBounds(300,340,310,100);
    add(area);
    
}



public void actionPerformed(ActionEvent e){
if(e.getSource()==item1){
    //rojo
this.getContentPane().setBackground(new Color(255,0,0));
bar.setBackground(new Color(255,0,0));
}
if(e.getSource()==item2){
    //negro
this.getContentPane().setBackground(new Color(0,0,0));
bar.setBackground(new Color(0,0,0));
}
if(e.getSource()==item3){
    //morado
this.getContentPane().setBackground(new Color(55,0,85));
bar.setBackground(new Color(55,0,85));
}
if(e.getSource()==item4){
    //limpiar
    text1.setText("");
    text2.setText("");
    text3.setText("");
    combo1.setSelectedIndex(0);
    combo2.setSelectedIndex(0);
}
if(e.getSource()==item5){
    //salir
    Bienvenida interfaz = new Bienvenida();
    interfaz.setBounds(0,0,370,600);
    interfaz.setVisible(true);
    interfaz.setResizable(false);
    interfaz.setLocationRelativeTo(null);
    this.setVisible(false);
}
if(e.getSource()==item6){
    //Calcular
//------------------------------------
    //primero obtengo la info de los TextFields:
    String usuario = text1.getText();
    String apellido1 = text2.getText();
    String apellido2 = text3.getText();
    //Después la de los comboBox:
    String departamento = combo1.getSelectedItem().toString();
    String antigüedad = combo2.getSelectedItem().toString();
    //Condicionales atención al cliente:
    if(usuario.equals("") || apellido1.equals("") || apellido2.equals("") || departamento.equals("") || antigüedad.equals("") ){
    JOptionPane.showMessageDialog(null, "Por favor, ingrese todos los campos requeridos.", "Error de campos", JOptionPane.WARNING_MESSAGE);}
    else{
    if(departamento.equals("Atención al cliente") && antigüedad.equals("1 año de servicio")){
    area.setText("Hola " + usuario + " " + apellido1 +  ":" + 
                "\n"+ departamento + " con \n" 
                + antigüedad + " recibirá \n" + 
                "6 días de vacaciones.");
    }
    if(departamento.equals("Atención al cliente") && antigüedad.equals("2 a 6 años de servicio")){
    area.setText("Hola " + usuario + " " + apellido1 +  ":" + 
                "\n"+ departamento + " con \n" 
                + antigüedad + " recibirá \n" + 
                "14 días de vacaciones.");
    }
    if(departamento.equals("Atención al cliente") && antigüedad.equals("7 años o más de servicio")){
    area.setText("Hola " + usuario + " " + apellido1 +  ":" + 
                "\n"+ departamento + " con \n" 
                + antigüedad + " recibirá \n" + 
                "20 días de vacaciones.");
    }

    //Condicionales departamento de logística:
    
    if(departamento.equals("Departamento de logística") && antigüedad.equals("1 año de servicio")){
    area.setText("Hola " + usuario + " " + apellido1 +  ":" + 
                "\n"+ departamento + " con \n" 
                + antigüedad + " recibirá \n" + 
                "7 días de vacaciones.");
    }
    if(departamento.equals("Departamento de logística") && antigüedad.equals("2 a 6 años de servicio")){
    area.setText("Hola " + usuario + " " + apellido1 +  ":" + 
                "\n"+ departamento + " con \n" 
                + antigüedad + " recibirá \n" + 
                "15 días de vacaciones.");
    }
    if(departamento.equals("Departamento de logística") && antigüedad.equals("7 años o más de servicio")){
    area.setText("Hola " + usuario + " " + apellido1 +  ":" + 
                "\n"+ departamento + " con \n" 
                + antigüedad + " recibirá \n" + 
                "22 días de vacaciones.");
    }

    //Condicionales departamento de gerencia:
    if(departamento.equals("Departamento de gerencia") && antigüedad.equals("1 año de servicio")){
    area.setText("Hola " + usuario + " " + apellido1 +  ":" + 
                "\n"+ departamento + " con \n" 
                + antigüedad + " recibirá \n" + 
                "10 días de vacaciones.");
    }
    if(departamento.equals("Departamento de gerencia") && antigüedad.equals("2 a 6 años de servicio")){
    area.setText("Hola " + usuario + " " + apellido1 +  ":" + 
                "\n"+ departamento + " con \n" 
                + antigüedad + " recibirá \n" + 
                "20 días de vacaciones.");
    }
    if(departamento.equals("Departamento de gerencia") && antigüedad.equals("7 años o más de servicio")){
    area.setText("Hola " + usuario + " " + apellido1 +  ":" + 
                "\n"+ departamento + " con \n" 
                + antigüedad + " recibirá \n" + 
                "30 días de vacaciones.");
        }
    }
    
}
if(e.getSource()==item7){
 //Creador
JOptionPane.showMessageDialog(null,"Creado por Lucas Nahuel Mieres \n GitHub: 'https://github.com/lucasmieres2001/'","Acerca del creador", JOptionPane.INFORMATION_MESSAGE);
        }
    }

public static void main(String args[]){
    MenuPrincipal interfaz = new MenuPrincipal();
    interfaz.setBounds(0,0,640,535);
    interfaz.setVisible(true);
    interfaz.setResizable(false);
    interfaz.setLocationRelativeTo(null);
    
}

}






