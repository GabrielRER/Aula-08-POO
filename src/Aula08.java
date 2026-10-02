
public class Aula08 {
    public static void main(String[] args) {

        //Math math = new Math();

        int raio = 5;
        double area = Math.PI * Math.pow(raio,2);
        System.out.println(area);

        area = Matematica.PI * Matematica.pow(raio,2);
        System.out.println(area);

        //------ Parte 2
        // --------------------
        Ciencia historia = new Historia();

        Ciencia fisica = new CienciaNatural("Física", "Física");
    }
}