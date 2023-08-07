import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

     Game(){
        Random rand = new Random();
        this.number =rand.nextInt(100) ;
    }
    void takeUserInput(){
        System.out.println("Guess The Number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.format("Yes You Guessed it right, it was %d\n You Guessed it in %d attempts " ,number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }
}
public class Guess_The_Number {
    public static void main(String[] args) {
       Game g = new Game();
       boolean b=false;
       while(!b) {
           g.takeUserInput();
           b = g.isCorrectNumber();
       }
    }
}
