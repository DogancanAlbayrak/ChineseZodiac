import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        int year, data;
        boolean isError = false;
        String sign = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : "); //We ask the user to enter their birth year.
        year = input.nextInt();

        if (year < 1 || year > 9999) { //We want the value entered by the user to be between 1 and 9999.
            isError = true;
        }
        data = year % 12;
        //We calculate the Chinese zodiac sign based on the year entered by the user.
        if (data == 0) {
            sign = "Maymun";
        }
        if (data == 1) {
            sign = "Horoz";
        }
        if (data == 2) {
            sign = "Köpek";
        }
        if (data == 3) {
            sign = "Domuz";
        }
        if (data == 4) {
            sign = "Fare";
        }
        if (data == 5) {
            sign = "Öküz";
        }
        if (data == 6) {
            sign = "Kaplan";
        }
        if (data == 7) {
            sign = "Tavşan";
        }
        if (data == 8) {
            sign = "Ejderha";
        }
        if (data == 9) {
            sign = "Yılan";
        }
        if (data == 10) {
            sign = "At";
        }
        if (data == 11) {
            sign = "Koyun";
        }
        if (isError) { //The error message received when the user enters an invalid date.
            System.out.print("Hatalı Giriş Yaptınız. Lütfen geçerli bir yıl giriniz.");
        } else { //The Chinese zodiac sign message received when the user enters the correct date.
            System.out.print("Çin Zodyağı Burcunuz : " + sign);
        }
    }
}
