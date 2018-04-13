/*
 * scanflib.c
 *
 * Library zum einfachen Nutzen der scanf-Funktionen
 * (c) Dez. 2006, Haiko Wick
 *
 * Autor:   Haiko Wick
 * Datum:   14. Dez. 2006
 * Rev.:    1.1 RL 4
 * Tested:  Darwin Kernel Version 8.8.1
 * Compile: gcc -std=c99 -c scanflib.c
 * Kontakt: mail@haikowick.de
 */

#include "scanflib.h"

#define LIB_MAX_LIMIT        4096

#define EXT_MODE                1
#define MAX_CHARS_PER_LINE     15
#define EXTEND_MAX_CHARS        2

const char END_OF_LINE = '\n';
char* bufferPointer;

int scanfErrorID;

int readCharacters(char* buffer, int chars) {
    i_readCharacters(chars);
    strcpy(buffer, bufferPointer);
    bsc_free();
    return scanfErrorID;
}

int readCharacter(char* buffer) {
    int i = i_readCharacter();
    (*buffer) = i;
    bsc_free();
    return scanfErrorID;
}

int readInteger(int* value) {
    (*value) = i_readInteger();
    return scanfErrorID;
}

int readDouble(double* value) {
    (*value) = i_readDouble();
    return scanfErrorID;    
}

void o_readCharacters(char* buffer, int chars, int* errorID) {
    i_readCharacters(chars);
    strcpy(buffer, bufferPointer);
    (*errorID) = scanfErrorID;
    bsc_free();
}

void o_readCharacter(char* buffer, int* errorID) {
    int i = i_readCharacter();
    (*buffer) = i;
    (*errorID) = scanfErrorID;
    bsc_free();
}

void o_readInteger(int* value, int* errorID) {
    (*value) = i_readInteger();
    (*errorID) = scanfErrorID;
}

void o_readDouble(double* value, int* errorID) {
    (*value) = i_readDouble();
    (*errorID) = scanfErrorID;    
}

char* i_readCharacters(int chars) {
    return ext_readCharacter(true, true, NULL, chars, false);
}

char i_readCharacter() {
	ext_readCharacter(true, true, NULL, 1, false);
	return bufferPointer[0];
}

int i_readInteger() {
	return ext_readInt(true, true, NULL, MAX_CHARS_PER_LINE);
}

double i_readDouble() {
	return ext_readDouble(true, true, NULL, MAX_CHARS_PER_LINE);
}

char* ext_readCharacter(bool resetTerminal, bool checkOverlength, bool* checkSuccess, int charCount, bool delBreak) {
    scanfErrorID = NO_ERROR;
    
    bsc_readBuffer(resetTerminal, checkOverlength, charCount);
    if (scanfErrorID == NO_ERROR) {
        if (delBreak) {
            bufferPointer[strlen(bufferPointer)-1] = 0;
        }
        return bufferPointer;
    } else {
        checkSuccess = false;
        return NULL;
    }
}

int ext_readInt(bool resetTerminal, bool checkOverlength, bool* checkSuccess, int charCount) {
    int     value;
    float   tvalue;
    char    check;
    
	bsc_readBuffer(resetTerminal, checkOverlength, charCount);
    if (scanfErrorID == NO_ERROR) {
        
        if (sscanf(bufferPointer, "%d%c", &value, &check) == 2) {
            if (check == END_OF_LINE) {
                sscanf(bufferPointer, "%f%c", &tvalue, &check);
                bsc_free();                
                if (tvalue > INT_MAX) {
                    scanfErrorID = ERROR_MAX_INT;
                    return 0;
                }
                return value;
            } else {
                scanfErrorID = ERROR_MALFORMATTED;
            }
        } else {
            scanfErrorID = ERROR_SSCANF_FAILED;
        }
    }
    checkSuccess = false;
    bsc_free();
    return 0;
}

double ext_readDouble(bool resetTerminal, bool checkOverlength, bool* checkSuccess, int charCount) {
    double value;
    char check;
    
	bsc_readBuffer(resetTerminal, checkOverlength, charCount);
    if (scanfErrorID == NO_ERROR) {
        
        if (sscanf(bufferPointer, "%lf%c", &value, &check) == 2) {
            if (check == END_OF_LINE) {
                bsc_free();
                return value;
            } else {
                scanfErrorID = ERROR_INPUT_OVERFLOW;
            }
        } else {
            scanfErrorID = ERROR_SSCANF_FAILED;
        }
    }
    checkSuccess = false;
    bsc_free();
    return 0.0;
}

void bsc_readBuffer(bool resetTerminal, bool checkOverlength, int charCount) {
	char* debugPointer = NULL;
    
    if (charCount > LIB_MAX_LIMIT) {
        scanfErrorID = ERROR_EXMAXLIMIT;
        return;
    }
    
    scanfErrorID = NO_ERROR;
	
	#ifdef EXT_MODE
	if (resetTerminal) {
		tcflush(0, TCIFLUSH);
	}
	#endif
    
    bufferPointer = (char *) malloc(charCount + EXTEND_MAX_CHARS);
	debugPointer = fgets(bufferPointer, charCount + EXTEND_MAX_CHARS, stdin);
    
	if (debugPointer == NULL) {
		scanfErrorID = ERROR_NULLPOINTER;
	}
    
    if (bufferPointer[strlen(bufferPointer)-1] != END_OF_LINE) {
        if (checkOverlength) {
            scanfErrorID = ERROR_INPUT_OVERFLOW;
        }
        #ifdef EXT_MODE
        bufferPointer[strlen(bufferPointer)-1] == '\n';
        while ((getc(stdin)) != '\n') { }
        #endif   
    } 
}

void bsc_free() {
	free(bufferPointer);
}
