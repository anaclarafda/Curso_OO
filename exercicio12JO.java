import javax.swing.JOptionPane;

public class exercicio12JO {
    public static void main(String[] args)
{
    String value = JOptionPane.showInputDialog(null, "age");
    int number = Integer.parseInt(value);
    int total = 0;
    int cont = 0;

    while (number != -1)
    {
        total = total + number;
        cont ++;
        value = JOptionPane.showInputDialog(null, "age");
        number = Integer.parseInt(value);
    }
    JOptionPane.showMessageDialog(null,total / cont);
}   

}
