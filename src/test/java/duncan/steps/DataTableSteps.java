package duncan.steps;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.datatable.DataTable;

public class DataTableSteps {

	/*
	 * Cucumber automatically converts a data table to types.
	 * 
	 * Examples are below.
	 */
	
	@Given("single cell, to string")
	public void singleCellToString(String cell) {
		System.out.println(cell);
	}
	
	@Given("single column, to list")
	public void singleColumnToList(List<String> list) {
		list.forEach(x -> System.out.println(x));
	}
	
	@Given("single row, to list")
	public void singleRowToList(@Transpose List<String> list) {
		list.forEach(x -> System.out.println(x));
	}
	
	@Given("multiple rows, header, to list of map")
	public void multipleRowsHeaderToListOfMap(List<Map<String, String>> collection) {
		collection.forEach(x -> {
			System.out.println(
					x.get("FIRSTNAME") + " " +
					x.get("LASTNAME") + " (" +
					LocalDate.parse(x.get("DATEOFBIRTH"), DateTimeFormatter.ofPattern("MM-dd-yyyy")) + ")");
		});
	}
	
	@Given("multiple columns, header, to list of map")
	public void multipleColumnsHeaderToListOfMap(@Transpose List<Map<String, String>> collection) {
		collection.forEach(x -> {
			System.out.println(
					x.get("FIRSTNAME") + " " +
					x.get("LASTNAME") + " (" +
					LocalDate.parse(x.get("DATEOFBIRTH"), DateTimeFormatter.ofPattern("MM-dd-yyyy")) + ")");
		});		
	}
	
	@Given("multiple rows, no header, to list of list")
	public void multipleRowsNoHeaderToListOfList(List<List<String>> collection) {
		collection.forEach(x -> System.out.println(x.get(0) + " " + x.get(1) + " " + x.get(2)));
	}
	
	@Given("multiple columns, no header, to list of list")
	public void multipleColumnsNoHeaderToListOfList(@Transpose List<List<String>> collection) {
		collection.forEach(x -> System.out.println(x.get(0) + " " + x.get(1) + " " + x.get(2)));	
	}
}