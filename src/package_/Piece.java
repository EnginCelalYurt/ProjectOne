package package_;
import java.util.Random;

public class Piece {
	private Cube[][] piece = new Cube[3][3];
	private Random random = new Random();
	String text="";
	public Piece(int cubes, int shape) {
		if(cubes == 4 && shape ==1) {
			piece[0][0] = new Cube(random.nextInt(75), random.nextInt(75));
			piece[1][0] = new Cube(random.nextInt(75), random.nextInt(75));
			piece[1][1] = new Cube(random.nextInt(75), random.nextInt(75));
			piece[1][2] = new Cube(random.nextInt(75), random.nextInt(75));
		}
		if(cubes == 4 && shape ==2) {
			piece[0][1] = new Cube(random.nextInt(75), random.nextInt(75));
			piece[1][0] = new Cube(random.nextInt(75), random.nextInt(75));
			piece[1][1] = new Cube(random.nextInt(75), random.nextInt(75));
			piece[1][2] = new Cube(random.nextInt(75), random.nextInt(75));
		}
		if(cubes == 4 && shape ==3) {
			piece[0][1] = new Cube(random.nextInt(75), random.nextInt(75));
			piece[0][2] = new Cube(random.nextInt(75), random.nextInt(75));
			piece[1][0] = new Cube(random.nextInt(75), random.nextInt(75));
			piece[1][1] = new Cube(random.nextInt(75), random.nextInt(75));

		}
		if(cubes == 4 && shape ==4) {
			piece[0][0] = new Cube(random.nextInt(75), random.nextInt(75));
			piece[0][1] = new Cube(random.nextInt(75), random.nextInt(75));
			piece[1][0] = new Cube(random.nextInt(75), random.nextInt(75));
			piece[1][1] = new Cube(random.nextInt(75), random.nextInt(75));
		}
		if(cubes == 3 && shape ==1) {
			piece[0][0] = new Cube(random.nextInt(75), random.nextInt(75));
			piece[1][0] = new Cube(random.nextInt(75), random.nextInt(75));
			piece[1][1] = new Cube(random.nextInt(75), random.nextInt(75));
		}
		if(cubes == 3 && shape ==2) {
			piece[1][0] = new Cube(random.nextInt(75), random.nextInt(75));
			piece[1][1] = new Cube(random.nextInt(75), random.nextInt(75));
			piece[1][2] = new Cube(random.nextInt(75), random.nextInt(75));
		}
		if(cubes == 2 && shape ==1) {
			piece[0][0] = new Cube(random.nextInt(75), random.nextInt(75));
			piece[0][1] = new Cube(random.nextInt(75), random.nextInt(75));
		}
		if(cubes == 1 && shape ==1) {
			piece[0][0] = new Cube(random.nextInt(75), random.nextInt(75));	
		}
	}
	public String text() {
		String text="";
		for(int i=0; i<3; i++) {
			text+="#############\n";
			for(int k=0; k<3; k++) {
				text+="#";
				for(int j=0; j<3; j++)
				{
					if(piece[i][j]!=null)
						if(k==0)
							text+=piece[i][j].textFirstLine()+"#";
						else if(k==1)
							text+=piece[i][j].textSecondLine()+"#";
						else
							text+=piece[i][j].textThirdLine()+"#";
					else
						text+="   #";
				}
				text+="\n";
			}			
		}
		text+="#############";
		return text;
	}
}