package controller;

public class Chart_legend {
	private String [] data= {};
	public Chart_legend() {
		// TODO Auto-generated constructor stub
	}
	
	public String[] getData() {
		return data;
	}
	public void setData(String[] data ) {
		this.data = data;
	}
	public void setDatas(String... data ) {
		this.data = data;
	}
	public Chart_legend(String[] data) {
		super();
		this.data = data;
	}
	
	
}
