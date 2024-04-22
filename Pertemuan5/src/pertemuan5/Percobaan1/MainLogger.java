/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5.Percobaan1;

/**
 *
 * @author Admin
 */
import Pertemuan5.Percobaan1.Another_Praktikum_PBO_3.Logger;
public class MainLogger {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.debug("Debug with level "+ logger.debugLevel );
        
        logger.debugLevel = 20;
        logger.info("Info with level " + logger.debugLevel);
    }
}
