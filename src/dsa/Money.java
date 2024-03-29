package dsa;

import java.util.Scanner;

public class Money {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resto;
        double N;
        N = sc.nextDouble();
        resto = (int) (N * 100.0 + 0.5);

        System.out.println("NOTAS:");
        var notas = new int[]{100, 50, 20, 10, 5, 2};
        for (var nota : notas)
            resto = notasResto(resto,nota);

        System.out.println("MOEDAS:");
        var moedas = new int[]{100, 50, 25, 10, 5};
        for (var moeda : moedas)
            resto = moedasResto(resto,moeda);
        System.out.println(resto + " moeda(s) de R$ 0.01");

        sc.close();
    }

    private static int notasResto(int resto, int nota) {
        int quociente = resto / (nota * 100);
        System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
        resto = resto % (nota * 100);
        return resto;
    }

    private static int moedasResto(int resto, int moeda) {
        int quociente = resto / moeda;
        System.out.println(quociente + " moeda(s) de R$ " + String.format("%.2f", moeda/100.0));
        resto = resto % moeda;
        return resto;
    }
}

/*
Input: 576,73
Output:
NOTAS:
5 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
1 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
1 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1,00
1 moeda(s) de R$ 0,50
0 moeda(s) de R$ 0,25
2 moeda(s) de R$ 0,10
0 moeda(s) de R$ 0,05
3 moeda(s) de R$ 0.01
*/

/*resto = notasResto(resto,100);

resto = notasResto(resto,50);

resto = notasResto(resto,20);

resto = notasResto(resto,10);

resto = notasResto(resto,5);

resto = notasResto(resto,2);

resto = moedasResto(resto, 100);

resto = moedasResto(resto, 50);

resto = moedasResto(resto, 25);

resto = moedasResto(resto, 10);

resto = moedasResto(resto, 5);

---

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double N;
		int quociente, resto, nota, moeda;

		N = sc.nextDouble();

		resto = (int) (N * 100.0 + 0.5);

		System.out.println("NOTAS:");

		nota = 100;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);

		nota = 50;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);

		nota = 20;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);

	  nota = 10;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);

		nota = 5;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);

		nota = 2;
		quociente = resto / (nota * 100);
		System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
		resto = resto % (nota * 100);

		System.out.println("MOEDAS:");

		moeda = 100;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 1.00");
		resto = resto % moeda;

		moeda = 50;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.50");
		resto = resto % moeda;

		moeda = 25;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.50");
		resto = resto % moeda;

		moeda = 10;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.50");
		resto = resto % moeda;

		moeda = 5;
		quociente = resto / moeda;
		System.out.println(quociente + " moeda(s) de R$ 0.50");
		resto = resto % moeda;

		System.out.println(resto + " moeda(s) de R$ 0.01");

		sc.close();
	}
}
*/