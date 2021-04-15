package mdd.coursework.xcss.typing.validation;

import com.google.inject.Inject;
import it.xsemantics.runtime.validation.XsemanticsValidatorErrorGenerator;
import mdd.coursework.xcss.typing.XCSSTypeSystem;
import mdd.coursework.xcss.validation.AbstractXcssValidator;
import mdd.coursework.xcss.xcss.CSSStyleDelacration;
import org.eclipse.xtext.validation.Check;

@SuppressWarnings("all")
public class XCSSTypeSystemValidator extends AbstractXcssValidator {
  @Inject
  protected XsemanticsValidatorErrorGenerator errorGenerator;
  
  @Inject
  protected XCSSTypeSystem xsemanticsSystem;
  
  protected XCSSTypeSystem getXsemanticsSystem() {
    return this.xsemanticsSystem;
  }
  
  @Check
  public void checkZIndexValue(final CSSStyleDelacration sd) {
    errorGenerator.generateErrors(this,
    	getXsemanticsSystem().checkZIndexValue(sd),
    		sd);
  }
}
