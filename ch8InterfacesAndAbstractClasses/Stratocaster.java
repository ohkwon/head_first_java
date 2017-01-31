class Stratocaster extends Guitar implements Lead {

  public static void main(String[] args) {
    Stratocaster strat = new Stratocaster();
    System.out.println("Instrument methods:\n");
    strat.playNote();
    System.out.println("\nGuitar methods:\n");
    strat.pluckString();
    strat.playStereoTypicalSong();
    System.out.println("\nStratocaster methods:\n");
    strat.playChimingCleans();
    System.out.println("\nLead methods:\n");
    strat.playSizzlingSolo();
    strat.takeSpotLight();
  }

  public void playChimingCleans() {
    System.out.println("Wonderful Clean Guitar sound: Chigachigachangchang");
  }


  // overriding interface methods
  public void playSizzlingSolo() {
    System.out.println("Playing typical rock guitar solo");
  }

  public void takeSpotLight() {
    System.out.println("Aside to bandmates: 'We wouldn't have all these fans if it weren't for me, so I get the spotlight'");
  }
}