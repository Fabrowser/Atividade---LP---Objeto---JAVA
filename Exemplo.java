class Exemplo
{
public static void main(String[] argumentos)
{
DoisNum2 X = new DoisNum2(10,7);
DoisNum2 Y = new DoisNum2(5);
DoisNum2 Z = new DoisNum2();
System.out.println("Objeto X:");
System.out.println("A = " + X.RetA());
System.out.println("B = " + X.RetB());
System.out.println("A+B = " + X.Soma());
System.out.println("Objeto Y:");
System.out.println("A = " + Y.RetA());
System.out.println("B = " + Y.RetB());
System.out.println("A+B = " + Y.Soma());
System.out.println("Objeto Z:");
Z.EntraA(3);
Z.EntraB(2);
System.out.println("A = " + Z.RetA());
System.out.println("B = " + Z.RetB());
System.out.println("A+B = " + Z.Soma());
}
}