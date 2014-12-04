import java.util.*;

public class Wizard extends Character {

	protected int wisdom; 		/*VARIAVEL WISDOM*/
	
	/*RETORNA OS ATTACKPTS*/
	protected int getAttackPoints() {

		int total =(int) ((((strenght*5 + dexterity*3 + speed*2)/10) + backpack().returnSumAtt())*(XP/3));					//ULTILIZA-SE CADA UM DOS ATRIBUTOS
		return total;	
	}
	
	/*RETORNA OS DEFENSEPTS*/
	protected int getDefensePoints() {

		int total = (int) ((((constitution*5 + dexterity*3 + speed*2)/10) + backpack().returnSumDfs())*(XP/2)); //+ myitems.returnSumDfs())*XP/6;	//ULTILIZA-SE CADA UM DOS ATRIBUTOS
		return (total+(wisdom/2));
	}

	/*CONSTRUTOR*/
	public Wizard (String name, int wisdom)
	{
		super(name);				/*CHAMA CONSTRUTOR DE PAI*/
		this.wisdom = wisdom;	
	}
	
	/*ADICIONA VALORES A VARIAVEL WISDOM*/
	public void addWisdom (int wisdom) {

		this.wisdom = this.wisdom + wisdom;
	}

	/*RETORNA A VARIAVEL WISDOM*/
	public int getWisdom () {

		return wisdom;
	}
}