Proceso sin_titulo
	Definir num1, num2, vtotal como real;
	
	Escribir "Digite numero 1";
	Leer num1;
	
	Escribir "Digite numero 1";
	Leer num2;
	
	Si num1 = num2 Entonces
			vtotal<-num1*num2;
	Sino 
		Si num1 >  num2 Entonces
			vtotal<-num1-num2;
			
		Sino
			vtotal<-num1+num2;
		FinSi
	FinSi
		Escribir "El valor de la operación es:  ", vtotal;
		
	
FinProceso
