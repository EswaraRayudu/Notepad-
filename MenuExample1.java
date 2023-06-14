import javax.swing.*;
class MenuExample1
{
JMenu menu,submenu;
JMenuItem i1,i2,i3,i4,i5;
MenuExample1()
{
JFrame f= new JFrame("Menu and MenuItem Example");
JMenuBar mb=new JMenuBar();
menu=new JMenu("FileMenu");
submenu=new JMenu("SubMenu");

i1=new JMenuItem("New");
i2=new JMenuItem("Open");
i3=new JMenuItem("Save");
i4=new JMenuItem("Save As");
i5=new JMenuItem("Print");

menu.add(i1);
menu.add(i3);
submenu.add(i4);
submenu.add(i5);
menu.add(submenu);
mb.add(menu);
f.setJMenuBar(mb);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String args[])
{
new MenuExample1();
}
}







