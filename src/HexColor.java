import java.util.Scanner;


public class HexColor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter red(0-255)");
        String r = calc(check());
        System.out.println("Enter green(0-255)");
        String g = calc(check());
        System.out.println("Enter blue(0-255)");
        String b = calc(check());
        System.out.println("HEX: #" + r + g + b);
    }

    static int check() {
        Scanner in = new Scanner(System.in);
        int num = 0;
        boolean bool = false;
        do {
            String str = in.nextLine();
            try {
                num = Integer.parseInt(str);
                if (num >= 0 && num <= 255) {
                    bool = false;
                } else {
                    System.out.println("Введите число от 0 до 255");
                    bool = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите число от 0 до 255");
                bool = true;
            }
        } while (bool);
        return num;
    }

    static String calc(int num) {
        int first = num / 16;
        int firtsAns = num % 16;
        int secondAns = first % 16;
        return translation(secondAns) + translation(firtsAns);
    }
    static  String translation(int num){
        String str;
        if(num == 10){
            str = "A";
        } else if(num == 11){
            str = "B";
        } else if(num == 12){
            str = "C";
        } else if(num == 13){
            str = "D";
        } else if(num == 14){
            str = "E";
        } else if(num == 15){
            str = "F";
        } else {
            str = Integer.toString(num);
        }
        return str;
    }
}