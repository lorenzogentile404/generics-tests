package hierarchy;

public class Cat extends Animal {
  public Cat(String name) { super(name); }

  public String talk() {
    return "Meow";
  }
}