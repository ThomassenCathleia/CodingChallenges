package codewars.kyu8;

public class Hello{
  public String sayHello(String [] name, String city, String state){
    return String.format("Hello, %s! Welcome to %s, %s!", String.join(" ",name), city,state);
  }
}
