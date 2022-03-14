package duncan.domainobjects;

public class MarketPerson {
	private String description;
	private String nickname;
	private String name;
	public MarketPerson(String description, String nickname, String name) {
		super();
		this.description = description;
		this.nickname = nickname;
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}