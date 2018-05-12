/**
 * Clase que pertenece a Memento
 * @author Luis Antonio Vazquez Garcia <luis.vazquezga@udlap.mx>
 */
public class Originator
{
    String state;
    //-----------

    public void setMemento(Memento m)
    {
        state = m.getState();
    }//end setMemento

    public Memento createMemento()
    {
        Memento unMemento;
        //----------------

        unMemento = new Memento(state);
        return unMemento;
    }//end createMemento

}//end class Originator
