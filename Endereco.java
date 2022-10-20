import java.util.Scanner;

public class Endereco {
    private Scanner ler = new Scanner(System.in);
    private String rua;
    private String cidade;
    private String bairro;

    public Endereco() {
        System.out.println("Digite a cidade:");
        cidade = ler.nextLine();
        System.out.println("Digite o bairro:");
        bairro = ler.nextLine();
        System.out.println("Digite a rua: ");
        rua = ler.nextLine();
    }

    void exibir(){
        System.out.println("Cidade: "+cidade);
        System.out.println("Bairro: "+bairro);
        System.out.println("Rua: "+rua);
    }
}
