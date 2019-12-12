import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class login_app extends Applet implements ActionListener{
	TextField name_pass;
	Label n,p,w;
	Button s,c;
	public void init(){
		n=new Label("NAME: ");
		name=new TextField(30);
		add(n);
		add(name);
		p=new Label("PASSWORD: ");
		pass=new TextField(30);
		add(p);
		add(pass);
		w=new Label("LOG IN");
		add(w);
		s=new Button("OK");
		add(s);
		s.addActionListener(this);
		add(c);
		c.addActionListener(this);

	}

	public void actionPerformed(ActionEvent event){
		if(event.getSource()==s){
			w.setText("SUCCESS");
		}
		if(event.getSource()==c){
			name.setText("");
			pass.setText("");
		}
	}
}
