import java.util.*;

public abstract class Item implements Usable {
	
	/*ATRIBUTOS*/
	private String name;
	private double price;
	private Character owner;

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
	
	/*DEFINE DONO*/
	public void setOwner(Character ch)
	{
		owner = ch;
	}

	/*RETORNA O DONO*/
	public Character getOwner()
	{
		return owner;
	}

	/*RETORNA O NOME DO ITEM*/
	public String getName () {

		return name;
	}

	/*RETORNA OS PONSTOS DE ATAQUE DE UM ITEM*/
	public abstract int getAttackPts ();

	/*RETORNA OS ONTOS DE DEFESA DE UM ITEM*/
	public abstract int getDefensePts ();

	/*IMPRIME AS INFORMAÇÕES DO ITEM*/
	public abstract void printInfo();

	/*RETORNA O PREÇO DE UM ITEM*/
	public double getPrice () {
		
		return price;
	}

}