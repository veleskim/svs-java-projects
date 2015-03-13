public class YearlyDays {

    static int year = 2015;
    int monthDays[] = new int[13];

    static int countDays(int month, int year) {
        int count = -1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                if (year % 4 == 0) {
                    count = 29;
                } else {
                    count = 28;
                }
                if ((year % 100 == 0) & (year % 400 != 0)) {
                    count = 28;
                }
        }
        return count;
    }

    public static void main(String[] args) {
        YearlyDays yd = new YearlyDays();
        int sumDays = 0;

        for (int i = 0; i < 12; i++) {
            yd.monthDays[i + 1] = YearlyDays.countDays(i + 1, year);
        }

        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= yd.monthDays[i]; j++) {
                sumDays++;
            }
        }

        String[] dates = new String[sumDays];

        int k = 0;
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= yd.monthDays[i]; j++) {
                dates[k] = j + "-" + i + "-" + Integer.toString(YearlyDays.year);
                k++;
            }
        }
        for (int i = 0; i < sumDays; i++) {
            System.out.println(dates[i]);
        }
    }

}
