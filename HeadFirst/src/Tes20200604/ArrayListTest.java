package Tes20200604;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// ����Egg ���͵�list
		ArrayList<Egg> myList = new ArrayList<Egg>();
		// ��Egg����s
		Egg s = new Egg();
		myList.add(s);
		// ��Egg����b
		Egg b = new Egg();
		myList.add(b);
		// ����Ԫ����
		int theSize = myList.size();
		// ArrayList �Ƿ����s�����õ�Egg����
		boolean isIn = myList.contains(s);
		// ���ö�����ArrayList�е�����
		int idx = myList.indexOf(b);
		// �ж��Ƿ�Ϊ��
		boolean empty = myList.isEmpty();
		//ɾ��Ԫ��s
		myList.remove(s);

	}

}
