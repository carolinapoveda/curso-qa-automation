Proceso sin_titulo
	Definir num1, num2, num3,vmayor como entero;
	
	Escribir "Digite numero 1";
	Leer num1;
	Si num1<0 Entonces 
		Escribir " Entrada no valida";
		Escribir "Digite numero 1";
		Leer num1;
	Finsi	
	Escribir "Digite numero 2";
	Leer num2;
	Si num2<0 Entonces 
		Escribir " Entrada no valida";
		Escribir "Digite numero 2";
		Leer num2;
	Finsi	
	
	Escribir "Digite numero 3";
	Leer num3;
	
	Si num3<0 Entonces 
		Escribir " Entrada no valida";
		Escribir "Digite numero 3";
		Leer num3;
	Finsi	
	Si num1 > num2 Entonces 
		Si num1 > num3 entonces;
			vmayor<-num1;
		Finsi			
	Sino 
		Si num2 >  num3 Entonces
			vmayor<-num2;
		Sino
			vmayor<-num3;
		FinSi
	FinSi
	Escribir " Numero mayor es : ", vmayor;
		
	
FinProceso
