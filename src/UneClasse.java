
public class UneClasse {
	
	private String Name;

	public UneClasse(String name) {
		this.setName(name);
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName();
	}
	
}
