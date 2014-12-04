import java.util.*;

/*CLASSE POCAO, FILHA DE ITEM*/
public abstract class Potion extends Item {

	protected int restorepts;		/*VARIAVEL RESTOREPTS*/

	/*CONSTRUTOR*/
	public Potion (String name, double price, int restorepts)
	{
		super (name, price);

		this.restorepts = restorepts;
	}

	/*CONSTRUTOR DE COPIA*/
	public Potion clone () {

		return (Potion)this.clone();
	}

	/*RETORNA OS DEFENSEPTS*/
	public int getDefensePts() {

		return 0;
	}

	/*RETORNA OS ATTACKPTS*/
	public int getAttackPts() {

		return 0;
	}

	/*RETORNA OS RESTOREPTS*/
	public int getRestorePts() {

		return restorepts;
	}

	/*METODO VIRTUAL PURO, DEFINIDO NAS CLASSES HEALTH E MANA POTION*/
	public abstract void use(Character ch, Item item);

	/*FUNCAO NAO PODE SER ULTILIZADA, POIS UMA POCAO E DESTRUIDA APOS SE USADA NA FUNCAO USE*/
	public void unuse(Character ch, Item item) {

	 	System.out.println("UMA POCAO NAO PODE SER DESEQUIPADA");
	 	
	 }
}