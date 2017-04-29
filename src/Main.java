import java.io.FileNotFoundException;

import java.util.List;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Busqueda b = new Busqueda("entrada.in");
		List<Integer> sol = b.resolver();
		for (int i = 0; i < sol.size(); i++) {
			System.out.println(sol.get(i));
		}
	}

}
