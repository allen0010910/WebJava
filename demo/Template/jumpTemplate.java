package Template;
public class jumpTemplate extends Web.BaseTemplate{
	public String display(){
		String str= 
"<!DOCTYPE html>"+
"<html>"+
"<head>"+
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>"+
"<title>跳转提示</title>"+
"<style type=\"text/css\">"+
"* {"+
"padding: 0;"+
"margin: 0;"+
"}"+
"body {"+
"background: #fff;"+
"font-family: '微软雅黑';"+
"color: #333;"+
"font-size: 16px;"+
"}"+
".system-message {"+
"padding: 24px 48px;"+
"}"+
".system-message h1 {"+
"font-size: 80px;"+
"font-weight: normal;"+
"line-height: 120px;"+
"margin-bottom: 12px;"+
"}"+
".system-message .jump {"+
"padding-top: 10px"+
"}"+
".system-message .jump a {"+
"color: #333;"+
"}"+
".system-message .message {"+
"line-height: 1.8em;"+
"font-size: 36px"+
"}"+
".system-message .detail {"+
"font-size: 12px;"+
"line-height: 20px;"+
"margin-top: 12px;"+
"display: none"+
"}"+
"</style>"+
"</head>"+
"<body>"+
"<div class=\"system-message\">"+
"";if(this.getBoolean("status")){str=str
+"<h1>^_^</h1>"+
"";}else{str=str
+"<h1>-_-!</h1>"+
"";}str=str+""
+"<p class=\"message\">"+this.get("message")+"</p>"+
"<p class=\"jump\">"+
"页面自动 <a id=\"href\""+
"href=\"";if(this.getBoolean("isSetUrl")){str=str
+""+this.get("url")+""+
"";}else{str=str
+"javascript:history.back();"+
"";}str=str+""
+"\">跳转</a> 等待时间："+
"<b id=\"wait\">"+this.get("wait")+"</b>"+
"</p>"+
"</div>"+
"<script type=\"text/javascript\">"+
"(function() {"+
"var wait = document.getElementById('wait'), href = document.getElementById('href').href;"+
"var interval = setInterval(function() {"+
"var time = --wait.innerHTML;"+
"if (time == 0) {"+
"location.href = href;"+
"clearInterval(interval);"+
"}"+
";"+
"}, 1000);"+
"})();"+
"</script>"+
"</body>"+
"</html>"+
"";return str;
}
}