import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int s = 1;; s++){
			int z, i, m, l;
			z = sc.nextInt();
			i = sc.nextInt();
			m = sc.nextInt();
			l = sc.nextInt();
			if(z == 0 && i ==0 && m == 0 && l == 0){break;}
			System.out.println("Case " + s + ": " + countCycle(z, i, m, l));
		}
	}

	public static int countCycle(int Z, int I, int M, int L){
		List<Integer> list = new ArrayList<Integer>();
		while(!list.contains(L)){
			list.add(L);
			L = (Z * L + I) % M;
		}

		return list.size() - list.indexOf(L);
	}
}