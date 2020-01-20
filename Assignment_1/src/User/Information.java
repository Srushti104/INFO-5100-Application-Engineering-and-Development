/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.awt.Image;

/**
 *
 * @author srush
 */
public class Information {
     //Demographic Information:
    private String fName;
    private String lastName;
    private String phoneNum;
    private String dob;
    private String age;
    private String height;
    private String weight;
    private String ssn;
    
    //Address Information:
    private String add1;
    private String add2;
    private String city;
    private String state;
    private String zipCode;
    
    // Account Information:
    private String savingsBankName;
    private String savingsAccNum;
    private String savingsRNum;
    private String savingsAccBaln;
    private String AccType;
    
    // License Information:
    private String licenseNum;
    private String dateIssue;
    private String dateExpiry;
    private String bloodType;
    private String picture;
    private Image image;
    
    // Medical Records:
    private String medicalRecordNum;
    private String alergy1;
    private String alergy2;
    private String alergy3;

    public String getfName() {
        return fName;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getAccType() {
        return AccType;
    }

    public void setAccType(String AccType) {
        this.AccType = AccType;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public String getAdd2() {
        return add2;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getSavingsBankName() {
        return savingsBankName;
    }

    public void setSavingsBankName(String savingsBankName) {
        this.savingsBankName = savingsBankName;
    }

    public String getSavingsAccNum() {
        return savingsAccNum;
    }

    public void setSavingsAccNum(String savingsAccNum) {
        this.savingsAccNum = savingsAccNum;
    }

    public String getSavingsRNum() {
        return savingsRNum;
    }

    public void setSavingsRNum(String savingsRNum) {
        this.savingsRNum = savingsRNum;
    }

    public String getSavingsAccBaln() {
        return savingsAccBaln;
    }

    public void setSavingsAccBaln(String savingsAccBaln) {
        this.savingsAccBaln = savingsAccBaln;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getDateIssue() {
        return dateIssue;
    }

    public void setDateIssue(String dateIssue) {
        this.dateIssue = dateIssue;
    }

    public String getDateExpiry() {
        return dateExpiry;
    }

    public void setDateExpiry(String dateExpiry) {
        this.dateExpiry = dateExpiry;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getMedicalRecordNum() {
        return medicalRecordNum;
    }

    public void setMedicalRecordNum(String medicalRecordNum) {
        this.medicalRecordNum = medicalRecordNum;
    }

    public String getAlergy1() {
        return alergy1;
    }

    public void setAlergy1(String alergy1) {
        this.alergy1 = alergy1;
    }

    public String getAlergy2() {
        return alergy2;
    }

    public void setAlergy2(String alergy2) {
        this.alergy2 = alergy2;
    }

    public String getAlergy3() {
        return alergy3;
    }

    public void setAlergy3(String alergy3) {
        this.alergy3 = alergy3;
    }
    
    
}
