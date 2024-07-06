import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = keyboard.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = keyboard.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;

        if(contagem <= 0){
            throw new ParametrosInvalidosException();
        }

        for (int i = 1; i < (contagem+1); i++) {
            System.out.println("Imprimindo o número "+i);
        }
    }
}
