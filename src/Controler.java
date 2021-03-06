/*
 * Created by TonyVazgar on 5/5/18.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class Controler implements ActionListener {

    Interfaz view;
    ProjectDeductiveDatabase model;
    Originator object;
    SingletonPattern elSingleton;

    public Controler(ProjectDeductiveDatabase model, Interfaz view){
        this.model = model;
        this.view = view;
        view.consola.setText(ProjectDeductiveDatabase.preguntadosPreguntas());
        view.tema.setText(ProjectDeductiveDatabase.preguntadosTema());
        for(int i = 0; i < ProjectDeductiveDatabase.respuestas.size(); i++){
            view.respuestas.addItem(ProjectDeductiveDatabase.respuestas.get(i));
        }
        elSingleton = new SingletonPattern();
        elSingleton.getInstancia();
    }

    public void actionPerformed(ActionEvent event){
        Button botonAccionado = (Button) event.getSource();
        if(botonAccionado == view.siguiente){
            actualizarMarcadores();
            ProjectDeductiveDatabase.checarRespuesta(view.respuestas.getItemAt(view.respuestas.getSelectedIndex()).toString());
            view.respuestas.removeAllItems();
            view.consola.setText(ProjectDeductiveDatabase.preguntadosPreguntas());
            view.tema.setText(ProjectDeductiveDatabase.preguntadosTema());
            for(int i = 0; i < ProjectDeductiveDatabase.respuestas.size(); i++){
                view.respuestas.addItem(ProjectDeductiveDatabase.respuestas.get(i));
            }
            if(ProjectDeductiveDatabase.puntaje > 8){
                view.setVisible(false);
                JOptionPane.showMessageDialog(view, "Haz ganado la ronda!!", "AVISO", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
            if(ProjectDeductiveDatabase.errores > 4){
                view.setVisible(false);
                JOptionPane.showMessageDialog(view, "Haz perdido el juego!", "AVISO", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
            actualizarMarcadores();
        }
        if(botonAccionado == view.anterior){
            if(ProjectDeductiveDatabase.errores > 0 || ProjectDeductiveDatabase.puntaje > 0) {
                if (ProjectDeductiveDatabase.errores > 0) {
                    ProjectDeductiveDatabase.errores--;
                }
                view.respuestas.removeAllItems();
                String undo = elSingleton.undo();
                view.consola.setText(undo);
                view.tema.setText(ProjectDeductiveDatabase.obtenerTemaDePregunta(undo));
                Vector<String> respuestas = ProjectDeductiveDatabase.respuestas(undo);
                for (int i = 0; i < respuestas.size(); i++) {
                    view.respuestas.addItem(respuestas.get(i));
                }
                ProjectDeductiveDatabase.checarRespuesta(view.respuestas.getItemAt(view.respuestas.getSelectedIndex()).toString());
            }
        }
    }

    private void actualizarMarcadores(){
        view.puntos.setText(Integer.toString(ProjectDeductiveDatabase.puntaje));
        view.errores.setText(Integer.toString(ProjectDeductiveDatabase.errores));
    }
}
