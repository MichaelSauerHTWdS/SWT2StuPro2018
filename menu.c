#include <stdio.h>
#include "scanflib.h"
//oh man

int steuerMenu(void);

int main(int argc, char* argv[])
  {
  return steuerMenu();
  }

int steuerMenu()
  {
  int kommando = 1;

  printf("Heute ist der Geburtstag von Hightower");
  
  do{

	if (readInteger(&kommando)!=NO_ERROR)
	  {
	  printf("keine Zahl");
	  }

    switch (kommando)
      {
      case  0:  printf("%s","\nHilfetext ?\n");
                         break;
      case  1:   printf("%s","Dies ist der erste Eintrag von BOffermann\n");
                         break;
      case  2:   printf("%s","2. Kommando\n");
                         break;
      case  3:   printf("%s","3. Kommando\n");
                         break;
      case  4:   printf("%s","\a\tENDE\n");
                         break;
      default: printf("\nkein Kommando\n");
      }
    }while(kommando!=0);

    return(0);
  }
