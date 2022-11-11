package Beans;

public class Skoter {
	private int id;
	private String name;
	private String marque;
	private String desc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Skoter(int id, String name, String marque, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.marque = marque;
		this.desc = desc;
	}
	public Skoter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	

}
