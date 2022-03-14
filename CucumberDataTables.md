## Cucumber DataTable
###### Cucumber automatically converts DataTables.
###### Cucumber allows you to implement a custom conversion to an object.
###### The DataTable must be the last parameter in the step definition!

## @Transpose
```
	// Flip the x and y of the data table with @Transpose.
	// Use @Transpose before the parameter in the step definition
	@Given("transpose example")
	public void transposeExample(@Transpose DataTable dataTable) {
		...
	}
```

## Automatic Conversions
##### Single table cell -> to -> string
```
public void stepDef(String cell) { }
```
##### Single column with no header -> to -> list
```
public void stepDef(List<String> list) { }
```
##### Single row with no header -> to -> list
```
public void stepDef(@Transpose List<String> list) { }
```
##### Multiple rows with no header -> to -> list of list of string
```
public void stepDef(List<List<String>> collection) { }
```
##### Multiple columns with no header -> to -> list of list of string
```
public void stepDef(@Transpose List<List<String>> collection) { }
```
##### Multiple rows with header -> to -> list of map of string 
```
public void stepDef(List<Map<String, String>> collection) { }
```
##### Multiple columns with header -> to -> list of map of string
```
public void stepDef(@Transpose List<Map<String, String>> collection) { }
```

## Custom Conversions
###### Cucumber only allows a single custom conversion for a class to be defined.
###### For example, Cucumber will allow a conversion to either List<MyCustomDomainModel> or MyCustomDomainModel, but not both.
```
	// This method defines how to do the custom conversion to MyCustomDomainModel.
	@DataTableType
	public MyCustomDomainModel convert(DataTable dataTable) {
		...
	}
```
```
	// This method defines how to do the custom conversion to List<MyCustomDomainModel>.
	@DataTableType
	public List<MyCustomDomainModel> convert(DataTable dataTable) {
		...
	}
```
```
	// dataTable.values()
	// Use when there is a single row/column.
	// Example 1:
	//    | mike | big | bear |
	// Example 2:
	//    | mike |
	//    | big  |
	//    | bear |
	
	// dataTable.cells()
	// Use when there is a table with no header.
	// Example 1:
	//    | mike | big  | bear |
	//    | bill | bald | bull |
	// Example 2:
	//    | mike | bill |
	//    | big  | bald |
	//    | bear | bull |

	// dataTable.entries()
	// Use when there is a table with a header.
	// Example 1:
	//    | NAME | DESCRIPTION | NICKNAME |
	//    | mike | big         | bear     |
	//    | bill | bald        | bull     |
	// Example 2:
	//    | NAME        | mike | bill |
	//    | DESCRIPTION | big  | bald |
	//    | NICKNAME    | bear | bull |
```
