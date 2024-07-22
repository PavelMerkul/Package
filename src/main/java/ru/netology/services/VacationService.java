package ru.netology.services;

public class VacationService {
    public int calculateVacationMonths(int income, int expense, int threshold) {
        int months = 0;
        int balance = 0;

        for (int i = 1; i <= 12; i++) {
            if (balance < threshold) {
                balance += income;
                balance -= expense;

                if (balance >= threshold) {
                    months++;
                    balance -= 3 * expense;
                }
            } else {
                months++;
                balance -= 3 * expense;
            }
        }

        return months;
    }
}
