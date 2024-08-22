// Pacote contabancariaexcecao
package contabancariaexcecao;

// Classe ContaBancaria
public class ContaBancaria {
    private double contaSaldo;

    // Construtor
    public ContaBancaria(double contaSaldoInicial) {
        this.contaSaldo = contaSaldoInicial;
    }

    // Método sacar com exceção personalizada
    public void sacar(double valor) throws InsuficienteFundsException {
        if (valor <= contaSaldo) {
            contaSaldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            throw new InsuficienteFundsException("Saldo insuficiente para realizar o saque de R$" + valor);
        }
    }

    // Método depositar
    public void depositar(double valor) {
        contaSaldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso. Saldo atual: R$" + contaSaldo);
    }

    // Método exibir saldo
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + contaSaldo);
    }
}