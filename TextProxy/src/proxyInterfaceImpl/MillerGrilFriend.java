package proxyInterfaceImpl;

import proxyInterface.Proxy;

//miller��Ů����
public class MillerGrilFriend implements Proxy {

	/**
	 * miller�ҵ���Ů����
	 */
	@Override
	public void getGrilFriend() {
		// TODO Auto-generated method stub
		System.out.println("miller��Ů����");
	}

	/**
	 * miller��������Ů���Ѹ���
	 */
	@Override
	public void add(int number) {
		// TODO Auto-generated method stub
		System.out.println("miller�����ڸ�"+number+"Ů����");
	}

}
