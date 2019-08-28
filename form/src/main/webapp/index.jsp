<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>表单</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" charset="utf-8" src="js/echarts-all-3.js"></script>
<script type="text/javascript" charset="utf-8" src="js/china.js"></script>
</head>
<body>
<div id="main" style="width: 600px;height:400px;"></div>
<script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));
        // 指定图表的配置项和数据
        var myChart = echarts.init(document.getElementById('main'));
       $.post("chart.do",{},function(json){
        	 var option =json;
        	// 使用刚指定的配置项和数据显示图表。
             myChart.setOption(option);
        },"json");
    </script>
</body>
</html>