/*
* generated by Xtext
*/

package org.eclipse.xtext.example.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class DomainmodelGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class DomainModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DomainModel");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsAbstractElementParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//DomainModel:
		//	elements+=AbstractElement*;
		public ParserRule getRule() { return rule; }

		//elements+=AbstractElement*
		public Assignment getElementsAssignment() { return cElementsAssignment; }

		//AbstractElement
		public RuleCall getElementsAbstractElementParserRuleCall_0() { return cElementsAbstractElementParserRuleCall_0; }
	}

	public class AbstractElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AbstractElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPackageDeclarationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cImportParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//AbstractElement:
		//	PackageDeclaration | Type | Import;
		public ParserRule getRule() { return rule; }

		//PackageDeclaration | Type | Import
		public Alternatives getAlternatives() { return cAlternatives; }

		//PackageDeclaration
		public RuleCall getPackageDeclarationParserRuleCall_0() { return cPackageDeclarationParserRuleCall_0; }

		//Type
		public RuleCall getTypeParserRuleCall_1() { return cTypeParserRuleCall_1; }

		//Import
		public RuleCall getImportParserRuleCall_2() { return cImportParserRuleCall_2; }
	}

	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Import:
		//	"import" importedNamespace=QualifiedNameWithWildCard;
		public ParserRule getRule() { return rule; }

		//"import" importedNamespace=QualifiedNameWithWildCard
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//importedNamespace=QualifiedNameWithWildCard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }

		//QualifiedNameWithWildCard
		public RuleCall getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0; }
	}

	public class PackageDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PackageDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsAbstractElementParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//PackageDeclaration:
		//	"package" name=QualifiedName "{" elements+=AbstractElement* "}";
		public ParserRule getRule() { return rule; }

		//"package" name=QualifiedName "{" elements+=AbstractElement* "}"
		public Group getGroup() { return cGroup; }

		//"package"
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//elements+=AbstractElement*
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }

		//AbstractElement
		public RuleCall getElementsAbstractElementParserRuleCall_3_0() { return cElementsAbstractElementParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEntityParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDataTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Type:
		//	Entity | DataType;
		public ParserRule getRule() { return rule; }

		//Entity | DataType
		public Alternatives getAlternatives() { return cAlternatives; }

		//Entity
		public RuleCall getEntityParserRuleCall_0() { return cEntityParserRuleCall_0; }

		//DataType
		public RuleCall getDataTypeParserRuleCall_1() { return cDataTypeParserRuleCall_1; }
	}

	public class DataTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DataType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDatatypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//DataType:
		//	"datatype" name=ID;
		public ParserRule getRule() { return rule; }

		//"datatype" name=ID
		public Group getGroup() { return cGroup; }

		//"datatype"
		public Keyword getDatatypeKeyword_0() { return cDatatypeKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeEntityCrossReference_2_1_0 = (CrossReference)cSuperTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cSuperTypeEntityCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFeaturesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFeaturesFeatureParserRuleCall_4_0 = (RuleCall)cFeaturesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Entity:
		//	"entity" name=ID ("extends" superType=[Entity|QualifiedName])? "{" features+=Feature* "}";
		public ParserRule getRule() { return rule; }

		//"entity" name=ID ("extends" superType=[Entity|QualifiedName])? "{" features+=Feature* "}"
		public Group getGroup() { return cGroup; }

		//"entity"
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("extends" superType=[Entity|QualifiedName])?
		public Group getGroup_2() { return cGroup_2; }

		//"extends"
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }

		//superType=[Entity|QualifiedName]
		public Assignment getSuperTypeAssignment_2_1() { return cSuperTypeAssignment_2_1; }

		//[Entity|QualifiedName]
		public CrossReference getSuperTypeEntityCrossReference_2_1_0() { return cSuperTypeEntityCrossReference_2_1_0; }

		//QualifiedName
		public RuleCall getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1() { return cSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//features+=Feature*
		public Assignment getFeaturesAssignment_4() { return cFeaturesAssignment_4; }

		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_4_0() { return cFeaturesFeatureParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Feature");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cStructuralFeatureParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOperationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Feature:
		//	StructuralFeature | Operation;
		public ParserRule getRule() { return rule; }

		//StructuralFeature | Operation
		public Alternatives getAlternatives() { return cAlternatives; }

		//StructuralFeature
		public RuleCall getStructuralFeatureParserRuleCall_0() { return cStructuralFeatureParserRuleCall_0; }

		//Operation
		public RuleCall getOperationParserRuleCall_1() { return cOperationParserRuleCall_1; }
	}

	public class StructuralFeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StructuralFeature");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAttributeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cReferenceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//StructuralFeature:
		//	Attribute | Reference;
		public ParserRule getRule() { return rule; }

		//Attribute | Reference
		public Alternatives getAlternatives() { return cAlternatives; }

		//Attribute
		public RuleCall getAttributeParserRuleCall_0() { return cAttributeParserRuleCall_0; }

		//Reference
		public RuleCall getReferenceParserRuleCall_1() { return cReferenceParserRuleCall_1; }
	}

	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeRefParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//Attribute:
		//	name=ID ":" type=TypeRef;
		public ParserRule getRule() { return rule; }

		//name=ID ":" type=TypeRef
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//type=TypeRef
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_2_0() { return cTypeTypeRefParserRuleCall_2_0; }
	}

	public class ReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Reference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeTypeRefParserRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cOppositeKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cOppositeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cOppositeReferenceCrossReference_4_1_0 = (CrossReference)cOppositeAssignment_4_1.eContents().get(0);
		private final RuleCall cOppositeReferenceIDTerminalRuleCall_4_1_0_1 = (RuleCall)cOppositeReferenceCrossReference_4_1_0.eContents().get(1);
		
		//Reference:
		//	"ref" name=ID ":" type=TypeRef ("opposite" opposite=[Reference])?;
		public ParserRule getRule() { return rule; }

		//"ref" name=ID ":" type=TypeRef ("opposite" opposite=[Reference])?
		public Group getGroup() { return cGroup; }

		//"ref"
		public Keyword getRefKeyword_0() { return cRefKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//type=TypeRef
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }

		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_3_0() { return cTypeTypeRefParserRuleCall_3_0; }

		//("opposite" opposite=[Reference])?
		public Group getGroup_4() { return cGroup_4; }

		//"opposite"
		public Keyword getOppositeKeyword_4_0() { return cOppositeKeyword_4_0; }

		//opposite=[Reference]
		public Assignment getOppositeAssignment_4_1() { return cOppositeAssignment_4_1; }

		//[Reference]
		public CrossReference getOppositeReferenceCrossReference_4_1_0() { return cOppositeReferenceCrossReference_4_1_0; }

		//ID
		public RuleCall getOppositeReferenceIDTerminalRuleCall_4_1_0_1() { return cOppositeReferenceIDTerminalRuleCall_4_1_0_1; }
	}

	public class OperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Operation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cVisibilityAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cVisibilityVisibilityEnumRuleCall_0_0 = (RuleCall)cVisibilityAssignment_0.eContents().get(0);
		private final Keyword cOpKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Assignment cParamsAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final RuleCall cParamsParameterParserRuleCall_4_0_0 = (RuleCall)cParamsAssignment_4_0.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cGroup_4.eContents().get(1);
		private final Keyword cCommaKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Assignment cParamsAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final RuleCall cParamsParameterParserRuleCall_4_1_1_0 = (RuleCall)cParamsAssignment_4_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cTypeAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cTypeTypeRefParserRuleCall_7_0 = (RuleCall)cTypeAssignment_7.eContents().get(0);
		
		//Operation:
		//	visibility=Visibility? "op" name=ID "(" (params+=Parameter ("," params+=Parameter)*)? ")" ":" type=TypeRef;
		public ParserRule getRule() { return rule; }

		//visibility=Visibility? "op" name=ID "(" (params+=Parameter ("," params+=Parameter)*)? ")" ":" type=TypeRef
		public Group getGroup() { return cGroup; }

		//visibility=Visibility?
		public Assignment getVisibilityAssignment_0() { return cVisibilityAssignment_0; }

		//Visibility
		public RuleCall getVisibilityVisibilityEnumRuleCall_0_0() { return cVisibilityVisibilityEnumRuleCall_0_0; }

		//"op"
		public Keyword getOpKeyword_1() { return cOpKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }

		//(params+=Parameter ("," params+=Parameter)*)?
		public Group getGroup_4() { return cGroup_4; }

		//params+=Parameter
		public Assignment getParamsAssignment_4_0() { return cParamsAssignment_4_0; }

		//Parameter
		public RuleCall getParamsParameterParserRuleCall_4_0_0() { return cParamsParameterParserRuleCall_4_0_0; }

		//("," params+=Parameter)*
		public Group getGroup_4_1() { return cGroup_4_1; }

		//","
		public Keyword getCommaKeyword_4_1_0() { return cCommaKeyword_4_1_0; }

		//params+=Parameter
		public Assignment getParamsAssignment_4_1_1() { return cParamsAssignment_4_1_1; }

		//Parameter
		public RuleCall getParamsParameterParserRuleCall_4_1_1_0() { return cParamsParameterParserRuleCall_4_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }

		//":"
		public Keyword getColonKeyword_6() { return cColonKeyword_6; }

		//type=TypeRef
		public Assignment getTypeAssignment_7() { return cTypeAssignment_7; }

		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_7_0() { return cTypeTypeRefParserRuleCall_7_0; }
	}

	public class ParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Parameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeTypeRefParserRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		
		//Parameter:
		//	name=ID type=TypeRef;
		public ParserRule getRule() { return rule; }

		//name=ID type=TypeRef
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//type=TypeRef
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//TypeRef
		public RuleCall getTypeTypeRefParserRuleCall_1_0() { return cTypeTypeRefParserRuleCall_1_0; }
	}

	public class TypedElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TypedElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFeatureParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cParameterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//TypedElement:
		//	Feature | Parameter;
		public ParserRule getRule() { return rule; }

		//Feature | Parameter
		public Alternatives getAlternatives() { return cAlternatives; }

		//Feature
		public RuleCall getFeatureParserRuleCall_0() { return cFeatureParserRuleCall_0; }

		//Parameter
		public RuleCall getParameterParserRuleCall_1() { return cParameterParserRuleCall_1; }
	}

	public class TypeRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TypeRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cReferencedAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cReferencedTypeCrossReference_0_0 = (CrossReference)cReferencedAssignment_0.eContents().get(0);
		private final RuleCall cReferencedTypeQualifiedNameParserRuleCall_0_0_1 = (RuleCall)cReferencedTypeCrossReference_0_0.eContents().get(1);
		private final Assignment cMultiAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cMultiAsteriskKeyword_1_0 = (Keyword)cMultiAssignment_1.eContents().get(0);
		
		//TypeRef:
		//	referenced=[Type|QualifiedName] multi?="*"?;
		public ParserRule getRule() { return rule; }

		//referenced=[Type|QualifiedName] multi?="*"?
		public Group getGroup() { return cGroup; }

		//referenced=[Type|QualifiedName]
		public Assignment getReferencedAssignment_0() { return cReferencedAssignment_0; }

		//[Type|QualifiedName]
		public CrossReference getReferencedTypeCrossReference_0_0() { return cReferencedTypeCrossReference_0_0; }

		//QualifiedName
		public RuleCall getReferencedTypeQualifiedNameParserRuleCall_0_0_1() { return cReferencedTypeQualifiedNameParserRuleCall_0_0_1; }

		//multi?="*"?
		public Assignment getMultiAssignment_1() { return cMultiAssignment_1; }

		//"*"
		public Keyword getMultiAsteriskKeyword_1_0() { return cMultiAsteriskKeyword_1_0; }
	}

	public class QualifiedNameWithWildCardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedNameWithWildCard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QualifiedNameWithWildCard returns ecore::EString:
		//	QualifiedName ".*"?;
		public ParserRule getRule() { return rule; }

		//QualifiedName ".*"?
		public Group getGroup() { return cGroup; }

		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }

		//".*"?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName returns ecore::EString:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	public class VisibilityElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "Visibility");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cPublicEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cPublicPublicKeyword_0_0 = (Keyword)cPublicEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPrivateEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPrivatePrivateKeyword_1_0 = (Keyword)cPrivateEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cProtectedEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cProtectedProtectedKeyword_2_0 = (Keyword)cProtectedEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum Visibility:
		//	public | private | protected;
		public EnumRule getRule() { return rule; }

		//public | private | protected
		public Alternatives getAlternatives() { return cAlternatives; }

		//public
		public EnumLiteralDeclaration getPublicEnumLiteralDeclaration_0() { return cPublicEnumLiteralDeclaration_0; }

		//"public"
		public Keyword getPublicPublicKeyword_0_0() { return cPublicPublicKeyword_0_0; }

		//private
		public EnumLiteralDeclaration getPrivateEnumLiteralDeclaration_1() { return cPrivateEnumLiteralDeclaration_1; }

		//"private"
		public Keyword getPrivatePrivateKeyword_1_0() { return cPrivatePrivateKeyword_1_0; }

		//protected
		public EnumLiteralDeclaration getProtectedEnumLiteralDeclaration_2() { return cProtectedEnumLiteralDeclaration_2; }

		//"protected"
		public Keyword getProtectedProtectedKeyword_2_0() { return cProtectedProtectedKeyword_2_0; }
	}
	
	private DomainModelElements pDomainModel;
	private AbstractElementElements pAbstractElement;
	private ImportElements pImport;
	private PackageDeclarationElements pPackageDeclaration;
	private TypeElements pType;
	private DataTypeElements pDataType;
	private EntityElements pEntity;
	private FeatureElements pFeature;
	private StructuralFeatureElements pStructuralFeature;
	private AttributeElements pAttribute;
	private ReferenceElements pReference;
	private OperationElements pOperation;
	private ParameterElements pParameter;
	private TypedElementElements pTypedElement;
	private TypeRefElements pTypeRef;
	private VisibilityElements unknownRuleVisibility;
	private QualifiedNameWithWildCardElements pQualifiedNameWithWildCard;
	private QualifiedNameElements pQualifiedName;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public DomainmodelGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//DomainModel:
	//	elements+=AbstractElement*;
	public DomainModelElements getDomainModelAccess() {
		return (pDomainModel != null) ? pDomainModel : (pDomainModel = new DomainModelElements());
	}
	
	public ParserRule getDomainModelRule() {
		return getDomainModelAccess().getRule();
	}

	//AbstractElement:
	//	PackageDeclaration | Type | Import;
	public AbstractElementElements getAbstractElementAccess() {
		return (pAbstractElement != null) ? pAbstractElement : (pAbstractElement = new AbstractElementElements());
	}
	
	public ParserRule getAbstractElementRule() {
		return getAbstractElementAccess().getRule();
	}

	//Import:
	//	"import" importedNamespace=QualifiedNameWithWildCard;
	public ImportElements getImportAccess() {
		return (pImport != null) ? pImport : (pImport = new ImportElements());
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}

	//PackageDeclaration:
	//	"package" name=QualifiedName "{" elements+=AbstractElement* "}";
	public PackageDeclarationElements getPackageDeclarationAccess() {
		return (pPackageDeclaration != null) ? pPackageDeclaration : (pPackageDeclaration = new PackageDeclarationElements());
	}
	
	public ParserRule getPackageDeclarationRule() {
		return getPackageDeclarationAccess().getRule();
	}

	//Type:
	//	Entity | DataType;
	public TypeElements getTypeAccess() {
		return (pType != null) ? pType : (pType = new TypeElements());
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}

	//DataType:
	//	"datatype" name=ID;
	public DataTypeElements getDataTypeAccess() {
		return (pDataType != null) ? pDataType : (pDataType = new DataTypeElements());
	}
	
	public ParserRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}

	//Entity:
	//	"entity" name=ID ("extends" superType=[Entity|QualifiedName])? "{" features+=Feature* "}";
	public EntityElements getEntityAccess() {
		return (pEntity != null) ? pEntity : (pEntity = new EntityElements());
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}

	//Feature:
	//	StructuralFeature | Operation;
	public FeatureElements getFeatureAccess() {
		return (pFeature != null) ? pFeature : (pFeature = new FeatureElements());
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}

	//StructuralFeature:
	//	Attribute | Reference;
	public StructuralFeatureElements getStructuralFeatureAccess() {
		return (pStructuralFeature != null) ? pStructuralFeature : (pStructuralFeature = new StructuralFeatureElements());
	}
	
	public ParserRule getStructuralFeatureRule() {
		return getStructuralFeatureAccess().getRule();
	}

	//Attribute:
	//	name=ID ":" type=TypeRef;
	public AttributeElements getAttributeAccess() {
		return (pAttribute != null) ? pAttribute : (pAttribute = new AttributeElements());
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}

	//Reference:
	//	"ref" name=ID ":" type=TypeRef ("opposite" opposite=[Reference])?;
	public ReferenceElements getReferenceAccess() {
		return (pReference != null) ? pReference : (pReference = new ReferenceElements());
	}
	
	public ParserRule getReferenceRule() {
		return getReferenceAccess().getRule();
	}

	//Operation:
	//	visibility=Visibility? "op" name=ID "(" (params+=Parameter ("," params+=Parameter)*)? ")" ":" type=TypeRef;
	public OperationElements getOperationAccess() {
		return (pOperation != null) ? pOperation : (pOperation = new OperationElements());
	}
	
	public ParserRule getOperationRule() {
		return getOperationAccess().getRule();
	}

	//Parameter:
	//	name=ID type=TypeRef;
	public ParameterElements getParameterAccess() {
		return (pParameter != null) ? pParameter : (pParameter = new ParameterElements());
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}

	//TypedElement:
	//	Feature | Parameter;
	public TypedElementElements getTypedElementAccess() {
		return (pTypedElement != null) ? pTypedElement : (pTypedElement = new TypedElementElements());
	}
	
	public ParserRule getTypedElementRule() {
		return getTypedElementAccess().getRule();
	}

	//TypeRef:
	//	referenced=[Type|QualifiedName] multi?="*"?;
	public TypeRefElements getTypeRefAccess() {
		return (pTypeRef != null) ? pTypeRef : (pTypeRef = new TypeRefElements());
	}
	
	public ParserRule getTypeRefRule() {
		return getTypeRefAccess().getRule();
	}

	//enum Visibility:
	//	public | private | protected;
	public VisibilityElements getVisibilityAccess() {
		return (unknownRuleVisibility != null) ? unknownRuleVisibility : (unknownRuleVisibility = new VisibilityElements());
	}
	
	public EnumRule getVisibilityRule() {
		return getVisibilityAccess().getRule();
	}

	//QualifiedNameWithWildCard returns ecore::EString:
	//	QualifiedName ".*"?;
	public QualifiedNameWithWildCardElements getQualifiedNameWithWildCardAccess() {
		return (pQualifiedNameWithWildCard != null) ? pQualifiedNameWithWildCard : (pQualifiedNameWithWildCard = new QualifiedNameWithWildCardElements());
	}
	
	public ParserRule getQualifiedNameWithWildCardRule() {
		return getQualifiedNameWithWildCardAccess().getRule();
	}

	//QualifiedName returns ecore::EString:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return (pQualifiedName != null) ? pQualifiedName : (pQualifiedName = new QualifiedNameElements());
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" | "n" |
	//	"f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}