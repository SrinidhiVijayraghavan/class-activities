import java.io.File;
import javax.swing.*;
import java.awt.FlowLayout;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class FileChooser1 {
	FileChooser1()
	{
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		JButton bt=new JButton("Browse");
		bt.setBounds(100,80,100,20);
		f.setVisible(true);
		bt.addActionListener(this);
		f.setSize(300,400);
		p.setLayout(new FlowLayout());
		p.add(bt);
		f.add(p);
		f.pack();
		
	}
public void actionPerformed(ActionEvent e)
	{
JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());		
		int returnValue = jfc.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			//System.out.println(selectedFile.getAbsolutePath());
		}

		
	}


	public static void main(String[] args) {
		FileChooser1 g=new FileChooser1();
			
	}

}