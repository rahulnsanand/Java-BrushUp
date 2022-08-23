package com.rahulnsanand.javabrushup;
// Created by Rahul Anand (C) 2022
// This is the main file to run in order to access the whole project

import com.rahulnsanand.javabrushup.fundamentals.assignments.*;
import com.rahulnsanand.javabrushup.debug.DebugClass;
import com.rahulnsanand.javabrushup.fundamentals.HelloWorld;
import com.rahulnsanand.javabrushup.fundamentals.SumOfNumbers;
import com.rahulnsanand.javabrushup.operatorsandloop.AllPrimeNumbers;
import com.rahulnsanand.javabrushup.operatorsandloop.NthFibonacciNumber;
import com.rahulnsanand.javabrushup.operatorsandloop.assignment.SumOrProduct;
import com.rahulnsanand.javabrushup.pattern.*;
import com.rahulnsanand.javabrushup.pattern.assignments.HalfDiamondPattern;
import com.rahulnsanand.javabrushup.pattern.assignments.OddSquare;
import com.rahulnsanand.javabrushup.pattern.assignments.ParallelogramPattern;
import com.rahulnsanand.javabrushup.pattern.assignments.SumPattern;
import com.rahulnsanand.javabrushup.test.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean repeatCheck = true;
        Scanner scannerInput = new Scanner(System.in);
        int choice;

        while(repeatCheck){

            System.out.println("0 - Debug Class Run");
            System.out.println("1 - Fundamentals");
            System.out.println("2 - Patterns");
            System.out.println("3 - Operators & For Loop");
            System.out.println("4 - Test");
            System.out.println("5 - Exit");
            choice = scannerInput.nextInt();
            switch (choice) {
                case 0 -> DebugClass.debugThis();
                case 1 -> showFundamentals();
                case 2 -> showPatterns();
                case 3 -> showOperatorsForLoop();
                case 4 -> showTestCases();
                case 5 -> repeatCheck=false;

            }
        }

    }

    private static void showTestCases() {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("0 - Palindrome Number Check");
        System.out.println("1 - Check AP");
        System.out.println("2 - Number Star Pattern 1");
        System.out.println("3 - Number Star Pattern");
        System.out.println("4 - Probability");
        System.out.println("5 - Maximum Number");
        System.out.println("6 - ");
        System.out.println("7 - ");
        System.out.println("8 - ");
        System.out.println("9 - ");
        System.out.println("10 - ");
        System.out.println("11 - ");
        System.out.println("12 - ");
        System.out.println("13 - ");
        System.out.println("14 - ");
        System.out.println("15 - ");
        System.out.println("16 - ");
        System.out.println("17 - ");
        System.out.println("18 - ");

        int choice = scannerInput.nextInt();
        switch (choice) {
            case 0 -> PalindromeNumber.run();
            case 1 -> CheckAP.run();
            case 2 -> NumberStarPattern1.run();
            case 3 -> NumberStarPattern.run();
            case 4 -> Probability.run();
            case 5 -> MaximumNumber.run(1111);
            case 6 -> AlphaPattern.run();
            case 7 -> CharacterPattern.run();
            case 8 -> TriangleCharacterPattern.run();
            case 9 -> InterestingAlphabets.run();
            case 10 -> MirrorImageNumberPattern.run();
            case 11 -> InvertedNumberPattern.run();
            case 12 -> StarPattern.run();
            case 13 -> TriangleOfNumbers.run();
            case 14 -> DiamondOfStars.run();
            case 15 -> HalfDiamondPattern.run();
            case 16 -> ParallelogramPattern.run();
            case 17 -> SumPattern.run();
            case 18 -> OddSquare.run();
        }
    }

    private static void showOperatorsForLoop() {
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("0 - Nth Fibonacci Number");
        System.out.println("1 - All Prime Numbers");
        System.out.println("2 - Sum Or Product");
        System.out.println("3 - Triangle Star Pattern");
        System.out.println("4 - Triangle Number Pattern");
        System.out.println("5 - Reverse Number Pattern");
        System.out.println("6 - Alpha Pattern");
        System.out.println("7 - Character Pattern");
        System.out.println("8 - Triangle Character Pattern");
        System.out.println("9 - Interesting Character Pattern");
        System.out.println("10 - Mirror Image Number Pattern");
        System.out.println("11 - Inverted Number Pattern");
        System.out.println("12 - Star Pattern");
        System.out.println("13 - Triangle Of Numbers");
        System.out.println("14 - Diamond Of Stars");
        System.out.println("15 - Half Diamond Pattern");
        System.out.println("16 - Parallelogram Pattern");
        System.out.println("17 - Sum Pattern");
        System.out.println("18 - Odd Square");

        int choice = scannerInput.nextInt();
        switch (choice) {
            case 0 -> NthFibonacciNumber.run();
            case 1 -> AllPrimeNumbers.run();
            case 2 -> SumOrProduct.run();
            case 3 -> TriangularStarPattern.run();
            case 4 -> TriangleNumberPattern.run();
            case 5 -> ReverseNumberPattern.run();
            case 6 -> AlphaPattern.run();
            case 7 -> CharacterPattern.run();
            case 8 -> TriangleCharacterPattern.run();
            case 9 -> InterestingAlphabets.run();
            case 10 -> MirrorImageNumberPattern.run();
            case 11 -> InvertedNumberPattern.run();
            case 12 -> StarPattern.run();
            case 13 -> TriangleOfNumbers.run();
            case 14 -> DiamondOfStars.run();
            case 15 -> HalfDiamondPattern.run();
            case 16 -> ParallelogramPattern.run();
            case 17 -> SumPattern.run();
            case 18 -> OddSquare.run();
        }
    }

    public static void showPatterns(){
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("0 - Simple Pattern");
        System.out.println("1 - Square Pattern");
        System.out.println("2 - Triangle Pattern");
        System.out.println("3 - Triangle Star Pattern");
        System.out.println("4 - Triangle Number Pattern");
        System.out.println("5 - Reverse Number Pattern");
        System.out.println("6 - Alpha Pattern");
        System.out.println("7 - Character Pattern");
        System.out.println("8 - Triangle Character Pattern");
        System.out.println("9 - Interesting Character Pattern");
        System.out.println("10 - Mirror Image Number Pattern");
        System.out.println("11 - Inverted Number Pattern");
        System.out.println("12 - Star Pattern");
        System.out.println("13 - Triangle Of Numbers");
        System.out.println("14 - Diamond Of Stars");
        System.out.println("15 - Half Diamond Pattern");
        System.out.println("16 - Parallelogram Pattern");
        System.out.println("17 - Sum Pattern");
        System.out.println("18 - Odd quare");

        int choice = scannerInput.nextInt();
        switch (choice) {
            case 0 -> SimplePattern.run();
            case 1 -> SquarePattern.run();
            case 2 -> TrianglePattern.run();
            case 3 -> TriangularStarPattern.run();
            case 4 -> TriangleNumberPattern.run();
            case 5 -> ReverseNumberPattern.run();
            case 6 -> AlphaPattern.run();
            case 7 -> CharacterPattern.run();
            case 8 -> TriangleCharacterPattern.run();
            case 9 -> InterestingAlphabets.run();
            case 10 -> MirrorImageNumberPattern.run();
            case 11 -> InvertedNumberPattern.run();
            case 12 -> StarPattern.run();
            case 13 -> TriangleOfNumbers.run();
            case 14 -> DiamondOfStars.run();
            case 15 -> HalfDiamondPattern.run();
            case 16 -> ParallelogramPattern.run();
            case 17 -> SumPattern.run();
            case 18 -> OddSquare.run();
        }
    }

    public static void showFundamentals(){
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("0 - Hello World");
        System.out.println("1 - Sum of two Numbers");
        System.out.println("2 - Character Case Check");
        System.out.println("3 - Fahrenheit To Celcius");
        System.out.println("4 - Salary Calculator");
        System.out.println("5 - Multiplication Table");
        System.out.println("6 - Sum of Even & Odd");
        System.out.println("7 - Find Factors");
        System.out.println("8 - Find Power Of Number");
        int choice = scannerInput.nextInt();
        switch (choice) {
            case 0 -> HelloWorld.print();
            case 1 -> {
                System.out.println("Enter Number 1: ");
                int a = scannerInput.nextInt();
                System.out.println("Enter Number 2: ");
                int b = scannerInput.nextInt();
                SumOfNumbers.sum(a, b);
            }
            case 2 -> CharCaseCheck.run();
            case 3 -> FahrenheitToCelcius.run();
            case 4 -> SalaryCalculator.run();
            case 5 -> MultiplicationTable.run();
            case 6 -> SumOfEvenOdd.run();
            case 7 -> FindFactors.run();
            case 8 -> FindPowerOfNum.run();
        }
    }

}
