package hierarchy;

// This can also be an interface if needed, the notation of generics is the same "extends"
public abstract class Animal {
  final String name;

  Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public abstract String talk();
}