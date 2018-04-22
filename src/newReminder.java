import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class newReminder extends Frame implements ActionListener {

    Font tipografia = new Font("Helvetica", Font.PLAIN, 14);

    Label tittleLabel;
    Label signatureLabel;
    Label dateLabel;
    Label detailsLabel;

    TextField tittleText;
    TextField signatureText;
    TextField dateText;
    TextArea detailsText;

    Button ok;
    Button cancel;

    public newReminder(){
        setTitle("Add new reminder");
        setBounds(100, 100, 460, 300);
        setLocationRelativeTo(null);
        setBackground(new Color(255,255,255));
        setLayout(null);
        setResizable(false);
        constuyeComponentes();
        setFont(tipografia);
        endProgram();
    }

    private void constuyeComponentes() {
        tittleLabel = new Label("Tittle:");
        tittleText = new TextField();
        signatureLabel = new Label("Signature:");
        signatureText = new TextField();
        dateLabel = new Label("Date (dd/mm/yyy):");
        dateText = new TextField();
        detailsLabel = new Label("Details:");
        detailsText = new TextArea();

        tittleLabel.setBounds(30, 50, 90, 20);
        add(tittleLabel);
        signatureLabel.setBounds(30, 80, 90, 20);
        add(signatureLabel);
        dateLabel.setBounds(30, 110, 120, 20);
        add(dateLabel);
        detailsLabel.setBounds(30, 140, 90, 20);
        add(detailsLabel);

        tittleText.setBounds(160, 50, 250, 20);
        add(tittleText);
        signatureText.setBounds(160, 80, 250, 20);
        add(signatureText);
        dateText.setBounds(160,110,250,20);
        add(dateText);
        detailsText.setBounds(160, 140, 250, 80);
        add(detailsText);

        ok = new Button("OK");
        ok.setBounds(320,270,90,20);
        ok.addActionListener(this::actionPerformed);
        add(ok);
        cancel = new Button("BACK");
        cancel.setBounds(160, 270,90,20);
        cancel.addActionListener(this::actionPerformed);
        add(cancel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Button b = (Button)e.getSource();
        if(b == ok){
            System.out.println("Its ok");
        }else {
            System.out.println("Its cancelled");
            termina();
        }
    }

    public void termina() {
        setVisible(false);
    }

    public void endProgram() {
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                termina();
            }
        });
    }
}
