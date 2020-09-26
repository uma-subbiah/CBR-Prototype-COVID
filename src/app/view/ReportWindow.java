package app.view;

import app.domain.CaseSimilarity;
import app.util.ImageUtil;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ReportWindow extends JFrame
{

    public ReportWindow() 
    {
        initComponents();
        uiSetup();
    }
    
    private void uiSetup()
    {
        setIconImage(new ImageUtil().loadIcon("icons/actions_32x32/report.png").getImage());
    }
    
    private void clearCasesTable()
    {
        DefaultTableModel tableModel = (DefaultTableModel) casesTable.getModel();
        tableModel.getDataVector().removeAllElements();
        tableModel.fireTableDataChanged();
    }
    
    protected void updateCasesTable(List<CaseSimilarity> casesSimilarity)
    {
        clearCasesTable();
        DefaultTableModel tableModel = (DefaultTableModel) casesTable.getModel();
        casesSimilarity.stream().forEach((caseSimilarity) -> 
        {
            tableModel.addRow(new Object[]
            {
                caseSimilarity.getSimilarCase().getAge(),
                caseSimilarity.getSimilarCase().getBp(),
                caseSimilarity.getSimilarCase().getSg(),
                caseSimilarity.getSimilarCase().getAl(),
                caseSimilarity.getSimilarCase().getSu(),
                caseSimilarity.getSimilarCase().getRbc(),
                caseSimilarity.getSimilarCase().getPc(),
                caseSimilarity.getSimilarCase().getPcc(),
                caseSimilarity.getSimilarCase().getBa(),
                caseSimilarity.getSimilarCase().getBgr(),
                caseSimilarity.getSimilarCase().getBu(),
                caseSimilarity.getSimilarCase().getSc(),
                caseSimilarity.getSimilarCase().getSod(),
                caseSimilarity.getSimilarCase().getPot(),
                caseSimilarity.getSimilarCase().getHemo(),
                caseSimilarity.getSimilarCase().getPcv(),
                caseSimilarity.getSimilarCase().getWc(),
                caseSimilarity.getSimilarCase().getRc(),
                caseSimilarity.getSimilarCase().getHtm(),
                caseSimilarity.getSimilarCase().getDm(),
                caseSimilarity.getSimilarCase().getCad(),
                caseSimilarity.getSimilarCase().getAppet(),
                caseSimilarity.getSimilarCase().getPe(),
                caseSimilarity.getSimilarCase().getAne(),
                caseSimilarity.getSimilarCase().getClassification(),
                caseSimilarity.getSimilarity()
            });
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        casesTableScrollpane = new javax.swing.JScrollPane();
        casesTable = new javax.swing.JTable();

        setTitle("Report");

        casesTableScrollpane.setBorder(null);

        casesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "age", 	"bp",	"sg",	"al",	"su",	"rbc",	"pc",	"pcc",	"ba",	"bgr",	"bu",	"sc",	"sod",	"pot",	"hemo",	"pcv",	"wc",	"rc",	"htn",	"dm",	"cad",	"appet",	"pe",	"ane",	"Classification", "Similarity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class,java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class,java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        casesTableScrollpane.setViewportView(casesTable);
        getContentPane().add(casesTableScrollpane, java.awt.BorderLayout.CENTER);
        casesTable.setValueAt(0, 0, 24);
        pack();
    }

    private javax.swing.JTable casesTable;
    private javax.swing.JScrollPane casesTableScrollpane;
}
