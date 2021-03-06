/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ir.maktab.view;

import ir.maktab.model.dao.Teacher;
import ir.maktab.model.dao.TeacherDAO;
import ir.maktab.model.dao.TeacherDaoImpl;
import ir.maktab.model.dbconnector.DbConnector;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MfDevNet
 */
public class Teacherfrm extends javax.swing.JFrame {
    TeacherDAO th;
    List<JTextField> listTextf = new ArrayList<>();

    /**
     * Creates new form Teacher
     */
    public Teacherfrm() {
        th = new TeacherDaoImpl();
        initComponents();
        listTextf.add(thcode);
        listTextf.add(thfname);
        listTextf.add(thlname);
        listTextf.add(thbirhday);
        listTextf.add(thsalary);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        thtable = new javax.swing.JTable();
        thcode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        thfname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        thlname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        thsalary = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btnfind = new javax.swing.JButton();
        btnshowall = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();
        thbirhday = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        maxminsalary = new javax.swing.JButton();
        olderyounger = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teacher");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        thtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Code", "FirstName", "LastName", "Salary", "Birthday"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        thtable.getTableHeader().setReorderingAllowed(false);
        thtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(thtable);

        thcode.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                thcodeCaretUpdate(evt);
            }
        });

        jLabel1.setText("Teacher Code");

        thfname.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                thfnameCaretUpdate(evt);
            }
        });

        jLabel2.setText("First Name");

        thlname.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                thlnameCaretUpdate(evt);
            }
        });

        jLabel3.setText("Last Name");

        jLabel4.setText("Salary");

        jLabel5.setText("BirthDay");

        btnsave.setText("save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnfind.setText("find");
        btnfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindActionPerformed(evt);
            }
        });

        btnshowall.setText("show all");
        btnshowall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowallActionPerformed(evt);
            }
        });

        btndelete.setText("delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnupdate.setText("update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnnew.setText("add");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        btnclear.setText("Clear Fileds");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        maxminsalary.setText("max min salary");
        maxminsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxminsalaryActionPerformed(evt);
            }
        });

        olderyounger.setText("young old birthday");
        olderyounger.setActionCommand("");
        olderyounger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olderyoungerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(thcode, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(thfname, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnsave)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnupdate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnnew)
                                        .addGap(18, 18, 18)
                                        .addComponent(btndelete))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnfind)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnshowall))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(thbirhday, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(thlname, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(thsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnclear)
                                    .addComponent(maxminsalary))))
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(olderyounger)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thcode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btndelete)
                        .addComponent(btnnew))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thfname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnsave)
                        .addComponent(btnupdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thlname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnshowall)
                        .addComponent(btnfind)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(thbirhday, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(maxminsalary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(olderyounger)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lockText(listTextf);
        listFill(th.findAll("", ""));
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void thtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thtableMouseClicked

        thcode.setText((String) thtable.getValueAt(thtable.getSelectedRow(), 0));
        thfname.setText((String) thtable.getValueAt(thtable.getSelectedRow(), 1));
        thlname.setText((String) thtable.getValueAt(thtable.getSelectedRow(), 2));
        thsalary.setText(String.valueOf(thtable.getValueAt(thtable.getSelectedRow(), 3)));
        thbirhday.setText(String.valueOf(thtable.getValueAt(thtable.getSelectedRow(), 4)));
        // TODO add your handling code here:
    }//GEN-LAST:event_thtableMouseClicked

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        unlockText(listTextf);
        for (JTextField txt : listTextf) {
            txt.setText("");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

        th.insert(getTeacher());
        listFill(th.findAll("", ""));
        lockText(listTextf);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        th.delete(thcode.getText());
        listFill(th.findAll("", ""));
        // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        if (btnupdate.getText().equals("save!")) {
            btnupdate.setText("update");
            lockText(listTextf);
            th.update(thcode.getText(), getTeacher());
            listFill(th.findAll("", ""));
        } else {

            unlockText(listTextf);
            btnupdate.setText("save!");
        }


    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnshowallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowallActionPerformed

        listFill(th.findAll("", ""));

// TODO add your handling code here:
    }//GEN-LAST:event_btnshowallActionPerformed

    private void thcodeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_thcodeCaretUpdate

//        updateList();


// TODO add your handling code here:
    }//GEN-LAST:event_thcodeCaretUpdate

    private void thfnameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_thfnameCaretUpdate
//        updateList();
        // TODO add your handling code here:
    }//GEN-LAST:event_thfnameCaretUpdate

    private void thlnameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_thlnameCaretUpdate
//        updateList();

// TODO add your handling code here:
    }//GEN-LAST:event_thlnameCaretUpdate

    private void btnfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindActionPerformed
        unlockText(listTextf);
        updateList();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnfindActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        listFill(th.findAll("",""));
        listTextf.forEach(jTextField -> {jTextField.setText("");});

// TODO add your handling code here:
    }//GEN-LAST:event_btnclearActionPerformed

    private void maxminsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxminsalaryActionPerformed
        listFill(th.maxminsalary());
    }//GEN-LAST:event_maxminsalaryActionPerformed

    private void olderyoungerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olderyoungerActionPerformed
            listFill(th.youngoldbirthday());
                

    }//GEN-LAST:event_olderyoungerActionPerformed

void salaryMaxMin(){
    Session session=DbConnector.getSession();
//        DetachedCriteria versions = DetachedCriteria.forClass(Teacher.class, "f")
//            .setProjection( Property.forName("f.salary").max())
//            .add(Property.forName("f.name").eqProperty("fl.name"));
//
//    List<Teacher> t=session.createCriteria(Teacher.class, "fl")
//            .add( Property.forName("fl.salary").eq(salay) )
//            .list();

//    Criteria criteria = session
//            .createCriteria(Teacher.class)
//            .setProjection(Projections.max("salary"));
//    Integer maxAge = (Integer)criteria.uniqueResult();

}

    void updateList() {
//        System.out.println(th.listTh(getTeacher()));
//        listFill(th.listTh(getTeacher()));
        //        listFill(th.findAll(thfname.getText(),thlname.getText()));
        Session session = DbConnector.getSession();
        List<Teacher> teacherList = new ArrayList<>();


        teacherList = session.createQuery("from Teacher th where th.teacherCode like '" + thcode.getText() + "%' and firstName like '" + thfname.getText() + "%' and lastName like '" + thlname.getText() + "%' and str(salary) like '" + thsalary.getText() + "%' and str(birthDay) like '" + thbirhday.getText() + "%'").list();
        listFill(teacherList);
    }

    Teacher getTeacher() {
        return new Teacher(thfname.getText(), thlname.getText(), thcode.getText(), Double.parseDouble(thsalary.getText()), thbirhday.getText());
    }

    void lockText(List<JTextField> list) {

        for (JTextField s : list) {
            s.setEnabled(false);
        }
    }

    void unlockText(List<JTextField> list) {

        for (JTextField s : list) {
            s.setEnabled(true);
        }
    }

    void listFill(List<Teacher> teacherlist) {

        Object[][] obj = new Object[teacherlist.size()][5];
        for (int i = 0; i < teacherlist.size(); i++) {
            obj[i][0] = teacherlist.get(i).getTeacherCode();
            obj[i][1] = teacherlist.get(i).getFirstName();
            obj[i][2] = teacherlist.get(i).getLastName();
            obj[i][3] = teacherlist.get(i).getSalary();
            obj[i][4] = teacherlist.get(i).getBirthDay();
        }

        DefaultTableModel dm = new DefaultTableModel(obj, new String[]{"Code", "FirstName", "LastName", "Salary", "Birthday"});
        thtable.setModel(dm);
        dm.addTableModelListener(thtable);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnfind;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnshowall;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton maxminsalary;
    private javax.swing.JButton olderyounger;
    private javax.swing.JTextField thbirhday;
    private javax.swing.JTextField thcode;
    private javax.swing.JTextField thfname;
    private javax.swing.JTextField thlname;
    private javax.swing.JTextField thsalary;
    private javax.swing.JTable thtable;
    // End of variables declaration//GEN-END:variables

}
