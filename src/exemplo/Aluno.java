package exemplo;

public class Aluno {
	private static String nome;
	private static int ra;
	
	public Aluno(String nome, int ra) {
		this.nome = nome;
		this.ra = ra;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", ra=" + ra + "]";
	}
	
}
