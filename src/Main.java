import java.text.SimpleDateFormat;
import java.util.Date;

public class Main
{

    public static void main(String[] args)
    {

        AbstractClass.templateMethodIntro();
        Reminder d = new Reminder("COMER", "tipis", "22/4/2018", "le gusta el quesito");
        System.out.println(d.toString());

    }//end main

}
