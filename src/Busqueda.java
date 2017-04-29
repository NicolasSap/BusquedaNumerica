import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Busqueda {
	private String n1;
	private String n2;
	private int l1;
	private int l2;
	private List<Integer> soluciones = new ArrayList<Integer>();
	
	public Busqueda(String path) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(path));
		l1=sc.nextInt();
		n1=String.valueOf(sc.nextInt());
		l2=sc.nextInt();
		n2=String.valueOf(sc.nextInt());
		sc.close();
	}
	
	public List<Integer> resolver(){
		
		String cortada[] = new String[l2];
		String aBuscar[] = n2.split("");
		Arrays.sort(aBuscar);
		for (int i = 0; i < n1.length(); i++) {
			if(i+l2 > l1){
				return soluciones;
			}
			cortada=(n1.substring(i, i+l2)).split("");
			Arrays.sort(cortada);
//			if((cortada.toString()).equals(aBuscar.toString())){
			if((Arrays.toString(cortada)).equals(Arrays.toString(aBuscar))){
				soluciones.add(i+1);
			}
		}
		return soluciones;
	}

	public String getN1() {
		return n1;
	}

	public void setN1(String n1) {
		this.n1 = n1;
	}

	public String getN2() {
		return n2;
	}

	public void setN2(String n2) {
		this.n2 = n2;
	}

	public int getL1() {
		return l1;
	}

	public void setL1(int l1) {
		this.l1 = l1;
	}

	public int getL2() {
		return l2;
	}

	public void setL2(int l2) {
		this.l2 = l2;
	}

	public List<Integer> getSoluciones() {
		return soluciones;
	}

	public void setSoluciones(List<Integer> soluciones) {
		this.soluciones = soluciones;
	}

	
	
}
