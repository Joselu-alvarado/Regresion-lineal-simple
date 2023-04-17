import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] xData = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double[] yData = {2, 4, 6, 8, 10, 12, 14, 16,18};

        DataSet dataSet = new DataSet(xData, yData);
        RegresionLin modelo = new RegresionLin(dataSet);
        modelo.imprimirEcuacion();

        Scanner scanner = new Scanner(System.in);
        double[] valoresX = new double[10];
        double[] valoresY = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Ingrese el valor %d de X a calcular: ", i + 1); //de caracter Double
            valoresX[i] = scanner.nextDouble();
            valoresY[i] = modelo.predecir(valoresX[i]);
            System.out.printf("Para X=%.2f, se predice Y=%.2f\n", valoresX[i], valoresY[i]);
        }
    }
}
