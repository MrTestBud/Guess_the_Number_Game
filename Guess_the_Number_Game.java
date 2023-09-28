import java.util.Scanner;
class Game{
    private int compNumber;
    private int userinput;
    private int NoOfGuess;
    public Game(){
        compNumber = (int) (Math.random()*100);
    }
    public void takeUserInput(int n){
        userinput = n;
    }
    public int isCorrectNumber(){
        if (compNumber==userinput){
            return 0;
        }
        else if (compNumber > userinput){
            return -1;
        }
        else {
            return 1;
        }
    }
    public void setguesses(){
        NoOfGuess ++;
    }
    public void getNoOfGuess() {
        System.out.println("The number guesses took :" + NoOfGuess);

    }
}


public class Guess_the_Number_Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Game obj = new Game();

        while (true){
            System.out.println("Enter a number between 1 to 100 (1-100): ");
            int user = scan.nextInt();
            obj.takeUserInput(user);

            if (obj.isCorrectNumber() == 0 ){
                obj.setguesses();
                System.out.println(" Sahi hai");
                obj.getNoOfGuess();
                break;
            }
            else if (obj.isCorrectNumber() == -1) {
                obj.setguesses();
                System.out.println("Bada hai Num");
            }
            else if (obj.isCorrectNumber() == 1){
                obj.setguesses();
                System.out.println("Num Chota hai");
            }
        }
    }
}
