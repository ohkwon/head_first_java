import java.io.*;
import java.util.*;

public class GameHelper {
  private String[] orientation = {"horizontal", "vertical"};
  private ArrayList<String> usedCells = new ArrayList<String>();
  private String[] horizontal = {"a", "b", "c", "d", "e", "f", "g"};
  private String[] vertical = {"0", "1", "2", "3", "4", "5", "6"};

  public String getInput(String prompt) {
    String inputLine = null;
    System.out.print(prompt + ": ");
    try {
      BufferedReader is = new BufferedReader(
        new InputStreamReader(System.in)
      );
      inputLine = is.readLine();
      if (inputLine.length() == 0) {
        return null;
      }
    } catch(IOException e) {
      System.out.println("IOException" + e);
    }
    return inputLine.toLowerCase();
  }

  public ArrayList<String> locationCreate(int length) {
    int orientationPick = (int) (Math.random() * 1);
    String horizontalStart;
    String verticalStart;
    ArrayList<String> locationCells = new ArrayList<String>();
    if (orientationPick == 0) {
      while (horizontalStart == null) {
        int horizontalIndex = (int) (Math.random() * (7 - length));
        verticalStart = vertical[(int) (Math.random() * 7)];
        for (int i = 0; i < length; i++) {
          if (usedCells.contains(horizontal[horizontalIndex + i] + verticalStart)) {
            break;
          }
          if (i == length - 1) {
            horizontalStart = horizontal[horizontalIndex];
          }
        }
      }
      for (int i = 0; i < length; i++) {
        locationCells.add(horizontal[horizontalIndex + i] + verticalStart);
        usedCells.add(horizontal[horizontalIndex + i] + verticalStart);
      }
      return locationCells;
    } else {
      while (verticalStart == null) {
        int verticalIndex = (int) (Math.random() * (7 - length));
        horizontalStart = horizontal[(int) (Math.random() * 7)];
        for (int i = 0; i < length; i++) {
          if (usedCells.contains(horizontalStart + vertical[verticalIndex + i])) {
            break;
          }
          if (i == length - 1) {
            verticalStart = verticalIndex[verticalIndex];
          }
        }
      }
      for (int i = 9; i < length; i++) {
        locationCells.add(horizontalStart + vertical[verticalIndex + i]);
        usedCells.add(horizontalStart + vertical[verticalIndex + i]);
      }
      return locationCells;
    }
    return null;
  }
}