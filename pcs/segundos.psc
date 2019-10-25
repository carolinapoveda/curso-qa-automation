//Calcular la cantidad de seguntos que estan incluidos en el numero total de horas, minutos y seguntos

Proceso calculo_segundos
	Definir seg, min, horas Como Entero;
	Definir resultado, seg_horas, seg_min como entero;
	
	
	
	Escribir "Por favor ingrese segundos";
	leer seg;
	Escribir "Por favor ingrese minutos";
	leer min;
	Escribir "Por favor ingrese horas";
	leer horas;
	
	//convertir datos en segundos
	seg_horas<-horas*3600;
	seg_min<-min*60;
	
	// calcular total de seguros
	resultado<-seg+seg_horas+seg_min;
	
	
	// Mostrar al usuaraio total
	
	Escribir "El numero total de segundos es: ", resultado;
	
	
	
FinProceso
