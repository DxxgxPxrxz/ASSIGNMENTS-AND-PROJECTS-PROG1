public class Striker extends Player{
    static String role = "Striker";

    public Striker(String name, String nationality, int age, int number) {
        super(name, nationality, age, number);
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.number = number;
    }

    public void give_data() {
        super.give_data(role);
    }
    public void give_name() {
        super.give_name(name);
    }
    public void give_number() {
        super.give_number(number);
    }
    public void attack() {
        System.out.println("You're attacking");
    }
    public void define() {
        System.out.println("You're defining");
    }
}
