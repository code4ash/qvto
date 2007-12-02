/**
* <copyright>
*
* Copyright (c) 2007 Borland Software Corporation
* 
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*     Borland Software Corporation - initial API and implementation
*
* </copyright>
*
* $Id: QvtOpLexerprs.java,v 1.1.2.3 2007/12/02 21:25:47 aigdalov Exp $
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
* $Id: QvtOpLexerprs.java,v 1.1.2.3 2007/12/02 21:25:47 aigdalov Exp $
*/

package org.eclipse.m2m.qvt.oml.editor.ui.completion.cst.parser;

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
            1,1
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
            8,8,8,903,503,502,502,502,2,447,
            1278,54,504,1289,486,896,805,432,432,432,
            432,997,162,345,6,7,8,9,469,1229,
            401,343,376,432,432,432,326,203,505,505,
            505,505,505,1225,505,505,1341,421,432,443,
            203,505,505,505,505,505,404,505,505,43,
            421,409,459,407,437,437,437,437,437,1338,
            437,437,1339,437,1,47,47,47,47,1245,
            340,1256,481,47,1343,340,1344,481,47,1078,
            47,507,312,312,312,312,312,1155,312,312,
            1080,452,707,310,310,310,310,607,312,312,
            312,312,312,976,312,312,1227,1231,54,310,
            310,310,102,45,45,45,45,1267,483,1290,
            44,45,409,483,1299,54,45,1150,45,303,
            52,52,52,52,1005,464,491,491,491,1291,
            464,1316,54,1327,54,491,1083,165,164,164,
            164,1157,165,164,164,164,1342,1346,1347,52,
            52,1294,1295,1296,1297,1310,508,508
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
            74,75,76,77,78,79,80,81,82,83,
            84,85,86,87,88,89,90,0,92,93,
            94,95,96,97,0,1,2,3,4,5,
            6,7,8,9,10,11,12,13,14,15,
            16,17,18,19,20,21,22,23,24,25,
            26,27,28,29,30,31,32,33,34,35,
            36,37,38,39,40,41,42,43,44,45,
            46,47,48,49,50,51,52,53,54,55,
            56,57,58,59,60,61,62,63,64,65,
            66,67,68,69,70,71,72,73,74,75,
            76,77,0,79,80,81,82,83,84,85,
            86,87,88,89,90,0,92,93,94,95,
            96,97,0,1,2,3,4,5,6,7,
            8,9,10,11,12,13,14,15,16,17,
            18,19,20,21,22,23,24,25,26,27,
            28,29,30,31,32,33,34,35,36,37,
            38,39,40,41,42,43,44,45,46,47,
            48,49,50,51,52,53,54,55,56,57,
            58,59,60,61,62,63,64,65,66,67,
            68,69,70,71,72,0,74,75,76,77,
            78,79,80,81,82,83,84,85,86,87,
            88,89,90,91,0,0,0,102,0,0,
            98,99,100,101,0,1,2,3,4,5,
            6,7,8,9,10,11,0,13,14,15,
            16,17,18,19,20,21,22,23,24,25,
            26,27,28,29,30,31,32,33,34,35,
            36,37,38,39,40,41,42,43,44,45,
            46,47,48,49,50,51,52,53,54,55,
            56,57,58,59,60,61,62,63,64,65,
            74,67,68,69,70,71,101,0,0,0,
            76,77,0,1,2,3,4,5,6,7,
            8,9,10,11,15,13,14,15,16,17,
            18,19,20,21,22,23,24,25,26,27,
            28,29,30,31,32,33,34,35,36,37,
            38,39,40,41,42,43,44,45,46,47,
            48,49,50,51,52,53,54,55,56,57,
            58,59,60,61,62,63,64,65,71,0,
            0,0,0,0,0,73,0,1,2,3,
            4,5,6,7,8,9,10,11,0,13,
            14,15,16,17,18,19,20,21,22,23,
            24,25,26,27,28,29,30,31,32,33,
            34,35,36,37,38,39,40,41,42,43,
            44,45,46,47,48,49,50,51,52,53,
            54,55,56,57,58,59,60,61,62,63,
            64,65,68,69,0,0,0,78,0,73,
            0,1,2,3,4,5,6,7,8,9,
            10,11,14,13,0,1,2,3,4,5,
            6,7,8,9,10,0,1,2,3,4,
            5,6,7,8,9,10,0,1,2,3,
            4,5,6,7,8,9,10,0,1,2,
            3,4,5,6,7,8,9,10,0,0,
            0,67,66,0,0,0,0,67,0,1,
            2,3,4,5,6,7,8,9,10,0,
            0,0,0,69,70,0,1,2,3,4,
            5,6,7,8,9,10,0,1,2,3,
            4,5,6,7,8,9,10,0,0,0,
            0,0,0,0,0,0,0,0,0,12,
            12,11,11,13,12,12,66,12,12,66,
            72,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,91,
            0,0,0,0,0,0,98,99,100,0,
            101,0,0,0,0,0,102,102,102,0,
            0,0,0,0,0,0,68,0,0,0,
            101,0,75,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0
        };
    };
    public final static byte termCheck[] = TermCheck.termCheck;
    public final int termCheck(int index) { return termCheck[index]; }

    public interface TermAction {
        public final static char termAction[] = {0,
            508,555,555,555,555,555,555,555,555,555,
            555,555,555,555,555,555,555,555,555,555,
            555,555,555,555,555,555,555,555,555,555,
            555,555,555,555,555,555,555,555,555,555,
            555,555,555,555,555,555,555,555,555,555,
            555,555,555,555,555,555,555,555,555,555,
            555,555,555,555,555,555,555,555,555,555,
            555,452,555,555,555,555,555,554,555,555,
            555,555,555,555,555,555,555,555,555,555,
            555,555,555,555,555,555,555,555,555,555,
            555,508,553,553,553,553,553,553,553,553,
            553,553,553,553,553,553,553,553,553,553,
            553,553,553,553,553,553,553,553,553,553,
            553,553,553,553,553,553,553,553,553,553,
            553,553,553,553,553,553,553,553,553,553,
            553,553,553,553,553,553,553,553,553,553,
            553,553,553,553,553,553,553,553,553,553,
            553,553,558,553,553,553,553,553,519,553,
            553,553,553,553,553,553,553,553,553,553,
            553,553,553,553,553,553,553,553,553,553,
            553,553,313,505,505,505,505,505,505,505,
            505,505,505,505,505,505,505,505,505,505,
            505,505,505,505,505,505,505,505,505,505,
            505,505,505,505,505,505,505,505,505,505,
            505,505,505,505,505,505,505,505,505,505,
            505,505,505,505,505,505,505,505,505,505,
            505,505,505,505,505,505,505,505,446,505,
            505,505,505,505,505,505,505,505,505,505,
            505,505,505,505,505,505,505,505,505,505,
            505,505,505,505,505,505,505,505,505,505,
            505,505,10,560,560,560,560,560,560,560,
            560,560,560,560,560,560,560,560,560,560,
            560,560,560,560,560,560,560,560,560,560,
            560,560,560,560,560,560,560,560,560,560,
            560,560,560,560,560,560,560,560,560,560,
            560,560,560,560,560,560,560,560,560,560,
            560,560,560,560,560,560,560,560,560,560,
            560,560,560,560,560,560,560,560,560,560,
            560,560,560,560,560,560,560,560,560,560,
            560,560,560,560,560,560,560,560,560,560,
            48,508,560,508,508,560,508,437,437,437,
            437,437,437,437,437,437,437,437,437,437,
            437,437,437,437,437,437,437,437,437,437,
            437,437,437,437,437,437,437,437,437,437,
            437,437,437,437,437,437,437,437,437,437,
            437,437,437,437,437,437,437,437,437,437,
            437,437,437,437,437,437,437,437,437,437,
            437,437,479,437,437,437,437,437,437,437,
            437,437,437,437,437,437,437,437,437,437,
            437,437,437,437,437,437,437,437,437,437,
            437,437,437,437,437,437,314,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,446,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,508,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,501,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,508,818,818,818,
            818,818,818,818,818,818,818,818,818,818,
            818,818,818,818,818,818,818,818,818,818,
            818,818,818,818,818,818,818,818,818,818,
            818,818,818,818,818,818,818,818,818,818,
            818,818,818,818,818,818,818,818,818,818,
            818,818,818,818,818,818,818,818,818,818,
            818,818,818,818,818,818,818,818,818,818,
            818,818,818,818,823,818,818,818,818,818,
            818,818,818,818,818,818,818,508,818,818,
            818,818,818,467,508,432,432,432,432,432,
            432,432,432,432,432,432,432,432,432,432,
            432,432,432,432,432,432,432,432,432,432,
            432,432,432,432,432,432,432,432,432,432,
            432,432,432,432,432,432,432,432,432,432,
            432,432,432,432,432,432,432,432,432,432,
            432,432,432,432,432,432,432,432,432,432,
            432,432,432,432,432,432,432,432,432,432,
            432,432,508,432,432,432,432,432,432,432,
            432,432,432,432,432,508,432,432,432,432,
            432,467,508,503,503,503,503,503,503,503,
            503,503,503,502,529,502,502,502,502,502,
            502,502,502,502,502,502,502,502,502,502,
            502,502,502,502,502,502,502,502,502,502,
            502,502,502,502,502,502,502,502,502,502,
            502,502,502,502,502,502,502,502,502,502,
            502,502,502,502,502,502,502,502,393,373,
            414,427,416,523,504,508,351,399,402,419,
            346,538,359,367,542,535,536,533,534,548,
            539,525,526,504,508,508,38,507,508,508,
            504,504,504,380,508,464,464,464,464,464,
            464,464,464,464,464,491,508,491,491,491,
            491,491,491,491,491,491,491,491,491,491,
            491,491,491,491,491,491,491,491,491,491,
            491,491,491,491,491,491,491,491,491,491,
            491,491,491,491,491,491,491,491,491,491,
            491,491,491,491,491,491,491,491,491,491,
            547,833,497,826,825,827,513,16,508,508,
            498,828,1,673,673,673,673,673,673,673,
            673,673,673,672,496,672,672,672,672,672,
            672,672,672,672,672,672,672,672,672,672,
            672,672,672,672,672,672,672,672,672,672,
            672,672,672,672,672,672,672,672,672,672,
            672,672,672,672,672,672,672,672,672,672,
            672,672,672,672,672,672,672,672,360,508,
            508,508,508,508,14,674,316,673,673,673,
            673,673,673,673,673,673,673,672,508,672,
            672,672,672,672,672,672,672,672,672,672,
            672,672,672,672,672,672,672,672,672,672,
            672,672,672,672,672,672,672,672,672,672,
            672,672,672,672,672,672,672,672,672,672,
            672,672,672,672,672,672,672,672,672,672,
            672,672,537,559,35,508,508,816,329,674,
            6,562,562,562,562,562,562,562,562,562,
            562,409,430,409,508,340,340,340,340,340,
            340,340,340,340,340,508,481,481,481,481,
            481,481,481,481,481,481,508,483,483,483,
            483,483,483,483,483,483,483,58,562,562,
            562,562,562,562,562,562,562,562,12,508,
            307,544,815,3,163,53,161,474,57,562,
            562,562,562,562,562,562,562,562,562,311,
            508,508,508,457,411,60,562,562,562,562,
            562,562,562,562,562,562,59,562,562,562,
            562,562,562,562,562,562,562,32,20,508,
            7,508,19,13,508,324,321,508,508,835,
            531,409,545,409,530,836,815,831,830,815,
            670,508,508,508,508,508,508,508,508,508,
            508,508,508,508,508,508,508,508,508,670,
            508,508,508,508,508,508,670,670,670,508,
            512,508,508,508,508,508,1,6,12,508,
            508,508,508,508,508,508,532,508,508,508,
            314,508,541
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
           NUM_STATES        = 49,
           NT_OFFSET         = 103,
           LA_STATE_OFFSET   = 840,
           MAX_LA            = 1,
           NUM_RULES         = 332,
           NUM_NONTERMINALS  = 40,
           NUM_SYMBOLS       = 143,
           SEGMENT_SIZE      = 8192,
           START_STATE       = 333,
           IDENTIFIER_SYMBOL = 0,
           EOFT_SYMBOL       = 102,
           EOLT_SYMBOL       = 104,
           ACCEPT_ACTION     = 507,
           ERROR_ACTION      = 508;

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
