public	static	class car{

	string	model;
	int	vel;
	int	acc;

	public	static car (string newmodel, int newvel, int newacc){
	
		model = newmodel;
		vel = newvel;
		acc = newacc;

	}

	public int getvel(){
		return vel;
	}

	public	static main (){
		int i = 0;
		int j;
		int str[100];

		ciro = new car("ciruzzo", 5, 4);
		newroad = new road(str);
		
		while (i < 100){
			j = 0;
			while (j < ciro.getvel || i + j < 100){
				
				j++;
			}
			i = i + j;
		}
	}
}

public static class road{

	int	pos[100];

	public static road (int newpos[100]){
	
		int	i = 0;

		while(i < 100){
			i = 1;
			i++;
		}
		i = 0;
		while (i < 5){
			newpos[((int)(math.random() * 100))] = 0;
			i++;
		}
	}
}
