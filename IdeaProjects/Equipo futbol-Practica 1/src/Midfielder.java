public class Midfielder extends Player{
    String role = "Midfielder";

    public Midfielder(String name, String nationality, int age, int number) {
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
    public void defend() {
        System.out.println("You're defending");
    }
    public void open_ball() {
        System.out.println("You're opening the ball");
    }
}
