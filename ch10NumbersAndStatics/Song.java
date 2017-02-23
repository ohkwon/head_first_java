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