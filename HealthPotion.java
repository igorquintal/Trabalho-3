import java.util.*;

/*CLASSE HEALTHPOTION, FILHA DE POTION*/
public class HealthPotion extends Potion {

	/*CONSTRUTOR*/
	public HealthPotion (String name, double price, int restorepts) {

		super (name, price, restorepts);		/*CHAMA CONSTRUTOR DE PAI*/
	}

	/*FUNÇÃO USE ULTILIZA A POÇÃO (PARAMETRO PERSONAGEM E ITEM)*/
	public void use() {

		int hp = getRestorePts();
		this.getOwner().addHP(hp);								/*ADICIONA-SE OS RESTOREPTS A MP DO PERSONAGEM*/
		this.getOwner().backpack().removeItem(this.getName());	/*DELETA A POCAO DO INVENTARIO*/
	}
}