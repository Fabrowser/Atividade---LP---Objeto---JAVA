public class DoisNum2
{
//propriedades da classe DoisNum
private int A;
private int B;
//construtor da classe DoisNum
DoisNum2(int X, int Y)
{
A=X;
B=Y;
}
DoisNum2(int X)
{
A=X;
B=X;
}
DoisNum2()
{ }

//métodos da classe DoisNum
public void EntraA (int X)
{ A=X; }
public void EntraB (int X)
{ B=X; }
public int RetA()
{return A;}
public int RetB()
{return B;}
public int Soma()
{return A+B;}
public int Subtrai()
{return A-B;}
public int Multiplica()
{return A*B;}
public int Divide()
{return A/B;}
}