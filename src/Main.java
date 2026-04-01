import java.util.Scanner;
import model.Animal;
import model.Tutor;
import service.Clinica;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Clinica clinica = new Clinica();

        int opcao;

        do {
            System.out.println("\n=== Clínica Veterinária ===");
            System.out.println("1. Cadastrar tutor");
            System.out.println("2. Cadastrar animal");
            System.out.println("3. Listar animais");
            System.out.println("4. Listar tutores");
            System.out.println("5. Buscar animal");
            System.out.println("0. Sair");

            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome do tutor: ");
                    String nome = sc.nextLine();

                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();

                    Tutor tutor = new Tutor(nome, cpf, telefone);
                    clinica.cadastrarTutor(tutor);

                    System.out.println("Tutor cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do animal: ");
                    String nomeAnimal = sc.nextLine();

                    System.out.print("Raça: ");
                    String raca = sc.nextLine();

                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome do tutor: ");
                    String nomeTutor = sc.nextLine();

                    Tutor tutorEncontrado = null;

                    for (Tutor t : clinica.getTutores()) {
                        if (t.getNome().equalsIgnoreCase(nomeTutor)) {
                            tutorEncontrado = t;
                            break;
                        }
                    }

                    if (tutorEncontrado != null) {
                        Animal animal = new Animal(nomeAnimal, raca, idade, tutorEncontrado);
                        clinica.cadastrarAnimal(animal);
                        System.out.println("Animal cadastrado com sucesso!");
                    } else {
                        System.out.println("Tutor não encontrado!");
                    }

                    break;

                case 3:
                    clinica.listarAnimais();
                    break;

                case 4:
                    clinica.listarTutores();
                    break;

                case 5:
                    System.out.print("Informe o nome do animal: ");
                    String busca = sc.nextLine();

                    Animal encontrado = clinica.buscarAnimal(busca);

                    if (encontrado != null) {
                        System.out.println(encontrado);
                        System.out.println("Tutor: " + encontrado.getTutor().getNome());
                    } else {
                        System.out.println("Animal não encontrado.");
                    }

                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}