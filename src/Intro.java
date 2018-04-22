import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Intro extends Frame implements ActionListener {

    Font tipografia = new Font("Helvetica", Font.PLAIN, 14);

    Button ok;
    Label infoNombre;
    Label info;
    Label info2;
    Label info3;
    Label patron1;
    Label patron2;
    Label patron3;

    public Intro() {
        setTitle("Intro");
        setBounds(100, 100, 350, 350);
        setLocationRelativeTo(null);
        setBackground(new Color(255,255,255));
        setLayout(null);
        setResizable(false);
        constuyeComponentes();
        setFont(tipografia);
        endProgram();
    }

    private void endProgram() {
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    private void constuyeComponentes() {
        ok = new Button("OK");
        ok.setBounds(250, 300, 80, 25);
        add(ok);
        ok.addActionListener(this::actionPerformed);

        infoNombre = new Label("Luis Antonio Vázquez García           153675");
        infoNombre.setBounds(30, 50, 300, 20);
        add(infoNombre);

        info = new       Label("Este es el mismo programa que utilicé para");
        info.setBounds(30, 110, 300, 20);
        add(info);

        info2 = new       Label("MVC, pero ahora será implementado con los");
        info2.setBounds(30, 130, 300, 20);
        add(info2);

        info3 = new       Label("siguientes patrones:");
        info3.setBounds(30, 150, 300, 20);
        add(info3);

        patron1 = new       Label("             •Template Method");
        patron1.setBounds(30, 190, 300, 20);
        add(patron1);

        patron2 = new       Label("             •");
        patron2.setBounds(30, 210, 300, 20);
        add(patron2);

        patron3 = new       Label("             •");
        patron3.setBounds(30, 230, 300, 20);
        add(patron3);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        Button botonAccionado = (Button) evento.getSource();
        if (botonAccionado == ok){
            AbstractClass.templateMethodMain();
            setVisible(false);
        }
    }

    public InterfazPrincipal ventanaPrincipal() {
        return new InterfazPrincipal();
    }


    public void inicia(){
        setVisible(true);
    }
}
