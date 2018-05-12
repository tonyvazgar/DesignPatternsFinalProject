public class SingletonAccess {


    Singleton primeraInstancia;


    public void getInstancia(){
        primeraInstancia = Singleton.instance();
        //return primeraInstancia;
    }

    public void ponerDatosSingleton(String datos){
        primeraInstancia.setSingletonData(datos);
    }

    public void keep(){
        primeraInstancia.keep();
    }

    public String undo(){
        return primeraInstancia.undo();
    }

    public void imprimir(){
        primeraInstancia.imprimir();
    }
}
