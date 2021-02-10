import java.util.Scanner;
/** ... */
public class MainClass {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Crea mat leyendo sus elementos
        double[][] mat = Internal.loadDoubleArray2D(input); 
        double[] resultado = Excercise.sum(mat);
        System.out.println("La suma de las filas es: ");
        Internal.showDoubleArray(resultado);
    }
}