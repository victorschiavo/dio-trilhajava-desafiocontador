public class ParametrosInvalidosException extends  Exception { 
    public ParametrosInvalidosException(String string) {
		super("O segundo parâmetro deve ser maior que o primeiro");
	}
}
