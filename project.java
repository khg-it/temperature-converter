
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ItemListener.*;

class tem extends JFrame implements ItemListener{
        Container c;
        JLabel l1,l2;
        JTextField t1;
        JRadioButton r1,r2;
        tem(){
            c=this.getContentPane();
            c.setLayout(null);
            l1=new JLabel("Enter Celsius Temperature....");
            l1.setBounds(100,150,300,30);
            c.add(l1);
            t1=new JTextField();
            t1.setBounds(100,200,300,30);
            c.add(t1);
            r1= new JRadioButton("Fahrenheit");
            r2=new JRadioButton("Kelvin");
            r1.setBounds(100,250,100,50);
            r2.setBounds(200,250,100,50);
            c.add(r1);
            c.add(r2);
            r1.addItemListener(this);
            r2.addItemListener(this);
            ButtonGroup g=new ButtonGroup();
            g.add(r1);
            g.add(r2);
            l2=new JLabel(" ");
            l2.setBounds(100,300,150,50);
            c.add(l2);

        }
        public void itemStateChanged(ItemEvent e){
           if(e.getSource()==r1)
           {
            int a=Integer.parseInt(t1.getText());
            float b=a*(9/5)+32;
            l2.setText("conversion is:"+b);
            

          }
           else if(e.getSource()==r2)
           {
               int a=Integer.parseInt(t1.getText());
               float b=(a+273);
               l2.setText("conversion is: "+b);

           }
        }



}
class project{
    public static void main(String []args)
    {
        tem t=new tem();
        t.setTitle("temperature converter");

        t.setBounds(700,500,400,300);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setVisible(true);
    }
}