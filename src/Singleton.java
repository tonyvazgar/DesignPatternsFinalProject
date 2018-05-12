public class Singleton
{
    private static Singleton uniqueInstance;
    private String singletonData;
    static Originator object;

    //--------------------
    // El constructor debe asegurar que se lance una excepcion
    // en caso de que se intente crear otra instancia adicional
    private Singleton() throws Exception
    {
        if(uniqueInstance!=null)
            throw new Exception("No podemos tener otra instancia, baboso!!!");
        //end else
    }//end constructor

    // metodo para obtener la instancia
    public static synchronized Singleton instance()
    {
        if (uniqueInstance==null)
        {
            // debe tratarse de crear
            try
            {
                uniqueInstance = new Singleton();
                object = new Originator();
            }//end try
            catch(Exception excepcion)
            {
                System.out.println(excepcion);
            }//end catch
        }//end if
        return uniqueInstance;
    }//end Instance


    public void singletonOperation()
    {
        System.out.println(singletonData);
    }//end singletonOperation


    public String getSingletonData()
    {
        return singletonData;
    }//end getSingletonData


    public void setSingletonData(String unDato)
    {
        singletonData = unDato;
        object.state = unDato;
    }//end setSingletonData

    public void keep(){
        Caretaker.keep(object);
    }
    public String undo(){
        Caretaker.undo(object);
        return Caretaker.stack.lastElement().state;
    }

    public void imprimir(){
        System.out.println(Caretaker.stack.lastElement().state);
    }

}//end class Singleton
