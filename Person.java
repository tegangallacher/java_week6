public class Person {
  private String name;
  private Coffee[] cup;


  public Person(String name) {
    this.name = name;
    this.cup = new Coffee[8];
  }


  public String getName() {
    return this.name;
  }

  public int coffeeCount() { 
    int count = 0;
    for (Coffee coffee : cup) {
      if (coffee != null) {
        count++;
      }
    }
    return count;
  }

  public void drink(Coffee coffee) {
    if (cupFull()) {
      return;
    }
    int coffeeCount = coffeeCount();
    cup[coffeeCount] = coffee;
  }

  public boolean cupFull() {
    return coffeeCount() == cup.length;
  }

  public void newDay() {
    for (int i = 0; i < cup.length; i++) {
      cup[i] = null;
    }
  }

}