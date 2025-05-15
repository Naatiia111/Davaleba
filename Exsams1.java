public class Exsams1 {

    public static void main(String[] args) {
        halo("Natia");

        int x = 5;
        int y = 6;
        int sum = 5 + 6;

        System.out.println("Sum is: " + sum);

        double number = 36.75;
        System.out.println("Whole number: " + whole(number));

        int z = 56;
        int w = 88;
        max(z, w);

        String misalmeba = "gamarjoba";
        System.out.println("სიგრძე: " + Length(misalmeba));

        System.out.println("არის ლუწი: " + isEven(8));

        System.out.println(" 2 რიცვი: " + multiply(7, 8));
        System.out.println(" 3 რიცხვი: " + multiply(2, 3, 10));
    }


    public static void halo(String name) {
        System.out.println("hola, " + name);
    }


    public static int sum(int x, int y) {
        return x + y;
    }


    public static int whole(double number) {
        return (int) number;
    }


    public static void max (int z, int w) {
        if (z > w) {
            System.out.println("მაქსიმუმია: " + z);
        } else if (z < w) {
            System.out.println("მინიმუმია: " + w);
        } else {
            System.out.println("  ტოლია: " + z);
        }
    }


        public static int Length (String text){
            return text.length();
        }


        public static boolean isEven ( int number){
            return number % 2 == 0;
        }


        public static int multiply ( int a, int b){
            return a * b;
        }


        public static int multiply ( int a, int b, int c){
            return a * b * c;
        }


}