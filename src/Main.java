import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(), 55));
        System.out.println(permission(generateRandomAge(), 25));
        System.out.println(permission(generateRandomAge(), 20));
        System.out.println(permission(generateRandomAge(), -5));
        System.out.println(permission(generateRandomAge(), 35));
    }

    public static String permission(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
        (age < 20 && temperature >= 0 && temperature <= 28) ||
        (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else{
            return "Оставайтесь дома";
        }
    }

    // Метод для генерации случайного возраста от 1 до 100
    public static int generateRandomAge() {
        Random random = new Random();
        int NUM = random.nextInt(100);
        NUM += 1;
        return NUM;
    }
}

