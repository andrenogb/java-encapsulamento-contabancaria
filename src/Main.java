import br.com.alura.contabancaria.ContaBancaria;

public class Main {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNumeroConta(9999);
        contaBancaria.setSaldo(9999);
        contaBancaria.titular = "André";

        contaBancaria.exibeInformacoes();
    }
}
