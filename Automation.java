package Week3.day1;

public class Automation extends MultipleLanguage implements Language,TestTool{

	public void Java()
	{
		System.out.println("Java Language");
	}
	public void Selenium()
	{
		System.out.println("Automation tool");
	}
	public void ruby()
	{
		System.out.println("Ruby Language");
	}
	public void Python()
	{
		System.out.println("phython Language");
	}
	public static void main(String[] args) {
		Automation a=new Automation();
		a.Java();
		a.Selenium();
		a.ruby();
		a.Python();
		
	}


}
