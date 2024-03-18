import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //todo: Conhercer e importar a classe Scanner

        Scanner meuObj = new Scanner(System.in);
        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite seus dados.");
        //Obter pela scanner os valores digitados no terminal
        
        System.out.println("Número: ");
        int numero = meuObj.nextInt();

        System.out.println("Agencia: ");
        meuObj.nextLine();
        String agencia = meuObj.nextLine();
        
        
        System.out.println("Nome: ");
        String nomeCliente = meuObj.nextLine();

        System.out.println("Saldo: ");
        double saldo = meuObj.nextDouble();
        //Exibir a mensagem conta criada
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
