import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Colaborador> colaboradores = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o nome do colaborador:");
            String nome = scanner.nextLine();
            System.out.println("Digite o CPF do colaborador:");
            String cpf = scanner.nextLine();
            System.out.println("Digite o telefone do colaborador:");
            String telefone = scanner.nextLine();
            System.out.println("Digite a data de nascimento do colaborador (dd/mm/aaaa):");
            String dataNascimento = scanner.nextLine();
            System.out.println("Digite a data de agendamento (dd/mm/aaaa):");
            String dataAgendamento = scanner.nextLine();
            System.out.println("Digite o período (manhã, tarde ou noite):");
            String periodo = scanner.nextLine();

            Colaborador colaborador = new Colaborador(nome, cpf, telefone, dataNascimento, dataAgendamento, periodo);
            colaboradores.add(colaborador);

            System.out.println("Deseja cadastrar outro colaborador? (S/N)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }

        System.out.println("Lista de colaboradores cadastrados:");
        for (Colaborador colaborador : colaboradores) {
            System.out.println(colaborador.toString());
        }
    }
}
