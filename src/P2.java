public class P2 {
    public static void main(String[] args){
        Dog one = new Dog( "Default", 0);
        pitomniksobak pitomnik = new pitomniksobak();
        one.setAge(12);
        one.setName("Bobbi");
        pitomnik.addDog(1,one);
        pitomnik.Test(one);
        System.out.println("human age" + one.Humanage());
    }

}
class Dog {

    String name;

    int age;


    Dog(String name, int age) {

        this.name = name;

        this.age = age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int Humanage() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
    class  pitomniksobak{
        Dog[] sobaki = new Dog[5];
        public void addDog(int i, Dog dog){
            sobaki[i] = dog;
        }
        public void Test(Dog dog){
            System.out.println(dog.toString());
        }
    }


