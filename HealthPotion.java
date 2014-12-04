import java.util.*;

/*CLASSE HEALTHPOTION, FILHA DE POTION*/
public class HealthPotion extends Potion {

	/*CONSTRUTOR*/
	public HealthPotion (String name, double price, int restorepts) {

		super (name, price, restorepts);		/*CHAMA CONSTRUTOR DE PAI*/
	}

	/*FUNÇÃO USE ULTILIZA A POÇÃO (PARAMETRO PERSONAGEM E ITEM)*/
	public void use(Character ch, Item item) {

		int hp = getRestorePts();
		ch.addHP(hp);								/*ADICIONA-SE OS RESTOREPTS A MP DO PERSONAGEM*/
		ch.backpack().removeItem(item.getName());	/*DELETA A POCAO DO INVENTARIO*/
	}
}