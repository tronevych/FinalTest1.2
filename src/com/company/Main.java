/*
 *
 * Classname: Main
 *
 * @version 23.06.2020
 * @author Serhii Tronevych

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

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        ICompanyServiceImpl service = new ICompanyServiceImpl();

        // Create ArrayList with company hierarchy

        List<Company> companies = new ArrayList<>();

        Company chief = new Company(null,4);
        Company developer = new Company(chief,8);
        Company lawyer = new Company(chief,3);
        Company backEnd = new Company(developer,5);
        Company frontEnd = new Company(developer,3);
        Company devOps = new Company(backEnd,4);
        Company design = new Company(frontEnd,3);
        Company accounting = new Company(null,2);

        // First test, child must to return tchief

        System.out.println("For Chief, the parent company is: \n"
                + service.getTopLevelParent(chief));
        System.out.println("For Developer, the parent company is: \n"
                + service.getTopLevelParent(developer));
        System.out.println("For Lawyer, the parent company is: \n"
                + service.getTopLevelParent(lawyer));
        System.out.println("For Back-End, the parent company is: \n"
                + service.getTopLevelParent(backEnd));
        System.out.println("For Front-End, the parent company is: \n"
                + service.getTopLevelParent(frontEnd));
        System.out.println("For DevOps, the parent company is: \n"
                + service.getTopLevelParent(devOps));
        System.out.println("For Design, the parent company is: \n"
                + service.getTopLevelParent(design));
        System.out.println("For Accounting, the parent company is: \n"
                + service.getTopLevelParent(accounting));




    }
}