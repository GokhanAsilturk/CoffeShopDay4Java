package Entities;

import Abstract.IEntities;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.util.Date;

public class Customer  {

     private int id;
     private String Firstname;
     private String LastName;
     private String DateofBirth;
     private String NationalityId;

     public Customer(int id, String firstName, String lastName, String dateofBirth, String nationalityId) {
     this.DateofBirth=dateofBirth;
     this.Firstname=firstName;
     this.id=id;
     this.LastName=lastName;
     this.NationalityId=nationalityId;
     }


     public int getId() {
          return id;
     }


     public String getFirstname() {
          return Firstname;
     }

     public void setFirstname(String firstname) {
          Firstname = firstname;
     }

     public String getLastName() {
          return LastName;
     }

     public void setLastName(String lastName) {
          LastName = lastName;
     }

     public String getDateofBirth() {
          return DateofBirth;
     }

     public void setDateofBirth(String dateofBirth) {
          DateofBirth = dateofBirth;
     }

     public String getNationalityId() {
          return NationalityId;
     }

     public void setNationalityId(String nationalityId) {
          NationalityId = nationalityId;
     }
}
