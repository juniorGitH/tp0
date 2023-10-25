package tp0;

public class pointA extends point{
public String nom;
public int x, y;
	public pointA(String nom, int x, int y) {
		// TODO Auto-generated constructor stub
		super(x, y);
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "pointA [nom=" + nom +" " + super.toString() + "]";
	}
	
	

}
