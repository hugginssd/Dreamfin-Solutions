/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreamfin.solutions.module.groups;

import java.sql.Date;

/**
 *
 * @author User
 */
public class GroupsConstructor {

    private String loanOfficerName;
    private String registeredBy;
    private Date registeredOn;
    private String description;
    private String status;

    public GroupsConstructor(String loanOfficerName, String registeredBy, Date registeredOn, String description, String status) {
        this.loanOfficerName = loanOfficerName;
        this.registeredBy = registeredBy;
        this.registeredOn = registeredOn;
        this.description = description;
        this.status = status;
    }

    public GroupsConstructor(String loanOfficerName, String registeredBy, Date registeredOn, String description) {
        this.loanOfficerName = loanOfficerName;
        this.registeredBy = registeredBy;
        this.registeredOn = registeredOn;
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLoanOfficerName() {
        return loanOfficerName;
    }

    public void setLoanOfficerName(String loanOfficerName) {
        this.loanOfficerName = loanOfficerName;
    }

    public String getRegisteredBy() {
        return registeredBy;
    }

    public void setRegisteredBy(String registeredBy) {
        this.registeredBy = registeredBy;
    }

    public Date getRegisteredOn() {
        return registeredOn;
    }

    public void setRegisteredOn(Date registeredOn) {
        this.registeredOn = registeredOn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
