public abstract class AbstractClass
{

    public abstract void primitiveOperation1Intro();

    public abstract void primitiveOperation1App();
    public abstract void primitiveOperation2App();


    public static void templateMethodIntro() {

        ConcreteClass concreteObject = new ConcreteClass();
        concreteObject.primitiveOperation1Intro();
    }


    public static void templateMethodMain() {

        ConcreteClass concreteObject;
        //----------------------------
        concreteObject = new ConcreteClass();
        concreteObject.primitiveOperation1App();
        concreteObject.primitiveOperation2App();
    }//end templateMethod
}
