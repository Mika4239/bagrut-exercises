package bagtut_ex.bagrut2016.Ex3;

import java.util.Scanner;

public class Main {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        TvWeek tvWeek = new TvWeek();
        TvProgram program;
        int code, day;
        boolean isSport;
        System.out.println("Enter code, day and if it's sport program for the tv program: ");
        code = reader.nextInt();
        day = reader.nextInt();
        isSport = reader.nextBoolean();
        program = new TvProgram(code, day, isSport);
        tvWeek.addTvProgram(program);
        System.out.println("\ncurrent: " +tvWeek.getCurrent());
        System.out.println("\nsport programs: " +tvWeek.sportPrograms());
    }
    
}
