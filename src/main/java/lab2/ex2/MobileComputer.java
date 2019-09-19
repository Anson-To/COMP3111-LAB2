package lab2.ex2;

//Implements Chargeable
//interface是一個接口，類似於C＋＋中的純虛函數。
/*舉個簡單的例子，有一類東西，都具有同樣的行為，而這個共有的行為實現方式不一樣。
如：筆這類東西，都有共同的行為“寫”，鉛筆、毛筆、圓珠筆、鋼筆都有“寫”的功能，但實現起來不一樣。那麽我們就可以抽象出一個接口“筆”
implement的意思是指在鉛筆、毛筆、圓珠筆要有”寫“的這個功能，就需要實現接口”筆“的”寫“功能。而這個關鍵字implement就是實現的意思*/
//https://www.itread01.com/articles/1478576430.html as reference
public class MobileComputer extends Computer implements Chargeable{
	private int battery;
	public MobileComputer() 
	{
		secret="MobileComputer secret";
		battery=5;	
	}
	@Override
	public void work() 
	{
		if(battery>0) 
		{
			System.out.println("It is working on my lap.");
			battery--;
		}
		else System.out.println("Running out of battery");
	}
	
	public void charge() 
	{
		if(battery<10) {battery++;}
	}
	

}
