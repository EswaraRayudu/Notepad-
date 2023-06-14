import javax.swing.*;
import java.awt.event.*;

public class Notepad implements ActionListener
{
JFrame f;
JMenuBar mb;
JMenu file,edit,help;
JMenuItem cut,copy,paste,selectAll,open,save,saveAs,new1,subMenu,print,viewHelp;

JTextArea ta;
Notepad()
{
f=new JFrame("NotePad");
cut=  new JMenuItem("cut");
copy=new JMenuItem("copy");
paste=new JMenuItem("paste");
selectAll=new JMenuItem("selectAll");
new1= new JMenuItem("new");
open=new JMenuItem("open");
save=new JMenuItem("save");
saveAs=new JMenuItem("saveAs");
print=new JMenuItem("print");
viewHelp=new JMenuItem("viewHelp");

cut.addActionListener(this);
copy.addActionListener(this);
selectAll.addActionListener(this);
paste.addActionListener(this);
new1.addActionListener(this);
open.addActionListener(this);
save.addActionListener(this);
saveAs.addActionListener(this);
print.addActionListener(this);
viewHelp.addActionListener(this);

mb=new JMenuBar();
file=new JMenu("File");
edit=new JMenu("Edit");
help=new JMenu("Help");
subMenu=new JMenu("subMenu");

edit.add(cut);
edit.add(copy);
edit.add(paste);
edit.add(selectAll);

file.add(new1);
file.add(open);
file.add(save);
file.add(saveAs);
file.add(subMenu);
subMenu.add(print);
help.add(viewHelp);

mb.add(file);
mb.add(edit);
mb.add(help);

ta=new JTextArea();
ta.setBounds(5,5,3600,3200);
f.add(mb);
f.add(ta);
f.setJMenuBar(mb);
f.setLayout(null);
f.setSize(1000,1000);
f.setVisible(true);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==cut)
ta.cut();
if(e.getSource()==paste)
ta.paste();
if(e.getSource()==copy)
ta.copy();
if(e.getSource()==selectAll)
ta.selectAll();
}

public static void main(String arg[])
{
new Notepad();
}
}





