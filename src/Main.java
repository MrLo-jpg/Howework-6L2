import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Задача 1.
        int year = 2000;
        checkAndPrintYear(year);

    }

    private static void checkAndPrintYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год -високосный год");
        } else {
            System.out.println(year + "  год - невисокосный год");
        }
        //Задача 2
        int deviseYear = 2015;
        int clientOs = 1;

        System.out.println(getRecommentAppLicationVersion(2017, 1));
    }

    private static String getRecommentAppLicationVersion(int deviceYear, int clientOs) {
        String resultMessage = " Усановите ";
        if (isOldDevise(deviceYear)) {
            resultMessage += " lite ";
        }
        resultMessage += " версию для ";
        if (clientOs == 1) {
            resultMessage += " Android ";
        } else {
            resultMessage += " IOS ";
        }
        return resultMessage;
    }

    private static boolean isOldDevise(int deviseYear) {
        int currentYear = LocalDate.now().getYear();//2024
        return deviseYear < currentYear && deviseYear < 2015;


        //Задача 3.




            }
        }










