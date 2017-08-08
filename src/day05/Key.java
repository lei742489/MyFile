package day05;
/**
 * Ӱ��ɢ�б�HashMap����ѯ���ܵ�һ����Ҫ���ؾ���
 * ��ΪKeyԪ��equals������hashcod�����Ľ����
 * ������д�������������Ա�����HashMap�г���������HashMap�������ܽ���
 * @author tarena
 *
 *API�ֲ����������������д��˵������дԭ��
 *1���ɶ���д��������������Ҫ��дһ�����equals����ʱ��Ӧ����ͬ��дhashcode
 *2:һ���ԣ���������������equals�Ƚ�Ϊtureʱ��hashcode�������ص�����Ӧ����ȡ���֮��Ȼ����Ȼ��֮���Ǳ���ģ���
 *��Ӧ����֤��������hashcodeֵ���ʱ��equals�����Ƚ�Ϊtrue,���������Ķ�������ΪkeyԪ����HashMap��ʹ��ʱ���������
 *����HashMap��ѯ���ܡ�
 *3:�ȶ��ԡ�����������equals�Ƚϵ�����û�з����仯��ǰ���£���ε���hashcode�������ص����ֱ�����ͬ��
 */
public class Key {

			private int x;
			private int y;
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + x;
				result = prime * result + y;
				return result;
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Key other = (Key) obj;
				if (x != other.x)
					return false;
				if (y != other.y)
					return false;
				return true;
			}
	
			

}
