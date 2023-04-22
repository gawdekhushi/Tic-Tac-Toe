import java.awt.*;
import java.awt.event.*;
class FDemo extends Frame implements ActionListener
{
	Button b, b1 , b2 , b3 , b4 , b5 , b6 , b7 , b8 , b9;
	int i =1;
	FDemo()
	{
		setLayout(null);
		Font f = new Font("Times New Roman" , Font.BOLD , 20);
		setFont(f);
		
        Label l = new Label("KHUSHI GAWDE");
	l.setForeground(Color.red);
	l.setBounds(85,70,450,50);
	    
            Component Component = add(l);
		
		b1 = new Button("");
		b1.setSize(100 , 100);
		b1.setLocation(100 , 100);
		add(b1);
		
		b2 = new Button("");	
        b2.setSize(100 , 100);
        b2.setLocation(200 , 100);		
		add(b2);
		
		b3 = new Button("");	
        b3.setSize(100 , 100);
        b3.setLocation(300 , 100);		
		add(b3);
		
		b4 = new Button("");	
        b4.setSize(100 , 100);
        b4.setLocation(100 , 200);		
		add(b4);
		
		b5 = new Button("");	
        b5.setSize(100 , 100);
        b5.setLocation(200 ,200);		
		add(b5);
		
		b6 = new Button("");	
        b6.setSize(100 , 100);
        b6.setLocation(300 , 200);		
		add(b6);
		
		b7 = new Button("");	
        b7.setSize(100 , 100);
        b7.setLocation(100 ,300);		
		add(b7);
		
		b8 = new Button("");	
        b8.setSize(100 , 100);
        b8.setLocation(200 ,300);		
		add(b8);
		
		b9 = new Button("");	
        b9.setSize(100 , 100);
        b9.setLocation(300 , 300);		
		add(b9);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		
	    setResizable(false);
	}		
	public void actionPerformed(ActionEvent e)
	{
		b= (Button)e.getSource();
		b.setForeground(Color.blue);
		{
		    if(i%2==0)
		    {
			    b.setLabel("0");
				b.setForeground(Color.blue);
		
		    }
		    else
		    {
		    	b.setLabel("X");
				b.setForeground(Color.red);
		
		    }
		}
		i++;
		b.removeActionListener(this);
		
		//--------------------------For X---------------------------------
		if((b1.getLabel()=="X" && b2.getLabel()=="X"  && b3.getLabel()=="X")
			||(b4.getLabel()=="X" && b5.getLabel()=="X"  && b6.getLabel()=="X")
		    ||(b7.getLabel()=="X" && b8.getLabel()=="X"  && b9.getLabel()=="X")
			||(b1.getLabel()=="X" && b4.getLabel()=="X"  && b7.getLabel()=="X")
			||(b2.getLabel()=="X" && b5.getLabel()=="X"  && b8.getLabel()=="X")
			||(b3.getLabel()=="X" && b6.getLabel()=="X"  && b9.getLabel()=="X")
			||(b1.getLabel()=="X" && b5.getLabel()=="X"  && b9.getLabel()=="X")
			||(b3.getLabel()=="X" && b5.getLabel()=="X"  && b7.getLabel()=="X"))
		{
			Label l2 = new Label("Winner X !!");
		    l2.setForeground(Color.red);
            l2.setSize(400 ,50);
            l2.setLocation(200 , 450);
            add(l2);
			b.removeActionListener(this);
		}
		
		
		//-----------------------For 0---------------------------------
		if((b1.getLabel()=="0" && b2.getLabel()=="0"  && b3.getLabel()=="0")
			||(b4.getLabel()=="0" && b5.getLabel()=="0"  && b6.getLabel()=="0")
		    ||(b7.getLabel()=="0" && b8.getLabel()=="0"  && b9.getLabel()=="0")
			||(b1.getLabel()=="0" && b4.getLabel()=="0"  && b7.getLabel()=="0")
			||(b2.getLabel()=="0" && b5.getLabel()=="0"  && b8.getLabel()=="0")
			||(b3.getLabel()=="0" && b6.getLabel()=="0"  && b9.getLabel()=="0")
			||(b1.getLabel()=="0" && b5.getLabel()=="0"  && b9.getLabel()=="0")
			||(b3.getLabel()=="0" && b5.getLabel()=="0"  && b7.getLabel()=="0"))
		{
			Label l2 = new Label("Winner 0 !!");
		    l2.setForeground(Color.blue);
            l2.setSize(400 ,50);
            l2.setLocation(200 , 450);
            add(l2);
		}
		
	}
}
class tok
{
	public static void main(String args[])
	{
		int x,y,w=500, h=540;
		FDemo f = new FDemo();
		Toolkit t=Toolkit.getDefaultToolkit();
		Dimension d=t.getScreenSize();
		x=(d.width-w)/2;
		y=(d.height-h)/2;
		Image i=t.getImage("s1.jpg");
		f.setIconImage(i);
		f.setVisible(true);
		f.setBounds(x,y,w,h);
                f.addWindowListener(new WindowAdapter(){
                    public void windowClosing(WindowEvent e){
                        System.exit(0);
                    }
                });
	}
}