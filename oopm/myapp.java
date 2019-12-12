import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class myApp extends Applet
{
	TextField namef,passf;
	Button submit;

	public void init()

	{	Label l1=new Label("Name");

		add(l1);
		namef=new TextField(50);
		add(namef);
		Label l2=new Label("Password");
		add(l2);
passf=new TextField(50);
		add(passf);

		submit=new Button("Submit");



		add(submit);



		namef.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				namefActionPerformed(evt);
			}

		});



		passf.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				passfActionPerformed(evt);
			}

		});



		submit.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				submitActionPerformed(evt);
			}

		});


	}

	void namefActionPerformed(java.awt.event.ActionEvent evt)
	{
		String s=namef.getText();
	}

	void passfActionPerformed(java.awt.event.ActionEvent evt)
	{
		String s=passf.getText();
	}

	void submitActionPerformed(java.awt.event.ActionEvent evt)
	{
		passf.setText("Bananana");
		namef.setText("babababnaa");
	}









	public void paint(Graphics g)
	{
		repaint();
	}
}
