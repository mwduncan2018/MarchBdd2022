package duncan.steps;

import java.util.List;
import java.util.stream.Collectors;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.datatable.DataTable;
import duncan.domainobjects.Album;
import duncan.domainobjects.Car;
import duncan.domainobjects.Friend;
import duncan.domainobjects.Guitar;
import duncan.domainobjects.Location;
import duncan.domainobjects.MarketPerson;

public class DataTableCustomTypeSteps {

	/*
	 * Convert the Gherkin data table to a custom domain object.
	 * 
	 * dataTable.values()
	 * Use when there is a single row or column.
	 * 
	 * dataTable.cells()
	 * Use when there is a table with no header.
	 * 
	 * dataTable.entries()
	 * Use when there is a table with a header.
	 * 
	 * @Transpose
	 * Use to flip the x and y values of the data table.
	 * 
	 * @DataTableType
	 * Use to define the custom conversion.
	 * In a real project, put these in their own package.
	 * 
	 * Examples are below.
	 */
	
	// Scenario: Single row
	//   Given single row
	//   | Cranberries | No Need To Argue | 10.99 |
	@DataTableType
	public Album convertAlbum(DataTable dataTable) {
		return new Album(
				dataTable.values().get(0),
				dataTable.values().get(1),
				Double.parseDouble(dataTable.values().get(2)));
	}
	@Given("single row")
	public void singleRow(@Transpose Album album) {
		System.out.println(album.getBand());
		System.out.println(album.getName());
		System.out.println(album.getPrice());
	}

	// Scenario: Single column
	//   Given single column
	//   | Ibanez |
	//   | RG     |
	//   | 1500   |
	@DataTableType
	public Guitar convertGuitar(DataTable dataTable) {
		return new Guitar(
				dataTable.values().get(0),
				dataTable.values().get(1),
				Double.parseDouble(dataTable.values().get(2)));
	}
	@Given("single column")
	public void singleColumn(Guitar guitar) {	
		System.out.println(guitar.getManufacturer());
		System.out.println(guitar.getModel());
		System.out.println(guitar.getPrice());
	}

	// Scenario: Horizontal data, no header
	//   Given horizontal data, no header
	//   | big  | bear | mike |
	//   | bald | bull | bill |
	@DataTableType
	public List<MarketPerson> convertListMarketPerson(DataTable dataTable) {
		return dataTable.cells().stream().map(x -> {
			return new MarketPerson(
					x.get(0),
					x.get(1),
					x.get(2));
		}).collect(Collectors.toList());
	}
	@Given("horizontal data, no header")
	public void horizontalDataNoHeader(List<MarketPerson> marketPersons) {
		marketPersons.forEach(x -> System.out.println(x.getDescription() + " " + x.getNickname() + " " + x.getName()));
	}

	// Scenario: Vertical data, no header
	//   Given vertical data, no header
	//   | North America | North America | Europe  |
	//   | USA           | Canada        | England |
	//   | New York      | Toronto       | London  |
	@DataTableType
	public List<Location> convertListLocation(DataTable dataTable) {
		return dataTable.cells().stream().map(x -> {
			return new Location(
					x.get(0),
					x.get(1),
					x.get(2));
		}).collect(Collectors.toList());
	}
	@Given("vertical data, no header") 
	public void verticalDataNoHeader(@Transpose List<Location> locations) {
		locations.forEach(x -> System.out.println(x.getContinent() + ", " + x.getCountry() + ", " + x.getCity()));
	}
	
	// Scenario: Horizontal data, header
	//   Given horizontal data, header
	//   | FIRSTNAME | mike   | stephanie | erik   |
	//   | LASTNAME  | duncan | harford   | angone |
	//   | AGE       | 40     | 33        | 41     |
	@DataTableType
	public List<Friend> convertListFriend(DataTable dataTable) {
		return dataTable.entries().stream().map(x -> {
			return new Friend(
					x.get("FIRSTNAME"),
					x.get("LASTNAME"),
					Integer.parseInt(x.get("AGE")));
		}).collect(Collectors.toList());
	}
	@Given("horizontal data, header")
	public void horizontalDataHeader(@Transpose List<Friend> friends) {
		friends.forEach(x -> System.out.println(x.getFirstname() + " " + x.getLastname() + " (" + x.getAge() + ")"));
	}

	// Scenario: Vertical data, header
	//   Given vertical data, header
	//   | BRAND  | MODEL   |
	//   | Tesla  | Model 3 |
	//   | Nissan | Z       |
	//   | Toyota | Camry   |
	@DataTableType
	public List<Car> convertListCar(DataTable dataTable) {
		return dataTable.entries().stream().map(x -> {
			return new Car(
					x.get("BRAND"),
					x.get("MODEL"));
		}).collect(Collectors.toList());		
	}
	@Given("vertical data, header")
	public void verticalDataHeader(List<Car> cars) {
		cars.forEach(x -> System.out.println(x.getManufacturer() + " " + x.getModel()));
	}	
}