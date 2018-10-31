package devPkg;

import java.util.Scanner;

public class Out2 {
	int a=0;
	int b=0;
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	Scanner scan1= new Scanner(System.in);
	System.out.println("Введите значение  а");
	if (scan.hasNextInt()) {
	else {
		System.out.println(" а не есть целым числом");
	}
	}
	 a=scan.nextInt();
	
	if (a>b) {
		System.out.println(a)
	}else {
		System.out.println(b);
		
	}
	}

}
