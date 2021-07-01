public class Spread{
  
  private Card[] cardSpread;
  private String[] spotNames;

  public Spread(int amount) {

    for (int i = 0; i < amount; i++) {

      spotNames[i] = "Card " + Integer.toString(i + 1);
    }

    setSpread();
  }

  public void setSpread() {
    
    for (int i = 0; i <= spotNames.length; i++) {
      cardSpread[i] = new Card();
    }
  }

  public Card[] getSpread() {
    return cardSpread;
  }

  public String[] getSpotNames() {
    return spotNames;
  }
}