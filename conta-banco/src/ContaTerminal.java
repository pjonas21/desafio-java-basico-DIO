import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        var scan = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Conta: ");
        Integer numero = scan.nextInt();

        System.out.println("Por favor, digite o numero da Agencia: ");
        String agencia = scan.next();

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scan.next();

        System.out.println("Por favor, informe o saldo: ");
        Double saldo = scan.nextDouble();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " ja esta disponivel para saque");

        scan.close();
    }
}
