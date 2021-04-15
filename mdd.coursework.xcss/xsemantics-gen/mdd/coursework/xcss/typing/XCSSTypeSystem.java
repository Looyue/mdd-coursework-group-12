package mdd.coursework.xcss.typing;

import com.google.common.collect.Iterables;
import com.google.inject.Provider;
import it.xsemantics.runtime.ErrorInformation;
import it.xsemantics.runtime.Result;
import it.xsemantics.runtime.RuleApplicationTrace;
import it.xsemantics.runtime.RuleEnvironment;
import it.xsemantics.runtime.RuleFailedException;
import it.xsemantics.runtime.XsemanticsProvider;
import it.xsemantics.runtime.XsemanticsRuntimeSystem;
import java.util.Collections;
import mdd.coursework.xcss.typing.XCSSType;
import mdd.coursework.xcss.xcss.Addition;
import mdd.coursework.xcss.xcss.CSSStyleDelacration;
import mdd.coursework.xcss.xcss.CSSStyleValue;
import mdd.coursework.xcss.xcss.CSSStyleValueLiteral;
import mdd.coursework.xcss.xcss.Expression;
import mdd.coursework.xcss.xcss.Multiplication;
import mdd.coursework.xcss.xcss.NumberLiteral;
import mdd.coursework.xcss.xcss.SizeLiteral;
import mdd.coursework.xcss.xcss.VariableDeclaration;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class XCSSTypeSystem extends XsemanticsRuntimeSystem {
  public static final String VALUETYPE = "mdd.coursework.xcss.typing.ValueType";
  
  public static final String TCSSSTYLEVALUE = "mdd.coursework.xcss.typing.TCSSStyleValue";
  
  public static final String TMULTIPLICATION = "mdd.coursework.xcss.typing.TMultiplication";
  
  public static final String TADDITION = "mdd.coursework.xcss.typing.TAddition";
  
  public static final String REASONABLETYPING = "mdd.coursework.xcss.typing.ReasonableTyping";
  
  private PolymorphicDispatcher<XCSSType> valueTypeDispatcher;
  
  private PolymorphicDispatcher<Result<XCSSType>> typeDispatcher;
  
  private PolymorphicDispatcher<Result<Boolean>> reasonableTypeDispatcher;
  
  public XCSSTypeSystem() {
    init();
  }
  
  public void init() {
    typeDispatcher = buildPolymorphicDispatcher1(
    	"typeImpl", 3, "|-", ":");
    reasonableTypeDispatcher = buildPolymorphicDispatcher1(
    	"reasonableTypeImpl", 4, "|-", "<:");
    valueTypeDispatcher = buildPolymorphicDispatcher(
    	"valueTypeImpl", 2);
  }
  
  public XCSSType valueType(final Expression exp) throws RuleFailedException {
    return valueType(null, exp);
  }
  
  public XCSSType valueType(final RuleApplicationTrace _trace_, final Expression exp) throws RuleFailedException {
    try {
    	return valueTypeInternal(_trace_, exp);
    } catch (Exception _e_valueType) {
    	throw extractRuleFailedException(_e_valueType);
    }
  }
  
  public Result<XCSSType> type(final Expression exp) {
    return type(new RuleEnvironment(), null, exp);
  }
  
  public Result<XCSSType> type(final RuleEnvironment _environment_, final Expression exp) {
    return type(_environment_, null, exp);
  }
  
  public Result<XCSSType> type(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Expression exp) {
    return getFromCache("type", _environment_, _trace_,
    	new XsemanticsProvider<Result<XCSSType>>(_environment_, _trace_) {
    		public Result<XCSSType> doGet() {
    			try {
    				return typeInternal(_environment_, _trace_, exp);
    			} catch (Exception _e_type) {
    				return resultForFailure(_e_type);
    			}
    		}
    	}, exp);
  }
  
  public Result<Boolean> reasonableType(final XCSSType left, final XCSSType right) {
    return reasonableType(new RuleEnvironment(), null, left, right);
  }
  
  public Result<Boolean> reasonableType(final RuleEnvironment _environment_, final XCSSType left, final XCSSType right) {
    return reasonableType(_environment_, null, left, right);
  }
  
  public Result<Boolean> reasonableType(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final XCSSType left, final XCSSType right) {
    try {
    	return reasonableTypeInternal(_environment_, _trace_, left, right);
    } catch (Exception _e_reasonableType) {
    	return resultForFailure(_e_reasonableType);
    }
  }
  
  public Boolean reasonableTypeSucceeded(final XCSSType left, final XCSSType right) {
    return reasonableTypeSucceeded(new RuleEnvironment(), null, left, right);
  }
  
  public Boolean reasonableTypeSucceeded(final RuleEnvironment _environment_, final XCSSType left, final XCSSType right) {
    return reasonableTypeSucceeded(_environment_, null, left, right);
  }
  
  public Boolean reasonableTypeSucceeded(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final XCSSType left, final XCSSType right) {
    try {
    	reasonableTypeInternal(_environment_, _trace_, left, right);
    	return true;
    } catch (Exception _e_reasonableType) {
    	return false;
    }
  }
  
  public Result<Boolean> checkZIndexValue(final CSSStyleDelacration sd) {
    return checkZIndexValue(null, sd);
  }
  
  public Result<Boolean> checkZIndexValue(final RuleApplicationTrace _trace_, final CSSStyleDelacration sd) {
    try {
    	return checkZIndexValueInternal(_trace_, sd);
    } catch (Exception _e_checkZIndexValue) {
    	return resultForFailure(_e_checkZIndexValue);
    }
  }
  
  protected Result<Boolean> checkZIndexValueInternal(final RuleApplicationTrace _trace_, final CSSStyleDelacration sd) throws RuleFailedException {
    boolean _equals = sd.getCssStyleKey().getValue().equals("z-index");
    if (_equals) {
      /* empty |- sd.cssStyleValue : var XCSSType type */
      CSSStyleValue _cssStyleValue = sd.getCssStyleValue();
      XCSSType type = null;
      Result<XCSSType> result = typeInternal(emptyEnvironment(), _trace_, _cssStyleValue);
      checkAssignableTo(result.getFirst(), XCSSType.class);
      type = (XCSSType) result.getFirst();
      
      /* empty |- type <: XCSSType.NUMBER */
      reasonableTypeInternal(emptyEnvironment(), _trace_, type, XCSSType.NUMBER);
    } else {
      /* true */
      if (!true) {
        sneakyThrowRuleFailedException("true");
      }
    }
    return new Result<Boolean>(true);
  }
  
  protected XCSSType valueTypeInternal(final RuleApplicationTrace _trace_, final Expression exp) {
    return getFromCache("valueTypeInternal", (RuleEnvironment)null, _trace_,
    	new XsemanticsProvider<XCSSType>(null, _trace_) {
    		public XCSSType doGet() {
    			try {
    				checkParamsNotNull(exp);
    				return valueTypeDispatcher.invoke(_trace_, exp);
    			} catch (Exception _e_valueType) {
    				sneakyThrowRuleFailedException(_e_valueType);
    				return null;
    			}
    		}
    	}, exp);
  }
  
  protected void valueTypeThrowException(final String _error, final String _issue, final Exception _ex, final Expression exp, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    throwRuleFailedException(_error, _issue, _ex, _errorInformations);
  }
  
  protected Result<XCSSType> typeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Expression exp) {
    return getFromCache("typeInternal", _environment_, _trace_,
    	new XsemanticsProvider<Result<XCSSType>>(_environment_, _trace_) {
    		public Result<XCSSType> doGet() {
    			try {
    				checkParamsNotNull(exp);
    				return typeDispatcher.invoke(_environment_, _trace_, exp);
    			} catch (Exception _e_type) {
    				sneakyThrowRuleFailedException(_e_type);
    				return null;
    			}
    		}
    	}, exp);
  }
  
  protected void typeThrowException(final String _error, final String _issue, final Exception _ex, final Expression exp, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String _stringRep = this.stringRep(exp);
    String _plus = ("cannot type " + _stringRep);
    String error = _plus;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected Result<Boolean> reasonableTypeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final XCSSType left, final XCSSType right) {
    try {
    	checkParamsNotNull(left, right);
    	return reasonableTypeDispatcher.invoke(_environment_, _trace_, left, right);
    } catch (Exception _e_reasonableType) {
    	sneakyThrowRuleFailedException(_e_reasonableType);
    	return null;
    }
  }
  
  protected void reasonableTypeThrowException(final String _error, final String _issue, final Exception _ex, final XCSSType left, final XCSSType right, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String _stringRep = this.stringRep(left);
    String _plus = (_stringRep + " is not a reasonable type ");
    String error = _plus;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected XCSSType valueTypeImpl(final RuleApplicationTrace _trace_, final CSSStyleValue exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final XCSSType _result_ = applyAuxFunValueType(_subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return auxFunName("valueType") + "(" + stringRep(exp)+ ")" + " = " + stringRep(_result_);
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyAuxFunValueType) {
    	valueTypeThrowException(auxFunName("valueType") + "(" + stringRep(exp)+ ")",
    		VALUETYPE,
    		e_applyAuxFunValueType, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected XCSSType applyAuxFunValueType(final RuleApplicationTrace _trace_, final CSSStyleValue exp) throws RuleFailedException {
    final CSSStyleValueLiteral value = exp.getValue();
    final VariableDeclaration variable = exp.getVariable();
    if ((value != null)) {
      NumberLiteral _number = value.getNumber();
      boolean _tripleNotEquals = (_number != null);
      if (_tripleNotEquals) {
        return XCSSType.NUMBER;
      } else {
        SizeLiteral _size = value.getSize();
        boolean _tripleNotEquals_1 = (_size != null);
        if (_tripleNotEquals_1) {
          return XCSSType.SIZE;
        } else {
          return XCSSType.OTHERS;
        }
      }
    } else {
      if ((variable != null)) {
        return this.valueTypeInternal(_trace_, variable.getValue());
      }
    }
    return null;
  }
  
  protected XCSSType valueTypeImpl(final RuleApplicationTrace _trace_, final Multiplication exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final XCSSType _result_ = applyAuxFunValueType(_subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return auxFunName("valueType") + "(" + stringRep(exp)+ ")" + " = " + stringRep(_result_);
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyAuxFunValueType) {
    	valueTypeThrowException(auxFunName("valueType") + "(" + stringRep(exp)+ ")",
    		VALUETYPE,
    		e_applyAuxFunValueType, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected XCSSType applyAuxFunValueType(final RuleApplicationTrace _trace_, final Multiplication exp) throws RuleFailedException {
    EList<Expression> _right = exp.getRight();
    Expression _left = exp.getLeft();
    final Iterable<Expression> values = Iterables.<Expression>concat(_right, Collections.<Expression>unmodifiableList(CollectionLiterals.<Expression>newArrayList(_left)));
    boolean hasSize = false;
    boolean hasOthers = false;
    for (final Expression value : values) {
      if ((value instanceof CSSStyleValue)) {
        XCSSType _valueType = this.valueTypeInternal(_trace_, value);
        boolean _tripleEquals = (_valueType == XCSSType.SIZE);
        if (_tripleEquals) {
          hasSize = true;
        } else {
          XCSSType _valueType_1 = this.valueTypeInternal(_trace_, value);
          boolean _tripleEquals_1 = (_valueType_1 == XCSSType.OTHERS);
          if (_tripleEquals_1) {
            hasOthers = true;
          }
        }
      } else {
        XCSSType _valueType_2 = this.valueTypeInternal(_trace_, ((Addition) value));
        boolean _tripleEquals_2 = (_valueType_2 == XCSSType.SIZE);
        if (_tripleEquals_2) {
          hasSize = true;
        } else {
          XCSSType _valueType_3 = this.valueTypeInternal(_trace_, ((Addition) value));
          boolean _tripleEquals_3 = (_valueType_3 == XCSSType.OTHERS);
          if (_tripleEquals_3) {
            hasOthers = true;
          }
        }
      }
    }
    if (hasOthers) {
      return XCSSType.OTHERS;
    } else {
      if (hasSize) {
        return XCSSType.SIZE;
      } else {
        return XCSSType.NUMBER;
      }
    }
  }
  
  protected XCSSType valueTypeImpl(final RuleApplicationTrace _trace_, final Addition exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final XCSSType _result_ = applyAuxFunValueType(_subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return auxFunName("valueType") + "(" + stringRep(exp)+ ")" + " = " + stringRep(_result_);
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyAuxFunValueType) {
    	valueTypeThrowException(auxFunName("valueType") + "(" + stringRep(exp)+ ")",
    		VALUETYPE,
    		e_applyAuxFunValueType, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected XCSSType applyAuxFunValueType(final RuleApplicationTrace _trace_, final Addition exp) throws RuleFailedException {
    Expression _left = exp.getLeft();
    XCSSType _valueType = this.valueTypeInternal(_trace_, ((Multiplication) _left));
    boolean _tripleEquals = (_valueType == XCSSType.NUMBER);
    if (_tripleEquals) {
      return XCSSType.NUMBER;
    } else {
      Expression _left_1 = exp.getLeft();
      XCSSType _valueType_1 = this.valueTypeInternal(_trace_, ((Multiplication) _left_1));
      boolean _tripleEquals_1 = (_valueType_1 == XCSSType.SIZE);
      if (_tripleEquals_1) {
        return XCSSType.SIZE;
      } else {
        return XCSSType.OTHERS;
      }
    }
  }
  
  protected Result<XCSSType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final CSSStyleValue exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<XCSSType> _result_ = applyRuleTCSSStyleValue(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TCSSStyleValue") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTCSSStyleValue) {
    	typeThrowException(ruleName("TCSSStyleValue") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "XCSSType",
    		TCSSSTYLEVALUE,
    		e_applyRuleTCSSStyleValue, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<XCSSType> applyRuleTCSSStyleValue(final RuleEnvironment G, final RuleApplicationTrace _trace_, final CSSStyleValue exp) throws RuleFailedException {
    XCSSType t = null; // output parameter
    t = this.valueTypeInternal(_trace_, exp);
    return new Result<XCSSType>(t);
  }
  
  protected Result<XCSSType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Multiplication exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<XCSSType> _result_ = applyRuleTMultiplication(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TMultiplication") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTMultiplication) {
    	typeThrowException(ruleName("TMultiplication") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "XCSSType",
    		TMULTIPLICATION,
    		e_applyRuleTMultiplication, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<XCSSType> applyRuleTMultiplication(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Multiplication exp) throws RuleFailedException {
    XCSSType t = null; // output parameter
    t = this.valueTypeInternal(_trace_, exp);
    return new Result<XCSSType>(t);
  }
  
  protected Result<XCSSType> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Addition exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<XCSSType> _result_ = applyRuleTAddition(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("TAddition") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleTAddition) {
    	typeThrowException(ruleName("TAddition") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "XCSSType",
    		TADDITION,
    		e_applyRuleTAddition, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<XCSSType> applyRuleTAddition(final RuleEnvironment G, final RuleApplicationTrace _trace_, final Addition exp) throws RuleFailedException {
    XCSSType t = null; // output parameter
    t = this.valueTypeInternal(_trace_, exp);
    return new Result<XCSSType>(t);
  }
  
  protected Result<Boolean> reasonableTypeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final XCSSType left, final XCSSType right) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<Boolean> _result_ = applyRuleReasonableTyping(G, _subtrace_, left, right);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("ReasonableTyping") + stringRepForEnv(G) + " |- " + stringRep(left) + " <: " + stringRep(right);
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleReasonableTyping) {
    	reasonableTypeThrowException(ruleName("ReasonableTyping") + stringRepForEnv(G) + " |- " + stringRep(left) + " <: " + stringRep(right),
    		REASONABLETYPING,
    		e_applyRuleReasonableTyping, left, right, new ErrorInformation[] {});
    	return null;
    }
  }
  
  protected Result<Boolean> applyRuleReasonableTyping(final RuleEnvironment G, final RuleApplicationTrace _trace_, final XCSSType left, final XCSSType right) throws RuleFailedException {
    /* left === right || left === XCSSType.OTHERS */
    if (!((left == right) || (left == XCSSType.OTHERS))) {
      sneakyThrowRuleFailedException("left === right || left === XCSSType.OTHERS");
    }
    return new Result<Boolean>(true);
  }
}
