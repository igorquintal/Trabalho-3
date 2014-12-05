import java.util.*;

public abstract class Character {
	
	//ATRIBUTOS
	private String alias;				/*NOME DO PERSONAGEM*/
	private Inventory myitems;			/*INVENTARIO DO PERSONAGEM*/
	private int HP;						/*HP DO PERSONAGEM*/
	private int MP;						/*MP DO PERSONAGEM*/
	private int armor;					/*NUMERO DE ARMADURAS EQUIPADAS NO PERSONAGEM*/
	private int weapon;					/*NUMERO DE WEAPONS EQUIPADAS NO PERSONAGEM*/
	
	protected int XP;					/*XP DP PERSONAGEM*/
	protected int strenght;				/*STRENGHT DO PERSONAGEM*/
	protected int speed;				/*SPEED DO PERSONAGEM*/
	protected int armorSpeed;			/*PENALIDADE CAUSADA PELO PESO DA ARMADURA*/
	protected int dexterity;			/*DEXTERITY DO PERSONAGEM*/	
	protected int constitution;			/*CONSTITUTION DO PERSONAGEM


	/*MÉTODOS*/
	/*CONSTRUTOR*/
	public Character(String name) {

		alias = name;		//NOME DO PERSONAGEM
		XP = 1;				//EXPERIÊNCIA, COMEÇA EM 1
		HP= 100;			//VITALIDADE, COMEÇA EM 100
		armor = 0;
		weapon = 0;
		armorSpeed = 0;
		myitems = new Inventory ();
	}

	/*METODO ABSTRATO, DEFINIDO NOS FILHOS*/
	protected abstract int getDefensePoints ();

	/*METODO ABSTRATO, DEFINIDO NOS FILHOS*/
	protected abstract int getAttackPoints ();						

	/*RETORNA O VALOR DE ARMOR*/
	public int getArmor() {

		return armor;
	}

	/*RETORNA O VALOR DE WEAPON*/
	public int getWeapon() {

		return weapon;
	}

	/*ADICIONA UM VALOR A XP DO PERSONAGEM*/
	public void addXP (int n) {

		if (XP + n < 101)
		{	XP = XP + n;	}
	}

	/*FUNÇÃO QUE ADICIONA OU SUBTRAI VITALIDADE A UM DETERMINADO PERSONAGEM*/
	public void addHP (int n) {

		if (HP + n < 101 && HP + n >0)
		{	HP = HP + n;	}
	}

	/*ADICIONA UM VALOR A STRENGHT DO PERSONAGEM*/
	public void addMP (int n) {

		MP = MP + n;
	}

	/*DEFINE O ATRIBUTO STRENGHT*/
	public void setStrenght (int n) {

		int aux = strenght;
		strenght = n;

		if (verifySum()==0)
		{  	strenght = aux;	}
		
	}

	/*DEFINE O ATRIBUTO SPEEd*/
	public void setSpeed (int n) {

		int aux = speed;
		speed = n;

		if (verifySum()==0)
		{  	speed = aux;	}
	}

	/*DEFINE ARMORSPEED*/
	public void setArmorSpeed (int n) {

		armorSpeed =(int) (speed*(Math.exp(-1*(Math.pow(n/20, 2)))));
	}

	/*DEFINE O ATRIBUTO DEXTERITY*/
	public void setDexterity (int n) {

		int aux = dexterity;
		dexterity = n;

		if (verifySum()==0)
		{  	dexterity = aux;	}
	}

	/*DEFINE O ATRIBUTO CONSTITUTION*/
	public void setConstitution (int n) {

		int aux = constitution;
		constitution = n;

		if (verifySum()==0)
		{  	constitution = aux;	}
	}

	/*RETORNA O NOME DO PERSONAGEM*/
	public String getName () {

		return alias;
	}

	/*RETORNA O VALOR DA EXPERIÊNCIA XP*/
	public int getXP() {

		return XP;
	}

	/*RETORNA O VALOR DA VITALIDADE HP*/
	public int getHP() {

		return HP;
	}

	/*RETORNA O VALOR DA MANA MP*/
	public int getMP() {

		return MP;
	}

	/*RETORNA O VALOR DE STRENGHT*/
	public int getStrenght() {

		return strenght;
	}

	/*RETORNA O VALOR DE SPEED*/
	public int getSpeed() {

		if (armor >= 1)
		{
			return armorSpeed;
		}

		else
		{
			return speed;
		}
	}

	/*RETORNA O VALOR DE DEXTERITY*/
	public int getDexterity() {

		return dexterity;
	}

	/*RETORNA O VALOR DE CONSTITUTION*/
	public int getConstitution() {

		return constitution;
	}

	/*RETORNA O INVENTÁRIO DO PERSONAGEM*/
	public Inventory backpack() {
		
		return myitems;
	}

	/*QUANDO UMA ARMADURA E EQUIPADA, ADICIONA-SE 1 NA VARIAVEL*/
	public void sumArmor() {

		armor++;
	}

	/*QUANDO UMA ARMA E EQUIPADA, ADICIONA-SE 1 NA VARIAVEL*/
	public void sumWeapon() {

		weapon++;
	}

	/*QUANDO UMA ARMADURA E EQUIPADA, ADICIONA-SE 1 NA VARIAVEL*/
	public void subArmor() {

		armor--;
	}

	/*QUANDO UMA ARMA E EQUIPADA, ADICIONA-SE 1 NA VARIAVEL*/
	public void subWeapon() {

		weapon--;
	}	

	/*EQUIPA UM ITEM, QUE DEVE ESTAR NO INVENTARIO*/
	public void equip (Item aux) {

		backpack().useItem(aux);

	}

	/*DESEQUIPA UM ITEM, QUE DEVE ESTAR NO INVENTARIO*/
	/*public void unequip (Item aux) {

		backpack().unuseItem(this, aux);
	}*/

	/*INSERIR UM ITEM NO INVENTARIO*/
	public void insertItem(Item aux) {

		aux.setOwner(this);
		backpack().insertItem(aux);
	}



	/*ATACAR OUTRO PERSONAGEM*/
	public void attack(Character ch) {

		double miss_chance = (0.1/XP)*100;				//CHANCE  DE ATAQUE FALHAR
		double critical_strike = 0.02*(XP/2)*100;		//CHANCE DE ATAQUE CRÍTICO
		double rand_n = returnRandom1();				//GERADOR DE NÚMERO ALEATÓRIO

		if (rand_n <= miss_chance)						//ATAQUE FALHOU
		{
			System.out.println ("MISS !!"); 		//  ##OPCIONAL !!
			return;
		}

		int attack = this.getAttackPoints() - ch.getDefensePoints() + returnRandom2();		//ULTILIZA-SE TODOS OS PONTOS DE ATACK CALCULADOS ANTERIRORMENTES

		if (attack <= 0)		//CASO O DANO A SER CAUSADO SEJA MENOR QUE 0
		{
			attack = 1;			//APLICA-SE DANO DE NO MÍNIMO 1
		}

		else if (rand_n <= critical_strike)			//É POSSIVEL OCCORER UM ATAQUE CRÍTICO, DOBRANDO O VALOR DO ATAQUE
		{
			attack = 2*attack;						
		}

		attack = attack*-1;
		System.out.println("ATAQUE = " + attack);
		ch.addHP(attack);				//SUBTRAI-SE O VALOR DE ATAQUE DA VITALIDADE DO OUTRO PERSONAGEM

	}


	/*MÉTODO ULTILIZADO PARA GERAR UM NÚMERO ALEATÓRIO (0-100)*/
	public double returnRandom1 () {

    	Random rand = new Random();

    	double num;

    	num = rand.nextInt((1000 - 0) + 1) + 0;
    	num = num/10;

    	return num;
	}

	/*MÉTODO ULTILIZADO PARA GERAR UM NÚMERO ALEATÓRIO (-5-5)*/
	public int returnRandom2 () {
	
    	Random rand = new Random();

    	int num;

    	num = rand.nextInt(11 - 0);
    	num = num - 5;
    	return num;
	}

	/*VERIFICA SE A SOMA DOS ATRIBUTOS NÃO PASSA DE 100*/
	public int verifySum () {

		int total = strenght + speed + dexterity + constitution;
		if (total > 100)	
		{	
			System.out.println ("ERRO - A SOMA DE ATRIBUTOS PASSOU DE 100");
			return 0;
		}
		else
			return 1;
	}
	
}