package ru.netology.services;

public class VacationService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int balance = 0;
        int vacationMonths = 0;

        for (int month = 1; month <= 12; month++) {
            if (balance >= threshold) {
                vacationMonths++;
                System.out.println("Месяц " + month + ". Денег " + balance + ". Буду отдыхать. Потратил -" + expenses + ", затем ещё -" + income);
                balance -= expenses;
                balance -= income; // Assume the entire income is spent during vacation
            } else {
                System.out.println("Месяц " + month + ". Денег " + balance + ". Придётся работать. Заработал +" + income + ", потратил -" + expenses);
                balance += income - expenses;
            }
        }

        return vacationMonths;
    }
}
