package modelos;

public class Soma implements Calculo {

  @Override
  public double calcular(Double[] valores) {
    double soma = 0;
    for (int i = 0; i < valores.length; i++) {
      soma = soma + valores[i];
    }

    System.out.println("-------------------------------------------");
    System.out.println("Resultado da soma = " + soma);
    System.out.println("-------------------------------------------");
    return soma;
  }

}
