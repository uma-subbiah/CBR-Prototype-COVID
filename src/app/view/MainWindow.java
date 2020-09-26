package app.view;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import app.domain.Case;
import app.domain.CaseAttributeWeight;
import app.domain.ChronicKidneyDiseaseCbr;
import app.util.ImageUtil;

public class MainWindow extends JFrame
{
	Scanner sc = new Scanner(System.in); 

    private final ReportWindow reportWindow;
    private final ChronicKidneyDiseaseCbr chronicKidneyDiseaseCbr;
    
    public MainWindow()
    {
        initComponents();
        uiSetup();
        listenersSetup();
        
        reportWindow = new ReportWindow();
        chronicKidneyDiseaseCbr = new ChronicKidneyDiseaseCbr();
    }
    
    private void uiSetup()
    {
    	
        setIconImage(new ImageUtil().loadIcon("icons/wine-app.png").getImage());
        
        for (Object object : inputPanel.getComponents()) 
        {
            if (object instanceof JSpinner)
            {
                JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor)((JSpinner) object).getEditor();
                spinnerEditor.getTextField().setHorizontalAlignment(JTextField.CENTER);
            }
        }
        
    }
    
    private void listenersSetup()
    {
        addWindowListener(new WindowAdapter()
        {

            @Override
            public void windowClosing(WindowEvent e) 
            {
                mnuQuit.doClick();
            }
           
        });
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
    	
    	inputPanel = new javax.swing.JPanel();
        btnProcess = new javax.swing.JButton();
        mainMnu = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuProcess = new javax.swing.JMenuItem();
        mnuQuit = new javax.swing.JMenuItem();
        mnuTools = new javax.swing.JMenu();
        mnuReport = new javax.swing.JMenuItem();
        java.awt.GridBagConstraints gridBagConstraints;

        inputPanel = new javax.swing.JPanel();
        cleanBtn = new javax.swing.JButton();
        revBtn = new javax.swing.JButton();
       
        mnuProcess = new javax.swing.JMenuItem();
        mnuQuit = new javax.swing.JMenuItem();
       
        mnuReport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Case Based Reasoning System for Chronic Kidney Disease");
        setPreferredSize(new java.awt.Dimension(1024, 400));
        setResizable(true);

        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Input"));
        inputPanel.setLayout(new java.awt.GridBagLayout());
    
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        inputPanel.add(btnProcess, gridBagConstraints);

        btnProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/view/assets/icons/actions_32x32/start.png"))); // NOI18N
        btnProcess.setMnemonic('p');
        btnProcess.setToolTipText("Start");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        
        cleanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/view/assets/icons/actions_32x32/clean.png"))); // NOI18N
        cleanBtn.setToolTipText("Normalize dataset");
        cleanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
//          Enter python code call here
            	normalizeData();
            }
			
        });
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        inputPanel.add(btnProcess, gridBagConstraints);
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        inputPanel.add(cleanBtn, gridBagConstraints);
        
        getContentPane().add(inputPanel, java.awt.BorderLayout.CENTER);

        mnuQuit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mnuQuit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/view/assets/icons/actions_32x32/quit.png"))); // NOI18N
        mnuQuit.setMnemonic('q');
        mnuQuit.setText("Quit");
        mnuQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQuitActionPerformed(evt);
            }
        });

        mnuReport.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mnuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/view/assets/icons/actions_32x32/report.png"))); // NOI18N
        mnuReport.setMnemonic('r');
        mnuReport.setText("Report");
        mnuReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReportActionPerformed(evt);
            }
        });
        
        mnuTools.add(mnuReport);

        mainMnu.add(mnuTools);
        

        setJMenuBar(mainMnu);

        pack();
    }

    protected void normalizeData() {
    	try{
//    	 z-score standardisation
    	String prg = "import numpy as np"
    			+ "\nimport pandas as pd "
    			+ "\nfrom sklearn import preprocessing"
    			+ "\ndf = pd.read_csv(\"/Users/umasubbiah/Documents/Eclipse/JAva/CBR3/src/app/domain/db/kidney_disease-2.csv\")"
    			+"\ndf_copy = df.copy()"
    			+"\ndf_copy = df_copy.fillna(0)"
    			+"\nsc = preprocessing.StandardScaler()"
    			+"\ndf_copy = sc.fit_transform(df_copy)"
    			+"\ndf_new = pd.DataFrame(df_copy, columns = df.columns)"
    			+ "\ndf_new.to_csv(\"/Users/umasubbiah/Documents/Eclipse/JAva/CBR3/src/app/domain/db/kidney_disease-2.csv\")";
    					
    	BufferedWriter out = new BufferedWriter(new FileWriter("test1.py"));
    	out.write(prg);
    	out.close();
    	Process p = Runtime.getRuntime().exec("/usr/local/bin/python3 test1.py ");
    	BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
    	System.out.println("exec");
    	}catch(Exception e){}
    	 
	}

	private void mnuQuitActionPerformed(java.awt.event.ActionEvent evt) {
        if (JOptionPane.YES_OPTION == (JOptionPane.showConfirmDialog(null, "Do you really want to quit?", "Quit", JOptionPane.YES_NO_OPTION)))
        {
            System.exit(0);
        }
    }

    private void mnuReportActionPerformed(java.awt.event.ActionEvent evt) {
        reportWindow.setVisible(!reportWindow.isVisible());
    }

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {
       
    		System.out.println("Enter the new values");
    		int age = sc.nextInt();
    		int bp = sc.nextInt();
    		double sg = sc.nextDouble();
    		int al = sc.nextInt();
    		int su = sc.nextInt();
    		int rbc = sc.nextInt();
    		int pc = sc.nextInt();
    		int pcc = sc.nextInt();
    		int ba = sc.nextInt();
    		int bgr = sc.nextInt();
    		int bu = sc.nextInt();
    		double scc = sc.nextDouble();
    		int sod = sc.nextInt();
    		double pot = sc.nextDouble();
    		double hemo = sc.nextDouble();
    		int pcv = sc.nextInt();
    		int wc = sc.nextInt();
    		double rc = sc.nextDouble();
    		int htm = sc.nextInt();
    		int dm = sc.nextInt();
    		int cad = sc.nextInt();
    		int appet = sc.nextInt();
    		int pe = sc.nextInt();
    		int ane = sc.nextInt();
    				
    		// Instantiates the new case
        Case newCase = new Case();
        newCase.setAge(age);
        newCase.setAl(al);
        newCase.setAne(ane);
        newCase.setAppet(appet);
        newCase.setBa(ba);
        newCase.setBgr(bgr);
        newCase.setBp(bp);
        newCase.setBu(bu);
        newCase.setCad(cad);
        newCase.setDm(dm);
        newCase.setHemo(hemo);
        newCase.setHtm(htm);
        newCase.setPc(pc);
        newCase.setPcc(pcc);
        newCase.setPcv(pcv);
        newCase.setPe(pe);
        newCase.setPot(pot);
        newCase.setRbc(rbc);
        newCase.setRc(rc);
        newCase.setSc(scc);
        newCase.setSg(sg);
        newCase.setSod(sod);
        newCase.setSu(su);
        newCase.setWc(wc);
        
        System.out.println("Enter the new weights on a scale of 0-10, repetition allowed");
		int age_wt =  sc.nextInt();
		int bp_wt =  sc.nextInt();
		double sg_wt =  sc.nextDouble();
		int al_wt =  sc.nextInt();
		int su_wt =  sc.nextInt();
		int rbc_wt =  sc.nextInt();
		int pc_wt =  sc.nextInt();
		int pcc_wt =  sc.nextInt();
		int ba_wt =  sc.nextInt();
		int bgr_wt =  sc.nextInt();
		int bu_wt =  sc.nextInt();
		double scc_wt =  sc.nextDouble();
		int sod_wt =  sc.nextInt();
		double pot_wt =  sc.nextDouble();
		double hemo_wt =  sc.nextDouble();
		int pcv_wt =  sc.nextInt();
		int wc_wt =  sc.nextInt();
		double rc_wt =  sc.nextDouble();
		int htm_wt =  sc.nextInt();
		int dm_wt =  sc.nextInt();
		int cad_wt =  sc.nextInt();
		int appet_wt =  sc.nextInt();
		int pe_wt =  sc.nextInt();
		int ane_wt =  sc.nextInt();
                
        // Stores the weights of the attributes in an object
        CaseAttributeWeight caseAttributeWeight = new CaseAttributeWeight();
        caseAttributeWeight.setAge(age_wt);
        caseAttributeWeight.setAl(al_wt);
        caseAttributeWeight.setAne(ane_wt);
        caseAttributeWeight.setAppet(appet_wt);
        caseAttributeWeight.setBa(ba_wt);
        caseAttributeWeight.setBgr(bgr_wt);
        caseAttributeWeight.setBp(bp_wt);
        caseAttributeWeight.setBu(bu_wt);
        caseAttributeWeight.setCad(cad_wt);
        caseAttributeWeight.setDm(dm_wt);
        caseAttributeWeight.setHemo(hemo_wt);
        caseAttributeWeight.setHtm(htm_wt);
        caseAttributeWeight.setPc(pc_wt);
        caseAttributeWeight.setPcc(pcc_wt);
        caseAttributeWeight.setPcv(pcv_wt);
        caseAttributeWeight.setPe(pe_wt);
        caseAttributeWeight.setPot(pot_wt);
        caseAttributeWeight.setRbc(rbc_wt);
        caseAttributeWeight.setRc(rc_wt);
        caseAttributeWeight.setSc(scc_wt);
        caseAttributeWeight.setSg(sg_wt);
        caseAttributeWeight.setSod(sod_wt);
        caseAttributeWeight.setSu(su_wt);
        caseAttributeWeight.setWc(wc_wt);   
        
        try
        {
            // Process the new case and udpates the report
            reportWindow.updateCasesTable(chronicKidneyDiseaseCbr.process(newCase, caseAttributeWeight));
            reportWindow.setVisible(true);
        }
        catch (IOException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error loading database", "There was an error when trying to load the "
                    + "database from the .csv file.", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mnuProcessActionPerformed(java.awt.event.ActionEvent evt) {
        btnProcess.doClick();
    }

    private javax.swing.JButton btnProcess;
    private javax.swing.JButton cleanBtn;
    private javax.swing.JButton revBtn;
    
    
    private javax.swing.JPanel inputPanel;
    private javax.swing.JMenuBar mainMnu;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuProcess;
    private javax.swing.JMenuItem mnuQuit;
    private javax.swing.JMenuItem mnuReport;
    private javax.swing.JMenu mnuTools;
    
    
}


/*
Sample input for the 11th case:

60
70
1
3
0
0
0
1
0
379
60
2.6
130
4.1
10.7
32
4500
3.8
1
1
0
0
1
0
*/

/*

Sample input for the weights:

7
9
9
10
10
9
9
10
9
8
10
10
10
10
8
7
5
5
10
10
6
4
9
8

*/
