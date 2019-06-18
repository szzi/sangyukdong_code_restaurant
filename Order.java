package restaurant;

import java.util.Arrays;

public class Order extends MakeMenu{

	static int[] count = new int[13];
	static int[] pre_count = new int[13]; //������ ��� ���� ���� �ֹ� ����
	static int cnt=0;
	
	public Order() {		
		Arrays.fill(Order.count, 0);
	}	
		
	public void setCount(int index) {
			Order.count[index] +=1;
	}
	
	public int getCount(int index) {
		return Order.count[index];
	}
	
	public void save() {
		if(cnt==0) {
			create();
			cnt++;
		}
		for(int i = 0; i<menu.length;i++)
		{
			Order.pre_count[i] = Order.count[i];
			menu[i].sold += Order.count[i];
		}
	}

	public void print() {
		for(int i = 0; i<menu.length;i++)
		{
			System.out.printf("%d ",menu[i].sold);
		}

	}
}
