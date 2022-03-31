package controleur;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
 
public class Marqee extends JPanel implements Runnable
{
  JLabel label;
  String str;
  public Marqee(String texte)
  	{
    super();
    str=texte;
    label = new JLabel(texte);
    label.setFont(new java.awt.Font(Font.SANS_SERIF, Font.BOLD, 14));
    label.setForeground(Color.green);
    add(label);
    Thread t = new Thread(this);
    t.start();
  }
 
  public void run(){
    while(true){
        char c = str.charAt(0);
        String rest = str.substring(1);
        str = rest + c;
        label.setText(str);
        try{
            Thread.sleep(200);
        }catch(InterruptedException e){ e.printStackTrace();}
    }
  }
 
      	 
    	public static void main (String[] args)
    		{
    		 JPanel policePanel=new Marqee("Clinique KMED");
    		 
      }
 }
