import java.util.Scanner;
public class game {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        While (true){
            System.out.print("Enter your move. Type rock, paper, or scissor");
            String mymove = in.nextLine();

            if (mymove.equals("quite")){
                break;
            }



            if (mymove != "rock" && mymove != "paper" && mymove != "scissor"){
                System.out.println("Invalid move");
            }else {
                int rand = (int) (Math.random() * 3);
                String opponentmove = "";
                if (rand == 0){
                    opponentmove = "rock";
                } else if (rand == 1){
                    opponentmove = "paper";
                } else {
                    opponentmove = "scissor";
                }
                System.out.println("Computer move is: " + opponentmove);

                if (mymove == opponentmove){
                    System.out.println("You tied");
                }else if ((mymove.equals("rock")) && (opponentmove.equals("paper"))
                        || (mymove.equals("scissor")) && (opponentmove.equals("paper"))
                        || (mymove.equals("paper")) && (opponentmove.equals("rock"))) {
                    System.out.println("You win");
                }else{
                    System.out.println("You lose");
                }
            }
        }
        System.out.println("Thanks for playing ^_^)");
    }
}
