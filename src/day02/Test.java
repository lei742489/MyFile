package day02;
/**
 * 实现图片重命名
 * @author tarena
 *
 */
public class Test {

	public static void main(String[] args) {
		String imagename = "12345.jpg";
		String [] newname = imagename.split("\\.");				//从.拆分为两个数组
		imagename = System.currentTimeMillis()+"."+ newname[1];	//根据当前时间重命名文件
		System.out.println(imagename);

	}

}
