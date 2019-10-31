Proceso Dias_de_la_semana
	
	Definir wtiempo Como Entero;
	Definir wbodas como cadena;
		
	Escribir "Digite Años: 10, 20, 30, 40, 50 o 60";
	
	leer wtiempo;
	
	Segun wtiempo hacer
		10:wbodas <-"Bodas de Hojalata";
		 Escribir "El significado del aniversado ingresado es : ",wbodas;
	 20:wbodas <-"Bodas de Porcelana";
		 Escribir "El significado del aniversado ingresado es : ",wbodas;
	 30:wbodas <-"Bodas de Perlas";
		 Escribir "El significado del aniversado ingresado es : ",wbodas;
	 40:wbodas <-"Bodas de Rubí";
		 Escribir "El significado del aniversado ingresado es : ",wbodas;
	 50:wbodas <-"Bodas de Oro";
		 Escribir "El significado del aniversado ingresado es : ",wbodas;
	 60:wbodas <-"Bodas de Diamante";
		 Escribir "El significado del aniversado ingresado es : ",wbodas;
		De Otro Modo:
		Escribir "Tiempo Ingresado Incorrecto";
	FinSegun
	
FinProceso
