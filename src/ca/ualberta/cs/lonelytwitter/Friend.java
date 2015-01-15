package ca.ualberta.cs.lonelytwitter;
//You can only be an Aquaintance of a BestFriend
public abstract class Friend {
	protected String name;
	
	
	public Friend(String name) {
		super();
		this.name = name;
	}
	
	public Friend(){
		super();
		this.name = "Mystery Friend";
	}

	public String getName() {
		return name;
	}

	public abstract void setName(String name);
	
	
}
