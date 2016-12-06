import java.util.*;

public class Person {
  private String name;
  private ArrayList<Drinkable> cup;


  public Person(String name) {
    this.name = name;
    this.cup = new ArrayList<Drinkable>();
  }


  public String getName() {
    return this.name;
  }

  public int drinkCount() { 
    return cup.size();
  }

  public void drink(Drinkable drink) {
    cup.add(drink);
  }

  public void newDay() {
    cup.clear();
  }

}