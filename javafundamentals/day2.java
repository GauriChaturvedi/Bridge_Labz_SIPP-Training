ques-1
public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double kmToMiles = 0.621371;
        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}

ques-2 
import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in);
        int km = input.nextInt();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}

ques-3
public class CourseFeeDiscount {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}

ques-4
import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heightCm = input.nextDouble();
        double totalInches = heightCm / 2.54;
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
    }
}

ques-5
import java.util.Scanner;

public class StudentFeeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fee = input.nextDouble();
        double discountPercent = input.nextDouble();
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}

ques-6
public class HarryAge {
    public static void main(String[] args) {
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is " + age);
    }
}

ques-7
public class SamAverage {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        double average = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam’s average mark in PCM is " + average);
    }
}

ques-8
public class KmToMilesConversion {
    public static void main(String[] args) {
        double km = 10.8;
        double miles = km / 1.6;
        System.out.println("The distance " + km + " km in miles is " + miles);
    }
}

ques-9
public class ProfitCalculator {
    public static void main(String[] args) {
        double costPrice = 129;
        double sellingPrice = 191;
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
        System.out.println("The Cost Price is INR " + costPrice + " and the Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
    }
}

ques-10
public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}

ques-11
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
    }
}

ques-12
import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}

ques-13
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);
    }
}

ques-14
import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perimeter = input.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
ques15-
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double sum = number1 + number2;
        double diff = number1 - number2;
        double product = number1 * number2;
        double quotient = number1 / number2;
        System.out.printf("The addition, subtraction, multiplication, and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n", number1, number2, sum, diff, product, quotient);
    }
}

ques16-
import java.util.Scanner;

public class DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distanceInFeet = input.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.2f\n", distanceInYards, distanceInMiles);
    }
}

ques17-
import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perimeter = input.nextDouble();
        double side = perimeter / 4;
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);
    }
}
ques18-
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.printf("The Quotient is %d and Reminder is %d of two number %d and %d\n", quotient, remainder, number1, number2);
    }
}
ques19-
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("The %.2f celsius is %.2f fahrenheit\n", celsius, fahrenheit);
    }
}
ques20-
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.printf("The swapped numbers are %d and %d\n", number1, number2);
    }
}
ques21-
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double principal = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();
        double interest = principal * rate * time / 100;
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f\n", interest, principal, rate, time);
    }
}
ques22-
import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        double bonus = input.nextDouble();
        double totalIncome = salary + bonus;
        System.out.printf("The salary is INR %.2f and the bonus is INR %.2f. Hence Total Income is INR %.2f\n", salary, bonus, totalIncome);
    }
}
ques23-import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        int handshakes = numberOfStudents * (numberOfStudents - 1) / 2;
        System.out.println("The number of possible handshakes is " + handshakes);
    }
}
ques24-import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("The %.2f fahrenheit is %.2f celsius\n", fahrenheit, celsius);
    }
}
ques25-
import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000;
        double rounds = totalDistance / perimeter;
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km\n", rounds);
    }
}
ques26-
import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String fromCity = input.nextLine();
        String viaCity = input.nextLine();
        String toCity = input.nextLine();
        double fromToVia = input.nextDouble();
        double viaToFinalCity
   }
}
ques27-
import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfChocolates = input.nextInt();
        int numberOfChildren = input.nextInt();
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;
        System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates is %d\n", chocolatesPerChild, remaining);
    }
}
ques28-
import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weightInPounds = input.nextDouble();
        double weightInKg = weightInPounds / 2.2;
        System.out.printf("The weight of the person in pounds is %.2f and in kg is %.2f\n", weightInPounds, weightInKg);
    }
}







