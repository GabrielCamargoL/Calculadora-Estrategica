package modelos;

public class Multiplicacao implements Calculo {

  @Override
  public double calcular(Double[] valores) {
    double multiplicacao = valores[0];
    for (int i = 1; i < valores.length; i++) {
      multiplicacao = multiplicacao * valores[i];
    }

    System.out.println("-------------------------------------------");
    System.out.println("Resultado da multiplicacao = " + multiplicacao);
    System.out.println("-------------------------------------------");
    return multiplicacao;
  }

}
