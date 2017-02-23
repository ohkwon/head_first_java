import java.util.*;

public class DotCom {
  private String name;
  private ArrayList<String> locationCells;

  public void setLocationCells(ArrayList<String> loc) {
    locationCells = loc;
  }

  public void setName(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public String checkYourself(String userGuess) {
    String result = "miss";
    if (locationCells.contains(userGuess)) {
      locationCells.remove(userGuess);
      if (locationCells.isEmpty()) {
        result = "kill";
        System.out.println("You sunk " + name + "  : ( ");
      } else {
        result = "hit";
      }
    }
    return result;
  }
}