
// Exceção personalizada
package contabancariaexcecao;

public class InsuficienteFundsException extends Exception {
    public InsuficienteFundsException(String message) {
        super(message);
    }
}
