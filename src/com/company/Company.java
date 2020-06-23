/*
 *
 * Classname: Main
 *
 * @version 23.06.2020
 * @author Serhii Tronevych
 *
 * Module 4 task Final
 *
 * Topic: COMPANY Service implementation - 15 points
 *
 * 1. Create a test set of companies in your main class.
 * 2.  Take for this set  IT-companies:  Chief, Lawyer, Developer
 * (Design,  Front-end, Back-end, DevOps). See attch.
 * 3. Take into account 4 different cases  for a company
 * ( on-top, on bottom, in the node,  out of chain)
 * 4. Test all this cases in your main class.
 * 5. Implement the interface in a class CompanyService.
 *
 */
package com.company;

public class Company {
    // parent for this company nullable, when there is no parent for this company
    private Company parent;
    private long employeesCount;

    //
    public Company() {
    }
    //
    public Company(Company parent, long employeesCount) {
        this.parent = parent;
        this.employeesCount = employeesCount;
    }
//
    public Company getParent() {
        return parent;
    }

    public void setParent(Company parent) {
        this.parent = parent;
    }

    public long getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(long employeesCount) {
        this.employeesCount = employeesCount;
    }

    @Override
    public String toString() {
        return "Company{" +
                "parent=" + parent +
                ", employeesCount=" + employeesCount +
                '}';

    }

}
