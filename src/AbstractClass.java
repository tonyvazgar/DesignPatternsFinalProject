public abstract class AbstractClass
{

    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();


    public static void templateMethod()
    {

        ConcreteClass concreteObject;

        //----------------------------
        concreteObject = new ConcreteClass();

        concreteObject.primitiveOperation1();
        concreteObject.primitiveOperation2();
    }//end templateMethod
}
