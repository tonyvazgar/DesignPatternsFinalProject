/**
 * Clase que pertenece a Memento
 * @author Luis Antonio Vazquez Garcia <luis.vazquezga@udlap.mx>
 */
import java.util.Stack;
public class Caretaker
{
    static Stack<Memento> stack = new Stack<Memento>();
    //--------------

    public static void keep(Originator anOriginator)
    {
        Memento aMemento;
        //
        aMemento = anOriginator.createMemento();
        stack.push(aMemento);
    }//end start

    public static void undo(Originator anOriginator)
    {
        Memento aMemento;
        //
        aMemento = stack.pop();
        anOriginator.setMemento(aMemento);
    }//end undo

    //Añado método para saber la cantidad de elementos en el stack...
    public int getElements(){
        return stack.size();
    }

}//end class Caretaker
