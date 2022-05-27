package modelos;

public class Hipotenusa implements Calculo {

  @Override
  public double calcular(Double[] valores) {
    double hipotenusa = Math.sqrt(Math.pow(valores[0], 2) + Math.pow(valores[1], 2));

    System.out.println("-------------------------------------------");
    System.out.println("Calculo da hipotenusa = " + hipotenusa);
    System.out.println("-------------------------------------------");
    return hipotenusa;
  }

}
