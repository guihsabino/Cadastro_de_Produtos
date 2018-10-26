import java.util.ArrayList;

public class ListaProdutos {

	public ListaProdutos() {
		
		ArrayList<String>ListadeProdutos = new ArrayList<String>();
		
		ListadeProdutos.add("Piso");
		ListadeProdutos.add("Areia");
		ListadeProdutos.add("Tijolo");
		
		while(!ListadeProdutos.isEmpty()) {
			System.out.println(ListadeProdutos.remove(0));
		}

	}
	
}
