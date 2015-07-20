package com.test;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.steps.GruyereSteps;

@RunWith(SerenityRunner.class)
public class GruyereTest {

 @Steps
 public GruyereSteps gruyereSteps;

 @Test
 public void CreateSnippet() {
  gruyereSteps.CreateSnippetGroup("snippet1");
  gruyereSteps.CreateSnippetRequest("snippet2");
  gruyereSteps.CreateSnippetRequest("snippet3");
  gruyereSteps.CreateSnippetRequest("snippet4");
  gruyereSteps.CreateSnippetRequest("snippet5");
  gruyereSteps.CreateSnippetRequest("snippet6");
  gruyereSteps.CreateSnippetRequest("snippet7");
  gruyereSteps.CreateSnippetRequest("snippet8");
  gruyereSteps.CreateSnippetRequest("snippet9");
  gruyereSteps.CreateSnippetRequest("snippet10");
 }
}