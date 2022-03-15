## Cucumber Tags
###### Use tags to run a subset of scenarios, features, rules, and examples.
###### Use tags to restrict hooks to a subset of scenarios.
###### Maven overrides tags in the JUnitCucumberRunner.

```
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
 ```
