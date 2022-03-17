package questao1;

public class MaquinaBilhete
{
    private float preco;
    private float saldo;
    private float total;
    
    public MaquinaBilhete(){}

    public MaquinaBilhete(float custo)
    {
      this.preco = custo;
      this.saldo = 0;
      this.total = 0;
    }

    public float getPreco()
    {
        
        return this.preco;
    }


    public float getSaldo()
    {
        return this.saldo;
    }
    
    public float getTotal(){
        return this.total;
    }


    public void colocarDinheiro(float quantidade)
    {
        this.saldo = saldo + quantidade;
    }

    public void emitir()
    {
       if (this.saldo >= this.preco){
           this.total += this.preco;
           this.saldo -= this.preco;
           System.out.println("Bilhete emitido");
       } 
       else {
           System.out.println("O bilhete custa R$" + this.preco+ " e o seu saldo é insuficiente. Você tem R$ " + this.saldo + " de saldo. Acrescente no saldo pelo menos R$ "+ (this.preco - this.saldo)+".");
       }
    }

    public float darTroco()
    {
     
        float troco;
        troco = saldo;
        this.saldo = 0;
        return troco;
     
    }
}
