// Classe Main para teste
package contabancariaexcecao;

public class Main {

    public static void main(String[] args) {
        // Exemplo de uso da ContaBancaria
        ContaBancaria conta = new ContaBancaria(1000.00); // Saldo inicial de R$ 1000.00

        try {
            conta.sacar(500.0); // Tentativa de saque de R$ 2000.00
        } catch (InsuficienteFundsException e) {
            System.out.println(e.getMessage());
        }

        conta.depositar(50.0); // Depósito de R$ 50.00
        conta.exibirSaldo(); // Exibe o saldo atualizado
    }
}