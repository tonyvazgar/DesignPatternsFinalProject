import java.util.Collections;
import java.util.LinkedList;

public class DataStructure extends LinkedList<Reminder> implements Model {
    SequentialFile datos;

    public DataStructure(){
        cargaDatosDelRepositorioALaEstructura();
    }

    @Override
    public void cargaDatosDelRepositorioALaEstructura() {
        int numeroDeLineas;
        int numeroDeRegistros;
        int i;
        Reminder reminder;
        String tittle, signature, date, details;
        datos = new SequentialFile("./src","reminders","txt");
        datos.open();
        numeroDeLineas = datos.getNumberOfLines();
        numeroDeRegistros = numeroDeLineas / 4;
        i = 0;
        while(i < numeroDeRegistros) {
            tittle = datos.readString();
            signature = datos.readString();
            date = datos.readString();
            details = datos.readString();
            reminder = new Reminder(tittle, signature, date, details);
            add(reminder);
            i = i + 1;
        }
        System.out.println(toString());

    }

    @Override
    public void salvaDatosDeLaEstructuraAlRepositorio() {

        int reg;
        datos = new SequentialFile("./src","reminders","txt");
        datos.create();

        reg = 0;
        while ( reg < size()){
            datos.writeString(get(reg).getTittle());
            datos.writeString(get(reg).getSignature());
            datos.writeString(get(reg).getDate());
            datos.writeString(get(reg).getDetails().replace("\n" , " "));
            reg = reg + 1;
        }
    }

    @Override
    public void agregaDatosALaEstructura(int indice, Object unDato) {
        Reminder dato = (Reminder) unDato;
        add(dato);
    }

    @Override
    public void modificaDatosEnLaEstructura(int indice, Object unDato) {
        Reminder dato;
        dato = (Reminder) unDato;
        remove(indice);
        add(indice, dato);
    }

    @Override
    public void eliminaDatosDeLaEstructura(int indice) {
        if( indice < size() && indice >= 0) {
            remove(indice);
        }
    }

    @Override
    public void ordenaLaEstructura() {
        Collections.sort(this);
    }

    @Override
    public double procesa(int indice) {
        return 0;
    }

    @Override
    public boolean hayDatos() {
        int tam = size();
        if (tam > 0) {
            return true;
        } else {
            return false;
        }
    }

}
