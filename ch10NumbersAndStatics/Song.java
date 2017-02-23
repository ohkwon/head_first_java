public class Song {
  // class will have mix of regular (non-static) and static methods

  // regular methods use instance variables, such as this
  String title;


  // constructor method;
  public Song(String t) {
    title = t;
  }

  public void play() {
    SoundPlayer player = new SoundPlayer();
    // this uses the instance varialbe "title" so it is a non-static variable
    // static methods can't use non-static methods
    player.playSound(title);
  }

  public static void main(String[] args) {
    Song newSong = new Song("Don't Stop");
    // call a non-static method by calling the reference variable for an instance of the class and calling the non-static method on that reference variable
    newSong.play();
    // call a static method by calling the static method on the class it's from
    StaticMethodClass.min(5, 8);
  }
}

class StaticMethodClass {

  // this method does not use any instance variables, only a 
  public static int min(int a, int b) {
    if (a <= b) {
      return a;
    } else {
      return b;
    }
  }
}

// class to supplement play method in Song class
class SoundPlayer {

  // doesn't use an instance variable, but is a side method, not the purpose of the demonstration of this
  public void playSound(String title) {
    System.out.println(title);
  }
}

// this class is to demonstrate static variables
class Duck {
  private int size;

  // static variable keeps the same value for all classes. it's a shared variable. 
  private static int duckCount = 0;

  // once a variable (both static and non-static), methods, and class are labeled FINAL, it can never be chantged
  final static float pi = 3.14159;

  public Duck() {
    // constructor, each time a new instance of the class is created, the variable duckCount increases by 1
    duckCount++;
  }

  public void setSize(int s) {
    size = s;
  }

  public int getSize() {
    return size;
  }
}