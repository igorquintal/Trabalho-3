import java.util.*;

public class Inventory {
	
	private class Pair {		/*CRIADA PARA SER IGUALA FUNCAO PAIR DE C++*/

		public Item first;			/*ATRIBUTO PUBLICO, PARA FICAR IGUAL A C++ (PRIMEIRO: ITEM)*/
		public boolean second;		/*ATRIBUTO PUBLICO, PARA FICAR IGUAL A C++ (SEGUNDO: BOOLEAN)*/

		public Pair(Item item, boolean equip) {		/*CONSTRUTOR DE PAIR*/

			this.first = item;
			this.second = equip;
		}

	}

	/*ATRIBUTOS*/
	private int spaces;					/*NUMERO DE ESPAÇOS DO INVENTARIO*/
	private double gold;				/*GOLD DO INVENTARIO*/
	private ArrayList<Pair> items;		/*ARRAYLIST DE TIPO PAIR*/

	/*CONSTRUTOR*/
	public Inventory () {

		spaces = 0;
		gold = 0;
		items = new ArrayList<Pair>();
	}

	/*RETORNA TODA A QUANTIA DE GOLD NO INVENTÁRIO*/
	public double getTotalGold () {

		return gold;
	}

	/*RETORNA TODOS OS ESPAÇOS LIVRES NO INVENTÁRIO*/
	public int getAvaiablespace () {

		return spaces-items.size();
	} 

	/*DIMINUI A QUANTIA DE GOLD*/
	public void spendGold (double gold) {

		this.gold = this.gold - gold;
	}

	/*AUMENTA A QUANTIA DE GOLD*/
	public void earnGold (double gold) {

		this.gold = this.gold + gold;
	}

	/*DECLARA QUANTOS ESPAÇOS DEVE TER O INVENTÁRIO*/
	public void setSpaces (int spaces) {

		this.spaces = spaces;
	}

	/*IMPRIME TODOS OS ITENS DO INVENTARIO*/
	public void printAllItems() {

		System.out.println("IMPRIMINDO OS ITENS NO INVENTARIO: ");

		for(int i=0; i<items.size(); i++)
		{
			System.out.println(items.get(i).first.getName());
		}

		System.out.println("IMPRIMINDO OS ITENS EQUIPADOS NO INVENTARIO: ");

		for(int i=0; i<items.size(); i++)
		{
			if(items.get(i).second == true)
			{
				System.out.println(items.get(i).first.getName());
			}
		}
	}

	/*PROCURA E RETORNA UM ITEM A PARTIR DO NOME DELE*/
	public Item searchItem (String name) {

		for (int i=0; i < items.size(); i++)
		{
			if (items.get(i).first.getName().equals(name)==true)
			{
				return items.get(i).first;
			}
		}
		return null;
	}

	/*PROCURA E RETORNA UM ITEM DE ACORDO COM SUA POSIÇÃO*/
	public Item searchItem (int n) {

		if (n<=items.size())
		{
			return items.get(n).first;
		}
		return null;
	}

	/*INSERE UM ITEM NO INVENTÁRIO*/
	public void insertItem (Item i) {

		if (items.size() < spaces)
		{	items.add(new Pair(i, false));	}
	}

	/* UM ITEM DO INVENTARIO PELO INDICE*/
	public void removeItem (int i) {

		items.remove(i);	
	}

	/*REMOVE UM ITEM DO INVENTARIO PELO NOME*/
	public Item removeItem (String name) {

		for (int i=0; i < items.size(); i++)
		{
			if (items.get(i).first.getName().equals(name)==true)
			{
				items.remove(i);
			}
		}
		return null;
	}

	/*RETORNA A SOMA DE TODOS OS ATAQUE EM UM INVENTÁRIO*/
	public int returnSumAtt() {

		int sum=0;

		for (int i=0; i < items.size(); i++)
		{
			if (items.get(i).second == true)
			{
				sum = sum + items.get(i).first.getAttackPts();
			}
		}

		return sum;	
	}

	/*RETORNA A SOMA DE TODAS AS DEFESAS EM UM INVENTÁRIO*/
	public int returnSumDfs() {

		int sum=0;

		for (int i=0; i < items.size(); i++)
		{
			if (items.get(i).second == true)
			{
				sum = sum + items.get(i).first.getDefensePts();
			}
		}
		return sum;
	}

	/*METODO AUXILIAR QUE TORNA O ATRIBUTO BOOL DE UM RESPECTIVO ITEM TRUE*/
	public void makeTrue(Item aux) {

		String search = aux.getName();

		for (int i=0; i<items.size(); i++)
		{
			if (items.get(i).first.getName().equals(search)==true)
			{
				items.get(i).second = true;
			}
		}
	}

	/*METODO AUXILIAR QUE TORNA O ATRIBUTO BOOL DE UM RESPECTIVO ITEM TRUE*/
	public void makeFalse(Item item) {

		String search = item.getName();

		for (int i=0; i<items.size(); i++)
		{
			if (items.get(i).first.getName().equals(search))
			{
				items.get(i).second = false;
			}
		}
	}

	/*EQUIPA UM ITEM (ARMOR OU WEAPON) OU UA UMA POCAO*/
	public int useItem(Character ch, Item aux) {
		
		String search = aux.getName();

		if (searchItem(search) == null)
		{
			System.out.println("ITEM NÃO PODE SER ESQUIPADO, POIS NÃO ESTÁ NO INVENTARIO");
			return 0;
		}

		aux.use(ch, aux);

		return 0;
	}

	/*FUNCAO QUE DESEQUIPA UM ITEM (ARMOR OU WEAPON) (NAO APLICAVEL A POTION)*/
	public void unuseItem (Character ch, Item aux) {

		if (searchItem(aux.getName()) == null)
		{
			System.out.println("ITEM NÃO PODE SER DESESQUIPADO, POIS NÃO ESTÁ NO INVENTARIO");
			return;
		}

		aux.unuse(ch, aux);

	}

}
