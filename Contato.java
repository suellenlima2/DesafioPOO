import java.util.Scanner;

public class Contato {
    private Scanner ler = new Scanner(System.in);

    private String nome;
    private String apelido;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Contato() {
        System.out.println("Digite o nome:");
        nome = ler.nextLine();
        System.out.println("Digite o apelido:");
        apelido = ler.nextLine();
        System.out.println("Digite o numero de telefone:");
        telefone = ler.nextLine();
        System.out.println("Digite o email:");
        email = ler.nextLine();
        endereco = new Endereco();
    }

    void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Apelido: " + apelido);
        System.out.println("Telefone: " + telefone);
        System.out.println("E-mail: " + email);
        endereco.exibir();
    }

    public String getNome() {
        return nome;
    }

}
