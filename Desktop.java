package org.system;

public class Desktop extends Computer {
 public int desktopSize()
 {
	 return 0;
 }
 public static void main(String[]args)
 {
	 Computer c=new Computer();
	 c.computerModel();
	 Desktop d=new Desktop();
	 d.desktopSize();
 }
}
