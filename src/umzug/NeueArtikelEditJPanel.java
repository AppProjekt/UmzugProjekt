/*
 * FixedcounterEditJPanel.java
 *
 * Created on 30. Januar 2007, 17:54
 */
package umzug;

import java.awt.*;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rajninal
 */
public class NeueArtikelEditJPanel extends javax.swing.JPanel 
{
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    Component frame = Umzug.mainFrame;
    String tabName = "";
    boolean recSave;
    boolean recDelete;
    Object[] dsDaten = null;
    Object[] dsData = null;
    Object[][] itemsVorlagenpfad = null;
    Object[][] itemsGruppe = null;
    public char optActionEvent;
    public double dblID = 0.0;
    public boolean locked;

    /**
     * Creates new form TBL0FIXEDCOUNTEREditJPanel
     */
    public NeueArtikelEditJPanel() 
    {
        super();
        initComponents();
    }

    @Override
    public String getName() 
    {
        tabName = jpArtikelEdit.getName();
        return tabName;
    }

    private void initTabAndFocus() 
    {
        InitialFocusSetter.setInitialFocus((JComponent) jtxt_Artikel);
    }

    public void panelLoad() 
    {
        switch (optActionEvent) 
        {
            case 'N':
                initFields();
                enableFields();
                setFieldsColorWhite();
                initTabAndFocus();
                break;
//            case 'U':
//                selectData();
//                initTabAndFocus();
//                break;
//            case 'D':
//                break;
            default:
                break;
        }
    }

    public void panelUnload() 
    {
//      IDs, Felder und Tabelle leeren:
        initFields();
//      Felder entsperren:
        enableFields();

        this.locked = false;
    }

    public boolean recordSave() 
    {
        recSave = false;

        if (fieldsCheck()) 
        {
            switch (optActionEvent) 
            {
                case 'N':
                    insertData();
                    break;
                case 'U':
                    updateData();
                    break;
                default:
                    break;
            }
            recSave = true;
        }

        return recSave;
    }

    public boolean recordDelete() 
    {
        String retString = "";

        recDelete = false;
        
        deleteData();
                   
        return recDelete;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        jpArtikelEdit = new javax.swing.JPanel();
        jLabel_Artikel = new javax.swing.JLabel();
        jtxt_Artikel = new javax.swing.JTextField();
        jLabel_Beschreibung = new javax.swing.JLabel();
        jtxt_Beschreibung = new javax.swing.JTextField();
        jLabel_WoKaufen = new javax.swing.JLabel();
        jtxt_WoKaufen = new javax.swing.JTextField();
        jLblBeenden = new javax.swing.JLabel();
        jLabel_Status = new javax.swing.JLabel();
        jtxt_Status = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(32767, 1024));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 700));
        setLayout(new java.awt.GridBagLayout());

        jpArtikelEdit.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5), javax.swing.BorderFactory.createEtchedBorder()));
        jpArtikelEdit.setMaximumSize(new java.awt.Dimension(32767, 1024));
        jpArtikelEdit.setMinimumSize(new java.awt.Dimension(800, 500));
        jpArtikelEdit.setName("jpArtikelEdit"); // NOI18N
        jpArtikelEdit.setPreferredSize(new java.awt.Dimension(800, 700));
        jpArtikelEdit.setLayout(new java.awt.GridBagLayout());

        jLabel_Artikel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Artikel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Artikel.setText("Artikel");
        jLabel_Artikel.setMinimumSize(new java.awt.Dimension(120, 25));
        jLabel_Artikel.setName("Jahr"); // NOI18N
        jLabel_Artikel.setPreferredSize(new java.awt.Dimension(120, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 0);
        jpArtikelEdit.add(jLabel_Artikel, gridBagConstraints);

        jtxt_Artikel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxt_Artikel.setMaximumSize(new java.awt.Dimension(2147483647, 25));
        jtxt_Artikel.setMinimumSize(new java.awt.Dimension(150, 25));
        jtxt_Artikel.setName("Jahr"); // NOI18N
        jtxt_Artikel.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        jpArtikelEdit.add(jtxt_Artikel, gridBagConstraints);

        jLabel_Beschreibung.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Beschreibung.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Beschreibung.setText("Beschreibung");
        jLabel_Beschreibung.setMinimumSize(new java.awt.Dimension(120, 25));
        jLabel_Beschreibung.setName("FcMaxid"); // NOI18N
        jLabel_Beschreibung.setPreferredSize(new java.awt.Dimension(120, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 0, 0);
        jpArtikelEdit.add(jLabel_Beschreibung, gridBagConstraints);

        jtxt_Beschreibung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxt_Beschreibung.setMaximumSize(new java.awt.Dimension(200, 25));
        jtxt_Beschreibung.setMinimumSize(new java.awt.Dimension(150, 25));
        jtxt_Beschreibung.setName("Bezeichnung"); // NOI18N
        jtxt_Beschreibung.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jpArtikelEdit.add(jtxt_Beschreibung, gridBagConstraints);

        jLabel_WoKaufen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_WoKaufen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_WoKaufen.setText("Wo kaufen");
        jLabel_WoKaufen.setMinimumSize(new java.awt.Dimension(120, 25));
        jLabel_WoKaufen.setPreferredSize(new java.awt.Dimension(120, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 0, 0);
        jpArtikelEdit.add(jLabel_WoKaufen, gridBagConstraints);

        jtxt_WoKaufen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxt_WoKaufen.setMaximumSize(new java.awt.Dimension(2147483647, 25));
        jtxt_WoKaufen.setMinimumSize(new java.awt.Dimension(150, 25));
        jtxt_WoKaufen.setName("Höchste ID"); // NOI18N
        jtxt_WoKaufen.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jpArtikelEdit.add(jtxt_WoKaufen, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        jpArtikelEdit.add(jLblBeenden, gridBagConstraints);

        jLabel_Status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Status.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Status.setText("Status");
        jLabel_Status.setMinimumSize(new java.awt.Dimension(120, 25));
        jLabel_Status.setPreferredSize(new java.awt.Dimension(120, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 0, 0);
        jpArtikelEdit.add(jLabel_Status, gridBagConstraints);

        jtxt_Status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxt_Status.setMaximumSize(new java.awt.Dimension(2147483647, 25));
        jtxt_Status.setMinimumSize(new java.awt.Dimension(150, 25));
        jtxt_Status.setName("Höchste ID"); // NOI18N
        jtxt_Status.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jpArtikelEdit.add(jtxt_Status, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jpArtikelEdit, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

//    private InputVerifier getjtxtJahrVerify() 
//    {
//        return new NotEmptyValidator(frame);
//    }
//
//    private InputVerifier getjtxtJahrLengthVerify() 
//    {
//        return new HasStringLengthValidator(frame, 3, 4, 0);
//    }
//
//    private InputVerifier getjtxtBezeichnungVerify() 
//    {
//        return new NotEmptyValidator(frame);
//    }
//
//    private InputVerifier getjtxtBezeichnungLengthVerify() 
//    {
//        return new HasStringLengthValidator(frame, 2, 50, 0);
//    }
//
//    private InputVerifier getjtxtFcMaxidVerify() 
//    {
//        return new NotEmptyValidator(frame);
//    }
//
//    private InputVerifier getjtxtFcMaxidLengthVerify() 
//    {
//        return new HasStringLengthValidator(frame, 3, 4, 0);
//    }

    private void initFields() 
    {
        jtxt_Artikel.setText("");
        jtxt_Beschreibung.setText("");
        jtxt_WoKaufen.setText("");
        jtxt_Status.setText("");
    }

    private void selectData() 
    {
//        fixedcounter = new FIXEDCOUNTER();

//      Aktueller Beumsetzung sperrt Datensatz zur Bearbeitung:        

//      Datensatz wird zur Ausgabe und Bearbeitung gelesen:
        getDS(dblID);

//      Felder in Maske versorgen:  
        setFields(dsDaten);

//      Felder in Maske immer weiß setzen:
        setFieldsColorWhite();
    }

    private Object[] getDS(Object dblID) 
    {
        try 
        {
//            dsDaten = fixedcounter.readIDFromDB(LogNIM.con, "TBL0FIXEDCOUNTER", dblID);

        } 
        catch (Exception e) 
        {
            LOGGER.log(Level.SEVERE, "Exception", e);
        }

        return dsDaten;
    }

    private void setFields(Object[] _dsDaten) 
    {
        jtxt_Artikel.setText((String) _dsDaten[5]);
        jtxt_Beschreibung.setText((String) _dsDaten[4]);
        jtxt_WoKaufen.setText(_dsDaten[6].toString());
    }

    private void enableFields() 
    {
        jtxt_Status.setEditable(true);
        jtxt_Status.setFocusable(true);

        jtxt_Artikel.setEditable(true);
        jtxt_Artikel.setFocusable(true);

        jtxt_Beschreibung.setEditable(true);
        jtxt_Beschreibung.setFocusable(true);

        jtxt_WoKaufen.setEditable(true);
        jtxt_WoKaufen.setFocusable(true);
    }

    private void disableFields() 
    {
        jtxt_Artikel.setEditable(false);
        jtxt_Beschreibung.setEditable(false);
        jtxt_WoKaufen.setEditable(false);
         jtxt_Status.setEditable(false);

        jtxt_Artikel.setFocusable(false);
        jtxt_Beschreibung.setFocusable(false);
        jtxt_WoKaufen.setFocusable(false);
        jtxt_Status.setFocusable(false);  
    }

    private void setFieldsColorWhite() 
    {
        jtxt_Artikel.setBackground(new Color(255, 255, 255));
        jtxt_Beschreibung.setBackground(new Color(255, 255, 255));
        jtxt_WoKaufen.setBackground(new Color(255, 255, 255));
        jtxt_Status.setBackground(new Color(255, 255, 255));
    }

    private boolean fieldsCheck() 
    {
//        if (getjtxtJahrVerify().shouldYieldFocus((JComponent) jtxt_Artikel) == true)
//            ; 
//        else 
//        {
//            jtxt_Artikel.grabFocus();
//            return false;
//        }
//        
//        if (getjtxtJahrLengthVerify().shouldYieldFocus((JComponent) jtxt_Artikel) == true)
//            ; 
//        else 
//        {
//            jtxt_Artikel.grabFocus();
//            return false;
//        }
//
//        if (getjtxtBezeichnungVerify().shouldYieldFocus((JComponent) jtxt_Beschreibung) == true)
//            ; 
//        else 
//        {
//            jtxt_Beschreibung.grabFocus();
//            return false;
//        }
//        
//        if (getjtxtBezeichnungLengthVerify().shouldYieldFocus((JComponent) jtxt_Beschreibung) == true)
//            ; 
//        else 
//        {
//            jtxt_Beschreibung.grabFocus();
//            return false;
//        }
//
//        if (getjtxtFcMaxidVerify().shouldYieldFocus((JComponent) jtxt_WoKaufen) == true)
//            ; 
//        else 
//        {
//            jtxt_WoKaufen.grabFocus();
//            return false;
//        }
//        
//        if (getjtxtFcMaxidLengthVerify().shouldYieldFocus((JComponent) jtxt_WoKaufen) == true)
//            ;
//        else 
//        {
//            jtxt_WoKaufen.grabFocus();
//            return false;
//        }

        return true;
    }

    private void insertData() 
    {
        try 
        {
//            FIXEDCOUNTER insFcCounter = new FIXEDCOUNTER();
//
//            insFcCounter.setFcJahr(jtxt_Artikel.getText());
//            insFcCounter.setFcBezeichnung(jtxt_Beschreibung.getText());
//            insFcCounter.setFcMaxId(Integer.parseInt(jtxt_WoKaufen.getText()));
//
//            insFcCounter.writeIntoDB(LogNIM.con, "TBL0FIXEDCOUNTER");
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
    }

    private void updateData() 
    {
        try 
        {
//            fixedcounter.setFcID((Double) dsDaten[0]);
//            fixedcounter.setFcJahr(jtxt_Artikel.getText());
//            fixedcounter.setFcBezeichnung(jtxt_Beschreibung.getText());
//            fixedcounter.setFcMaxId(Integer.parseInt(jtxt_WoKaufen.getText()));
//
//            fixedcounter.writeIntoDB(LogNIM.con,
//                    "TBL0FIXEDCOUNTER");
        } 
        catch (Exception e) 
        {
            LOGGER.log(Level.SEVERE, "Exception", e);
        }
    }

    private void deleteData() 
    {
        try 
        {
//            FIXEDCOUNTER delFcCounter = new FIXEDCOUNTER();
//
//            delFcCounter.setFcID((Double) dsDaten[0]);

//          Datensatz wird komplett gelöscht:
//            delFcCounter.deleteFromDB(LogNIM.con, "TBL0FIXEDCOUNTER");
        } 
        catch (Exception e) 
        {
            LOGGER.log(Level.SEVERE, "Exception", e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_Artikel;
    private javax.swing.JLabel jLabel_Beschreibung;
    private javax.swing.JLabel jLabel_Status;
    private javax.swing.JLabel jLabel_WoKaufen;
    private javax.swing.JLabel jLblBeenden;
    private javax.swing.JPanel jpArtikelEdit;
    private javax.swing.JTextField jtxt_Artikel;
    private javax.swing.JTextField jtxt_Beschreibung;
    private javax.swing.JTextField jtxt_Status;
    private javax.swing.JTextField jtxt_WoKaufen;
    // End of variables declaration//GEN-END:variables
}
