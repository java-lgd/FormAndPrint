package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {

	@RequestMapping("chart")
	public @ResponseBody ChartInfo wsss() {
		ChartInfo c = new ChartInfo();
		c.setTitle("ECharts 入门示例");
		c.setLegends("销量", "数量");
		c.setxAxiss("衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子");
		Chart_series s1 = new Chart_series("销量", "bar", 5, 20, 36, 10, 10, 20);
		Chart_series s2 = new Chart_series("数量", "bar", 5, 10, 26, 14, 30, 20);
		c.setSeries(s1, s2);
		return c;
	}

}
