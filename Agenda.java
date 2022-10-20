import java.util.Scanner;

public class Agenda {
    private Scanner ler = new Scanner(System.in);
    private Scanner ler2 = new Scanner(System.in);

    private int tamanho;

    Contato[] contatos;

    public Agenda() {
        System.out.println("Qual a quantidade de contatos? ");
        tamanho = ler.nextInt();
        contatos = new Contato[tamanho];
        int op;

        do {

            System.out.println("-------- MENU ---------");
            System.out.println(" 1 - Cadastrar Contatos");
            System.out.println("2 - Exibir Contatos");
            System.out.println("3 - Procurar contato por nome");
            System.out.println("4 - Remover contato");
            System.out.println("5 - Sair");

            System.out.println("Digite a opcao do menu que deseja ser executada:");
            op = ler.nextInt();

            switch (op) {

                case 1:
                    cadastrarContato();
                    break;

                case 2:
                    exibirContatos();
                    break;

                case 3:
                    procurar();
                    break;

                case 4:
                    removerContato();
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;
            }

        } while (op != 5);

    }

    private void cadastrarContato() {
        Contato contato = new Contato();

        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = contato;
            }
        }
    }

    private void exibirContatos() {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                contatos[i].exibir();
            }

        }
    }

    private void procurar() {
        String n;
        int cont = 0;

        System.out.println("Digite o nome do contato que voce deseja procurar:");
        n = ler2.nextLine();

        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].getNome().equalsIgnoreCase(n)) {
                    System.out.println("O contato " + n + " esta cadastrado!!!");
                    break;
                } else {
                    cont++;
                }
            }
            if (contatos[i] == null) {
                cont++;
            }
        }
        if (cont == contatos.length) {
            System.out.println("O contato " + n + " nao esta no vetor!");
        }
    }

    private void removerContato() {
        String n;
        int cont = 0;

        System.out.println("Digite o nome do contato que voce deseja remover:");
        n = ler2.nextLine();

        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].getNome().equalsIgnoreCase(n)) {
                    contatos[i] = null;
                    System.out.println("O contato " + n + " foi removido!!!");
                    break;
                }
            }
        }
    }
}