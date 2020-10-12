package newPackage;

public class Class11 {
    public static void main(String[] args) {
        String line = "упражнения Java!";
        /*Оригинальная строка = упражнения Java!
                Символ в позиции 0 является J
        Символ в позиции 10 это я*/
        int symb1 = line.charAt(0);
        int symb2 = line.charAt(10);
        String str3 = "Символ в позиции 0 является %d";
        String str4 = "Символ в позиции 10 это %d";

        System.out.println("Оригинальная строка = упражнения Java!");
        System.out.println(String.format(str3,symb1));

    }

}
