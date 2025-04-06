@rahulShettyPractise
Feature: This feature is used to perform actions on the Rahul Shetty Practise page

  @radioButtonAndCheckbox
  Scenario: This scenario is used to perform actions with the radio buttons and checkboxes

    Given user launches the rahul shetty practise page "https://rahulshettyacademy.com/AutomationPractice/"
    When user clicks on first radio button
    Then application should show first radio button as selected
    When user clicks on second radio button
    Then application should show second radio button as selected
    And application should show third radio button as unselected
    When user clicks on first checkbox
    Then application should show first checkbox as selected
    When user clicks on second checkbox
    Then application should show second checkbox as selected
    And application should show third checkbox as unselected

  @autoCompleteAndDropdown
  Scenario: This scenario is used to perform actions with auto complete select and dropdown

    Given user launches the rahul shetty practise page "https://rahulshettyacademy.com/AutomationPractice/"
    When user enters country name "Indonesia" in auto complete country field
    Then application should display the suggestions in auto complete country field
    #And user should be able to select the "India" country from suggestions
    And user should be able to select the "Indonesia" country from suggestions

