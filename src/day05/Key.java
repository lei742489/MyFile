package day05;
/**
 * 影响散列表（HashMap）查询性能的一个主要因素就是
 * 作为Key元素equals方法与hashcod方法的结果。
 * 妥善重写这两个方法可以避免在HashMap中出现链表导致HashMap检索性能降低
 * @author tarena
 *
 *API手册对这两个方法的重写有说明，重写原则：
 *1：成对重写，即：当我们需要重写一个类的equals方法时就应当连同重写hashcode
 *2:一致性：即：当两个对象equals比较为ture时，hashcode方法返回的数字应当相等。反之亦然。虽然反之不是必须的，但
 *是应当保证两个对象hashcode值相等时，equals方法比较为true,否则这样的对象在作为key元素在HashMap中使用时会产生链表，
 *降低HashMap查询性能。
 *3:稳定性。即：当参与equals比较的属性没有发生变化的前提下，多次调用hashcode方法返回的数字必须相同。
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
