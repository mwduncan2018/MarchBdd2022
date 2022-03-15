## Regular Expression
###### Pass data from a scenario outline example to a step definition.
```
Scenario Outline: Print names
  Given I print <firstName> and <lastName>
  Examples:
  | firstName | lastName |
  | bob       | davis    |
  | jeremy    | johnson  |

@Given("^I print (.*) and (.*)$")
public void stepDef(String firstName, String lastName) { ... }
```
