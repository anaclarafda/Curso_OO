import java.util.Scanner;
import javax.swing.JOptionPane;

public class exercicio8 {
// programas para falar se é adulto, criança ou idoso
public static void main(String[] args)
{
String number = JOptionPane.showInputDialog(null);
int age = Integer.parseInt(number);

if(age <= 3) JOptionPane.showMessageDialog(null, "baby");

else if (age > 3 && age <= 14) JOptionPane.showMessageDialog(null, "kid");

else if (age > 14 && age <= 18) JOptionPane.showMessageDialog(null, "teenager");

else if (age > 18 && age < 60) JOptionPane.showMessageDialog(null, "adult");

else JOptionPane.showMessageDialog(null, "senior");
}
}