#Author: NM
#Date:
#Description:

@AngularUI
@Regression
@Smoke
Feature: Angular UI Components Feature

Background:
    Given User is on Angular UI materials home page
    When User accepts cookies
    And User navigates to components page
    Then User validates that components home page is displayed
    
  @FormField
  Scenario Outline: Validation of Form Field Functionality
    When User navigates to "Form field" component from left navigation bar
    Then User validates that user landed on component with title "Form field"
    When User fills the field form component field from sheet name "<SheetName>" and row number <RowNumber>
    And User navigates to "api" tab
    Then User validates "api" page is displayed
    And User navigates to "examples" tab
    Then User validates "examples" page is displayed
    
    Examples:
    |SheetName         |RowNumber|
    |FormFieldComponent|0        |
    |FormFieldComponent|1        |
    |FormFieldComponent|2        |
    |FormFieldComponent|3        |
    |FormFieldComponent|4        |