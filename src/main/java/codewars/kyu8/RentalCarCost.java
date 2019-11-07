package codewars.kyu8;

public class RentalCarCost {
  public static int rentalCarCost(int d) {
    int cost = d * 40;
    if (d >= 7) {
      cost -= 50;
    } else if (d >= 3) {
      cost -= 20;
    }
    return cost;
  }
}
