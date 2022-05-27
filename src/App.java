import io.Entrada;
import modelos.Divisao;
import modelos.Hipotenusa;
import modelos.Multiplicacao;
import modelos.Soma;
import modelos.Subtracao;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculadora massa :)");
        boolean execucao = true;
        while (execucao) {
            System.out.println("Que tipo de calculo você deseja fazer:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Hipotenusa");
            System.out.println("0 - Sair");

            Entrada entrada = new Entrada();
            int operacao = entrada.receberNumeroInteiro();

            System.out.println("Digite o primeiro numero");
            Double n1 = entrada.receberNumeroDouble();
            System.out.println("Digite o segundo numero");
            Double n2 = entrada.receberNumeroDouble();

            Double[] valores = { n1, n2 };

            switch (operacao) {
                case 0:
                    execucao = false;
                    System.out.println("Até mais!\n");
                    break;
                case 1:
                    Soma soma = new Soma();
                    soma.calcular(valores);
                    break;
                case 2:
                    Subtracao subtracao = new Subtracao();
                    subtracao.calcular(valores);
                    break;
                case 3:
                    Multiplicacao multiplicacao = new Multiplicacao();
                    multiplicacao.calcular(valores);
                    break;
                case 4:
                    Divisao divisao = new Divisao();
                    divisao.calcular(valores);
                    break;
                case 5:
                    Hipotenusa hipotenusa = new Hipotenusa();
                    hipotenusa.calcular(valores);
                    break;
                default:
                    System.out.println("Operação não entendida");
                    break;
            }
        }
    }
}
