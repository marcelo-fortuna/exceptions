import javax.swing.*;

/**
 * Class created to evidence the treatment of exceptions with the clause try... catch... throws
 * @author Marcelo Fortuna
 * @since 07/12/2023
 */
public class Division {

    public static void main(String[] args) {
        int a,b,r=0;


        try {
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor de A","Inserção de valores", JOptionPane.PLAIN_MESSAGE));
            b = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o valor de B","Inserção de valores", JOptionPane.PLAIN_MESSAGE));

            r = division(a, b);
            System.out.println("Resultado: " + r);
        } catch (DivisionException | NumberFormatException | ArithmeticException ex) {
            if(ex.toString().contains("/ by zero")) {
                JOptionPane.showMessageDialog(null, "Não é possível dividir um número por ZERO.");
            } else if (ex.toString().contains("For input string: \"")) {
                JOptionPane.showMessageDialog(null, "Insira apenas números.");
            } else if (ex.toString().contains("NEGATIVO")) {
                JOptionPane.showMessageDialog(null, "O valor de A não pode ser negativo.");
            } else if (ex.toString().contains("maior")) {
                JOptionPane.showMessageDialog(null, "O valor de B não pode ser maior que 100.");
            } else if (ex.toString().contains("igual")) {
                JOptionPane.showMessageDialog(null, "O valor de A não pode ser igual a B.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static int division(int a, int b) throws DivisionException {
        if (a < 0)
            throw new DivisionException();
        if (b > 100)
            throw new DivisionException(true);
        if (a == b)
            throw new DivisionException(400);

        return a / b;
    }

}
