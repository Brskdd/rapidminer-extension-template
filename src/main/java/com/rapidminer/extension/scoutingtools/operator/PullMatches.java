package com.rapidminer.extension.scoutingtools.operator;

import java.util.logging.Level;

import com.rapidminer.operator.Operator;
import com.rapidminer.operator.OperatorDescription;
import com.rapidminer.tools.LogService;

public class PullMatches extends Operator{

    public PullMatches(OperatorDescription description) {
        super(description);
    }

    @Override
    public void doWork() {
        // TODO Auto-generated method stub
        LogService.getRoot().log(Level.INFO, "PullMatches operator started");
    }
    
}
