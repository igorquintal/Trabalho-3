import java.util.*;

public class test {

	public static Scanner scan = new Scanner( System.in );
	public ArrayList<Character> avatars;
	avatars = new ArrayList<Character>();

	public static void printItem(Item aux)
	{

	}

	public static void printInventory(Character aux)
	{
		System.out.println("Imprimindo todos os itens do inventario:")
		aux.backpack().printAllItems();
	}

	public static Character searchAvatar(String name)
	{
		for (int i =0; i<avatars.size(); i++)
		{
			if (avatars.get(i).getName()==name)
			{
				return avatars.get(i);
			}
		}
		return null;	
	}

	public static void changeAtributes(Character aux)
	{
		System.out.println("Informações atuais do personagem: ");
		printAvatar(aux);
		System.out.println("Escolha o atributo a ser mudado: ");		
		System.out.println(" 1 - Strenght ");		
		System.out.println(" 2 - Speed ");		
		System.out.println(" 3 - Dexterity ");		
		System.out.println(" 4 - Constitution ");		
		System.out.println(" 5 - Adicionar Power/Wisdom/Stealth ");
		int comand = scan.nextInt();
		int var;
		
		if(comand==1)
		{
			System.out.print("Digite o novo valor de strenght: ");
			var = scan.nextInt();
			aux.setStrenght(var);
		}
		if(comand==2)
		{
			System.out.print("Digite o novo valor de speed: ");
			var = scan.nextInt();
			aux.setSpeed(var);
		}
		if(comand==3)
		{
			System.out.print("Digite o novo valor de dexterity: ");
			var = scan.nextInt();
			aux.setDexterity(var);
		}
		if(comand==4)
		{
			System.out.print("Digite o novo valor de constitution: ");
			var = scan.nextInt();
			aux.setConstitution(var);
		}
		if(comand==5)
		{
			if((aux instanceof Knight) == true)
			{
				System.out.println("Digite o novo valor de power:");
				var = scan.nextInt();
				((Knight)aux).addPower(var);
			}
			if((aux instanceof Wizard) == true)
			{
				System.out.println("Digite o novo valor de wisdom:");
				var = scan.nextInt();
				((Wizard)aux).addWisdom(var);
			}
			if((aux instanceof Thief) == true)
			{
				System.out.println("Digite o novo valor de stealth:");
				var = scan.nextInt();
				((Thief)aux).addThief(var);
			}

		}										
	}

	public static void printAvatarInfo(Character aux)
	{
		if((aux instanceof Knight) == true)
		{
			System.out.println("Personagem do tipo Knight: ");
			System.out.println(" -> Nome: " + aux.getName());
			System.out.println(" -> Power: " + ((Knight)aux).getPower());
		}
		if((aux instanceof Wizard) == true)
		{
			System.out.println("Personagem do tipo Wizard: ");
			System.out.println(" -> Nome: " + aux.getName());
			System.out.println(" -> Wisdom: " + ((Wizard)aux).getWisdom());
		}
		if((aux instanceof Thief) == true)
		{
			System.out.println("Personagem do tipo Thief: ");
			System.out.println(" -> Nome: " + aux.getName());
			System.out.println(" -> Stealth: " + ((Thief)aux).getStealth());
		}

		System.out.print(" -> Strenght: " + aux.getStrenght());
		System.out.print(" -> Dexterity: " + aux.getDexterity());
		System.out.print(" -> Constitution: " + aux.getConstitution());
		System.out.print(" -> Speed: " + aux.getSpeed());
		System.out.print(" -> HP: " + aux.getHP());
		System.out.print(" -> MP: " + aux.getMP());
		System.out.print(" -> XP: " + aux.getXP());
	}
	
	public static void defineAtributes(Character aux)
	{
		System.out.print(" -> Strenght: ");
		int strenght = scan.nextInt();
		aux.setStrenght(strenght);

		System.out.print(" -> Dexterity: ");
		int dexterity = scan.nextInt();
		aux.setDexterity(dexterity);

		System.out.print(" -> Constitution:");
		int constitution = scan.nextInt();
		aux.setConstitution(constitution);		

		System.out.print(" -> Speed:");
		int speed = scan.nextInt();
		aux.setSpeed(speed);	

	}

	public static void main (String args[]) throws Exception {
	
		Scanner scan = new Scanner( System.in );	
		int comand;

		System.out.println("");
		System.out.println("Comandos disponíveis para o jogo: ");
		System.out.println(" 1 - Configurar personagens "); 
		System.out.println(" 2 - Configurar itens ");
		System.out.println(" 3 - Configurar times ");
		comand = scan.nextInt();

		if (comand==1)
		{
			System.out.println("");
			System.out.println("Comandos disponíveis para configurar personagens: ");
			System.out.println(" 1 - Criar novo personagem "); 
			System.out.println(" 2 - Procurar por um personagem e listar seus atributos");
			System.out.println(" 3 - Redefinir atributos de um personagem ");
			System.out.println(" 4 - Imprimir seu inventário ");
			comand = scan.nextInt();

			if (comand==1)
			{
				System.out.println("Selecione o tipo de personagem: ");
				System.out.println(" 1 - Knight ");
				System.out.println(" 2 - Wizard ");
				System.out.println(" 1 - Thief ");
				comand = scan.nextInt();

				if(comand==1)
				{
					System.out.println("Digite os valores para os atributos:");
					System.out.print(" -> Nome: ");
					String name = scan.next();
					System.out.print(" -> Power: ");		
					int power = scan.nextInt();			
					Knight aux = new Knight(name, power);
					defineAtributes(aux);
					avatars.add(aux);

				}
				if(comand==2)
				{
					System.out.println("Digite os valores para os atributos:");
					System.out.print(" -> Nome: ");
					String name = scan.next();
					System.out.print(" -> Wisdom: ");		
					int wisdom = scan.nextInt();			
					Wizard aux = new Wizard(name, wisdom);
					defineAtributes(aux);
					avatars.add(aux);
				}
				if(comand==3)
				{
					System.out.println("Digite os valores para os atributos:");
					System.out.print(" -> Nome: ");
					String name = scan.next();
					System.out.print(" -> Stealth: ");		
					int stealth = scan.nextInt();			
					Thief aux = new Thief(name, stealth);
					defineAtributes(aux);
					avatars.add(aux);
				}
			}
			if (comand==2)
			{
				System.out.print("Digite o nome do personagem: ");
				String name = scan.next();
				Character aux=searchAvatar(name);
				if(aux==null)
				{
					System.out.println("ERRO - Personagem não existe !");
				}
				else
				{
					printAvatar(aux);
				}				
			}
			if (comand==3)
			{
				System.out.println("Digite o nome do personagem o qual se deseja alterar informações: ");
				String name = scan.next();
				Character aux=searchAvatar(name);
				if (aux!=null)
				{
					changeAtributes(aux);				
				}
				else
				{
					System.out.println("Personagem não encontrado");
				}
			}
			if(comand==4)
			{
				System.out.println("Digite o nome do personagem:");
				String name = scan.next();
				Character aux=searchAvatar(name);
				if (aux!=null)
				{
					printInventory(aux);				
				}
			}
			///////////////////////////////////////////////////////////////////////////
		}
		if (comand==2)
		{
			System.out.println("Comandos disponíveis para configurar itens");
			System.out.println(" 1 - Criar novo item (Weapon/Armor/Potion)");
			System.out.println(" 2 - Equipar/Usar um item em um personagem");
			System.out.println(" 3 - Desequipar um item de um personagem");
			System.out.printlm(" 4 - Informações de um item");
			comand = scan.nextInt();

			if(comand==1)
			{
				System.out.println("Selecione o tipo de item:")
				System.out.println(" 1 - Armor");
				System.out.println(" 2 - Weapon");
				System.out.println(" 3 - Health Potion");
				System.out.println(" 4 - Mana Potion");
				comand = scan.nextInt();

				if(comand==1)
				{
					System.out.println("Digite o nome da Armor");
					String item_name = scan.next();
					System.out.println("Digite seu preço:")
					int price = scan.nextInt();
					System.out.println("Digite os Pontos de defesa:");
					int defensepts = scan.nextInt();
					System.out.println("Digite seu peso:")
					int weight = scan.nextInt();
					System.out.println("Digite o nome do personagem que receberá o item:");
					String avatar_name = scan.next();
					Character aux = searchAvatar(avatar_name);
					Armor aux2 = new Armor(item_name, price, defensepts, weight);
					aux.backpack().insertItem(aux2);
				}
				if(comand==2)
				{
					System.out.println("Digite o nome da Weapon");
					String item_name = scan.next();
					System.out.println("Digite seu preço:")
					int price = scan.nextInt();
					System.out.println("Digite os Pontos de ataque:");
					int attackpts = scan.nextInt();
					System.out.println("Digite seu range:")
					int range = scan.nextInt();
					System.out.println("Digite o nome do personagem que receberá o item:");
					String avatar_name = scan.next();
					Character aux = searchAvatar(avatar_name);
					Weapon aux2 = new Weapon(item_name, price, attackpts, range);
					aux.backpack().insertItem(aux2);
				}
				if(comand==3)
				{
					System.out.println("Digite o nome da Health Potion");
					String item_name = scan.next();
					System.out.println("Digite seu preço:")
					int price = scan.nextInt();
					System.out.println("Digite os Restore Points:");
					int restorepts = scan.nextInt();
					System.out.println("Digite o nome do personagem que receberá o item:");
					String avatar_name = scan.next();
					Character aux = searchAvatar(avatar_name);
					HealthPotion aux2 = new HealthPotion(item_name, price, restorepts);
					aux.backpack().insertItem(aux2);
				}
				if(comand==4)
				{
					System.out.println("Digite o nome da ManaPotion");
					String item_name = scan.next();
					System.out.println("Digite seu preço:")
					int price = scan.nextInt();
					System.out.println("Digite os Restore Points:");
					int defensepts = scan.nextInt();
					System.out.println("Digite o nome do personagem que receberá o item:");
					String avatar_name = scan.next();
					Character aux = searchAvatar(avatar_name);
					ManaPotion aux2 = new ManaPotion(item_name, price, restorepts);
					aux.backpack().insertItem(aux2);
				}
			}
			if (comand==2)
			{
				System.out.println("Digite o nome do personagem:");
				String avatar_name = scan.next();
				System.ot.println("Digite o nome do item:");
				String item_name = scan.next();
				Character aux = searchAvatar(avatar_name);
				Item aux2 = aux.backpack().searchItem(item_name);
				aux.equip(aux2);
				System.out.println("Item equipado/usado !");
			}
			if (comand==3)
			{
				System.out.println("Digite o nome do personagem:");
				String avatar_name = scan.next();
				System.ot.println("Digite o nome do item:");
				String item_name = scan.next();
				Character aux = searchAvatar(avatar_name);
				Item aux2 = aux.backpack().searchItem(item_name);
				aux.unequip(aux2);
				System.out.println("Item desequipado !");
			}
			if (comand==4)
			{
				System.out.println("Digite o nome do personagem:");
				String avatar_name = scan.next();
				System.ot.println("Digite o nome do item:");
				String item_name = scan.next();
				Character aux = searchAvatar(avatar_name);
				Item aux2 = aux.backpack().searchItem(item_name);
				aux2.printInfo();
			}
		}
		if (comand==3)
		{
			
		}

	}
}