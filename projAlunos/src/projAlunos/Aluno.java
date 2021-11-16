package projAlunos;

public class Aluno {
 private String nome;
 private int matricula;
 private float nota1;
 private float nota2;
 private float nota3;
 private float media;
 private String situacao;
 
 public void mostradado() {
	 System.out.println(nome+" "+matricula);
	 
 }
 
 public void setnome(String novonome) {
	 nome=novonome;
 }

 public void setmat(int novmat) {
	matricula=novmat;
 }

 public void setnota(float n1, float n2, float n3 ) {
	 nota1 = n1;
	 nota2 = n2;
	 nota3 = n3;
 }
 
 public void calcularmed() {
	media = (4*nota1)+(5*nota2)+(6*nota3)/15;
	System.out.println(media);
 }
 
 public boolean busAluno(int matricula) {
	 return true;
 }
 
 public String getnome() {
	 return nome;
 }
 
 public float getnota1() {
	 return nota1;
 }

 public float getnota2() {
	 return nota2;
 }
 
 public float getnota3() {
	 return nota3;
 }
 
 public float getmedia() {
	 return media;
 }
 
 public String getsituacao() {
	 
	 
	 return situacao;
 }



}


