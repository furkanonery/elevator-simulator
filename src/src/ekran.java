package src;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import org.omg.CORBA.INITIALIZE;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ekran {

	
	private JFrame frame;

	public static ArrayList<JLabel> ElvDataA = new ArrayList<JLabel>();
	public static ArrayList<JLabel> ElvDataB = new ArrayList<JLabel>();
	public static ArrayList<JLabel> ElvDataC = new ArrayList<JLabel>();
	public static ArrayList<JLabel> ElvDataD = new ArrayList<JLabel>();
	public static ArrayList<JLabel> ElvDataE = new ArrayList<JLabel>();
	
	public static ArrayList<JLabel> Floor0Data = new ArrayList<JLabel>();
	public static ArrayList<JLabel> Floor1Data = new ArrayList<JLabel>();
	public static ArrayList<JLabel> Floor2Data = new ArrayList<JLabel>();
	public static ArrayList<JLabel> Floor3Data = new ArrayList<JLabel>();
	public static ArrayList<JLabel> Floor4Data = new ArrayList<JLabel>();
	
	public static ArrayList <JLabel> lblexitCountdata = new ArrayList<JLabel>();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ekran window = new ekran();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ekran() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(20, 20, 704, 961);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("0. floor: queue:");
		lblNewLabel.setBounds(0, 0, 107, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFloor = new JLabel("1. floor: all:");
		lblFloor.setBounds(0, 13, 75, 16);
		frame.getContentPane().add(lblFloor);
		
		JLabel lblFloor_1 = new JLabel("2. floor: all:");
		lblFloor_1.setBounds(0, 29, 75, 16);
		frame.getContentPane().add(lblFloor_1);
		
		JLabel lblFloor_2 = new JLabel("3. floor: all");
		lblFloor_2.setBounds(0, 42, 75, 16);
		frame.getContentPane().add(lblFloor_2);
		
		JLabel lblFloor_3 = new JLabel("4. floor: all");
		lblFloor_3.setBounds(0, 58, 75, 16);
		frame.getContentPane().add(lblFloor_3);
		
		JLabel lbl0queue = new JLabel("0");
		lbl0queue.setBounds(102, 0, 56, 16);
		frame.getContentPane().add(lbl0queue);
		
		JLabel lbl1all = new JLabel("0");
		lbl1all.setBounds(83, 13, 56, 16);
		frame.getContentPane().add(lbl1all);
		
		JLabel lbl2all = new JLabel("0");
		lbl2all.setBounds(83, 29, 56, 16);
		frame.getContentPane().add(lbl2all);
		
		JLabel lbl3all = new JLabel("0");
		lbl3all.setBounds(83, 42, 56, 16);
		frame.getContentPane().add(lbl3all);
		
		JLabel lbl4all = new JLabel("0");
		lbl4all.setBounds(83, 58, 56, 16);
		frame.getContentPane().add(lbl4all);
		
		JLabel lblNewLabel_1 = new JLabel("queue:");
		lblNewLabel_1.setBounds(154, 13, 56, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("queue:");
		label.setBounds(154, 29, 56, 16);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("queue:");
		label_1.setBounds(154, 42, 56, 16);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("queue:");
		label_2.setBounds(154, 58, 56, 16);
		frame.getContentPane().add(label_2);
		
		JLabel lbl1queue = new JLabel("0");
		lbl1queue.setBounds(202, 13, 56, 16);
		frame.getContentPane().add(lbl1queue);
		
		JLabel lbl2queue = new JLabel("0");
		lbl2queue.setBounds(202, 29, 56, 16);
		frame.getContentPane().add(lbl2queue);
		
		JLabel lbl3queue = new JLabel("0");
		lbl3queue.setBounds(202, 42, 56, 16);
		frame.getContentPane().add(lbl3queue);
		
		JLabel lbl4queue = new JLabel("0");
		lbl4queue.setBounds(202, 58, 56, 16);
		frame.getContentPane().add(lbl4queue);
		
		JLabel lblNewLabel_2 = new JLabel("exit count:");
		lblNewLabel_2.setBounds(0, 75, 75, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblexitCount = new JLabel("0");
		lblexitCount.setBounds(83, 75, 56, 16);
		frame.getContentPane().add(lblexitCount);
		
		//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
		JLabel lblNewLabel_3 = new JLabel("Active:");
		lblNewLabel_3.setBounds(0, 104, 49, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblAactive = new JLabel("false");
		lblAactive.setBounds(61, 104, 56, 16);
		frame.getContentPane().add(lblAactive);
		ElvDataA.add(lblAactive);
		
		JLabel lblNewLabel_4 = new JLabel("mode:");
		lblNewLabel_4.setBounds(124, 126, 42, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblAworking = new JLabel("idle");
		lblAworking.setBounds(178, 126, 56, 16);
		frame.getContentPane().add(lblAworking);
		ElvDataA.add(lblAworking);
		
		JLabel lblFloor_4 = new JLabel("floor:");
		lblFloor_4.setBounds(124, 141, 42, 16);
		frame.getContentPane().add(lblFloor_4);
		
		JLabel lblAfloor = new JLabel("0");
		lblAfloor.setBounds(178, 141, 56, 16);
		frame.getContentPane().add(lblAfloor);
		ElvDataA.add(lblAfloor);
		
		JLabel lblDestination = new JLabel("destination:");
		lblDestination.setBounds(124, 155, 67, 16);
		frame.getContentPane().add(lblDestination);
		
		JLabel lblAdestination = new JLabel("0");
		lblAdestination.setBounds(202, 155, 56, 16);
		frame.getContentPane().add(lblAdestination);
		ElvDataA.add(lblAdestination);
		
		JLabel lblDirection = new JLabel("direction:");
		lblDirection.setBounds(124, 171, 56, 16);
		frame.getContentPane().add(lblDirection);
		
		JLabel lblAdirection = new JLabel("up");
		lblAdirection.setBounds(178, 171, 56, 16);
		frame.getContentPane().add(lblAdirection);
		ElvDataA.add(lblAdirection);
		
		JLabel lblNewLabel_5 = new JLabel("capacity:");
		lblNewLabel_5.setBounds(124, 184, 56, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblAcapacity = new JLabel("10");
		lblAcapacity.setBounds(178, 184, 56, 16);
		frame.getContentPane().add(lblAcapacity);
		ElvDataA.add(lblAcapacity);
		
		JLabel lblCountinside = new JLabel("count_inside:");
		lblCountinside.setBounds(124, 200, 86, 16);
		frame.getContentPane().add(lblCountinside);
		
		JLabel lblAcount_inside = new JLabel("0");
		lblAcount_inside.setBounds(219, 200, 56, 16);
		frame.getContentPane().add(lblAcount_inside);
		ElvDataA.add(lblAcount_inside);
		
		JLabel lblNewLabel_6 = new JLabel("inside:");
		lblNewLabel_6.setBounds(124, 217, 42, 16);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblAinside = new JLabel("[]");
		lblAinside.setBounds(178, 217, 245, 16);
		frame.getContentPane().add(lblAinside);
		ElvDataA.add(lblAinside);
		
		
		//BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBbb
		JLabel lblNewLabel_31 = new JLabel("Active:");
		lblNewLabel_31.setBounds(0, 104+140, 49, 16);
		frame.getContentPane().add(lblNewLabel_31);
		
		JLabel lblBactive = new JLabel("false");
		lblBactive.setBounds(61, 104+140, 56, 16);
		frame.getContentPane().add(lblBactive);
		ElvDataB.add(lblBactive);
		
		JLabel lblNewLabel_41 = new JLabel("mode:");
		lblNewLabel_41.setBounds(124, 126+140, 42, 16);
		frame.getContentPane().add(lblNewLabel_41);
		
		JLabel lblBworking = new JLabel("idle");
		lblBworking.setBounds(178, 126+140, 56, 16);
		frame.getContentPane().add(lblBworking);
		ElvDataB.add(lblBworking);
		
		JLabel lblFloor_41 = new JLabel("floor:");
		lblFloor_41.setBounds(124, 141+140, 42, 16);
		frame.getContentPane().add(lblFloor_41);
		
		JLabel lblBfloor = new JLabel("0");
		lblBfloor.setBounds(178, 141+140, 56, 16);
		frame.getContentPane().add(lblBfloor);
		ElvDataB.add(lblBfloor);
		
		JLabel lblDestination1 = new JLabel("destination:");
		lblDestination1.setBounds(124, 155+140, 67, 16);
		frame.getContentPane().add(lblDestination1);
		
		JLabel lblBdestination = new JLabel("0");
		lblBdestination.setBounds(202, 155+140, 56, 16);
		frame.getContentPane().add(lblBdestination);
		ElvDataB.add(lblBdestination);
		
		JLabel lblDirection1 = new JLabel("direction:");
		lblDirection1.setBounds(124, 171+140, 56, 16);
		frame.getContentPane().add(lblDirection1);
		
		JLabel lblBdirection = new JLabel("up");
		lblBdirection.setBounds(178, 171+140, 56, 16);
		frame.getContentPane().add(lblBdirection);
		ElvDataB.add(lblBdirection);
		
		JLabel lblNewLabel_51 = new JLabel("capacity:");
		lblNewLabel_51.setBounds(124, 184+140, 56, 16);
		frame.getContentPane().add(lblNewLabel_51);
		
		JLabel lblBcapacity = new JLabel("10");
		lblBcapacity.setBounds(178, 184+140, 56, 16);
		frame.getContentPane().add(lblBcapacity);
		ElvDataB.add(lblBcapacity);
		
		JLabel lblCountinside1 = new JLabel("count_inside:");
		lblCountinside1.setBounds(124, 200+140, 86, 16);
		frame.getContentPane().add(lblCountinside1);
		
		JLabel lblBcount_inside = new JLabel("0");
		lblBcount_inside.setBounds(219, 200+140, 56, 16);
		frame.getContentPane().add(lblBcount_inside);
		ElvDataB.add(lblBcount_inside);
		
		JLabel lblNewLabel_61 = new JLabel("inside:");
		lblNewLabel_61.setBounds(124, 217+140, 42, 16);
		frame.getContentPane().add(lblNewLabel_61);
		
		JLabel lblBinside = new JLabel("[]");
		lblBinside.setBounds(178, 217+140, 245, 16);
		frame.getContentPane().add(lblBinside);
		ElvDataB.add(lblBinside);
		
		//CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC
		
		JLabel lblNewLabel_311 = new JLabel("Active:");
		lblNewLabel_311.setBounds(0, 104+140+140, 49, 16);
		frame.getContentPane().add(lblNewLabel_311);
		
		JLabel lblCactive = new JLabel("false");
		lblCactive.setBounds(61, 104+140+140, 56, 16);
		frame.getContentPane().add(lblCactive);
		ElvDataC.add(lblCactive);
		
		JLabel lblNewLabel_411 = new JLabel("mode:");
		lblNewLabel_411.setBounds(124, 126+140+140, 42, 16);
		frame.getContentPane().add(lblNewLabel_411);
		
		JLabel lblCworking = new JLabel("idle");
		lblCworking.setBounds(178, 126+140+140, 56, 16);
		frame.getContentPane().add(lblCworking);
		ElvDataC.add(lblCworking);
		
		JLabel lblFloor_411 = new JLabel("floor:");
		lblFloor_411.setBounds(124, 141+140+140, 42, 16);
		frame.getContentPane().add(lblFloor_411);
		
		JLabel lblCfloor = new JLabel("0");
		lblCfloor.setBounds(178, 141+140+140, 56, 16);
		frame.getContentPane().add(lblCfloor);
		ElvDataC.add(lblCfloor);
		
		JLabel lblDestination11 = new JLabel("destination:");
		lblDestination11.setBounds(124, 155+140+140, 67, 16);
		frame.getContentPane().add(lblDestination11);
		
		JLabel lblCdestination = new JLabel("0");
		lblCdestination.setBounds(202, 155+140+140, 56, 16);
		frame.getContentPane().add(lblCdestination);
		ElvDataC.add(lblCdestination);
		
		JLabel lblDirection11 = new JLabel("direction:");
		lblDirection11.setBounds(124, 171+140+140, 56, 16);
		frame.getContentPane().add(lblDirection11);
		
		JLabel lblCdirection = new JLabel("up");
		lblCdirection.setBounds(178, 171+140+140, 56, 16);
		frame.getContentPane().add(lblCdirection);
		ElvDataC.add(lblCdirection);
		
		JLabel lblNewLabel_511 = new JLabel("capacity:");
		lblNewLabel_511.setBounds(124, 184+140+140, 56, 16);
		frame.getContentPane().add(lblNewLabel_511);
		
		JLabel lblCcapacity = new JLabel("10");
		lblCcapacity.setBounds(178, 184+140+140, 56, 16);
		frame.getContentPane().add(lblCcapacity);
		ElvDataC.add(lblCcapacity);
		
		JLabel lblCountinside11 = new JLabel("count_inside:");
		lblCountinside11.setBounds(124, 200+140+140, 86, 16);
		frame.getContentPane().add(lblCountinside11);
		
		JLabel lblCcount_inside = new JLabel("0");
		lblCcount_inside.setBounds(219, 200+140+140, 56, 16);
		frame.getContentPane().add(lblCcount_inside);
		ElvDataC.add(lblCcount_inside);
		
		JLabel lblNewLabel_611 = new JLabel("inside:");
		lblNewLabel_611.setBounds(124, 217+140+140, 42, 16);
		frame.getContentPane().add(lblNewLabel_611);
		
		JLabel lblCinside = new JLabel("[]");
		lblCinside.setBounds(178, 217+140+140, 245, 16);
		frame.getContentPane().add(lblCinside);
		ElvDataC.add(lblCinside);
		
		//DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD
		
		JLabel lblNewLabel_3111 = new JLabel("Active:");
		lblNewLabel_3111.setBounds(0, 104+140+140+140, 49, 16);
		frame.getContentPane().add(lblNewLabel_3111);
		
		JLabel lblDactive = new JLabel("false");
		lblDactive.setBounds(61, 104+140+140+140, 56, 16);
		frame.getContentPane().add(lblDactive);
		ElvDataD.add(lblDactive);
		
		JLabel lblNewLabel_4111 = new JLabel("mode:");
		lblNewLabel_4111.setBounds(124, 126+140+140+140, 42, 16);
		frame.getContentPane().add(lblNewLabel_4111);
		
		JLabel lblDworking = new JLabel("idle");
		lblDworking.setBounds(178, 126+140+140+140, 56, 16);
		frame.getContentPane().add(lblDworking);
		ElvDataD.add(lblDworking);
		
		JLabel lblFloor_4111 = new JLabel("floor:");
		lblFloor_4111.setBounds(124, 141+140+140+140, 42, 16);
		frame.getContentPane().add(lblFloor_4111);
		
		JLabel lblDfloor = new JLabel("0");
		lblDfloor.setBounds(178, 141+140+140+140, 56, 16);
		frame.getContentPane().add(lblDfloor);
		ElvDataD.add(lblDfloor);
		
		JLabel lblDestination111 = new JLabel("destination:");
		lblDestination111.setBounds(124, 155+140+140+140, 67, 16);
		frame.getContentPane().add(lblDestination111);
		
		JLabel lblDdestination = new JLabel("0");
		lblDdestination.setBounds(202, 155+140+140+140, 56, 16);
		frame.getContentPane().add(lblDdestination);
		ElvDataD.add(lblDdestination);
		
		JLabel lblDirection111 = new JLabel("direction:");
		lblDirection111.setBounds(124, 171+140+140+140, 56, 16);
		frame.getContentPane().add(lblDirection111);
		
		JLabel lblDdirection = new JLabel("up");
		lblDdirection.setBounds(178, 171+140+140+140, 56, 16);
		frame.getContentPane().add(lblDdirection);
		ElvDataD.add(lblDdirection);
		
		JLabel lblNewLabel_5111 = new JLabel("capacity:");
		lblNewLabel_5111.setBounds(124, 184+140+140+140, 56, 16);
		frame.getContentPane().add(lblNewLabel_5111);
		
		JLabel lblDcapacity = new JLabel("10");
		lblDcapacity.setBounds(178, 184+140+140+140, 56, 16);
		frame.getContentPane().add(lblDcapacity);
		ElvDataD.add(lblDcapacity);
		
		JLabel lblCountinside111 = new JLabel("count_inside:");
		lblCountinside111.setBounds(124, 200+140+140+140, 86, 16);
		frame.getContentPane().add(lblCountinside111);
		
		JLabel lblDcount_inside = new JLabel("0");
		lblDcount_inside.setBounds(219, 200+140+140+140, 56, 16);
		frame.getContentPane().add(lblDcount_inside);
		ElvDataD.add(lblDcount_inside);
		
		JLabel lblNewLabel_6111 = new JLabel("inside:");
		lblNewLabel_6111.setBounds(124, 217+140+140+140, 42, 16);
		frame.getContentPane().add(lblNewLabel_6111);
		
		JLabel lblDinside = new JLabel("[]");
		lblDinside.setBounds(178, 217+140+140+140, 245, 16);
		frame.getContentPane().add(lblDinside);
		ElvDataD.add(lblDinside);
		
		//EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
		
		JLabel lblNewLabel_31111 = new JLabel("Active:");
		lblNewLabel_31111.setBounds(0, 104+140+140+140+140, 49, 16);
		frame.getContentPane().add(lblNewLabel_31111);
		
		JLabel lblEactive = new JLabel("false");
		lblEactive.setBounds(61, 104+140+140+140+140, 56, 16);
		frame.getContentPane().add(lblEactive);
		ElvDataE.add(lblEactive);
		
		JLabel lblNewLabel_41111 = new JLabel("mode:");
		lblNewLabel_41111.setBounds(124, 126+140+140+140+140, 42, 16);
		frame.getContentPane().add(lblNewLabel_41111);
		
		JLabel lblEworking = new JLabel("idle");
		lblEworking.setBounds(178, 126+140+140+140+140, 56, 16);
		frame.getContentPane().add(lblEworking);
		ElvDataE.add(lblEworking);
		
		JLabel lblFloor_41111 = new JLabel("floor:");
		lblFloor_41111.setBounds(124, 141+140+140+140+140, 42, 16);
		frame.getContentPane().add(lblFloor_41111);
		
		JLabel lblEfloor = new JLabel("0");
		lblEfloor.setBounds(178, 141+140+140+140+140, 56, 16);
		frame.getContentPane().add(lblEfloor);
		ElvDataE.add(lblEfloor);
		
		JLabel lblDestination1111 = new JLabel("destination:");
		lblDestination1111.setBounds(124, 155+140+140+140+140, 67, 16);
		frame.getContentPane().add(lblDestination1111);
		
		JLabel lblEdestination = new JLabel("0");
		lblEdestination.setBounds(202, 155+140+140+140+140, 56, 16);
		frame.getContentPane().add(lblEdestination);
		ElvDataE.add(lblEdestination);
		
		JLabel lblDirection1111 = new JLabel("direction:");
		lblDirection1111.setBounds(124, 171+140+140+140+140, 56, 16);
		frame.getContentPane().add(lblDirection1111);
		
		JLabel lblEdirection = new JLabel("up");
		lblEdirection.setBounds(178, 171+140+140+140+140, 56, 16);
		frame.getContentPane().add(lblEdirection);
		ElvDataE.add(lblEdirection);
		
		JLabel lblNewLabel_51111 = new JLabel("capacity:");
		lblNewLabel_51111.setBounds(124, 184+140+140+140+140, 56, 16);
		frame.getContentPane().add(lblNewLabel_51111);
		
		JLabel lblEcapacity = new JLabel("10");
		lblEcapacity.setBounds(178, 184+140+140+140+140, 56, 16);
		frame.getContentPane().add(lblEcapacity);
		ElvDataE.add(lblEcapacity);
		
		JLabel lblCountinside1111 = new JLabel("count_inside:");
		lblCountinside1111.setBounds(124, 200+140+140+140+140, 86, 16);
		frame.getContentPane().add(lblCountinside1111);
		
		JLabel lblEcount_inside = new JLabel("0");
		lblEcount_inside.setBounds(219, 200+140+140+140+140, 56, 16);
		frame.getContentPane().add(lblEcount_inside);
		ElvDataE.add(lblEcount_inside);
		
		JLabel lblNewLabel_61111 = new JLabel("inside:");
		lblNewLabel_61111.setBounds(124, 217+140+140+140+140, 42, 16);
		frame.getContentPane().add(lblNewLabel_61111);
		
		JLabel lblEinside = new JLabel("[]");
		lblEinside.setBounds(178, 217+140+140+140+140, 245, 16);
		frame.getContentPane().add(lblEinside);
		ElvDataE.add(lblEinside);
		
		//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
		
		JLabel lblNewLabel_7 = new JLabel("Asans\u00F6r-1");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_7.setBounds(412, 140, 186, 32);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblAsansr = new JLabel("Asans\u00F6r-2");
		lblAsansr.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAsansr.setBounds(412, 281, 186, 32);
		frame.getContentPane().add(lblAsansr);
		
		JLabel lblAsansr_1 = new JLabel("Asans\u00F6r-3");
		lblAsansr_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAsansr_1.setBounds(412, 420, 186, 32);
		frame.getContentPane().add(lblAsansr_1);
		
		JLabel lblAsansr_2 = new JLabel("Asans\u00F6r-4");
		lblAsansr_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAsansr_2.setBounds(412, 560, 186, 32);
		frame.getContentPane().add(lblAsansr_2);
		
		JLabel lblAsansr_3 = new JLabel("Asans\u00F6r-5");
		lblAsansr_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAsansr_3.setBounds(412, 700, 186, 32);
		frame.getContentPane().add(lblAsansr_3);
		
		JLabel lblNewLabel_8 = new JLabel("0. floor:");
		lblNewLabel_8.setBounds(12, 798, 56, 16);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel label_3 = new JLabel("1. floor:");
		label_3.setBounds(12, 816, 56, 16);
		frame.getContentPane().add(label_3);
		
		JLabel label_31 = new JLabel("2. floor:");
		label_31.setBounds(12, 816+18, 56, 16);
		frame.getContentPane().add(label_31);
		
		JLabel label_311 = new JLabel("3. floor:");
		label_311.setBounds(12, 816+36, 56, 16);
		frame.getContentPane().add(label_311);
		
		JLabel label_3111 = new JLabel("4. floor:");
		label_3111.setBounds(12, 816+54, 56, 16);
		frame.getContentPane().add(label_3111);
		
		JLabel lbl0inside = new JLabel("[]");
		lbl0inside.setBounds(61, 798, 273, 16);
		frame.getContentPane().add(lbl0inside);
		
		JLabel lbl1inside = new JLabel("[]");
		lbl1inside.setBounds(61, 816, 273, 16);
		frame.getContentPane().add(lbl1inside);
		
		JLabel lbl2inside = new JLabel("[]");
		lbl2inside.setBounds(61, 834, 273, 16);
		frame.getContentPane().add(lbl2inside);
		
		JLabel lbl3inside = new JLabel("[]");
		lbl3inside.setBounds(61, 852, 273, 16);
		frame.getContentPane().add(lbl3inside);
		
		JLabel lbl4inside = new JLabel("[]");
		lbl4inside.setBounds(61, 870, 362, 16);
		frame.getContentPane().add(lbl4inside);
		
		Floor0Data.add(lbl0queue);
		Floor0Data.add(lbl0inside);
		
		Floor1Data.add(lbl1all);
		Floor1Data.add(lbl1queue);
		Floor1Data.add(lbl1inside);
		
		Floor2Data.add(lbl2all);
		Floor2Data.add(lbl2queue);
		Floor2Data.add(lbl2inside);
		
		Floor3Data.add(lbl3all);
		Floor3Data.add(lbl3queue);
		Floor3Data.add(lbl3inside);
		
		Floor4Data.add(lbl4all);
		Floor4Data.add(lbl4queue);
		Floor4Data.add(lbl4inside);
		
		lblexitCountdata.add(lblexitCount);
		
		
		JButton startButton = new JButton("START");
		startButton.setBackground(Color.GRAY);
		
		
		startButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		startButton.setBounds(435, 783, 112, 41);
		frame.getContentPane().add(startButton);
		
		JButton stopButton = new JButton("STOP");
		stopButton.setBackground(Color.GRAY);
		
		
		stopButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		stopButton.setBounds(435, 837, 112, 41);
		frame.getContentPane().add(stopButton);
		
		
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				startButton.setBackground(Color.GREEN);
				stopButton.setBackground(Color.GRAY);
				
					elevator.start();
				
				
					elevator.live.start();
				
				
					elevator.login.start();
		
				
					elevator.exit.start();
				
				
					elevator.kontrol.start();
				
				
				
			
			}
		});
		stopButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				stopButton.setBackground(Color.RED);
				startButton.setBackground(Color.GRAY);
				
				
				elevator.live.stop();
				elevator.login.stop();
				elevator.exit.stop();
				elevator.kontrol.stop();
				
				//elevator.elv1.stop();
				//elevator.elv2.stop();
				elevator.elv3.stop();
				elevator.elv4.stop();
				elevator.elv5.stop();
			
				ElvDataA.get(1).setText("idle");
				ElvDataB.get(1).setText("idle");
				ElvDataC.get(1).setText("idle");
				ElvDataD.get(1).setText("idle");
				ElvDataE.get(1).setText("idle");
				
			}
		});
		
		
		/*int refreshRate=0;
		
		
        timer = new Timer(refreshRate, (e) -> {
            
        	
        	int i=Integer.parseInt(lblAcount_inside.getText());
        	i++;
        	lblAcount_inside.setText(""+i);
        	
        	try {
    			Thread.sleep(500);
    		} catch (Exception e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
        	
            
            
        });
        
       
        	timer2 = new Timer(refreshRate, (e) -> {
            
        	
        	int j=Integer.parseInt(lblBcount_inside.getText());
        	j++;
        	lblBcount_inside.setText(""+j);
        	
        	
        	
            
          
        });*/
        	
        	
       
		
		
        
	}
}
