/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.ocl.examples.domain.elements.Nameable;
import org.eclipse.ocl.examples.pivot.util.Pivotable;
import org.eclipse.ocl.examples.xtext.base.baseCST.AnnotationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.AnnotationElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassifierCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.DataTypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.FeatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ModelElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.NamedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.NamespaceCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.OperationCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.ParameterCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.PivotableElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.RootPackageCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.StructuralFeatureCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TemplateableElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypedElementCS;
import org.eclipse.ocl.examples.xtext.base.util.VisitableCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.AbstractNameExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.InvocationExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.NamedExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.imperativeoclcs.ExpressionBlockCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.*;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ClassifierDefCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ClassifierProperty2CS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ClassifierPropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.CompleteSignatureCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ConfigPropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ConstructorCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ContextualPropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.DirectionKindCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ElementWithBody;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ExceptionCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ImperativeOperationCallExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.InitPartCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.LibraryImportCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.LocalPropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingBodyCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingCallExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingDeclarationCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingEndCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingExtensionCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingInitCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingMethodCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingModuleCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingQueryCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingRuleCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingSectionCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MappingSectionsCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MetamodelCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ModelTypeCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ModuleKindCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ModulePropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ModuleRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ModuleUsageCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.MultiplicityDefCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ObjectExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.OppositePropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.PackageRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ParameterDeclarationCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.PrimitiveTypeCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QVToClassCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QVToImportCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QVToLibraryCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QVToOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QVToParameterCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QvtoperationalcsPackage;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.RenameCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ResolveExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ResolveInExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ResolveOpArgsExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.ScopedNameCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.SimpleSignatureCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.StereotypeQualifierCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.TagCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.TopLevelCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.TransformationHeaderCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.TransformationRefineCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.TypeSpecCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.UnitCS;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * @see org.eclipse.qvto.examples.xtext.qvtoperational.qvtoperationalcs.QvtoperationalcsPackage
 * @generated
 */
public class QvtoperationalcsSwitch<T>
		extends Switch<T> {

	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static QvtoperationalcsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public QvtoperationalcsSwitch() {
		if (modelPackage == null) {
			modelPackage = QvtoperationalcsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QvtoperationalcsPackage.TOP_LEVEL_CS: {
				TopLevelCS topLevelCS = (TopLevelCS)theEObject;
				T result = caseTopLevelCS(topLevelCS);
				if (result == null) result = caseRootPackageCS(topLevelCS);
				if (result == null) result = casePackageCS(topLevelCS);
				if (result == null) result = caseRootCS(topLevelCS);
				if (result == null) result = caseNamespaceCS(topLevelCS);
				if (result == null) result = caseNamedElementCS(topLevelCS);
				if (result == null) result = caseModelElementCS(topLevelCS);
				if (result == null) result = caseNameable(topLevelCS);
				if (result == null) result = casePivotableElementCS(topLevelCS);
				if (result == null) result = caseElementCS(topLevelCS);
				if (result == null) result = casePivotable(topLevelCS);
				if (result == null) result = caseVisitableCS(topLevelCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.QV_TO_CLASS_CS: {
				QVToClassCS qvToClassCS = (QVToClassCS)theEObject;
				T result = caseQVToClassCS(qvToClassCS);
				if (result == null) result = caseClassCS(qvToClassCS);
				if (result == null) result = caseClassifierCS(qvToClassCS);
				if (result == null) result = caseNamespaceCS(qvToClassCS);
				if (result == null) result = caseNamedElementCS(qvToClassCS);
				if (result == null) result = caseTypeCS(qvToClassCS);
				if (result == null) result = caseTemplateableElementCS(qvToClassCS);
				if (result == null) result = caseModelElementCS(qvToClassCS);
				if (result == null) result = caseNameable(qvToClassCS);
				if (result == null) result = casePivotableElementCS(qvToClassCS);
				if (result == null) result = caseElementCS(qvToClassCS);
				if (result == null) result = casePivotable(qvToClassCS);
				if (result == null) result = caseVisitableCS(qvToClassCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.QV_TO_IMPORT_CS: {
				QVToImportCS qvToImportCS = (QVToImportCS)theEObject;
				T result = caseQVToImportCS(qvToImportCS);
				if (result == null) result = caseElementCS(qvToImportCS);
				if (result == null) result = caseVisitableCS(qvToImportCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.QV_TO_LIBRARY_CS: {
				QVToLibraryCS qvToLibraryCS = (QVToLibraryCS)theEObject;
				T result = caseQVToLibraryCS(qvToLibraryCS);
				if (result == null) result = caseMappingModuleCS(qvToLibraryCS);
				if (result == null) result = caseElementCS(qvToLibraryCS);
				if (result == null) result = caseVisitableCS(qvToLibraryCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.QV_TO_OPERATION_CS: {
				QVToOperationCS qvToOperationCS = (QVToOperationCS)theEObject;
				T result = caseQVToOperationCS(qvToOperationCS);
				if (result == null) result = caseOperationCS(qvToOperationCS);
				if (result == null) result = caseFeatureCS(qvToOperationCS);
				if (result == null) result = caseTemplateableElementCS(qvToOperationCS);
				if (result == null) result = caseTypedElementCS(qvToOperationCS);
				if (result == null) result = caseNamedElementCS(qvToOperationCS);
				if (result == null) result = caseModelElementCS(qvToOperationCS);
				if (result == null) result = caseNameable(qvToOperationCS);
				if (result == null) result = casePivotableElementCS(qvToOperationCS);
				if (result == null) result = caseElementCS(qvToOperationCS);
				if (result == null) result = casePivotable(qvToOperationCS);
				if (result == null) result = caseVisitableCS(qvToOperationCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.QV_TO_PARAMETER_CS: {
				QVToParameterCS qvToParameterCS = (QVToParameterCS)theEObject;
				T result = caseQVToParameterCS(qvToParameterCS);
				if (result == null) result = caseParameterCS(qvToParameterCS);
				if (result == null) result = caseTypedElementCS(qvToParameterCS);
				if (result == null) result = caseNamedElementCS(qvToParameterCS);
				if (result == null) result = caseModelElementCS(qvToParameterCS);
				if (result == null) result = caseNameable(qvToParameterCS);
				if (result == null) result = casePivotableElementCS(qvToParameterCS);
				if (result == null) result = caseElementCS(qvToParameterCS);
				if (result == null) result = casePivotable(qvToParameterCS);
				if (result == null) result = caseVisitableCS(qvToParameterCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.INIT_PART_CS: {
				InitPartCS initPartCS = (InitPartCS)theEObject;
				T result = caseInitPartCS(initPartCS);
				if (result == null) result = caseElementCS(initPartCS);
				if (result == null) result = caseVisitableCS(initPartCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.METAMODEL_CS: {
				MetamodelCS metamodelCS = (MetamodelCS)theEObject;
				T result = caseMetamodelCS(metamodelCS);
				if (result == null) result = casePackageCS(metamodelCS);
				if (result == null) result = caseNamespaceCS(metamodelCS);
				if (result == null) result = caseNamedElementCS(metamodelCS);
				if (result == null) result = caseModelElementCS(metamodelCS);
				if (result == null) result = caseNameable(metamodelCS);
				if (result == null) result = casePivotableElementCS(metamodelCS);
				if (result == null) result = caseElementCS(metamodelCS);
				if (result == null) result = casePivotable(metamodelCS);
				if (result == null) result = caseVisitableCS(metamodelCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.PRIMITIVE_TYPE_CS: {
				PrimitiveTypeCS primitiveTypeCS = (PrimitiveTypeCS)theEObject;
				T result = casePrimitiveTypeCS(primitiveTypeCS);
				if (result == null) result = caseDataTypeCS(primitiveTypeCS);
				if (result == null) result = caseClassifierCS(primitiveTypeCS);
				if (result == null) result = caseNamespaceCS(primitiveTypeCS);
				if (result == null) result = caseNamedElementCS(primitiveTypeCS);
				if (result == null) result = caseTypeCS(primitiveTypeCS);
				if (result == null) result = caseTemplateableElementCS(primitiveTypeCS);
				if (result == null) result = caseModelElementCS(primitiveTypeCS);
				if (result == null) result = caseNameable(primitiveTypeCS);
				if (result == null) result = casePivotableElementCS(primitiveTypeCS);
				if (result == null) result = caseElementCS(primitiveTypeCS);
				if (result == null) result = casePivotable(primitiveTypeCS);
				if (result == null) result = caseVisitableCS(primitiveTypeCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.CLASSIFIER_PROPERTY_CS: {
				ClassifierPropertyCS classifierPropertyCS = (ClassifierPropertyCS)theEObject;
				T result = caseClassifierPropertyCS(classifierPropertyCS);
				if (result == null) result = caseStructuralFeatureCS(classifierPropertyCS);
				if (result == null) result = caseFeatureCS(classifierPropertyCS);
				if (result == null) result = caseTypedElementCS(classifierPropertyCS);
				if (result == null) result = caseNamedElementCS(classifierPropertyCS);
				if (result == null) result = caseModelElementCS(classifierPropertyCS);
				if (result == null) result = caseNameable(classifierPropertyCS);
				if (result == null) result = casePivotableElementCS(classifierPropertyCS);
				if (result == null) result = caseElementCS(classifierPropertyCS);
				if (result == null) result = casePivotable(classifierPropertyCS);
				if (result == null) result = caseVisitableCS(classifierPropertyCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.STEREOTYPE_QUALIFIER_CS: {
				StereotypeQualifierCS stereotypeQualifierCS = (StereotypeQualifierCS)theEObject;
				T result = caseStereotypeQualifierCS(stereotypeQualifierCS);
				if (result == null) result = caseElementCS(stereotypeQualifierCS);
				if (result == null) result = caseVisitableCS(stereotypeQualifierCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.TAG_CS: {
				TagCS tagCS = (TagCS)theEObject;
				T result = caseTagCS(tagCS);
				if (result == null) result = caseAnnotationCS(tagCS);
				if (result == null) result = caseAnnotationElementCS(tagCS);
				if (result == null) result = caseNamedElementCS(tagCS);
				if (result == null) result = caseModelElementCS(tagCS);
				if (result == null) result = caseNameable(tagCS);
				if (result == null) result = casePivotableElementCS(tagCS);
				if (result == null) result = caseElementCS(tagCS);
				if (result == null) result = casePivotable(tagCS);
				if (result == null) result = caseVisitableCS(tagCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.EXCEPTION_CS: {
				ExceptionCS exceptionCS = (ExceptionCS)theEObject;
				T result = caseExceptionCS(exceptionCS);
				if (result == null) result = caseClassCS(exceptionCS);
				if (result == null) result = caseClassifierCS(exceptionCS);
				if (result == null) result = caseNamespaceCS(exceptionCS);
				if (result == null) result = caseNamedElementCS(exceptionCS);
				if (result == null) result = caseTypeCS(exceptionCS);
				if (result == null) result = caseTemplateableElementCS(exceptionCS);
				if (result == null) result = caseModelElementCS(exceptionCS);
				if (result == null) result = caseNameable(exceptionCS);
				if (result == null) result = casePivotableElementCS(exceptionCS);
				if (result == null) result = caseElementCS(exceptionCS);
				if (result == null) result = casePivotable(exceptionCS);
				if (result == null) result = caseVisitableCS(exceptionCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.CLASSIFIER_DEF_CS: {
				ClassifierDefCS classifierDefCS = (ClassifierDefCS)theEObject;
				T result = caseClassifierDefCS(classifierDefCS);
				if (result == null) result = caseElementCS(classifierDefCS);
				if (result == null) result = caseVisitableCS(classifierDefCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.CLASSIFIER_PROPERTY2_CS: {
				ClassifierProperty2CS classifierProperty2CS = (ClassifierProperty2CS)theEObject;
				T result = caseClassifierProperty2CS(classifierProperty2CS);
				if (result == null) result = caseLocalPropertyCS(classifierProperty2CS);
				if (result == null) result = caseModulePropertyCS(classifierProperty2CS);
				if (result == null) result = caseElementCS(classifierProperty2CS);
				if (result == null) result = caseVisitableCS(classifierProperty2CS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.COMPLETE_SIGNATURE_CS: {
				CompleteSignatureCS completeSignatureCS = (CompleteSignatureCS)theEObject;
				T result = caseCompleteSignatureCS(completeSignatureCS);
				if (result == null) result = caseElementCS(completeSignatureCS);
				if (result == null) result = caseVisitableCS(completeSignatureCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.CONFIG_PROPERTY_CS: {
				ConfigPropertyCS configPropertyCS = (ConfigPropertyCS)theEObject;
				T result = caseConfigPropertyCS(configPropertyCS);
				if (result == null) result = caseModulePropertyCS(configPropertyCS);
				if (result == null) result = caseElementCS(configPropertyCS);
				if (result == null) result = caseVisitableCS(configPropertyCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.CONSTRUCTOR_CS: {
				ConstructorCS constructorCS = (ConstructorCS)theEObject;
				T result = caseConstructorCS(constructorCS);
				if (result == null) result = caseMappingMethodCS(constructorCS);
				if (result == null) result = caseElementCS(constructorCS);
				if (result == null) result = caseVisitableCS(constructorCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.CONTEXTUAL_PROPERTY_CS: {
				ContextualPropertyCS contextualPropertyCS = (ContextualPropertyCS)theEObject;
				T result = caseContextualPropertyCS(contextualPropertyCS);
				if (result == null) result = caseModulePropertyCS(contextualPropertyCS);
				if (result == null) result = caseElementCS(contextualPropertyCS);
				if (result == null) result = caseVisitableCS(contextualPropertyCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.DIRECTION_KIND_CS: {
				DirectionKindCS directionKindCS = (DirectionKindCS)theEObject;
				T result = caseDirectionKindCS(directionKindCS);
				if (result == null) result = caseElementCS(directionKindCS);
				if (result == null) result = caseVisitableCS(directionKindCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.ELEMENT_WITH_BODY: {
				ElementWithBody elementWithBody = (ElementWithBody)theEObject;
				T result = caseElementWithBody(elementWithBody);
				if (result == null) result = caseElementCS(elementWithBody);
				if (result == null) result = caseVisitableCS(elementWithBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.IMPERATIVE_OPERATION_CALL_EXP_CS: {
				ImperativeOperationCallExpCS imperativeOperationCallExpCS = (ImperativeOperationCallExpCS)theEObject;
				T result = caseImperativeOperationCallExpCS(imperativeOperationCallExpCS);
				if (result == null) result = caseInvocationExpCS(imperativeOperationCallExpCS);
				if (result == null) result = caseNamedExpCS(imperativeOperationCallExpCS);
				if (result == null) result = caseAbstractNameExpCS(imperativeOperationCallExpCS);
				if (result == null) result = caseExpCS(imperativeOperationCallExpCS);
				if (result == null) result = caseModelElementCS(imperativeOperationCallExpCS);
				if (result == null) result = casePivotableElementCS(imperativeOperationCallExpCS);
				if (result == null) result = caseElementCS(imperativeOperationCallExpCS);
				if (result == null) result = casePivotable(imperativeOperationCallExpCS);
				if (result == null) result = caseVisitableCS(imperativeOperationCallExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.LIBRARY_IMPORT_CS: {
				LibraryImportCS libraryImportCS = (LibraryImportCS)theEObject;
				T result = caseLibraryImportCS(libraryImportCS);
				if (result == null) result = caseQVToImportCS(libraryImportCS);
				if (result == null) result = caseElementCS(libraryImportCS);
				if (result == null) result = caseVisitableCS(libraryImportCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.LOCAL_PROPERTY_CS: {
				LocalPropertyCS localPropertyCS = (LocalPropertyCS)theEObject;
				T result = caseLocalPropertyCS(localPropertyCS);
				if (result == null) result = caseModulePropertyCS(localPropertyCS);
				if (result == null) result = caseElementCS(localPropertyCS);
				if (result == null) result = caseVisitableCS(localPropertyCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.MAPPING_BODY_CS: {
				MappingBodyCS mappingBodyCS = (MappingBodyCS)theEObject;
				T result = caseMappingBodyCS(mappingBodyCS);
				if (result == null) result = caseMappingSectionCS(mappingBodyCS);
				if (result == null) result = caseElementWithBody(mappingBodyCS);
				if (result == null) result = caseElementCS(mappingBodyCS);
				if (result == null) result = caseVisitableCS(mappingBodyCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.MAPPING_CALL_EXP_CS: {
				MappingCallExpCS mappingCallExpCS = (MappingCallExpCS)theEObject;
				T result = caseMappingCallExpCS(mappingCallExpCS);
				if (result == null) result = caseImperativeOperationCallExpCS(mappingCallExpCS);
				if (result == null) result = caseInvocationExpCS(mappingCallExpCS);
				if (result == null) result = caseNamedExpCS(mappingCallExpCS);
				if (result == null) result = caseAbstractNameExpCS(mappingCallExpCS);
				if (result == null) result = caseExpCS(mappingCallExpCS);
				if (result == null) result = caseModelElementCS(mappingCallExpCS);
				if (result == null) result = casePivotableElementCS(mappingCallExpCS);
				if (result == null) result = caseElementCS(mappingCallExpCS);
				if (result == null) result = casePivotable(mappingCallExpCS);
				if (result == null) result = caseVisitableCS(mappingCallExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.MAPPING_DECLARATION_CS: {
				MappingDeclarationCS mappingDeclarationCS = (MappingDeclarationCS)theEObject;
				T result = caseMappingDeclarationCS(mappingDeclarationCS);
				if (result == null) result = caseElementCS(mappingDeclarationCS);
				if (result == null) result = caseVisitableCS(mappingDeclarationCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.MAPPING_END_CS: {
				MappingEndCS mappingEndCS = (MappingEndCS)theEObject;
				T result = caseMappingEndCS(mappingEndCS);
				if (result == null) result = caseMappingSectionCS(mappingEndCS);
				if (result == null) result = caseElementWithBody(mappingEndCS);
				if (result == null) result = caseElementCS(mappingEndCS);
				if (result == null) result = caseVisitableCS(mappingEndCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.MAPPING_EXTENSION_CS: {
				MappingExtensionCS mappingExtensionCS = (MappingExtensionCS)theEObject;
				T result = caseMappingExtensionCS(mappingExtensionCS);
				if (result == null) result = caseElementCS(mappingExtensionCS);
				if (result == null) result = caseVisitableCS(mappingExtensionCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.MAPPING_INIT_CS: {
				MappingInitCS mappingInitCS = (MappingInitCS)theEObject;
				T result = caseMappingInitCS(mappingInitCS);
				if (result == null) result = caseMappingSectionCS(mappingInitCS);
				if (result == null) result = caseElementWithBody(mappingInitCS);
				if (result == null) result = caseElementCS(mappingInitCS);
				if (result == null) result = caseVisitableCS(mappingInitCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.MAPPING_METHOD_CS: {
				MappingMethodCS mappingMethodCS = (MappingMethodCS)theEObject;
				T result = caseMappingMethodCS(mappingMethodCS);
				if (result == null) result = caseElementCS(mappingMethodCS);
				if (result == null) result = caseVisitableCS(mappingMethodCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.MAPPING_MODULE_CS: {
				MappingModuleCS mappingModuleCS = (MappingModuleCS)theEObject;
				T result = caseMappingModuleCS(mappingModuleCS);
				if (result == null) result = caseElementCS(mappingModuleCS);
				if (result == null) result = caseVisitableCS(mappingModuleCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.MAPPING_QUERY_CS: {
				MappingQueryCS mappingQueryCS = (MappingQueryCS)theEObject;
				T result = caseMappingQueryCS(mappingQueryCS);
				if (result == null) result = caseMappingMethodCS(mappingQueryCS);
				if (result == null) result = caseElementCS(mappingQueryCS);
				if (result == null) result = caseVisitableCS(mappingQueryCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.MAPPING_RULE_CS: {
				MappingRuleCS mappingRuleCS = (MappingRuleCS)theEObject;
				T result = caseMappingRuleCS(mappingRuleCS);
				if (result == null) result = caseMappingMethodCS(mappingRuleCS);
				if (result == null) result = caseElementCS(mappingRuleCS);
				if (result == null) result = caseVisitableCS(mappingRuleCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.MAPPING_SECTION_CS: {
				MappingSectionCS mappingSectionCS = (MappingSectionCS)theEObject;
				T result = caseMappingSectionCS(mappingSectionCS);
				if (result == null) result = caseElementWithBody(mappingSectionCS);
				if (result == null) result = caseElementCS(mappingSectionCS);
				if (result == null) result = caseVisitableCS(mappingSectionCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.MAPPING_SECTIONS_CS: {
				MappingSectionsCS mappingSectionsCS = (MappingSectionsCS)theEObject;
				T result = caseMappingSectionsCS(mappingSectionsCS);
				if (result == null) result = caseElementCS(mappingSectionsCS);
				if (result == null) result = caseVisitableCS(mappingSectionsCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.MODULE_KIND_CS: {
				ModuleKindCS moduleKindCS = (ModuleKindCS)theEObject;
				T result = caseModuleKindCS(moduleKindCS);
				if (result == null) result = caseElementCS(moduleKindCS);
				if (result == null) result = caseVisitableCS(moduleKindCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.MODULE_REF_CS: {
				ModuleRefCS moduleRefCS = (ModuleRefCS)theEObject;
				T result = caseModuleRefCS(moduleRefCS);
				if (result == null) result = caseElementCS(moduleRefCS);
				if (result == null) result = caseVisitableCS(moduleRefCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.MODEL_TYPE_CS: {
				ModelTypeCS modelTypeCS = (ModelTypeCS)theEObject;
				T result = caseModelTypeCS(modelTypeCS);
				if (result == null) result = caseElementWithBody(modelTypeCS);
				if (result == null) result = caseElementCS(modelTypeCS);
				if (result == null) result = caseVisitableCS(modelTypeCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.MODULE_PROPERTY_CS: {
				ModulePropertyCS modulePropertyCS = (ModulePropertyCS)theEObject;
				T result = caseModulePropertyCS(modulePropertyCS);
				if (result == null) result = caseElementCS(modulePropertyCS);
				if (result == null) result = caseVisitableCS(modulePropertyCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.MODULE_USAGE_CS: {
				ModuleUsageCS moduleUsageCS = (ModuleUsageCS)theEObject;
				T result = caseModuleUsageCS(moduleUsageCS);
				if (result == null) result = caseElementCS(moduleUsageCS);
				if (result == null) result = caseVisitableCS(moduleUsageCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.MULTIPLICITY_DEF_CS: {
				MultiplicityDefCS multiplicityDefCS = (MultiplicityDefCS)theEObject;
				T result = caseMultiplicityDefCS(multiplicityDefCS);
				if (result == null) result = caseElementCS(multiplicityDefCS);
				if (result == null) result = caseVisitableCS(multiplicityDefCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.OBJECT_EXP_CS: {
				ObjectExpCS objectExpCS = (ObjectExpCS)theEObject;
				T result = caseObjectExpCS(objectExpCS);
				if (result == null) result = caseExpressionBlockCS(objectExpCS);
				if (result == null) result = caseExpCS(objectExpCS);
				if (result == null) result = caseModelElementCS(objectExpCS);
				if (result == null) result = casePivotableElementCS(objectExpCS);
				if (result == null) result = caseElementCS(objectExpCS);
				if (result == null) result = casePivotable(objectExpCS);
				if (result == null) result = caseVisitableCS(objectExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.OPPOSITE_PROPERTY_CS: {
				OppositePropertyCS oppositePropertyCS = (OppositePropertyCS)theEObject;
				T result = caseOppositePropertyCS(oppositePropertyCS);
				if (result == null) result = caseElementCS(oppositePropertyCS);
				if (result == null) result = caseVisitableCS(oppositePropertyCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.PARAMETER_DECLARATION_CS: {
				ParameterDeclarationCS parameterDeclarationCS = (ParameterDeclarationCS)theEObject;
				T result = caseParameterDeclarationCS(parameterDeclarationCS);
				if (result == null) result = caseElementCS(parameterDeclarationCS);
				if (result == null) result = caseVisitableCS(parameterDeclarationCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.RENAME_CS: {
				RenameCS renameCS = (RenameCS)theEObject;
				T result = caseRenameCS(renameCS);
				if (result == null) result = caseElementCS(renameCS);
				if (result == null) result = caseVisitableCS(renameCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.RESOLVE_OP_ARGS_EXP_CS: {
				ResolveOpArgsExpCS resolveOpArgsExpCS = (ResolveOpArgsExpCS)theEObject;
				T result = caseResolveOpArgsExpCS(resolveOpArgsExpCS);
				if (result == null) result = caseElementCS(resolveOpArgsExpCS);
				if (result == null) result = caseVisitableCS(resolveOpArgsExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.PACKAGE_REF_CS: {
				PackageRefCS packageRefCS = (PackageRefCS)theEObject;
				T result = casePackageRefCS(packageRefCS);
				if (result == null) result = caseElementCS(packageRefCS);
				if (result == null) result = caseVisitableCS(packageRefCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.SCOPED_NAME_CS: {
				ScopedNameCS scopedNameCS = (ScopedNameCS)theEObject;
				T result = caseScopedNameCS(scopedNameCS);
				if (result == null) result = caseElementCS(scopedNameCS);
				if (result == null) result = caseVisitableCS(scopedNameCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.SIMPLE_SIGNATURE_CS: {
				SimpleSignatureCS simpleSignatureCS = (SimpleSignatureCS)theEObject;
				T result = caseSimpleSignatureCS(simpleSignatureCS);
				if (result == null) result = caseElementCS(simpleSignatureCS);
				if (result == null) result = caseVisitableCS(simpleSignatureCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.TRANSFORMATION_HEADER_CS: {
				TransformationHeaderCS transformationHeaderCS = (TransformationHeaderCS)theEObject;
				T result = caseTransformationHeaderCS(transformationHeaderCS);
				if (result == null) result = casePackageCS(transformationHeaderCS);
				if (result == null) result = caseClassCS(transformationHeaderCS);
				if (result == null) result = caseNamespaceCS(transformationHeaderCS);
				if (result == null) result = caseClassifierCS(transformationHeaderCS);
				if (result == null) result = caseNamedElementCS(transformationHeaderCS);
				if (result == null) result = caseTypeCS(transformationHeaderCS);
				if (result == null) result = caseTemplateableElementCS(transformationHeaderCS);
				if (result == null) result = caseModelElementCS(transformationHeaderCS);
				if (result == null) result = caseNameable(transformationHeaderCS);
				if (result == null) result = casePivotableElementCS(transformationHeaderCS);
				if (result == null) result = caseElementCS(transformationHeaderCS);
				if (result == null) result = casePivotable(transformationHeaderCS);
				if (result == null) result = caseVisitableCS(transformationHeaderCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.TRANSFORMATION_REFINE_CS: {
				TransformationRefineCS transformationRefineCS = (TransformationRefineCS)theEObject;
				T result = caseTransformationRefineCS(transformationRefineCS);
				if (result == null) result = caseElementCS(transformationRefineCS);
				if (result == null) result = caseVisitableCS(transformationRefineCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.TYPE_SPEC_CS: {
				TypeSpecCS typeSpecCS = (TypeSpecCS)theEObject;
				T result = caseTypeSpecCS(typeSpecCS);
				if (result == null) result = caseElementCS(typeSpecCS);
				if (result == null) result = caseVisitableCS(typeSpecCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.UNIT_CS: {
				UnitCS unitCS = (UnitCS)theEObject;
				T result = caseUnitCS(unitCS);
				if (result == null) result = caseElementCS(unitCS);
				if (result == null) result = caseVisitableCS(unitCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.RESOLVE_EXP_CS: {
				ResolveExpCS resolveExpCS = (ResolveExpCS)theEObject;
				T result = caseResolveExpCS(resolveExpCS);
				if (result == null) result = caseInvocationExpCS(resolveExpCS);
				if (result == null) result = caseNamedExpCS(resolveExpCS);
				if (result == null) result = caseAbstractNameExpCS(resolveExpCS);
				if (result == null) result = caseExpCS(resolveExpCS);
				if (result == null) result = caseModelElementCS(resolveExpCS);
				if (result == null) result = casePivotableElementCS(resolveExpCS);
				if (result == null) result = caseElementCS(resolveExpCS);
				if (result == null) result = casePivotable(resolveExpCS);
				if (result == null) result = caseVisitableCS(resolveExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QvtoperationalcsPackage.RESOLVE_IN_EXP_CS: {
				ResolveInExpCS resolveInExpCS = (ResolveInExpCS)theEObject;
				T result = caseResolveInExpCS(resolveInExpCS);
				if (result == null) result = caseResolveExpCS(resolveInExpCS);
				if (result == null) result = caseInvocationExpCS(resolveInExpCS);
				if (result == null) result = caseNamedExpCS(resolveInExpCS);
				if (result == null) result = caseAbstractNameExpCS(resolveInExpCS);
				if (result == null) result = caseExpCS(resolveInExpCS);
				if (result == null) result = caseModelElementCS(resolveInExpCS);
				if (result == null) result = casePivotableElementCS(resolveInExpCS);
				if (result == null) result = caseElementCS(resolveInExpCS);
				if (result == null) result = casePivotable(resolveInExpCS);
				if (result == null) result = caseVisitableCS(resolveInExpCS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Level CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Level CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopLevelCS(TopLevelCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QV To Class CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QV To Class CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQVToClassCS(QVToClassCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QV To Import CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QV To Import CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQVToImportCS(QVToImportCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QV To Library CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QV To Library CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQVToLibraryCS(QVToLibraryCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QV To Operation CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QV To Operation CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQVToOperationCS(QVToOperationCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QV To Parameter CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QV To Parameter CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQVToParameterCS(QVToParameterCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Import CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Import CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryImportCS(LibraryImportCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Property CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Property CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalPropertyCS(LocalPropertyCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Body CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Body CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingBodyCS(MappingBodyCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Call Exp CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Call Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingCallExpCS(MappingCallExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Declaration CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Declaration CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingDeclarationCS(MappingDeclarationCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping End CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping End CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingEndCS(MappingEndCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Extension CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Extension CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingExtensionCS(MappingExtensionCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Init CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Init CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingInitCS(MappingInitCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Method CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Method CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingMethodCS(MappingMethodCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Module CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Module CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingModuleCS(MappingModuleCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Query CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Query CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingQueryCS(MappingQueryCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Rule CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Rule CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingRuleCS(MappingRuleCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Section CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Section CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingSectionCS(MappingSectionCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Sections CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Sections CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingSectionsCS(MappingSectionsCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Kind CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Kind CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleKindCS(ModuleKindCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Ref CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Ref CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleRefCS(ModuleRefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Type CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Type CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelTypeCS(ModelTypeCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Property CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Property CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModulePropertyCS(ModulePropertyCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Usage CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Usage CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleUsageCS(ModuleUsageCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Def CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Def CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityDefCS(MultiplicityDefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Exp CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectExpCS(ObjectExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opposite Property CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opposite Property CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOppositePropertyCS(OppositePropertyCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Declaration CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Declaration CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDeclarationCS(ParameterDeclarationCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename CS</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameCS(RenameCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolve Op Args Exp CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolve Op Args Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolveOpArgsExpCS(ResolveOpArgsExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Ref CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Ref CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageRefCS(PackageRefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scoped Name CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scoped Name CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopedNameCS(ScopedNameCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Signature CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Signature CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleSignatureCS(SimpleSignatureCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Header CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Header CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationHeaderCS(TransformationHeaderCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Refine CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Refine CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationRefineCS(TransformationRefineCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Spec CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Spec CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSpecCS(TypeSpecCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit CS</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitCS(UnitCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolve Exp CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolve Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolveExpCS(ResolveExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolve In Exp CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolve In Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolveInExpCS(ResolveInExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Init Part CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Init Part CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitPartCS(InitPartCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodelCS(MetamodelCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeCS(PrimitiveTypeCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Property CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Property CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierPropertyCS(ClassifierPropertyCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype Qualifier CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype Qualifier CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotypeQualifierCS(StereotypeQualifierCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag CS</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagCS(TagCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionCS(ExceptionCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Def CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Def CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierDefCS(ClassifierDefCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier Property2 CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier Property2 CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierProperty2CS(ClassifierProperty2CS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complete Signature CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complete Signature CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompleteSignatureCS(CompleteSignatureCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Property CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Property CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigPropertyCS(ConfigPropertyCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorCS(ConstructorCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contextual Property CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contextual Property CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextualPropertyCS(ContextualPropertyCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direction Kind CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direction Kind CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectionKindCS(DirectionKindCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element With Body</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element With Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementWithBody(ElementWithBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imperative Operation Call Exp CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imperative Operation Call Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImperativeOperationCallExpCS(
			ImperativeOperationCallExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visitable CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visitable CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisitableCS(VisitableCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element CS</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementCS(ElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pivotable</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pivotable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePivotable(Pivotable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pivotable Element CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pivotable Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePivotableElementCS(PivotableElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElementCS(ModelElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootCS(RootCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Package CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Package CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootPackageCS(RootPackageCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nameable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameable(Nameable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElementCS(NamedElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElementCS(TypedElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceCS(NamespaceCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassCS(ClassCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package CS</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageCS(PackageCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type CS</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeCS(TypeCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Templateable Element CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Templateable Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateableElementCS(TemplateableElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifierCS(ClassifierCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeCS(DataTypeCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature CS</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureCS(FeatureCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationCS(OperationCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter CS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterCS(ParameterCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeatureCS(StructuralFeatureCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Element CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Element CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationElementCS(AnnotationElementCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationCS(AnnotationCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exp CS</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpCS(ExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Name Exp CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Name Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractNameExpCS(AbstractNameExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Exp CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedExpCS(NamedExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocation Exp CS</em>'.
	 * <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocation Exp CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvocationExpCS(InvocationExpCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Block CS</em>'.
	 * <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Block CS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionBlockCS(ExpressionBlockCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // QvtoperationalcsSwitch
