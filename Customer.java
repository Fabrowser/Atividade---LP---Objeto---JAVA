public class Customer
{
//propriedades da classe DoisNum
private int id;
private String nome;
private String endereco; 
private String telefone; 
private String documento;

//construtor da classe
public Customer()
{

}

//métodos da classe DoisNum
public void setCustInfo (int ID, String name, String end, String tel, String doc)
{

id = ID;
nome = name; 
endereco = end;
telefone = tel; 
documento = doc;

}

public void setCustInfo (int ID, String name, String end, String tel)
{


id = ID;
nome = name; 
endereco = end;
telefone = tel; 

}


public String getCustInfo()
{

return nome;

}



}