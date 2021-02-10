public class Excercise {
	public static double[] sum(double[][] mat) {
	    double[] res = new double[mat[0].length];
        for (int i=0; i < mat.length; i++){
            for (int j=0; j < mat[i].length; j++){
	            res[j] += mat[i][j];
	        }
	    }
	return res;	
	}
}