package hierarchy;

public class Dog extends Animal {
  public Dog(String name) { super(name); }

  public String talk() {
    return "Woof";
  }
}