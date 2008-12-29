/**
* <copyright>
*
* Copyright (c) 2005, 2008 IBM Corporation and others.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   IBM - Initial API and implementation
*   E.D.Willink - Elimination of some shift-reduce conflicts
*   E.D.Willink - Remove unnecessary warning suppression
*   E.D.Willink - 225493 Need ability to set CSTNode offsets
*
* </copyright>
*
* $Id: QvtOpLPGParsersym.java,v 1.39 2008/12/29 19:08:02 aigdalov Exp $
*/
/**
* <copyright>
*
* Copyright (c) 2006, 2007 Borland Inc.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   Borland - Initial API and implementation
*
* </copyright>
*
* $Id: QvtOpLPGParsersym.java,v 1.39 2008/12/29 19:08:02 aigdalov Exp $
*/
/**
* <copyright>
*
* Copyright (c) 2006, 2007 Borland Inc.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   Borland - Initial API and implementation
*
* </copyright>
*
* $Id: QvtOpLPGParsersym.java,v 1.39 2008/12/29 19:08:02 aigdalov Exp $
*/
/**
* <copyright>
*
* Copyright (c) 2006, 2007 Borland Inc.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   Borland - Initial API and implementation
*
* </copyright>
*
* $Id: QvtOpLPGParsersym.java,v 1.39 2008/12/29 19:08:02 aigdalov Exp $
*/

package org.eclipse.m2m.internal.qvt.oml.cst.parser;

public interface QvtOpLPGParsersym {
    public final static int
      TK_NUMERIC_OPERATION = 67,
      TK_STRING_LITERAL = 49,
      TK_INTEGER_LITERAL = 64,
      TK_REAL_LITERAL = 68,
      TK_PLUS = 50,
      TK_MINUS = 51,
      TK_MULTIPLY = 20,
      TK_DIVIDE = 27,
      TK_GREATER = 21,
      TK_LESS = 22,
      TK_EQUAL = 5,
      TK_GREATER_EQUAL = 23,
      TK_LESS_EQUAL = 24,
      TK_NOT_EQUAL = 25,
      TK_LPAREN = 1,
      TK_RPAREN = 3,
      TK_LBRACE = 87,
      TK_RBRACE = 88,
      TK_LBRACKET = 94,
      TK_RBRACKET = 107,
      TK_ARROW = 117,
      TK_BAR = 92,
      TK_COMMA = 89,
      TK_COLON = 90,
      TK_COLONCOLON = 91,
      TK_SEMICOLON = 86,
      TK_DOT = 100,
      TK_DOTDOT = 118,
      TK_ATPRE = 108,
      TK_CARET = 119,
      TK_CARETCARET = 120,
      TK_QUESTIONMARK = 111,
      TK_QUOTE_STRING_LITERAL = 121,
      TK_ADD_ASSIGN = 122,
      TK_RESET_ASSIGN = 95,
      TK_AT_SIGN = 147,
      TK_EXCLAMATION_MARK = 109,
      TK_NOT_EQUAL_EXEQ = 104,
      TK_INTEGER_RANGE_START = 123,
      TK_Dict = 170,
      TK_List = 110,
      TK_break = 171,
      TK_class = 148,
      TK_composes = 149,
      TK_constructor = 172,
      TK_continue = 173,
      TK_datatype = 174,
      TK_default = 175,
      TK_derived = 150,
      TK_do = 176,
      TK_elif = 177,
      TK_enum = 178,
      TK_except = 179,
      TK_exception = 180,
      TK_from = 181,
      TK_literal = 182,
      TK_ordered = 151,
      TK_primitive = 183,
      TK_raise = 184,
      TK_readonly = 152,
      TK_references = 153,
      TK_tag = 185,
      TK_try = 186,
      TK_typedef = 187,
      TK_unlimited = 188,
      TK_invalid = 189,
      TK_STEREOTYPE_QUALIFIER_OPEN = 139,
      TK_STEREOTYPE_QUALIFIER_CLOSE = 154,
      TK_MULTIPLICITY_RANGE = 155,
      TK_TILDE_SIGN = 156,
      TK_self = 44,
      TK_inv = 190,
      TK_pre = 191,
      TK_post = 192,
      TK_context = 193,
      TK_package = 194,
      TK_endpackage = 195,
      TK_def = 196,
      TK_if = 69,
      TK_then = 140,
      TK_else = 124,
      TK_endif = 125,
      TK_and = 45,
      TK_or = 46,
      TK_xor = 47,
      TK_not = 54,
      TK_implies = 126,
      TK_let = 77,
      TK_in = 105,
      TK_true = 70,
      TK_false = 71,
      TK_body = 28,
      TK_derive = 29,
      TK_init = 30,
      TK_null = 53,
      TK_attr = 197,
      TK_oper = 198,
      TK_Set = 6,
      TK_Bag = 7,
      TK_Sequence = 8,
      TK_Collection = 9,
      TK_OrderedSet = 10,
      TK_iterate = 31,
      TK_forAll = 32,
      TK_exists = 33,
      TK_isUnique = 34,
      TK_any = 35,
      TK_one = 36,
      TK_collect = 37,
      TK_select = 38,
      TK_reject = 39,
      TK_collectNested = 40,
      TK_sortedBy = 41,
      TK_closure = 42,
      TK_oclIsKindOf = 55,
      TK_oclIsTypeOf = 56,
      TK_oclAsType = 57,
      TK_oclIsNew = 58,
      TK_oclIsUndefined = 59,
      TK_oclIsInvalid = 60,
      TK_oclIsInState = 61,
      TK_allInstances = 43,
      TK_String = 11,
      TK_Integer = 12,
      TK_UnlimitedNatural = 13,
      TK_Real = 14,
      TK_Boolean = 15,
      TK_Tuple = 26,
      TK_OclAny = 16,
      TK_OclVoid = 17,
      TK_Invalid = 18,
      TK_OclMessage = 19,
      TK_OclInvalid = 72,
      TK_end = 101,
      TK_while = 73,
      TK_out = 127,
      TK_object = 74,
      TK_transformation = 128,
      TK_import = 141,
      TK_library = 112,
      TK_metamodel = 142,
      TK_mapping = 129,
      TK_query = 130,
      TK_helper = 131,
      TK_inout = 132,
      TK_when = 113,
      TK_var = 96,
      TK_configuration = 114,
      TK_intermediate = 115,
      TK_property = 106,
      TK_opposites = 157,
      TK_population = 143,
      TK_map = 62,
      TK_new = 75,
      TK_xmap = 63,
      TK_late = 65,
      TK_log = 93,
      TK_assert = 97,
      TK_with = 158,
      TK_resolve = 78,
      TK_resolveone = 79,
      TK_resolveIn = 80,
      TK_resolveoneIn = 81,
      TK_invresolve = 82,
      TK_invresolveone = 83,
      TK_invresolveIn = 84,
      TK_invresolveoneIn = 85,
      TK_modeltype = 144,
      TK_uses = 159,
      TK_where = 160,
      TK_refines = 161,
      TK_access = 102,
      TK_extends = 99,
      TK_blackbox = 133,
      TK_abstract = 134,
      TK_static = 116,
      TK_result = 48,
      TK_main = 103,
      TK_this = 52,
      TK_switch = 66,
      TK_case = 145,
      TK_xselect = 162,
      TK_xcollect = 163,
      TK_selectOne = 164,
      TK_collectOne = 165,
      TK_collectselect = 166,
      TK_collectselectOne = 167,
      TK_return = 98,
      TK_rename = 146,
      TK_disjuncts = 135,
      TK_merges = 136,
      TK_inherits = 137,
      TK_forEach = 168,
      TK_forOne = 169,
      TK_compute = 76,
      TK_EOF_TOKEN = 138,
      TK_IDENTIFIER = 2,
      TK_ERROR_TOKEN = 4;

      public final static String orderedTerminalSymbols[] = {
                 "",
                 "LPAREN",
                 "IDENTIFIER",
                 "RPAREN",
                 "ERROR_TOKEN",
                 "EQUAL",
                 "Set",
                 "Bag",
                 "Sequence",
                 "Collection",
                 "OrderedSet",
                 "String",
                 "Integer",
                 "UnlimitedNatural",
                 "Real",
                 "Boolean",
                 "OclAny",
                 "OclVoid",
                 "Invalid",
                 "OclMessage",
                 "MULTIPLY",
                 "GREATER",
                 "LESS",
                 "GREATER_EQUAL",
                 "LESS_EQUAL",
                 "NOT_EQUAL",
                 "Tuple",
                 "DIVIDE",
                 "body",
                 "derive",
                 "init",
                 "iterate",
                 "forAll",
                 "exists",
                 "isUnique",
                 "any",
                 "one",
                 "collect",
                 "select",
                 "reject",
                 "collectNested",
                 "sortedBy",
                 "closure",
                 "allInstances",
                 "self",
                 "and",
                 "or",
                 "xor",
                 "result",
                 "STRING_LITERAL",
                 "PLUS",
                 "MINUS",
                 "this",
                 "null",
                 "not",
                 "oclIsKindOf",
                 "oclIsTypeOf",
                 "oclAsType",
                 "oclIsNew",
                 "oclIsUndefined",
                 "oclIsInvalid",
                 "oclIsInState",
                 "map",
                 "xmap",
                 "INTEGER_LITERAL",
                 "late",
                 "switch",
                 "NUMERIC_OPERATION",
                 "REAL_LITERAL",
                 "if",
                 "true",
                 "false",
                 "OclInvalid",
                 "while",
                 "object",
                 "new",
                 "compute",
                 "let",
                 "resolve",
                 "resolveone",
                 "resolveIn",
                 "resolveoneIn",
                 "invresolve",
                 "invresolveone",
                 "invresolveIn",
                 "invresolveoneIn",
                 "SEMICOLON",
                 "LBRACE",
                 "RBRACE",
                 "COMMA",
                 "COLON",
                 "COLONCOLON",
                 "BAR",
                 "log",
                 "LBRACKET",
                 "RESET_ASSIGN",
                 "var",
                 "assert",
                 "return",
                 "extends",
                 "DOT",
                 "end",
                 "access",
                 "main",
                 "NOT_EQUAL_EXEQ",
                 "in",
                 "property",
                 "RBRACKET",
                 "ATPRE",
                 "EXCLAMATION_MARK",
                 "List",
                 "QUESTIONMARK",
                 "library",
                 "when",
                 "configuration",
                 "intermediate",
                 "static",
                 "ARROW",
                 "DOTDOT",
                 "CARET",
                 "CARETCARET",
                 "QUOTE_STRING_LITERAL",
                 "ADD_ASSIGN",
                 "INTEGER_RANGE_START",
                 "else",
                 "endif",
                 "implies",
                 "out",
                 "transformation",
                 "mapping",
                 "query",
                 "helper",
                 "inout",
                 "blackbox",
                 "abstract",
                 "disjuncts",
                 "merges",
                 "inherits",
                 "EOF_TOKEN",
                 "STEREOTYPE_QUALIFIER_OPEN",
                 "then",
                 "import",
                 "metamodel",
                 "population",
                 "modeltype",
                 "case",
                 "rename",
                 "AT_SIGN",
                 "class",
                 "composes",
                 "derived",
                 "ordered",
                 "readonly",
                 "references",
                 "STEREOTYPE_QUALIFIER_CLOSE",
                 "MULTIPLICITY_RANGE",
                 "TILDE_SIGN",
                 "opposites",
                 "with",
                 "uses",
                 "where",
                 "refines",
                 "xselect",
                 "xcollect",
                 "selectOne",
                 "collectOne",
                 "collectselect",
                 "collectselectOne",
                 "forEach",
                 "forOne",
                 "Dict",
                 "break",
                 "constructor",
                 "continue",
                 "datatype",
                 "default",
                 "do",
                 "elif",
                 "enum",
                 "except",
                 "exception",
                 "from",
                 "literal",
                 "primitive",
                 "raise",
                 "tag",
                 "try",
                 "typedef",
                 "unlimited",
                 "invalid",
                 "inv",
                 "pre",
                 "post",
                 "context",
                 "package",
                 "endpackage",
                 "def",
                 "attr",
                 "oper"
             };

    public final static boolean isValidForParser = true;
}
