public class ConcreteClass extends AbstractClass {

    InterfazPrincipal viewPrincipal;
    InterfazNuevaReceta viewNuevaReceta;
    EstructuraDeDatos model;
    Mediador controller;
    MainInterface intro;


    @Override
    public void primitiveOperation1Intro() {
        intro = new MainInterface();
        intro.inicia();

    }

    public void primitiveOperation1App() {
        model = new EstructuraDeDatos();
        viewPrincipal = new InterfazPrincipal();
        viewNuevaReceta = new InterfazNuevaReceta();
        controller = new Mediador(model, viewPrincipal, viewNuevaReceta);
        viewPrincipal.setActionListener(controller);
        controller.actualizaElView();
    }

    public void primitiveOperation2App() {
        viewPrincipal.inicia();
    }

}