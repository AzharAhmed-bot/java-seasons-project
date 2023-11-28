public class YearRange {
    // class attributes
    int yearone;
    int yeartwo;
    int range;

    // Create a class constructor for the YearRange class
    public YearRange(int year1, int year2) {
        this.yearone = year1;
        this.yeartwo = year2;
    }
    //This setter method sets the value of a to the range
    public void setRangeType(int a) {
        this.range = a;
    }
    //This getter method prints all years set in the class constructor
    public void printYears() {
        for (int i = yearone; i <= yeartwo; i++) {
            System.out.println("Year " + i);
        }
    }
    //This first divisor gets all years divisible by 14 and 20
    public void getFirstDivisor() {
        for (int year = yearone; year <= yeartwo; year++) {
            if (year % 14 == 0 && year % 20 == 0) {
                System.out.println("Year " + year + " is divisible by 14 and 20.");
            }
        }
    }
    //  This second divisor gets all leap years
    public void getSecondDivisor() {
        for (int year = yearone; year <= yeartwo; year++) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println("Year " + year + " is a leap year");
            }
        }
    }
    //This gets the 1st year
    public int getFirstYear() {
        return yearone;
    }
    //This gets the 2st year
    public int getSecondYear() {
        return yeartwo;
    }

    public static void main(String[] args) {
        YearRange myFirstRange = new YearRange(1314, 2014);
        myFirstRange.setRangeType(1);

        YearRange mySecondRange = new YearRange(1100, 3150);
        mySecondRange.setRangeType(2);

        YearRange myThirdRange = new YearRange(1500, 1890);
        myThirdRange.setRangeType(3);

        System.out.println("List of all years divisible by 14 and 20:");
        myFirstRange.getFirstDivisor();

        System.out.println("List of all leap years between " + mySecondRange.getFirstYear() + " and " + mySecondRange.getSecondYear() + ":");
        mySecondRange.getSecondDivisor();

        System.out.println("List of all Olympic years between " + myThirdRange.getFirstYear() + " and " + myThirdRange.getSecondYear() + " that are divisible by 14 and 20:");
        myThirdRange.getFirstDivisor();
    }
}
