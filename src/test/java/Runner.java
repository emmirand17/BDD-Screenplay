import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/erikbank.feature" , tags="@CasoAlterno")
//@CucumberOptions(features ="src/test/resources/features/ColorLib/nombre.feature")
public class Runner {
	
}