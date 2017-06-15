package first;

import java.util.Scanner;

public class MassiveWords {

	public static void main(String[] args) {

		String stih = new String(
				"Грубым даётся радость, \n Нежным даётся печаль. \n Пустота \n Летите в выси дальние стран даётся \n Каждый хочет быть пилотом и космонавтом так то");

		Scanner sc = new Scanner(System.in);
		String ar[][] = new String[6][9];
		int a = 0;
		int b = 0;
		String q;

		for (String retval : stih.split(" ")) {
			boolean c = retval.contentEquals("\n");
			if (c == true) {
				a++;
				b = 0;
				System.out.println();
			} else {

				System.out.printf("%10s", ar[a][b] = retval + "\t");
				b++;
			}

		}
		System.out.println();
		System.out.println("\n Введите искомое значение");
		q = sc.next();
		System.out.println("Координаты этого слова");
		int s = 0;

		for (a = 0; a < 6; a++) {
			for (b = 0; b < 9; b++) {
				if (ar[a][b] != null) {
					s = ar[a][b].indexOf(q);
					if (s != -1) {
						System.out.println(a + " " + b);
					}
				}
			}
		}

	}

}
