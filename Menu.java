package restaurant;

public class Menu {
	String name;
	int cost;
	int sold;
	int cogs; //Cost of goods sold (�������)
	
	public Menu(String name, int cost,int cogs)
	{
		this.name= name;
		this.cost = cost;
		this.sold = 0;
		this.cogs = cogs;
	}
	
	public void sold_reset() {
		this.sold = 0;
	}
}

class MakeMenu {
	public static Menu[] menu = new Menu[13];
	
	public static String menuName[] = {"�Ұ�����","ġŲ����","ġ�����","��������","�ѿ����","��������","����Ƣ��","���̽�ũ��","������","�ݶ�", "���̴�", "ȯŸ","����ƾ��"};				
	public static int menuCost[] = {2000,3000,2000,4000,4500,3500,1500,500,2500,1000,1000,1000,1000};	
	public static int menuCogs[] = {1060,1680,1060,2240,2520,1960,840,280,1400,250,250,250,250};
	

	public void create() {
		
		for(int i = 0; i<menu.length; i++)
		{
			menu[i] = new Menu(menuName[i], menuCost[i], menuCogs[i]);
			menu[i].sold=0;
		}
	}
	
	static public void printMenu() {
		for(int i = 0; i<menu.length; i++)
		{
			System.out.printf("%d : %s, %d \n",i,menu[i].name,menu[i].cost);
		}
	}
	

}

