package org.example.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j1 {
    static Logger logger= LogManager.getLogger();
    public static void main(String[] args) {
    logger.error("err1");
    }
}
