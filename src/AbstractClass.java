/**
 * Clase que pertenece a Template Method
 * @author Luis Antonio Vazquez Garcia <luis.vazquezga@udlap.mx>
 */
import it.unical.mat.wrapper.FactResult;
import java.util.Vector;

public abstract class AbstractClass
{

    public abstract void primitiveOperationIntro();
    public abstract void primitiveOperationInterfaz();
    public abstract Vector<String> primitiveOperationCargarRespuestas(Vector<Dato> datos, Vector<String> respuestas, String pregunta, Vector<FactResult> answerSet, String tema, String respuestaCorrecta);
    //---------------

    public static void templateMethodIntro()
    {
        ConcreteClass concreteObject;
        //----------------------------
        concreteObject = new ConcreteClass();
        concreteObject.primitiveOperationIntro();
        //concreteObject.primitiveOperation2();
    }//end templateMethod

    public static void templateMethodInterfaz(){
        ConcreteClass concreteObject;
        concreteObject = new ConcreteClass();
        concreteObject.primitiveOperationInterfaz();
    }

    public static Vector<String> cargarRespuestas(Vector<Dato> datos, Vector<String> respuestas, String pregunta, Vector<FactResult> answerSet, String tema, String respuestaCorrecta){
        ConcreteClass conceteObject;
        conceteObject = new ConcreteClass();
        return conceteObject.primitiveOperationCargarRespuestas(datos, respuestas, pregunta, answerSet, tema, respuestaCorrecta);
    }

}//end AbstractClass
