package com.bridgelabz.fellowshipprograms.utility;

import java.io.File;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;



/**
 * @author supzz
 *
 */
public class Utility
{
	static Scanner sc = new Scanner(System.in);

	// method for taking the integer input form the user

	
	public static int IntegerInput() {
		return sc.nextInt();
	}

	// method for taking the double input form the user

	public static double DoubleInput() {
		return sc.nextDouble();
	}

	// method for taking the String input form the user

	public static String StringInput() {
		return sc.nextLine();
	}
	
	//method for prime 2Darray
	
	public static void prime2DArray() {
		int[][] array = new int[10][100];
		int[][] prime = new int[10][100];
		int z = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				array[i][j] = z;
				z++;
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (isPrime(array[i][j])) {
					prime[i][j] = array[i][j];
				} else {
					prime[i][j] = -1;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (prime[i][j] != -1)
					System.out.print(prime[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//method for leap year
	
	public static boolean isLeapYear(int year)
	{
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			return true;
		}
		else
		{	
			return false;	
		}
	}
	
	//method for is Prime number or not
	
	private static boolean isPrime(int number) 
	{
		int count = 0;
		for (int i = 2; i <= number / 2; i++) 
		{
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 0)
			return true;
		else
			return false;
	}

	// method for finding the digit entered by the user ,from array through binary
	// search

	public static String BinarySearch(int size, int array[], int number) {

		String blank = " ";

		int start = 0;
		int end = size - 1;
		int middle = (start + end) / 2;

		while (start <= end) {
			middle = (start + end) / 2;
			if (number == array[middle]) {
				System.out.println("the " + number + " is found at the " + middle + "  index");
				break;
			} else if (number <= array[middle]) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}

		}

		for (int i = 0; i < size; i++) {
			if (array[i] != number) {
				System.out.println("the element is not present in array");
				break;
			}
		}
		return blank;

	}
	
	//method for prime number or not
	
	public static boolean prime(int number) {
		int count = 0;
		for (int j = 2; j <= number / 2; j++) {
			if (number % j == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			return true;
		} else
			return false;
	}

	// method for sorting the given array by the user using bubble sort

	public static String BubbleSort(int size, int array[]) {

		String blank = " ";

		// Bubble Sorting start - descending order

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[j] > array[i]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}

		System.out.println("sorted array in Descending order is:");
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);

		}
		// Bubble Sorting start - ascending order

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] > array[j]) {

					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}

		System.out.println("sorted array in Ascending order is:");
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);

		}

		return blank;
	}

	// method for sorting the given array by the user using insertion sort

	public static String InsertionSort(int size, int array[]) {

		String blank = " ";

		// insertion sort started:

		for (int i = 1; i < size; i++) {
			int index = i;
			int value = array[i];

			while (index > 0 && array[index - 1] > value) {
				array[index] = array[index - 1];
				index = index - 1;
			}

			array[index] = value;

		}

		// printing sorted array:

		System.out.println("sorted array  is:");
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);

		}

		return blank;
	}
	
	//method for number check
	public static boolean numberCheck(int valueOne, int valueTwo) {
		String a = Integer.toString(valueOne);
		String b = Integer.toString(valueTwo);
		char c[] = a.toCharArray();
		char d[] = b.toCharArray();
		a = arrange(c);
		b = arrange(d);
		return a.equals(b);
	}

	
	//method for arranging the numbers
	public static String arrange(char[] c) {
		String s = "";
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length - 1; j++) {
				if (c[j] > c[j + 1]) {
					char temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}

			}
		}
		for (int i = 0; i < c.length; i++) {
			s = s + c[i];
		}
		return s;
	}

	
	//method for prime anagram 2D
	
	public static void primeAnagram2DArray(int[] prime) {
		boolean z;
		int count = 0, countAna = 0;
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				z = numberCheck(prime[i], prime[j]);       

				if (z && count == 0) {
					countAna++;
					count++;
					z = false;
				}

			}
			if (count > 0) {
				countAna++;
				count = 0;
			}
		}
		int[] anagramTotal = new int[countAna];
		int x = 0;
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				z = numberCheck(prime[i], prime[j]);

				if (z && count == 0) {
					anagramTotal[x] = prime[j];
					x++;
					count++;
					z = false;
				}

			}
			if (count > 0) {
				anagramTotal[x] = prime[i];
				x++;
				count = 0;
			}
		}

		for (int i = 0; i < anagramTotal.length; i++) {
			for (int j = 0; j < anagramTotal.length - 1; j++) {
				if (anagramTotal[j] > anagramTotal[j + 1]) {
					int temp = anagramTotal[j];
					anagramTotal[j] = anagramTotal[j + 1];
					anagramTotal[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < anagramTotal.length; i++) {
			for (int j = 0; j < anagramTotal.length - 1; j++) {
				if (anagramTotal[j] == anagramTotal[j + 1]) {
					anagramTotal[j + 1] = -1;
				}
			}
		}
		int positive = 0;
		for (int i = 0; i < anagramTotal.length; i++) {
			if (anagramTotal[i] != -1) {
				positive++;
			}
		}
		int[] ana = new int[positive + 1];
		int zz = 1;
		int yy = 0;
		for (int i = 0; i < anagramTotal.length; i++) {
			if (anagramTotal[i] != -1) {
				ana[yy] = anagramTotal[i];
				yy++;
			}
		}

		int[][] total = new int[10][100];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				total[i][j] = zz;
				zz++;
			}
		}
		int xx = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (ana[xx] == total[i][j] && xx < ana.length) {
					total[i][j] = ana[xx];
					xx++;
				} else {
					total[i][j] = -1;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (total[i][j] != -1) {
					System.out.print(total[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
	
	//method for prime anagram linked list queue
	
	public static void primeAnagramLinkedListQueue(int[] prime) {
		boolean z;
		int count = 0, countAna = 0;
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				z = numberCheck(prime[i], prime[j]);

				if (z && count == 0) {
					countAna++;
					count++;
					z = false;
				}

			}
			if (count > 0) {
				countAna++;
				count = 0;
			}
		}
		int[] anagramTotal = new int[countAna];
		int x = 0;
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				z = numberCheck(prime[i], prime[j]);
				if (z && count == 0) {
					anagramTotal[x] = prime[j];
					x++;
					count++;
					z = false;
				}

			}
			if (count > 0) {
				anagramTotal[x] = prime[i];
				x++;
				count = 0;
			}
		}

		for (int i = 0; i < anagramTotal.length; i++) {
			for (int j = 0; j < anagramTotal.length - 1; j++) {
				if (anagramTotal[j] > anagramTotal[j + 1]) {
					int temp = anagramTotal[j];
					anagramTotal[j] = anagramTotal[j + 1];
					anagramTotal[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < anagramTotal.length; i++) {
			for (int j = 0; j < anagramTotal.length - 1; j++) {
				if (anagramTotal[j] == anagramTotal[j + 1]) {
					anagramTotal[j + 1] = -1;
				}
			}
		}
		int positive = 0;
		for (int i = 0; i < anagramTotal.length; i++) {
			if (anagramTotal[i] != -1) {
				positive++;
			}
		}
		int[] ana = new int[positive + 1];
		int zz = 1;
		int yy = 0;
		for (int i = 0; i < anagramTotal.length; i++) {
			if (anagramTotal[i] != -1) {
				ana[yy] = anagramTotal[i];
				yy++;
			}
		}
		LinkedQueue<Integer> listQueue = new LinkedQueue<Integer>();
		for (int i = 0; i < ana.length - 1; i++)
		{
			listQueue.add(ana[i]);
		}
		listQueue.display();
	}

	//method for PrimeAnagram Stack
	
	public static void primeAnagramLinkedListStack(int[] prime) {
		boolean z;
		int count = 0, countAna = 0;
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				z = numberCheck(prime[i], prime[j]);

				if (z && count == 0) {
					countAna++;
					count++;
					z = false;
				}

			}
			if (count > 0) {
				countAna++;
				count = 0;
			}
		}
		int[] anagramTotal = new int[countAna];
		int x = 0;
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				z = numberCheck(prime[i], prime[j]);

				if (z && count == 0) {
					anagramTotal[x] = prime[j];
					x++;
					count++;
					z = false;
				}

			}
			if (count > 0) {
				anagramTotal[x] = prime[i];
				x++;
				count = 0;
			}
		}

		for (int i = 0; i < anagramTotal.length; i++) {
			for (int j = 0; j < anagramTotal.length - 1; j++) {
				if (anagramTotal[j] > anagramTotal[j + 1]) {
					int temp = anagramTotal[j];
					anagramTotal[j] = anagramTotal[j + 1];
					anagramTotal[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < anagramTotal.length; i++) {
			for (int j = 0; j < anagramTotal.length - 1; j++) {
				if (anagramTotal[j] == anagramTotal[j + 1]) {
					anagramTotal[j + 1] = -1;
				}
			}
		}
		int positive = 0;
		for (int i = 0; i < anagramTotal.length; i++) {
			if (anagramTotal[i] != -1) {
				positive++;
			}
		}
		int[] ana = new int[positive + 1];
		int zz = 1;
		int yy = 0;
		for (int i = 0; i < anagramTotal.length; i++)
		{
			if (anagramTotal[i] != -1)
			{
				ana[yy] = anagramTotal[i];
				yy++;
			}
		}
		LinkedStack<Integer> listStack = new LinkedStack<Integer>();
		for (int i = 0; i < ana.length - 1; i++) {
			listStack.add(ana[i]);
		}
		listStack.display();
	}

	// method for finding if the given two strings by the user are anagram or not

	public static String Anagram(String first, int length1, String second, int length2) {
		String blank = " ";
		int found = 0;
		int not_found = 0;
		if (length1 == length2) {
			for (int i = 0; i < length1; i++) {

				for (int j = 0; j < length2; j++) {
					if (first.charAt(i) == second.charAt(j)) {
						found = 1;
						break;
					}
				}

				if (found == 0) {
					not_found = 1;
					break;
				}
			}

			if (not_found == 1) {
				System.out.println("strings are not anagram");
			} else {
				System.out.println("strings are  anagram");
			}
		} else {
			System.out.println("the strings length is not same so they are not anagrams:");

		}
		return blank;

	}

	// method for displaying the prime numbers within the entered limit by the user

	public static String PrimeDisplay(int limit) {

		String blank = " ";

		System.out.println("the prime numbers from 1 to " + limit + " are:");

		int primecount = 0;
		for (int i = 0; i <= limit; i++) {
			int factorcount = 0;
			for (int num = i; num >= 1; num--) {
				if (i % num == 0) {
					factorcount++;
				}
			}
			if (factorcount <= 2) {
				System.out.print(+i + ",");
				primecount++;
			}
		}
		System.out.println();

		System.out.println("prime nos between 1 to 1000 are:" + primecount);

		return blank;
	}

	// method for displaying the prime numbers that are pallindrome too within the
	// entered limit by the user

	public static String PrimePallindrome(int limit) {

		String blank = " ";

		int primepallindromes = 0;
		int reverseno = 0;
		int number = 0;

		for (int i = 0; i <= limit; i++) {
			int factorcount = 0;
			for (int num = i; num >= 1; num--) {
				if (i % num == 0) {
					factorcount++;
				}
			}
			if (factorcount <= 2) {
				number = i;
				while (number != 0) {
					int remainder = number % 10;
					reverseno = reverseno * 10 + remainder;
					number = number / 10;

				}
				if (reverseno == i) {
					System.out.print(i + " ,");
					primepallindromes++;

				}
				reverseno = 0;
			}

		}
		System.out.println();

		System.out.println("the total PrimePallindromes are:" + primepallindromes);

		return blank;
	}

	// method for displaying the paliindrome numbers within the entered limit by the
	// user

	public static String PallindromeOfNumber(int limit) {

		String blank = " ";

		int reverseno = 0;
		int number = 0;

		for (int i = 2; i <= limit; i++) {
			number = i;
			while (number != 0) {
				int remainder = number % 10;
				reverseno = reverseno * 10 + remainder;
				number = number / 10;

			}
			if (reverseno == i) {
				// System.out.print(i + " ,");
			}
			reverseno = 0;
		}

		return blank;

	}

	// method for inserting and displaying the arrays entered by the user and
	// performing its multiplication

	public static String array2Dmultiply(int row, int coloumn, int array2D1[][], int array2D2[][],
			int resultarray2D3[][]) {

		String rev = " ";

		// inserting the elements of array 1:
		System.out.println("enter the elements of arr 1");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				array2D1[i][j] = Utility.IntegerInput();

			}
		}
		// printing the array 1
		System.out.println("1st array is");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {

				System.out.print(+array2D1[i][j] + "\t");
			}
			System.out.println();
		}
		// inserting the elements of array 2
		System.out.println("insert the elements of 2nd array :");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				array2D2[i][j] = sc.nextInt();

			}
		}
		// printing the array 2
		System.out.println("2nd array is");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				System.out.print(+array2D2[i][j] + "\t");
			}
			System.out.println();
		}
		// multiplication of the 2 arrays
		// the matrix to be multiplied now
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < coloumn; j++) {
				resultarray2D3[i][j] = 0;
				for (int k = 0; k < coloumn; k++) {

					resultarray2D3[i][j] += array2D1[i][k] * array2D2[k][j];
				}
			}
		}
		System.out.println();
		System.out.println();
		// printing of the multiplied matrix
		System.out.println("the multiplied matrix is : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				System.out.print(+resultarray2D3[i][j] + "\t");
			}
			System.out.println();
		}

		return rev;
	}

	// method for finding the triplets from the given array by user which matches
	// the given target from the user

	public static String tripletsAdd(int target, int size) {

		String blank = " ";

		int[] array = new int[size];
		System.out.println("enter the elements in the array");
		for (int i = 0; i < size; i++) {
			array[i] = IntegerInput();
		}

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				for (int k = j + 1; k < size; k++) {
					if (array[i] + array[j] + array[k] == target) {
						System.out.println("the indexes of the mentioned array matching your target are" + i + "\t," + j
								+ "\t," + k);
						System.out.println("the values matching your target are:" + array[i] + "\t," + array[j] + "\t,"
								+ array[k]);

					}
				}
			}
		}
		if (false) {
			System.out.println("not found");
		}

		return blank;
	}

	// method for distance calculation

	public static double DistanceCalculation(int x1, int y1, int x2, int y2) {
		// String blank=" ";

		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
//			System.out.println("the distance between the first coordinates("+x1+","+y1+")and the second coordinates("+x2+","+y2+")is "+distance);

		return distance;

	}

	// method for Quadratic root calculation

	public static String QuadraticRootCalculation(int a, int b, int c) {

		String blank = " ";

		System.out.println("the delta of the equation is");
		double delta = (Math.pow(b, 2)) - (4 * a * c);
		System.out.println(+delta);
		System.out.println("the roots of the above equation are");
		double root1 = -b + Math.sqrt(delta) / 2 * a;
		double root2 = -b - Math.sqrt(delta) / 2 * a;
		System.out.println(+root1 + " , " + root2);
		return blank;
	}

	// method for calculating windchill by taking values of temperature and
	// windspeed from the user

	public static String WindChill(double temperature, double Windspeed) {

		String blank = " ";

		double WindChill = 35.74 + (0.6215 * temperature)
				+ ((0.4275 * temperature) - 35.75) * Math.pow(Windspeed, 0.16);
		System.out.println(
				"according to the National Weather Service defines the effective temperature (the wind chill) is:"
						+ WindChill);
		return blank;
	}

	// method for converting temperature SI unit Celsius to Farenheit and vice versa

	public static String temperatureConversion() {

		String blank = " ";

		System.out.println("enter the temperature in celsius:");
		double Celsius = sc.nextInt();

		// conversion code
		double CelsiusToFarenheit = (Celsius * 9 / 5) + 32;
		System.out.println("your entered temperature in Farenheit is:" + CelsiusToFarenheit + "F");

		System.out.println("enter the temperature in farenheit:");
		double Farenheit = sc.nextInt();

		// conversion code
		double FarenheitToCelsius = (Farenheit - 32) * 5 / 9;
		System.out.println("your entered temperature in Celsius is:" + FarenheitToCelsius + "C");

		return blank;

	}

	// for calculating the monthly payment to paid by the user to the bank to
	// complete itz loan procedure in the timely manner

	public static String monthlyPayment() {
		Scanner sc = new Scanner(System.in);
		String blank = " ";

		System.out.println("enter the principal loan amount you have taken from the bank:");
		double loanamount = sc.nextInt();

		System.out.println("enter the years scheduled to you to repay your loan by the bank");
		int years = sc.nextInt();

		System.out.println("enter the percentage interest allocated to you by the bank:");
		double percentageinterest = sc.nextInt();

		double n = 12 * years;
		double r = percentageinterest / (12 * 100);

		double monthlypayment = (loanamount * r) / 1 - Math.pow((1 + r), -n);

		System.out.println("the amount that you have to pay monthly to the bank is :" + monthlypayment);

		return blank;

	}

	// giving the4 date form the user and displaying the respective day on the
	// following date:

	public static String dayOfWeek() {
		Scanner sc = new Scanner(System.in);
		String blank = " ";

		System.out.println("enter the date between 1 to 31");
		int date = sc.nextInt();

		System.out.println("enter the month between 1 to 12");
		int month = sc.nextInt();

		System.out.println("enter the year ");
		int year = sc.nextInt();

		int y0 = year - (14 - month) / 12;

		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

		int m0 = month + 12 * ((14 - month) / 12) - 2;

		int d0 = (date + x + 31 * m0 / 12) % 7;

		// d0 = (d + x + 31m0 / 12) mod 7
		String day;

		switch (d0) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;
		default:
			day = "Invalid day";

		}

		System.out.println(day);

		return blank;

	}

	// method for converting the decimal number into its respective binary number

	public static String DecimaltoBinary(int decimalnumber) {

		String blank = " ";

		int binary[] = new int[40];	
		int index = 0;
		while (decimalnumber > 0) {
			binary[index++] = decimalnumber % 2;
			decimalnumber = decimalnumber / 2;
		}
		for (int i = index; i >= 0; i--) {
			System.out.print(binary[i]);
		}

		return blank;

	}
	
	//methods for calender printing
	
	
			public static int[][] calender = new int[5][7];
			public	static int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

			public	static void initCal() 
			{
				for (int i = 0; i < calender.length; i++)
				{
					for (int j = 0; j < calender[i].length; j++)
					{
						calender[i][j] = -10;
						
					}
				}
			}

			public	static void display(int m)
			{
				System.out.println("	Sun	Mon	Tue	Wed	Thu	Fri	Sat");

				for (int i = 0; i < calender.length; i++)
				{
					for (int j = 0; j < calender[i].length; j++)
					{
						if (calender[i][j] < 0 || calender[i][j] > month[m - 1])
						{
							System.out.print("\t ");
						} 
						else if (calender[i][j] > 0) {
							System.out.print("\t" + calender[i][j] + " ");
						}
					}
					System.out.println("\t");
				}
			}

			public	static void putCalender(int d)
			{
				int d1 = 1;
				for (int i = d; i < calender[0].length; i++)
				{
					// System.out.print(d1);
					calender[0][i] = d1++;
				}
				for (int i = 1; i < calender.length; i++) 
				{
					for (int j = 0; j < calender[i].length; j++)
					{
						calender[i][j] = d1++;
					}
				}

			}

			public	static void dispCalender(int m, int y)
			{
				int d = dayOfWeek(m, y);
				initCal();
				putCalender(d);
				display(m);

			}

			public	static int dayOfWeek(int m, int y) 
			{
				int d = 1;
				int y0 = y - (14 - m) / 12;
				int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
				int m0 = m + 12 * ((14 - m) / 12) - 2;
				int d0 = (d + x + (31 * m0) / 12) % 7;
				return d0;
			}
			
			
			//day of week method with three arguments

			public static int dayOfWeek(int day,int mon,int year)
			{
				int y0=year-(14-mon)/12;
				int x=y0+y0/4-y0/100+y0+400;
				int m0=mon+12*((14-mon)/12)-2;
				int d0=(day+x+(31*m0)/12)%7;
				return d0;
			}


	//method for linked list
			
			static Node head;
			
			public static class Node
			{
			String data;
			Node next;
			Node(String data2)
			{
		
			   data = data2;
			next = null;
			}
			}

		/*****Code for Inserting a Node*****/
		
			   public static String insert(String data)
			{
			Node new_node=new Node(data);
			new_node.next=null;
			if(head==null)
			{
			head=new_node;
			}
			else
			{
			Node p=head;
			while(p.next!=null)
			{
			p=p.next;
			}
			p.next=new_node;
		
		
			}
			return null;
			}
		   
		   /*****Code for Inserting a Node at the Beginning*****/
			   
			   public static String inserAtBeg(String data)
			{
			Node new_node=new Node(data);
			if(head==null)
			{
			return data;
			}
			else
			{
			head=new_node;
			new_node.next=null;
			}
			return data;
			}
   
	   /*****Code for Inserting a Node at the given Position*****/
	   
		   public static String insertAtPosition(String data,int position)
		{
		//int size=p.length();
		Node new_node=new Node(data);
		Node p=head;
		if(position==1)
		{
		head=new_node;
		new_node.next=null;
		return data;
		}
		for(int i=0;i<position-1 && p!=null;i++)
		{
		p=p.next;
		}
		new_node.next=p.next;
		p.next=new_node;
	
		return data;
		}

       /*****Code for Removing the Duplicate Element*****/
   
	   public static void removeDuplicate()
	   {  
	       
	       Node p= head;
	       Node index = null;
	       Node temp = null;  
	 
	       if(head == null)
	       {  
	           return;  
	       }  
	       
	       else
	       {  
	         
	       while(p!= null)
	         
	       {  
	              temp = p;  
	              index = p.next;  
	 
	       while(index != null)
	       {  
	                   
	     if(p.data == index.data)
	         {  
	     
	      temp.next = index.next;  
	     
	        }
	     
	         else
	         {  
	            temp = index;  
	                   }  
	                   index = index.next;  
	               }  
	               p = p.next;  
	           }  
	       }  
	   }  
   
   /*****Code for deleting an Element directly*****/
   
		   public static void delete(String key)
		   {
		       // Store head node
		       Node p = head;
		        Node prev = null;
		 
		       // If head node itself holds the key to be deleted
		       if (p != null && p.data == key)
		       {
		           head = p.next; // Changed head
		           return;
		       }
		 
		       // Search for the key to be deleted, keep track of the
		       // previous node as we need to change temp.next
		       while (p != null && p.data != key)
		       {
		           prev = p;
		           p = p.next;
		       }    
		 
		       // If key was not present in linked list
		       if (p == null) return;
		 
		       // Unlink the node from linked list
		       prev.next = p.next;
		   }
   
   /*****Code for Deleting the Node at given position*****/
   
		  public void deleteNode(int position)
		   {
		       if (head == null)
		           return;
		 
		     
		       Node p = head;
		 
		       
		       if (position == 0)
		       {
		           head = p.next;  
		           return;
		       }
		 
		       
		       for (int i=0; p!=null && i<position-1; i++)
		           p = p.next;
		 
		       // If position is more than number of ndoes
		       if (p == null || p.next == null)
		           return;
		 
		      Node next = p.next.next;
		 
		       p.next = next;  
		   }
		   
   /*****Code for Seraching an Element *****/
   
   
			   public static  String search(String x)
			   {
			boolean flag=false;
			       Node p = head;    
			       if(head==null)
			       {
			        System.out.println("List is Empty");
			       }
			       while (p != null)
			       {
			           if (p.data == x)
			              flag=true;  
			     
			           p = p.next;
			       }
			      if(flag)
			       {
			    	  System.out.println("Data Not Present");
				        insert(x);
			        
			       }
			       else
			       {
			    	   System.out.println("Data is Prestnt");
				        delete(x);
				       
			       }
			       
			return x;
			       
			
			   }

      /*****Code to Find the Length of the LinkedList*****/
   
   
				public static int length()
				{
				int count=0;
				if(head==null)
				{
				return 0;
				}
				else
				{
				
				Node p=head;
				while(p!=null)
				{
				p=p.next;
				count++;
				}
				}
				return count;
				}

      /*****Code to Display the linkedlist*****/

		public static LinkedList display()
		{
				Node p=head;
				while(p!=null)
				{
				System.out.println(p.data+ "\t");
				p=p.next;
				}
				System.out.println();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
				return null;
		
		}
		
		//---------------------------------------------------------------------------------//
		
		//my node method
		
		public static class MyNode<T> {
			private T value;
			private MyNode<T>nextRef;
			
			public MyNode()
			{
				value=null;
				nextRef=null;
			}
			public MyNode(T data, MyNode<T>next)
			{
				this.value=data;
				this.nextRef=next;
				
			}
			public T getValue() {
				return value;
			}
			public void setValue(T value) {
				this.value = value;
			}
			public MyNode<T> getNextRef() {
				return nextRef;
			}
			public void setNextRef(MyNode<T> nextRef) {
				this.nextRef = nextRef;
			}
			
		}
		
		
		
		//Queue linked list 
		
		
		public static class QueueLinkedList<T> 
		{
			public MyNode<T> front, rear;
			public int size=0;
			
			//Constuctor
			public QueueLinkedList()
			{
				front =null;
				rear= null;
				size=0;
			}
			/**
			 * Purpose : Function to check is Queue is empty 
			 * @return null value
			 */
			public boolean isQueueEmpty()
			{
				return front==null;
			}
			/**
			 * 
			 * @return Size
			 */ 
			public int getsize()
			{
				return size;
			}
			/**
			 * Purpose : function to Insert data into Queue
			 * @param  : Passing data as an argument
			 */
			public void insert(T data)
			{
				MyNode<T> node= new MyNode<T>(data,null);
				if(front==null)
				{
					front=node;
					rear=node;
				}
				else
				{
					rear.setNextRef(node);
					rear= rear.getNextRef();
				}
				size++;
			}
		/**
		 * Purpose : Function to remove data into Queue	
		 * @return Current value
		 */
			public T remove()
			{
				if(isQueueEmpty())
				{
					System.out.println("UnderFlow");
				}
				MyNode<T> current=front;
				front = current.getNextRef();
				if(front==null)
				{
					rear=null;
					size--;
				}
				return current.getValue();
			}
			/**
			 * Purpose to Print the data 
			 */
			public void display()
			{
				if(isQueueEmpty())
				{
					System.out.println("Queue is Empty");
					return;
				}
				else
				{
					MyNode<T>temp=front;
					while(temp!=null)
					{
						System.out.print(temp.getValue()+" ");
						temp= temp.getNextRef();
					}
				}
			}
		}

	
		// linked list queue display
		
  public static class LinkedQueue<T>
	{
			public class Node<T>
			{
				public Node<T> next;
				public T data;
				public Integer key;
				public Node(T data) {
					this.data=data;
				}
				public Node(Integer key, T data) {
					this.key=key;
					this.data=data;
				}

		    }
			
			
				Node<T> head;
				public void add(T data) {
					Node<T> n = new Node<T>(data);
					if(head==null)
						head=n;
					else {
						Node<T> t=head;
						while(t.next!=null)
							t=t.next;
						t.next=n;
					}
				}
				
				public void display() {
					Node<T> t=head;
					Integer a=10;
					if(!isEmpty()) {
					while(t!=null) {
						
						if(!(t.data.equals(-1))) {
							if((((Integer) t.data)).compareTo(a)<0){
								System.out.print(t.data+"  ");
							}
							else
								System.out.print(t.data+" ");
						}
						else
							System.out.print("   ");
						t=t.next;
						}
					System.out.println();
					}
				}
				
				public T remove() {
					Node<T> t=head;
					if(head!=null)
						head = t.next;
					return t.data;
				}
				
				public boolean isEmpty() {
					if(head==null)
						return true;
					else
						return false;
				}
				
		}	
  //linkedlist stack
  
  
  public static  class StackLinkedList<T> {
		private MyNode<T>top;
		private int size;
		
		//Constuctor
		public StackLinkedList()
		{
			top=null;
			size=0;
		}
		/**
		 * Purpose : Funtion to ckeck is Stack is Empty
		 * @return : Return the top value
		 */
		public  boolean isStackEmpty()
		{
			return top==null;
		}
		public int getsize()
		{
			return size;
		}
		/**
		 * Purpose : data the item which needs to push in stack
		 * @param  : Passing data as an argument
		 */
		@SuppressWarnings("unused")
		public void push(T data)
		{
			MyNode <T>temp=new MyNode<>(data,null);
				if(temp==null)
				{
					top=temp;
				}
				else
				{
					temp.setNextRef(temp);
					top=temp;
				}
				size++;
		}
		/**
		 * purpose : data the item which needs to pop in stack
		 * @return : return the first value inserted or null if stack is empty
		 */
		public T pop()
		{
			if(isStackEmpty())
			{
				System.out.println("No Element");
				return null;
			} 
			MyNode<T>temp=top;
			top=temp.getNextRef();
			size--;
			return temp.getValue();
		}
	}
  
  			//linked list stack
  
  
  public static class LinkedStack<T>
  {
  	public class Node<T>
	  	{
	  		public Node<T> next;
	  		public T data;
	  		public Integer key;
	  		public Node(T data) {
	  			this.data=data;
	  		}
	  		public Node(Integer key, T data) {
	  			this.key=key;
	  			this.data=data;
	  		}
	
	      }
  	
  		Node<T> head;
  		
  		
  		public void add(T data) {
  			Node<T> n = new Node<T>(data);
  			if(head==null)
  				head=n;
  			else {
  				n.next=head;
  				head=n;
  			}
  		}
  		
  		public void display() {
  			Node<T> t=head;
  			while(t!=null) {
  				System.out.println(t.data);
  				t=t.next;
  			}
  		}
  		
  		public void remove() {
  			Node<T> t=head;
  			head = t.next;
  		}
  		public Integer pop(){
  			Node<T> t=head;
  			Integer temp = (Integer) t.data;
  			head = t.next;
  			return temp;
  		}
  		
  }
  
  //method to check the condition for balanced parenthesis
  
	public  static boolean checkBalancedParenthesis(String s) 
	{
			Stack st = new Stack();
			for (int i = 0; i < s.length(); i++)
			{
				/*
				 * push open parenthesis “(“ and pop closed parenthesis “)”. At the End of the
				 * Expression if the Stack is Empty then the Arithmetic Expression is Balanced.
				 */
				char c = s.charAt(i);
				if (c == '('||c=='{'||c=='[')
					st.push(s.charAt(i));
				
				else if (c == ')'||c=='}'||c==']')
					st.pop();
			}
			return st.isEmpty();
		}
  
	//method for bnary search tree
	
	public static class BinarySearchTree
    { 
    	  
    	    /* Class containing left and right child of current node and key value*/
    	    public class  Node 
    		    { 
	    		        int key; 
	    		        Node left, right; 
	    		  
	    		        public Node(int item)
	    		        { 
	    		            key = item; 
	    		            left = right = null; 
	    		        }

						
    	      } 
    	  
    	    // Root of BST 
    	    Node root; 
    	  
    	    // Constructor 
    	    public BinarySearchTree()
    	    {  
    	        root = null;  
    	    } 
    	  
    	    // This method mainly calls insertRec() 
    	   public void insert(int key)
    	   { 
    	       root = insertRec(root, key); 
    	    } 
    	     
    	    /* A recursive function to insert a new key in BST */
    	   public  Node insertRec(Node root, int key)
    	    { 
    	  
    	        /* If the tree is empty, return a new node */
    	        if (root == null) 
    	        { 
    	            root = new Node(key); 
    	            return root; 
    	        } 
    	  
    	        /* Otherwise, recur down the tree */
    	        if (key < root.key) 
    	            root.left = insertRec(root.left, key); 
    	        else if (key > root.key) 
    	            root.right = insertRec(root.right, key); 
    	  
    	        
    	    
    	        
    	        
    	        /* return the (unchanged) node pointer */
    	        return root; 
    	    } 
    	  
    	    // This method mainly calls InorderRec() 
    	   public    void inorder() 
    	    { 
    	       inorderRec(root); 
    	    } 
    	  
    	    // A function to do inorder  traversal of BST 
    	 public   void inorderRec(Node root) 
    	    { 
    	        if (root != null) 
    	        { 
    	            inorderRec(root.left); 
    	            System.out.println(root.key); 
    	            inorderRec(root.right); 
    	        } 
    	    } 

    	 
    	 //--------------------------------------------------------------------//
    	 public  static  int numberOfBST(int n) 
    	    { 
    	  
    	    // DP to store the number  
    	    // of unique BST with key i 
    	    int noOfBST[] = new int[n  ]; 
    	    
    	 
    	    // Base case 
    	    noOfBST[0] = 1; 
    	    noOfBST[1] = 1;  
    	  
    	    // fill the dp table in 
    	    // top-down approach. 
    	    for (int i = 2; i <= n; i++)  //i=no of elements
    	    { 
    	        for (int j = 1; j <= i; j++)  //j= making each node as root element
    	        { 
    	  
    	            // n-i in right * i-1 in left 
    	        	noOfBST[i] = noOfBST[i] + (noOfBST[i - j] *  
    	        			noOfBST[j - 1]); 
    	        } 
    	    } 
    	  
    	    return noOfBST[n ]; 
    	    }
    	
    }  
		//stack implementation
	
	
		public static class Stack<T>
		{
				
				int capacity = 10;
		
				
				private Object[] stack = new Object[capacity];
				
				private int top = 0;
		
				//adds the value to the stack
				public void push(T data)
				{
					// checks for cpapcity of array
					
					
					if (top == capacity)
					{
						System.out.println("stack full");
					}
					// puts data in stack
					stack[top] = data;
					top++;
				}
		
				//deletes the upper value
				public T pop() {
					if (isEmpty()) {
						System.err.println("cant pop , stack is empty");
						return null;
					} else {
						T data = (T) stack[--top];
						stack[top] = null;
						return data;
					}
				}
		
				//returns the last value of the stack
				public T peek() {
					return (T) stack[top];
				}
		
				
				public boolean isEmpty() {
					return top == 0;
				}
		
				
				public int size() {
					return top;
				}
		
				
	     }
	
		//queue dequeue for money count 
		
		public static class QueueDequeue 
		  {
				public Node front, rear;
			    public int size;
			    class Node
			    {
			    	protected int data;
			        protected Node link;
			     
			        /*  Constructor  */
			        public Node()
			        {
			            link = null;
			            data = 0;
			        }  
			        
			        /* Parameterized Constructor  */
			        public Node(int d,Node n)
			        {
			            data = d;
			            link = n;
			        }  
			        
			        /*  Function to set data to current Node  */
			       	public void setData(int d)
			        {
			            data = d;
			        }   
			        
			       	/*  Function to get link to next node  */
			       	public Node getLink()
			        {
			         	return link;
			        }  
			        
			    	/*  Function to set link to next Node  */
			        public void setLink(Node n)
			        {
			            link = n;
			        }  

			        /*  Function to get data from current Node  */
			        public int getData()
			        {
			            return data;
			        }
			    }
			 
			    /* Constructor */
			    public QueueDequeue()
			    {
			        front = null;
			        rear = null;
			        size = 0;
			    }    
			    
			    /*  Function to check if queue is empty */
			    public boolean isEmpty()
			    {
			        return front == null;
			    }   
			    
			    /*  Function to get the size of the queue */
			    public int getSize()
			    {
			        return size;
			    }    
			    
			    /*  Function to insert an element to the queue */
			    public void insert(int data)
			    {
			        Node node = new Node(data, null);
			        if (rear == null)
			        {
			            front = node;
			            rear = node;
			        }
			        else
			        {
			            rear.setLink(node);
			            rear = rear.getLink();
			        }
			        size++ ;
			    }   
			    
			    /*  Function to remove front element from the queue */
			   	public int remove()
			    {
			        if (isEmpty())
					{
			        	throw new NoSuchElementException("Underflow Exception");
					}
			        Node ptr = front;
			        front = ptr.getLink();        
			        if (front == null)
					{
			            rear =null;
						size-- ; 
					}       
			        return ptr.getData();
			    }    
			    
			    /*  Function to check the front element of the queue */
			    public int peek()
			    {
			        if (isEmpty())
					{
			            throw new NoSuchElementException("Underflow Exception");
					}
			        return front.getData();
			    }    
			    
			    /*  Function to display the status of the queue */
			    public void display()
			    {  
					int temp1=0;
			        System.out.print("Available Balance = ");
			        if (size == 0)
			        {
			            System.out.print("Empty");
			            return ;
			        }
			        Node temp = front;
			        while (temp != rear.getLink() )
			        { 
			        	temp1=temp1+temp.getData();
			        	System.out.println(temp1);
			            temp = temp.getLink();
			        }
			        System.out.println();        
			    }
			    
			    
		}


		//queue dequeue for palindrome checking
		
	public static class DeQueueForPallindrome<E>
		{
			
			public class Deque<E> 
			{
				public E data;
				public Deque<E>next;
				public Deque<E>pre;
				
				public Deque()
				{
					this.next=null;
					this.pre=null;
				}
				
				public Deque(E val)
				{
					this.data=val;
					this.next=null;
					this.pre=null;
				}
			}
				public DeQueueForPallindrome(){	
				}
				
				Deque<E> front;
				Deque<E> rear;
				int size=0;
				
				//add front
				public void addFront(E c)
				{
					if(front==null) //if no element in list
					{
						front.data=c;
						rear=front;
					}
					else  //if element in list
					{
						Deque<E>tNode=null;
						tNode.data=c;
						tNode.next=front;
						front.pre=tNode;
						front=tNode;
					}
					size++;
				}
				
				//add rear
				public void addRear(E c)
				{
					if(front==null) //if no element in list
					{
						Deque<E>tNode=new Deque<E>(c);
						front=tNode;
						rear=front;
					}
					else  //if element in list
					{
						Deque<E>tNode=new Deque<>(c);
						rear.next=tNode;
						tNode.pre=rear;
						rear=tNode;
					}
					size++;
				}
				
				//remove front
				public E removeFront()
				{
					E val=null;
					if(front==null)
					{
						System.out.println("No elements to delete");
					}
					else
					{
						val=front.data;
						front=front.next;
					}
					size--;
					return val;
				}
				
				//remove rear
				public E removeRear()
				{
					E val=null;
					if(front==null)
					{
						System.out.println("No element to delete");
					}
					else
					{
						val=rear.data;
						rear=rear.pre;
						rear.next=null;
					}
					size--;
					return val;
				}
				
				//to remove
				public boolean isEmpty()
				{
					if(front==null)
						return true;
					else
						return false;
				}
			 
				//return size of deque
				public int size()
				{
					return size;
				}
			}


		
		// unordered list
		
	public class UnorderedList<T>
		{
				private Node head;
				//                zxNode tail;
				private int size = 0;
				
				public  class Node
				{
					String data;
					Node next;
					
					public <T> Node( T data) 
					{
						
						this.data=" "+data;
						this.next = null;
					}
				}

				public void add(T data) 
				{
					/*
					 * creates an new node with data traverse list till last adds the node as the
					 * last node
					 */
					Node n = new Node(data);
					if (head == null) {
						head = n;
						size++;
					} else {
						Node node = head;
						while (node.next != null) {
							node = node.next;
						}
						// adds the node as last node
						node.next = n;
						size++;
					}
				}

				
				public void remove(T item) {
					Node n = head;
					Node prev = null;
					if (head.data.equals(item)) {
						head = head.next;
						size -= 1;
						return;
					}
					while (!n.data.equals(item)) {
						prev = n;
						n = n.next;
					}
					n = n.next;
					prev.next = n;
					n = null;
					size -= 1;
				}

				public void removeAtLast() {
					Node n = head;
					Node prev = null;
					while (n.next != null) {
						prev = n;
						n = n.next;
					}
					System.out.println("hheeyy");
					// remove the node as last node
					prev.next = null;
					size--;
				}

				public  boolean search(T item) {
					Node n = head;
					while (n.next != null) {
						if (n.data.equals(item)) {
							return true;
						}
						n = n.next;
					}
					return false;
				}

				
				public boolean isEmpty() {
					if (head == null) {
						return true;
					}
					return false;
				}

				
				public int size() {
					return size;
				}

				
				public int index(T item) {
					int index = 0;
					Node n = head;
					while (!n.data.equals(item)) {
						n = n.next;
						index++;
					}
					return index;

				}

				
				public void insert(int pos, T item) throws IndexOutOfBoundsException {
					if (pos > size || pos < 0) {
						throw new IndexOutOfBoundsException();
					}
					int index = 0;
					Node n = head;
					Node node = new Node(item);
					if (pos == 0) {
						node.next = head;
						head = node;
					} else {
						while (index != pos) {
							n = n.next;
						}
						node.next = n.next;
						n.next = node;
					}
					size++;
				}

				
				public T pop() {
					Node n = head;
					if (size == 1) {
						head = head.next;
						size--;
						return (T) n.data;
					}
					while (n.next != null) {
						n = n.next;
					}
					T ret = (T) n.data;
					n = n.next;
					size -= 1;
					return ret;
				}

				
				public T pop(int pos) {
					int index = 0;
					Node n = head;
					if (pos == 0) {
						head = head.next;
						size--;
						return (T) n.data;
					}
					Node prev = null;
					while (index != pos) {
						prev = n;
						n = n.next;
						index++;
					}
					prev.next = n.next;
					size -= 1;
					return (T) n.data;
				}

			/*	public String toString() {
					StringBuffer s = new StringBuffer();
					s.append("[ ");
					Node node = head;
					while (node != null) {
						s.append(node.data);
						node = node.next;
						s.append(",");
					}
					s.append(" ]");
					return s.toString();
				}*/

			
				public void show() 
				{
					System.out.println(toString());
				}

			}
             //---------------------------------------------------------------------------//

		//hashing functions
	
public  class HashChaining
  {	
		
		
			public class Node<T>
			{
					public Node<T> next;
					public T data;
					public Integer key;
					public Node(T data) 
					{
						this.data=data;
					}
					public Node(Integer key, T data)
					{
						this.key=key;
						this.data=data;
					}
			}
	
			public Node[] table;
			public int size;
			Node head;
		
		
		public void HashChaining(int Size)
		{
			table = new Node[Size];
			size=0;
		}
		
		public boolean isEmpty() {
			return size==0;
		}
		
			public  void insert(int val)
			{
				size++;
				int pos=myhash(val);
				Node n = new Node(val);
				if(table[pos]==null)
					table[pos]=n;
				else
				{
					n.next=table[pos];
					table[pos]=n;
				}
			}

			public void remove(int val)
			{
					int pos = myhash(val);
					Node temp = table[pos];
					Node previous = null;
					Integer t = (Integer) temp.data;
					if(temp.data.equals(temp)) 
					{
						head = temp.next;
						return;
					}
					while(temp!=null)
					{
						t = (Integer) temp.data;
						if(t.equals(val))
							break;
						else
							previous = temp;
						temp=temp.next;
					}
					previous.next = temp.next;
			}
			
			public int myhash(int value) 
			{
				int hashVal=value;
				hashVal = hashVal % table.length;
				return hashVal;
			}
		
			public void display() {
				for(int i=0;i<table.length;i++) {
						System.out.print(i+" : ");
					Node t = table[i];
					while(t!=null) {
						System.out.print(t.data+" ");
						t=t.next;
					}
						System.out.println();
				}
			}
		
			public void write() throws Exception
			{
				try { PrintStream o = new PrintStream(new File("/home/admin28/Desktop/supzz"));
				System.setOut(o);
				for(int i=0;i<table.length;i++) {
					System.out.print(i+" : ");
					Node t =table[i];
				while(t!=null) {
					System.out.print(t.data+" ");
					t=t.next;
				}
				System.out.println();
				}
				}catch(Exception e) {
					System.out.println("Oops!, Something went wrong");
				}
			}
		
		public  void search(int value)
		{
				int pos = myhash(value);
				Integer data = value;
				int c=0;
				Node t = table[pos];
				while(t!=null) 
				{
					if(t.data.equals(data))
					{
						c++;
						break;
					}
					t=t.next;
				}
				if(c>0)
				{
					System.out.println("File found at table position "+pos+"\nfile removed");
					remove(value);
				}
				else 
				{
					System.out.println("File not found\nfile added");
					insert(value);
				}
				
		}
		
		
		
    }

			//method for unordered list simply linked list

public static class Unorderlist
{

	
	/******Data Structure Programs******/
	  /*****Unorderd list using Generics*****/


	static Node head;

	public static class Node
	{
	String data;
	Node next;
	Node(String data2)
	{

	   data = data2;
	next = null;
	}
	}

	/*****Code for Inserting a Node*****/

	   public static String insert(String data)
	{
	Node new_node=new Node(data);
	new_node.next=null;
	if(head==null)
	{
	head=new_node;
	}
	else
	{
	Node p=head;
	while(p.next!=null)
	{
	p=p.next;
	}
	p.next=new_node;


	}
	return null;
	}
	   
	   /*****Code for Inserting a Node at the Beginning*****/
	   
	   public static String inserAtBeg(String data)
	{
	Node new_node=new Node(data);
	if(head==null)
	{
	return data;
	}
	else
	{
	head=new_node;
	new_node.next=null;
	}
	return data;
	}
	   
	   /*****Code for Inserting a Node at the given Position*****/
	   
	   public static String insertAtPosition(String data,int position)
	{
	//int size=p.length();
	Node new_node=new Node(data);
	Node p=head;
	if(position==1)
	{
	head=new_node;
	new_node.next=null;
	return data;
	}
	for(int i=0;i<position-1 && p!=null;i++)
	{
	p=p.next;
	}
	new_node.next=p.next;
	p.next=new_node;

	return data;
	}

	       /*****Code for Removing the Duplicate Element*****/
	   
	   public static void removeDuplicate()
	   {  
	       
	       Node p= head;
	       Node index = null;
	       Node temp = null;  
	 
	       if(head == null)
	       {  
	           return;  
	       }  
	       
	       else
	       {  
	         
	       while(p!= null)
	          {  
	              temp = p;  
	              index = p.next;  
	 
	       while(index != null)
	       {  
	                   
	       if(p.data == index.data)
	         {  
	     
	      temp.next = index.next;  
	     
	        }
	     
	         else
	         {  
	            temp = index;  
	                   }  
	                   index = index.next;  
	               }  
	               p = p.next;  
	           }  
	       }  
	   }  
	   
	   /*****Code for deleting an Element directly*****/
	   
	   public static void delete(String key)
	   {
	       // Store head node
	       Node p = head;
	        Node prev = null;
	 
	       // If head node itself holds the key to be deleted
	       if (p != null && p.data == key)
	       {
	           head = p.next; // Changed head
	           return;
	       }
	 
	       // Search for the key to be deleted, keep track of the
	       // previous node as we need to change temp.next
	       while (p != null && p.data != key)
	       {
	           prev = p;
	           p = p.next;
	       }    
	 
	       // If key was not present in linked list
	       if (p == null) return;
	 
	       // Unlink the node from linked list
	       prev.next = p.next;
	   }
	   
	   /*****Code for Deleting the Node at given position*****/
	   
	  public void deleteNode(int position)
	   {
	       if (head == null)
	           return;
	 
	     
	       Node p = head;
	 
	       
	       if (position == 0)
	       {
	           head = p.next;  
	           return;
	       }
	 
	       
	       for (int i=0; p!=null && i<position-1; i++)
	           p = p.next;
	 
	       // If position is more than number of ndoes
	       if (p == null || p.next == null)
	           return;
	 
	      Node next = p.next.next;
	 
	       p.next = next;  
	   }
	   
	   /*****Code for Seraching an Element
	    * @return *****/
	   
	   public static  String search(String x)
	   {
	boolean flag=false;
	       Node p = head;    
	       if(head==null)
	       {
	        System.out.println("List is Empty");
	       }
	       while (p != null)
	       {
	           if (p.data == x)
	              flag=true;  
	     
	           p = p.next;
	       }
	      if(flag)
	       {
	        System.out.println("Data is Present");
	        delete(x);
	       
	       }
	       else
	       {
	        System.out.println("Not Present");
	        insert(x);
	       }
	return x;
	       

	   }

	/*****Code to Find the Length of the LinkedList*****/
	   
	   
	public static int length()
	{
	int count=0;
	if(head==null)
	{
	return 0;
	}
	else
	{

	Node p=head;
	while(p!=null)
	{
	p=p.next;
	count++;
	}
	}
	return count;
	}

	      /*****Code to Display the linkedlist*****/

	public static void  display()
	{
	Node p=head;
	while(p!=null)
	{
	System.out.println(p.data+ "\t");
	p=p.next;
	}
	System.out.println();
	}


  }		



			//method for ordered list



		public static class OrderedList<P>
		{
				static Node head;
				
				public static class Node
				{
					int data;
					Node next;
					Node(int d)
					{
						  data = d;
							next = null;
					 
					}
				}

					/*****Code for Inserting a Node*****/

		    public static int insert(int data)
		{
		Node new_node=new Node(data);
		new_node.next=null;
		if(head==null)
		{
		head=new_node;
		}
		else
		{
		Node p=head;
		while(p.next!=null)
		{
		p=p.next;
		}
		p.next=new_node;
		
		
		}
		return data;
		
		}
   
    /*****Code for Inserting a Node at the Beginning*****/
		   
		    public static int inserAtBeg(int data)
		{
		Node new_node=new Node(data);
		if(head==null)
		{
		return data;
		}
		else
		{
		head=new_node;
		new_node.next=null;
		}
		return data;
		}
		   
		    /*****Code for Inserting a Node at the given Position*****/
   
			    public static int insertAtPosition(int data,int position)
			{
			//int size=p.length();
			Node new_node=new Node(data);
			Node p=head;
			if(position==1)
			{
			head=new_node;
			new_node.next=null;
			return data;
			}
			for(int i=0;i<position-1 && p!=null;i++)
			{
			p=p.next;
			}
			new_node.next=p.next;
			p.next=new_node;
			
			return data;
			}

			    /*****Code for Removing the Duplicate Element*****/
   
		    public static void removeDuplicate()
		    {  
		         
		        Node p= head;
		        Node index = null;
		        Node temp = null;  
		 
		        if(head == null)
		        {  
		            return;  
		        }  
		       
		        else
		        {  
		           
		        while(p!= null)
		           {  
		               temp = p;  
		               index = p.next;  
		 
		        while(index != null)
		        {  
		                   
		        if(p.data == index.data)
		          {  
		     
		        temp.next = index.next;  
		       
		         }
		     
		          else
		          {  
		             temp = index;  
		                    }  
		                    index = index.next;  
		                }  
		                p = p.next;  
		            }  
		        }  
		    }  
   
		    /*****Code for deleting an Element directly*****/
	   
	    public static void delete(int key)
	    {
	       
	        Node p = head;
	         Node prev = null;
	 
	       
	        if (p != null && p.data == key)
	        {
	            head = p.next;
	            return;
	        }
	 
	       
	        while (p != null && p.data != key)
	        {
	            prev = p;
	            p = p.next;
	        }    
	 
	       
	        if (p == null) return;
	 
	       
	        prev.next = p.next;
	    }
	   
	    /*****Code for Deleting the Node at given position*****/
   
		   public void deleteNode(int position)
		    {
		        if (head == null)
		            return;
		 
		       
		        Node p = head;
		 
		       
		        if (position == 0)
		        {
		            head = p.next;  
		            return;
		        }
		 
		       
		        for (int i=0; p!=null && i<position-1; i++)
		            p = p.next;
		 
		        // If position is more than number of ndoes
		        if (p == null || p.next == null)
		            return;
		 
		       Node next = p.next.next;
		 
		        p.next = next;  
		    }
   
		   	/*****Code for Seraching an Element*********/
   
   
		    public static  int search(int x)
		    {
		    	boolean flag=false;
		        Node p = head;    
		        if(head==null)
		        {
		        System.out.println("List is Empty");
		        }
		        while (p != null)
		        {
		            if (p.data == x)
		               flag=true;  
		       
		            p = p.next;
		        }
		       if(flag)
		        {
		        System.out.println("Data is Present");
		        delete(x);
		       
		        }
		        else
		        {
		        System.out.println("Not Present");
		        insert(x);
		        }
		       return x;
		       
		
		    }

		    	/*****Code to Find the Length of the LinkedList*****/
   
   
			public  int length()
			{
			int count=0;
			if(head==null)
			{
			return 0;
			}
			else
			{
			
			Node p=head;
			while(p!=null)
			{
			p=p.next;
			count++;
			}
			}
			return count;
			}

				/*****Code to Display the linkedlist*****/
		
				public static void  display()
		{
		Node p=head;
		while(p!=null)
		{
		System.out.println(p.data+ "\t");
		p=p.next;
		}
		System.out.println();
		}
					/*****Code to Sort the LinkedList*****/
		    public void sortList()
		    {  
		       
		        Node p = head;
		        Node index = null;  
		        int temp;  
		         
		        if(head == null)
		        {  
		            return;  
		        }  
		        else
		        {  
		            while(p != null)
		            {  
		               
		                index = p.next;  
		                 
		                while(index != null)
		                {  
		                   
		                    if(p.data > index.data)
		                    {  
		                        temp = p.data;  
		                        p.data = index.data;  
		                        index.data = temp;  
		                    }  
		                    index = index.next;  
		                }  
		                p = p.next;  
		            }      
		        }  
		    }
		    
		    
		    
		}

	
}


