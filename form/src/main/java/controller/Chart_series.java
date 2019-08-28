package controller;

public class Chart_series {
String name;
String type ;
private double[]  data ;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double[] getData() {
	return data;
}
public void setData(double[] data) {
	this.data = data;
}
public Chart_series(String name, String type, double... data) {
	super();
	this.name = name;
	this.type = type;
	this.data = data;
}



}
