package Basic;

public class Switch {
    public static void main(String[] args) {
        int day = 4;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            default:
                dayName = "Invalid day!";
                break;
        }
        System.out.println(dayName);
    }
}
