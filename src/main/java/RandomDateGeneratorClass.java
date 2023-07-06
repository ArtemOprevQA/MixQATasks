
public class RandomDateGeneratorClass {

    public static int randomMonth;

    public static void main(String[] args) {
        System.out.println(GeneratorOfRandomYear());
        System.out.println(GeneratorOfRandomMonth());
        System.out.println(GeneratorOfRandomDay());
    }

    public static int GeneratorOfRandomYear() {

        int randomYear;

        randomYear = (int) (1942 + Math.random() * 99);

        return randomYear;
    }

    public static int GeneratorOfRandomMonth() {

        int randomMonth;

        randomMonth = (int) (1 + Math.random() * 12);

        return randomMonth;
    }

    public static int GeneratorOfRandomDay() {

        int randomDay;

        randomMonth = (int) (1 + Math.random() * 12);

        if (randomMonth == 1 ||
                randomMonth == 3 ||
                randomMonth == 5 ||
                randomMonth == 7 ||
                randomMonth == 8 ||
                randomMonth == 10 ||
                randomMonth == 12) {
            randomDay = (int) (1 + Math.random() * 31);
        } else {
            randomDay = (int) (1 + Math.random() * 30);
        }
        return randomDay;
    }
}


