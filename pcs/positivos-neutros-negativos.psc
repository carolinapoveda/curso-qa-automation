Proceso positivos_neutros_negativos
	
	Definir i Como Entero;
	Definir positivos Como Entero;
	Definir negativos Como Entero;
	Definir neutros Como Entero;
	Definir num como entero;
	
	positivos<-0;
	negativos<-0;
	neutros<-0;
	
	Escribir "Clasificacion de numeros enteros";
	Escribir "Por favor ingrese 10 numeros";
	
	para i<-1 hasta 10 hacer
		Escribir "ingrese un numero";
		Leer num;
		
		si num >0 Entonces
			positivos<-positivos+1;
		SiNo
			si num < 0 Entonces
				negativos<-negativos+1;
			SiNo
				neutros<-neutros+1;
			FinSi
		FinSi
	FinPara
	
	Escribir "Usted a digitado 10 numeros";
	Escribir "el total de numeros positivos es ",positivos;
	Escribir "el total de numeros negativos es ",negativos;
	Escribir "el total de numeros neutros es ",neutros;
	
	
FinProceso
