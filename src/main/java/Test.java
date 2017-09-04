import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author jmaldonado
 *
 */
public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in) );
		System.out.println( "Ingrese un numero" );
		int numero = Integer.parseInt( br.readLine() );
		System.out.println( numero );
		
		String[] a = new String[1];
		a[0] = "xxx";
		System.out.println( a[0] );
		
		int area = 1;
		switch( area ){
			case 1 : {
				System.out.println("area 1");
			} 
		}
		

		
	}

}
