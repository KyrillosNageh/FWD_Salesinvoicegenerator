package com.view;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.controller.Controller;
import com.model.InvoiceHeader;
import com.model.InvoiceHeaderTableModel;
import com.model.InvoiceLinesTableModel;



@SuppressWarnings("serial")
public class Frame extends JFrame {
	
    // Variables declaration - do not modify                     
    private JButton jButton_cancel;
    private JButton jButton_createInvoice;
    private JButton jButton_deleteInvoice;
    private JButton jButton_save;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel_invoiceNo;
    private JLabel jLabel_invoiceTotal;
    private JMenu jMenu2;
    private JMenuBar jMenuBar2;
    private JMenuItem jMenuItem_exit;
    private JMenuItem jMenuItem_load;
    private JMenuItem jMenuItem_save;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTable jTable_invoiceHeader;
    private JTable jTable_invoiceLine;
    private JTextField jTextField_customerName;
    private JTextField jTextField_invoiceDate;
    
    //////////////////////////////////////////////
    private Controller handler;
    private ArrayList<InvoiceHeader> InvoiceHeaderList;
	private InvoiceHeaderTableModel headerTableModel;
	private InvoiceLinesTableModel lineTableModel;
    private HeaderDialog headerDialog ;
    private LinesDialog lineDialog;
    
    // End of variables declaration     

    /**
     * Creates new form NewJFrame
     */
    public Frame() {
    	handler = new Controller(this);
        initComponents();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void initComponents() {
    	this.setTitle("Sales Invoice Generator");
    	this.setResizable(false);
    	//////////////
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_invoiceLine = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_invoiceNo = new javax.swing.JLabel();
        jTextField_invoiceDate = new javax.swing.JTextField();
        jTextField_customerName = new javax.swing.JTextField();
        jLabel_invoiceTotal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        
        jTable_invoiceHeader = new javax.swing.JTable();
        jTable_invoiceHeader.getSelectionModel().addListSelectionListener(handler);
        
        jButton_save = new javax.swing.JButton();
        jButton_save.addActionListener( handler);
        
        jButton_cancel = new javax.swing.JButton();
        jButton_cancel.addActionListener( handler);
        
        jButton_createInvoice = new javax.swing.JButton();
        jButton_createInvoice.addActionListener( handler);
        
        jButton_deleteInvoice = new javax.swing.JButton();
        jButton_deleteInvoice.addActionListener( handler);
        
        jMenuItem_load = new javax.swing.JMenuItem();
        jMenuItem_load.addActionListener( handler);
        
        jMenuItem_save = new javax.swing.JMenuItem();
        jMenuItem_save.addActionListener( handler);
        
        jMenuItem_exit = new javax.swing.JMenuItem();
        jMenuItem_exit.addActionListener( handler);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        /////////////////////////////////////////////////////////////////////////////////////////////////////
        
        jTable_invoiceLine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {"Item Name","Item Price","count","Item Total"}
        ));
        jScrollPane1.setViewportView(jTable_invoiceLine);

        jLabel2.setText("Invoice Number");

        jLabel3.setText("Invoice Date");

        jLabel4.setText("Customer Name");

        jLabel5.setText("Invoice Total");

        jLabel_invoiceNo.setText("23");

        jTextField_invoiceDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_invoiceDateActionPerformed(evt);
            }
        });

        jTextField_customerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_customerNameActionPerformed(evt);
            }
        });

        jLabel_invoiceTotal.setText("350.50");

        jButton_save.setText("Save");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });

        jButton_cancel.setText("Cancel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_invoiceNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_invoiceDate)
                            .addComponent(jTextField_customerName, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jLabel_invoiceTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(jButton_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_invoiceNo, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_invoiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_customerName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel_invoiceTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        jTable_invoiceHeader.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] 
            		{"No.","Date","Customer","Total"}
            
        ));
        jScrollPane2.setViewportView(jTable_invoiceHeader);

        jButton_createInvoice.setText("Create New Invoice");
        jButton_createInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_createInvoiceActionPerformed(evt);
            }
        });

        jButton_deleteInvoice.setText("Delete Invoice");

        jLabel1.setText("Invoices Table");

        jMenu2.setText("File");

        jMenuItem_load.setText("Load File");
        jMenuItem_load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_loadActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_load);

        jMenuItem_save.setText("Save File");
        jMenu2.add(jMenuItem_save);

        jMenuItem_exit.setText("Exit");
        jMenuItem_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_exitActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_exit);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton_createInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_deleteInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(337, 337, 337)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_createInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_deleteInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addGap(22, 22, 22))))
        );

        pack();
        }// </editor-fold>                        

        private void jMenuItem_loadActionPerformed(ActionEvent evt) {                                               
            // TODO add your handling code here:
        }                                              

        private void jMenuItem_exitActionPerformed(ActionEvent evt) {                                               
            // TODO add your handling code here:
        }                                              

        private void jButton_createInvoiceActionPerformed(ActionEvent evt) {                                                      
            // TODO add your handling code here:
        }                                                     

        private void jTextField_invoiceDateActionPerformed(ActionEvent evt) {                                                       
            // TODO add your handling code here:
        }                                                      

        private void jButton_saveActionPerformed(ActionEvent evt) {                                             
            // TODO add your handling code here:
        }                                            

        private void jTextField_customerNameActionPerformed(ActionEvent evt) {                                                        
            // TODO add your handling code here:
        }           

        
        /*>>	 Generated Getter and Setter methods 	<<*/
        public JTable getjTable_invoiceHeader() {
    		return jTable_invoiceHeader;
    	}
        
        public JTable getjTable_InvoiceTable() {
            return jTable_invoiceHeader;
        }

    	public void setjTable_invoiceHeader(JTable jTable_invoiceHeader) {
    		this.jTable_invoiceHeader = jTable_invoiceHeader;
    	}

    	public JTable getjTable_invoiceLine() {
    		return jTable_invoiceLine;
    	}

    	public void setjTable_invoiceLine(JTable jTable_invoiceLine) {
    		this.jTable_invoiceLine = jTable_invoiceLine;
    	}
    	
        public JTextField getjLabel_CustomerName() {
            return jTextField_customerName;
        }
        
        public JTextField getjTextField_InvoiceDate() {
            return jTextField_invoiceDate;
        }

        public JLabel getjLabel_InvoiceNumberDisplay() {
            return jLabel_invoiceNo;
        }
        
        public JLabel getjLabel_InvoiceTotalDisplay() {
            return jLabel_invoiceTotal;
        }
    	
        public void showHeaderDialog(HeaderDialog headerDialog) {
        	this.headerDialog = headerDialog;
        }

        public HeaderDialog getHeaderDialog() {
        	return headerDialog;
        }
        
        public void setLineDialog(LinesDialog lineDialog) {
            this.lineDialog = lineDialog;
        }
        
        public LinesDialog getLineDialog() {
            return lineDialog;
        }

        public Controller getHandler() {
    		return handler;
    	}
        
    	public ArrayList<InvoiceHeader> getInvoiceHeaderList() {
    		return InvoiceHeaderList;
    	}

    	public void setInvoiceHeaderList(ArrayList<InvoiceHeader> invoiceHeaderList) {
    		InvoiceHeaderList = invoiceHeaderList;
    		headerTableModel = new InvoiceHeaderTableModel(InvoiceHeaderList);
    		this.jTable_invoiceHeader.setModel(headerTableModel);
    	}
    	
        public InvoiceHeaderTableModel getHeaderTableModel() {
			return headerTableModel;
		}

		public void setHeaderTableModel(InvoiceHeaderTableModel headerTableModel) {
			this.headerTableModel = headerTableModel;
		}

		public InvoiceLinesTableModel getLineTableModel() {
			return lineTableModel;
		}

		public void setLineTableModel(InvoiceLinesTableModel lineTableModel) {
			this.lineTableModel = lineTableModel;
		}
		
		public ArrayList<InvoiceHeader> getHeadersList() {
	        try {
	            if (InvoiceHeaderList == null) {
	                throw new Exception();
	            }
	        } catch (Exception exp) {
	            JOptionPane.showMessageDialog(this, "No headers to select. Please load a file first", "No data", JOptionPane.CLOSED_OPTION);

	        }
	        return InvoiceHeaderList;
	    }


            
}
