import org.junit.jupiter.api.Test;
import ru.netology.services.VacationService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {

    @Test
    public void calculateVacationMonthsForLowIncome() {
        VacationService service = new VacationService();
        int income = 10_000; // доход в месяц
        int expenses = 3_000; // расход в месяц
        int threshold = 20_000;

        int expectedVacationMonths = 3;
        int actualVacationMonths = service.calculateVacationMonths(income, expenses, threshold);

        assertEquals(expectedVacationMonths, actualVacationMonths);
    }

}
