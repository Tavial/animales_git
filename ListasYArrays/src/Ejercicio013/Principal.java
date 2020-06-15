package Ejercicio013;

/*        | 1  2  3 |          | -1  0 |
 *   A =  |         |      B = |  0  1 |
 *        | 4  5  6 |          |  1  1 |
 *        
 *        Calcular su producto
 *         
 */

public class Principal {
	
	public static void main (String [] args) {
	
		int [][] A = {{1,2,3},{4,5,6}};
		int [][] B = {{-1,0},{0,1},{1,1}};
		int [][] C = new int [2][2];
		
		System.out.println ("Matriz A ");
		System.out.println ("---------");
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				System.out.print (A[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println ("Matriz B ");
		System.out.println ("---------");
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<2; j++) {
				System.out.print (B[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println ("Matriz C ");
		System.out.println ("---------");
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				System.out.print (C[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println ("Matriz C = A * B ");
		System.out.println ("-----------------");
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				for (int k=0; k<3; k++) {
					C[i][j]=C[i][j]+(A[i][k]*B[k][j]);
				}
				
			}
		}
		for (int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				System.out.print (C[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
	
	
	

}
