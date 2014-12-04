import java.util.*;

public class Knight extends Character {

	protected int power;			/*VARIAVEL POWER*/
	
	/*RETORNA OS ATTACKPTS*/
	protected int getAttackPoints() {

		int total =(int) (((((strenght*5 + dexterity*3 + speed*2)/10) + backpack().returnSumAtt())*XP)/3);					//ULTILIZA-SE CADA UM DOS ATRIBUTOS
		return total;	
	}
	
	/*RETORNA OS DEFENSEPTS*/
	protected int getDefensePoints() {

		int total = (int) ((((constitution*5 + dexterity*3 + speed*2)/10) + backpack().returnSumDfs())*(XP/2)); //+ myitems.returnSumDfs())*XP/6;	//ULTILIZA-SE CADA UM DOS ATRIBUTOS;
		return (total+power);
	}

	/*CONSTRUTOR*/
	public Knight (String name, int power)
	{
		super(name);			/*CHAMA CONSTRUTOR DE PAI*/
		this.power = power;
	}
	
	/*ADICIONA VALOR AO ATRIBUTO POWER*/
	public void addPower (int power) {

		this.power = this.power + power;
	}

	/*RETORNA O VALOR DE POWER*/
	public int getPower() {

		return power;
	}
}