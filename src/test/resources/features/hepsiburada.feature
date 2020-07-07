Feature: HB Acceptance Test

  Scenario: User should vote a comment
    Given User is on the HomePage
    When User should search for "Apple"
    And User should see the details of the 4th product
    And User should see comments
    And User should vote Yes for the first comment listed
    Then User should see message "Teşekkür Ederiz."