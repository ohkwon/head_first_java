import java.util.*;

class DotComBust {
  private GameHelper helper = new GameHelper();
  private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
  private int guessCount = 0;

  public static void main(String[] args) {
    DotComBust game = new DotComBust();
    game.setUpGame();
    game.startPlaying();
  }

  void setUpGame() {
    DotCom first = new DotCom();
    first.setName("dinner.com");
    DotCom second = new DotCom();
    second.setName("plz.com");
    DotCom third = new DotCom();
    third.setName("den.com");
    dotComList.add(first);
    dotComList.add(second);
    dotComList.add(third);
    for (DotCom currentCom : dotComList) {
      ArrayList<String> inputList = helper.locationCreate(3);
      currentCom.setLocationCells(inputList);
    }
  }

  void startPlaying() {
    while(!dotComList.isEmpty()) {
      String userGuess = helper.getInput("Input a guess (ie. C5, D1): ");
      checkUserGuess(userGuess);
    }
    finishGame();
  }

  void checkUserGuess(String userGuess) {
    guessCount++;
    String result = "miss";
    for (DotCom currentCom : dotComList) {
      result = currentCom.checkYourself(userGuess);
      if (result.equals("hit")) {
        break;
      }
      if (result.equals("kill")) {
        dotComList.remove(currentCom);
        break;
      }
    }
    System.out.println(result);
  }

  void finishGame() {
    System.out.println("Game over!");
    if (guessCount < 13) {
      System.out.println("You beat the game in " + guessCount + " guesses! Great Job!");
    } else {
      System.out.println("You beat the game in " + guessCount + " guesses! Not too good...");
    }
  }
}