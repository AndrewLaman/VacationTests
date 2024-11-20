public class VacationManager {
    public int calcBonus(int income, int expenses, int threshold) {
        int months = 0;
        for (int month = 0; month < 12; month++) {
            int balance = 0;
            balance += income - expenses;
            if (threshold <= balance) {
                months++;
            }
        }

        return months;
    }
}

