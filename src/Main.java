import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(permisson(generateRandomAge(), -12));
        System.out.println(permisson(generateRandomAge(), 38));
        System.out.println(permisson(generateRandomAge(), -10));
        System.out.println(permisson(generateRandomAge(), 5));
        System.out.println(permisson(generateRandomAge(), 29));

    }


    public static String permisson(int age, int temperature){
        if (20<=age && age<=45 && -20<=temperature && temperature<=30){
            return "Можно идти гулять";
        }
        else if (age<20 && 0<=temperature && temperature<=28){
            return "Можно идти гулять";
        }
        else if (age>45 && -10<=temperature && temperature<=25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge(){
        Random rand = new Random();
        int randomAge = rand.nextInt(0,120);
        return randomAge;
    }
}