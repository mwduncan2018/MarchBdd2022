# Cucumber Expressions

# Cucumber Expressions are an alternative to Regular Expressions.
# Cucumber Expressions are easier to read and understand, so use them!
## Supported Types:
##### {int} -> 5
##### {float} -> 1.5
##### {word} -> wordWithoutSpace
##### {string} -> "with space" or 'single quotes' or "double quotes" or '' (empty text) or "" (empty text)
## Optional Text
'''
Given I have 1 dollar
When I have 2 dollars
Then I have 3 dollars

// All 3 match this step definition
@Then("I have {int} dollar(s)")
public void iHaveDollars(int cash) { ... }
'''
## Alternative Text
'''
Given I jump to the moon
Then I hop to the moon

// Both match this step definition
@When("I jump/hop to the moon")
public void iJumpHopToTheMoon() { ... }
'''
## Custom Parameter Type
##### Put custom parameter types in a package and specify the package within the glue.
