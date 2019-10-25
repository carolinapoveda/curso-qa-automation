Proceso Dias_de_la_semana
	
	Definir dia Como Entero;
	Definir dias como cadena;
	
	
	Escribir "Que dia de la semana es";
	
	Escribir "Selecione un numero de 1 a 7";
	leer dia;
	
	Segun dia hacer
		1: dias<-"lunes";
		2: dias<-"martes";
		3: dias<-"miercoles";
		4: dias<-"jueves";
		5: dias<-"viernes";
		6: dias<-"sabado";
		7: dias<-"domingo";
		De Otro Modo:
			dias<-"incorrecto";
	FinSegun
	
	Escribir "El numero ingresado corresponde al dia de la semana: ",dias;
	

FinProceso
