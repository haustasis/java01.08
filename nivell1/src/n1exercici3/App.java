package n1exercici3;

public class App {

    public static void main(String[] args) {

        StrReverse strR1 = str -> {
            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
                result += str.charAt(i);
            return result;
        };

        System.out.println(strR1.reverse("itacademy"));

    }

}
