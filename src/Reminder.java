import java.text.SimpleDateFormat;
import java.util.Date;

public class Reminder implements Comparable<Reminder>{
    private String tittle;
    private String signature;
    private String date;
    private String details;



    public Reminder(String tittle, String signature, String date, String details){
        this.tittle = tittle;
        this.signature = signature;
        this.date = date;
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int compareTo(Reminder o) {
        String titulo = o.getTittle();
        return tittle.compareTo(titulo);
    }

    public String toString(){
        return tittle + " | " + signature + " | " + date + " | " + details ;
    }
}
