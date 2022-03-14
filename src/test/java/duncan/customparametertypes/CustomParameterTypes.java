package duncan.customparametertypes;

import duncan.domainobjects.Foobar;
import io.cucumber.java.ParameterType;

public class CustomParameterTypes {

	@ParameterType("(.*)")
	public Foobar foobar(String foobar) {
		return new Foobar(foobar);
	}
}
