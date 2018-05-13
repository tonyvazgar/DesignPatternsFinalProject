/**
 * Clase que pertenece a Template Method
 * @author Luis Antonio Vazquez Garcia <luis.vazquezga@udlap.mx>
 */
import it.unical.mat.wrapper.FactResult;
import java.util.Vector;

public class ConcreteClass extends AbstractClass
{
    ProjectDeductiveDatabase model;
    Interfaz view;
    Controler controler;

    public void primitiveOperationIntro() {
        Intro intro = new Intro();
        intro.inicia();
    }


    public void primitiveOperationInterfaz() {
        model = new ProjectDeductiveDatabase();
        view = new Interfaz();
        controler = new Controler(model, view);
        view.inicia(controler);
    }

    @Override
    public Vector<String> primitiveOperationCargarRespuestas(Vector<Dato> datos, Vector<String> respuestas, String pregunta, Vector<FactResult> answerSet, String tema, String respuestaCorrecta) {
        String respuestaCor = "";
        String respuesta = "";
        //String tema = "";
        respuestas = new Vector<String>();
        for(Dato elDato: datos){
            if(elDato.getPredicate().equals("pregunta")) {
                if(elDato.getArgument(1).replace("\"","").equals(pregunta)) {
                    tema = elDato.getArgument(0);
                    respuestaCorrecta = elDato.getArgument(2).replace("\"","");
                }
            }
        }
        for(Dato elDato: datos){
            if(elDato.getPredicate().equals("pregunta") && elDato.getArgument(0).equals(tema)){
                respuestas.add(elDato.getArgument(2).replace("\"",""));
            }
        }
        respuestas.add(respuestaCorrecta);
        return respuestas;
    }

    @Override
    public Vector<String> primitiveOperationCargarPreguntasTema(Vector<Dato> datos, Vector<String> vector, Vector<FactResult> answerSet, String tema) {
        vector = new Vector<String>();
        datos = ProjectDeductiveDatabase.getDatos(answerSet);
        for(Dato elDato:datos){
            if(elDato.getPredicate().equals(tema)){
                vector.add(elDato.getArgument(0));
            }
        }
        return vector;
    }


}//end ConcreteClass
