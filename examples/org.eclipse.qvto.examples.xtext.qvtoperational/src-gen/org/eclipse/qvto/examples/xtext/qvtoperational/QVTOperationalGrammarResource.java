/*******************************************************************************
 * Copyright (c) 2015, 2017 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************
 * This code is 100% auto-generated
 * from: E:\GIT\org.eclipse.qvto\examples..\..\examples\org.eclipse.qvto.examples.xtext.qvtoperational\src-gen\org\eclipse\qvto\examples\xtext\qvtoperational\QVTOperational.xtextbin
 * by: org.eclipse.ocl.examples.build.xtend.generateGrammar.xtend
 *
 * Do not edit it.
 *******************************************************************************/
package	org.eclipse.qvto.examples.xtext.qvtoperational;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.xtext.base.utilities.AbstractGrammarResource;
import org.eclipse.xtext.AbstractMetamodelDeclaration;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.ReferencedMetamodel;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

/**
 * QVTOperationalGrammarResource provides a programmatically initialized org.eclipse.qvto.examples.xtext.qvtoperational.QVTOperational Grammar model avoiding
 * the speed limitations of the pre-Xtext 2.4 *.xmi models and the binary incompatibilities between differing *.xtextbin versions.
 * <p>
 * The grammar is immutable and is available as static INSTANCE and GRAMMAR fields.
 */
@SuppressWarnings({"nls", "unused"})
public class QVTOperationalGrammarResource extends AbstractGrammarResource
{
	private static final @NonNull Grammar G_QVTOperational = createGrammar("org.eclipse.qvto.examples.xtext.qvtoperational.QVTOperational");
	private static final @NonNull Grammar G_ImperativeOCL = createGrammar("org.eclipse.qvto.examples.xtext.imperativeocl.ImperativeOCL");
	private static final @NonNull Grammar G_EssentialOCL = createGrammar("org.eclipse.ocl.xtext.essentialocl.EssentialOCL");
	private static final @NonNull Grammar G_Base = createGrammar("org.eclipse.ocl.xtext.base.Base");

	/**
	 *	The shared immutable instance of the org.eclipse.qvto.examples.xtext.qvtoperational.QVTOperational Grammar resource.
	 */
	public static final @NonNull QVTOperationalGrammarResource INSTANCE = new QVTOperationalGrammarResource();

	/**
	 *	The shared immutable instance of the org.eclipse.qvto.examples.xtext.qvtoperational.QVTOperational Grammar model.
	 */
	public static final @NonNull Grammar GRAMMAR = (Grammar)INSTANCE.getContents().get(0);

	/**
	 *	The name of the language supported by this grammar.
	 */
	public static final @NonNull String LANGUAGE_NAME = "org.eclipse.qvto.examples.xtext.qvtoperational.QVTOperational";

	protected QVTOperationalGrammarResource() {
		super(URI.createURI(LANGUAGE_NAME));
		List<EObject> contents = getContents();
		contents.add(_QVTOperational.initGrammar());
		contents.add(_ImperativeOCL.initGrammar());
		contents.add(_EssentialOCL.initGrammar());
		contents.add(_Base.initGrammar());
	}

	/*
	 * This class should be bound to org.eclipse.xtext.service.GrammarProvider.
	 */
	@Singleton
	public static class GrammarProvider extends org.eclipse.xtext.service.GrammarProvider
	{
		@Inject
		public GrammarProvider(Provider<XtextResourceSet> resourceSetProvider) {
			super(LANGUAGE_NAME, resourceSetProvider);
		}

		@Override
		public Grammar getGrammar(Object requestor) {
			return QVTOperationalGrammarResource.GRAMMAR;
		}
	}

	private static class _QVTOperational
	{
		private static final @NonNull ReferencedMetamodel MM = createReferencedMetamodel(org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.eINSTANCE, null); // http://www.eclipse.org/qvt/pivot/1.0/QVTOperationalCS
		private static final @NonNull ReferencedMetamodel MM_base = createReferencedMetamodel(org.eclipse.ocl.xtext.basecs.BaseCSPackage.eINSTANCE, "base"); // http://www.eclipse.org/ocl/2015/BaseCS
		private static final @NonNull ReferencedMetamodel MM_ecore = createReferencedMetamodel(org.eclipse.emf.ecore.EcorePackage.eINSTANCE, "ecore"); // http://www.eclipse.org/emf/2002/Ecore
		private static final @NonNull ReferencedMetamodel MM_essentialocl = createReferencedMetamodel(org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.eINSTANCE, "essentialocl"); // http://www.eclipse.org/ocl/2015/EssentialOCLCS
		private static final @NonNull ReferencedMetamodel MM_imperativeocl = createReferencedMetamodel(org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.eINSTANCE, "imperativeocl"); // http://www.eclipse.org/qvt/pivot/1.0/ImperativeOCLCS

		private static final @NonNull EnumRule ER_DirectionKindCS = createEnumRule("DirectionKindCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.DIRECTION_KIND_CS));
		private static final @NonNull EnumRule ER_ImportKindCS = createEnumRule("ImportKindCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.IMPORT_KIND_CS));
		private static final @NonNull EnumRule ER_MetamodelKindCS = createEnumRule("MetamodelKindCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.METAMODEL_KIND_CS));
		private static final @NonNull EnumRule ER_ModuleKindCS = createEnumRule("ModuleKindCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.MODULE_KIND_CS));

		private static void initEnumRules() {
			ER_DirectionKindCS.setAlternatives(createAlternatives(createEnumLiteral(createKeyword("in"), org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.DIRECTION_KIND_CS.getEEnumLiteral("in")), createEnumLiteral(createKeyword("out"), org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.DIRECTION_KIND_CS.getEEnumLiteral("out")), createEnumLiteral(createKeyword("inout"), org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.DIRECTION_KIND_CS.getEEnumLiteral("inout"))));
			ER_ImportKindCS.setAlternatives(createAlternatives(createEnumLiteral(createKeyword("access"), org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.IMPORT_KIND_CS.getEEnumLiteral("access")), createEnumLiteral(createKeyword("extends"), org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.IMPORT_KIND_CS.getEEnumLiteral("extension"))));
			ER_MetamodelKindCS.setAlternatives(createAlternatives(createEnumLiteral(createKeyword("metamodel"), org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.METAMODEL_KIND_CS.getEEnumLiteral("metamodel")), createEnumLiteral(createKeyword("package"), org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.METAMODEL_KIND_CS.getEEnumLiteral("package"))));
			ER_ModuleKindCS.setAlternatives(createAlternatives(createEnumLiteral(createKeyword("library"), org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.MODULE_KIND_CS.getEEnumLiteral("library")), createEnumLiteral(createKeyword("transformation"), org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.MODULE_KIND_CS.getEEnumLiteral("transformation"))));
		}

		private static final @NonNull ParserRule PR_ClassCS = createParserRule("ClassCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.CLASS_CS));
		private static final @NonNull ParserRule PR_ClassifierOperationCS = createParserRule("ClassifierOperationCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.QV_TO_OPERATION_CS));
		private static final @NonNull ParserRule PR_ClassifierPropertyCS = createParserRule("ClassifierPropertyCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.CLASSIFIER_PROPERTY_CS));
		private static final @NonNull ParserRule PR_CompoundOperationBodyCS = createParserRule("CompoundOperationBodyCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.OPERATION_BODY_CS));
		private static final @NonNull ParserRule PR_ConfigurationPropertyCS = createParserRule("ConfigurationPropertyCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.CONFIGURATION_PROPERTY_CS));
		private static final @NonNull ParserRule PR_ConstructorCS = createParserRule("ConstructorCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.CONSTRUCTOR_OPERATION_CS));
		private static final @NonNull ParserRule PR_ConstructorDeclarationCS = createParserRule("ConstructorDeclarationCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.CONSTRUCTOR_OPERATION_CS));
		private static final @NonNull ParserRule PR_ConstructorDefinitionCS = createParserRule("ConstructorDefinitionCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.CONSTRUCTOR_OPERATION_CS));
		private static final @NonNull ParserRule PR_ConstructorHeaderCS = createParserRule("ConstructorHeaderCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.CONSTRUCTOR_OPERATION_CS));
		private static final @NonNull ParserRule PR_ContextualPropertyCS = createParserRule("ContextualPropertyCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.CONTEXTUAL_PROPERTY_CS));
		private static final @NonNull ParserRule PR_DataTypeCS = createParserRule("DataTypeCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.DATA_TYPE_CS));
		private static final @NonNull ParserRule PR_EntryOperationCS = createParserRule("EntryOperationCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.ENTRY_OPERATION_CS));
		private static final @NonNull ParserRule PR_EnumerationCS = createParserRule("EnumerationCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.ENUMERATION_CS));
		private static final @NonNull ParserRule PR_EnumerationLiteralCS = createParserRule("EnumerationLiteralCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.ENUMERATION_LITERAL_CS));
		private static final @NonNull ParserRule PR_ExceptionCS = createParserRule("ExceptionCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.STRUCTURED_CLASS_CS));
		private static final @NonNull ParserRule PR_FeatureQualifier = createParserRule("FeatureQualifier", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_HelperCS = createParserRule("HelperCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.HELPER_OPERATION_CS));
		private static final @NonNull ParserRule PR_HelperCompoundDefinitionCS = createParserRule("HelperCompoundDefinitionCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.HELPER_OPERATION_CS));
		private static final @NonNull ParserRule PR_HelperDeclarationCS = createParserRule("HelperDeclarationCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.HELPER_OPERATION_CS));
		private static final @NonNull ParserRule PR_HelperDefinitionCS = createParserRule("HelperDefinitionCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.HELPER_OPERATION_CS));
		private static final @NonNull ParserRule PR_HelperHeaderCS = createParserRule("HelperHeaderCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.HELPER_OPERATION_CS));
		private static final @NonNull ParserRule PR_HelperSimpleDefinitionCS = createParserRule("HelperSimpleDefinitionCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.HELPER_OPERATION_CS));
		private static final @NonNull ParserRule PR_ImportCS = createParserRule("ImportCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.QV_TO_IMPORT_CS));
		private static final @NonNull ParserRule PR_InitPartCS = createParserRule("InitPartCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.INIT_PART_CS));
		private static final @NonNull ParserRule PR_LibraryCS = createParserRule("LibraryCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.QV_TO_LIBRARY_CS));
		private static final @NonNull ParserRule PR_LibraryDeclCS = createParserRule("LibraryDeclCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.QV_TO_LIBRARY_CS));
		private static final @NonNull ParserRule PR_LibraryDefCS = createParserRule("LibraryDefCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.QV_TO_LIBRARY_CS));
		private static final @NonNull ParserRule PR_LibraryHeaderCS = createParserRule("LibraryHeaderCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.QV_TO_LIBRARY_CS));
		private static final @NonNull ParserRule PR_LibraryQualifier = createParserRule("LibraryQualifier", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_MappingBodyCS = createParserRule("MappingBodyCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.MAPPING_BODY_CS));
		private static final @NonNull ParserRule PR_MappingCallExpCS = createParserRule("MappingCallExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.MAPPING_CALL_EXP_CS));
		private static final @NonNull ParserRule PR_MappingDeclarationCS = createParserRule("MappingDeclarationCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.MAPPING_OPERATION_CS));
		private static final @NonNull ParserRule PR_MappingDefinitionCS = createParserRule("MappingDefinitionCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.MAPPING_OPERATION_CS));
		private static final @NonNull ParserRule PR_MappingOperationCS = createParserRule("MappingOperationCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.MAPPING_OPERATION_CS));
		private static final @NonNull ParserRule PR_MappingOperationHeaderCS = createParserRule("MappingOperationHeaderCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.MAPPING_OPERATION_CS));
		private static final @NonNull ParserRule PR_MetamodelCS = createParserRule("MetamodelCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.METAMODEL_CS));
		private static final @NonNull ParserRule PR_ModelTypeCS = createParserRule("ModelTypeCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.MODEL_TYPE_CS));
		private static final @NonNull ParserRule PR_ModelTypeRefCS = createParserRule("ModelTypeRefCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.MODEL_TYPE_REF_CS));
		private static final @NonNull ParserRule PR_ModuleOperationCS = createParserRule("ModuleOperationCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.IMPERATIVE_OPERATION_CS));
		private static final @NonNull ParserRule PR_ModulePropertyCS = createParserRule("ModulePropertyCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.MODULE_PROPERTY_CS));
		private static final @NonNull ParserRule PR_ModuleRefCS = createParserRule("ModuleRefCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.MODULE_REF_CS));
		private static final @NonNull ParserRule PR_ModuleUsageCS = createParserRule("ModuleUsageCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.MODULE_USAGE_CS));
		private static final @NonNull ParserRule PR_MultiplicityCS = createParserRule("MultiplicityCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.MULTIPLICITY_BOUNDS_CS));
		private static final @NonNull ParserRule PR_ObjectExpCS = createParserRule("ObjectExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.OBJECT_EXP_CS));
		private static final @NonNull ParserRule PR_ObjectVariableCS = createParserRule("ObjectVariableCS", createTypeRef(MM_essentialocl, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.VARIABLE_CS));
		private static final @NonNull ParserRule PR_OperationQualifier = createParserRule("OperationQualifier", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_OperationRefCS = createParserRule("OperationRefCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.OPERATION_REF_CS));
		private static final @NonNull ParserRule PR_PackageRefCS = createParserRule("PackageRefCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.PACKAGE_REF_CS));
		private static final @NonNull ParserRule PR_ParameterCS = createParserRule("ParameterCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.PARAMETER_CS));
		private static final @NonNull ParserRule PR_ParameterDeclarationCS = createParserRule("ParameterDeclarationCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.PARAMETER_DECLARATION_CS));
		private static final @NonNull ParserRule PR_PathElement2CS = createParserRule("PathElement2CS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.PATH_ELEMENT2_CS));
		private static final @NonNull ParserRule PR_PathName2CS = createParserRule("PathName2CS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.PATH_NAME2_CS));
		private static final @NonNull ParserRule PR_QVToClassCS = createParserRule("QVToClassCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.QV_TO_CLASS_CS));
		private static final @NonNull ParserRule PR_ResolveByMappingExpCS = createParserRule("ResolveByMappingExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.RESOLVE_BY_MAPPING_EXP_CS));
		private static final @NonNull ParserRule PR_ResolveByTypeExpCS = createParserRule("ResolveByTypeExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.RESOLVE_BY_TYPE_EXP_CS));
		private static final @NonNull ParserRule PR_ResolveExpCS = createParserRule("ResolveExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.RESOLVE_EXP_CS));
		private static final @NonNull ParserRule PR_SimpleOperationBodyCS = createParserRule("SimpleOperationBodyCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.OPERATION_BODY_CS));
		private static final @NonNull ParserRule PR_StereotypeQualifierCS = createParserRule("StereotypeQualifierCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.STEREOTYPE_QUALIFIER_CS));
		private static final @NonNull ParserRule PR_TagCS = createParserRule("TagCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.TAG_CS));
		private static final @NonNull ParserRule PR_TopLevelCS = createParserRule("TopLevelCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.TOP_LEVEL_CS));
		private static final @NonNull ParserRule PR_TransformationCS = createParserRule("TransformationCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.TRANSFORMATION_CS));
		private static final @NonNull ParserRule PR_TransformationDeclCS = createParserRule("TransformationDeclCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.TRANSFORMATION_CS));
		private static final @NonNull ParserRule PR_TransformationDefCS = createParserRule("TransformationDefCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.TRANSFORMATION_CS));
		private static final @NonNull ParserRule PR_TransformationHeaderCS = createParserRule("TransformationHeaderCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.TRANSFORMATION_CS));
		private static final @NonNull ParserRule PR_TransformationQualifier = createParserRule("TransformationQualifier", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_TypeRefCS = createParserRule("TypeRefCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.TYPE_REF_CS));
		private static final @NonNull ParserRule PR_TypeSelectorCS = createParserRule("TypeSelectorCS", createTypeRef(MM_essentialocl, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.VARIABLE_CS));
		private static final @NonNull ParserRule PR_TypedMultiplicityRef2CS = createParserRule("TypedMultiplicityRef2CS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.TYPED_REF_CS));
		private static final @NonNull ParserRule PR_TypedRef2CS = createParserRule("TypedRef2CS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.TYPED_REF_CS));
		private static final @NonNull ParserRule PR_TypedTypeRef2CS = createParserRule("TypedTypeRef2CS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.TYPED_TYPE_REF2_CS));
		private static final @NonNull ParserRule PR_UnitPackageCS = createParserRule("UnitPackageCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.PACKAGE_CS));
		private static final @NonNull ParserRule PR_UnitRefCS = createParserRule("UnitRefCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.UNIT_REF_CS));
		private static final @NonNull ParserRule PR_UnitTypeCS = createParserRule("UnitTypeCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.TYPE_CS));

		private static void initParserRules() {
			PR_ClassCS.setAlternatives(createGroup(createAlternatives(createRuleCall(PR_DataTypeCS), createRuleCall(PR_ExceptionCS), createRuleCall(PR_QVToClassCS)), setCardinality("?", createKeyword(";"))));
			PR_ClassifierOperationCS.setAlternatives(createGroup(setCardinality("?", createAssignment("ownedStereotype", "=", createRuleCall(PR_StereotypeQualifierCS))), setCardinality("*", createAssignment("qualifiers", "+=", createRuleCall(PR_FeatureQualifier))), createAssignment("name", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName)), createKeyword("("), setCardinality("?", createGroup(createAssignment("ownedParameters", "+=", createRuleCall(PR_ParameterCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedParameters", "+=", createRuleCall(PR_ParameterCS)))))), createKeyword(")"), setCardinality("?", createGroup(createKeyword(":"), createAssignment("ownedType", "=", createRuleCall(PR_TypedMultiplicityRef2CS))))));
			PR_ClassifierPropertyCS.setAlternatives(createGroup(setCardinality("?", createAssignment("ownedStereotype", "=", createRuleCall(PR_StereotypeQualifierCS))), setCardinality("*", createAssignment("qualifiers", "+=", createRuleCall(PR_FeatureQualifier))), createAssignment("name", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName)), createKeyword(":"), createAssignment("ownedType", "=", createRuleCall(PR_TypedMultiplicityRef2CS)), setCardinality("?", createAssignment("default", "=", createRuleCall(_Base.TR_SINGLE_QUOTED_STRING))), setCardinality("?", createGroup(createKeyword("opposites"), setCardinality("?", createKeyword("~")), createAssignment("opposite", "=", createRuleCall(_Base.PR_Identifier))))));
			PR_CompoundOperationBodyCS.setAlternatives(createGroup(createAction(null, null, createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.OPERATION_BODY_CS)), createKeyword("{"), setCardinality("*", createAssignment("ownedContentExps", "+=", createRuleCall(_ImperativeOCL.PR_ExpressionStatementCS))), createKeyword("}")));
			PR_ConfigurationPropertyCS.setAlternatives(createGroup(createKeyword("configuration"), createKeyword("property"), createAssignment("ownedScopedName", "=", createRuleCall(PR_PathName2CS)), createKeyword(":"), createAssignment("ownedType", "=", createRuleCall(_ImperativeOCL.PR_TypeLiteralCS)), createKeyword("="), createAssignment("default", "=", createRuleCall(_ImperativeOCL.PR_StringLiteral))));
			PR_ConstructorCS.setAlternatives(createAlternatives(createRuleCall(PR_ConstructorDeclarationCS), createRuleCall(PR_ConstructorDefinitionCS)));
			PR_ConstructorDeclarationCS.setAlternatives(createGroup(createRuleCall(PR_ConstructorHeaderCS), createKeyword(";")));
			PR_ConstructorDefinitionCS.setAlternatives(createGroup(createRuleCall(PR_ConstructorHeaderCS), createAssignment("ownedBody", "=", createRuleCall(PR_CompoundOperationBodyCS)), setCardinality("?", createKeyword(";"))));
			PR_ConstructorHeaderCS.setAlternatives(createGroup(setCardinality("*", createAssignment("qualifiers", "+=", createRuleCall(PR_OperationQualifier))), createKeyword("constructor"), createAssignment("ownedScopedName", "=", createRuleCall(PR_PathName2CS)), createKeyword("("), setCardinality("?", createGroup(createAssignment("ownedParameters", "+=", createRuleCall(PR_ParameterCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedParameters", "+=", createRuleCall(PR_ParameterCS)))))), createKeyword(")")));
			PR_ContextualPropertyCS.setAlternatives(createGroup(createKeyword("intermediate"), createKeyword("property"), createAssignment("ownedScopedName", "=", createRuleCall(PR_PathName2CS)), createKeyword(":"), createAssignment("ownedType", "=", createRuleCall(PR_TypedMultiplicityRef2CS)), setCardinality("?", createGroup(createKeyword("="), createAssignment("ownedInitExp", "=", createRuleCall(_EssentialOCL.PR_ExpCS))))));
			PR_DataTypeCS.setAlternatives(createGroup(createAlternatives(createKeyword("datatype"), createGroup(createAction(null, null, createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.PRIMITIVE_TYPE_CS)), createKeyword("primitive"))), createAssignment("name", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName))));
			PR_EntryOperationCS.setAlternatives(createGroup(createKeyword("main"), createKeyword("("), createKeyword(")"), createAssignment("ownedBody", "=", createRuleCall(PR_CompoundOperationBodyCS)), setCardinality("?", createKeyword(";"))));
			PR_EnumerationCS.setAlternatives(createGroup(createKeyword("enum"), createAssignment("name", "=", createRuleCall(_Base.PR_Identifier)), createGroup(createKeyword("{"), createGroup(createAssignment("ownedLiterals", "+=", createRuleCall(PR_EnumerationLiteralCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedLiterals", "+=", createRuleCall(PR_EnumerationLiteralCS))))), createKeyword("}")), setCardinality("?", createKeyword(";"))));
			PR_EnumerationLiteralCS.setAlternatives(createAssignment("name", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName)));
			PR_ExceptionCS.setAlternatives(createGroup(createKeyword("exception"), createAssignment("name", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName)), setCardinality("?", createGroup(createKeyword("extends"), createGroup(createAssignment("ownedSuperTypes", "+=", createRuleCall(_Base.PR_TypedRefCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedSuperTypes", "+=", createRuleCall(_Base.PR_TypedRefCS)))))))));
			PR_FeatureQualifier.setAlternatives(createAlternatives(createKeyword("composes"), createKeyword("references"), createKeyword("readonly"), createKeyword("derived"), createKeyword("static")));
			PR_HelperCS.setAlternatives(createAlternatives(createRuleCall(PR_HelperDeclarationCS), createRuleCall(PR_HelperDefinitionCS)));
			PR_HelperCompoundDefinitionCS.setAlternatives(createGroup(createRuleCall(PR_HelperHeaderCS), createAssignment("ownedBody", "=", createRuleCall(PR_CompoundOperationBodyCS)), setCardinality("?", createKeyword(";"))));
			PR_HelperDeclarationCS.setAlternatives(createGroup(createRuleCall(PR_HelperHeaderCS), createKeyword(";")));
			PR_HelperDefinitionCS.setAlternatives(createAlternatives(createRuleCall(PR_HelperSimpleDefinitionCS), createRuleCall(PR_HelperCompoundDefinitionCS)));
			PR_HelperHeaderCS.setAlternatives(createGroup(setCardinality("*", createAssignment("qualifiers", "+=", createRuleCall(PR_OperationQualifier))), createAlternatives(createKeyword("helper"), createAssignment("isQuery", "?=", createKeyword("query"))), createAssignment("ownedScopedName", "=", createRuleCall(PR_PathName2CS)), createKeyword("{"), setCardinality("?", createGroup(createAssignment("ownedParameters", "+=", createRuleCall(PR_ParameterDeclarationCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedParameters", "+=", createRuleCall(PR_ParameterDeclarationCS)))))), createKeyword(")"), setCardinality("?", createGroup(createKeyword(":"), createAssignment("ownedResults", "+=", createRuleCall(PR_ParameterDeclarationCS)), createGroup(createKeyword(","), createAssignment("ownedResults", "+=", createRuleCall(PR_ParameterDeclarationCS)))))));
			PR_HelperSimpleDefinitionCS.setAlternatives(createGroup(createRuleCall(PR_HelperHeaderCS), createAssignment("ownedBody", "=", createRuleCall(PR_SimpleOperationBodyCS)), createKeyword(";")));
			PR_ImportCS.setAlternatives(createAlternatives(createGroup(createKeyword("import"), createAssignment("ownedUnitRef", "=", createRuleCall(PR_UnitRefCS)), createKeyword(";")), createGroup(createKeyword("from"), createAssignment("ownedUnitRef", "=", createRuleCall(PR_UnitRefCS)), createKeyword("import"), createAlternatives(createGroup(createAssignment("importedUnitElement", "+=", createRuleCall(_Base.PR_Identifier)), setCardinality("*", createGroup(createKeyword(","), createAssignment("importedUnitElement", "+=", createRuleCall(_Base.PR_Identifier))))), createAssignment("isAll", "?=", createKeyword("*"))), createKeyword(";"))));
			PR_InitPartCS.setAlternatives(createGroup(createAssignment("initOp", "=", createRuleCall(_ImperativeOCL.ER_InitOpCS)), createAssignment("ownedExp", "=", createRuleCall(_EssentialOCL.PR_ExpCS))));
			PR_LibraryCS.setAlternatives(createAlternatives(createRuleCall(PR_LibraryDeclCS), createRuleCall(PR_LibraryDefCS)));
			PR_LibraryDeclCS.setAlternatives(createGroup(createRuleCall(PR_LibraryHeaderCS), createKeyword(";")));
			PR_LibraryDefCS.setAlternatives(createGroup(createRuleCall(PR_LibraryHeaderCS), createKeyword("{"), setCardinality("*", createAlternatives(createAssignment("ownedProperties", "+=", createRuleCall(PR_ModulePropertyCS)), createAssignment("ownedOperations", "+=", createRuleCall(PR_ModuleOperationCS)), createAssignment("ownedAnnotations", "+=", createRuleCall(PR_TagCS)))), createKeyword("}"), setCardinality("?", createKeyword(";"))));
			PR_LibraryHeaderCS.setAlternatives(createGroup(setCardinality("*", createAssignment("ownedQualifiers", "+=", createRuleCall(PR_LibraryQualifier))), createKeyword("library"), createAssignment("name", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName)), createKeyword("("), createAssignment("ownedParameters", "+=", createRuleCall(PR_ModelTypeRefCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedParameters", "+=", createRuleCall(PR_ModelTypeRefCS)))), createKeyword(")"), setCardinality("*", createAssignment("ownedModuleUsages", "+=", createRuleCall(PR_ModuleUsageCS)))));
			PR_LibraryQualifier.setAlternatives(createKeyword("blackbox"));
			PR_MappingBodyCS.setAlternatives(createGroup(createAction(null, null, createTypeRef(MM, org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage.Literals.MAPPING_BODY_CS)), setCardinality("?", createGroup(createKeyword("init"), createKeyword("{"), createAssignment("ownedInitExps", "+=", createRuleCall(_EssentialOCL.PR_ExpCS)), createKeyword("}"))), createAlternatives(createGroup(setCardinality("?", createAssignment("hasPopulationKeyword", "?=", createKeyword("population"))), createKeyword("{"), setCardinality("*", createAssignment("ownedContentExps", "+=", createRuleCall(_EssentialOCL.PR_ExpCS))), createKeyword("}")), createAssignment("ownedContentExps", "+=", createRuleCall(_EssentialOCL.PR_ExpCS))), setCardinality("?", createGroup(createKeyword("end"), createKeyword("{"), createAssignment("ownedEndExps", "+=", createRuleCall(_EssentialOCL.PR_ExpCS)), createKeyword("}")))));
			PR_MappingCallExpCS.setAlternatives(createGroup(createAlternatives(createKeyword("map"), createAssignment("isStrict", "?=", createKeyword("xmap"))), createAssignment("ownedPathName", "=", createRuleCall(_Base.PR_PathNameCS)), createAssignment("ownedRoundBracketedClause", "=", createRuleCall(_EssentialOCL.PR_RoundBracketedClauseCS))));
			PR_MappingDeclarationCS.setAlternatives(createGroup(createRuleCall(PR_MappingOperationHeaderCS), createKeyword(";")));
			PR_MappingDefinitionCS.setAlternatives(createGroup(createRuleCall(PR_MappingOperationHeaderCS), createKeyword("{"), createAssignment("ownedBody", "=", createRuleCall(PR_MappingBodyCS)), createKeyword("}")));
			PR_MappingOperationCS.setAlternatives(createAlternatives(createRuleCall(PR_MappingDeclarationCS), createRuleCall(PR_MappingDefinitionCS)));
			PR_MappingOperationHeaderCS.setAlternatives(createGroup(setCardinality("*", createAssignment("qualifiers", "+=", createRuleCall(PR_OperationQualifier))), createKeyword("mapping"), setCardinality("?", createAssignment("direction", "=", createRuleCall(ER_DirectionKindCS))), createAssignment("ownedScopedName", "=", createRuleCall(PR_PathName2CS)), createKeyword("("), setCardinality("?", createGroup(createAssignment("ownedParameters", "+=", createRuleCall(PR_ParameterDeclarationCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedParameters", "+=", createRuleCall(PR_ParameterDeclarationCS)))))), createKeyword(")"), setCardinality("?", createGroup(createKeyword(":"), createAssignment("ownedResults", "+=", createRuleCall(PR_ParameterDeclarationCS)), createGroup(createKeyword(","), createAssignment("ownedResults", "+=", createRuleCall(PR_ParameterDeclarationCS))))), createUnorderedGroup(setCardinality("?", createGroup(createKeyword("inherits"), createAssignment("ownedInheritRefs", "+=", createRuleCall(PR_OperationRefCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedInheritRefs", "+=", createRuleCall(PR_OperationRefCS)))))), setCardinality("?", createGroup(createKeyword("merges"), createAssignment("ownedMergeRefs", "+=", createRuleCall(PR_OperationRefCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedMergeRefs", "+=", createRuleCall(PR_OperationRefCS)))))), setCardinality("?", createGroup(createKeyword("disjuncts"), createAssignment("ownedDisjunctRefs", "+=", createRuleCall(PR_OperationRefCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedDisjunctRefs", "+=", createRuleCall(PR_OperationRefCS)))))), setCardinality("?", createGroup(createKeyword("refines"), createAssignment("ownedRefinedRule", "=", createRuleCall(PR_PathName2CS))))), setCardinality("?", createGroup(createKeyword("when"), createKeyword("{"), setCardinality("*", createAssignment("ownedWhenExps", "+=", createRuleCall(_EssentialOCL.PR_ExpCS))), createKeyword("}"))), setCardinality("?", createGroup(createKeyword("where"), createKeyword("{"), setCardinality("*", createAssignment("ownedWhereExps", "+=", createRuleCall(_ImperativeOCL.PR_ExpressionBlockCS))), createKeyword("}")))));
			PR_MetamodelCS.setAlternatives(createGroup(createAssignment("metamodelKind", "=", createRuleCall(ER_MetamodelKindCS)), createAssignment("name", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName)), createKeyword("{"), setCardinality("*", createAlternatives(createAssignment("ownedClasses", "+=", createRuleCall(PR_ClassCS)), createAssignment("ownedClasses", "+=", createRuleCall(PR_EnumerationCS)), createAssignment("ownedAnnotations", "+=", createRuleCall(PR_TagCS)))), createKeyword("}"), setCardinality("?", createKeyword(";"))));
			PR_ModelTypeCS.setAlternatives(createGroup(createKeyword("modeltype"), createAssignment("name", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName)), setCardinality("?", createAssignment("complianceKind", "=", createRuleCall(_ImperativeOCL.PR_StringLiteral))), createKeyword("uses"), createAssignment("ownedPackageRefs", "+=", createRuleCall(PR_PackageRefCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedPackageRefs", "+=", createRuleCall(PR_PackageRefCS)))), setCardinality("?", createGroup(createKeyword("where"), createKeyword("{"), setCardinality("?", createGroup(createAssignment("ownedConditions", "+=", createRuleCall(_EssentialOCL.PR_ExpCS)), setCardinality("*", createGroup(createKeyword(";"), createAssignment("ownedConditions", "+=", createRuleCall(_EssentialOCL.PR_ExpCS)))), setCardinality("?", createKeyword(";")))), createKeyword("}"))), createKeyword(";")));
			PR_ModelTypeRefCS.setAlternatives(createAssignment("ownedType", "=", createRuleCall(PR_TypedTypeRef2CS)));
			PR_ModuleOperationCS.setAlternatives(createAlternatives(createRuleCall(PR_EntryOperationCS), createRuleCall(PR_MappingOperationCS), createRuleCall(PR_HelperCS), createRuleCall(PR_ConstructorCS)));
			PR_ModulePropertyCS.setAlternatives(createAlternatives(createRuleCall(PR_ConfigurationPropertyCS), createRuleCall(PR_ContextualPropertyCS)));
			PR_ModuleRefCS.setAlternatives(createGroup(createAssignment("ownedScopedName", "=", createRuleCall(PR_PathName2CS)), setCardinality("?", createGroup(createKeyword("("), createAssignment("ownedParameters", "+=", createRuleCall(PR_ParameterDeclarationCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedParameters", "+=", createRuleCall(PR_ParameterDeclarationCS)))), createKeyword(")")))));
			PR_ModuleUsageCS.setAlternatives(createGroup(createAssignment("importKind", "=", createRuleCall(ER_ImportKindCS)), setCardinality("?", createAssignment("moduleKind", "=", createRuleCall(ER_ModuleKindCS))), createAssignment("ownedModuleRefs", "+=", createRuleCall(PR_ModuleRefCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedModuleRefs", "+=", createRuleCall(PR_ModuleRefCS))))));
			PR_MultiplicityCS.setAlternatives(createGroup(createKeyword("["), setCardinality("?", createGroup(createAssignment("lowerBound", "=", createRuleCall(_Base.PR_LOWER)), createKeyword("..."))), createAssignment("upperBound", "=", createRuleCall(_Base.PR_UPPER)), createKeyword("]")));
			PR_ObjectExpCS.setAlternatives(createGroup(createKeyword("object"), setCardinality("?", createGroup(createKeyword("("), createAssignment("ownedIterator", "=", createRuleCall(_ImperativeOCL.PR_VarDeclarationNoInitCS)), createKeyword(")"))), createAssignment("ownedVariable", "=", createRuleCall(PR_ObjectVariableCS)), setCardinality("?", createGroup(createKeyword("@"), createAssignment("ownedExtentRef", "=", createRuleCall(_ImperativeOCL.PR_ExtentRefCS)))), createKeyword("{"), setCardinality("*", createAssignment("ownedExps", "+=", createRuleCall(_EssentialOCL.PR_ExpCS))), createKeyword("}")));
			PR_ObjectVariableCS.setAlternatives(createAlternatives(createGroup(createAssignment("name", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName)), createKeyword(":"), setCardinality("?", createAssignment("ownedType", "=", createRuleCall(PR_TypedTypeRef2CS)))), createAssignment("ownedType", "=", createRuleCall(PR_TypedTypeRef2CS))));
			PR_OperationQualifier.setAlternatives(createAlternatives(createKeyword("blackbox"), createKeyword("abstract"), createKeyword("static")));
			PR_OperationRefCS.setAlternatives(createAssignment("ownedPathName", "=", createRuleCall(PR_PathName2CS)));
			PR_PackageRefCS.setAlternatives(createAlternatives(createAssignment("uri", "=", createRuleCall(_ImperativeOCL.PR_StringLiteral)), createGroup(createAssignment("ownedScopedName", "=", createRuleCall(PR_PathName2CS)), createKeyword("("), createAssignment("uri", "=", createRuleCall(_ImperativeOCL.PR_StringLiteral)), createKeyword(")"))));
			PR_ParameterCS.setAlternatives(createGroup(createAssignment("name", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName)), setCardinality("?", createGroup(createKeyword(":"), createAssignment("ownedType", "=", createRuleCall(PR_TypedMultiplicityRef2CS))))));
			PR_ParameterDeclarationCS.setAlternatives(createGroup(setCardinality("?", createAssignment("direction", "=", createRuleCall(ER_DirectionKindCS))), createAssignment("name", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName)), setCardinality("?", createGroup(createKeyword(":"), createAssignment("ownedType", "=", createRuleCall(PR_TypedMultiplicityRef2CS)))), setCardinality("?", createAssignment("ownedInitPart", "=", createRuleCall(PR_InitPartCS)))));
			PR_PathElement2CS.setAlternatives(createAssignment("name", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName)));
			PR_PathName2CS.setAlternatives(createGroup(createAssignment("ownedPathElements2", "+=", createRuleCall(PR_PathElement2CS)), setCardinality("*", createGroup(createKeyword("::"), createAssignment("ownedPathElements2", "+=", createRuleCall(PR_PathElement2CS))))));
			PR_QVToClassCS.setAlternatives(createGroup(setCardinality("?", createAssignment("isIntermediate", "?=", createKeyword("intermediate"))), createKeyword("class"), createAssignment("name", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName)), setCardinality("?", createGroup(createKeyword("extends"), createGroup(createAssignment("ownedSuperTypes", "+=", createRuleCall(_Base.PR_TypedRefCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedSuperTypes", "+=", createRuleCall(_Base.PR_TypedRefCS))))))), setCardinality("?", createGroup(createKeyword("{"), setCardinality("+", createGroup(createAlternatives(createAssignment("ownedProperties", "+=", createRuleCall(PR_ClassifierPropertyCS)), createAssignment("ownedOperations", "+=", createRuleCall(PR_ClassifierOperationCS)), createAssignment("ownedAnnotations", "+=", createRuleCall(PR_TagCS))), createKeyword(";"))), createKeyword("}")))));
			PR_ResolveByMappingExpCS.setAlternatives(createGroup(setCardinality("?", createAssignment("isDeferred", "?=", createKeyword("late"))), createAssignment("name", "=", createAlternatives(createKeyword("resolveIn"), createKeyword("resolveoneIn"), createKeyword("resolveinvIn"), createKeyword("resolveinvoneIn"))), createKeyword("("), createAssignment("ownedMappingRef", "=", createRuleCall(PR_OperationRefCS)), setCardinality("?", createGroup(createKeyword(","), createAssignment("ownedTarget", "=", createRuleCall(_ImperativeOCL.PR_VarDeclarationNoInitCS)), createKeyword("|"), createAssignment("ownedCondition", "=", createRuleCall(_EssentialOCL.PR_ExpCS)))), createKeyword(")")));
			PR_ResolveByTypeExpCS.setAlternatives(createGroup(setCardinality("?", createAssignment("isDeferred", "?=", createKeyword("late"))), createAssignment("name", "=", createAlternatives(createKeyword("resolve"), createKeyword("resolveone"), createKeyword("resolveinv"), createKeyword("resolveinvone"))), createKeyword("("), createAssignment("ownedTarget", "=", createRuleCall(PR_TypeSelectorCS)), setCardinality("?", createGroup(createKeyword("|"), createAssignment("ownedCondition", "=", createRuleCall(_EssentialOCL.PR_ExpCS)))), createKeyword(")")));
			PR_ResolveExpCS.setAlternatives(createAlternatives(createRuleCall(PR_ResolveByTypeExpCS), createRuleCall(PR_ResolveByMappingExpCS)));
			PR_SimpleOperationBodyCS.setAlternatives(createGroup(createKeyword("="), createAssignment("ownedContentExps", "+=", createRuleCall(_EssentialOCL.PR_ExpCS))));
			PR_StereotypeQualifierCS.setAlternatives(createGroup(createKeyword("<<"), createGroup(createAssignment("stereotypes", "+=", createRuleCall(_Base.PR_Identifier)), setCardinality("*", createGroup(createKeyword(","), createAssignment("stereotypes", "+=", createRuleCall(_Base.PR_Identifier))))), createKeyword(">>")));
			PR_TagCS.setAlternatives(createGroup(createKeyword("tag"), setCardinality("?", createAssignment("name", "=", createAlternatives(createRuleCall(_EssentialOCL.PR_UnrestrictedName), createRuleCall(_Base.TR_SINGLE_QUOTED_STRING)))), createAssignment("ownedElementPath", "=", createRuleCall(PR_PathName2CS)), setCardinality("?", createGroup(createKeyword("="), createAssignment("ownedExpression", "=", createRuleCall(_EssentialOCL.PR_ExpCS)))), createKeyword(";")));
			PR_TopLevelCS.setAlternatives(createGroup(setCardinality("*", createAssignment("ownedImports", "+=", createRuleCall(PR_ImportCS))), setCardinality("*", createAlternatives(createAssignment("ownedPackages", "+=", createRuleCall(PR_UnitPackageCS)), createAssignment("ownedTypes", "+=", createRuleCall(PR_UnitTypeCS)), createAssignment("ownedAnnotations", "+=", createRuleCall(PR_TagCS))))));
			PR_TransformationCS.setAlternatives(createAlternatives(createRuleCall(PR_TransformationDeclCS), createRuleCall(PR_TransformationDefCS)));
			PR_TransformationDeclCS.setAlternatives(createGroup(createRuleCall(PR_TransformationHeaderCS), createKeyword(";")));
			PR_TransformationDefCS.setAlternatives(createGroup(createRuleCall(PR_TransformationHeaderCS), createKeyword("{"), setCardinality("*", createAlternatives(createAssignment("ownedProperties", "+=", createRuleCall(PR_ModulePropertyCS)), createAssignment("ownedOperations", "+=", createRuleCall(PR_ModuleOperationCS)), createAssignment("ownedAnnotations", "+=", createRuleCall(PR_TagCS)))), createKeyword("}"), setCardinality("?", createKeyword(";"))));
			PR_TransformationHeaderCS.setAlternatives(createGroup(setCardinality("*", createAssignment("ownedQualifiers", "+=", createRuleCall(PR_TransformationQualifier))), createKeyword("transformation"), createAssignment("name", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName)), createKeyword("("), createAssignment("ownedParameters", "+=", createRuleCall(PR_ParameterDeclarationCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedParameters", "+=", createRuleCall(PR_ParameterDeclarationCS)))), createKeyword(")"), setCardinality("*", createAssignment("ownedModuleUsages", "+=", createRuleCall(PR_ModuleUsageCS))), setCardinality("?", createGroup(createKeyword("refines"), createAssignment("ownedRefinedModule", "=", createRuleCall(PR_ModuleRefCS))))));
			PR_TransformationQualifier.setAlternatives(createAlternatives(createKeyword("blackbox"), createKeyword("abstract"), createKeyword("static")));
			PR_TypeRefCS.setAlternatives(createRuleCall(PR_TypedRef2CS));
			PR_TypeSelectorCS.setAlternatives(createGroup(setCardinality("?", createGroup(createAssignment("name", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName)), createKeyword(":"))), createAssignment("ownedType", "=", createRuleCall(PR_TypedRef2CS))));
			PR_TypedMultiplicityRef2CS.setAlternatives(createGroup(createRuleCall(PR_TypedRef2CS), setCardinality("?", createAssignment("ownedMultiplicity", "=", createRuleCall(PR_MultiplicityCS)))));
			PR_TypedRef2CS.setAlternatives(createAlternatives(createRuleCall(_ImperativeOCL.PR_TypeLiteralCS), createRuleCall(PR_TypedTypeRef2CS)));
			PR_TypedTypeRef2CS.setAlternatives(createGroup(createAssignment("ownedPathName", "=", createRuleCall(PR_PathName2CS)), setCardinality("?", createGroup(createKeyword("("), createAssignment("ownedBinding", "=", createRuleCall(_Base.PR_TemplateBindingCS)), createKeyword(")"))), setCardinality("?", createGroup(createKeyword("@"), createAssignment("extentLocation", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName))))));
			PR_UnitPackageCS.setAlternatives(createRuleCall(PR_MetamodelCS));
			PR_UnitRefCS.setAlternatives(createGroup(createAssignment("segment", "+=", createRuleCall(_Base.PR_Identifier)), setCardinality("*", createGroup(createKeyword("."), createAssignment("segment", "+=", createRuleCall(_Base.PR_Identifier))))));
			PR_UnitTypeCS.setAlternatives(createAlternatives(createRuleCall(PR_ModelTypeCS), createRuleCall(PR_TransformationCS), createRuleCall(PR_LibraryCS)));
		}

		private static @NonNull Grammar initGrammar() {
			initEnumRules();
			initParserRules();
			Grammar grammar = G_QVTOperational;
			{
				List<AbstractMetamodelDeclaration> metamodelDeclarations = grammar.getMetamodelDeclarations();
				metamodelDeclarations.add(MM);
				metamodelDeclarations.add(MM_ecore);
				metamodelDeclarations.add(MM_base);
				metamodelDeclarations.add(MM_essentialocl);
				metamodelDeclarations.add(MM_imperativeocl);
			}
			{
				List<AbstractRule> rules = grammar.getRules();
				rules.add(PR_TopLevelCS);
				rules.add(ER_MetamodelKindCS);
				rules.add(ER_DirectionKindCS);
				rules.add(ER_ImportKindCS);
				rules.add(ER_ModuleKindCS);
				rules.add(PR_TransformationQualifier);
				rules.add(PR_LibraryQualifier);
				rules.add(PR_FeatureQualifier);
				rules.add(PR_OperationQualifier);
				rules.add(PR_MultiplicityCS);
				rules.add(PR_PathName2CS);
				rules.add(PR_PathElement2CS);
				rules.add(PR_TypedMultiplicityRef2CS);
				rules.add(PR_TypeRefCS);
				rules.add(PR_TypedRef2CS);
				rules.add(PR_TypedTypeRef2CS);
				rules.add(PR_ClassCS);
				rules.add(PR_ClassifierOperationCS);
				rules.add(PR_ClassifierPropertyCS);
				rules.add(PR_CompoundOperationBodyCS);
				rules.add(PR_ConfigurationPropertyCS);
				rules.add(PR_ContextualPropertyCS);
				rules.add(PR_ConstructorCS);
				rules.add(PR_ConstructorDeclarationCS);
				rules.add(PR_ConstructorDefinitionCS);
				rules.add(PR_ConstructorHeaderCS);
				rules.add(PR_DataTypeCS);
				rules.add(PR_EntryOperationCS);
				rules.add(PR_EnumerationCS);
				rules.add(PR_EnumerationLiteralCS);
				rules.add(PR_ExceptionCS);
				rules.add(PR_HelperCS);
				rules.add(PR_HelperDeclarationCS);
				rules.add(PR_HelperHeaderCS);
				rules.add(PR_HelperDefinitionCS);
				rules.add(PR_HelperSimpleDefinitionCS);
				rules.add(PR_HelperCompoundDefinitionCS);
				rules.add(PR_ImportCS);
				rules.add(PR_InitPartCS);
				rules.add(PR_LibraryCS);
				rules.add(PR_LibraryDeclCS);
				rules.add(PR_LibraryDefCS);
				rules.add(PR_LibraryHeaderCS);
				rules.add(PR_MappingBodyCS);
				rules.add(PR_MappingCallExpCS);
				rules.add(PR_MappingOperationCS);
				rules.add(PR_MappingDeclarationCS);
				rules.add(PR_MappingDefinitionCS);
				rules.add(PR_MappingOperationHeaderCS);
				rules.add(PR_MetamodelCS);
				rules.add(PR_ModelTypeCS);
				rules.add(PR_ModelTypeRefCS);
				rules.add(PR_ModuleOperationCS);
				rules.add(PR_ModulePropertyCS);
				rules.add(PR_ModuleRefCS);
				rules.add(PR_ModuleUsageCS);
				rules.add(PR_ObjectExpCS);
				rules.add(PR_ObjectVariableCS);
				rules.add(PR_OperationRefCS);
				rules.add(PR_PackageRefCS);
				rules.add(PR_ParameterCS);
				rules.add(PR_ParameterDeclarationCS);
				rules.add(PR_QVToClassCS);
				rules.add(PR_ResolveExpCS);
				rules.add(PR_ResolveByTypeExpCS);
				rules.add(PR_ResolveByMappingExpCS);
				rules.add(PR_SimpleOperationBodyCS);
				rules.add(PR_StereotypeQualifierCS);
				rules.add(PR_TagCS);
				rules.add(PR_TransformationCS);
				rules.add(PR_TransformationDeclCS);
				rules.add(PR_TransformationDefCS);
				rules.add(PR_TransformationHeaderCS);
				rules.add(PR_TypeSelectorCS);
				rules.add(PR_UnitPackageCS);
				rules.add(PR_UnitRefCS);
				rules.add(PR_UnitTypeCS);
			}
			{
				List<Grammar> usedGrammars = grammar.getUsedGrammars();
				usedGrammars.add(G_ImperativeOCL);
			}
			return grammar;
		}
	}

	private static class _ImperativeOCL
	{
		private static final @NonNull ReferencedMetamodel MM = createReferencedMetamodel(org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.eINSTANCE, null); // http://www.eclipse.org/qvt/pivot/1.0/ImperativeOCLCS
		private static final @NonNull ReferencedMetamodel MM_base = createReferencedMetamodel(org.eclipse.ocl.xtext.basecs.BaseCSPackage.eINSTANCE, "base"); // http://www.eclipse.org/ocl/2015/BaseCS
		private static final @NonNull ReferencedMetamodel MM_ecore = createReferencedMetamodel(org.eclipse.emf.ecore.EcorePackage.eINSTANCE, "ecore"); // http://www.eclipse.org/emf/2002/Ecore
		private static final @NonNull ReferencedMetamodel MM_essentialocl = createReferencedMetamodel(org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.eINSTANCE, "essentialocl"); // http://www.eclipse.org/ocl/2015/EssentialOCLCS

		private static final @NonNull EnumRule ER_AssignOpCS = createEnumRule("AssignOpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.ASSIGN_OP_CS));
		private static final @NonNull EnumRule ER_InitOpCS = createEnumRule("InitOpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.INIT_OP_CS));
		private static final @NonNull EnumRule ER_SeverityKindCS = createEnumRule("SeverityKindCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.SEVERITY_KIND_CS));

		private static void initEnumRules() {
			ER_AssignOpCS.setAlternatives(createAlternatives(createEnumLiteral(createKeyword(":="), org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.ASSIGN_OP_CS.getEEnumLiteral("Single")), createEnumLiteral(createKeyword("::="), org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.ASSIGN_OP_CS.getEEnumLiteral("MultiWithReset")), createEnumLiteral(createKeyword("+="), org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.ASSIGN_OP_CS.getEEnumLiteral("MultiWithoutReset"))));
			ER_InitOpCS.setAlternatives(createAlternatives(createEnumLiteral(createKeyword("="), org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.INIT_OP_CS.getEEnumLiteral("Equals")), createEnumLiteral(createKeyword(":="), org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.INIT_OP_CS.getEEnumLiteral("ColonEquals")), createEnumLiteral(createKeyword("::="), org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.INIT_OP_CS.getEEnumLiteral("ColonColonEquals"))));
			ER_SeverityKindCS.setAlternatives(createAlternatives(createEnumLiteral(createKeyword("error"), org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.SEVERITY_KIND_CS.getEEnumLiteral("error")), createEnumLiteral(createKeyword("warning"), org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.SEVERITY_KIND_CS.getEEnumLiteral("warning")), createEnumLiteral(createKeyword("fatal"), org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.SEVERITY_KIND_CS.getEEnumLiteral("fatal"))));
		}

		private static final @NonNull ParserRule PR_AssertExpCS = createParserRule("AssertExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.ASSERT_EXP_CS));
		private static final @NonNull ParserRule PR_AssignExpCS = createParserRule("AssignExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.ASSIGN_EXP_CS));
		private static final @NonNull ParserRule PR_BreakExpCS = createParserRule("BreakExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.BREAK_EXP_CS));
		private static final @NonNull ParserRule PR_CatchExpCS = createParserRule("CatchExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.CATCH_EXP_CS));
		private static final @NonNull ParserRule PR_ComputeExpCS = createParserRule("ComputeExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.COMPUTE_EXP_CS));
		private static final @NonNull ParserRule PR_ContinueExpCS = createParserRule("ContinueExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.CONTINUE_EXP_CS));
		private static final @NonNull ParserRule PR_DictLiteralExpCS = createParserRule("DictLiteralExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.DICT_LITERAL_EXP_CS));
		private static final @NonNull ParserRule PR_DictLiteralPartCS = createParserRule("DictLiteralPartCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.DICT_LITERAL_PART_CS));
		private static final @NonNull ParserRule PR_DictTypeCS = createParserRule("DictTypeCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.DICT_TYPE_CS));
		private static final @NonNull ParserRule PR_ExpressionBlockCS = createParserRule("ExpressionBlockCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.EXPRESSION_BLOCK_CS));
		private static final @NonNull ParserRule PR_ExpressionStatementCS = createParserRule("ExpressionStatementCS", createTypeRef(MM_essentialocl, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.EXP_CS));
		private static final @NonNull ParserRule PR_ExtentRefCS = createParserRule("ExtentRefCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.EXTENT_REF_CS));
		private static final @NonNull ParserRule PR_ForExpCS = createParserRule("ForExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.FOR_EXP_CS));
		private static final @NonNull ParserRule PR_GrammmarCS = createParserRule("GrammmarCS", createTypeRef(MM_essentialocl, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.EXP_CS));
		private static final @NonNull ParserRule PR_ImperativeExpCS = createParserRule("ImperativeExpCS", createTypeRef(MM_essentialocl, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.EXP_CS));
		private static final @NonNull ParserRule PR_ImperativeIterateExpCS = createParserRule("ImperativeIterateExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.IMPERATIVE_ITERATE_EXP_CS));
		private static final @NonNull ParserRule PR_ImperativeOCLExpCS = createParserRule("ImperativeOCLExpCS", createTypeRef(MM_essentialocl, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.EXP_CS));
		private static final @NonNull ParserRule PR_InstantiationExpCS = createParserRule("InstantiationExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.INSTANTIATION_EXP_CS));
		private static final @NonNull ParserRule PR_ListLiteralExpCS = createParserRule("ListLiteralExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.LIST_LITERAL_EXP_CS));
		private static final @NonNull ParserRule PR_ListTypeCS = createParserRule("ListTypeCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.LIST_TYPE_CS));
		private static final @NonNull ParserRule PR_LogExpCS = createParserRule("LogExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.LOG_EXP_CS));
		private static final @NonNull ParserRule PR_PrimaryExpCS = createParserRule("PrimaryExpCS", createTypeRef(MM_essentialocl, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.EXP_CS));
		private static final @NonNull ParserRule PR_RaiseExpCS = createParserRule("RaiseExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.RAISE_EXP_CS));
		private static final @NonNull ParserRule PR_ReturnExpCS = createParserRule("ReturnExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.RETURN_EXP_CS));
		private static final @NonNull ParserRule PR_StringLiteral = createParserRule("StringLiteral", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_SwitchAltCS = createParserRule("SwitchAltCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.SWITCH_ALT_CS));
		private static final @NonNull ParserRule PR_SwitchExpCS = createParserRule("SwitchExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.SWITCH_EXP_CS));
		private static final @NonNull ParserRule PR_TryExpCS = createParserRule("TryExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.TRY_EXP_CS));
		private static final @NonNull ParserRule PR_TypeLiteralCS = createParserRule("TypeLiteralCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.TYPED_REF_CS));
		private static final @NonNull ParserRule PR_VarDeclarationCS = createParserRule("VarDeclarationCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.VAR_DECLARATION_CS));
		private static final @NonNull ParserRule PR_VarDeclarationNoInitCS = createParserRule("VarDeclarationNoInitCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.VAR_DECLARATION_CS));
		private static final @NonNull ParserRule PR_VarsInitializationCS = createParserRule("VarsInitializationCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.VARS_INITIALIZATION_CS));
		private static final @NonNull ParserRule PR_WhileExpCS = createParserRule("WhileExpCS", createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.WHILE_EXP_CS));

		private static void initParserRules() {
			PR_AssertExpCS.setAlternatives(createGroup(createKeyword("assert"), setCardinality("?", createAssignment("severity", "=", createRuleCall(ER_SeverityKindCS))), createAssignment("ownedAssertion", "=", createRuleCall(_EssentialOCL.PR_ExpCS)), setCardinality("?", createGroup(createKeyword("with"), createAssignment("ownedLog", "=", createRuleCall(PR_LogExpCS))))));
			PR_AssignExpCS.setAlternatives(createGroup(createAssignment("ownedLeft", "=", createRuleCall(_EssentialOCL.PR_NameExpCS)), createAssignment("assignOp", "=", createRuleCall(ER_AssignOpCS)), createAssignment("ownedValue", "=", createRuleCall(_EssentialOCL.PR_ExpCS)), setCardinality("?", createGroup(createKeyword("default"), createAssignment("ownedDefault", "=", createRuleCall(_EssentialOCL.PR_ExpCS))))));
			PR_BreakExpCS.setAlternatives(createGroup(createAction(null, null, createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.BREAK_EXP_CS)), createKeyword("break")));
			PR_CatchExpCS.setAlternatives(createGroup(createKeyword("except"), createKeyword("("), setCardinality("?", createGroup(createAssignment("varName", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName)), createKeyword(":"))), createAssignment("ownedExceptionRefs", "+=", createRuleCall(_EssentialOCL.PR_TypeExpCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedExceptionRefs", "+=", createRuleCall(_EssentialOCL.PR_TypeExpCS)))), createKeyword(")"), createKeyword("{"), setCardinality("*", createAssignment("ownedExps", "+=", createRuleCall(_EssentialOCL.PR_ExpCS))), createKeyword("}")));
			PR_ComputeExpCS.setAlternatives(createGroup(createKeyword("compute"), createKeyword("("), createAssignment("ownedResultVar", "=", createRuleCall(PR_VarDeclarationCS)), createKeyword(")"), createKeyword("{"), createAssignment("ownedExps", "+=", createRuleCall(PR_ExpressionStatementCS)), createKeyword("}")));
			PR_ContinueExpCS.setAlternatives(createGroup(createAction(null, null, createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.CONTINUE_EXP_CS)), createKeyword("continue")));
			PR_DictLiteralExpCS.setAlternatives(createGroup(createKeyword("Dict"), createKeyword("{"), createAction(null, null, createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.DICT_LITERAL_EXP_CS)), setCardinality("?", createGroup(createAssignment("ownedParts", "+=", createRuleCall(PR_DictLiteralPartCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedParts", "+=", createRuleCall(PR_DictLiteralPartCS)))))), createKeyword("}")));
			PR_DictLiteralPartCS.setAlternatives(createGroup(createAssignment("ownedKey", "=", createRuleCall(_EssentialOCL.PR_PrimitiveLiteralExpCS)), createKeyword("="), createAssignment("ownedValue", "=", createRuleCall(_EssentialOCL.PR_ExpCS))));
			PR_DictTypeCS.setAlternatives(createGroup(createKeyword("Dict"), createKeyword("("), createAssignment("ownedKeyTypeRef", "=", createRuleCall(_EssentialOCL.PR_TypeExpCS)), createKeyword(","), createAssignment("ownedValueTypeRef", "=", createRuleCall(_EssentialOCL.PR_TypeExpCS)), createKeyword(")")));
			PR_ExpressionBlockCS.setAlternatives(createGroup(createAction(null, null, createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.EXPRESSION_BLOCK_CS)), setCardinality("?", createKeyword("do")), createKeyword("{"), setCardinality("*", createAssignment("ownedExps", "+=", createRuleCall(PR_ExpressionStatementCS))), createKeyword("}")));
			PR_ExpressionStatementCS.setAlternatives(createGroup(createRuleCall(_EssentialOCL.PR_ExpCS), setCardinality("?", createKeyword(";"))));
			PR_ExtentRefCS.setAlternatives(createAssignment("ownedPathName", "=", createRuleCall(_Base.PR_PathNameCS)));
			PR_ForExpCS.setAlternatives(createGroup(createAlternatives(createKeyword("forEach"), createAssignment("isOne", "?=", createKeyword("forOne"))), createKeyword("("), setCardinality("?", createGroup(createAssignment("ownedTarget", "=", createRuleCall(PR_VarDeclarationCS)), createKeyword(";"))), createAssignment("ownedIterator", "=", createRuleCall(PR_VarDeclarationNoInitCS)), setCardinality("?", createGroup(createKeyword("|"), createAssignment("ownedCondition", "=", createRuleCall(_EssentialOCL.PR_ExpCS)))), createKeyword(")"), createAssignment("ownedBody", "=", createRuleCall(_EssentialOCL.PR_ExpCS))));
			PR_GrammmarCS.setAlternatives(createRuleCall(PR_ImperativeOCLExpCS));
			PR_ImperativeExpCS.setAlternatives(createAlternatives(createRuleCall(PR_ExpressionBlockCS), createRuleCall(PR_AssertExpCS), createRuleCall(PR_BreakExpCS), createRuleCall(PR_ContinueExpCS), createRuleCall(PR_InstantiationExpCS), createRuleCall(PR_LogExpCS), createRuleCall(PR_RaiseExpCS), createRuleCall(PR_VarsInitializationCS), createRuleCall(PR_ListLiteralExpCS), createRuleCall(PR_DictLiteralExpCS), createRuleCall(_EssentialOCL.PR_TypeLiteralExpCS), createRuleCall(PR_ReturnExpCS), createRuleCall(PR_ComputeExpCS), createRuleCall(PR_ForExpCS), createRuleCall(PR_WhileExpCS), createRuleCall(PR_ImperativeIterateExpCS), createRuleCall(PR_SwitchExpCS), createRuleCall(PR_AssignExpCS), createRuleCall(PR_TryExpCS)));
			PR_ImperativeIterateExpCS.setAlternatives(createAlternatives(createGroup(createAssignment("name", "=", createKeyword("xcollect")), createKeyword("("), setCardinality("?", createGroup(createAssignment("ownedIterator", "=", createRuleCall(PR_VarDeclarationNoInitCS)), createKeyword("|"))), createAssignment("ownedBody", "=", createRuleCall(_EssentialOCL.PR_ExpCS)), createKeyword(")")), createGroup(createAssignment("name", "=", createAlternatives(createKeyword("xselect"), createKeyword("xselectOne"))), createKeyword("("), setCardinality("?", createGroup(createAssignment("ownedIterator", "=", createRuleCall(PR_VarDeclarationNoInitCS)), createKeyword("|"))), createAssignment("ownedCondition", "=", createRuleCall(_EssentialOCL.PR_ExpCS)), createKeyword(")")), createGroup(createAssignment("name", "=", createAlternatives(createKeyword("xcollectselect"), createKeyword("xcollectselectOne"))), createKeyword("("), setCardinality("?", createGroup(createAssignment("ownedIterator", "=", createRuleCall(PR_VarDeclarationNoInitCS)), createKeyword(";"))), createAssignment("ownedTarget", "=", createRuleCall(PR_VarDeclarationCS)), createKeyword(":="), createAssignment("ownedBody", "=", createRuleCall(_EssentialOCL.PR_ExpCS)), createKeyword("|"), createAssignment("ownedCondition", "=", createRuleCall(_EssentialOCL.PR_ExpCS)), createKeyword(")"))));
			PR_ImperativeOCLExpCS.setAlternatives(createRuleCall(_EssentialOCL.PR_ExpCS));
			PR_InstantiationExpCS.setAlternatives(createGroup(createKeyword("new"), createAssignment("ownedClassRef", "=", createRuleCall(_EssentialOCL.PR_TypeExpCS)), setCardinality("?", createGroup(createKeyword("@"), createAssignment("ownedExtentRef", "=", createRuleCall(_EssentialOCL.PR_TypeNameExpCS)))), createKeyword("("), setCardinality("?", createGroup(createAssignment("ownedArguments", "+=", createRuleCall(_EssentialOCL.PR_ExpCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedArguments", "+=", createRuleCall(_EssentialOCL.PR_ExpCS)))))), createKeyword(")")));
			PR_ListLiteralExpCS.setAlternatives(createGroup(createKeyword("List"), createKeyword("{"), createAction(null, null, createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.LIST_LITERAL_EXP_CS)), setCardinality("?", createGroup(createAssignment("ownedParts", "+=", createRuleCall(_EssentialOCL.PR_CollectionLiteralPartCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedParts", "+=", createRuleCall(_EssentialOCL.PR_CollectionLiteralPartCS)))))), createKeyword("}")));
			PR_ListTypeCS.setAlternatives(createGroup(createKeyword("List"), createKeyword("("), createAssignment("ownedTypeRef", "=", createRuleCall(_EssentialOCL.PR_TypeExpCS)), createKeyword(")")));
			PR_LogExpCS.setAlternatives(createGroup(createKeyword("log"), createKeyword("("), createAssignment("ownedMessage", "=", createRuleCall(_EssentialOCL.PR_StringLiteralExpCS)), setCardinality("?", createGroup(createKeyword(","), createAssignment("ownedElement", "=", createRuleCall(_EssentialOCL.PR_ExpCS)))), setCardinality("?", createGroup(createKeyword(","), createAssignment("severity", "=", createRuleCall(ER_SeverityKindCS)))), createKeyword(")"), setCardinality("?", createGroup(createKeyword("when"), createAssignment("ownedCondition", "=", createRuleCall(_EssentialOCL.PR_ExpCS))))));
			PR_PrimaryExpCS.setAlternatives(createAlternatives(createRuleCall(_EssentialOCL.PR_NestedExpCS), createRuleCall(_EssentialOCL.PR_IfExpCS), createRuleCall(_EssentialOCL.PR_SelfExpCS), createRuleCall(_EssentialOCL.PR_PrimitiveLiteralExpCS), createRuleCall(_EssentialOCL.PR_TupleLiteralExpCS), createRuleCall(_EssentialOCL.PR_MapLiteralExpCS), createRuleCall(_EssentialOCL.PR_CollectionLiteralExpCS), createRuleCall(_EssentialOCL.PR_LambdaLiteralExpCS), createRuleCall(PR_ImperativeExpCS), createRuleCall(_EssentialOCL.PR_NameExpCS)));
			PR_RaiseExpCS.setAlternatives(createGroup(createKeyword("raise"), createAssignment("ownedExceptionRef", "=", createRuleCall(_EssentialOCL.PR_TypeExpCS)), createKeyword("("), createAssignment("ownedArguments", "+=", createRuleCall(_EssentialOCL.PR_ExpCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedArguments", "+=", createRuleCall(_EssentialOCL.PR_ExpCS)))), createKeyword(")")));
			PR_ReturnExpCS.setAlternatives(createGroup(createKeyword("return"), createAction(null, null, createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.RETURN_EXP_CS)), setCardinality("?", createAssignment("ownedValue", "=", createRuleCall(_EssentialOCL.PR_ExpCS)))));
			PR_StringLiteral.setAlternatives(createAlternatives(createRuleCall(_Base.TR_SINGLE_QUOTED_STRING), createRuleCall(_Base.TR_DOUBLE_QUOTED_STRING)));
			PR_SwitchAltCS.setAlternatives(createGroup(createKeyword("("), createAssignment("ownedCondition", "=", createRuleCall(_EssentialOCL.PR_ExpCS)), createKeyword(")"), createAssignment("ownedBody", "=", createRuleCall(_EssentialOCL.PR_ExpCS))));
			PR_SwitchExpCS.setAlternatives(createAlternatives(createGroup(createAssignment("ifSyntax", "?=", createKeyword("if")), createAssignment("ownedAltParts", "+=", createRuleCall(PR_SwitchAltCS)), setCardinality("*", createGroup(createKeyword("elif"), createAssignment("ownedAltParts", "+=", createRuleCall(PR_SwitchAltCS)))), setCardinality("?", createGroup(createKeyword("else"), createAssignment("ownedElsePart", "=", createRuleCall(_EssentialOCL.PR_ExpCS)))), setCardinality("?", createKeyword("endif"))), createGroup(createKeyword("switch"), setCardinality("?", createGroup(createKeyword("("), createAssignment("ownedIterator", "=", createRuleCall(PR_VarDeclarationNoInitCS)), createKeyword(")"))), createKeyword("{"), setCardinality("+", createGroup(createKeyword("case"), createAssignment("ownedAltParts", "+=", createRuleCall(PR_SwitchAltCS)))), setCardinality("?", createGroup(createKeyword("else"), createAssignment("ownedElsePart", "=", createRuleCall(_EssentialOCL.PR_ExpCS)))), createKeyword("}"))));
			PR_TryExpCS.setAlternatives(createGroup(createAction(null, null, createTypeRef(MM, org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage.Literals.TRY_EXP_CS)), createKeyword("try"), createKeyword("{"), setCardinality("*", createAssignment("ownedExps", "+=", createRuleCall(_EssentialOCL.PR_ExpCS))), createKeyword("}"), setCardinality("+", createAssignment("ownedCatchs", "+=", createRuleCall(PR_CatchExpCS)))));
			PR_TypeLiteralCS.setAlternatives(createAlternatives(createRuleCall(_EssentialOCL.PR_PrimitiveTypeCS), createRuleCall(_EssentialOCL.PR_CollectionTypeCS), createRuleCall(_EssentialOCL.PR_MapTypeCS), createRuleCall(_EssentialOCL.PR_TupleTypeCS), createRuleCall(PR_ListTypeCS), createRuleCall(PR_DictTypeCS)));
			PR_VarDeclarationCS.setAlternatives(createGroup(createAssignment("name", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName)), setCardinality("?", createGroup(createKeyword(":"), createAssignment("ownedType", "=", createRuleCall(_EssentialOCL.PR_TypeExpCS)))), setCardinality("?", createGroup(createAssignment("initOp", "=", createRuleCall(ER_InitOpCS)), createAssignment("ownedInitExpression", "=", createRuleCall(_EssentialOCL.PR_ExpCS))))));
			PR_VarDeclarationNoInitCS.setAlternatives(createGroup(createAssignment("name", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName)), setCardinality("?", createGroup(createKeyword(":"), createAssignment("ownedType", "=", createRuleCall(_EssentialOCL.PR_TypeExpCS))))));
			PR_VarsInitializationCS.setAlternatives(createGroup(createKeyword("var"), createAssignment("ownedVarDeclarations", "+=", createRuleCall(PR_VarDeclarationCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedVarDeclarations", "+=", createRuleCall(PR_VarDeclarationCS))))));
			PR_WhileExpCS.setAlternatives(createGroup(createKeyword("while"), createKeyword("("), setCardinality("?", createGroup(createAssignment("ownedResultVar", "=", createRuleCall(PR_VarDeclarationCS)), createKeyword(";"))), createAssignment("ownedCondition", "=", createRuleCall(_EssentialOCL.PR_ExpCS)), createKeyword(")"), createKeyword("{"), setCardinality("*", createAssignment("ownedExps", "+=", createRuleCall(PR_ExpressionStatementCS))), createKeyword("}")));
		}

		private static @NonNull Grammar initGrammar() {
			initEnumRules();
			initParserRules();
			Grammar grammar = G_ImperativeOCL;
			{
				List<AbstractMetamodelDeclaration> metamodelDeclarations = grammar.getMetamodelDeclarations();
				metamodelDeclarations.add(MM);
				metamodelDeclarations.add(MM_ecore);
				metamodelDeclarations.add(MM_base);
				metamodelDeclarations.add(MM_essentialocl);
			}
			{
				List<AbstractRule> rules = grammar.getRules();
				rules.add(PR_GrammmarCS);
				rules.add(ER_SeverityKindCS);
				rules.add(ER_InitOpCS);
				rules.add(ER_AssignOpCS);
				rules.add(PR_ImperativeOCLExpCS);
				rules.add(PR_TypeLiteralCS);
				rules.add(PR_ListTypeCS);
				rules.add(PR_DictTypeCS);
				rules.add(PR_PrimaryExpCS);
				rules.add(PR_ImperativeExpCS);
				rules.add(PR_AssertExpCS);
				rules.add(PR_AssignExpCS);
				rules.add(PR_BreakExpCS);
				rules.add(PR_CatchExpCS);
				rules.add(PR_ComputeExpCS);
				rules.add(PR_ContinueExpCS);
				rules.add(PR_DictLiteralExpCS);
				rules.add(PR_DictLiteralPartCS);
				rules.add(PR_ExpressionBlockCS);
				rules.add(PR_ExpressionStatementCS);
				rules.add(PR_ExtentRefCS);
				rules.add(PR_ForExpCS);
				rules.add(PR_ImperativeIterateExpCS);
				rules.add(PR_InstantiationExpCS);
				rules.add(PR_ListLiteralExpCS);
				rules.add(PR_LogExpCS);
				rules.add(PR_RaiseExpCS);
				rules.add(PR_ReturnExpCS);
				rules.add(PR_StringLiteral);
				rules.add(PR_SwitchExpCS);
				rules.add(PR_SwitchAltCS);
				rules.add(PR_TryExpCS);
				rules.add(PR_VarDeclarationCS);
				rules.add(PR_VarDeclarationNoInitCS);
				rules.add(PR_VarsInitializationCS);
				rules.add(PR_WhileExpCS);
			}
			{
				List<Grammar> usedGrammars = grammar.getUsedGrammars();
				usedGrammars.add(G_EssentialOCL);
			}
			return grammar;
		}
	}

	private static class _EssentialOCL
	{
		private static final @NonNull ReferencedMetamodel MM = createReferencedMetamodel(org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.eINSTANCE, null); // http://www.eclipse.org/ocl/2015/EssentialOCLCS
		private static final @NonNull ReferencedMetamodel MM_base = createReferencedMetamodel(org.eclipse.ocl.xtext.basecs.BaseCSPackage.eINSTANCE, "base"); // http://www.eclipse.org/ocl/2015/BaseCS
		private static final @NonNull ReferencedMetamodel MM_ecore = createReferencedMetamodel(org.eclipse.emf.ecore.EcorePackage.eINSTANCE, "ecore"); // http://www.eclipse.org/emf/2002/Ecore
		private static final @NonNull ReferencedMetamodel MM_pivot = createReferencedMetamodel(org.eclipse.ocl.pivot.PivotPackage.eINSTANCE, "pivot"); // http://www.eclipse.org/ocl/2015/Pivot

		private static final @NonNull ParserRule PR_BinaryOperatorName = createParserRule("BinaryOperatorName", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_BooleanLiteralExpCS = createParserRule("BooleanLiteralExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.BOOLEAN_LITERAL_EXP_CS));
		private static final @NonNull ParserRule PR_CollectionLiteralExpCS = createParserRule("CollectionLiteralExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.COLLECTION_LITERAL_EXP_CS));
		private static final @NonNull ParserRule PR_CollectionLiteralPartCS = createParserRule("CollectionLiteralPartCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.COLLECTION_LITERAL_PART_CS));
		private static final @NonNull ParserRule PR_CollectionPatternCS = createParserRule("CollectionPatternCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.COLLECTION_PATTERN_CS));
		private static final @NonNull ParserRule PR_CollectionTypeCS = createParserRule("CollectionTypeCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.COLLECTION_TYPE_CS));
		private static final @NonNull ParserRule PR_CollectionTypeIdentifier = createParserRule("CollectionTypeIdentifier", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_CurlyBracketedClauseCS = createParserRule("CurlyBracketedClauseCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.CURLY_BRACKETED_CLAUSE_CS));
		private static final @NonNull ParserRule PR_ElseIfThenExpCS = createParserRule("ElseIfThenExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.IF_THEN_EXP_CS));
		private static final @NonNull ParserRule PR_EssentialOCLInfixOperatorName = createParserRule("EssentialOCLInfixOperatorName", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_EssentialOCLNavigationOperatorName = createParserRule("EssentialOCLNavigationOperatorName", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_EssentialOCLReservedKeyword = createParserRule("EssentialOCLReservedKeyword", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_EssentialOCLUnaryOperatorName = createParserRule("EssentialOCLUnaryOperatorName", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_EssentialOCLUnreservedName = createParserRule("EssentialOCLUnreservedName", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_EssentialOCLUnrestrictedName = createParserRule("EssentialOCLUnrestrictedName", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_ExpCS = createParserRule("ExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.EXP_CS));
		private static final @NonNull ParserRule PR_IfExpCS = createParserRule("IfExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.IF_EXP_CS));
		private static final @NonNull ParserRule PR_InfixOperatorName = createParserRule("InfixOperatorName", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_InvalidLiteralExpCS = createParserRule("InvalidLiteralExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.INVALID_LITERAL_EXP_CS));
		private static final @NonNull ParserRule PR_LambdaLiteralExpCS = createParserRule("LambdaLiteralExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.LAMBDA_LITERAL_EXP_CS));
		private static final @NonNull ParserRule PR_LetExpCS = createParserRule("LetExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.LET_EXP_CS));
		private static final @NonNull ParserRule PR_LetVariableCS = createParserRule("LetVariableCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.LET_VARIABLE_CS));
		private static final @NonNull ParserRule PR_MapLiteralExpCS = createParserRule("MapLiteralExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.MAP_LITERAL_EXP_CS));
		private static final @NonNull ParserRule PR_MapLiteralPartCS = createParserRule("MapLiteralPartCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.MAP_LITERAL_PART_CS));
		private static final @NonNull ParserRule PR_MapTypeCS = createParserRule("MapTypeCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.MAP_TYPE_CS));
		private static final @NonNull ParserRule PR_Model = createParserRule("Model", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.CONTEXT_CS));
		private static final @NonNull ParserRule PR_NameExpCS = createParserRule("NameExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.NAME_EXP_CS));
		private static final @NonNull ParserRule PR_NavigatingArgCS = createParserRule("NavigatingArgCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.NAVIGATING_ARG_CS));
		private static final @NonNull ParserRule PR_NavigatingArgExpCS = createParserRule("NavigatingArgExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.EXP_CS));
		private static final @NonNull ParserRule PR_NavigatingBarArgCS = createParserRule("NavigatingBarArgCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.NAVIGATING_ARG_CS));
		private static final @NonNull ParserRule PR_NavigatingCommaArgCS = createParserRule("NavigatingCommaArgCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.NAVIGATING_ARG_CS));
		private static final @NonNull ParserRule PR_NavigatingSemiArgCS = createParserRule("NavigatingSemiArgCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.NAVIGATING_ARG_CS));
		private static final @NonNull ParserRule PR_NavigationOperatorName = createParserRule("NavigationOperatorName", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_NestedExpCS = createParserRule("NestedExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.NESTED_EXP_CS));
		private static final @NonNull ParserRule PR_NullLiteralExpCS = createParserRule("NullLiteralExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.NULL_LITERAL_EXP_CS));
		private static final @NonNull ParserRule PR_NumberLiteralExpCS = createParserRule("NumberLiteralExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.NUMBER_LITERAL_EXP_CS));
		private static final @NonNull ParserRule PR_PatternExpCS = createParserRule("PatternExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.PATTERN_EXP_CS));
		private static final @NonNull ParserRule PR_PrefixedLetExpCS = createParserRule("PrefixedLetExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.EXP_CS));
		private static final @NonNull ParserRule PR_PrefixedPrimaryExpCS = createParserRule("PrefixedPrimaryExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.EXP_CS));
		private static final @NonNull ParserRule PR_PrimaryExpCS = createParserRule("PrimaryExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.EXP_CS));
		private static final @NonNull ParserRule PR_PrimitiveLiteralExpCS = createParserRule("PrimitiveLiteralExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.PRIMITIVE_LITERAL_EXP_CS));
		private static final @NonNull ParserRule PR_PrimitiveTypeCS = createParserRule("PrimitiveTypeCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.PRIMITIVE_TYPE_REF_CS));
		private static final @NonNull ParserRule PR_PrimitiveTypeIdentifier = createParserRule("PrimitiveTypeIdentifier", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_RoundBracketedClauseCS = createParserRule("RoundBracketedClauseCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.ROUND_BRACKETED_CLAUSE_CS));
		private static final @NonNull ParserRule PR_SelfExpCS = createParserRule("SelfExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.SELF_EXP_CS));
		private static final @NonNull ParserRule PR_ShadowPartCS = createParserRule("ShadowPartCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.SHADOW_PART_CS));
		private static final @NonNull ParserRule PR_SquareBracketedClauseCS = createParserRule("SquareBracketedClauseCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.SQUARE_BRACKETED_CLAUSE_CS));
		private static final @NonNull ParserRule PR_StringLiteralExpCS = createParserRule("StringLiteralExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.STRING_LITERAL_EXP_CS));
		private static final @NonNull ParserRule PR_TupleLiteralExpCS = createParserRule("TupleLiteralExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.TUPLE_LITERAL_EXP_CS));
		private static final @NonNull ParserRule PR_TupleLiteralPartCS = createParserRule("TupleLiteralPartCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.TUPLE_LITERAL_PART_CS));
		private static final @NonNull ParserRule PR_TuplePartCS = createParserRule("TuplePartCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.TUPLE_PART_CS));
		private static final @NonNull ParserRule PR_TupleTypeCS = createParserRule("TupleTypeCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.TUPLE_TYPE_CS));
		private static final @NonNull ParserRule PR_TypeExpCS = createParserRule("TypeExpCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.TYPED_REF_CS));
		private static final @NonNull ParserRule PR_TypeExpWithoutMultiplicityCS = createParserRule("TypeExpWithoutMultiplicityCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.TYPED_REF_CS));
		private static final @NonNull ParserRule PR_TypeLiteralCS = createParserRule("TypeLiteralCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.TYPED_REF_CS));
		private static final @NonNull ParserRule PR_TypeLiteralExpCS = createParserRule("TypeLiteralExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.TYPE_LITERAL_EXP_CS));
		private static final @NonNull ParserRule PR_TypeLiteralWithMultiplicityCS = createParserRule("TypeLiteralWithMultiplicityCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.TYPED_REF_CS));
		private static final @NonNull ParserRule PR_TypeNameExpCS = createParserRule("TypeNameExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.TYPE_NAME_EXP_CS));
		private static final @NonNull ParserRule PR_URIFirstPathElementCS = createParserRule("URIFirstPathElementCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.PATH_ELEMENT_CS));
		private static final @NonNull ParserRule PR_URIPathNameCS = createParserRule("URIPathNameCS", createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.PATH_NAME_CS));
		private static final @NonNull ParserRule PR_UnaryOperatorName = createParserRule("UnaryOperatorName", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_UnlimitedNaturalLiteralExpCS = createParserRule("UnlimitedNaturalLiteralExpCS", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.UNLIMITED_NATURAL_LITERAL_EXP_CS));
		private static final @NonNull ParserRule PR_UnreservedName = createParserRule("UnreservedName", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_UnrestrictedName = createParserRule("UnrestrictedName", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));

		private static void initParserRules() {
			PR_BinaryOperatorName.setAlternatives(createAlternatives(createRuleCall(PR_InfixOperatorName), createRuleCall(PR_NavigationOperatorName)));
			PR_BooleanLiteralExpCS.setAlternatives(createAlternatives(createAssignment("symbol", "=", createKeyword("true")), createAssignment("symbol", "=", createKeyword("false"))));
			PR_CollectionLiteralExpCS.setAlternatives(createGroup(createAssignment("ownedType", "=", createRuleCall(PR_CollectionTypeCS)), createKeyword("{"), setCardinality("?", createGroup(createAssignment("ownedParts", "+=", createRuleCall(PR_CollectionLiteralPartCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedParts", "+=", createRuleCall(PR_CollectionLiteralPartCS)))))), createKeyword("}")));
			PR_CollectionLiteralPartCS.setAlternatives(createAlternatives(createGroup(createAssignment("ownedExpression", "=", createRuleCall(PR_ExpCS)), setCardinality("?", createGroup(createKeyword(".."), createAssignment("ownedLastExpression", "=", createRuleCall(PR_ExpCS))))), createAssignment("ownedExpression", "=", createRuleCall(PR_PatternExpCS))));
			PR_CollectionPatternCS.setAlternatives(createGroup(createAssignment("ownedType", "=", createRuleCall(PR_CollectionTypeCS)), createKeyword("{"), setCardinality("?", createGroup(createAssignment("ownedParts", "+=", createRuleCall(PR_PatternExpCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedParts", "+=", createRuleCall(PR_PatternExpCS)))), createGroup(createKeyword("++"), createAssignment("restVariableName", "=", createRuleCall(_Base.PR_Identifier))))), createKeyword("}")));
			PR_CollectionTypeCS.setAlternatives(createGroup(createAssignment("name", "=", createRuleCall(PR_CollectionTypeIdentifier)), setCardinality("?", createGroup(createKeyword("("), createAssignment("ownedType", "=", createRuleCall(PR_TypeExpWithoutMultiplicityCS)), setCardinality("?", createAssignment("ownedCollectionMultiplicity", "=", createRuleCall(_QVTOperational.PR_MultiplicityCS))), createKeyword(")")))));
			PR_CollectionTypeIdentifier.setAlternatives(createAlternatives(createKeyword("Set"), createKeyword("Bag"), createKeyword("Sequence"), createKeyword("Collection"), createKeyword("OrderedSet")));
			PR_CurlyBracketedClauseCS.setAlternatives(createGroup(createAction(null, null, createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.CURLY_BRACKETED_CLAUSE_CS)), createKeyword("{"), setCardinality("?", createGroup(createAssignment("ownedParts", "+=", createRuleCall(PR_ShadowPartCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedParts", "+=", createRuleCall(PR_ShadowPartCS)))))), createKeyword("}")));
			PR_ElseIfThenExpCS.setAlternatives(createGroup(createKeyword("elseif"), createAssignment("ownedCondition", "=", createRuleCall(PR_ExpCS)), createKeyword("then"), createAssignment("ownedThenExpression", "=", createRuleCall(PR_ExpCS))));
			PR_EssentialOCLInfixOperatorName.setAlternatives(createAlternatives(createKeyword("*"), createKeyword("/"), createKeyword("+"), createKeyword("-"), createKeyword(">"), createKeyword("<"), createKeyword(">="), createKeyword("<="), createKeyword("="), createKeyword("<>"), createKeyword("and"), createKeyword("or"), createKeyword("xor"), createKeyword("implies")));
			PR_EssentialOCLNavigationOperatorName.setAlternatives(createAlternatives(createKeyword("."), createKeyword("->"), createKeyword("?."), createKeyword("?->")));
			PR_EssentialOCLReservedKeyword.setAlternatives(createAlternatives(createKeyword("and"), createKeyword("else"), createKeyword("endif"), createKeyword("if"), createKeyword("implies"), createKeyword("in"), createKeyword("let"), createKeyword("not"), createKeyword("or"), createKeyword("then"), createKeyword("xor")));
			PR_EssentialOCLUnaryOperatorName.setAlternatives(createAlternatives(createKeyword("-"), createKeyword("not")));
			PR_EssentialOCLUnreservedName.setAlternatives(createAlternatives(createRuleCall(PR_UnrestrictedName), createRuleCall(PR_CollectionTypeIdentifier), createRuleCall(PR_PrimitiveTypeIdentifier), createKeyword("Map"), createKeyword("Tuple")));
			PR_EssentialOCLUnrestrictedName.setAlternatives(createRuleCall(_Base.PR_Identifier));
			PR_ExpCS.setAlternatives(createAlternatives(createGroup(createRuleCall(PR_PrefixedPrimaryExpCS), setCardinality("?", createGroup(createAction("ownedLeft", "=", createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.INFIX_EXP_CS)), createAssignment("name", "=", createRuleCall(PR_BinaryOperatorName)), createAssignment("ownedRight", "=", createRuleCall(PR_ExpCS))))), createRuleCall(PR_PrefixedLetExpCS)));
			PR_IfExpCS.setAlternatives(createGroup(createKeyword("if"), createAssignment("ownedCondition", "=", createAlternatives(createRuleCall(PR_ExpCS), createRuleCall(PR_PatternExpCS))), createKeyword("then"), createAssignment("ownedThenExpression", "=", createRuleCall(PR_ExpCS)), setCardinality("*", createAssignment("ownedIfThenExpressions", "+=", createRuleCall(PR_ElseIfThenExpCS))), createKeyword("else"), createAssignment("ownedElseExpression", "=", createRuleCall(PR_ExpCS)), createKeyword("endif")));
			PR_InfixOperatorName.setAlternatives(createRuleCall(PR_EssentialOCLInfixOperatorName));
			PR_InvalidLiteralExpCS.setAlternatives(createGroup(createAction(null, null, createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.INVALID_LITERAL_EXP_CS)), createKeyword("invalid")));
			PR_LambdaLiteralExpCS.setAlternatives(createGroup(createKeyword("Lambda"), createKeyword("{"), createAssignment("ownedExpressionCS", "=", createRuleCall(PR_ExpCS)), createKeyword("}")));
			PR_LetExpCS.setAlternatives(createGroup(createKeyword("let"), createAssignment("ownedVariables", "+=", createRuleCall(PR_LetVariableCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedVariables", "+=", createRuleCall(PR_LetVariableCS)))), createKeyword("in"), createAssignment("ownedInExpression", "=", createRuleCall(PR_ExpCS))));
			PR_LetVariableCS.setAlternatives(createGroup(createAssignment("name", "=", createRuleCall(PR_UnrestrictedName)), setCardinality("?", createAssignment("ownedRoundBracketedClause", "=", createRuleCall(PR_RoundBracketedClauseCS))), setCardinality("?", createGroup(createKeyword(":"), createAssignment("ownedType", "=", createRuleCall(PR_TypeExpCS)))), createKeyword("="), createAssignment("ownedInitExpression", "=", createRuleCall(PR_ExpCS))));
			PR_MapLiteralExpCS.setAlternatives(createGroup(createAssignment("ownedType", "=", createRuleCall(PR_MapTypeCS)), createKeyword("{"), setCardinality("?", createGroup(createAssignment("ownedParts", "+=", createRuleCall(PR_MapLiteralPartCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedParts", "+=", createRuleCall(PR_MapLiteralPartCS)))))), createKeyword("}")));
			PR_MapLiteralPartCS.setAlternatives(createGroup(createAssignment("ownedKey", "=", createRuleCall(PR_ExpCS)), createKeyword("<-"), createAssignment("ownedValue", "=", createRuleCall(PR_ExpCS))));
			PR_MapTypeCS.setAlternatives(createGroup(createAssignment("name", "=", createKeyword("Map")), setCardinality("?", createGroup(createKeyword("("), createAssignment("ownedKeyType", "=", createRuleCall(PR_TypeExpCS)), createKeyword(","), createAssignment("ownedValueType", "=", createRuleCall(PR_TypeExpCS)), createKeyword(")")))));
			PR_Model.setAlternatives(createAssignment("ownedExpression", "=", createRuleCall(PR_ExpCS)));
			PR_NameExpCS.setAlternatives(createGroup(createAssignment("ownedPathName", "=", createRuleCall(_Base.PR_PathNameCS)), setCardinality("*", createAssignment("ownedSquareBracketedClauses", "+=", createRuleCall(PR_SquareBracketedClauseCS))), setCardinality("?", createAssignment("ownedRoundBracketedClause", "=", createRuleCall(PR_RoundBracketedClauseCS))), setCardinality("?", createAssignment("ownedCurlyBracketedClause", "=", createRuleCall(PR_CurlyBracketedClauseCS))), setCardinality("?", createGroup(createAssignment("isPre", "?=", createKeyword("@")), createKeyword("pre")))));
			PR_NavigatingArgCS.setAlternatives(createAlternatives(createGroup(createAssignment("ownedNameExpression", "=", createRuleCall(PR_NavigatingArgExpCS)), setCardinality("?", createAlternatives(createGroup(createKeyword(":"), createAssignment("ownedType", "=", createRuleCall(PR_TypeExpCS)), setCardinality("?", createGroup(createKeyword("="), createAssignment("ownedInitExpression", "=", createRuleCall(PR_ExpCS))))), createGroup(createKeyword("in"), createAssignment("ownedInitExpression", "=", createRuleCall(PR_ExpCS)))))), createGroup(createKeyword(":"), createAssignment("ownedType", "=", createRuleCall(PR_TypeExpCS)))));
			PR_NavigatingArgExpCS.setAlternatives(createRuleCall(PR_ExpCS));
			PR_NavigatingBarArgCS.setAlternatives(createGroup(createAssignment("prefix", "=", createKeyword("|")), createAssignment("ownedNameExpression", "=", createRuleCall(PR_NavigatingArgExpCS)), setCardinality("?", createGroup(createKeyword(":"), createAssignment("ownedType", "=", createRuleCall(PR_TypeExpCS)), setCardinality("?", createGroup(createKeyword("="), createAssignment("ownedInitExpression", "=", createRuleCall(PR_ExpCS))))))));
			PR_NavigatingCommaArgCS.setAlternatives(createGroup(createAssignment("prefix", "=", createKeyword(",")), createAssignment("ownedNameExpression", "=", createRuleCall(PR_NavigatingArgExpCS)), setCardinality("?", createAlternatives(createGroup(createKeyword(":"), createAssignment("ownedType", "=", createRuleCall(PR_TypeExpCS)), setCardinality("?", createGroup(createKeyword("="), createAssignment("ownedInitExpression", "=", createRuleCall(PR_ExpCS))))), createGroup(createKeyword("in"), createAssignment("ownedInitExpression", "=", createRuleCall(PR_ExpCS)))))));
			PR_NavigatingSemiArgCS.setAlternatives(createGroup(createAssignment("prefix", "=", createKeyword(";")), createAssignment("ownedNameExpression", "=", createRuleCall(PR_NavigatingArgExpCS)), setCardinality("?", createGroup(createKeyword(":"), createAssignment("ownedType", "=", createRuleCall(PR_TypeExpCS)), setCardinality("?", createGroup(createKeyword("="), createAssignment("ownedInitExpression", "=", createRuleCall(PR_ExpCS))))))));
			PR_NavigationOperatorName.setAlternatives(createRuleCall(PR_EssentialOCLNavigationOperatorName));
			PR_NestedExpCS.setAlternatives(createGroup(createKeyword("("), createAssignment("ownedExpression", "=", createRuleCall(PR_ExpCS)), createKeyword(")")));
			PR_NullLiteralExpCS.setAlternatives(createGroup(createAction(null, null, createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.NULL_LITERAL_EXP_CS)), createKeyword("null")));
			PR_NumberLiteralExpCS.setAlternatives(createAssignment("symbol", "=", createRuleCall(_Base.PR_NUMBER_LITERAL)));
			PR_PatternExpCS.setAlternatives(createGroup(setCardinality("?", createAssignment("patternVariableName", "=", createRuleCall(PR_UnrestrictedName))), createKeyword(":"), createAssignment("ownedPatternType", "=", createRuleCall(PR_TypeExpCS))));
			PR_PrefixedLetExpCS.setAlternatives(createAlternatives(createGroup(createAction(null, null, createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.PREFIX_EXP_CS)), createAssignment("name", "=", createRuleCall(PR_UnaryOperatorName)), createAssignment("ownedRight", "=", createRuleCall(PR_PrefixedLetExpCS))), createRuleCall(PR_LetExpCS)));
			PR_PrefixedPrimaryExpCS.setAlternatives(createAlternatives(createGroup(createAction(null, null, createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.PREFIX_EXP_CS)), createAssignment("name", "=", createRuleCall(PR_UnaryOperatorName)), createAssignment("ownedRight", "=", createRuleCall(PR_PrefixedPrimaryExpCS))), createRuleCall(_ImperativeOCL.PR_PrimaryExpCS)));
			PR_PrimaryExpCS.setAlternatives(createAlternatives(createRuleCall(PR_NestedExpCS), createRuleCall(PR_IfExpCS), createRuleCall(PR_SelfExpCS), createRuleCall(PR_PrimitiveLiteralExpCS), createRuleCall(PR_TupleLiteralExpCS), createRuleCall(PR_MapLiteralExpCS), createRuleCall(PR_CollectionLiteralExpCS), createRuleCall(PR_LambdaLiteralExpCS), createRuleCall(PR_TypeLiteralExpCS), createRuleCall(PR_NameExpCS)));
			PR_PrimitiveLiteralExpCS.setAlternatives(createAlternatives(createRuleCall(PR_NumberLiteralExpCS), createRuleCall(PR_StringLiteralExpCS), createRuleCall(PR_BooleanLiteralExpCS), createRuleCall(PR_UnlimitedNaturalLiteralExpCS), createRuleCall(PR_InvalidLiteralExpCS), createRuleCall(PR_NullLiteralExpCS)));
			PR_PrimitiveTypeCS.setAlternatives(createAssignment("name", "=", createRuleCall(PR_PrimitiveTypeIdentifier)));
			PR_PrimitiveTypeIdentifier.setAlternatives(createAlternatives(createKeyword("Boolean"), createKeyword("Integer"), createKeyword("Real"), createKeyword("String"), createKeyword("UnlimitedNatural"), createKeyword("OclAny"), createKeyword("OclInvalid"), createKeyword("OclVoid")));
			PR_RoundBracketedClauseCS.setAlternatives(createGroup(createAction(null, null, createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.ROUND_BRACKETED_CLAUSE_CS)), createKeyword("("), setCardinality("?", createGroup(createAssignment("ownedArguments", "+=", createRuleCall(PR_NavigatingArgCS)), setCardinality("*", createAssignment("ownedArguments", "+=", createRuleCall(PR_NavigatingCommaArgCS))), setCardinality("?", createGroup(createAssignment("ownedArguments", "+=", createRuleCall(PR_NavigatingSemiArgCS)), setCardinality("*", createAssignment("ownedArguments", "+=", createRuleCall(PR_NavigatingCommaArgCS))))), setCardinality("*", createGroup(createAssignment("ownedArguments", "+=", createRuleCall(PR_NavigatingBarArgCS)), setCardinality("*", createAssignment("ownedArguments", "+=", createRuleCall(PR_NavigatingCommaArgCS))))))), createKeyword(")")));
			PR_SelfExpCS.setAlternatives(createGroup(createAction(null, null, createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.SELF_EXP_CS)), createKeyword("self")));
			PR_ShadowPartCS.setAlternatives(createAlternatives(createGroup(createAssignment("referredProperty", "=", createCrossReference(createTypeRef(MM_pivot, org.eclipse.ocl.pivot.PivotPackage.Literals.PROPERTY), createRuleCall(PR_UnrestrictedName))), createKeyword("="), createAssignment("ownedInitExpression", "=", createAlternatives(createRuleCall(PR_ExpCS), createRuleCall(PR_PatternExpCS)))), createAssignment("ownedInitExpression", "=", createRuleCall(PR_StringLiteralExpCS))));
			PR_SquareBracketedClauseCS.setAlternatives(createGroup(createKeyword("["), createAssignment("ownedTerms", "+=", createRuleCall(PR_ExpCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedTerms", "+=", createRuleCall(PR_ExpCS)))), createKeyword("]")));
			PR_StringLiteralExpCS.setAlternatives(setCardinality("+", createAssignment("segments", "+=", createRuleCall(_ImperativeOCL.PR_StringLiteral))));
			PR_TupleLiteralExpCS.setAlternatives(createGroup(createKeyword("Tuple"), createKeyword("{"), createAssignment("ownedParts", "+=", createRuleCall(PR_TupleLiteralPartCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedParts", "+=", createRuleCall(PR_TupleLiteralPartCS)))), createKeyword("}")));
			PR_TupleLiteralPartCS.setAlternatives(createGroup(createAssignment("name", "=", createRuleCall(PR_UnrestrictedName)), setCardinality("?", createGroup(createKeyword(":"), createAssignment("ownedType", "=", createRuleCall(PR_TypeExpCS)))), createKeyword("="), createAssignment("ownedInitExpression", "=", createRuleCall(PR_ExpCS))));
			PR_TuplePartCS.setAlternatives(createGroup(createAssignment("name", "=", createRuleCall(PR_UnrestrictedName)), createKeyword(":"), createAssignment("ownedType", "=", createRuleCall(PR_TypeExpCS))));
			PR_TupleTypeCS.setAlternatives(createGroup(createAssignment("name", "=", createKeyword("Tuple")), setCardinality("?", createGroup(createKeyword("("), setCardinality("?", createGroup(createAssignment("ownedParts", "+=", createRuleCall(PR_TuplePartCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedParts", "+=", createRuleCall(PR_TuplePartCS)))))), createKeyword(")")))));
			PR_TypeExpCS.setAlternatives(createGroup(createRuleCall(PR_TypeExpWithoutMultiplicityCS), setCardinality("?", createAssignment("ownedMultiplicity", "=", createRuleCall(_QVTOperational.PR_MultiplicityCS)))));
			PR_TypeExpWithoutMultiplicityCS.setAlternatives(createAlternatives(createRuleCall(PR_TypeNameExpCS), createRuleCall(_ImperativeOCL.PR_TypeLiteralCS), createRuleCall(PR_CollectionPatternCS)));
			PR_TypeLiteralCS.setAlternatives(createAlternatives(createRuleCall(PR_PrimitiveTypeCS), createRuleCall(PR_CollectionTypeCS), createRuleCall(PR_MapTypeCS), createRuleCall(PR_TupleTypeCS)));
			PR_TypeLiteralExpCS.setAlternatives(createAssignment("ownedType", "=", createRuleCall(PR_TypeLiteralWithMultiplicityCS)));
			PR_TypeLiteralWithMultiplicityCS.setAlternatives(createGroup(createRuleCall(_ImperativeOCL.PR_TypeLiteralCS), setCardinality("?", createAssignment("ownedMultiplicity", "=", createRuleCall(_QVTOperational.PR_MultiplicityCS)))));
			PR_TypeNameExpCS.setAlternatives(createGroup(createAssignment("ownedPathName", "=", createRuleCall(_Base.PR_PathNameCS)), setCardinality("?", createGroup(createAssignment("ownedCurlyBracketedClause", "=", createRuleCall(PR_CurlyBracketedClauseCS)), setCardinality("?", createGroup(createKeyword("{"), createAssignment("ownedPatternGuard", "=", createRuleCall(PR_ExpCS)), createKeyword("}")))))));
			PR_URIFirstPathElementCS.setAlternatives(createAlternatives(createAssignment("referredElement", "=", createCrossReference(createTypeRef(MM_pivot, org.eclipse.ocl.pivot.PivotPackage.Literals.NAMED_ELEMENT), createRuleCall(PR_UnrestrictedName))), createGroup(createAction(null, null, createTypeRef(MM_base, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.PATH_ELEMENT_WITH_URICS)), createAssignment("referredElement", "=", createCrossReference(createTypeRef(MM_pivot, org.eclipse.ocl.pivot.PivotPackage.Literals.NAMESPACE), createRuleCall(_Base.PR_URI))))));
			PR_URIPathNameCS.setAlternatives(createGroup(createAssignment("ownedPathElements", "+=", createRuleCall(PR_URIFirstPathElementCS)), setCardinality("*", createGroup(createKeyword("::"), createAssignment("ownedPathElements", "+=", createRuleCall(_Base.PR_NextPathElementCS))))));
			PR_UnaryOperatorName.setAlternatives(createRuleCall(PR_EssentialOCLUnaryOperatorName));
			PR_UnlimitedNaturalLiteralExpCS.setAlternatives(createGroup(createAction(null, null, createTypeRef(MM, org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage.Literals.UNLIMITED_NATURAL_LITERAL_EXP_CS)), createKeyword("*")));
			PR_UnreservedName.setAlternatives(createRuleCall(PR_EssentialOCLUnreservedName));
			PR_UnrestrictedName.setAlternatives(createRuleCall(PR_EssentialOCLUnrestrictedName));
		}

		private static @NonNull Grammar initGrammar() {
			initParserRules();
			Grammar grammar = G_EssentialOCL;
			{
				List<AbstractMetamodelDeclaration> metamodelDeclarations = grammar.getMetamodelDeclarations();
				metamodelDeclarations.add(MM_ecore);
				metamodelDeclarations.add(MM_pivot);
				metamodelDeclarations.add(MM_base);
				metamodelDeclarations.add(MM);
			}
			{
				List<AbstractRule> rules = grammar.getRules();
				rules.add(PR_Model);
				rules.add(PR_EssentialOCLReservedKeyword);
				rules.add(PR_EssentialOCLUnaryOperatorName);
				rules.add(PR_EssentialOCLInfixOperatorName);
				rules.add(PR_EssentialOCLNavigationOperatorName);
				rules.add(PR_BinaryOperatorName);
				rules.add(PR_InfixOperatorName);
				rules.add(PR_NavigationOperatorName);
				rules.add(PR_UnaryOperatorName);
				rules.add(PR_EssentialOCLUnrestrictedName);
				rules.add(PR_UnrestrictedName);
				rules.add(PR_EssentialOCLUnreservedName);
				rules.add(PR_UnreservedName);
				rules.add(PR_URIPathNameCS);
				rules.add(PR_URIFirstPathElementCS);
				rules.add(PR_PrimitiveTypeIdentifier);
				rules.add(PR_PrimitiveTypeCS);
				rules.add(PR_CollectionTypeIdentifier);
				rules.add(PR_CollectionTypeCS);
				rules.add(PR_MapTypeCS);
				rules.add(PR_TupleTypeCS);
				rules.add(PR_TuplePartCS);
				rules.add(PR_CollectionLiteralExpCS);
				rules.add(PR_CollectionLiteralPartCS);
				rules.add(PR_CollectionPatternCS);
				rules.add(PR_ShadowPartCS);
				rules.add(PR_PatternExpCS);
				rules.add(PR_LambdaLiteralExpCS);
				rules.add(PR_MapLiteralExpCS);
				rules.add(PR_MapLiteralPartCS);
				rules.add(PR_PrimitiveLiteralExpCS);
				rules.add(PR_TupleLiteralExpCS);
				rules.add(PR_TupleLiteralPartCS);
				rules.add(PR_NumberLiteralExpCS);
				rules.add(PR_StringLiteralExpCS);
				rules.add(PR_BooleanLiteralExpCS);
				rules.add(PR_UnlimitedNaturalLiteralExpCS);
				rules.add(PR_InvalidLiteralExpCS);
				rules.add(PR_NullLiteralExpCS);
				rules.add(PR_TypeLiteralCS);
				rules.add(PR_TypeLiteralWithMultiplicityCS);
				rules.add(PR_TypeLiteralExpCS);
				rules.add(PR_TypeNameExpCS);
				rules.add(PR_TypeExpWithoutMultiplicityCS);
				rules.add(PR_TypeExpCS);
				rules.add(PR_ExpCS);
				rules.add(PR_PrefixedLetExpCS);
				rules.add(PR_PrefixedPrimaryExpCS);
				rules.add(PR_PrimaryExpCS);
				rules.add(PR_NameExpCS);
				rules.add(PR_CurlyBracketedClauseCS);
				rules.add(PR_RoundBracketedClauseCS);
				rules.add(PR_SquareBracketedClauseCS);
				rules.add(PR_NavigatingArgCS);
				rules.add(PR_NavigatingBarArgCS);
				rules.add(PR_NavigatingCommaArgCS);
				rules.add(PR_NavigatingSemiArgCS);
				rules.add(PR_NavigatingArgExpCS);
				rules.add(PR_IfExpCS);
				rules.add(PR_ElseIfThenExpCS);
				rules.add(PR_LetExpCS);
				rules.add(PR_LetVariableCS);
				rules.add(PR_NestedExpCS);
				rules.add(PR_SelfExpCS);
			}
			{
				List<Grammar> usedGrammars = grammar.getUsedGrammars();
				usedGrammars.add(G_Base);
			}
			return grammar;
		}
	}

	private static class _Base
	{
		private static final @NonNull ReferencedMetamodel MM = createReferencedMetamodel(org.eclipse.ocl.xtext.basecs.BaseCSPackage.eINSTANCE, null); // http://www.eclipse.org/ocl/2015/BaseCS
		private static final @NonNull ReferencedMetamodel MM_ecore = createReferencedMetamodel(org.eclipse.emf.ecore.EcorePackage.eINSTANCE, "ecore"); // http://www.eclipse.org/emf/2002/Ecore
		private static final @NonNull ReferencedMetamodel MM_pivot = createReferencedMetamodel(org.eclipse.ocl.pivot.PivotPackage.eINSTANCE, "pivot"); // http://www.eclipse.org/ocl/2015/Pivot

		private static final @NonNull TerminalRule TR_ANY_OTHER = createTerminalRule("ANY_OTHER", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull TerminalRule TR_DOUBLE_QUOTED_STRING = createTerminalRule("DOUBLE_QUOTED_STRING", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull TerminalRule TR_ESCAPED_CHARACTER = createTerminalRule("ESCAPED_CHARACTER", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull TerminalRule TR_ESCAPED_ID = createTerminalRule("ESCAPED_ID", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull TerminalRule TR_INT = createTerminalRule("INT", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull TerminalRule TR_LETTER_CHARACTER = createTerminalRule("LETTER_CHARACTER", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull TerminalRule TR_ML_COMMENT = createTerminalRule("ML_COMMENT", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull TerminalRule TR_ML_SINGLE_QUOTED_STRING = createTerminalRule("ML_SINGLE_QUOTED_STRING", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull TerminalRule TR_SIMPLE_ID = createTerminalRule("SIMPLE_ID", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull TerminalRule TR_SINGLE_QUOTED_STRING = createTerminalRule("SINGLE_QUOTED_STRING", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull TerminalRule TR_SL_COMMENT = createTerminalRule("SL_COMMENT", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull TerminalRule TR_WS = createTerminalRule("WS", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));

		private static void initTerminalRules() {
			TR_ANY_OTHER.setAlternatives(createWildcard());
			TR_DOUBLE_QUOTED_STRING.setAlternatives(createGroup(createKeyword("\""), setCardinality("*", createAlternatives(createRuleCall(TR_ESCAPED_CHARACTER), createNegatedToken(createAlternatives(createKeyword("\\"), createKeyword("\""))))), createKeyword("\"")));
			TR_ESCAPED_CHARACTER.setFragment(true);
			TR_ESCAPED_CHARACTER.setAlternatives(createGroup(createKeyword("\\"), createAlternatives(createKeyword("b"), createKeyword("t"), createKeyword("n"), createKeyword("f"), createKeyword("r"), createKeyword("u"), createKeyword("\""), createKeyword("\'"), createKeyword("\\"))));
			TR_ESCAPED_ID.setAlternatives(createGroup(createKeyword("_"), createRuleCall(TR_SINGLE_QUOTED_STRING)));
			TR_INT.setAlternatives(setCardinality("+", createCharacterRange(createKeyword("0"), createKeyword("9"))));
			TR_LETTER_CHARACTER.setFragment(true);
			TR_LETTER_CHARACTER.setAlternatives(createAlternatives(createCharacterRange(createKeyword("a"), createKeyword("z")), createCharacterRange(createKeyword("A"), createKeyword("Z")), createKeyword("_")));
			TR_ML_COMMENT.setAlternatives(createGroup(createKeyword("/*"), createUntilToken(createKeyword("*/"))));
			TR_ML_SINGLE_QUOTED_STRING.setAlternatives(createGroup(createKeyword("/\'"), createUntilToken(createKeyword("\'/"))));
			TR_SIMPLE_ID.setAlternatives(createGroup(createRuleCall(TR_LETTER_CHARACTER), setCardinality("*", createAlternatives(createRuleCall(TR_LETTER_CHARACTER), createCharacterRange(createKeyword("0"), createKeyword("9"))))));
			TR_SINGLE_QUOTED_STRING.setAlternatives(createGroup(createKeyword("\'"), setCardinality("*", createAlternatives(createRuleCall(TR_ESCAPED_CHARACTER), createNegatedToken(createAlternatives(createKeyword("\\"), createKeyword("\'"))))), createKeyword("\'")));
			TR_SL_COMMENT.setAlternatives(createGroup(createKeyword("--"), setCardinality("*", createNegatedToken(createAlternatives(createKeyword("\n"), createKeyword("\r")))), setCardinality("?", createGroup(setCardinality("?", createKeyword("\r")), createKeyword("\n")))));
			TR_WS.setAlternatives(setCardinality("+", createAlternatives(createKeyword(" "), createKeyword("\t"), createKeyword("\r"), createKeyword("\n"))));
		}

		private static final @NonNull ParserRule PR_FirstPathElementCS = createParserRule("FirstPathElementCS", createTypeRef(MM, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.PATH_ELEMENT_CS));
		private static final @NonNull ParserRule PR_ID = createParserRule("ID", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_Identifier = createParserRule("Identifier", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_LOWER = createParserRule("LOWER", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.EINT));
		private static final @NonNull ParserRule PR_MultiplicityBoundsCS = createParserRule("MultiplicityBoundsCS", createTypeRef(MM, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.MULTIPLICITY_BOUNDS_CS));
		private static final @NonNull ParserRule PR_MultiplicityCS = createParserRule("MultiplicityCS", createTypeRef(MM, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.MULTIPLICITY_CS));
		private static final @NonNull ParserRule PR_MultiplicityStringCS = createParserRule("MultiplicityStringCS", createTypeRef(MM, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.MULTIPLICITY_STRING_CS));
		private static final @NonNull ParserRule PR_NUMBER_LITERAL = createParserRule("NUMBER_LITERAL", createTypeRef(MM, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.BIG_NUMBER));
		private static final @NonNull ParserRule PR_NextPathElementCS = createParserRule("NextPathElementCS", createTypeRef(MM, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.PATH_ELEMENT_CS));
		private static final @NonNull ParserRule PR_PathNameCS = createParserRule("PathNameCS", createTypeRef(MM, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.PATH_NAME_CS));
		private static final @NonNull ParserRule PR_StringLiteral = createParserRule("StringLiteral", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_TemplateBindingCS = createParserRule("TemplateBindingCS", createTypeRef(MM, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.TEMPLATE_BINDING_CS));
		private static final @NonNull ParserRule PR_TemplateParameterSubstitutionCS = createParserRule("TemplateParameterSubstitutionCS", createTypeRef(MM, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION_CS));
		private static final @NonNull ParserRule PR_TemplateSignatureCS = createParserRule("TemplateSignatureCS", createTypeRef(MM, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.TEMPLATE_SIGNATURE_CS));
		private static final @NonNull ParserRule PR_TypeParameterCS = createParserRule("TypeParameterCS", createTypeRef(MM, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.TYPE_PARAMETER_CS));
		private static final @NonNull ParserRule PR_TypeRefCS = createParserRule("TypeRefCS", createTypeRef(MM, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.TYPE_REF_CS));
		private static final @NonNull ParserRule PR_TypedRefCS = createParserRule("TypedRefCS", createTypeRef(MM, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.TYPED_REF_CS));
		private static final @NonNull ParserRule PR_TypedTypeRefCS = createParserRule("TypedTypeRefCS", createTypeRef(MM, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.TYPED_TYPE_REF_CS));
		private static final @NonNull ParserRule PR_UPPER = createParserRule("UPPER", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.EINT));
		private static final @NonNull ParserRule PR_URI = createParserRule("URI", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_UnreservedName = createParserRule("UnreservedName", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_UnrestrictedName = createParserRule("UnrestrictedName", createTypeRef(MM_ecore, org.eclipse.emf.ecore.EcorePackage.Literals.ESTRING));
		private static final @NonNull ParserRule PR_WildcardTypeRefCS = createParserRule("WildcardTypeRefCS", createTypeRef(MM, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.WILDCARD_TYPE_REF_CS));

		private static void initParserRules() {
			PR_FirstPathElementCS.setAlternatives(createAssignment("referredElement", "=", createCrossReference(createTypeRef(MM_pivot, org.eclipse.ocl.pivot.PivotPackage.Literals.NAMED_ELEMENT), createRuleCall(_EssentialOCL.PR_UnrestrictedName))));
			PR_ID.setAlternatives(createAlternatives(createRuleCall(TR_SIMPLE_ID), createRuleCall(TR_ESCAPED_ID)));
			PR_Identifier.setAlternatives(createRuleCall(PR_ID));
			PR_LOWER.setAlternatives(createRuleCall(TR_INT));
			PR_MultiplicityBoundsCS.setAlternatives(createGroup(createAssignment("lowerBound", "=", createRuleCall(PR_LOWER)), setCardinality("?", createGroup(createKeyword(".."), createAssignment("upperBound", "=", createRuleCall(PR_UPPER))))));
			PR_MultiplicityCS.setAlternatives(createGroup(createKeyword("["), createAlternatives(createRuleCall(PR_MultiplicityBoundsCS), createRuleCall(PR_MultiplicityStringCS)), setCardinality("?", createAlternatives(createKeyword("|?"), createAssignment("isNullFree", "?=", createKeyword("|1")))), createKeyword("]")));
			PR_MultiplicityStringCS.setAlternatives(createAssignment("stringBounds", "=", createAlternatives(createKeyword("*"), createKeyword("+"), createKeyword("?"))));
			PR_NUMBER_LITERAL.setAlternatives(createRuleCall(TR_INT));
			PR_NextPathElementCS.setAlternatives(createAssignment("referredElement", "=", createCrossReference(createTypeRef(MM_pivot, org.eclipse.ocl.pivot.PivotPackage.Literals.NAMED_ELEMENT), createRuleCall(_EssentialOCL.PR_UnreservedName))));
			PR_PathNameCS.setAlternatives(createGroup(createAssignment("ownedPathElements", "+=", createRuleCall(PR_FirstPathElementCS)), setCardinality("*", createGroup(createKeyword("::"), createAssignment("ownedPathElements", "+=", createRuleCall(PR_NextPathElementCS))))));
			PR_StringLiteral.setAlternatives(createRuleCall(TR_SINGLE_QUOTED_STRING));
			PR_TemplateBindingCS.setAlternatives(createGroup(createAssignment("ownedSubstitutions", "+=", createRuleCall(PR_TemplateParameterSubstitutionCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedSubstitutions", "+=", createRuleCall(PR_TemplateParameterSubstitutionCS)))), setCardinality("?", createAssignment("ownedMultiplicity", "=", createRuleCall(_QVTOperational.PR_MultiplicityCS)))));
			PR_TemplateParameterSubstitutionCS.setAlternatives(createAssignment("ownedActualParameter", "=", createRuleCall(_QVTOperational.PR_TypeRefCS)));
			PR_TemplateSignatureCS.setAlternatives(createGroup(createKeyword("("), createAssignment("ownedParameters", "+=", createRuleCall(PR_TypeParameterCS)), setCardinality("*", createGroup(createKeyword(","), createAssignment("ownedParameters", "+=", createRuleCall(PR_TypeParameterCS)))), createKeyword(")")));
			PR_TypeParameterCS.setAlternatives(createGroup(createAssignment("name", "=", createRuleCall(_EssentialOCL.PR_UnrestrictedName)), setCardinality("?", createGroup(createKeyword("extends"), createAssignment("ownedExtends", "+=", createRuleCall(PR_TypedRefCS)), setCardinality("*", createGroup(createKeyword("&&"), createAssignment("ownedExtends", "+=", createRuleCall(PR_TypedRefCS))))))));
			PR_TypeRefCS.setAlternatives(createAlternatives(createRuleCall(PR_TypedRefCS), createRuleCall(PR_WildcardTypeRefCS)));
			PR_TypedRefCS.setAlternatives(createRuleCall(PR_TypedTypeRefCS));
			PR_TypedTypeRefCS.setAlternatives(createGroup(createAssignment("ownedPathName", "=", createRuleCall(PR_PathNameCS)), setCardinality("?", createGroup(createKeyword("("), createAssignment("ownedBinding", "=", createRuleCall(PR_TemplateBindingCS)), createKeyword(")")))));
			PR_UPPER.setAlternatives(createAlternatives(createRuleCall(TR_INT), createKeyword("*")));
			PR_URI.setAlternatives(createRuleCall(TR_SINGLE_QUOTED_STRING));
			PR_UnreservedName.setAlternatives(createRuleCall(_EssentialOCL.PR_UnrestrictedName));
			PR_UnrestrictedName.setAlternatives(createRuleCall(PR_Identifier));
			PR_WildcardTypeRefCS.setAlternatives(createGroup(createAction(null, null, createTypeRef(MM, org.eclipse.ocl.xtext.basecs.BaseCSPackage.Literals.WILDCARD_TYPE_REF_CS)), createKeyword("?"), setCardinality("?", createGroup(createKeyword("extends"), createAssignment("ownedExtends", "=", createRuleCall(PR_TypedRefCS))))));
		}

		private static @NonNull Grammar initGrammar() {
			initTerminalRules();
			initParserRules();
			Grammar grammar = G_Base;
			grammar.setDefinesHiddenTokens(true);
			{
				List<AbstractMetamodelDeclaration> metamodelDeclarations = grammar.getMetamodelDeclarations();
				metamodelDeclarations.add(MM_ecore);
				metamodelDeclarations.add(MM_pivot);
				metamodelDeclarations.add(MM);
			}
			{
				List<AbstractRule> rules = grammar.getRules();
				rules.add(PR_MultiplicityBoundsCS);
				rules.add(PR_MultiplicityCS);
				rules.add(PR_MultiplicityStringCS);
				rules.add(PR_PathNameCS);
				rules.add(PR_FirstPathElementCS);
				rules.add(PR_NextPathElementCS);
				rules.add(PR_TemplateBindingCS);
				rules.add(PR_TemplateParameterSubstitutionCS);
				rules.add(PR_TemplateSignatureCS);
				rules.add(PR_TypeParameterCS);
				rules.add(PR_TypeRefCS);
				rules.add(PR_TypedRefCS);
				rules.add(PR_TypedTypeRefCS);
				rules.add(PR_UnreservedName);
				rules.add(PR_UnrestrictedName);
				rules.add(PR_WildcardTypeRefCS);
				rules.add(PR_ID);
				rules.add(PR_Identifier);
				rules.add(PR_LOWER);
				rules.add(PR_NUMBER_LITERAL);
				rules.add(PR_StringLiteral);
				rules.add(PR_UPPER);
				rules.add(PR_URI);
				rules.add(TR_ESCAPED_CHARACTER);
				rules.add(TR_LETTER_CHARACTER);
				rules.add(TR_DOUBLE_QUOTED_STRING);
				rules.add(TR_SINGLE_QUOTED_STRING);
				rules.add(TR_ML_SINGLE_QUOTED_STRING);
				rules.add(TR_SIMPLE_ID);
				rules.add(TR_ESCAPED_ID);
				rules.add(TR_INT);
				rules.add(TR_ML_COMMENT);
				rules.add(TR_SL_COMMENT);
				rules.add(TR_WS);
				rules.add(TR_ANY_OTHER);
			}
			{
				List<AbstractRule> hiddenTokens = grammar.getHiddenTokens();
				hiddenTokens.add(TR_WS);
				hiddenTokens.add(TR_ML_COMMENT);
				hiddenTokens.add(TR_SL_COMMENT);
			}
			return grammar;
		}
	}
}
