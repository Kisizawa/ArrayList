import java.util.Objects;

public class Hero {
	private String name;
	private int knockoutEnemy;
	public Hero(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public String toString() {
		return  name ;
	}
	public int getKnockoutEnemy() {
		return knockoutEnemy;
	}
	public void setKnockoutEnemy(int knockoutEnemy) {
		this.knockoutEnemy = knockoutEnemy;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hero other = (Hero) obj;
		return Objects.equals(name, other.name);
	}
	

	
}
