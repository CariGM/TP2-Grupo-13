package fi.unju.edu.ar.enunciado7;

public class Secuencia {

    public static void main(String[] args) {   
        int j=41;
        int b=2;
        for(int i=39;i>=-39;i=i-b)
        {
            j=j + i;
            System.out.println(j);
        }
    }
}