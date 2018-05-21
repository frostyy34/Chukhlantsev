import java.util.Scanner;
import java.lang.Math;

public class Lab1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[][] mas = new double[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Vvedite " + ((j == 0) ? "x":"") + ((j == 1) ? "y":"") + ((j == 2) ? "z":"") + " dlya tochki " + (i+1));
				if(in.hasNextDouble())
					mas[i][j] = in.nextDouble();
				else
					System.exit(0);
			}
		}
		in.close();
		Point3d p1 = new Point3d(mas[0][0], mas[0][1], mas[0][2]);
		Point3d p2 = new Point3d(mas[1][0], mas[1][1], mas[1][2]);
		Point3d p3 = new Point3d(mas[2][0], mas[2][1], mas[2][2]);
		double answer = heron(p1, p2, p3);
		System.out.println("Ploshad treugolnika po formule Gerona ravna: " + answer);
	}

	public static double heron(Point3d p1, Point3d p2, Point3d p3) {
		double a = p1.distanceTo(p2);
		double b = p2.distanceTo(p3);
		double c = p3.distanceTo(p1);
		double p = (a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
