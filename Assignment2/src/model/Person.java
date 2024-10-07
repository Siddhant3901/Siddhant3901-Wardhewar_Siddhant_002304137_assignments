/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author siddh
 */
public class Person {
    
     private String FName;
    private String LName;
    private int Ssn;
    private double Age;
    private Address address;
    

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public void setAddress(String HStreetAdd,String HUnNo,String HCity, String Hstate,Long Hzip ,Integer HPno, String WStreetAdd,String WUnNo,String WCity,String Wstate,Long Wzip,Integer WPno){
        
        Address address = new Address();
        
        address.setHCity(HCity);
        address.setHStreetAdd(HStreetAdd);
        address.setHUnNo(HUnNo);
        address.setHstate(Hstate);
        address.setHzip(0);
        address.setHPno(0);
        
        address.setWStreetAdd(WStreetAdd);
        address.setWUnNo(WUnNo);
        address.setWCity(WCity);
        address.setWstate(Wstate);
        address.setWPno(0);
        address.setWzip(0);
        
        this.address = address;
    }
  

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public int getSsn() {
        return Ssn;
    }

    public void setSsn(int Ssn) {
        this.Ssn = Ssn;
    }

    public double getAge() {
        return Age;
    }

    public void setAge(double Age) {
        this.Age = Age;
    }


}

    