package br.com.projeto.util.todos;

public enum EstatusPersistencia {
	
	ERRO("Erro"), SUCESSO("Sucesso"), 
	OBJETO_REFERENCIADO("Esse objeto não pode se apagado por possuir referências ao mesmo.");
	
	private String name;
	
	private EstatusPersistencia(String s) {
		this.name = s;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}
