package org.example;

public class Main {
    public static void main(String[] args) {

// Abraham Ghani Practice



/////////  Question 1 //////////

int bobSalary = 100_000;
int garySalary = 200_000;

int highestSalary = Math.max(bobSalary, garySalary);

System.out.println("-------q1-------\nthe highest salary between bob and gary is: " + highestSalary);


/////////  Question 2 //////////

int carPrice = 20_000;
int truckPrice = 80_000;

int cheapestVehicle = Math.min(carPrice, truckPrice);
System.out.println("\n-------q2-------\nthe lowest vehicle price from the 2 is: " + cheapestVehicle);


/////////  Question 3 //////////
double radius = 7.25;
double circleArea = Math.PI * Math.pow(radius, 2);
System.out.println("\n-------q3-------\narea of the circle with a radius of "+ radius + " is: " + circleArea);


/////////  Question 4 //////////
double numVar1 = 5.0;
double SQRTofNum = Math.sqrt(numVar1);
System.out.println("\n-------q4-------\nthe square root of " + numVar1 + " is " + SQRTofNum);



/////////  Question 5 //////////
int x1 = 5;
int y1 = 10;
int x2 = 85;
int y2 = 50;

double distance1 = Math.sqrt((Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
System.out.println("\n-------q5-------\nthe distance between the 2 points is: " + distance1);


/////////  Question 6 //////////
double numVar2 = -3.8;
double absOfNumVar2 = Math.abs(numVar2);
System.out.println("\n-------q6-------\nthe absolute value of " + numVar2 + " is: " + absOfNumVar2);

/////////  Question 7 //////////
double ranNum = Math.random();
System.out.println("\n-------q7-------\na random number between 0 and 1 is: " + ranNum);




    }
}