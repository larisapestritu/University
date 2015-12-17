


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
		int s = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if matrix[i][j]%2=0 
						par=par+1;
				
			}
		}
		return par;
	}
}
