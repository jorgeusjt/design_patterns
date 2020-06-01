package exemplo;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno("João", 1));
		alunos.add(new Aluno("Maria", 2));
		alunos.add(new Aluno("Fernanda", 3));
		alunos.add(new Aluno("Roberto", 4));
		alunos.add(new Aluno("André", 5));
		alunos.add(new Aluno("Fábio", 6));
		alunos.add(new Aluno("Júlia", 7));
		alunos.add(new Aluno("Camila", 8));
		
		for(Aluno a:alunos) {
			System.out.println(a);
		}

	}

}
