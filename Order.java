package restaurant;

import java.util.Arrays;

public class Order extends MakeMenu{

	int[] count = new int[13];
	
	
	public Order() {
		Arrays.fill(this.count, 0);
	}	
		
	public void setCount(int index) {
			this.count[index] +=1;
	}
	
	public void save() {
		for(int i = 0; i<menu.length;i++)
		{
			menu[i].sold += this.count[i];
		}
	}
	
	public void print() {
		for(int i = 0; i<menu.length;i++)
		{
			System.out.printf("%d ",menu[i].sold);
		}

	}
}
