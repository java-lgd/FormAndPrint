package controller;

public class ChartInfo {
private Chart_Tile title ;
private Chart_legend legend =new Chart_legend();
private Chart_legend xAxis =new Chart_legend();
private Chart_legend  yAxis =new Chart_legend();
private Chart_series[]  series ;
private Chart_legend tooltip =new Chart_legend();


public Chart_legend getTooltip() {
	return tooltip;
}
public void setTooltip(Chart_legend tooltip) {
	this.tooltip = tooltip;
}
public Chart_Tile getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = new Chart_Tile(title);
}
public Chart_legend getLegend() {
	return legend;
}
public void setLegend(String [] legend) {
	this.legend = new Chart_legend(legend);
}

public void setLegends(String... legend) {
	this.legend = new Chart_legend(legend);
}
public Chart_legend getxAxis() {
	return xAxis;
}
public void setxAxis(String [] xAxis) {
	this.xAxis = new Chart_legend(xAxis);
}
public void setxAxiss(String ... xAxis) {
	this.xAxis = new Chart_legend(xAxis);
}
public Chart_legend getyAxis() {
	return yAxis;
}
public void setyAxis(String [] yAxis) {
	this.yAxis = new Chart_legend(yAxis);
}
public void setyAxiss(String ... yAxis) {
	this.yAxis = new Chart_legend(yAxis);
}
public Chart_series[] getSeries() {
	return series;
}
public void setSeries(Chart_series... series) {
	this.series = series;
}


}
