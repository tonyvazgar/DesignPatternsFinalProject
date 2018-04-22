import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainInterface extends Frame {

    Font tipografia = new Font("Helvetica", Font.PLAIN, 16);
    Button ver;
    Button nuevo;
    Label bienvenido;

    public MainInterface() {
        setTitle("*Recordatorios :)*");
        setBounds(100, 100, 560, 260);
        setLocationRelativeTo(null);
        setBackground(new Color(255,255,255));
        setLayout(null);
        setResizable(false);
        setFont(tipografia);
        constuyeComponentes();
        endProgram();
    }

    public void constuyeComponentes() {
        ponerBotones();
    }

    private void ponerBotones() {
        bienvenido = new Label("Bienvenido!");
        bienvenido.setBounds(240,40,100,100);
        add(bienvenido);
        ver = new Button("<html><center>Ver<br/>recordatorios</center></html>");
        ver.setBounds(90,150,140, 50);
        add(ver);
        ver.addActionListener(this::actionPerformed);
        nuevo = new Button("<html><center>Nuevo<br/>recordatorio</center></html>");
        nuevo.setBounds(330,150,140,50);
        add(nuevo);
        nuevo.addActionListener(this::actionPerformed);
    }

    public void actionPerformed(ActionEvent evento) {
        Button botonAccionado = (Button) evento.getSource();
        if(botonAccionado == ver) {
            System.err.println("ver recordatorios");
            //Cambiar por interfaz de ver reocrdatorios
            AbstractClass.templateMethodMain();
        }
        if (botonAccionado == nuevo){

            System.err.println("Nuevo recordatorio");
            //Cambiar por interfaz de nuevo recordatorio
            new InterfazNuevaReceta().setVisible(true);
        }
    }

    public void inicia() {
        setVisible(true);
    }

    public void endProgram() {
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

}
