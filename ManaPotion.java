import java.util.*;

/*CLASSE MANAPOTION, FILHA DE POTION*/
public class ManaPotion extends Potion implements Usable{

	/*CONSTRUTOR*/
	public ManaPotion (String name, double price, int restorepts) {

		super (name, price, restorepts);	/*CHAMA CONSTRUTOR DE PAI*/
	}

	/*FUNÇÃO USE ULTILIZA A POÇÃO (PARAMETRO PERSONAGEM E ITEM)*/
	public void use(Character ch, Item item) {

		int mp = getRestorePts();
		ch.addMP(mp);								/*ADICIONA-SE OS RESTOREPTS A MP DO PERSONAGEM*/						
	}
}