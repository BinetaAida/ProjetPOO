/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.ipsl.bineta.project1;

/**
 *
 * @author binetAida
 */
public class Configuration {
    
    private static Configuration instance;
    private final String dbHost;
    private final String dbLogin;
    
    private Configuration(){
    
        dbHost="localhost";
        dbLogin="root";
    }
   
    public static  Configuration getInstance(){
        if (instance==null) {
            instance=new Configuration();
        }
    return instance;
    }

    public String getDbHost() {
        return dbHost;
    }

    public String getDbLogin() {
        return dbLogin;
    }
    
    }
   
