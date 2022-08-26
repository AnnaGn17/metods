public class Main {

        public static int delivery (int distanse){
            int Distanse = distanse;
            int days = 1;
            int interval = 40;
            int startInterval = 20;
            if (distanse <= startInterval){
                days = 1;
            }
            else {
                days = days + (int) Math.ceil((distanse - startInterval) / (double)interval);
            }
            System.out.println("Потребуется " + days + " дней");
            return distanse;
        }
        public static int getClientOS (int OS, int Year){
            int tip = OS;
            int Android = 1;
            int IOS = 0;
            int YearNow = Year;
            if (tip == Android){
                System.out.print(" Установите для андроид ");
            }
            else {
                System.out.print("Установите для айфон ");
            }

            if (YearNow < 2015){
                System.out.println("облегчённую версию");
            }
            else {
                System.out.println("обычную версию");
            }
            return Year;

        }


        public static void checkingForALeapYear (int year){
            int Year = year;
            if (Year % 4 == 0 && Year != 0 || Year % 400 == 0) {
                System.out.println(year + " - високосный год");
            }
            else {
                System.out.println(year + " - не високосный год");
            }
        }

        public static void main(String[] args) {
            checkingForALeapYear(2022);

            getClientOS(0, 2022);

            delivery(150);
        }
}