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


public class Guess_The_number_game {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            Game obj = new Game();

            while (true) {
                System.out.println("Enter a number between 1 to 100 (1-100): ");
                int user = scan.nextInt();
                obj.takeUserInput(user);

                if (obj.isCorrectNumber() == 0) {
                    obj.setguesses();
                    System.out.println("You Guessed it right. Congratulations!!");
                    obj.getNoOfGuess();
                    break;
                } else if (obj.isCorrectNumber() == -1) {
                    obj.setguesses();
                    System.out.println("The Number is larger");
                } else if (obj.isCorrectNumber() == 1) {
                    obj.setguesses();
                    System.out.println("The Number is smaller!");

                }
            }
            String s = "Would you like to play again ? (Y/N)";
            Scanner strscan = new Scanner(System.in);
            System.out.println(s);
            String co = strscan.nextLine();
            if ("Y".equals(co)) {
                continue;
            } else if ("N".equals(co)) {
                break;
            }
            else{
                System.out.println("You didn't choose either option! ENDING THE GAME...");
            }
        }
    }
}
