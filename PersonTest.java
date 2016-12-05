import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PersonTest{
  Person person;
  Coffee coffee;

  @Before 
  public void before() {
    person = new Person("Tegan");
    coffee = new Coffee();
  }

  @Test
  public void hasName() {
    assertEquals("Tegan", person.getName()); 
  }

  @Test
  public void startsDayWithNoCoffee() {
    assertEquals(0, person.coffeeCount());
  }

  @Test
  public void canDrinkCoffee() {
    person.drink(coffee);
    assertEquals(1, person.coffeeCount());
  }

  @Test
  public void cannotRefillCoffeeWhenCupIsFull() {
    for (int i = 0; i < 10; i++) {
      person.drink(coffee);
    }
    assertEquals(8, person.coffeeCount());
  }

  @Test
  public void cupIsFull() {
    for (int i = 0; i < 8; i++) {
      person.drink(coffee);
    }
    assertEquals(true, person.cupFull());
  }

  @Test
  public void startNewDayNeedingCoffee() {
    person.drink(coffee);
    assertEquals(1, person.coffeeCount());
    person.newDay();
    assertEquals(0, person.coffeeCount());
  }

}
