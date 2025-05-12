class Person {
    public String Pname;
    public int P_age;

    public Person(String name, int age) {
        Pname = name;
        P_age = age;
    }

    public void Work() {
        System.out.println(Pname + " Works");
    }
}
public class main {
    public static void main(String[] args) {
        Person person1 = new Person("Rahim", 18);
        Person person2 = new Person("Karim", 20);

        System.out.println(person1.Pname + " " + person1.P_age);
        System.out.println(person2.Pname + " " + person2.P_age);

        person2.Work(); 
    }
}
