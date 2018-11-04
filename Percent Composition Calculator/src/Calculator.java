import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner thing = new Scanner(System.in);
		
		System.out.print("C: ");
		double C = thing.nextDouble();
		System.out.print("H: ");
		double H = thing.nextDouble();
		System.out.print("N: ");
		double N = thing.nextDouble();
		System.out.print("O: ");
		double O = thing.nextDouble();
		System.out.println("");
		
		double nC = C / 12.01;
		double nH = H / 1.01;
		double nN = N / 14.01;
		double nO = O / 16;
		
		//if()
		
		if (nC < nH && nC < nN && nC < nO) {
			System.out.println("C: " + nC + "mol");
			System.out.println("H: " + nH + "mol");
			System.out.println("N: " + nN + "mol");
			System.out.println("O: " + nO + "mol");
			System.out.println("");
			
			nH = nH / nC;
			nN = nN / nC;
			nO = nO / nC;
			nC = nC / nC;
			
			System.out.println("C: " + nC);
			System.out.println("H: " + nH);
			System.out.println("N: " + nN);
			System.out.println("O: " + nO);
		}else if (nH < nC && nH < nN && nH < nO) {
			System.out.println("C: " + nC + "mol");
			System.out.println("H: " + nH + "mol");
			System.out.println("N: " + nN + "mol");
			System.out.println("O: " + nO + "mol");
			System.out.println("");
			
			nC = nC / nH;
			nN = nN / nH;
			nO = nO / nH;
			nH = nH / nH;
			
			System.out.println("C: " + nC);
			System.out.println("H: " + nH);
			System.out.println("N: " + nN);
			System.out.println("O: " + nO);
		}else if (nN < nC && nN < nH && nN < nO) {
			System.out.println("C: " + nC + "mol");
			System.out.println("H: " + nH + "mol");
			System.out.println("N: " + nN + "mol");
			System.out.println("O: " + nO + "mol");
			System.out.println("");
			
			nC = nC / nN;
			nH = nH / nN;
			nO = nO / nN;
			nN = nN / nN;
			
			System.out.println("C: " + nC);
			System.out.println("H: " + nH);
			System.out.println("N: " + nN);
			System.out.println("O: " + nO);
		}else if (nO < nC && nO < nH && nO < nN) {
			System.out.println("C: " + nC + "mol");
			System.out.println("H: " + nH + "mol");
			System.out.println("N: " + nN + "mol");
			System.out.println("O: " + nO + "mol");
			System.out.println("");
			
			nC = nC / nO;
			nH = nH / nO;
			nN = nN / nO;
			nO = nO / nO;
			
			System.out.println("C: " + nC);
			System.out.println("H: " + nH);
			System.out.println("N: " + nN);
			System.out.println("O: " + nO);
		}
		
	}
}
