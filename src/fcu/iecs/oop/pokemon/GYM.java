package fcu.iecs.oop.pokemon;
import java.util.Random;
public class GYM {
	public static Player fight (Player...players)
	{
		Pokemon[] c1=players[0].getPokemons();
		Pokemon[] c2=players[1].getPokemons();
		int w2=0,w1=0,win=0,i=0;
		while(win<2){
			
			if(c1[i].getType()!=c2[i].getType()){
				if(c2[i].getType()==PokemonType.WATER){
					win=(c1[i].getType() == PokemonType.FIRE)?++w2:++w1;
				}
					
				else if(c2[i].getType()==PokemonType.GRASS){
					win=(c1[i].getType() == PokemonType.WATER)?++w2:++w1;
				}
					
				else{
					win=(c1[i].getType() == PokemonType.GRASS)?++w2:++w1;
				}
			}
			else{
				if(c1[i].getCp() > c2[i].getCp()){
					win=++w1;
				}
				else if(c1[i].getCp()< c2[i].getCp()){
					win=++w2;
				}
				else{
					Random random=new Random();
					win=(random.nextInt(2)==1)?++w2:++w1;
				}
			}
			i++;
		}
	
	if(w1==2){
		players[0].setLevel(players[0].getLevel()+1);
		System.out.println("Winner is ["+players[0].getPlayername()+"], and his/her level becomes ["+players[0].getLevel()+"].");
		return players[0];
	}
	else if(w2==2){
		players[1].setLevel(players[1].getLevel()+1);
		System.out.println("Winner is ["+players[1].getPlayername()+"], and his/her level becomes ["+players[1].getLevel()+"].");
		return players[1];
	}
	return null;
		
		
	}

	
}
