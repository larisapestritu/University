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
}


