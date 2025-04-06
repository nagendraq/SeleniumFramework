@TutorialsPointFeature
Feature: This feature is to work with tutorials point practise page

  @TP_Textbox
  Scenario: This scenario is used to work with text boxes

    Given user launches the tutorials point practise page "https://www.tutorialspoint.com/selenium/practice/text-box.php"
    When user enters full name as "Singamsetti Nagendra Krishna Mohan"
    And user enters email address as "krishna.singamsetti@gmail.com"
    And user enters address as "12-16-2/2, Middle Street, Aryapuram, Rajahudry. 533101"
    And user enters password as "******"