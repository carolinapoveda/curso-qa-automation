Proceso factorial
	
	Definir i, total, num Como Entero;
	Escribir "Digite el numero";
	leer num;
	Si num = 0 Entonces
				Escribir "numero incorrecto";
			Sino i<-1;
			total<-1;
			Mientras i<=num hacer
				total<-total*i;
				i<-i+1;
			FinMientras
			Escribir "Factorial es ", total;
	FinSi
	
FinProceso
