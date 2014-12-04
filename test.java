import java.util.*;

public class test {
	
	public static int rand_n(int min, int max) {

		Random r = new Random();
		int R = r.nextInt(max-min) + min;
		return R;
	}

	public static int battle(ArrayList<Character> team1, ArrayList<Character> team2) {

		int n1;
		int n2;

		for (int i=0; i<3; i++)
		{
			n1 = rand_n(0, team1.size());
			n2 = rand_n(0, team2.size());
			System.out.println ("PERSONAGEM " + team1.get(n1).getName() + " ATACA PERSONAGEM " + team2.get(n2).getName());
			team1.get(n1).attack(team2.get(n2));
			team1.remove(n1);
			team2.remove(n2);
		}

		System.out.println ("PERSONAGEM " + team1.get(0).getName() + " ATACA PERSONAGEM " + team2.get(0).getName());
		team1.get(0).attack(team2.get(0));

		return 0;

	}

	public static void main (String args[]) throws Exception {
	
	Knight k1 , k2, k3;
	Wizard w1, w2, w3;
	Thief t1, t2;
	
	Team team1;
	Team team2;

	Armor ar1, ar2, ar3, ar4, ar5, ar6;
	Weapon we1, we2, we3, we4, we5, we6, we7, we8, we9, we10;

	k1 = new Knight ("Sir Lancelot", 7);
	k1.addXP(1);		
	k1.addHP(-50);
	k1.addMP(25);		
	k1.setStrenght(20);
	k1.setSpeed(10);
	k1.setDexterity(25);
	k1.setConstitution(25);

	w1 = new Wizard ("Gandalf", 2);
	w1.addXP(1);		
	w1.addHP(-40);
	w1.addMP(25);	
	w1.setStrenght(20);
	w1.setSpeed(10);
	w1.setDexterity(25);
	w1.setConstitution(25);

	t1 = new Thief ("Bilbo", 4);
	t1.addXP(1);		
	t1.addHP(-10);	
	t1.addMP(25);	
	t1.setStrenght(20);
	t1.setSpeed(10);
	t1.setDexterity(25);
	t1.setConstitution(25);

	k2 = new Knight ("Dom Quixote ", 6);
	k2.addXP(1);		
	k2.addHP(-75);	
	k2.addMP(25);	
	k2.setStrenght(20);
	k2.setSpeed(10);
	k2.setDexterity(25);
	k2.setConstitution(25);

	w2 = new Wizard ("Dumbledore", 5);
	w2.addXP(1);		
	w2.addHP(-60);	
	w2.addMP(25);	
	w2.setStrenght(20);
	w2.setSpeed(10);
	w2.setDexterity(25);
	w2.setConstitution(25);

	t2 = new Thief ("Jafar", 4);
	t2.addXP(1);		
	t2.addHP(-50);	
	t2.addMP(25);	
	t2.setStrenght(20);
	t2.setSpeed(10);
	t2.setDexterity(25);
	t2.setConstitution(25);

	w3 = new Wizard ("Mestre dos Magos", 8);
	w3.addXP(1);		
	w3.addHP(0);	
	w3.addMP(25);	
	w3.setStrenght(20);
	w3.setSpeed(10);
	w3.setDexterity(25);
	w3.setConstitution(25);

	k3 = new Knight ("Napoleon", 9);
	k3.addXP(1);		
	k3.addHP(-15);	
	k3.addMP(25);	
	k3.setStrenght(20);
	k3.setSpeed(10);
	k3.setDexterity(25);
	k3.setConstitution(25);

	/*CONSTRUINDO ARMADURAS*/
	ar1 = new Armor("Ancient Nord Armor", 125, 1, 15);
	ar2 = new Armor("Ebony Armor", 1500, 1, 9);
	ar3 = new Armor("Daedric Armor", 3200, 1, 9);
	ar4 = new Armor("Dragonplate Armor", 5000, 1, 5);
	ar5 = new Armor("Dwarven Armor", 1200, 1, 10);
	ar6 = new Armor("Dragonbone Armor", 10000, 1, 1);

	/*CONSTRUINDO WEAPONS*/
	we1 = new Weapon("Ebony Dagger", 290, 9, 5);
	we2 = new Weapon("Dragonbone Mace", 2000, 8, 15);
	we3 = new Weapon("Cajado de Gandalf", 750000, 7, 200);
	we4 = new Weapon("Gauldur Blackblade", 1470, 9, 11);
	we5 = new Weapon("Harkons Sword", 750, 9, 7);
	we6 = new Weapon("Imperial Sword", 500, 9, 10);
	we7 = new Weapon("Nightingale Blade", 2248, 9, 22);
	we8 = new Weapon("Nightingale Ebony Bow", 3405, 9, 150);
	we9 = new Weapon("Daedric Warhammer", 4000, 9, 40);
	we10 = new Weapon("Dawnguard Warhammer", 110, 9, 2);

	/*ALOCANDO ESPAÇOS NO INVENTÁRIO */
	k1.backpack().setSpaces(5);
	k2.backpack().setSpaces(5);
	k3.backpack().setSpaces(5);
	w1.backpack().setSpaces(5);
	w2.backpack().setSpaces(5);
	w3.backpack().setSpaces(5);
	t1.backpack().setSpaces(5);
	t2.backpack().setSpaces(5);

	/*INSERINDO ARMAS NO INVENTARIO (OS ITENS NÃO SÃO EQUIPADOS AINDA !!)*/
	k1.backpack().insertItem(we1);
	k1.backpack().insertItem(we2);
	w1.backpack().insertItem(we3);
	w1.backpack().insertItem(we4);
	t1.backpack().insertItem(we5);
	k2.backpack().insertItem(we6);
	w2.backpack().insertItem(we7);
	t2.backpack().insertItem(we8);
	k3.backpack().insertItem(we9);
	w3.backpack().insertItem(we10);
	
	/*INSERINDO ARMADURAS NO INVENTARIO (OS ITENS NÃO SÃO EQUIPADOS AINDA !!)*/
	t1.backpack().insertItem(ar1);
	k2.backpack().insertItem(ar2);
	w2.backpack().insertItem(ar3);
	t2.backpack().insertItem(ar4);
	k3.backpack().insertItem(ar5);
	w3.backpack().insertItem(ar6);

	/*VERIFICANDO TAMANHO DOS INVENTARIOS*/
	/*TODOS TEM QUE DAR COMO RESULTADO 3*/

	System.out.println("PERSONAGEM K1 :");
	System.out.println("-ITEMS.SIZE() = " + k1.backpack().getAvaiablespace());
	System.out.println("PERSONAGEM K2 :");
	System.out.println("-ITEMS.SIZE() = " + k2.backpack().getAvaiablespace());
	System.out.println("PERSONAGEM K3 :");
	System.out.println("-ITEMS.SIZE() = " + k3.backpack().getAvaiablespace());
	System.out.println("PERSONAGEM W1 :");
	System.out.println("-ITEMS.SIZE() = " + w1.backpack().getAvaiablespace());
	System.out.println("PERSONAGEM W2 :");
	System.out.println("-ITEMS.SIZE() = " + w2.backpack().getAvaiablespace());
	System.out.println("PERSONAGEM W3 :");
	System.out.println("-ITEMS.SIZE() = " + w3.backpack().getAvaiablespace());
	System.out.println("PERSONAGEM T1 :");
	System.out.println("-ITEMS.SIZE() = " + t1.backpack().getAvaiablespace());
	System.out.println("PERSONAGEM T2 :");
	System.out.println("-ITEMS.SIZE() = " + t2.backpack().getAvaiablespace());

	/*VERIFICANDO O TOTAL DE ATACK POINTS DO INVENTARIO*/
	/*DEVE DAR 0 (ESTE METODO SOMA OS ITENS EQUIPADOS DO INVENTARIO)*/

	System.out.println();
	System.out.println("GET TOTAL ATTACK POINTS FROM INVENTORY (ANTES DE EQUIPAR WEAPONS): ");
	System.out.println("-TOTAL = " + k1.backpack().returnSumAtt());

	/*VERIFICANDO O TOTAL DE DEFENSE POINTS DO INVENTARIO*/
	/*DEVE DAR 0 (ESTE METODO SOMA OS ITENS EQUIPADOS DO INVENTARIO)*/

	System.out.println();
	System.out.println("GET TOTAL DEFENSE POINTS FROM INVENTORY (ANTES DE EQUIPAR ARMOR): ");
	System.out.println("-TOTAL = " + k2.backpack().returnSumDfs());	

	/*EQUIPANDO WEAPONS NO INVENTARIO*/
	/*RESULTADO DEVE SER 10*/

	k1.equip(we1);
	k1.equip(we2);

	System.out.println();
	System.out.println("GET TOTAL ATTACK POINTS FROM INVENTORY (APÓS EQUIPAR 2 WEAPONS): ");
	System.out.println("-TOTAL = " + k1.backpack().returnSumAtt());

	/*EQUIPANDO ARMADURA NO INVENTARIO*/
	/*RESULTADO DEVE SER 15*/

	k2.equip(ar2);

	System.out.println();
	System.out.println("GET TOTAL DEFENSE POINTS FROM INVENTORY (APÓS EQUIPAR ARMOR): ");
	System.out.println("-TOTAL = " + k2.backpack().returnSumDfs());

	/*CRIAREMOS UMA WEAPON E UMA ARMOR EXTRA*/
	/*E TENTAREMOS INSERI-LAS NOS INVENTÁRIOS DE K1 E K2*/
	/*O PROGRAMA DEVERA IMPRIMIR UM ERRO*/

	Armor ex1 = new Armor ("Armadura teste", 100, 14, 5);
	Weapon ex2 = new Weapon ("Weapon teste", 150, 7, 100);

	//INSERINDO NO INVENTARIO
	k1.backpack().insertItem(ex2);
	k2.backpack().insertItem(ex1);

	System.out.println();

	//EQUIPANDO OS ITENS
	//DEVE APRESENTAR ERROS
	k1.equip(ex2);
	k2.equip(ex1);

	//MOSTRANDO QUE OS VALORES DE ATTACK E DEFENSE DO INVENTÁRIO NÃO MUDARÃO
	System.out.println();
	System.out.println("GET TOTAL ATTACK POINTS FROM INVENTORY (APÓS TENTAR EQUIPAR WEAPON SEM SUCESSO): ");
	System.out.println("-TOTAL = " + k1.backpack().returnSumAtt());

	System.out.println();
	System.out.println("GET TOTAL DEFENSE POINTS FROM INVENTORY (APÓS TENTAR EQUIPAR ARMOR SEM SUCESSO): ");
	System.out.println("-TOTAL = " + k2.backpack().returnSumDfs());

	/*PORÉM, OS ITENS ESTÃO NO INVENTÁRIO*/
	/*REMOVEREMOS OS ITENS DO INVENTÁRIO DE CADA UM DOS INVENTARIOS*/

	System.out.println();

	//TAMANHO DO INVENTÁRIO ANTES DA REMOÇÃO
	System.out.println("AVAIABLE SPACE ANTES DA REMOÇÃO DA WEAPON EXTRA (PERSONAGEM K1) :");
	System.out.println("-ITEMS.SIZE() = " + k1.backpack().getAvaiablespace());
	System.out.println("AVAIABLE SPACE ANTES DA REMOÇÃO DA ARMOR EXTRA (PERSONAGEM K2) : :");
	System.out.println("-ITEMS.SIZE() = " + k2.backpack().getAvaiablespace());

	System.out.println();

	//TAMANHO DO INVENTÁRIO APÓS A REMOÇÃO
	k1.backpack().removeItem("Weapon teste");
	k2.backpack().removeItem("Armadura teste");

	System.out.println("AVAIABLE SPACE APÓS DA REMOÇÃO DA WEAPON EXTRA (PERSONAGEM K1) :");
	System.out.println("-ITEMS.SIZE() = " + k1.backpack().getAvaiablespace());
	System.out.println("AVAIABLE SPACE APÓS DA REMOÇÃO DA ARMOR EXTRA (PERSONAGEM K2) : :");
	System.out.println("-ITEMS.SIZE() = " + k2.backpack().getAvaiablespace());
	

	/*EQUIPANDO ITENS NOS OUTROS PERSONAGENS*/
	w1.equip(we3);
	w1.equip(we4);
	t1.equip(we5);
	k2.equip(we6);
	w2.equip(we7);
	t2.equip(we8);
	k3.equip(we9);
	w3.equip(we10);

	t1.equip(ar1);
	k2.equip(ar2);
	w2.equip(ar3);
	t2.equip(ar4);
	k3.equip(ar5);
	w3.equip(ar6);

	k1.attack(k2);

	/*VERIFICANDO CARACTERÍSTICAS DE CADA UMA DAS SUB-CLASSES (KNIGHT, WIZARD, THIEF)*/
	/*COMEÇANDO POR KNIGHT (K1, K2, K3)*/
	/*NOTE QUE COMO O PERSONAGEM K2 ESTÁ EQUIPADO COM UMA ARMADURA*/
	/*ESTE POSSUIRÁ VELOCIDADE REDUZIDA (DE 10 PARA 7)*/

	System.out.println("IMPRIMINDO INFORMAÇÕES DE PERSONAGENS :");
	System.out.println();

	System.out.println("KNIGHT 1 (k1): " );
	System.out.println("-XP " + k1.getXP());
	System.out.println("-HP " + k1.getHP());
	System.out.println("-MP " + k1.getMP());
	System.out.println("-STRENGHT " + k1.getStrenght());
	System.out.println("-SPEED " + k1.getSpeed());
	System.out.println("-DEXTERITY " + k1.getDexterity());
	System.out.println("-CONSTITUTION " + k1.getConstitution());
	System.out.println("-POWER " + k1.getPower());

	System.out.println();

	System.out.println("KNIGHT 2 (k2): " );
	System.out.println("-XP " + k2.getXP());
	System.out.println("-HP " + k2.getHP());
	System.out.println("-MP " + k2.getMP());
	System.out.println("-STRENGHT " + k2.getStrenght());
	System.out.println("-SPEED (VELOCIDADE REDUZIDA) " + k2.getSpeed());
	System.out.println("-DEXTERITY " + k2.getDexterity());
	System.out.println("-CONSTITUTION " + k2.getConstitution());
	System.out.println("-POWER " + k2.getPower());

	System.out.println();

	System.out.println("KNIGHT 3 (k3): " );
	System.out.println("-XP " + k3.getXP());
	System.out.println("-HP " + k3.getHP());
	System.out.println("-MP " + k3.getMP());
	System.out.println("-STRENGHT " + k3.getStrenght());
	System.out.println("-SPEED " + k3.getSpeed());
	System.out.println("-DEXTERITY " + k3.getDexterity());
	System.out.println("-CONSTITUTION " + k3.getConstitution());
	System.out.println("-POWER " + k3.getPower());

	System.out.println();

	System.out.println("WIZARD 1 (W1): " );
	System.out.println("-XP " + w1.getXP());
	System.out.println("-HP " + w1.getHP());
	System.out.println("-MP " + w1.getMP());
	System.out.println("-STRENGHT " + w1.getStrenght());
	System.out.println("-SPEED " + w1.getSpeed());
	System.out.println("-DEXTERITY " + w1.getDexterity());
	System.out.println("-CONSTITUTION " + w1.getConstitution());
	System.out.println("-WISDOM " + w1.getWisdom());

	System.out.println();

	System.out.println("WIZARD 2 (w2): " );
	System.out.println("-XP " + w2.getXP());
	System.out.println("-HP " + w2.getHP());
	System.out.println("-MP " + w2.getMP());
	System.out.println("-STRENGHT " + w2.getStrenght());
	System.out.println("-SPEED " + w2.getSpeed());
	System.out.println("-DEXTERITY " + w2.getDexterity());
	System.out.println("-CONSTITUTION " + w2.getConstitution());
	System.out.println("-WISDOM " + w2.getWisdom());

	System.out.println();

	System.out.println("WIZARD 3 (w3): " );
	System.out.println("-XP " + w3.getXP());
	System.out.println("-HP " + w3.getHP());
	System.out.println("-MP " + w3.getMP());
	System.out.println("-STRENGHT " + w3.getStrenght());
	System.out.println("-SPEED " + w3.getSpeed());
	System.out.println("-DEXTERITY " + w3.getDexterity());
	System.out.println("-CONSTITUTION " + w3.getConstitution());
	System.out.println("-WISDOM " + w3.getWisdom());

	System.out.println();

	System.out.println("THIEF 1 (t1): " );
	System.out.println("-XP " + t1.getXP());
	System.out.println("-HP " + t1.getHP());
	System.out.println("-MP " + t1.getMP());
	System.out.println("-STRENGHT " + t1.getStrenght());
	System.out.println("-SPEED " + t1.getSpeed());
	System.out.println("-DEXTERITY " + t1.getDexterity());
	System.out.println("-CONSTITUTION " + t1.getConstitution());
	System.out.println("-STEALTH " + t1.getStealth());

	System.out.println();

	System.out.println("THIEF 2 (t2): " );
	System.out.println("-XP " + t2.getXP());
	System.out.println("-HP " + t2.getHP());
	System.out.println("-MP " + t2.getMP());
	System.out.println("-STRENGHT " + t2.getStrenght());
	System.out.println("-SPEED " + t2.getSpeed());
	System.out.println("-DEXTERITY " + t2.getDexterity());
	System.out.println("-CONSTITUTION " + t2.getConstitution());
	System.out.println("-STEALTH " + t2.getStealth());

	System.out.println();

	/*AGORA QUE JA ESTAMOS OS PRINCIBAIS ATRIBUTOS E MÉTODOS BÁSICOS*/
	/*FORMAREMOS DOIS TIMES, CADA UM COM 4 PERSONAGENS*/
	/*UM TIME COM 2 KNIGHTS, 1 WIZARD E 1 THIEF*/
	/*OUTRO TIME COM 2 WIZARDS, 1 KNIGHT E 1 THIEF*/

	team1 = new Team ("TIME ICMC", Color.blue);
	team2 = new Team ("TIME EESC", Color.yellow);

	/*ADICIONANDO PERSONAGENS TIME 01*/

	team1.addChar(k1);
	team1.addChar(k2);
	team1.addChar(w1);
	team1.addChar(t1);

	team2.addChar(k3);
	team2.addChar(w2);
	team2.addChar(w3);
	team2.addChar(t2);

	/*REALIZANDO TESTES BÁSICOS COM OS OBJETOS TEAM1 E TEAM2*/

	System.out.println();

	System.out.println("TEAM1 ");
	System.out.println("-NOME: " + team1.getName());
	System.out.println("-RESULTS: " + team1.getResults());
	System.out.println("-TOSTRING: " + team1.toString());

	System.out.println();

	System.out.println("TEAM2 ");
	System.out.println("-NOME: " + team2.getName());
	System.out.println("-RESULTS: " + team2.getResults());
	System.out.println("-TOSTRING: " + team2.toString());

	/*REALIZANDO BATALHAS ENTRA PERSONAGENS*/

	int time_ini;		//VARIAVEL QUE DECIDE QUAL TIME COMEÇA  ATAQUE

	ArrayList<Character> aux1 = new ArrayList<Character>();		//ARRAYLIST AUXILIAR, ARMAZENA OS PERSONAGENS DO TIME 1
	ArrayList<Character> aux2 = new ArrayList<Character>();		//ARRAYLIST AUXILIAR, ARMAZENA OS PERSONAGENS DO TIME 2

	aux1.addAll(team1.getTeam());	//ADICIONA TODOS OS ELEMENTOS DE TIME NO ARRAYLISTA AUXILIAR
	aux2.addAll(team2.getTeam());	//ADICIONA TODOS OS ELEMENTOS DE TIME NO ARRAYLISTA AUXILIAR

	time_ini = rand_n(0, 2);		//GERA 0 OU 1, DEFININDO O TIME QUE COMEÇA

	if (time_ini == 0)				//TIME 1 INICIA O ATAQUE
	{
		System.out.println("TIME 1 INICIA A BATALHA ");
		battle (aux1, aux2);		//CHAMA A FUNÇÃO QUE REALIZA O ATAQUE ENTRE OS PERSONAGENS DE FORMA ALEATÓRIA
	}

	else if (time_ini == 1)			//TIME 2 INICIA O ATAQUE
	{
		System.out.println("TIME 2 INICIA A BATALHA ");
		battle (aux2, aux1);		//CHAMA A FUNÇÃO QUE REALIZA O ATAQUE ENTRE OS PERSONAGENS DE FORMA ALEATORIA
	}

	System.out.println();

	/*IMPRIMINDO INFORMAÇÕES DOS PERSONAGENS APÓS A LUTA*/
	System.out.println("IMPRIMINDO INFORMAÇÕES DE PERSONAGENS APÓS O ATAQUE:");
	System.out.println();

	System.out.println("KNIGHT 1 (k1): ");
	System.out.println("-XP " + k1.getXP());
	System.out.println("-HP " + k1.getHP());
	System.out.println("-MP " + k1.getMP());
	System.out.println("-STRENGHT " + k1.getStrenght());
	System.out.println("-SPEED " + k1.getSpeed());
	System.out.println("-DEXTERITY " + k1.getDexterity());
	System.out.println("-CONSTITUTION " + k1.getConstitution());
	System.out.println("-POWER " + k1.getPower());

	System.out.println();

	System.out.println("KNIGHT 2 (k2): ");
	System.out.println("-XP " + k2.getXP());
	System.out.println("-HP " + k2.getHP());
	System.out.println("-MP " + k2.getMP());
	System.out.println("-STRENGHT " + k2.getStrenght());
	System.out.println("-SPEED (VELOCIDADE REDUZIDA) " + k2.getSpeed());
	System.out.println("-DEXTERITY " + k2.getDexterity());
	System.out.println("-CONSTITUTION " + k2.getConstitution());
	System.out.println("-POWER " + k2.getPower());

	System.out.println();

	System.out.println("KNIGHT 3 (k3): ");
	System.out.println("-XP " + k3.getXP());
	System.out.println("-HP " + k3.getHP());
	System.out.println("-MP " + k3.getMP());
	System.out.println("-STRENGHT " + k3.getStrenght());
	System.out.println("-SPEED (VELOCIDADE REDUZIDA) " + k3.getSpeed());
	System.out.println("-DEXTERITY " + k3.getDexterity());
	System.out.println("-CONSTITUTION " + k3.getConstitution());
	System.out.println("-POWER " + k3.getPower());

	System.out.println();

	System.out.println("WIZARD 1 (W1): " );
	System.out.println("-XP " + w1.getXP());
	System.out.println("-HP " + w1.getHP());
	System.out.println("-MP " + w1.getMP());
	System.out.println("-STRENGHT " + w1.getStrenght());
	System.out.println("-SPEED " + w1.getSpeed());
	System.out.println("-DEXTERITY " + w1.getDexterity());
	System.out.println("-CONSTITUTION " + w1.getConstitution());
	System.out.println("-WISDOM " + w1.getWisdom());

	System.out.println();

	System.out.println("WIZARD 2 (w2): " );
	System.out.println("-XP " + w2.getXP());
	System.out.println("-HP " + w2.getHP());
	System.out.println("-MP " + w2.getMP());
	System.out.println("-STRENGHT " + w2.getStrenght());
	System.out.println("-SPEED " + w2.getSpeed());
	System.out.println("-DEXTERITY " + w2.getDexterity());
	System.out.println("-CONSTITUTION " + w2.getConstitution());
	System.out.println("-WISDOM " + w2.getWisdom());

	System.out.println();

	System.out.println("WIZARD 3 (w3): " );
	System.out.println("-XP " + w3.getXP());
	System.out.println("-HP " + w3.getHP());
	System.out.println("-MP " + w3.getMP());
	System.out.println("-STRENGHT " + w3.getStrenght());
	System.out.println("-SPEED " + w3.getSpeed());
	System.out.println("-DEXTERITY " + w3.getDexterity());
	System.out.println("-CONSTITUTION " + w3.getConstitution());
	System.out.println("-WISDOM " + w3.getWisdom());

	System.out.println();

	System.out.println("THIEF 1 (t1): " );
	System.out.println("-XP " + t1.getXP());
	System.out.println("-HP " + t1.getHP());
	System.out.println("-MP " + t1.getMP());
	System.out.println("-STRENGHT " + t1.getStrenght());
	System.out.println("-SPEED " + t1.getSpeed());
	System.out.println("-DEXTERITY " + t1.getDexterity());
	System.out.println("-CONSTITUTION " + t1.getConstitution());
	System.out.println("-STEALTH " + t1.getStealth());

	System.out.println();

	System.out.println("THIEF 2 (t2): " );
	System.out.println("-XP " + t2.getXP());
	System.out.println("-HP " + t2.getHP());
	System.out.println("-MP " + t2.getMP());
	System.out.println("-STRENGHT " + t2.getStrenght());
	System.out.println("-SPEED " + t2.getSpeed());
	System.out.println("-DEXTERITY " + t2.getDexterity());
	System.out.println("-CONSTITUTION " + t2.getConstitution());
	System.out.println("-STEALTH " + t2.getStealth());

	System.out.println();

	/*CRIANDO BATALHA ENTRE OS TIMES*/ 
	team1.resolveBattle(team2);

	System.out.println();
	System.out.println("REALIZADA A PRIMEIRA BATALHA (team2 COMO PARÂMETRO): ");
	System.out.println("-RESULTS TEAM 1: " + team1.getResults());
	System.out.println("-RESULTS TEAM 2: " + team2.getResults());

	team2.resolveBattle(team1);

	System.out.println();
	System.out.println("REALIZADA A PRIMEIRA BATALHA (team2 COMO PARÂMETRO): ");
	System.out.println("-RESULTS TEAM 1: " + team1.getResults());
	System.out.println("-RESULTS TEAM 2: " + team2.getResults());

	System.out.println();

	/*CRIANDO POCOES DE MANA E HEALTH*/
	/*CRIANDO POÇÕES PARA MANA E HEALTH POTION*/
	ManaPotion mp1, mp2, mp3;
	HealthPotion hp1, hp2, hp3, hp4, hp5;

	/*INICIALIZANDO HEALTH POTIONS*/
	hp1 = new HealthPotion("Potion of Health", 200, 20);
	hp2 = new HealthPotion("Potions of the Defender", 250, 40);
	hp3 = new HealthPotion("Potion of Strength", 50, 10);
	hp4 = new HealthPotion("Conjurer's Potion", 400, 45);
	hp5 = new HealthPotion("Enchanter's Potion", 500, 100);
	
	/*INICIALIZANDO MANA POTIONS*/
	mp1 = new ManaPotion("Potion of the Knight", 100, 15);
	mp2 = new ManaPotion("Potion of Illusion", 250, 35);
	mp3 = new ManaPotion("Skirmisher's Potion", 400, 50);

	/*INSERIMOS POCOES NOS INVENTARIOS, E APÓS ISSO, USAMOS AS POÇÕES*/
	k1.backpack().insertItem(hp1);
	k1.equip(hp1);
	k2.backpack().insertItem(hp2);
	k2.equip(hp2);
	k3.backpack().insertItem(hp3);
	k3.equip(hp3);
	w1.backpack().insertItem(hp4);
	w1.equip(hp4);
	w2.backpack().insertItem(hp5);
	w2.equip(hp5);

	w3.backpack().insertItem(mp1);
	w3.equip(mp1);
	t1.backpack().insertItem(mp2);
	t1.equip(mp2);
	t2.backpack().insertItem(mp3);
	t2.equip(mp3);

	System.out.println(); 

	/*IMPRIMINDO INFORMAÇÕES DOS PERSONAGENS APÓS O USO DAS POÇOES*/
	System.out.println("IMPRIMINDO INFORMAÇÕES DE PERSONAGENS APÓS O USO DA POÇÃO:");
	
	System.out.println();

	System.out.println("KNIGHT 1 (k1): ");
	System.out.println("-XP " + k1.getXP());
	System.out.println("-HP " + k1.getHP());
	System.out.println("-MP " + k1.getMP());
	System.out.println("-STRENGHT " + k1.getStrenght());
	System.out.println("-SPEED " + k1.getSpeed());
	System.out.println("-DEXTERITY " + k1.getDexterity());
	System.out.println("-CONSTITUTION " + k1.getConstitution());
	System.out.println("-POWER " + k1.getPower());

	System.out.println();

	System.out.println("KNIGHT 2 (k2): ");
	System.out.println("-XP " + k2.getXP());
	System.out.println("-HP " + k2.getHP());
	System.out.println("-MP " + k2.getMP());
	System.out.println("-STRENGHT " + k2.getStrenght());
	System.out.println("-SPEED " + k2.getSpeed());
	System.out.println("-DEXTERITY " + k2.getDexterity());
	System.out.println("-CONSTITUTION " + k2.getConstitution());
	System.out.println("-POWER " + k2.getPower());

	System.out.println();

	System.out.println("KNIGHT 3 (k3): ");
	System.out.println("-XP " + k3.getXP());
	System.out.println("-HP " + k3.getHP());
	System.out.println("-MP " + k3.getMP());
	System.out.println("-STRENGHT " + k3.getStrenght());
	System.out.println("-SPEED " + k3.getSpeed());
	System.out.println("-DEXTERITY " + k3.getDexterity());
	System.out.println("-CONSTITUTION " + k3.getConstitution());
	System.out.println("-POWER " + k3.getPower());

	System.out.println();

	System.out.println("WIZARD 1 (w1): ");
	System.out.println("-XP " + w1.getXP());
	System.out.println("-HP " + w1.getHP());
	System.out.println("-MP " + w1.getMP());
	System.out.println("-STRENGHT " + w1.getStrenght());
	System.out.println("-SPEED " + w1.getSpeed());
	System.out.println("-DEXTERITY " + w1.getDexterity());
	System.out.println("-CONSTITUTION " + w1.getConstitution());
	System.out.println("-WISDOM " + w1.getWisdom());

	System.out.println();

	System.out.println("WIZARD 2 (w2): ");
	System.out.println("-XP " + w2.getXP());
	System.out.println("-HP " + w2.getHP());
	System.out.println("-MP " + w2.getMP());
	System.out.println("-STRENGHT " + w2.getStrenght());
	System.out.println("-SPEED " + w2.getSpeed());
	System.out.println("-DEXTERITY " + w2.getDexterity());
	System.out.println("-CONSTITUTION " + w2.getConstitution());
	System.out.println("-WISDOM " + w2.getWisdom());

	System.out.println();

	System.out.println("WIZARD 3 (w3): ");
	System.out.println("-XP " + w3.getXP());
	System.out.println("-HP " + w3.getHP());
	System.out.println("-MP " + w3.getMP());
	System.out.println("-STRENGHT " + w3.getStrenght());
	System.out.println("-SPEED " + w3.getSpeed());
	System.out.println("-DEXTERITY " + w3.getDexterity());
	System.out.println("-CONSTITUTION " + w3.getConstitution());
	System.out.println("-WISDOM " + w3.getWisdom());

	System.out.println();

	System.out.println("THIEF 1 (t1): ");
	System.out.println("-XP " + t1.getXP());
	System.out.println("-HP " + t1.getHP());
	System.out.println("-MP " + t1.getMP());
	System.out.println("-STRENGHT " + t1.getStrenght());
	System.out.println("-SPEED " + t1.getSpeed());
	System.out.println("-DEXTERITY " + t1.getDexterity());
	System.out.println("-CONSTITUTION " + t1.getConstitution());
	System.out.println("-STEALTH " + t1.getStealth());

	System.out.println();

	System.out.println("THIEF 2 (t2): ");
	System.out.println("-XP " + t2.getXP());
	System.out.println("-HP " + t2.getHP());
	System.out.println("-MP " + t2.getMP());
	System.out.println("-STRENGHT " + t2.getStrenght());
	System.out.println("-SPEED " + t2.getSpeed());
	System.out.println("-DEXTERITY " + t2.getDexterity());
	System.out.println("-CONSTITUTION " + t2.getConstitution());
	System.out.println("-STEALTH " + t2.getStealth());

	System.out.println();

	/*IMPRIMINDO OS ITENS PRESENTES NOS INVENTARIOS DE CADA PERSONAGEM*/
	System.out.println("PERSONAGEM K1:");
	k1.backpack().printAllItems();
	System.out.println();

	System.out.println("PERSONAGEM K2:");
	k2.backpack().printAllItems();
	System.out.println();

	System.out.println("PERSONAGEM K3:");
	k3.backpack().printAllItems();
	System.out.println();

	System.out.println("PERSONAGEM T1:");
	t1.backpack().printAllItems();
	System.out.println();

	System.out.println("PERSONAGEM T2:");
	t2.backpack().printAllItems();
	System.out.println();

	System.out.println("PERSONAGEM W1:");
	w1.backpack().printAllItems();
	System.out.println();

	System.out.println("PERSONAGEM W2:");
	w2.backpack().printAllItems();
	System.out.println();

	System.out.println("PERSONAGEM W3:");
	w3.backpack().printAllItems();
	System.out.println();
	}
}