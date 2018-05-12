/**
 * @author Luis Antonio Vazquez Garcia <luis.vazquezga@udlap.mx>
 */
/**
 * Para esta aplicación, seguí con el de inteligencia artificial agregando los siguientes patrones:
 * 1. Memento: Para poder regresar a un estado anterior (una pregunta anterior) guardando el estado de la pregunta.
 * 2. Singleton: Para poder tener una solo un objeto del memento y asi validar respuestas anterores. Ya que se accede a memento en varias clases.
 * 3. Template Method: Para organizar las diferentes partes del algoritmo y sea más fácil interpretarlo.
 */
public class Main {
    public static void main(String[] Args){
        AbstractClass.templateMethodIntro();
        AbstractClass.templateMethodInterfaz();
    }
}
