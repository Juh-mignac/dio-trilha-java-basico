import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    	
        Scanner input = new Scanner(System.in);
    	
        System.out.println("Por favor, digite o número da conta: ");
        Integer numeroConta = Integer.parseInt(input.nextLine());
        
        System.out.println("Por favor, digite o número da agencia: ");
        String numeroAgencia = input.nextLine();
        
        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = input.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        Double numeroSaldo = Double.parseDouble(input.nextLine());
        
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + numeroSaldo + " já está disponível para saque");

        input.close();
    }
} 