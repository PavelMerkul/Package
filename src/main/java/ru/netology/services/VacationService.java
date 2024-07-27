package ru.netology.services;

public class VacationService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int balance = 0;
        int vacationMonths = 0;

        for (int month = 1; month <= 12; month++) {
            if (balance >= threshold) {
                vacationMonths++;
                balance -= expenses;
                balance -= income;
            } else {
                balance += income - expenses;
            }
        }

        return vacationMonths;
    }
}