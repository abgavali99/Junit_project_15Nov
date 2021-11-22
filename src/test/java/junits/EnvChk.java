package junits;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class EnvChk implements ExecutionCondition{
	
	@Override
	public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
		
		String ExpEnv ="DEV";
		String ActEnv ="DEV";
		
		if(ExpEnv.equals (ActEnv)) {
			
			return ConditionEvaluationResult.enabled("The Env value are matching");
		}
		 
		    return ConditionEvaluationResult.disabled("The Env Value are not matching");
			
		}
	
	

}
