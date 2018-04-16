public class ConcreteClass extends AbstractClass
{

    InterfazPrincipal viewPrincipal;
    InterfazNuevaReceta viewNuevaReceta;
    EstructuraDeDatos model;
    Mediador controller;

    public void primitiveOperation1() {
        init();
        viewPrincipal.setActionListener(controller);
        controller.actualizaElView();
    }

    public void primitiveOperation2() {
        viewPrincipal.inicia();
    }

    private void init(){
        model = new EstructuraDeDatos();
        viewPrincipal = new InterfazPrincipal();
        viewNuevaReceta = new InterfazNuevaReceta();
        controller = new Mediador(model, viewPrincipal, viewNuevaReceta);
    }
}
