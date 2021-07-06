class Main {

  public static void main(String[] args) {
    
    System.out.println();
    Spread mySpread = new Spread(3);

    for (int i = 0; i < 3; i++) {
      System.out.println(mySpread.getOneCard(i).getName());
      System.out.println(mySpread.getSpotNames()[i]);
      System.out.println();
    }
  }
}

