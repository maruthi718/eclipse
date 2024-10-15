package pac1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class TrainingEndDateCalculator {

    public static void main(String[] args) {
        
        LocalDate startDate = LocalDate.of(2024, 9, 25);
        int trainingDays = 50;
        
       
        System.out.println("Start date of training: " + startDate);
        
        
        LocalDate endDate = calculateEndDate(startDate, trainingDays);

        
        System.out.println("End date of training (excluding weekends): " + endDate);
    }

    
    public static LocalDate calculateEndDate(LocalDate startDate, int trainingDays) {
        LocalDate currentDate = startDate;
        int workingDaysAdded = 0;

        
        while (workingDaysAdded < trainingDays) {
            
            currentDate = currentDate.plusDays(1);

           
            if (!(currentDate.getDayOfWeek() == DayOfWeek.SATURDAY || currentDate.getDayOfWeek() == DayOfWeek.SUNDAY)) {
                workingDaysAdded++;
            }
        }
        return currentDate;
    }
}