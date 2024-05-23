import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        	
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = input.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = input.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());

		}
		
	
}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		    if(parametroUm >= parametroDois){
            throw new ParametrosInvalidosException(null);
        }
		
		int contagem = parametroDois - parametroUm;

        for(int i = 1; i <= contagem; i++) {
            System.out.println("Numero: " + i);
        }
		
    }
}
