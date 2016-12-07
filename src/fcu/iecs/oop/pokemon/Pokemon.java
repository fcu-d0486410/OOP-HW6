package fcu.iecs.oop.pokemon;

public class Pokemon {
	public Pokemon(String name,PokemonType type,int cp)
	{
		this.type=type;
		this.name=name;
		this.cp=cp;
		
	}
	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getName() {
		return name;
	}

	public PokemonType getType() {
		return type;
	}

	private final String name;
	
	private final PokemonType type;
	
	private int cp;
}
