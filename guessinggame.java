import java.util.Random;
import java.util.Scanner;
public class guessinggame{
  public static void main(String[] args) {
    Random Randomnum= new Random();
    int guess=Randomnum.nextInt(100);
    int n=0; //n for trails
    Scanner scan=new Scanner(System.in);
    System.out.println("Guess a number between 1 to 100, You will have 10 trails!" );    
    int guess1;
    int i=0;
    boolean m=false;
    while(m==false) {
      guess1=scan.nextInt();
      n++;
    
    if(guess1==guess) {
      m=true;
    }
    else if(i>8){
      System.out.println("You loose! the right answer was: "+guess1);
      return;
    }
    else if(guess1<guess){
      i++;
      System.out.println("Yor Guess is lower than the right guess! Turns left: "+(10-i));
    }
    else if(guess1>guess) {
      i++;
      System.out.println("Your Guess Is Higher Than THe Right Guess! Turns left: "+(10-i));
      
    }
  }
    System.out.println("CONGRATULATIONS");
    System.out.println("The number is "+guess);
}
}