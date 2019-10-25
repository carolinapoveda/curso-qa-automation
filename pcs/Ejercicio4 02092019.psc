Proceso Dias_de_la_semana
	
	Definir wopcion, num1, num2 Como Entero;
	Definir wresultado como real;
		
	Escribir "Digite opción: ";
	Escribir "Opción 1: Elevar un número a una potencia x.   ";
	Escribir "Opción 2: Sacar la raíz cuadrada de un número. ";
	Escribir "Opción 3: Salir";
	
	Leer wopcion;
		
	Segun wopcion hacer
		1: 
			Escribir "Digite número base";
			Leer  num1;
			
			Escribir "Digite número potencia";
			Leer  num2;
			wresultado<-num1^num2;
			Escribir num1, " elevado a la potencia ", num2, " es ", wresultado;
						
		2: 
			Escribir "Digite número";
			Leer  num1;
			wresultado<-rc(num1); 
			Escribir " La raiz cuadrada de ", num1, " es ", wresultado;;
		3: 
			Escribir "Seleccionó Salir";
			
	
	FinSegun
	

	

FinProceso
