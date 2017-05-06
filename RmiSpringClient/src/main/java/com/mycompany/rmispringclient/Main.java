/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rmispringclient;

import com.mycompany.rmispringserver.daos.ClientObj;
import com.mycompany.rmispringserver.entities.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author shibo
 */
public class Main {
    public static void main(String[] args) {
          ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/beans.xml"); 
          ClientObj obj=(ClientObj) ctx.getBean("clientObj");
          System.out.println(""+obj.getDao().getSalary(new User(1, "dksjk", 12, 1000)));
    }
}
