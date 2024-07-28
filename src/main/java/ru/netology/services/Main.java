package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();

        int income = 10_000; // доход в месяц
        int expenses = 3_000; // расход в месяц
        int threshold = 20_000; // ограничение

        int vacationMonths = service.calculateVacationMonths(income, expenses, threshold);

        System.out.println("Количество месяцев отпуска в следующем году: " + vacationMonths);
    }
}
