package modelos;

public class Divisao implements Calculo {

  @Override
  public double calcular(Double[] valores) {
    double divisao = valores[0];
    for (int i = 1; i < valores.length; i++) {
      divisao = divisao / valores[i];
    }

    System.out.println("-------------------------------------------");
    System.out.println("Resultado da divisao = " + divisao);
    System.out.println("-------------------------------------------");
    return divisao;
  }

}
