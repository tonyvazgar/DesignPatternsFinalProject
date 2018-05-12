/**
 * Clase que pertenece a Singleton
 * @author Luis Antonio Vazquez Garcia <luis.vazquezga@udlap.mx>
 */
public class SingletonPattern {


    Singleton unicaInstancia;


    public void getInstancia(){
        unicaInstancia = Singleton.instance();
        //return primeraInstancia;
    }

    public void ponerDatosSingleton(String datos){
        unicaInstancia.setSingletonData(datos);
    }

    public void keep(){
        unicaInstancia.keep();
    }

    public String undo(){
        return unicaInstancia.undo();
    }

    public void imprimir(){
        unicaInstancia.imprimir();
    }
}
