import java.util.*;

public class Team {

	private String name;						/*NOME DO TIME*/
	private Color color;						/*COR DO TIME*/
	private int win;							/*NUMERO DE VITORIAS*/
	private int lose;							/*NUMERO DE DERROTAS*/
	private int draw;							/*NUMERO DE EMPATES*/
	private ArrayList<Character> characters;	/*ARRAYLIST DOS PERSONAGENS DO TIME*/

	/*CONSTRUTOR*/
	public Team (String name, Color color) {

		characters = new ArrayList<Character>();
		this.name = name;
		this.color = color;
		win = 0;
		lose = 0;
		draw = 0;
	}

	/*RETORNA O NOME DO TIME*/
	public String getName() {

		return name;
	}

	/*RETORNA UMA STRING COM O RESULTADO*/
	public String getResults() {

		return ("WINS: " + win + " LOSE: " + lose + " DRAWS: " + draw);
	}

	/*RETORNA O NOME E COR DO TIME*/
	public String toString () {

		return("NOME DO TIME: " + name + " COR: " + color);
	}

	/*CRIA UMA BATALHA ENTRE DOIS TIMES, COMPARARNDO OS POINS DE CADA TIME*/
	public int resolveBattle (Team teamB) {

		int pointsB = teamB.getPoints();
		int pointsA = this.getPoints();

		if (pointsA > pointsB)		
		{
			win = win + 1;			
		}
		else if (pointsA < pointsB)	
		{
			lose = lose + 1;		
		}
		else						
		{
			draw = draw + 1;		
		}

		return 0;

	}

	/*ADICIONA UM PERSONAGEM AO TIME*/
	public void addChar(Character aux) {

		characters.add(aux);
	}

	/*REMOVE UM PERSONAGEM DO TIME (PARAMETRO INDICE)*/
	public void removeChar(int i) {

		characters.remove(i);
	}

	/*REMOVE UM PERSONAGEM DO TIME (PARAMETRO PERSONAGEM)*/
	public void removeChar(Character aux) {

		String name = aux.getName();
		
		for (int i=0; i<characters.size(); i++)
		{
			if (characters.get(i).getName().equals(name) == true)
			{
				characters.remove(i);	
			}
		}
	}

	/*PROCURA UM PERSONAGEM PELO NOME E RETORNA O PRÓPRIO PERSONAGEM*/
	public Character searchChar (String name) {

		for (int i=0; i<characters.size(); i++)
		{
			if (characters.get(i).getName().equals(name) == true)
			{
				return characters.get(i);	
			}
		}
		return null;
	}

	/*RETORNA OS POINTS DE UM TIME*/
	public int getPoints () {

		int points = 0;
		int i;

		for (i=0; i<characters.size(); i++)
		{
			points = points + characters.get(i).getHP();
		}

		points = points / i;

		return points;
	}

	/*RETORNA UM ARRAYLIST DE CHARACTER DO TIME (FUNCAO AUXILIAR, ULTILIZADA EM TESTES)*/
	public ArrayList<Character> getTeam() {

		return characters;
	}

}