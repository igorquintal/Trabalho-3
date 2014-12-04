import java.util.*;

public class Armor extends Item {

	protected int defensepts;			/*DEFENSEPTS DE UM PERSONAGEM*/
	protected double weight;			/*PESO DE UMA ARMA*/

	/*CONSTRUTOR DE ARMA*/
	public Armor (String name, double price, int defensepts, double weight) {

		super (name, price);		/*CHAMA O CONSTRUTOR DE PAI*/

		if (defensepts <= 20 && defensepts>=1)
		{
			this.defensepts = defensepts;
		}
		if (weight <=20 && weight >=1)
		{
			this.weight = weight;
		}
	}

	/*CONSTRUTOR DE COPIA*/
	public Armor clone () {

		return (Armor)this.clone();
	}

	/*RETORNA O PESO DE UM ITEM*/
	public double getWeight() {

		return weight;
	}

	/*RETORNA OS ATTACKPTS DO ITEM*/
	public int getAttackPts () {

		return 0;
	}

	/*RETORNA OS DEFENSEPTS*/
	public int getDefensePts () {

		return defensepts;
	}

	/*FUNCAO USE: EQUIPA A ARMADURA*/
	public void use(Character ch, Item item) {

		if(ch.getArmor() < 1)			/*CASO O PERSONAGEM JA TENHA UMA ARMADURA EQUIPADA*/
		{
			ch.sumArmor();								/*SOMA-SE 1 A VARIAVEL ARMOR*/
			ch.backpack().makeTrue(item);				/*TORNA A VARIAVEL BOOL DO RESPECTIVO ITEM COMO TRUE*/
			ch.setArmorSpeed((int)getWeight());			/*DEFINE A PENALIDADE DA VELOCIDADE*/
		}
		else				/*CASO O PERSONAGEM JA POSSUA UMA ARMADURA EQUIPADA*/
		{
			System.out.println("NUMERO MAXIMO DE ARMADURAS ATINGIDO");
		}

	 }

	 /*DESEQUIPA UM ITEM NO INVENTARIO*/
	 public void unuse(Character ch, Item item) {

	 	ch.subArmor();						/*SUBTRAI 1 DA VARIAVEL ARMOR*/				
	 	ch.backpack().makeFalse(item);		/*TORNA A VARIAVEL BOOL DE UM RESPECTIVO ITEM "FALSE"*/
	 	
	 }


}