package restaurant;

import java.util.Arrays;

public class Menu {
	 String name;
	 int cost;
	 int sold;
	 int cogs; //Cost of goods sold (매출원가)
	
	public Menu(String name, int cost,int sold,int cogs)
	{
		this.name= name;
		this.cost = cost;
		this.sold = sold;
		this.cogs = cogs;
	}
	
	
}

class MakeMenu {
	static String menuName[] = {"불고기버거","치킨버거","치즈버거","통새우버거","한우버거","강정버거",
			 "감자튀김","아이스크림","스낵랩",
			 "콜라", "사이다", "환타","마운틴듀"};
				
	static int menuCost[] = {2000,3000,2000,4000,4500,3500,
		1500,500,2500,
		1000,1000,1000,1000};
	
	static int menuCogs[] = {1060,1680,1060,2240,2520,1960,840,280,1400,250,250,250,250};
	
	static int menuSold[] = new int[13];
	
	public static Menu[] menu = new Menu[13];
	
	public void create() {
		
		for(int i = 0; i<menu.length; i++)
		{
			Arrays.fill(MakeMenu.menuSold, 0);
			menu[i] = new Menu(menuName[i], menuCost[i],menuSold[i],menuCogs[i]);
			//menu[i].sold=0;
		}
	}
	
}

