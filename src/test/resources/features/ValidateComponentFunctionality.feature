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

  @Checkbox
  Scenario: Validation of Checkbox Functionality
    When User navigates to "Checkbox" component from left navigation bar
    Then User validates that user landed on component with title "Checkbox"
    When User clicks the "Check me" checkbox
    Then User validates that "Check me" checkbox is selected
    When User clicks the "Indeterminate" checkbox
    Then User validates that "Indeterminate" checkbox is selected
    When User clicks the "Check me" checkbox
    Then User validates that "Check me" checkbox is not selected
    When User clicks the "Indeterminate" checkbox
    Then User validates that "Indeterminate" checkbox is not selected
    
  @Input
  Scenario: Validation of Form Field Functionality
    When User navigates to "Form field" component from left navigation bar
    Then User validates that user landed on component with title "Form field"
    When User enters text "Testing" in the input field
    And User selects "Second option" from the dropdown
    And User enters "UI Automation" in text area field
    And User navigates to "api" tab
    Then User validates "api" page is displayed
    And User navigates to "examples" tab
    Then User validates "examples" page is displayed
