#include <stdio.h>
#include "scanflib.h"

int steuerMenu(void);

int main(int argc, char* argv[])
  {
  return steuerMenu();
  }

int steuerMenu()
  {
  int kommando = 1;

  printf("Heute ist der Geburtstag von Hightower :-)");
      printf("Das ist korrekt!");
	printf("Hightower ist immer fast da und liebt das oishii-Essen! :D \n");
	printf("RÜPDEDÜDÜLÜ!");
	printf("Kleiner Mann ganz groß");
	printf ("Nom nom nom\n");
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
      case  2:   printf("%s","2. TEST\n");
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
