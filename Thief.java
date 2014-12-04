import java.util.*;

/*CLASSE THIEF, FILHA DE CHARACTER*/
public class Thief extends Character {

	protected int stealth;		/*VARIAVEL STEALTH*/
	
	/*RETORNA OS PONTOS DE ATAQUE DE THIEF*/
	protected int getAttackPoints() {

		int total =(int) ((((strenght*5 + dexterity*3 + speed*2)/10) + backpack().returnSumAtt())*(XP/3));						//ULTILIZA-SE CADA UM DOS ATRIBUTOS		
		return (total+stealth);	
	}

	/*RETORNA OS PONTOS DE DEFESA DE THIEF*/	
	protected int getDefensePoints() {

		int total =(int) ((((constitution*5 + dexterity*3 + speed*2)/10) + backpack().returnSumDfs())*(XP/2));	
		return total;
	}

	/*CONSTRUTOR*/
	public Thief (String name, int stealth)
	{
		super(name);
		this.stealth = stealth;
	}
	
	/*RETORNA O VALOR DE STEALTH*/
	public int getStealth() {

		return stealth;
	}

	/*ADICIONA UM VALOR A VARIAVEL STEALTH*/
	public void addStealth (int stealth) {

		this.stealth = this.stealth + stealth;
	}
}