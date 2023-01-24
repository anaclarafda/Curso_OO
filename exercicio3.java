import java.util.Scanner;
public class exercicio3
 {
    
    public static void main(String[] args) {

        try (Scanner keyboard = new Scanner (System.in)) {
          int value=keyboard.nextInt();
          int fifth=0;
          int twentyfive=0;
          int ten=0;
          int five=0;
          int one=0;
          if(value/50>0)
          {
             fifth= value/50;
             value=value-(50*fifth);
          }

          if(value/25>0)
          {
             twentyfive= value/25;
             value=value-(25*twentyfive);
          }

          if(value/10>0)
          {
             ten= value/10;
             value=value-(10*ten);
          }

          if(value/5>0)
          {
             five= value/5;
             value=value-(5*five);
          }
           
          if(value/1>0)
          {
             one= value;
             
          }
          System.out.println("50= "+ fifth);
          System.out.println("25= "+ twentyfive);
          System.out.println("10= "+ ten);
          System.out.println("5= "+ five);
          System.out.println("1= "+ one);
        }
      }
}
