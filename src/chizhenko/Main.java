package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Integer xA = 0;	
		Integer yA = 0;
		
		Integer xB = 4;
		Integer yB = 4;

		Integer xC = 6;
		Integer yC = 1;

		Integer xP;
		Integer yP;

		Integer temp1;
		Integer temp2;
		Integer temp3;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the coordinate x:");
		xP = sc.nextInt();
		System.out.println("Enter the coordinate y:");
		yP = sc.nextInt();

		sc.close();

		temp1 = (xA - xP) * (yB - yA) - (xB - xA) * (yA - yP);
		temp2 = (xB - xP) * (yC - yB) - (xC - xB) * (yB - yP);
		temp3 = (xC - xP) * (yA - yC) - (xA - xC) * (yC - yP);

		if ((temp1 >= 0 && temp2 >= 0 && temp3 >= 0) || (temp1 <= 0 && temp2 <= 0 && temp3 <= 0)) {
			System.out.println("point inside triangle");
		} else {
			System.out.println("point outside the triangle");
		}

	}

}
