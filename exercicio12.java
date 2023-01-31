import java.util.Scanner;

public class exercicio12 {
    
public static void main(String[] args)
{
  String number;
  Scanner keyboard = new Scanner (System.in);
  int value = keyboard.nextInt();
  int total = 0;
  int cont = 0;

  if(value != -1)
  while(value != -1)
  {
       total = value + total;
       cont++;
       value = keyboard.nextInt();

  }
  System.out.println(total/cont);
}
}
