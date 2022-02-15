package com.example.workflow.controllers;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Controller;

@Controller
public class RateFight implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        var enemyWarriors = (int) delegateExecution.getVariable("enemyWarriors");
        var warriors = (int) delegateExecution.getVariable("warriors");

        delegateExecution.setVariable("isWin",warriors > enemyWarriors);
    }
}
