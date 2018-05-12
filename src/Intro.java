import javax.swing.*;
import java.awt.*;

public class Intro extends Frame{

    public void inicia(){
        JOptionPane.showMessageDialog(this,
                "LUIS ANTONIO VAZQUEZ GARCIA                                                                                            ID: 153675 \n\n" +
                        "Mismo proyecto que el de inteligencia artificial con estos patrones de diseño:\n\n" +
                        "--> MEMENTO: Para poder regresar a un estado anterior (una pregunta anterior).\n" +
                        "--> SINGLETON: Para poder tener una instancia del memento y asi validar respuestas anterores.\n" +
                        "--> TEMPLATE METHOD: Para organizar las diferentes partes del algoritmo y sea más fácil interpretarlo.",
                "Información",
                JOptionPane.INFORMATION_MESSAGE);
        setVisible(false);
    }
}
