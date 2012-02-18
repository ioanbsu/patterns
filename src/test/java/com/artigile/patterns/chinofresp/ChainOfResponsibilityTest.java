package com.artigile.patterns.chinofresp;

import com.artigile.patterns.chainofresp.example1.AbstractLogger;
import com.artigile.patterns.chainofresp.example1.EmailLogger;
import com.artigile.patterns.chainofresp.example1.StderrLogger;
import com.artigile.patterns.chainofresp.example1.StdoutLogger;
import com.artigile.patterns.chainofresp.example2.*;
import org.junit.Test;

/**
 * @author IoaN, 2/18/12 12:55 PM
 */
public class ChainOfResponsibilityTest {


    @Test
    public void testChainOfResponsibility1() {
        AbstractLogger logger, logger1;
        logger1 = logger = new StdoutLogger(AbstractLogger.DEBUG);
        logger1 = logger1.setNext(new EmailLogger(AbstractLogger.NOTICE));
        logger1 = logger1.setNext(new StderrLogger(AbstractLogger.ERR));


        // Handled by StdoutLogger
        logger.message("Entering function y.", AbstractLogger.DEBUG);

        // Handled by StdoutLogger and EmailLogger
        logger.message("Step1 completed.", AbstractLogger.NOTICE);

        // Handled by all three loggers
        logger.message("An error has occurred.", AbstractLogger.ERR);
    }

    @Test
    public void testChainOfResponsibility2() {
        ManagerPPower manager = new ManagerPPower();
        DirectorPPower director = new DirectorPPower();
        VicePresidentPPower vp = new VicePresidentPPower();
        PresidentPPower president = new PresidentPPower();
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(president);

        double d = 100;
        manager.processRequest(new PurchaseRequest(0, d, "General"));
        d = 1000;
        manager.processRequest(new PurchaseRequest(0, d, "General"));
        d = 5000;
        manager.processRequest(new PurchaseRequest(0, d, "General"));
        d = 10000;
        manager.processRequest(new PurchaseRequest(0, d, "General"));
        d = 25000;
        manager.processRequest(new PurchaseRequest(0, d, "General"));
        d = 100000;
        manager.processRequest(new PurchaseRequest(0, d, "General"));
    }

}
