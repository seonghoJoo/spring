package vo;

public class Idol {
	
	// 이름
	private String name;
	// 키
	private int height;
	// 몸무게
	private int weight;
	
	public Idol() {

	}
	public Idol(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
