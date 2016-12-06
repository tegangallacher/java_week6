import static org.junit.Assert.*;
import org.junit.*;

public class PersonTest{
  Person person;
  Coffee coffee;
  Wine wine;

  @Before 
  public void before() {
    person = new Person("Tegan");
    coffee = new Coffee();
    wine = new Wine();
  }

  @Test
  public void hasName() {
    assertEquals("Tegan", person.getName()); 
  }

  @Test
  public void startsDayWithNoDrink() {
    assertEquals(0, person.drinkCount());
  }

  @Test
  public void canDrinkCoffee() {
    person.drink(coffee);
    assertEquals(1, person.drinkCount());
  }

  @Test
  public void startNewDayNeedingDrink() {
    person.drink(coffee);
    assertEquals(1, person.drinkCount());
    person.newDay();
    assertEquals(0, person.drinkCount());
  }

  @Test
  public void canDrinkWine() {
    person.drink(wine);
    assertEquals(1, person.drinkCount());
  }

  @Test 
  public void canThrowUp() {
    person.drink(wine);
    Drinkable drink = person.throwUp();
    Wine original = (Wine)drink;
    assertEquals("wooooo I'm getting drunk", original.topUp());
  }

}
