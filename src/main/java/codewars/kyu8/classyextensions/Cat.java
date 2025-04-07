package codewars.kyu8.classyextensions;

public class Cat extends Animal {
  public Cat(String name) {
    super(name);
  }

  public String speak() {
    return super.name + " meows.";
  }
}