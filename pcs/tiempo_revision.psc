//Calcular tiempo en examaenes
Proceso calculo_tiempo_examenes
	Definir examen_a, examen_b, examen_c como  entero;
	Definir texamen_a, texamen_b, texamen_c, Totalm_examenes como enteros;
	Definir Totalh_examenes como real;
	
	escribir "Numero de examenes tipo A";
	leer examen_a;
	
	escribir "Numero de examenes tipo B";
	leer examen_b;
	
	escribir "Numero de examenes tipo C";
	leer examen_c;
	
	Totalm_examenes<-(examen_a*5)+(examen_b*10)+(examen_c*15);
	Totalh_examenes<-Totalm_examenes/60;
	
	escribir "Total revision en minutos ", Totalm_examenes;
	escribir "Total revision en horas ", Totalh_examenes;
	
	
	
	
	
FinProceso
