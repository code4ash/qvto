package org.eclipse.qvto.examples.xtext.imperativeocl.cs2as;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.evaluation.Evaluator;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.PropertyId;
import org.eclipse.ocl.xtext.basecs.ElementCS;

public abstract class CS2ASTransformationExecutor extends AbstractTransformationExecutor
{

	private final List<CS2ASDiagnostic<ElementCS>> txErrors = new ArrayList<CS2ASDiagnostic<ElementCS>>(); 
	
	protected CS2ASTransformationExecutor(@NonNull Evaluator evaluator, @NonNull String[] modelNames,
			@Nullable PropertyId[] propertyIndex2propertyId, @Nullable ClassId[] classIndex2classId, @Nullable int[][] classIndex2allClassIndexes) {
		super(evaluator, modelNames, propertyIndex2propertyId, classIndex2classId, classIndex2allClassIndexes);
	}

	protected void throwNull(@NonNull EObject csObject, @NonNull String message) {
		throw new CS2ASException(csObject, message);
	}
	
	protected void handleLookupError(ElementCS sourceObject, String lookupHint) {
		handleError(sourceObject, "''" + lookupHint +"'' not found");
	}
	
	protected void handleLookupError(ElementCS sourceObject, EObject lookupHint) {
		handleError(sourceObject, "''" + lookupHint.toString() +"'' not found");
	}
	
	protected void handleLookupError(List<? extends ElementCS> sourceObjects, EObject lookupHint) {
		int hintPos = sourceObjects.indexOf(lookupHint);
		switch (hintPos)  {
			case -1:
			case 0:
					hintPos = 0; // For safety, the default will be the first one
					break;
			default:
					// We assume the element from which we report is the previous one of the lookupHint
					hintPos = hintPos -1;
		}
		
		handleError(sourceObjects.get(hintPos), "''" + lookupHint.toString() +"'' not found"); 
	}
	
	protected void handleError(ElementCS sourceObject, String errorMessage) {
		txErrors.add(new CS2ASDiagnostic<ElementCS>(sourceObject, errorMessage));
	}
	
	public List<CS2ASDiagnostic<ElementCS>> getErrors() {
		return txErrors;
	}
}