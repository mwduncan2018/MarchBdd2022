@Tags
Feature: Tags

  @SuperRule
  Rule: Cucumber has tags
    Given I print pie

  @SuperScenario
  Scenario Outline: Print names
    Given I print <firstName> and <lastName>

    @SuperStage
    Examples:
    | firstName | lastName |
    | mike      | duncan   |
    | stephanie | harford  |

    @SuperProd
    Examples:
    | firstname | lastname |
    | travis    | duncan   |
    | bill      | duncan   |