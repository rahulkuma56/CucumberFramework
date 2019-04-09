Feature: Gmail feature of the web page

	@chrome
  Scenario: Gmail Login test.
   Given :I am at the home page
    When : I pass email ID
    Then : Click on next button
    And : I pass password abc
    Then : Click on passNext button