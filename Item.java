import java.util.*;

public abstract class Item {
	
	/*ATRIBUTOS*/
	private String name;
	private double price;

	/*METODOS*/
	
	/*CONSTRUTOR*/
	public Item (String name, double price) {

		this.name = name;
		this.price = price;
	}

	/*CONSTRUTOR DE COPIA*/
	public Item clone() {

		return (Item)this.clone();

	}
	
	/*RETORNA O NOME DO ITEM*/
	public String getName () {

		return name;
	}

	/*RETORNA OS PONSTOS DE ATAQUE DE UM ITEM*/
	public abstract int getAttackPts ();

	/*RETORNA OS ONTOS DE DEFESA DE UM ITEM*/
	public abstract int getDefensePts ();

	/*RETORNA O PREÇO DE UM ITEM*/
	public double getPrice () {
		
		return price;
	}

	/*FUNCAO VIRTUAL PURA QUE EQUIPA UM ITEM (WEAPON OU ARMOR) OU USA UMA POCAO*/
	public abstract void use(Character ch, Item item);

	/*FUNCAO VIRTUAL PURA QUE DESEQUIPA UM ITEM (WEAPON OU ARMOR)*/	
	public abstract void unuse(Character ch, Item item);
}