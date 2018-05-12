/**
 * Clase que pertenece a Memento
 * @author Luis Antonio Vazquez Garcia <luis.vazquezga@udlap.mx>
 */
public class Memento
{
    String state;
    //Constructor de la clase
    public Memento(String aState)
    {
        state = aState;
    }//end constructor


    public String getState()
    {
        return state;
    }//end getState


    public void setState(String aState)
    {
        state = aState;
    }//end setState

}//end class Memento
