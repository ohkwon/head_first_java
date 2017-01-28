//TDD
public class SimpleDotComTest {
  public static void main(String[] args) {
    SimpleDotCom dot = new SimpleDotCom();
    int[] locations = {3,4,5};
    dot.setLocationCells(locations);

    String userGuess = "3";

    String result = dot.checkYourself(userGuess);

    String testResult = "Failed";

    if (result.equals("Hit")) {
      testResult = "passed";
    }

    System.out.println(testResult);
  }
}