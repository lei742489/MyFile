package day02;
/**
 * �ַ���֧��������ʽ��������
 * String[] split(String regex)
 * ����ǰ�ַ������ո���������ʽ����Ĳ��ֽ��в��
 * ����ֳ����ĸ��������ݴ���һ���ַ������鲢���ء�
 * 
 * @author tarena
 *
 */

public class String_split {
	
	public static void main(String[] args) {
		String str ="12222313ads23f43561adf34r2731h5643ert4354552344";
		
		String [] data = str.split("\\d+");			//�۵��ַ�������֣������浽�����飬ȥ��+�Ż��ڲ��λ�����ɿո�
		
		for(int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
	}
}
