package duncan.customtypes;

import io.cucumber.java.ParameterType;

import duncan.domainobjects.Guitar;

public class CustomTypes {

	@ParameterType(".*")
	public Guitar guitar(String model) {
		return new Guitar(model);
	}
	
}
