import java.util.Arrays;

public class WorkMatrix {
	private int[][] matrix;

	public WorkMatrix(int[][] matrix) {
		this.setMatrix(matrix);
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}
	int[] addElement(int[] org, int added){
		int[] result = Arrays.copyOf(org, org.length + 1);
		result[org.length] = added;
		return result;
	}
	public int SumaMatrix(){
		int s = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				s=s+matrix[i][j];
			}
		}
		return s;
	}
	public int Pare(){
		int par=0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j]%2==0)
						par=par+1;
				
			}
		}
		return par;
	}

public int imPare(){
	int impar = 0;
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++) {
			if (matrix[i][j]%2!=0 )
					impar=impar+1;
			
		}
	}
	return impar;
} 

public int MaxMatrix() {
	int max = matrix[0][0];
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++) {
			if (max < matrix[i][j])
				max = matrix[i][j];
		}
	} 

	return max;}


public int MinMatrix() {
	int min = matrix[0][0];
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++) {
			if (min > matrix[i][j])
				min = matrix[i][j];
		}
	}
	return min;}


public int[] Odd(int[][] matrix) // afiseaza elementele impare
{
	int[] temp = new int[0];
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++) {
			if (matrix[i][j] % 2 != 0) {
				temp = addElement(temp, matrix[i][j]);
			}
		}
	}
	return temp;
}

public int[] Even(int[][] matrix) //afiseaza elementele pare
{
	int[] temp = new int[0];
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++) {
			if (matrix[i][j] % 2 == 0) {
				temp = addElement(temp, matrix[i][j]);
			}
		}
	}
	return temp;}

public int Prim() {
	int prim = 0;
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++) {
			for (int k = 2; 4 * k < matrix.length; k++)
				if (matrix[i][j] % k == 0)
					prim=prim+1;
		}
	}

	return prim;
}
public int[] AfisPrim(int[][] matrix) // afiseaza nr prime
{

	int[] temp = new int[0];
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++) {
			for (int k = 2; 4 * k < matrix.length; k++)
				if (matrix[i][j] % k == 0) {
					temp = addElement(temp, matrix[i][j]);
				}
		}
	}
	return temp;
}
public double PatratPerf() {
	double a = 0, pperf = 0;
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++) {
			a = Math.sqrt(matrix[i][j]);
			if (matrix[i][j] / a == a)
				pperf=pperf+1;
		}
	}

	return pperf;
}
public int[] AfisPatratPerf(int[][] matrix) // afiseaza nr patrate perfecte
{
	double a = 0;
	int[] temp = new int[0];
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++) {
			a = Math.sqrt(matrix[i][j]);
			if (matrix[i][j] / a == a) {
				temp = addElement(temp, matrix[i][j]);
			}
		}
	}
	return temp;
}
public int SumaPare() {
	int s = 0;
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++) {
			if (matrix[i][j] % 2 == 0)
				s += matrix[i][j];
		}
	}
	return s;
}

public int SumaImpare() {
	int s = 0;
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++) {
			if (matrix[i][j] % 2 != 0)
				s += matrix[i][j];
		}
	}
	return s;
}
public int nrpalindrom(int[][] matrix) {
	int nr = 0;
	int x = 0;
	int n;
	for (int i = 0; i < matrix.length; i++)
		for (int j = 0; j < matrix.length; j++) {
			n = 0;
			x = matrix[i][j];
			while (x != 0) {
				n = n * 10 + x % 10;
				x = x / 10;
			}
			if (matrix[i][j] == n)
				nr++;
		}
	return nr;
}
public int SumaPatrate() {
	double a = 0;
	int s = 0;
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++) {
			a = Math.sqrt(matrix[i][j]);
			if (matrix[i][j] / a == a)
				s= s+ matrix[i][j];
		}
	}

	return s;
}


public int SumaPrime() {
	int s = 0;
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++) {
			for (int k = 2; 4 * k < matrix.length; k++)
				if (matrix[i][j] % k == 0)
					s= s+ matrix[i][j];
		}
	}

	return s;
}
public int DiagPrinc() {
	int s = 0;
	for (int i = 0; i < matrix.length; i++)
		s = s + matrix[i][i];

	return s;
}

public int DiagSec() {
	int s = 1;
	for (int i = 0; i < matrix.length; i++)
		s =s+ matrix[i][matrix.length - i - 1];

	return s;
}
public int SumaElDiagP() {
	int s = 0;
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++)
			if (i < j)
				s =s+ matrix[i][j];
	}

	return s;

}

public String CompDiag() {

	if (DiagPrinc() == DiagSec())
		return "Sumele sunt egale" + "		" + DiagPrinc() + "=" + DiagSec();
	else
		return "Sumele nu sunt egale" + "		" + DiagPrinc() + "!=" + DiagSec();

}


public String SumLin() {
	int s1 = 0, s2 = 0, L1 = 0, L2 = 0, ok = 0;
	for (int i = 0; i < matrix.length; i++)
		s1 = s1 + matrix[L1][i];
	for (int i = 0; i < matrix.length; i++)
		s2 = s2 + matrix[L2][i];
	for (int i = 0; i < matrix.length; i++)
		if (matrix[L1][i] != matrix[L2][i])
			ok = 0;
	if (ok == 0)
		return "Exista linii cu sume identice";
	else
		return "Nu exista linii cu sume identice";
}

public String SumCol() {
	int s1 = 0, s2 = 0, L1 = 0, L2 = 0, ok = 0;
	for (int j = 0; j < matrix.length; j++)
		s1 = s1 + matrix[L1][j];
	for (int j = 0; j < matrix.length; j++)
		s2 = s2 + matrix[L2][j];
	for (int j = 0; j < matrix.length; j++)
		if (matrix[L1][j] != matrix[L2][j])
			ok = 0;
	if (ok == 0)
		return "Exista coloane cu sume identice";
	else
		return "Nu exista coloane cu sume identice";
}

public int[][] Afis2Matrix(int[][] matrix) {
	int x;
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++) {
			x= matrix[i][j] + i + j;
			matrix[i][j] = x;

		}
	}
	return matrix;
}
public int[] AfisLin(int[][] matrix) {
	
	System.out.println("Introduceti numarul liniei: ");
	int a = sc.nextInt();

	int[] temp = new int[0];

	for (int j = 0; j < matrix.length; j++) {
		temp = addElement(temp, matrix[a][j]);
	}
	return temp;
}

public int[] AfisCol(int[][] matrix) {
	
	System.out.println("Introduceti numarul coloanei: ");
	int a = sc.nextInt();
	int[] temp = new int[0];
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix.length; j++)
			if (j == a) {
				temp = addElement(temp, matrix[i][a]);

			}

	}
	return temp;
}


}



