/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        String numberString;
        String[] stringArray;
        ArrayList numberArray = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        numberString = input.nextLine();
        stringArray = numberString.split(" ");
        numberArray = ValueFilter.convertToNumArray(stringArray);
        numberArray = ValueFilter.filterEvenNumbers(numberArray);
        System.out.print("The even numbers are ");
        for(int i = 0; i < numberArray.size(); i++) {
            System.out.print(numberArray.get(i) + " ");
        }


    }
}
