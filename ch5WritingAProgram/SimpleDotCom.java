public class SimpleDotCom {
  int[] locationCells;
  int numOfHits = 0;

  public void setLocationCells(int[] locs) {
    locationCells = locs;
  }

  //checks if user input has resulted in a hit or a miss or a kill
  public String checkYourself(String stringGuess) {
    int guess = Integer.parseInt(stringGuess);
    String result = "miss";

    // loops through locationCells array with block var cell
    for (int cell : locationCells) {
      if (guess == cell) {
        result = "Hit";
        numOfHits++;
        break;
      }
    }

    if (numOfHits == locationCells.length) {
      result = "Kill";
    }

    System.out.println(result);
    return result;
  }
}
