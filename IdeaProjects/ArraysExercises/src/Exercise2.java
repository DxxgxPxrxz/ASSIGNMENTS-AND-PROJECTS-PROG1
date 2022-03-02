
public class Exercise2 {
    public static void main(String[] args){
        int numbers_origin[] = new int[100];
        int numbers_destination[] = new int[numbers_origin.length];
        int count = 0;
        for (int i = 0; i < numbers_origin.length; i++){
            numbers_origin[i] = (int)(Math.random() * 100+1);
            if(numbers_origin[i] > 25 && numbers_origin[i] % 2 == 0){
                numbers_destination[count] = numbers_origin[i];
                count++;
            }
        }
        System.out.println("Show origin array");
        for(int i = 0; i < numbers_origin.length; i++){
            System.out.println(numbers_origin[i]);
        }
        System.out.println("Show destination array");
        for(int i = 0; i < count; i++){
            System.out.println(numbers_destination[i]);
        }
    }
}

