
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o numero da Agência! ");
        int Numero = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();

        System.out.print("Digite sua Agencia: ");
        String Agencia  = scanner.nextLine();

        System.out.print("Digite seu nome: ");
        String NomeCliente  = scanner.nextLine();

        System.out.print("Digite seu saldo: ");
        double Saldo = Double.parseDouble(scanner.nextLine());

        

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + Agencia + ", conta " 
                            + Numero + " e seu saldo "+ Saldo + " ja está disponível para saque");

        scanner.close();


    }
}
