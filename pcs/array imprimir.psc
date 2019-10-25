Proceso arreglo_cadena
	definir palabras, pal_ant, pal_sup Como Caracter;
	definir i,num como entero; 
	Escribir "Numero de array";
	Leer num;
		
	dimension palabras[num];
	para i<-1 hasta num con paso 1 hacer
		Escribir i,". Digite cadena";
		Leer palabras[i];
	FinPara
	
	Para i<-num hasta 1 con paso -1 hacer
		Escribir  palabras[i];
		
	FinPara
	
FinProceso
