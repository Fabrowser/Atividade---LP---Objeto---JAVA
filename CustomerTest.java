class CustomerTest
{
public static void main(String[] argumentos)
{
	

Customer C1 = new Customer();
Customer C2 = new Customer();

C1.setCustInfo (1,"Fabricio Carlos Guimaraes","Av hum 777","13996899237");
C2.setCustInfo (2,"Alysson Murillo GUImarães", "Av dois  888", "13996899237", "454545");



System.out.println("Nome do objeto c1:" + C1.getCustInfo()); 
System.out.println("---------------");	
System.out.println("Nome do objeto c2:" + C2.getCustInfo()); 

} 
}

