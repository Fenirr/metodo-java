package metodo3;
import java.util.Scanner;
public class ejemplo2 {
public static void main(String args[]){	
	int resultado;
		resultado= multiplicacion();
		System.out.println("la multiplicacion es:"+resultado);
	}

		public static int multiplicacion(){
			Scanner sc = new Scanner(System.in);
			int o;
			System.out.println("tecle el primer digito");
			o=sc.nextInt();
			int k;
			System.out.println("tecle el segundo digito");
			k=sc.nextInt();
			int multiplicar=o*k;
			return multiplicar;

}
}
