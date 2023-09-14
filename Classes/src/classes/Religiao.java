package classes;

public class Religiao {
	String tipoDeReligiao,paisDeOrigem,idade;
	
	public void definirTipoDeReligiao(String novoTipoDeReligiao) {
		this.tipoDeReligiao=novoTipoDeReligiao;
	}	
	
	public String obterTipoDeReligiao() {
		return this.tipoDeReligiao;
	}
	
	public void definirPaisDeOrigem(String novoPaisDeOrigem) {
		this.paisDeOrigem=novoPaisDeOrigem;
	}	
	
	public String obterPaisDeOrigem() {
		return this.paisDeOrigem;
	}
	
	public void definirIdade(String novoIdade) {
		this.idade=novoIdade;
	}	
	
	public String obterIdade() {
		return this.idade;
	}

}
