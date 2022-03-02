public class Player {
    String name;
    String nationality;
    int age;
    int number;

    public Player(String name, String nationality, int age, int number) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.number = number;
    }

    public void give_data(String role) {
        System.out.println("The name is: "+ name);
        System.out.println("The age is: " + age);
        System.out.println("The nationality is: " + nationality);
        System.out.println("The id is: "+ number);
        System.out.println("The role is: "+ role);
    }
    public void give_name(String name) {
        System.out.println("The name is: "+ name);
    }
    public void give_number(int number) {
        System.out.println("The number is: "+ number);
    }
    public void ball_control() {
        System.out.println("The ball has been controlled");
    }
    public void give_pass() {
        System.out.println("The ball has been passed");
    }
    public void shoot() {
        System.out.println("The ball has been shot");
    }


}
