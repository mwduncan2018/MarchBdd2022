@Sample
Feature: Sample

  @Alpha
  Scenario: Alpha
    Given I do a thing
    When something else happens
    Then the result is good

  @Beta
  Scenario: Beta
    Given I do a thing
    When something different happens
    Then the result is bad

  @CustomTypeDemo
  Scenario Outline: Charlie
    Given a <model> exists
    When a <model> exists
    Then a <model> exists

    Examples: 
    | model  |
    | Gibson |
    | Ibanez |
       