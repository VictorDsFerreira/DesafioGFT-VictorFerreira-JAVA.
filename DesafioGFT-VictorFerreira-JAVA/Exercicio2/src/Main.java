import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Temperatura> temperaturas = new ArrayList<>();
        double somaTemperaturas = 0.0;
        double maiorTemperatura = Double.MIN_VALUE;
        double menorTemperatura = Double.MAX_VALUE;

        System.out.println("-----------Calculo de média de temperaturas----------");
        for (int i = 0; i < 7; i++) {
            System.out.println("Digite o valor da temperatura do dia " + (i + 1) + ": ");
            double valorTemperatura = sc.nextDouble();

            Temperatura temperatura = new Temperatura(valorTemperatura);
            temperaturas.add(temperatura);

            somaTemperaturas += temperatura.getTemperatura();

            if (temperatura.getTemperatura() > maiorTemperatura) {
                maiorTemperatura = temperatura.getTemperatura();
            }
            if (temperatura.getTemperatura() < menorTemperatura) {
                menorTemperatura = temperatura.getTemperatura();
            }

        }
        double media = somaTemperaturas / 7;

        System.out.println("-------------Resultado dos registros------------");
        System.out.println("Média semanal: " + media);
        System.out.println("Maior temperatura: " + maiorTemperatura);
        System.out.println("Menor temperatura: " + menorTemperatura);

        sc.close();
    }
}