package com.coder.myPrepJava;

public class task42 {
	static int calculateTotal(int java, int html, int css, int js, int sql) {
        return java + html + css + js + sql;
    }

    // Method to calculate average marks
    static double calculateAverage(int total) {
        return total / 5.0;
    }

    // Method to check result
    static String calculateResult(double average) {

        if (average >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int java = 85;
        int html = 80;
        int css = 75;
        int js = 90;
        int sql = 88;

        int total = calculateTotal(java, html, css, js, sql);

        double average = calculateAverage(total);

        String result = calculateResult(average);

        System.out.println("Total Marks   : " + total);
        System.out.println("Average Marks : " + average);
        System.out.println("Result        : " + result);
	}

}
