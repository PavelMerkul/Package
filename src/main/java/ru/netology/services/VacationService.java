package ru.netology.services;

public class VacationService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int balance = 0;
        int vacationMonths = 0;

        for (int month = 1; month <= 12; month++) {
            if (balance >= threshold) {
                System.out.println("Месяц " + month + ". Денег " + balance + ". Буду отдыхать. Потратил -" + expenses + ", затем ещё -" + income);
                balance -= expenses;
                balance /= 3; // все потратил
                vacationMonths++;
            } else {
                balance += income;
                balance -= expenses;
                System.out.println("Месяц " + month + ". Денег " + balance + ". Придётся работать. Заработал +" + income + ", потратил -" + expenses);
            }
        }

        return vacationMonths;
    }
}
