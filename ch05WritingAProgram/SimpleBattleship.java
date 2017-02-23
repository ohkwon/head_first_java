public class SimpleBattleship {
  public static void main(String[] args) {
    SimpleDotCom newField = new SimpleDotCom();
    int startNum = (int) (Math.random() * 7);
    int[] locations = {startNum, startNum + 1, startNum + 2};
    newField.setLocationCells(locations);
    
    int guessCount = 0;
    String result = "";
    InputHelper input = new  InputHelper();

    while (result != "Kill") {
      String guess = input.getInput("Please guess the location of my battleship (0..9)");
      result = newField.checkYourself(guess);
      guessCount++;
    }

    System.out.println("You win!... after " + guessCount + " guesses.");
  }
}
