/**
* <copyright>
*
* Copyright (c) 2005, 2007 IBM Corporation and others.
* All rights reserved.   This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*   IBM - Initial API and implementation
*   E.D.Willink - Lexer and Parser refactoring to support extensibility and flexible error handling
*
* </copyright>
*
* $Id: QvtOpLexerprs.java,v 1.39 2008/12/29 19:08:01 aigdalov Exp $
*/
/**
* <copyright>
*
* Copyright (c) 2006-2008 Borland Inc.
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
* $Id: QvtOpLexerprs.java,v 1.39 2008/12/29 19:08:01 aigdalov Exp $
*/

package org.eclipse.m2m.internal.qvt.oml.cst.parser;

public class QvtOpLexerprs implements lpg.lpgjavaruntime.ParseTable, QvtOpLexersym {

    public interface IsKeyword {
        public final static byte isKeyword[] = {0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0
        };
    };
    public final static byte isKeyword[] = IsKeyword.isKeyword;
    public final boolean isKeyword(int index) { return isKeyword[index] != 0; }

    public interface BaseCheck {
        public final static byte baseCheck[] = {0,
            1,1,3,3,3,1,1,1,1,1,
            5,1,1,1,1,1,1,1,1,1,
            1,2,2,2,1,1,1,1,2,1,
            1,1,2,1,1,2,4,1,2,1,
            1,1,2,2,3,2,2,0,1,2,
            2,2,1,2,1,2,3,2,3,3,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,2,3,1,1,1,1,
            1,2,1,2,2,2,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,2,2,1,2,
            1,2,0,1,3,3,3,3,3,3,
            3,4,4,3,3,1,2,2,1,1,
            2,2,2,3,1,1,1,1
        };
    };
    public final static byte baseCheck[] = BaseCheck.baseCheck;
    public final int baseCheck(int index) { return baseCheck[index]; }
    public final static byte rhs[] = baseCheck;
    public final int rhs(int index) { return rhs[index]; };

    public interface BaseAction {
        public final static char baseAction[] = {
            20,20,20,20,20,20,20,20,20,20,
            20,20,20,20,20,20,20,20,20,20,
            20,20,20,20,20,20,20,20,20,20,
            20,20,20,20,20,20,20,20,20,20,
            20,21,22,22,22,26,26,26,26,27,
            27,25,25,6,6,35,35,29,13,13,
            13,9,9,9,9,9,2,2,2,2,
            3,3,3,3,3,3,3,3,3,3,
            3,3,3,3,3,3,3,3,3,3,
            3,3,3,3,3,3,4,4,4,4,
            4,4,4,4,4,4,4,4,4,4,
            4,4,4,4,4,4,4,4,4,4,
            4,4,1,1,1,1,1,1,1,1,
            1,1,37,37,37,37,37,37,37,37,
            38,38,38,38,38,38,38,38,38,38,
            38,38,36,36,39,39,39,15,15,40,
            40,28,28,11,11,11,11,31,31,31,
            31,31,31,31,31,31,31,31,31,31,
            31,31,31,31,31,31,31,31,31,31,
            31,31,31,31,31,31,31,16,16,16,
            16,16,16,16,16,16,16,16,16,16,
            16,16,16,16,16,16,16,16,16,16,
            16,16,16,16,16,16,17,17,17,17,
            17,17,17,17,17,17,17,17,17,17,
            17,17,17,17,17,17,17,17,17,17,
            17,17,17,17,17,7,7,7,7,7,
            7,7,7,7,7,7,7,7,7,7,
            7,7,7,7,7,7,7,7,7,7,
            7,7,7,7,7,14,14,14,14,30,
            30,30,30,30,30,30,30,18,18,18,
            18,18,8,8,8,8,8,5,19,32,
            32,10,10,12,12,33,23,23,23,23,
            23,23,23,23,23,24,20,20,20,20,
            20,20,20,20,20,20,8,8,8,707,
            511,510,510,510,2,453,1283,54,512,1244,
            492,1073,907,438,438,438,438,1338,162,351,
            6,7,8,9,475,1078,401,349,382,438,
            438,438,326,203,513,513,513,513,513,1080,
            513,513,1348,427,438,465,203,513,513,513,
            513,513,410,513,513,43,427,415,485,407,
            443,443,443,443,443,1000,443,443,1335,443,
            1,47,47,47,47,1250,346,1261,487,47,
            1334,346,1336,487,47,1339,47,507,312,312,
            312,312,312,1079,312,312,1316,458,809,310,
            310,310,310,607,312,312,312,312,312,1154,
            312,312,1231,1233,54,310,310,310,102,45,
            45,45,45,1272,489,801,44,45,415,489,
            1294,54,45,1318,45,303,52,52,52,52,
            1005,470,497,497,497,1320,470,1305,54,1322,
            54,497,1083,165,164,164,164,1158,165,164,
            164,164,1152,1340,1352,52,52,1354,1355,1341,
            1356,1357,1358,1362,516,516
        };
    };
    public final static char baseAction[] = BaseAction.baseAction;
    public final int baseAction(int index) { return baseAction[index]; }
    public final static char lhs[] = baseAction;
    public final int lhs(int index) { return lhs[index]; };

    public interface TermCheck {
        public final static byte termCheck[] = {0,
            0,1,2,3,4,5,6,7,8,9,
            10,11,12,13,14,15,16,17,18,19,
            20,21,22,23,24,25,26,27,28,29,
            30,31,32,33,34,35,36,37,38,39,
            40,41,42,43,44,45,46,47,48,49,
            50,51,52,53,54,55,56,57,58,59,
            60,61,62,63,64,65,66,67,68,69,
            70,71,72,73,74,75,76,77,78,79,
            80,81,82,83,84,85,86,87,88,89,
            90,91,92,93,94,95,96,97,98,99,
            100,0,1,2,3,4,5,6,7,8,
            9,10,11,12,13,14,15,16,17,18,
            19,20,21,22,23,24,25,26,27,28,
            29,30,31,32,33,34,35,36,37,38,
            39,40,41,42,43,44,45,46,47,48,
            49,50,51,52,53,54,55,56,57,58,
            59,60,61,62,63,64,65,66,67,68,
            69,70,71,72,73,74,75,76,77,78,
            79,80,81,82,83,84,85,86,87,88,
            89,90,91,92,93,94,95,96,97,98,
            99,100,0,1,2,3,4,5,6,7,
            8,9,10,11,12,13,14,15,16,17,
            18,19,20,21,22,23,24,25,26,27,
            28,29,30,31,32,33,34,35,36,37,
            38,39,40,41,42,43,44,45,46,47,
            48,49,50,51,52,53,54,55,56,57,
            58,59,60,61,62,63,64,65,66,67,
            68,69,70,71,72,73,74,75,76,77,
            78,79,80,81,82,83,84,85,86,87,
            88,89,90,91,92,93,94,95,96,97,
            98,99,0,1,2,3,4,5,6,7,
            8,9,10,11,12,13,14,15,16,17,
            18,19,20,21,22,23,24,25,26,27,
            28,29,30,31,32,33,34,35,36,37,
            38,39,40,41,42,43,44,45,46,47,
            48,49,50,51,52,53,54,55,56,57,
            58,59,60,61,62,63,64,65,66,67,
            68,69,70,71,72,73,74,75,76,77,
            78,79,80,81,82,83,84,85,86,87,
            88,89,90,91,92,93,94,95,96,97,
            0,0,100,0,0,103,0,1,2,3,
            4,5,6,7,8,9,10,11,12,13,
            14,15,16,17,18,19,20,21,22,23,
            24,25,26,27,28,29,30,31,32,33,
            34,35,36,37,38,39,40,41,42,43,
            44,45,46,47,48,49,50,51,52,53,
            54,55,56,57,58,59,60,61,62,63,
            64,65,66,67,68,69,70,71,72,73,
            74,75,76,77,78,79,80,81,82,83,
            84,85,86,87,88,89,90,91,92,93,
            94,95,96,97,98,99,0,1,2,3,
            4,5,6,7,8,9,10,11,12,13,
            14,15,16,17,18,19,20,21,22,23,
            24,25,26,27,28,29,30,31,32,33,
            34,35,36,37,38,39,40,41,42,43,
            44,45,46,47,48,49,50,51,52,53,
            54,55,56,57,58,59,60,61,62,63,
            64,65,66,67,68,69,70,71,72,73,
            74,75,76,77,78,79,80,81,82,83,
            84,85,86,87,88,89,90,91,92,93,
            94,95,96,97,98,99,0,1,2,3,
            4,5,6,7,8,9,10,11,12,13,
            14,15,16,17,18,19,20,21,22,23,
            24,25,26,27,28,29,30,31,32,33,
            34,35,36,37,38,39,40,41,42,43,
            44,45,46,47,48,49,50,51,52,53,
            54,55,56,57,58,59,60,61,62,63,
            64,65,66,67,68,69,70,71,72,73,
            74,75,76,77,78,79,80,81,82,83,
            84,85,86,87,88,89,90,91,92,93,
            94,95,96,97,98,99,0,1,2,3,
            4,5,6,7,8,9,10,11,12,13,
            14,15,16,17,18,19,20,21,22,23,
            24,25,26,27,28,29,30,31,32,33,
            34,35,36,37,38,39,40,41,42,43,
            44,45,46,47,48,49,50,51,52,53,
            54,55,56,57,58,59,60,61,62,63,
            64,65,66,67,68,69,70,71,72,73,
            0,75,76,77,78,79,80,81,82,83,
            84,85,86,87,88,89,90,91,92,93,
            0,0,0,0,98,99,100,101,0,1,
            2,3,4,5,6,7,8,9,10,11,
            12,13,14,15,16,17,18,19,20,21,
            22,23,24,25,26,27,28,29,30,31,
            32,33,34,35,36,37,38,39,40,41,
            42,43,44,45,46,47,48,49,50,51,
            52,53,54,55,56,57,58,59,60,61,
            62,63,64,65,66,67,68,69,70,71,
            72,73,74,75,76,77,78,79,80,81,
            82,83,84,85,86,87,88,89,90,91,
            92,101,94,95,96,97,0,1,2,3,
            4,5,6,7,8,9,10,11,12,13,
            14,15,16,17,18,19,20,21,22,23,
            24,25,26,27,28,29,30,31,32,33,
            34,35,36,37,38,39,40,41,42,43,
            44,45,46,47,48,49,50,51,52,53,
            54,55,56,57,58,59,60,61,62,63,
            64,65,66,67,68,69,70,71,72,73,
            74,75,76,77,0,79,80,81,82,83,
            84,85,86,87,88,89,90,91,92,0,
            94,95,96,97,0,1,2,3,4,5,
            6,7,8,9,10,16,12,13,14,15,
            16,17,18,19,20,21,22,23,24,25,
            26,27,28,29,30,31,32,33,34,35,
            36,37,38,39,40,41,42,43,44,45,
            46,47,48,49,50,51,52,53,54,55,
            56,57,58,59,60,61,62,63,64,65,
            66,67,0,69,70,71,72,0,0,0,
            0,77,0,1,2,3,4,5,6,7,
            8,9,10,14,12,13,14,15,0,0,
            18,19,20,21,22,23,24,25,26,27,
            28,29,30,31,32,33,34,35,36,37,
            38,39,40,41,42,43,44,45,46,47,
            48,49,50,51,52,53,54,55,56,57,
            58,59,60,61,62,63,64,65,66,67,
            72,0,75,0,0,0,74,0,1,2,
            3,4,5,6,7,8,9,10,15,12,
            13,14,15,0,102,18,19,20,21,22,
            23,24,25,26,27,28,29,30,31,32,
            33,34,35,36,37,38,39,40,41,42,
            43,44,45,46,47,48,49,50,51,52,
            53,54,55,56,57,58,59,60,61,62,
            63,64,65,66,67,0,0,0,0,78,
            0,74,0,1,2,3,4,5,6,7,
            8,9,10,0,12,13,16,0,16,0,
            1,2,3,4,5,6,7,8,9,10,
            0,1,2,3,4,5,6,7,8,9,
            10,0,1,2,3,4,5,6,7,8,
            9,10,0,1,2,3,4,5,6,7,
            8,9,10,0,1,2,3,4,5,6,
            7,8,9,10,0,1,2,3,4,5,
            6,7,8,9,10,0,73,0,69,0,
            71,0,1,2,3,4,5,6,7,8,
            9,10,17,0,0,0,93,0,0,0,
            0,98,99,100,11,11,11,0,11,11,
            17,0,17,0,0,0,0,0,0,12,
            13,0,0,12,11,11,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,69,68,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,70,0,0,0,68,68,0,
            76,0,0,0,0,0,0,0,0,0,
            101,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,102,102,102,
            0,0,101,0,0
        };
    };
    public final static byte termCheck[] = TermCheck.termCheck;
    public final int termCheck(int index) { return termCheck[index]; }

    public interface TermAction {
        public final static char termAction[] = {0,
            516,563,563,563,563,563,563,563,563,563,
            563,563,563,563,563,563,563,563,563,563,
            563,563,563,563,563,563,563,563,563,563,
            563,563,563,563,563,563,563,563,563,563,
            563,563,563,563,563,563,563,563,563,563,
            563,563,563,563,563,563,563,563,563,563,
            563,563,563,563,563,563,563,563,563,563,
            563,563,458,563,563,563,563,562,563,563,
            563,563,563,563,563,563,563,563,563,563,
            563,563,563,563,563,563,563,563,563,563,
            563,516,561,561,561,561,561,561,561,561,
            561,561,561,561,561,561,561,561,561,561,
            561,561,561,561,561,561,561,561,561,561,
            561,561,561,561,561,561,561,561,561,561,
            561,561,561,561,561,561,561,561,561,561,
            561,561,561,561,561,561,561,561,561,561,
            561,561,561,561,561,561,561,561,561,561,
            561,561,561,566,561,561,561,561,527,561,
            561,561,561,561,561,561,561,561,561,561,
            561,561,561,561,561,561,561,561,561,561,
            561,561,313,513,513,513,513,513,513,513,
            513,513,513,513,513,513,513,513,513,513,
            513,513,513,513,513,513,513,513,513,513,
            513,513,513,513,513,513,513,513,513,513,
            513,513,513,513,513,513,513,513,513,513,
            513,513,513,513,513,513,513,513,513,513,
            513,513,513,513,513,513,513,513,513,513,
            473,513,513,513,513,513,513,513,513,513,
            513,513,513,513,513,513,513,513,513,513,
            513,513,513,513,513,513,513,513,513,513,
            513,513,10,568,568,568,568,568,568,568,
            568,568,568,568,568,568,568,568,568,568,
            568,568,568,568,568,568,568,568,568,568,
            568,568,568,568,568,568,568,568,568,568,
            568,568,568,568,568,568,568,568,568,568,
            568,568,568,568,568,568,568,568,568,568,
            568,568,568,568,568,568,568,568,568,568,
            568,568,568,568,568,568,568,568,568,568,
            568,568,568,568,568,568,568,568,568,568,
            568,568,568,568,568,568,568,568,568,568,
            48,516,568,516,516,568,516,443,443,443,
            443,443,443,443,443,443,443,443,443,443,
            443,443,443,443,443,443,443,443,443,443,
            443,443,443,443,443,443,443,443,443,443,
            443,443,443,443,443,443,443,443,443,443,
            443,443,443,443,443,443,443,443,443,443,
            443,443,443,443,443,443,443,443,443,443,
            443,443,443,443,503,443,443,443,443,443,
            443,443,443,443,443,443,443,443,443,443,
            443,443,443,443,443,443,443,443,443,443,
            443,443,443,443,443,443,314,828,828,828,
            828,828,828,828,828,828,828,828,828,828,
            828,828,828,828,828,828,828,828,828,828,
            828,828,828,828,828,828,828,828,828,828,
            828,828,828,828,828,828,828,828,828,828,
            828,828,828,828,828,828,828,828,828,828,
            828,828,828,828,828,828,828,828,828,828,
            828,828,828,828,473,828,828,828,828,828,
            828,828,828,828,828,828,828,828,828,828,
            828,828,828,828,828,828,828,828,828,828,
            828,828,828,828,828,828,516,828,828,828,
            828,828,828,828,828,828,828,828,828,828,
            828,828,828,828,828,828,828,828,828,828,
            828,828,828,828,828,828,828,828,828,828,
            828,828,828,828,828,828,828,828,828,828,
            828,828,828,828,828,828,828,828,828,828,
            828,828,828,828,828,828,828,828,828,828,
            828,828,828,828,509,828,828,828,828,828,
            828,828,828,828,828,828,828,828,828,828,
            828,828,828,828,828,828,828,828,828,828,
            828,828,828,828,828,828,516,511,511,511,
            511,511,511,511,511,511,511,537,510,510,
            510,510,405,422,510,510,510,510,510,510,
            510,510,510,510,510,510,510,510,510,510,
            510,510,510,510,510,510,510,510,510,510,
            510,510,510,510,510,510,510,510,510,510,
            510,510,510,510,510,510,510,510,510,510,
            510,510,510,510,399,436,420,425,531,512,
            516,365,408,433,352,546,357,379,373,851,
            550,543,544,541,542,556,547,533,534,512,
            516,516,516,516,512,512,512,386,516,826,
            826,826,826,826,826,826,826,826,826,826,
            826,826,826,826,826,826,826,826,826,826,
            826,826,826,826,826,826,826,826,826,826,
            826,826,826,826,826,826,826,826,826,826,
            826,826,826,826,826,826,826,826,826,826,
            826,826,826,826,826,826,826,826,826,826,
            826,826,826,826,826,826,826,826,826,826,
            826,826,826,826,826,826,831,826,826,826,
            826,826,826,826,826,826,826,826,826,826,
            826,521,826,826,826,502,516,438,438,438,
            438,438,438,438,438,438,438,438,438,438,
            438,438,438,438,438,438,438,438,438,438,
            438,438,438,438,438,438,438,438,438,438,
            438,438,438,438,438,438,438,438,438,438,
            438,438,438,438,438,438,438,438,438,438,
            438,438,438,438,438,438,438,438,438,438,
            438,438,438,438,438,438,438,438,438,438,
            438,438,438,438,516,438,438,438,438,438,
            438,438,438,438,438,438,438,438,438,35,
            438,438,438,502,516,470,470,470,470,470,
            470,470,470,470,470,452,497,497,497,497,
            841,507,497,497,497,497,497,497,497,497,
            497,497,497,497,497,497,497,497,497,497,
            497,497,497,497,497,497,497,497,497,497,
            497,497,497,497,497,497,497,497,497,497,
            497,497,497,497,497,497,497,497,497,497,
            497,497,516,834,508,833,835,38,16,329,
            516,836,1,681,681,681,681,681,681,681,
            681,681,681,449,680,680,680,680,516,516,
            680,680,680,680,680,680,680,680,680,680,
            680,680,680,680,680,680,680,680,680,680,
            680,680,680,680,680,680,680,680,680,680,
            680,680,680,680,680,680,680,680,680,680,
            680,680,680,680,680,680,680,680,680,680,
            366,516,555,516,516,516,682,316,681,681,
            681,681,681,681,681,681,681,681,504,680,
            680,680,680,516,515,680,680,680,680,680,
            680,680,680,680,680,680,680,680,680,680,
            680,680,680,680,680,680,680,680,680,680,
            680,680,680,680,680,680,680,680,680,680,
            680,680,680,680,680,680,680,680,680,680,
            680,680,680,680,680,516,516,516,516,824,
            36,682,6,570,570,570,570,570,570,570,
            570,570,570,12,415,415,850,516,480,516,
            346,346,346,346,346,346,346,346,346,346,
            516,487,487,487,487,487,487,487,487,487,
            487,516,489,489,489,489,489,489,489,489,
            489,489,58,570,570,570,570,570,570,570,
            570,570,570,57,570,570,570,570,570,570,
            570,570,570,570,60,570,570,570,570,570,
            570,570,570,570,570,14,678,516,463,516,
            417,59,570,570,570,570,570,570,570,570,
            570,570,545,20,32,19,678,330,13,307,
            3,678,678,678,539,843,538,7,847,844,
            540,516,849,324,321,163,53,161,516,415,
            415,311,516,553,839,838,516,516,516,516,
            516,516,516,516,516,516,516,516,516,516,
            516,516,516,516,567,823,516,516,516,516,
            516,516,516,516,516,516,516,516,516,516,
            516,516,516,848,516,516,516,823,823,516,
            549,516,516,516,516,516,516,516,516,516,
            520,516,516,516,516,516,516,516,516,516,
            516,516,516,516,516,516,516,516,516,516,
            516,516,516,516,516,516,516,516,516,516,
            516,516,516,516,516,516,516,1,6,12,
            516,516,314
        };
    };
    public final static char termAction[] = TermAction.termAction;
    public final int termAction(int index) { return termAction[index]; }
    public final int asb(int index) { return 0; }
    public final int asr(int index) { return 0; }
    public final int nasb(int index) { return 0; }
    public final int nasr(int index) { return 0; }
    public final int terminalIndex(int index) { return 0; }
    public final int nonterminalIndex(int index) { return 0; }
    public final int scopePrefix(int index) { return 0;}
    public final int scopeSuffix(int index) { return 0;}
    public final int scopeLhs(int index) { return 0;}
    public final int scopeLa(int index) { return 0;}
    public final int scopeStateSet(int index) { return 0;}
    public final int scopeRhs(int index) { return 0;}
    public final int scopeState(int index) { return 0;}
    public final int inSymb(int index) { return 0;}
    public final String name(int index) { return null; }
    public final int getErrorSymbol() { return 0; }
    public final int getScopeUbound() { return 0; }
    public final int getScopeSize() { return 0; }
    public final int getMaxNameLength() { return 0; }

    public final static int
           NUM_STATES        = 51,
           NT_OFFSET         = 103,
           LA_STATE_OFFSET   = 854,
           MAX_LA            = 1,
           NUM_RULES         = 338,
           NUM_NONTERMINALS  = 40,
           NUM_SYMBOLS       = 143,
           SEGMENT_SIZE      = 8192,
           START_STATE       = 339,
           IDENTIFIER_SYMBOL = 0,
           EOFT_SYMBOL       = 102,
           EOLT_SYMBOL       = 104,
           ACCEPT_ACTION     = 515,
           ERROR_ACTION      = 516;

    public final static boolean BACKTRACK = false;

    public final int getNumStates() { return NUM_STATES; }
    public final int getNtOffset() { return NT_OFFSET; }
    public final int getLaStateOffset() { return LA_STATE_OFFSET; }
    public final int getMaxLa() { return MAX_LA; }
    public final int getNumRules() { return NUM_RULES; }
    public final int getNumNonterminals() { return NUM_NONTERMINALS; }
    public final int getNumSymbols() { return NUM_SYMBOLS; }
    public final int getSegmentSize() { return SEGMENT_SIZE; }
    public final int getStartState() { return START_STATE; }
    public final int getStartSymbol() { return lhs[0]; }
    public final int getIdentifierSymbol() { return IDENTIFIER_SYMBOL; }
    public final int getEoftSymbol() { return EOFT_SYMBOL; }
    public final int getEoltSymbol() { return EOLT_SYMBOL; }
    public final int getAcceptAction() { return ACCEPT_ACTION; }
    public final int getErrorAction() { return ERROR_ACTION; }
    public final boolean isValidForParser() { return isValidForParser; }
    public final boolean getBacktrack() { return BACKTRACK; }

    public final int originalState(int state) { return 0; }
    public final int asi(int state) { return 0; }
    public final int nasi(int state) { return 0; }
    public final int inSymbol(int state) { return 0; }

    public final int ntAction(int state, int sym) {
        return baseAction[state + sym];
    }

    public final int tAction(int state, int sym) {
        int i = baseAction[state],
            k = i + sym;
        return termAction[termCheck[k] == sym ? k : i];
    }
    public final int lookAhead(int la_state, int sym) {
        int k = la_state + sym;
        return termAction[termCheck[k] == sym ? k : la_state];
    }
}
