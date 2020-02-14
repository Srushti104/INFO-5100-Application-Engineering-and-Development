/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import User.Information;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author srush
 */
public class ViewMainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewMainJPanel
     */
     private Information information;
     private Icon icon;
    
    public ViewMainJPanel(Information information)  {
        initComponents();
        displayInformation(information);
    }
    
    private void displayInformation(Information information)  {

        //Demographics Info
        String informationfName = information.getfName();
        fNameJText.setText(informationfName);

        String informationLastName = information.getLastName();
        lastNameJText.setText(informationLastName);

        String informationphoneNum = information.getPhoneNum();
        phoneNumJText.setText(informationphoneNum);

        String informationdob = information.getDob();
        dobJText.setText(informationdob);

        String informationfage = information.getAge();
        ageJText.setText(informationfage);

        String informationHeight = information.getHeight();
        heightJText.setText(informationHeight);

        String informationfWeight = information.getWeight();
        weightJText.setText(informationfWeight);

        String informationSsn = information.getSsn();
        ssnJText.setText(informationSsn);

        // Address information
        String informationAdd1 = information.getAdd1();
        add1JText.setText(informationAdd1);

        String informationAdd2 = information.getAdd2();
        add2JText.setText(informationAdd2);

        String informationCity = information.getCity();
        cityJText.setText(informationCity);

        String informationState = information.getState();
        stateJText.setText(informationState);

        String informationZipCode = information.getZipCode();
        zipCodeJText.setText(informationZipCode);

        // Savings Information
        String informationSavingsBankName = information.getSavingsBankName();
        savingsBankNameJText.setText(informationSavingsBankName);

        String informationSavingsAccNum = information.getSavingsAccNum();
        savingsAccNumJText.setText(informationSavingsAccNum);

        String informationSavingsRNum = information.getSavingsRNum();
        savingsRNumJText.setText(informationSavingsRNum);

        String informationSavingsAccBaln = information.getSavingsAccBaln();
        savingsAccBalnJText.setText(informationSavingsAccBaln);
 
        String informationAccType = information.getSavingsAccType();
        savingsAccTypeJText.setText(informationAccType);
        
         // Checkings Information
        String informationCheckingsBankName = information.getCheckingsBankName();
        checkingsBankNameJText.setText(informationCheckingsBankName);

        String informationCheckingsAccNum = information.getCheckingsAccNum();
        checkingsAccNumJText.setText(informationCheckingsAccNum);

        String informationCheckingsRNum = information.getCheckingsRNum();
        checkingsRNumJText.setText(informationCheckingsRNum);

        String informationCheckingsAccBaln = information.getCheckingsAccBaln();
        checkingsAccBalnJText.setText(informationCheckingsAccBaln);

        String informationCheckingsAccType = information.getCheckingsAccType();
        checkingsAccTypeJText.setText(informationCheckingsAccType);

        
        // License Information
        String informationLicenseNum = information.getLicenseNum();
        licenseNumJText.setText(informationLicenseNum);

        String informationDateIssue = information.getDateIssue();
        dateIssueJText.setText(informationDateIssue);

        String informationDateExpiry = information.getDateExpiry();
        dateExpiryJText.setText(informationDateExpiry);

        String informationBloodType = information.getBloodType();
        bloodTypeJText.setText(informationBloodType);
        
        String informationPictureJText = information.getPicture();
        pictureJText.setText(informationPictureJText);
        
         try {
             //Image population
           ImageHolder.setIcon(new ImageIcon(ImageIO.read(new File(information.getPicture()))));
         } catch (IOException ex) {
             Logger.getLogger(ViewMainJPanel.class.getName()).log(Level.SEVERE, null, ex);
         }
	     
        // Medical information
        String informationfMedicalRecordNum = information.getMedicalRecordNum();
        medicalRecordNumJText.setText(informationfMedicalRecordNum);

        String informationAlergy1 = information.getAlergy1();
        alergy1JText.setText(informationAlergy1);

        String informationAlergy2 = information.getAlergy2();
        alergy2JText.setText(informationAlergy2);

        String informationAlergy3 = information.getAlergy3();
        alergy3JText.setText(informationAlergy3);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        medicalRecordNumJLabel = new javax.swing.JLabel();
        medicalRecordNumJText = new javax.swing.JTextField();
        alergy1JLabel = new javax.swing.JLabel();
        cityJText = new javax.swing.JTextField();
        alergy1JText = new javax.swing.JTextField();
        stateJLabel = new javax.swing.JLabel();
        stateJText = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        zipCodeJLabel = new javax.swing.JLabel();
        alergy2JLabel = new javax.swing.JLabel();
        zipCodeJText = new javax.swing.JTextField();
        alergy3JLabel = new javax.swing.JLabel();
        savingsRNumJText = new javax.swing.JTextField();
        demographicJLabel = new javax.swing.JLabel();
        savingsAccNumJLabel = new javax.swing.JLabel();
        savingsAccNumJText = new javax.swing.JTextField();
        savingsAccTypeJLabel = new javax.swing.JLabel();
        savingsAccTypeJText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addressDetailsJLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        savingsAccountDetailsJLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lincenseDetailsJLabel = new javax.swing.JLabel();
        savingsBankNameJLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        medicalDetailsJLabel = new javax.swing.JLabel();
        savingsBankNameJText = new javax.swing.JTextField();
        fNameJLabel = new javax.swing.JLabel();
        savingsAccBalnJLabel = new javax.swing.JLabel();
        savingsAccBalnJText = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        savingsRNumJLabel = new javax.swing.JLabel();
        lastNameJLabel = new javax.swing.JLabel();
        phoneNumJLabel = new javax.swing.JLabel();
        dobJLabel = new javax.swing.JLabel();
        ageJLabel = new javax.swing.JLabel();
        weightJLabel = new javax.swing.JLabel();
        heightJLabel = new javax.swing.JLabel();
        ssnJLabel = new javax.swing.JLabel();
        fNameJText = new javax.swing.JTextField();
        lastNameJText = new javax.swing.JTextField();
        phoneNumJText = new javax.swing.JTextField();
        dateIssueJText = new javax.swing.JTextField();
        dateExpiryJLabel = new javax.swing.JLabel();
        dateExpiryJText = new javax.swing.JTextField();
        bloodTypeJLabel = new javax.swing.JLabel();
        bloodTypeJText = new javax.swing.JTextField();
        licenseNumJLabel = new javax.swing.JLabel();
        licenseNumJText = new javax.swing.JTextField();
        pictureJText = new javax.swing.JTextField();
        dobJText = new javax.swing.JTextField();
        dateIssueJLabel = new javax.swing.JLabel();
        ageJText = new javax.swing.JTextField();
        heightJText = new javax.swing.JTextField();
        alergy2JText = new javax.swing.JTextField();
        weightJText = new javax.swing.JTextField();
        ssnJText = new javax.swing.JTextField();
        alergy3JText = new javax.swing.JTextField();
        add1JLabel = new javax.swing.JLabel();
        add1JText = new javax.swing.JTextField();
        add2JLabel = new javax.swing.JLabel();
        add2JText = new javax.swing.JTextField();
        cityJLabel = new javax.swing.JLabel();
        checkingsAccBalnJLabel1 = new javax.swing.JLabel();
        ImageHolder = new javax.swing.JLabel();
        checkingsBankNameJLabel = new javax.swing.JLabel();
        checkingsBankNameJText = new javax.swing.JTextField();
        checkingsAccBalnJLabel = new javax.swing.JLabel();
        checkingsAccBalnJText = new javax.swing.JTextField();
        checkingsRNumJLabel = new javax.swing.JLabel();
        checkingsRNumJText = new javax.swing.JTextField();
        checkingsAccNumJLabel = new javax.swing.JLabel();
        checkingsAccNumJText = new javax.swing.JTextField();
        checkingsAccTypeJLabel = new javax.swing.JLabel();
        checkingsAccTypeJText = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(900, 750));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 800));

        medicalRecordNumJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        medicalRecordNumJLabel.setText("Medical Recored #:");

        medicalRecordNumJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        medicalRecordNumJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        alergy1JLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        alergy1JLabel.setText("Alergy 1:");

        cityJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cityJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        cityJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityJTextActionPerformed(evt);
            }
        });

        alergy1JText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        alergy1JText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        alergy1JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergy1JTextActionPerformed(evt);
            }
        });

        stateJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        stateJLabel.setText("State");

        stateJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        stateJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        stateJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateJTextActionPerformed(evt);
            }
        });

        zipCodeJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        zipCodeJLabel.setText("Zip Code");

        alergy2JLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        alergy2JLabel.setText("Alergy 2:");

        zipCodeJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        zipCodeJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        zipCodeJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipCodeJTextActionPerformed(evt);
            }
        });

        alergy3JLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        alergy3JLabel.setText("Alergy 3:");

        savingsRNumJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        savingsRNumJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        savingsRNumJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savingsRNumJTextActionPerformed(evt);
            }
        });

        demographicJLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        demographicJLabel.setText("Demographic:");

        savingsAccNumJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        savingsAccNumJLabel.setText("Account #:");

        savingsAccNumJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        savingsAccNumJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        savingsAccNumJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savingsAccNumJTextActionPerformed(evt);
            }
        });

        savingsAccTypeJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        savingsAccTypeJLabel.setText("Account Type:");

        savingsAccTypeJText.setEditable(false);
        savingsAccTypeJText.setBackground(new java.awt.Color(255, 255, 255));
        savingsAccTypeJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        savingsAccTypeJText.setBorder(null);
        savingsAccTypeJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savingsAccTypeJTextActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View User Personal Information Report");

        addressDetailsJLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        addressDetailsJLabel.setText("Address Details:");

        savingsAccountDetailsJLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        savingsAccountDetailsJLabel.setText("Account Details:");

        lincenseDetailsJLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lincenseDetailsJLabel.setText("License Details:");

        savingsBankNameJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        savingsBankNameJLabel.setText("Bank Name");

        medicalDetailsJLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        medicalDetailsJLabel.setText("Medical Records Details:");

        savingsBankNameJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        savingsBankNameJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        fNameJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        fNameJLabel.setText("First Name:");

        savingsAccBalnJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        savingsAccBalnJLabel.setText("Account Balance");

        savingsAccBalnJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        savingsAccBalnJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        savingsAccBalnJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savingsAccBalnJTextActionPerformed(evt);
            }
        });

        savingsRNumJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        savingsRNumJLabel.setText("Routing #:");

        lastNameJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lastNameJLabel.setText("Last Name:");

        phoneNumJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        phoneNumJLabel.setText("Phone #:");

        dobJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        dobJLabel.setText("DOB:");

        ageJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ageJLabel.setText("Age:");

        weightJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        weightJLabel.setText("Weight:");

        heightJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        heightJLabel.setText("Height:");

        ssnJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ssnJLabel.setText("SSN #:");

        fNameJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        fNameJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lastNameJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lastNameJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        lastNameJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameJTextActionPerformed(evt);
            }
        });

        phoneNumJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        phoneNumJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        phoneNumJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumJTextActionPerformed(evt);
            }
        });

        dateIssueJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        dateIssueJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        dateIssueJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateIssueJTextActionPerformed(evt);
            }
        });

        dateExpiryJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        dateExpiryJLabel.setText("Expiry :");

        dateExpiryJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        dateExpiryJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        dateExpiryJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateExpiryJTextActionPerformed(evt);
            }
        });

        bloodTypeJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        bloodTypeJLabel.setText("Blood Type:");

        bloodTypeJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        bloodTypeJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        bloodTypeJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodTypeJTextActionPerformed(evt);
            }
        });

        licenseNumJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        licenseNumJLabel.setText("License #:");

        licenseNumJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        licenseNumJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        pictureJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        pictureJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        pictureJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pictureJTextActionPerformed(evt);
            }
        });

        dobJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        dobJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        dobJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobJTextActionPerformed(evt);
            }
        });

        dateIssueJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        dateIssueJLabel.setText("Issued on:");

        ageJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ageJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        ageJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageJTextActionPerformed(evt);
            }
        });

        heightJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        heightJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        heightJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightJTextActionPerformed(evt);
            }
        });

        alergy2JText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        alergy2JText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        alergy2JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergy2JTextActionPerformed(evt);
            }
        });

        weightJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        weightJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        weightJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightJTextActionPerformed(evt);
            }
        });

        ssnJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ssnJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        ssnJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssnJTextActionPerformed(evt);
            }
        });

        alergy3JText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        alergy3JText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        alergy3JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergy3JTextActionPerformed(evt);
            }
        });

        add1JLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        add1JLabel.setText("Street Address:");

        add1JText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        add1JText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        add2JLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        add2JLabel.setText("Apartment:");

        add2JText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        add2JText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        add2JText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2JTextActionPerformed(evt);
            }
        });

        cityJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cityJLabel.setText("City:");

        checkingsAccBalnJLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        checkingsAccBalnJLabel1.setText("Picture Source:");

        ImageHolder.setBackground(new java.awt.Color(255, 255, 255));
        ImageHolder.setText("   Please Upload your picture.");
        ImageHolder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ImageHolder.setMaximumSize(new java.awt.Dimension(200, 200));
        ImageHolder.setMinimumSize(new java.awt.Dimension(200, 200));
        ImageHolder.setOpaque(true);
        ImageHolder.setPreferredSize(new java.awt.Dimension(200, 200));

        checkingsBankNameJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        checkingsBankNameJLabel.setText("Bank Name");

        checkingsBankNameJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        checkingsBankNameJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        checkingsAccBalnJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        checkingsAccBalnJLabel.setText("Account Balance");

        checkingsAccBalnJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        checkingsAccBalnJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        checkingsAccBalnJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkingsAccBalnJTextActionPerformed(evt);
            }
        });

        checkingsRNumJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        checkingsRNumJLabel.setText("Routing #:");

        checkingsRNumJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        checkingsRNumJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        checkingsRNumJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkingsRNumJTextActionPerformed(evt);
            }
        });

        checkingsAccNumJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        checkingsAccNumJLabel.setText("Account #:");

        checkingsAccNumJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        checkingsAccNumJText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        checkingsAccNumJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkingsAccNumJTextActionPerformed(evt);
            }
        });

        checkingsAccTypeJLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        checkingsAccTypeJLabel.setText("Account Type:");

        checkingsAccTypeJText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        checkingsAccTypeJText.setBorder(null);
        checkingsAccTypeJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkingsAccTypeJTextActionPerformed(evt);
            }
        });

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(checkingsAccBalnJLabel1)
                                        .addGap(36, 36, 36)
                                        .addComponent(pictureJText, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lincenseDetailsJLabel)))
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(ImageHolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(checkingsRNumJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkingsRNumJText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(checkingsAccNumJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(checkingsAccNumJText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(checkingsAccTypeJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkingsAccTypeJText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(checkingsBankNameJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkingsBankNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(checkingsAccBalnJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkingsAccBalnJText, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(dobJLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dobJText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(fNameJLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(296, 296, 296)
                                                .addComponent(lastNameJLabel))
                                            .addComponent(demographicJLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lastNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(phoneNumJLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(phoneNumJText, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(155, 155, 155)
                                        .addComponent(ageJLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ageJText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(heightJLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(heightJText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(weightJLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(weightJText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ssnJLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ssnJText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(add1JLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(add1JText, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(add2JLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(add2JText, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(savingsAccountDetailsJLabel)
                                .addComponent(addressDetailsJLabel)
                                .addComponent(medicalDetailsJLabel)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(cityJLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cityJText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(87, 87, 87)
                                    .addComponent(stateJLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(stateJText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(zipCodeJLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(zipCodeJText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(licenseNumJLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(licenseNumJText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(dateExpiryJLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(dateExpiryJText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(55, 55, 55)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bloodTypeJLabel)
                                        .addComponent(dateIssueJLabel))
                                    .addGap(26, 26, 26)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dateIssueJText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bloodTypeJText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(alergy3JText, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(alergy1JLabel)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(alergy1JText, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(alergy2JLabel)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(alergy2JText, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(alergy3JLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(medicalRecordNumJLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(medicalRecordNumJText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(savingsBankNameJLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(savingsBankNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(savingsAccBalnJLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(savingsRNumJLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(savingsRNumJText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(savingsAccNumJLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(savingsAccNumJText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(savingsAccTypeJLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(savingsAccTypeJText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(savingsAccBalnJText, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(demographicJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameJLabel)
                    .addComponent(fNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameJLabel)
                    .addComponent(lastNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumJLabel)
                    .addComponent(phoneNumJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobJLabel)
                    .addComponent(dobJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageJLabel)
                    .addComponent(ageJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heightJLabel)
                    .addComponent(heightJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightJLabel)
                    .addComponent(weightJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssnJLabel)
                    .addComponent(ssnJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addressDetailsJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add1JLabel)
                    .addComponent(add1JText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add2JLabel)
                    .addComponent(add2JText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zipCodeJLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stateJLabel)
                        .addComponent(zipCodeJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cityJLabel)
                        .addComponent(cityJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stateJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(savingsAccountDetailsJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savingsBankNameJLabel)
                    .addComponent(savingsBankNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savingsAccBalnJLabel)
                    .addComponent(savingsAccBalnJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savingsAccNumJLabel)
                    .addComponent(savingsAccNumJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savingsAccTypeJLabel)
                    .addComponent(savingsAccTypeJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savingsRNumJLabel)
                    .addComponent(savingsRNumJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkingsBankNameJLabel)
                    .addComponent(checkingsBankNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkingsAccBalnJLabel)
                    .addComponent(checkingsAccBalnJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkingsAccNumJLabel)
                    .addComponent(checkingsAccNumJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkingsAccTypeJLabel)
                    .addComponent(checkingsAccTypeJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkingsRNumJLabel)
                    .addComponent(checkingsRNumJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(ImageHolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lincenseDetailsJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkingsAccBalnJLabel1)
                            .addComponent(pictureJText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateIssueJLabel)
                            .addComponent(dateIssueJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(licenseNumJLabel)
                            .addComponent(licenseNumJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bloodTypeJLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dateExpiryJLabel)
                                .addComponent(bloodTypeJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateExpiryJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(medicalDetailsJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medicalRecordNumJLabel)
                            .addComponent(medicalRecordNumJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alergy1JLabel)
                            .addComponent(alergy1JText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alergy2JText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alergy2JLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alergy3JLabel)
                            .addComponent(alergy3JText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void add2JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add2JTextActionPerformed

    private void alergy3JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergy3JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergy3JTextActionPerformed

    private void ssnJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssnJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssnJTextActionPerformed

    private void weightJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightJTextActionPerformed

    private void alergy2JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergy2JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergy2JTextActionPerformed

    private void heightJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightJTextActionPerformed

    private void ageJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageJTextActionPerformed

    private void dobJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobJTextActionPerformed

    private void pictureJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pictureJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pictureJTextActionPerformed

    private void bloodTypeJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodTypeJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodTypeJTextActionPerformed

    private void dateExpiryJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateExpiryJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateExpiryJTextActionPerformed

    private void dateIssueJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateIssueJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateIssueJTextActionPerformed

    private void phoneNumJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumJTextActionPerformed

    private void lastNameJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameJTextActionPerformed

    private void savingsAccBalnJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savingsAccBalnJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_savingsAccBalnJTextActionPerformed

    private void savingsAccNumJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savingsAccNumJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_savingsAccNumJTextActionPerformed

    private void savingsRNumJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savingsRNumJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_savingsRNumJTextActionPerformed

    private void zipCodeJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipCodeJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipCodeJTextActionPerformed

    private void stateJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateJTextActionPerformed

    private void alergy1JTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergy1JTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergy1JTextActionPerformed

    private void cityJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJTextActionPerformed

    private void savingsAccTypeJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savingsAccTypeJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_savingsAccTypeJTextActionPerformed

    private void checkingsAccBalnJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkingsAccBalnJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkingsAccBalnJTextActionPerformed

    private void checkingsRNumJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkingsRNumJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkingsRNumJTextActionPerformed

    private void checkingsAccNumJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkingsAccNumJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkingsAccNumJTextActionPerformed

    private void checkingsAccTypeJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkingsAccTypeJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkingsAccTypeJTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageHolder;
    private javax.swing.JLabel add1JLabel;
    private javax.swing.JTextField add1JText;
    private javax.swing.JLabel add2JLabel;
    private javax.swing.JTextField add2JText;
    private javax.swing.JLabel addressDetailsJLabel;
    private javax.swing.JLabel ageJLabel;
    private javax.swing.JTextField ageJText;
    private javax.swing.JLabel alergy1JLabel;
    private javax.swing.JTextField alergy1JText;
    private javax.swing.JLabel alergy2JLabel;
    private javax.swing.JTextField alergy2JText;
    private javax.swing.JLabel alergy3JLabel;
    private javax.swing.JTextField alergy3JText;
    private javax.swing.JLabel bloodTypeJLabel;
    private javax.swing.JTextField bloodTypeJText;
    private javax.swing.JLabel checkingsAccBalnJLabel;
    private javax.swing.JLabel checkingsAccBalnJLabel1;
    private javax.swing.JTextField checkingsAccBalnJText;
    private javax.swing.JLabel checkingsAccNumJLabel;
    private javax.swing.JTextField checkingsAccNumJText;
    private javax.swing.JLabel checkingsAccTypeJLabel;
    private javax.swing.JTextField checkingsAccTypeJText;
    private javax.swing.JLabel checkingsBankNameJLabel;
    private javax.swing.JTextField checkingsBankNameJText;
    private javax.swing.JLabel checkingsRNumJLabel;
    private javax.swing.JTextField checkingsRNumJText;
    private javax.swing.JLabel cityJLabel;
    private javax.swing.JTextField cityJText;
    private javax.swing.JLabel dateExpiryJLabel;
    private javax.swing.JTextField dateExpiryJText;
    private javax.swing.JLabel dateIssueJLabel;
    private javax.swing.JTextField dateIssueJText;
    private javax.swing.JLabel demographicJLabel;
    private javax.swing.JLabel dobJLabel;
    private javax.swing.JTextField dobJText;
    private javax.swing.JLabel fNameJLabel;
    private javax.swing.JTextField fNameJText;
    private javax.swing.JLabel heightJLabel;
    private javax.swing.JTextField heightJText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lastNameJLabel;
    private javax.swing.JTextField lastNameJText;
    private javax.swing.JLabel licenseNumJLabel;
    private javax.swing.JTextField licenseNumJText;
    private javax.swing.JLabel lincenseDetailsJLabel;
    private javax.swing.JLabel medicalDetailsJLabel;
    private javax.swing.JLabel medicalRecordNumJLabel;
    private javax.swing.JTextField medicalRecordNumJText;
    private javax.swing.JLabel phoneNumJLabel;
    private javax.swing.JTextField phoneNumJText;
    private javax.swing.JTextField pictureJText;
    private javax.swing.JLabel savingsAccBalnJLabel;
    private javax.swing.JTextField savingsAccBalnJText;
    private javax.swing.JLabel savingsAccNumJLabel;
    private javax.swing.JTextField savingsAccNumJText;
    private javax.swing.JLabel savingsAccTypeJLabel;
    private javax.swing.JTextField savingsAccTypeJText;
    private javax.swing.JLabel savingsAccountDetailsJLabel;
    private javax.swing.JLabel savingsBankNameJLabel;
    private javax.swing.JTextField savingsBankNameJText;
    private javax.swing.JLabel savingsRNumJLabel;
    private javax.swing.JTextField savingsRNumJText;
    private javax.swing.JLabel ssnJLabel;
    private javax.swing.JTextField ssnJText;
    private javax.swing.JLabel stateJLabel;
    private javax.swing.JTextField stateJText;
    private javax.swing.JLabel weightJLabel;
    private javax.swing.JTextField weightJText;
    private javax.swing.JLabel zipCodeJLabel;
    private javax.swing.JTextField zipCodeJText;
    // End of variables declaration//GEN-END:variables
}
