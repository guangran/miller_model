package proxyInterfaceImpl;

import proxyInterface.Proxy;

//jack��Ů����
public class JackGrilFriend implements Proxy {

	@Override
	public void getGrilFriend() {
		// TODO Auto-generated method stub
		System.out.println("Jack��Ů����");
	}

	@Override
	public void add(int number) {
		// TODO Auto-generated method stub
		System.out.println("Jack�����ڸ�"+number+"Ů����");
	}

}
