import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import ru.netology.services.VacationService;

public class VacationServiceTest {

    @Test
    public void calculateVacationMonths() {
        VacationService service = new VacationService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int expectedVacationMonths = 12;
        int actualVacationMonths = service.calculateVacationMonths(income, expenses, threshold);

        assertEquals(expectedVacationMonths, actualVacationMonths);
    }

}
