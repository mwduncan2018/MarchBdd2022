package duncan.customdatatypes;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import duncan.domainobjects.Friend;
import duncan.domainobjects.Guitar;
import duncan.domainobjects.MarketPerson;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;

public class CustomDataTypes {

	/*
	 * dataTable.values()
	 * Use when there is a single row/column  
	 */
	
	/*
	 * dataTable.cells()
	 * Use when there is a table with no header  
	 */
	
	/*
	 * dataTable.entries()
	 * Use when there is a table with a header 
	 */
	/*
	@DataTableType
	public Guitar convertDataTableToGuitar(DataTable dataTable) {
		return new Guitar(dataTable.values().get(0));
	}

	@DataTableType
	public MarketPerson convertDataTableToMarketPerson(DataTable dataTable) {
		List<String> cells = dataTable.values();
		return new MarketPerson(cells.get(0), cells.get(1), cells.get(2));
	}

	@DataTableType
	public House convertDataTableToHouse(DataTable dataTable) {
		Map<String, String> m = dataTable.entries().get(0);
		return new House(
				m.get("ADDRESS"),
				m.get("TOWN"),
				Integer.parseInt(m.get("ZIP")),
				Integer.parseInt(m.get("PRICE")));
	}

	@DataTableType
	public List<Pet> convertDataTableToListOfPet(DataTable dataTable) {
		return dataTable.entries().stream()
				.map(pet -> new Pet(pet.get("PETNAME"), pet.get("OWNERNAME"), pet.get("TYPE")))
				.collect(Collectors.toList());
	}
	
	@DataTableType
	public List<Friend> convertDataTableToFriend(DataTable dataTable) {
		return dataTable.entries().stream()
				.map(x -> new Friend(x.get("FIRSTNAME"), x.get("LASTNAME"), LocalDate.parse(x.get("DATEOFBIRTH"), DateTimeFormatter.ofPattern("MM-dd-yyyy"))))
				.collect(Collectors.toList());		
	}
	*/
}
