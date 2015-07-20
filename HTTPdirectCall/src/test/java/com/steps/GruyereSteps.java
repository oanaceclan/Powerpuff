package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.GruyerePage;

public class GruyereSteps extends ScenarioSteps {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	GruyerePage gruyerePage;
    
    public GruyereSteps(){
     gruyerePage = new GruyerePage();
    }
    
    @Step
    public void LoginRequest(){
     gruyerePage.Login();
    }

    @Step
    public void CreateSnippetRequest(String message){
     gruyerePage.CreateSnippets(message);
    }
    
    @StepGroup
    public void CreateSnippetGroup(String message){
     LoginRequest();
     CreateSnippetRequest(message);
    }
}