package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature",
                 glue= {"StefDefenation","Hooks"},
                dryRun=false,strict=true,monochrome=true,
                plugin= {"html:Report/Webreport","json:Report/jsonreport.json","junit:report/xmlreport.xml"},
            tags= {"@BackgoundExamples"}
		)
/* dryRun = true : This keyword will compare feature and stefDef, and through the missed snippet code in console
 ******Very very important thing is it wont get execute if the statement is dryRun= true ****
 
 Strict=true : This also will compare feature and stefDef but during the execution.if something missed it will
 through snippet in console.  strict = false : just ignore the missed method and wont through any error in console

 monochrome: This option will convert the console statements to human readable statements.
 
 format : This option got Deprecated by cucumber , Updated one is **plugin** which we can use now
 
 tags: tags at feature level,scenario and scenario outline level, ignore tags, combine different tags****
 
 *** AND CONDITION : tags={"@Atag","@Btag"} *** OR CONDITION : tags={"@Atag,@Btag"} ** ignore tags={~@Atag}
*/


public class RunnerClass {

}
