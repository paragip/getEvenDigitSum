public class getEvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-12345672));
    }

    public static int getEvenDigitSum (int number) {

        if (number < 0) {
            return -1;
        } else {

            int lastDigit;
            int sumOfEvenDigits = 0; //ez a cél

            while (number != 0) { // végigmegyünk a számjegyeken:
                lastDigit = number % 10; // kiemeljük az utolsó számjegyet
                if (lastDigit % 2 == 0) { // megnézzük hogy páros-e
                    sumOfEvenDigits += lastDigit; // ha páros, hozzáadjuk a gyűjtőhöz
                }
                number /= 10; // majd a számot osztjuk 10-zel, hogy egy helyiértékkel balra jussunk és az újabb utolsó számjegyet is meg tudjuk nézni
            }
            return sumOfEvenDigits;
        }

    }
}
