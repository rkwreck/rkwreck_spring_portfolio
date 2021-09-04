public class rini_minilab {
    public static void main(String[] args) {
        double grade1 = 99.00;
        double grade2 = 77.00;
        double grade3 = 69.00;
        double grade4 = 88.00;
        double grade5 = 95.00;
        double avg12 = (grade1 + grade2) / 2;
        double avg34 = (grade3 + grade4) / 2;
        double finalAvg = (avg12 + avg34 + grade5 / 2) / 3;
        System.out.println("The average of grades 1 and 2 is " + avg12);
        System.out.println("The average of grades 3 and 4 is " + avg34);
        System.out.println("The final average is " + finalAvg);
    }
}