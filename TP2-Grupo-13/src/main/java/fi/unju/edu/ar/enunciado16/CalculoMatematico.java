package fi.unju.edu.ar.enunciado16;

public class CalculoMatematico {
	public int calcularSumatoria(int num){
		int res=0;
		for(int i=1;i<=num;i++) {
			res = res + (((i*(i+1))/2)^2);
		}
		return res;
	}
	public int calcularProductoria(int num){
		int cal=0;
		for(int i=1;i<=num;i++) {
			cal = cal + (i * (i + 4));
		}
		return cal;
	}
}
	