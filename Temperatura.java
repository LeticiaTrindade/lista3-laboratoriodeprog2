/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;

/**
 *
 * @author sidneynogueira
 */
public class Temperatura {
    private float atual;
    private float delta;
    private float max;
    private float min;
    
    public Temperatura(){
        
        this.atual = 0;
        this.delta = 5;
        this.max = 50;
        this.min = -50;
    }
    
 public void decrementa(){
 
     this.atual -= this.delta;
     if (this.atual < this.min){
         
         this.atual = this.min;
         
     }
 }
 public void incrementa(){
 
  this.atual += this.delta;
     if (this.atual > this.max){
         
         this.atual = this.max;
     }
 }
 public void setAtual(float atual){
 
 if (atual < min || atual > max) {}
 else {this.atual = atual;}

 }
 public void setDelta (float delta){
 
     if (delta < 0){}
     else {this.delta = delta;}
 
 }
 public void setMax (float max){
    if (max > this.max){
        
        this.max = max;
    }
 }
 public void setMin (float min){
    if (min < this.min){
        
        this.min = min;
        
    }
 }
@Override
 public String toString()
 {
 
 return "Temperatura{atual = " + this.atual + ", Delta = " + this.delta + ", Max = " + this.max + ", Min = "+ this.min ; 
    
 }
}