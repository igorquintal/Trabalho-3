import java.util.*;

public class Weapon extends Item implements Usable {

	protected int attackpts;		/*VARIAVEL ATTACKPTS*/
	protected double range;			/*VARIAVEL RANGE*/

	/*CONSTRUTOR*/
	public Weapon (String name, double price, int attackpts, double range) {

		super (name, price);		/*CHAMA CONSTRUTOR DE PAI*/

		if (attackpts <= 9 && attackpts>=1)
		{
			this.attackpts = attackpts;
		}
		
		this.range = range;
	}

	/*CONSTRUTOR DE COPIA*/
	public Weapon clone () {

		return (Weapon)this.clone();
	}

	/*RETORNA OS ATTACKPTS*/
	public int getAttackPts() {

		return attackpts;
	}

	/*RETORNA OS DEFENSEPTS DA WEAPON*/
	public int getDefensePts() {

		return 0;
	}

	/*RETORNA O RANGE DA ARMA*/
	public double getRange() {

		return range;
	}

	/*EQUIPA A WEAPON*/
	public void use(Character ch, Item item) {

		if(ch.getWeapon() < 2)				/*CASO TENHA-SE NO MAXIMO 2 ARMAS EQUIPADAS*/
		{
			ch.sumWeapon();					/*ADICIONA 1 A VARIAVEL WEAPON (UMA NOVA ARMA FOI EQUIPADA)*/
			ch.backpack().makeTrue(item);	/*TORNA A VARIAVEL BOOL RESPECTIVA AO ITEM COMO TRUE, INDICANDO QUE O ITEM FOI EQUIPADO*/
		}
		else								/*CASO TENHA-SE 2 ARMAS EQUIPADAS*/
		{
			System.out.println("NUMERO MAXIMO DE ARMAS ATINGIDO");
		}
	}

	/*DESEQUIPA UMA WEAPON*/
	public void unuse(Character ch, Item item) {

	 	ch.subWeapon();						/*SUBTRAI 1 DA VARIAVEL WEAPON INDICANDO QUE UMA ARMA FOI REMOVIDA*/
	 	ch.backpack().makeFalse(item);		/*TORNA A VARIAVEL BOOL RESPECTIVA AO ITEM COMO FALSE, INDICANDO QUE O ITEM FOI DESEQUIPADO*/
	 	
	 }

}