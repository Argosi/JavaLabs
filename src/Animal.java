public class Animal {
    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    void Message(){
        System.out.println("This animal");
    }
}
class Mammal
{
    void Message1() {
        System.out.println("This mammal");

    }
}
class App {
    public static void main(String[] args){
      Animal dog = new Animal( "Jack", 5 );
      Animal cat = new Animal( "Barsik", 18 );

        System.out.println(dog.name);
        System.out.println(dog.age);

        System.out.println(cat.name);
        System.out.println(cat.age);
    }
}