package com.basics.strings;

public class ReportGenerator {
    public static void main(String[] args) {
        // this will change the same object values
        StringBuilder report= new StringBuilder();
        for(int i=1; i<=5; i++){
            report.append("student")
                    .append(i)
                    .append("-passed \n");
        }
        System.out.println(report);
    }
}
