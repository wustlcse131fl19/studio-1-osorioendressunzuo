package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args){
        ArgsProcessor ap = new ArgsProcessor(args);
        double s0 = ap.nextDouble("What is the first number?");
        double s1 = ap.nextDouble("What is the second number?");
        double average= (s0+s1)/2;
        System.out.println("The average of "+s0+" and "+s1+" is "+average);

    }
}
//Sample output: Average of 5 and 6 is 5.5.
//
//Note that the output is specified as a double, because the average of two integers is not necessarily an integer.