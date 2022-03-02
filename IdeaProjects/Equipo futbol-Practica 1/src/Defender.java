public class Defender extends Player {
    String role = "Defender";

    public Defender(String name, String nationality, int age, int number) {
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
    public void build_play() {
        System.out.println("You're building the play");
    }
    public void assist() {
        System.out.println("You made an assist");
    }
}
