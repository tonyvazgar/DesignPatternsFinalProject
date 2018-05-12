import javax.swing.*;
import java.awt.*;

public class Intro extends Frame{

    public void inicia(){
        JOptionPane.showMessageDialog(this,
                "LUIS ANTONIO VAZQUEZ GARCIA                                                                                            ID: 153675 \n\n" +
                        "Mismo proyecto que el de inteligencia artificial con estos patrones de diseño:\n\n" +
                        "--> MEMENTO: Para poder regresar a un estado anterior (una pregunta anterior) guardando el estado de la pregunta.\n" +
                        "--> SINGLETON: Para poder tener una solo un objeto del memento y asi validar respuestas anterores. Ya que se accede a memento en varias clases.\n" +
                        "--> TEMPLATE METHOD: Para organizar las diferentes partes del algoritmo y sea más fácil interpretarlo.",
                "Información",
                JOptionPane.INFORMATION_MESSAGE);
        setVisible(false);
    }
}
