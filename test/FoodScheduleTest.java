import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FoodScheduleTest {
    @Test
    public void testFoodAccess() {
        FoodSchedule schedule = FoodSchedule.TUESDAY;
        System.out.print(Arrays.toString(schedule.getFoods()));
        schedule.setFoods("Peperoni");
        System.out.println(Arrays.toString(schedule.getFoods()));
        FoodSchedule schedule1 = FoodSchedule.FRIDAY;
        System.out.println(Arrays.toString(schedule1.getFoods()));
        System.out.println(Arrays.toString(FoodSchedule.values()));
        FoodSchedule schedule2 = FoodSchedule.WEDNESDAY;

    }
}