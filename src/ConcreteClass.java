public class ConcreteClass extends AbstractClass {

    InterfazPrincipal viewPrincipal;
    InterfazNuevaReceta viewNuevaReceta;
    EstructuraDeDatos model;
    Mediador controller;
    Intro intro;


    @Override
    public void primitiveOperation1Intro() {
        intro = new Intro();
        intro.inicia();
    }

    public void primitiveOperation1App() {
        init();
        viewPrincipal.setActionListener(controller);
        controller.actualizaElView();
    }

    public void primitiveOperation2App() {
        viewPrincipal.inicia();
    }

    private void init(){
        model = new EstructuraDeDatos();
        viewPrincipal = new InterfazPrincipal();
        viewNuevaReceta = new InterfazNuevaReceta();
        controller = new Mediador(model, viewPrincipal, viewNuevaReceta);
    }
}