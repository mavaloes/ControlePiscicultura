package br.com.projeto.util.todos;

public enum EstatusPersistencia {
	
	ERRO("Erro"), SUCESSO("Sucesso"), 
	OBJETO_REFERENCIADO("Esse objeto n�o pode se apagado por possuir refer�ncias ao mesmo.");
	
	private String name;
	
	private EstatusPersistencia(String s) {
		this.name = s;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
