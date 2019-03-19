import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
 * MyPanel will create Barbell(s) where the user can change the barbell's color.
 * The user may also drag a the Barbell. The barbell will change from red to green to blue 
 * and reset when done. 
 */

public class EbolaMain extends JPanel {
	
	public static void main(String[] args) {
		//EbolaMain panel = new EbolaMain(800,800,Color.white);
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Ebola Patient Application");	//the program itself
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.pack(); //size is based on panel size
		frame.setVisible(true);
		
		
		JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();
        JPanel panel11 = new JPanel();
        JPanel panel12 = new JPanel();
		JPanel panel13 = new JPanel();
        JPanel panel14 = new JPanel();
        JPanel panel15 = new JPanel();
        JPanel panel16 = new JPanel();
        JPanel panel17 = new JPanel();
		     
		    // Create checkboxes with different constructors
		    JCheckBox checkboxYes = new JCheckBox("Yes");
		    JCheckBox checkboxNo = new JCheckBox("No");      
		    JCheckBox checkboxLow = new JCheckBox("Low");
		    JCheckBox checkboxMed = new JCheckBox("Med");
		    JCheckBox checkboxHigh = new JCheckBox("High");
		    
		    // Set up the title for the panel
		    panel1.setBorder(BorderFactory.createTitledBorder("Fever"));
		    panel2.setBorder(BorderFactory.createTitledBorder("Headache"));
		    panel3.setBorder(BorderFactory.createTitledBorder("Joint/Muscle Aches"));
		    panel4.setBorder(BorderFactory.createTitledBorder("Chills"));
		    panel5.setBorder(BorderFactory.createTitledBorder("Weakness"));
		    panel6.setBorder(BorderFactory.createTitledBorder("Nausea/Vomiting"));
		    panel7.setBorder(BorderFactory.createTitledBorder("Diarrhea"));
		    panel8.setBorder(BorderFactory.createTitledBorder("Red Eyes"));
		    panel9.setBorder(BorderFactory.createTitledBorder("Raised Rash"));
		    panel10.setBorder(BorderFactory.createTitledBorder("Chest Pain"));
		    panel11.setBorder(BorderFactory.createTitledBorder("Cough"));
		    panel12.setBorder(BorderFactory.createTitledBorder("Sore Throat"));
		    panel13.setBorder(BorderFactory.createTitledBorder("Stomach Pain"));
		    panel14.setBorder(BorderFactory.createTitledBorder("Severe Weight Loss"));
		    panel15.setBorder(BorderFactory.createTitledBorder("Bruising"));
		    panel16.setBorder(BorderFactory.createTitledBorder("External Bleeding"));
		    panel17.setBorder(BorderFactory.createTitledBorder("Internal Bleeding"));
		     
		    // Add the checkbox into the panels 
		    panel1.add(checkboxYes);
		    panel1.add(checkboxNo);
		    
		    panel2.add(checkboxYes);
		    panel2.add(checkboxNo);
		    
		    panel3.add(checkboxYes);
		    panel3.add(checkboxNo);
		    
		    panel4.add(checkboxYes);
		    panel4.add(checkboxNo);
		    
		    panel5.add(checkboxYes);
		    panel5.add(checkboxNo);
		    
		    panel6.add(checkboxYes);
		    panel6.add(checkboxNo);
		    
		    panel7.add(checkboxYes);
		    panel7.add(checkboxNo);
		    
		    panel8.add(checkboxYes);
		    panel8.add(checkboxNo);
		    
		    panel9.add(checkboxYes);
		    panel9.add(checkboxNo);
		    
		    panel10.add(checkboxLow);
		    panel10.add(checkboxMed);
		    panel10.add(checkboxHigh);
		    
		    panel11.add(checkboxYes);
		    panel11.add(checkboxNo);
		    
		    panel12.add(checkboxYes);
		    panel12.add(checkboxNo);
		    
		    panel13.add(checkboxYes);
		    panel13.add(checkboxNo);
		    
		    panel14.add(checkboxYes);
		    panel14.add(checkboxNo);
		    
		    panel15.add(checkboxLow);
		    panel15.add(checkboxMed);
		    panel15.add(checkboxHigh);
		    
		    panel16.add(checkboxYes);
		    panel16.add(checkboxNo);
		    
		    panel17.add(checkboxYes);
		    panel17.add(checkboxNo);
		    
		    //Create layout to handle all the panels 17 rows 1 column
		    frame.setLayout(new GridLayout(10, 2, 10, 10));
		     
		    // Add the panel into the frame
		    frame.add(panel1);
		    frame.add(panel2);
		    frame.add(panel3);
		    frame.add(panel4);
		    frame.add(panel5);
		    frame.add(panel6);
		    frame.add(panel7);
		    frame.add(panel8);
		    frame.add(panel9);
		    frame.add(panel10);
		    frame.add(panel11);
		    frame.add(panel12);
		    frame.add(panel13);
		    frame.add(panel14);
		    frame.add(panel15);
		    frame.add(panel16);
		    frame.add(panel17);
		    
		    // Set the window to be visible as the default to be false
		    frame.pack();
		    frame.setVisible(true);
	}
}
