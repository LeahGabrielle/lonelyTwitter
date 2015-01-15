package ca.ualberta.cs.lonelytwitter;

public class BestFriend extends Friend {
	private String alias;
	@Override
	public void setName(String name) {
		this.name = name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	
}
