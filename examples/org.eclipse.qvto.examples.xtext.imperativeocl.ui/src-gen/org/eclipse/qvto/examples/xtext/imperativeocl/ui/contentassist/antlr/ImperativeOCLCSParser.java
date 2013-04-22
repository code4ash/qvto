/*
* generated by Xtext
*/
package org.eclipse.qvto.examples.xtext.imperativeocl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.qvto.examples.xtext.imperativeocl.services.ImperativeOCLCSGrammarAccess;

public class ImperativeOCLCSParser extends AbstractContentAssistParser {
	
	@Inject
	private ImperativeOCLCSGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.qvto.examples.xtext.imperativeocl.ui.contentassist.antlr.internal.InternalImperativeOCLCSParser createParser() {
		org.eclipse.qvto.examples.xtext.imperativeocl.ui.contentassist.antlr.internal.InternalImperativeOCLCSParser result = new org.eclipse.qvto.examples.xtext.imperativeocl.ui.contentassist.antlr.internal.InternalImperativeOCLCSParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getImperativeOCLReservedKeywordAccess().getAlternatives(), "rule__ImperativeOCLReservedKeyword__Alternatives");
					put(grammarAccess.getImperativeOCLPrefixOperatorAccess().getAlternatives(), "rule__ImperativeOCLPrefixOperator__Alternatives");
					put(grammarAccess.getImperativeOCLInfixOperatorAccess().getAlternatives(), "rule__ImperativeOCLInfixOperator__Alternatives");
					put(grammarAccess.getTypeLiteralCSAccess().getAlternatives(), "rule__TypeLiteralCS__Alternatives");
					put(grammarAccess.getPrimaryExpCSAccess().getAlternatives(), "rule__PrimaryExpCS__Alternatives");
					put(grammarAccess.getPrimaryExpCSAccess().getAlternatives_10_2(), "rule__PrimaryExpCS__Alternatives_10_2");
					put(grammarAccess.getPrimaryExpCSAccess().getAlternatives_10_2_1_2(), "rule__PrimaryExpCS__Alternatives_10_2_1_2");
					put(grammarAccess.getIDAccess().getAlternatives(), "rule__ID__Alternatives");
					put(grammarAccess.getUPPERAccess().getAlternatives(), "rule__UPPER__Alternatives");
					put(grammarAccess.getEssentialOCLReservedKeywordAccess().getAlternatives(), "rule__EssentialOCLReservedKeyword__Alternatives");
					put(grammarAccess.getEssentialOCLUnaryOperatorCSAccess().getNameAlternatives_0(), "rule__EssentialOCLUnaryOperatorCS__NameAlternatives_0");
					put(grammarAccess.getEssentialOCLInfixOperatorCSAccess().getNameAlternatives_0(), "rule__EssentialOCLInfixOperatorCS__NameAlternatives_0");
					put(grammarAccess.getEssentialOCLNavigationOperatorCSAccess().getNameAlternatives_0(), "rule__EssentialOCLNavigationOperatorCS__NameAlternatives_0");
					put(grammarAccess.getBinaryOperatorCSAccess().getAlternatives(), "rule__BinaryOperatorCS__Alternatives");
					put(grammarAccess.getEssentialOCLUnreservedNameAccess().getAlternatives(), "rule__EssentialOCLUnreservedName__Alternatives");
					put(grammarAccess.getURIFirstPathElementCSAccess().getAlternatives(), "rule__URIFirstPathElementCS__Alternatives");
					put(grammarAccess.getPrimitiveTypeIdentifierAccess().getAlternatives(), "rule__PrimitiveTypeIdentifier__Alternatives");
					put(grammarAccess.getCollectionTypeIdentifierAccess().getAlternatives(), "rule__CollectionTypeIdentifier__Alternatives");
					put(grammarAccess.getMultiplicityCSAccess().getAlternatives_1(), "rule__MultiplicityCS__Alternatives_1");
					put(grammarAccess.getMultiplicityStringCSAccess().getStringBoundsAlternatives_0(), "rule__MultiplicityStringCS__StringBoundsAlternatives_0");
					put(grammarAccess.getPrimitiveLiteralExpCSAccess().getAlternatives(), "rule__PrimitiveLiteralExpCS__Alternatives");
					put(grammarAccess.getBooleanLiteralExpCSAccess().getAlternatives(), "rule__BooleanLiteralExpCS__Alternatives");
					put(grammarAccess.getTypeExpCSAccess().getAlternatives_0(), "rule__TypeExpCS__Alternatives_0");
					put(grammarAccess.getExpCSAccess().getAlternatives(), "rule__ExpCS__Alternatives");
					put(grammarAccess.getExpCSAccess().getAlternatives_0_1_2(), "rule__ExpCS__Alternatives_0_1_2");
					put(grammarAccess.getPrefixedExpCSAccess().getAlternatives(), "rule__PrefixedExpCS__Alternatives");
					put(grammarAccess.getListTypeCSAccess().getGroup(), "rule__ListTypeCS__Group__0");
					put(grammarAccess.getDictTypeCSAccess().getGroup(), "rule__DictTypeCS__Group__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_10(), "rule__PrimaryExpCS__Group_10__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_10_2_0(), "rule__PrimaryExpCS__Group_10_2_0__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_10_2_0_3(), "rule__PrimaryExpCS__Group_10_2_0_3__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_10_2_0_5(), "rule__PrimaryExpCS__Group_10_2_0_5__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_10_2_0_5_2(), "rule__PrimaryExpCS__Group_10_2_0_5_2__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_10_2_0_6(), "rule__PrimaryExpCS__Group_10_2_0_6__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_10_2_1(), "rule__PrimaryExpCS__Group_10_2_1__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_10_2_1_2_0(), "rule__PrimaryExpCS__Group_10_2_1_2_0__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_10_2_1_2_0_1(), "rule__PrimaryExpCS__Group_10_2_1_2_0_1__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_10_2_2(), "rule__PrimaryExpCS__Group_10_2_2__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_10_2_2_0(), "rule__PrimaryExpCS__Group_10_2_2_0__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_10_2_2_1(), "rule__PrimaryExpCS__Group_10_2_2_1__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_10_2_2_1_2(), "rule__PrimaryExpCS__Group_10_2_2_1_2__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_10_2_2_1_2_2(), "rule__PrimaryExpCS__Group_10_2_2_1_2_2__0");
					put(grammarAccess.getPrimaryExpCSAccess().getGroup_10_2_2_1_2_3(), "rule__PrimaryExpCS__Group_10_2_2_1_2_3__0");
					put(grammarAccess.getListLiteralExpCSAccess().getGroup(), "rule__ListLiteralExpCS__Group__0");
					put(grammarAccess.getListLiteralExpCSAccess().getGroup_3(), "rule__ListLiteralExpCS__Group_3__0");
					put(grammarAccess.getListLiteralExpCSAccess().getGroup_3_1(), "rule__ListLiteralExpCS__Group_3_1__0");
					put(grammarAccess.getDictLiteralExpCSAccess().getGroup(), "rule__DictLiteralExpCS__Group__0");
					put(grammarAccess.getDictLiteralExpCSAccess().getGroup_3(), "rule__DictLiteralExpCS__Group_3__0");
					put(grammarAccess.getDictLiteralExpCSAccess().getGroup_3_1(), "rule__DictLiteralExpCS__Group_3_1__0");
					put(grammarAccess.getDictLiteralPartCSAccess().getGroup(), "rule__DictLiteralPartCS__Group__0");
					put(grammarAccess.getReturnExpCSAccess().getGroup(), "rule__ReturnExpCS__Group__0");
					put(grammarAccess.getPathNameCSAccess().getGroup(), "rule__PathNameCS__Group__0");
					put(grammarAccess.getPathNameCSAccess().getGroup_1(), "rule__PathNameCS__Group_1__0");
					put(grammarAccess.getURIPathNameCSAccess().getGroup(), "rule__URIPathNameCS__Group__0");
					put(grammarAccess.getURIPathNameCSAccess().getGroup_1(), "rule__URIPathNameCS__Group_1__0");
					put(grammarAccess.getURIFirstPathElementCSAccess().getGroup_1(), "rule__URIFirstPathElementCS__Group_1__0");
					put(grammarAccess.getCollectionTypeCSAccess().getGroup(), "rule__CollectionTypeCS__Group__0");
					put(grammarAccess.getCollectionTypeCSAccess().getGroup_1(), "rule__CollectionTypeCS__Group_1__0");
					put(grammarAccess.getMultiplicityBoundsCSAccess().getGroup(), "rule__MultiplicityBoundsCS__Group__0");
					put(grammarAccess.getMultiplicityBoundsCSAccess().getGroup_1(), "rule__MultiplicityBoundsCS__Group_1__0");
					put(grammarAccess.getMultiplicityCSAccess().getGroup(), "rule__MultiplicityCS__Group__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup(), "rule__TupleTypeCS__Group__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup_1(), "rule__TupleTypeCS__Group_1__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup_1_1(), "rule__TupleTypeCS__Group_1_1__0");
					put(grammarAccess.getTupleTypeCSAccess().getGroup_1_1_1(), "rule__TupleTypeCS__Group_1_1_1__0");
					put(grammarAccess.getTuplePartCSAccess().getGroup(), "rule__TuplePartCS__Group__0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getGroup(), "rule__CollectionLiteralExpCS__Group__0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getGroup_2(), "rule__CollectionLiteralExpCS__Group_2__0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getGroup_2_1(), "rule__CollectionLiteralExpCS__Group_2_1__0");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getGroup(), "rule__CollectionLiteralPartCS__Group__0");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getGroup_1(), "rule__CollectionLiteralPartCS__Group_1__0");
					put(grammarAccess.getConstructorPartCSAccess().getGroup(), "rule__ConstructorPartCS__Group__0");
					put(grammarAccess.getTupleLiteralExpCSAccess().getGroup(), "rule__TupleLiteralExpCS__Group__0");
					put(grammarAccess.getTupleLiteralExpCSAccess().getGroup_3(), "rule__TupleLiteralExpCS__Group_3__0");
					put(grammarAccess.getTupleLiteralPartCSAccess().getGroup(), "rule__TupleLiteralPartCS__Group__0");
					put(grammarAccess.getTupleLiteralPartCSAccess().getGroup_1(), "rule__TupleLiteralPartCS__Group_1__0");
					put(grammarAccess.getUnlimitedNaturalLiteralExpCSAccess().getGroup(), "rule__UnlimitedNaturalLiteralExpCS__Group__0");
					put(grammarAccess.getInvalidLiteralExpCSAccess().getGroup(), "rule__InvalidLiteralExpCS__Group__0");
					put(grammarAccess.getNullLiteralExpCSAccess().getGroup(), "rule__NullLiteralExpCS__Group__0");
					put(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getGroup(), "rule__TypeLiteralWithMultiplicityCS__Group__0");
					put(grammarAccess.getTypeExpCSAccess().getGroup(), "rule__TypeExpCS__Group__0");
					put(grammarAccess.getExpCSAccess().getGroup_0(), "rule__ExpCS__Group_0__0");
					put(grammarAccess.getExpCSAccess().getGroup_0_1(), "rule__ExpCS__Group_0_1__0");
					put(grammarAccess.getExpCSAccess().getGroup_0_1_2_0(), "rule__ExpCS__Group_0_1_2_0__0");
					put(grammarAccess.getExpCSAccess().getGroup_0_1_2_0_1(), "rule__ExpCS__Group_0_1_2_0_1__0");
					put(grammarAccess.getExpCSAccess().getGroup_0_1_2_0_2(), "rule__ExpCS__Group_0_1_2_0_2__0");
					put(grammarAccess.getExpCSAccess().getGroup_1(), "rule__ExpCS__Group_1__0");
					put(grammarAccess.getPrefixedExpCSAccess().getGroup_0(), "rule__PrefixedExpCS__Group_0__0");
					put(grammarAccess.getNavigatingArgCSAccess().getGroup(), "rule__NavigatingArgCS__Group__0");
					put(grammarAccess.getNavigatingArgCSAccess().getGroup_1(), "rule__NavigatingArgCS__Group_1__0");
					put(grammarAccess.getNavigatingArgCSAccess().getGroup_1_2(), "rule__NavigatingArgCS__Group_1_2__0");
					put(grammarAccess.getNavigatingBarArgCSAccess().getGroup(), "rule__NavigatingBarArgCS__Group__0");
					put(grammarAccess.getNavigatingBarArgCSAccess().getGroup_2(), "rule__NavigatingBarArgCS__Group_2__0");
					put(grammarAccess.getNavigatingBarArgCSAccess().getGroup_2_2(), "rule__NavigatingBarArgCS__Group_2_2__0");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getGroup(), "rule__NavigatingCommaArgCS__Group__0");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getGroup_2(), "rule__NavigatingCommaArgCS__Group_2__0");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getGroup_2_2(), "rule__NavigatingCommaArgCS__Group_2_2__0");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getGroup(), "rule__NavigatingSemiArgCS__Group__0");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getGroup_2(), "rule__NavigatingSemiArgCS__Group_2__0");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getGroup_2_2(), "rule__NavigatingSemiArgCS__Group_2_2__0");
					put(grammarAccess.getIfExpCSAccess().getGroup(), "rule__IfExpCS__Group__0");
					put(grammarAccess.getLetExpCSAccess().getGroup(), "rule__LetExpCS__Group__0");
					put(grammarAccess.getLetExpCSAccess().getGroup_2(), "rule__LetExpCS__Group_2__0");
					put(grammarAccess.getLetVariableCSAccess().getGroup(), "rule__LetVariableCS__Group__0");
					put(grammarAccess.getLetVariableCSAccess().getGroup_1(), "rule__LetVariableCS__Group_1__0");
					put(grammarAccess.getNestedExpCSAccess().getGroup(), "rule__NestedExpCS__Group__0");
					put(grammarAccess.getSelfExpCSAccess().getGroup(), "rule__SelfExpCS__Group__0");
					put(grammarAccess.getListTypeCSAccess().getTypeAssignment_2(), "rule__ListTypeCS__TypeAssignment_2");
					put(grammarAccess.getDictTypeCSAccess().getKeyTypeAssignment_2(), "rule__DictTypeCS__KeyTypeAssignment_2");
					put(grammarAccess.getDictTypeCSAccess().getValueTypeAssignment_4(), "rule__DictTypeCS__ValueTypeAssignment_4");
					put(grammarAccess.getPrimaryExpCSAccess().getPathNameAssignment_10_1(), "rule__PrimaryExpCS__PathNameAssignment_10_1");
					put(grammarAccess.getPrimaryExpCSAccess().getFirstIndexesAssignment_10_2_0_2(), "rule__PrimaryExpCS__FirstIndexesAssignment_10_2_0_2");
					put(grammarAccess.getPrimaryExpCSAccess().getFirstIndexesAssignment_10_2_0_3_1(), "rule__PrimaryExpCS__FirstIndexesAssignment_10_2_0_3_1");
					put(grammarAccess.getPrimaryExpCSAccess().getSecondIndexesAssignment_10_2_0_5_1(), "rule__PrimaryExpCS__SecondIndexesAssignment_10_2_0_5_1");
					put(grammarAccess.getPrimaryExpCSAccess().getSecondIndexesAssignment_10_2_0_5_2_1(), "rule__PrimaryExpCS__SecondIndexesAssignment_10_2_0_5_2_1");
					put(grammarAccess.getPrimaryExpCSAccess().getAtPreAssignment_10_2_0_6_0(), "rule__PrimaryExpCS__AtPreAssignment_10_2_0_6_0");
					put(grammarAccess.getPrimaryExpCSAccess().getOwnedPartsAssignment_10_2_1_2_0_0(), "rule__PrimaryExpCS__OwnedPartsAssignment_10_2_1_2_0_0");
					put(grammarAccess.getPrimaryExpCSAccess().getOwnedPartsAssignment_10_2_1_2_0_1_1(), "rule__PrimaryExpCS__OwnedPartsAssignment_10_2_1_2_0_1_1");
					put(grammarAccess.getPrimaryExpCSAccess().getValueAssignment_10_2_1_2_1(), "rule__PrimaryExpCS__ValueAssignment_10_2_1_2_1");
					put(grammarAccess.getPrimaryExpCSAccess().getAtPreAssignment_10_2_2_0_0(), "rule__PrimaryExpCS__AtPreAssignment_10_2_2_0_0");
					put(grammarAccess.getPrimaryExpCSAccess().getArgumentAssignment_10_2_2_1_2_0(), "rule__PrimaryExpCS__ArgumentAssignment_10_2_2_1_2_0");
					put(grammarAccess.getPrimaryExpCSAccess().getArgumentAssignment_10_2_2_1_2_1(), "rule__PrimaryExpCS__ArgumentAssignment_10_2_2_1_2_1");
					put(grammarAccess.getPrimaryExpCSAccess().getArgumentAssignment_10_2_2_1_2_2_0(), "rule__PrimaryExpCS__ArgumentAssignment_10_2_2_1_2_2_0");
					put(grammarAccess.getPrimaryExpCSAccess().getArgumentAssignment_10_2_2_1_2_2_1(), "rule__PrimaryExpCS__ArgumentAssignment_10_2_2_1_2_2_1");
					put(grammarAccess.getPrimaryExpCSAccess().getArgumentAssignment_10_2_2_1_2_3_0(), "rule__PrimaryExpCS__ArgumentAssignment_10_2_2_1_2_3_0");
					put(grammarAccess.getPrimaryExpCSAccess().getArgumentAssignment_10_2_2_1_2_3_1(), "rule__PrimaryExpCS__ArgumentAssignment_10_2_2_1_2_3_1");
					put(grammarAccess.getListLiteralExpCSAccess().getOwnedPartsAssignment_3_0(), "rule__ListLiteralExpCS__OwnedPartsAssignment_3_0");
					put(grammarAccess.getListLiteralExpCSAccess().getOwnedPartsAssignment_3_1_1(), "rule__ListLiteralExpCS__OwnedPartsAssignment_3_1_1");
					put(grammarAccess.getDictLiteralExpCSAccess().getOwnedPartsAssignment_3_0(), "rule__DictLiteralExpCS__OwnedPartsAssignment_3_0");
					put(grammarAccess.getDictLiteralExpCSAccess().getOwnedPartsAssignment_3_1_1(), "rule__DictLiteralExpCS__OwnedPartsAssignment_3_1_1");
					put(grammarAccess.getDictLiteralPartCSAccess().getKeyAssignment_0(), "rule__DictLiteralPartCS__KeyAssignment_0");
					put(grammarAccess.getDictLiteralPartCSAccess().getValueAssignment_2(), "rule__DictLiteralPartCS__ValueAssignment_2");
					put(grammarAccess.getReturnExpCSAccess().getValueAssignment_2(), "rule__ReturnExpCS__ValueAssignment_2");
					put(grammarAccess.getModelAccess().getOwnedExpressionAssignment(), "rule__Model__OwnedExpressionAssignment");
					put(grammarAccess.getEssentialOCLUnaryOperatorCSAccess().getNameAssignment(), "rule__EssentialOCLUnaryOperatorCS__NameAssignment");
					put(grammarAccess.getEssentialOCLInfixOperatorCSAccess().getNameAssignment(), "rule__EssentialOCLInfixOperatorCS__NameAssignment");
					put(grammarAccess.getEssentialOCLNavigationOperatorCSAccess().getNameAssignment(), "rule__EssentialOCLNavigationOperatorCS__NameAssignment");
					put(grammarAccess.getPathNameCSAccess().getPathAssignment_0(), "rule__PathNameCS__PathAssignment_0");
					put(grammarAccess.getPathNameCSAccess().getPathAssignment_1_1(), "rule__PathNameCS__PathAssignment_1_1");
					put(grammarAccess.getFirstPathElementCSAccess().getElementAssignment(), "rule__FirstPathElementCS__ElementAssignment");
					put(grammarAccess.getNextPathElementCSAccess().getElementAssignment(), "rule__NextPathElementCS__ElementAssignment");
					put(grammarAccess.getURIPathNameCSAccess().getPathAssignment_0(), "rule__URIPathNameCS__PathAssignment_0");
					put(grammarAccess.getURIPathNameCSAccess().getPathAssignment_1_1(), "rule__URIPathNameCS__PathAssignment_1_1");
					put(grammarAccess.getURIFirstPathElementCSAccess().getElementAssignment_0(), "rule__URIFirstPathElementCS__ElementAssignment_0");
					put(grammarAccess.getURIFirstPathElementCSAccess().getElementAssignment_1_1(), "rule__URIFirstPathElementCS__ElementAssignment_1_1");
					put(grammarAccess.getPrimitiveTypeCSAccess().getNameAssignment(), "rule__PrimitiveTypeCS__NameAssignment");
					put(grammarAccess.getCollectionTypeCSAccess().getNameAssignment_0(), "rule__CollectionTypeCS__NameAssignment_0");
					put(grammarAccess.getCollectionTypeCSAccess().getOwnedTypeAssignment_1_1(), "rule__CollectionTypeCS__OwnedTypeAssignment_1_1");
					put(grammarAccess.getMultiplicityBoundsCSAccess().getLowerBoundAssignment_0(), "rule__MultiplicityBoundsCS__LowerBoundAssignment_0");
					put(grammarAccess.getMultiplicityBoundsCSAccess().getUpperBoundAssignment_1_1(), "rule__MultiplicityBoundsCS__UpperBoundAssignment_1_1");
					put(grammarAccess.getMultiplicityStringCSAccess().getStringBoundsAssignment(), "rule__MultiplicityStringCS__StringBoundsAssignment");
					put(grammarAccess.getTupleTypeCSAccess().getNameAssignment_0(), "rule__TupleTypeCS__NameAssignment_0");
					put(grammarAccess.getTupleTypeCSAccess().getOwnedPartsAssignment_1_1_0(), "rule__TupleTypeCS__OwnedPartsAssignment_1_1_0");
					put(grammarAccess.getTupleTypeCSAccess().getOwnedPartsAssignment_1_1_1_1(), "rule__TupleTypeCS__OwnedPartsAssignment_1_1_1_1");
					put(grammarAccess.getTuplePartCSAccess().getNameAssignment_0(), "rule__TuplePartCS__NameAssignment_0");
					put(grammarAccess.getTuplePartCSAccess().getOwnedTypeAssignment_2(), "rule__TuplePartCS__OwnedTypeAssignment_2");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedTypeAssignment_0(), "rule__CollectionLiteralExpCS__OwnedTypeAssignment_0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsAssignment_2_0(), "rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_0");
					put(grammarAccess.getCollectionLiteralExpCSAccess().getOwnedPartsAssignment_2_1_1(), "rule__CollectionLiteralExpCS__OwnedPartsAssignment_2_1_1");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getExpressionCSAssignment_0(), "rule__CollectionLiteralPartCS__ExpressionCSAssignment_0");
					put(grammarAccess.getCollectionLiteralPartCSAccess().getLastExpressionCSAssignment_1_1(), "rule__CollectionLiteralPartCS__LastExpressionCSAssignment_1_1");
					put(grammarAccess.getConstructorPartCSAccess().getPropertyAssignment_0(), "rule__ConstructorPartCS__PropertyAssignment_0");
					put(grammarAccess.getConstructorPartCSAccess().getInitExpressionAssignment_2(), "rule__ConstructorPartCS__InitExpressionAssignment_2");
					put(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsAssignment_2(), "rule__TupleLiteralExpCS__OwnedPartsAssignment_2");
					put(grammarAccess.getTupleLiteralExpCSAccess().getOwnedPartsAssignment_3_1(), "rule__TupleLiteralExpCS__OwnedPartsAssignment_3_1");
					put(grammarAccess.getTupleLiteralPartCSAccess().getNameAssignment_0(), "rule__TupleLiteralPartCS__NameAssignment_0");
					put(grammarAccess.getTupleLiteralPartCSAccess().getOwnedTypeAssignment_1_1(), "rule__TupleLiteralPartCS__OwnedTypeAssignment_1_1");
					put(grammarAccess.getTupleLiteralPartCSAccess().getInitExpressionAssignment_3(), "rule__TupleLiteralPartCS__InitExpressionAssignment_3");
					put(grammarAccess.getNumberLiteralExpCSAccess().getNameAssignment(), "rule__NumberLiteralExpCS__NameAssignment");
					put(grammarAccess.getStringLiteralExpCSAccess().getNameAssignment(), "rule__StringLiteralExpCS__NameAssignment");
					put(grammarAccess.getBooleanLiteralExpCSAccess().getNameAssignment_0(), "rule__BooleanLiteralExpCS__NameAssignment_0");
					put(grammarAccess.getBooleanLiteralExpCSAccess().getNameAssignment_1(), "rule__BooleanLiteralExpCS__NameAssignment_1");
					put(grammarAccess.getTypeLiteralWithMultiplicityCSAccess().getMultiplicityAssignment_1(), "rule__TypeLiteralWithMultiplicityCS__MultiplicityAssignment_1");
					put(grammarAccess.getTypeLiteralExpCSAccess().getOwnedTypeAssignment(), "rule__TypeLiteralExpCS__OwnedTypeAssignment");
					put(grammarAccess.getTypeNameExpCSAccess().getPathNameAssignment(), "rule__TypeNameExpCS__PathNameAssignment");
					put(grammarAccess.getTypeExpCSAccess().getMultiplicityAssignment_1(), "rule__TypeExpCS__MultiplicityAssignment_1");
					put(grammarAccess.getExpCSAccess().getOwnedOperatorAssignment_0_1_1(), "rule__ExpCS__OwnedOperatorAssignment_0_1_1");
					put(grammarAccess.getExpCSAccess().getOwnedExpressionAssignment_0_1_2_0_0(), "rule__ExpCS__OwnedExpressionAssignment_0_1_2_0_0");
					put(grammarAccess.getExpCSAccess().getOwnedOperatorAssignment_0_1_2_0_1_0(), "rule__ExpCS__OwnedOperatorAssignment_0_1_2_0_1_0");
					put(grammarAccess.getExpCSAccess().getOwnedExpressionAssignment_0_1_2_0_1_1(), "rule__ExpCS__OwnedExpressionAssignment_0_1_2_0_1_1");
					put(grammarAccess.getExpCSAccess().getOwnedOperatorAssignment_0_1_2_0_2_0(), "rule__ExpCS__OwnedOperatorAssignment_0_1_2_0_2_0");
					put(grammarAccess.getExpCSAccess().getOwnedExpressionAssignment_0_1_2_0_2_1(), "rule__ExpCS__OwnedExpressionAssignment_0_1_2_0_2_1");
					put(grammarAccess.getExpCSAccess().getOwnedExpressionAssignment_0_1_2_1(), "rule__ExpCS__OwnedExpressionAssignment_0_1_2_1");
					put(grammarAccess.getExpCSAccess().getOwnedOperatorAssignment_1_1(), "rule__ExpCS__OwnedOperatorAssignment_1_1");
					put(grammarAccess.getExpCSAccess().getOwnedExpressionAssignment_1_2(), "rule__ExpCS__OwnedExpressionAssignment_1_2");
					put(grammarAccess.getPrefixedExpCSAccess().getOwnedOperatorAssignment_0_1(), "rule__PrefixedExpCS__OwnedOperatorAssignment_0_1");
					put(grammarAccess.getPrefixedExpCSAccess().getOwnedExpressionAssignment_0_2(), "rule__PrefixedExpCS__OwnedExpressionAssignment_0_2");
					put(grammarAccess.getNavigatingArgCSAccess().getNameAssignment_0(), "rule__NavigatingArgCS__NameAssignment_0");
					put(grammarAccess.getNavigatingArgCSAccess().getOwnedTypeAssignment_1_1(), "rule__NavigatingArgCS__OwnedTypeAssignment_1_1");
					put(grammarAccess.getNavigatingArgCSAccess().getInitAssignment_1_2_1(), "rule__NavigatingArgCS__InitAssignment_1_2_1");
					put(grammarAccess.getNavigatingBarArgCSAccess().getPrefixAssignment_0(), "rule__NavigatingBarArgCS__PrefixAssignment_0");
					put(grammarAccess.getNavigatingBarArgCSAccess().getNameAssignment_1(), "rule__NavigatingBarArgCS__NameAssignment_1");
					put(grammarAccess.getNavigatingBarArgCSAccess().getOwnedTypeAssignment_2_1(), "rule__NavigatingBarArgCS__OwnedTypeAssignment_2_1");
					put(grammarAccess.getNavigatingBarArgCSAccess().getInitAssignment_2_2_1(), "rule__NavigatingBarArgCS__InitAssignment_2_2_1");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getPrefixAssignment_0(), "rule__NavigatingCommaArgCS__PrefixAssignment_0");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getNameAssignment_1(), "rule__NavigatingCommaArgCS__NameAssignment_1");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getOwnedTypeAssignment_2_1(), "rule__NavigatingCommaArgCS__OwnedTypeAssignment_2_1");
					put(grammarAccess.getNavigatingCommaArgCSAccess().getInitAssignment_2_2_1(), "rule__NavigatingCommaArgCS__InitAssignment_2_2_1");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getPrefixAssignment_0(), "rule__NavigatingSemiArgCS__PrefixAssignment_0");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getNameAssignment_1(), "rule__NavigatingSemiArgCS__NameAssignment_1");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getOwnedTypeAssignment_2_1(), "rule__NavigatingSemiArgCS__OwnedTypeAssignment_2_1");
					put(grammarAccess.getNavigatingSemiArgCSAccess().getInitAssignment_2_2_1(), "rule__NavigatingSemiArgCS__InitAssignment_2_2_1");
					put(grammarAccess.getIfExpCSAccess().getConditionAssignment_1(), "rule__IfExpCS__ConditionAssignment_1");
					put(grammarAccess.getIfExpCSAccess().getThenExpressionAssignment_3(), "rule__IfExpCS__ThenExpressionAssignment_3");
					put(grammarAccess.getIfExpCSAccess().getElseExpressionAssignment_5(), "rule__IfExpCS__ElseExpressionAssignment_5");
					put(grammarAccess.getLetExpCSAccess().getVariableAssignment_1(), "rule__LetExpCS__VariableAssignment_1");
					put(grammarAccess.getLetExpCSAccess().getVariableAssignment_2_1(), "rule__LetExpCS__VariableAssignment_2_1");
					put(grammarAccess.getLetExpCSAccess().getInAssignment_4(), "rule__LetExpCS__InAssignment_4");
					put(grammarAccess.getLetVariableCSAccess().getNameAssignment_0(), "rule__LetVariableCS__NameAssignment_0");
					put(grammarAccess.getLetVariableCSAccess().getOwnedTypeAssignment_1_1(), "rule__LetVariableCS__OwnedTypeAssignment_1_1");
					put(grammarAccess.getLetVariableCSAccess().getInitExpressionAssignment_3(), "rule__LetVariableCS__InitExpressionAssignment_3");
					put(grammarAccess.getNestedExpCSAccess().getSourceAssignment_1(), "rule__NestedExpCS__SourceAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.qvto.examples.xtext.imperativeocl.ui.contentassist.antlr.internal.InternalImperativeOCLCSParser typedParser = (org.eclipse.qvto.examples.xtext.imperativeocl.ui.contentassist.antlr.internal.InternalImperativeOCLCSParser) parser;
			typedParser.entryRuleGrammmarCS();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ImperativeOCLCSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ImperativeOCLCSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
