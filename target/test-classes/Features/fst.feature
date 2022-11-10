Feature: FST Assignment

  Scenario Outline: Register to test website
    Given User navigates to test website
    When user enter "<username>" username , "<password>" password and other details
    And user clicks on ok button
    Then I verify the <status> in step
    And Click on HomePage
   	And Send Email to person

    Examples: 
      | username | password | status  |
      | makser42 |  12345   | success |
      

