package modelos;

public class Subtracao implements Calculo {

  @Override
  public double calcular(Double[] valores) {
    double subtracao = valores[0];
    for (int i = 1; i < valores.length; i++) {
      subtracao = subtracao - valores[i];
    }

    System.out.println("-------------------------------------------");
    System.out.println("Resultado da subtracao = " + subtracao);
    System.out.println("-------------------------------------------");
    return subtracao;
  }

}
