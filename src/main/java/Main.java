import ru.netology.services.VacationService;

public class Main {
    public static void main(String[] args) {
        int income = 100_000; // доход в месяц
        int expenses = 60_000; // расход в месяц
        int threshold = 150_000; // остаток на счету

        VacationService service = new VacationService();
        int vacationMonths = service.calculateVacationMonths(income, expenses, threshold);

        System.out.println("Количество месяцев отпуска в следующем году: " + vacationMonths);
    }
}
