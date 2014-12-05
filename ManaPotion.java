import java.util.*;

/*CLASSE MANAPOTION, FILHA DE POTION*/
public class ManaPotion extends Potion {

	/*CONSTRUTOR*/
	public ManaPotion (String name, double price, int restorepts) {

		super (name, price, restorepts);	/*CHAMA CONSTRUTOR DE PAI*/
	}

	/*FUNÇÃO USE ULTILIZA A POÇÃO (PARAMETRO PERSONAGEM E ITEM)*/
	public void use() {

		int mp = getRestorePts();
		this.getOwner().addMP(mp);								/*ADICIONA-SE OS RESTOREPTS A MP DO PERSONAGEM*/						
		this.getOwner().backpack().removeItem(this.getName());	/*DELETA A POCAO DO INVENTARIO*/
	}
}