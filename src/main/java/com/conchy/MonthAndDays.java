package com.conchy;

public class MonthAndDays {

    public static String getMonth(int month) {
        String monthName;  
        int daysOfTheMonth;

        switch (month) {
            case 1:
                monthName = "Enero";
                daysOfTheMonth = 31;
                break;

            case 2:
                monthName = "Febrero";
                daysOfTheMonth = 28;
                break;

            case 3:
                monthName = "Marzo";
                daysOfTheMonth = 31;
                break;

            case 4:
                monthName = "Abril";
                daysOfTheMonth = 30;
                break;

            case 5:
                monthName = "Mayo";
                daysOfTheMonth = 31;
                break;

            case 6:
                monthName = "Junio";
                daysOfTheMonth = 30;
                break;

            case 7:
                monthName = "Julio";
                daysOfTheMonth = 31;
                break;

            case 8:
                monthName = "Agosto";
                daysOfTheMonth = 31;
                break;

            case 9:
                monthName = "Septiembre";
                daysOfTheMonth = 30;
                break;

            case 10:
                monthName = "Octubre";
                daysOfTheMonth = 31;
                break;

            case 11:
                monthName = "Noviembre";
                daysOfTheMonth = 30;
                break;

            case 12:
                monthName = "Diciembre";
                daysOfTheMonth = 31;
                break;

            default:
                monthName = "Mes inválido";
                daysOfTheMonth = 0;
                break;
        }

        if (daysOfTheMonth > 0) {
            return "El mes de " + monthName + " tiene " + daysOfTheMonth + " días.";
        } else {
            return monthName;
        }
    }

    public static void main(String[] args) {
        int month = 5; // Puedes cambiar este número para probar con otros meses
        System.out.println(getMonth(month));
    }
}
