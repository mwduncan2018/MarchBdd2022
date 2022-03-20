## Cucumber Tags
###### Use tags to run a subset of scenarios, features, rules, and examples.
###### Use tags to run hooks for a subset of scenarios.
###### Maven overrides tags in the JUnitCucumberRunner.

```
@Tags
Feature: Tags

  @SuperRule
  Rule: Cucumber has tags
    Given I print pie

  @MegaScenario
  Scenario: Print hello
    Given I print hello
  
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

```
// Execute things tagged with either @MegaScenario or @SuperScenario
@CucumberOptions(tags = "@MegaScenario or @SuperScenario")

// Execute things tagged with both @SuperScenario and @Tags
@CucumberOptions(tags = "@SuperScenario and @Tags")

// Execute things tagged with @Tags, but not tagged with @SuperProd
@CucumberOptions(tags = "@Tags and not @SuperProd")
```
