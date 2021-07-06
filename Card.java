import java.lang.Math;

public class Card {

  private String name;
  private boolean reversed;

  // Initialize class
  public Card() {
    setCard();
  }

  // Set value for name and reversed variables
  public void setCard() {

    double random = Math.random();
    int number = (int)Math.floor(random * 36);
    int suit = (int)Math.floor(random * 4);
    reversed = ((int)Math.floor(random * 2)) == 0;

    switch (number){

      case 0:
        name = "Fool";
        break;
        
      case 1:
        name = "Magician";
        break;
        
      case 2:
        name = "High Priestess";
        break;
        
      case 3:
        name = "Empress";
        break;
        
      case 4:
        name = "Emporer";
        break;
        
      case 5:
        name = "Hierophant";
        break;
        
      case 6:
        name = "Lovers";
        break;

      case 7:
        name = "Chariot";
        break;
        
      case 8:
        name = "Justice";
        break;

      case 9:
          name = "Hermit";
          break;
        
      case 10:
        name = "Wheel of Fortune";
        break;
        
      case 11:
        name = "Strength";
        break;
        
      case 12:
        name = "Hanged Man";
        break;
        
      case 13:
        name = "Death";
        break;
        
      case 14:
        name = "Temperance";
        break;
        
      case 15:
        name = "Devil";
        break;
        
      case 16:
        name = "Tower";
        break;
        
      case 17:
        name = "Star";
        break;
        
      case 18:
        name = "Moon";
        break;
        
      case 19:
        name = "Sun";
        break;
        
      case 20:
        name = "Judgement";
        break;
        
      case 21:
        name = "World";
        break;

      case 22:
        name = "Ace of";
        break;
      
      case 23:
        name = "Two of";
        break;
      
      case 24:
        name = "Three of";
        break;

      case 25:
        name = "Four of";
        break;

      case 26:
        name = "Five of";
        break;

      case 27:
        name = "Six of";
        break;

      case 28:
        name = "Seven of";
        break;

      case 29:
        name = "Eight of";
        break;

      case 30:
        name = "Nine of";
        break;

      case 31:
        name = "Ten of";
        break;

      case 32:
        name = "Page of";
        break;

      case 33:
        name = "Knight of";
        break;
      
      case 34:
        name = "Queen of";
        break;

      case 35:
        name = "King of";
        break;
    }
    
    if (number > 21) {
      
      switch (suit) {

        case 0:
          name += " Wands";
          break;
      
        case 1:
          name += " Cups";
          break;
        
        case 2:
          name += " Pentacles";
          break;

        case 3:
          name += " Swords";
          break;
              
      }

    }

    if (reversed) {
      name += " Reversed";
    }
  }


  public String getName() {
    return name;
  }

  public boolean getReversed() {
    return reversed;
  }
}