package day02;
/**
 * 字符串支付正则表达式方法二：
 * String[] split(String regex)
 * 将当前字符串按照给定正则表达式满足的部分进行拆分
 * 将拆分出来的各部分内容存入一个字符串数组并返回。
 * 
 * @author tarena
 *
 */

public class String_split {
	
	public static void main(String[] args) {
		String str ="12222313ads23f43561adf34r2731h5643ert4354552344";
		
		String [] data = str.split("\\d+");			//折掉字符里的数字，并保存到新数组，去掉+号会在拆除位置生成空格
		
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
	}
}
