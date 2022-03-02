public class Goalkeeper extends Player{
    String role = "Goalkeeper";

    public Goalkeeper(String name, String nationality, int age, int number) {
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
    public void save() {
        System.out.println("You're saving a shot");
    }
    public void start_play() {
        System.out.println("You're starting the play");
    }
}
