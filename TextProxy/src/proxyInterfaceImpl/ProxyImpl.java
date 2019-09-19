package proxyInterfaceImpl;

import proxyInterface.Proxy;

//代理的基本實現類
public class ProxyImpl implements Proxy{
	
	private Proxy proxy;
	private int number;

	public ProxyImpl(Proxy proxy,int number){
		this.proxy = proxy;
		this.number = number;
	}
	
	@Override
	public void getGrilFriend(){
		proxy.getGrilFriend();
	}
	
	@Override
	public void add(int number){
		proxy.add(number);
	}
	
	public void add(){
		proxy.add(number);
	}

	public Proxy getProxy() {
		return proxy;
	}

	public void setProxy(Proxy proxy) {
		this.proxy = proxy;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
