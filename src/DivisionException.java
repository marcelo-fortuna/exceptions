public class DivisionException extends Exception {

    public DivisionException() {
        super("O valor de A não pode ser NEGATIVO.");
    }

    public DivisionException(boolean b) {
        super("O valor de B não pode ser maior que 100.");
    }

    public DivisionException(int ab) {
        super("O valor de A não pode ser igual a B.");
    }
}
