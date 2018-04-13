/*
 * scanflib.h
 *
 * Library zum einfachen Nutzen der scanf-Funktionen
 * (c) Dez. 2006, Haiko Wick
 *
 * Autor:   Haiko Wick
 * Datum:   11. Dez. 2006
 * Rev.:    1.1 RL 4
 * Tested:  Darwin Kernel Version 8.8.1
 * Compile: gcc -std=c99 -c scanflib.c
 * Kontakt: mail@haikowick.de
 */

#include <stdbool.h>
#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#include <termios.h>
#include <stdlib.h>
#include <limits.h>

#define NO_ERROR                0
#define ERROR_NULLPOINTER       1
#define ERROR_INPUT_OVERFLOW    2
#define ERROR_SSCANF_FAILED     3
#define ERROR_MALFORMATTED      4
#define ERROR_EXMAXLIMIT        5
#define ERROR_MAX_INT           6

int     readCharacters(char*	buffer, int chars);
int     readCharacter( char*	buffer);
int     readInteger(   int*		value);
int     readDouble(    double*	value);

void	o_readCharacters(char*	buffer, int chars,    int* errorID);
void	o_readCharacter( char*	buffer, int* errorID);
void	o_readInteger(   int*		value,  int* errorID);
void	o_readDouble(    double*	value,  int* errorID);

char*	i_readCharacters(int chars);
char	i_readCharacter();
int		i_readInteger();
double	i_readDouble();

char*	ext_readCharacter(	bool resetTerminal, bool checkOverlength, bool* checkSuccess, int charCount, bool delBreak);
int		ext_readInt(		bool resetTerminal, bool checkOverlength, bool* checkSuccess, int charCount);
double	ext_readDouble(		bool resetTerminal, bool checkOverlength, bool* checkSuccess, int charCount);

void	bsc_readBuffer(		bool resetTerminal, bool checkOverlength, int charCount);
void	bsc_free();
