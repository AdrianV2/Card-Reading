import java.util.HashSet;

public class Spread{
  
  private Card[] cardSpread;
  private String[] spotNames;

  // Initialize class
  public Spread(int amount) {
    setSpread(amount);
  }

  // Set value for cardSpread and spotNames variables
  public void setSpread(int amount) {

    cardSpread = new Card[amount];
    spotNames = new String[amount];

    HashSet<String> nameSet = new HashSet<String>();

    for (int i = 0; i < amount; i++) {

      Card addToSpread = new Card();

      while (!nameSet.add(addToSpread.getName())) {
        addToSpread = new Card();
      }

      cardSpread[i] = addToSpread;
      spotNames[i] = "Card " + String.valueOf(i + 1);
    }
  }

  public Card[] getSpread() {
    return cardSpread;
  }

  public Card getOneCard(int index) {
    return cardSpread[index];
  }

  public String[] getSpotNames() {
    return spotNames;
  }

  public String getOneSpotName(int index) {
    return spotNames[index];
  }

  public void setOneSpotName(int index, String name) {
    spotNames[index] = name;
  }
}