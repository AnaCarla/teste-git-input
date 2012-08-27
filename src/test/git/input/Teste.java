package test.git.input;
/**

 * @author Ana Carla
 * 
 * @Verifica respostas e notas dos alunos
 */
public class Teste {
	
	private String resposta;
	private float nota;
	private int codigo_aluno;
	
		public Teste(int codigo_aluno, String resposta, float nota){
		
			this.resposta=resposta;
			this.codigo_aluno= codigo_aluno;
			this.nota= nota;
			
		}
		public void ImprimiTeste(){
			
			System.out.println("\t\t\tTeste\t\t\t\n");
			System.out.println("Aluno: " + codigo_aluno);
			System.out.println("Pergunta 1: "+ resposta);
			System.out.println("Nota: " + nota);
							
		}
		
		
		

}
