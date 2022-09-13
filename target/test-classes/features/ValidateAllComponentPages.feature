#Author: NM
#Date:
#Description:

@AngularUI
@Regression
@Smoke
Feature: Angular UI Components Feature

  @Components
  Scenario Outline: Validation of Components Page and Tabs
    Given User is on Angular UI materials home page
    When User accepts cookies
    And User navigates to components page
    Then User validates that components home page is displayed   
    When User navigates to component <componentName> tab from left navigation bar
    Then User validates that user landed on component page with title <componentName>
    And User validates that page header is displayed as <pageHeader>


    Examples:     
      | componentName   | pageHeader                                   |
      | Autocomplete    | Simple autocomplete                          |
      | Badge           | Badge position                               |
      | Bottom Sheet    | Sharing data with the bottom sheet component |
      | Button          | Theming                                      |
      | Button toggle   | Exclusive selection vs. multiple selection   |
      | Card            | Basic card sections                          |
      | Checkbox        | Checkbox label                               |
      | Chips           | Unstyled chips                               |
      | Datepicker      | Connecting a datepicker to an input          |