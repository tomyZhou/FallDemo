瀑布流思路：

	现在UI里面很流行瀑布流。爱画报www.aihuabao.com,蘑菇街,世纪佳缘等很多网站都用到了这
中自定义控件。这里研究下这种控件的做法：
	从外形上看，可以看做是这样的：
	1、因为整个界面可以拖动，假象最外层有一个ScrollView包裹
	2、总体是一个大的LinearLayout。oriental = "horizional"
	3、里面放三个(可以是n列)LinearLayout
	4、每个LinearLayout里面竖直排列放若干ImageView(也可以是上图下文字的组合)。控件的高度不定。
	
	备注：由于这种图片比较多的页面比较耗时，所以最好采用多线程来加载图片。
	
	
	
	