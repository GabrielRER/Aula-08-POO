public class Matematica {

    private Matematica(){}

    public static final double PI = 3.14159265;

    public static double pow (int base, int expoente){
        int resultado = 1;
        for(int i = 0; i < expoente; i++) {
            resultado = base;
        }
        return resultado;
    }
}
