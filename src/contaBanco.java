import java.util.Scanner; // Importação da biblioteca de Scanner para podermos solicitar as informações ao cliente através do terminal

public class contaBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Aqui Definimos que scanner será a chamada do nosso input

        System.out.println("Seja bem vindo(a) ao banco Dio. Vamos iniciar o processo de criação de sua conta!"); // Boas
                                                                                                                 // vindas
                                                                                                                 // ao
                                                                                                                 // novo
                                                                                                                 // cliente

        System.out.println("Digite o seu Nome:"); // A partir daqui iniciamos a solicitação de informações ao cliente
        String nome = scanner.nextLine();

        System.out.println("Digite o número de sua agência:");
        int conta = scanner.nextInt();

        System.out.println("Agora digite o número da sua conta:");
        int agencia = scanner.nextInt();

        System.out.println("Digite o seu saldo inicial e não esqueça de usar virgula ao invés do ponto:");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Seja bem vindo " + nome + "! O número de sua conta é: " + agencia + " Agencia " + conta
                        + " Seu saldo atual é de: " + saldo);
        scanner.close();
    }
}