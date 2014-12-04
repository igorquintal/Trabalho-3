import java.util.*;

public abstract class Item implements Usable{
	
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

}