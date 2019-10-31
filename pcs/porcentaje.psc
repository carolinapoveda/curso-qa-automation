//Calcular la area y perimetro de un circulo tomando el valor del radio
Proceso calculo_porcentaje
	Definir hombres, mujeres, resultado_total como  entero;
	Definir resultado_hombres, resultado_mujeres como  real;
	
	escribir "ingrese hombres";
	leer hombres;
	
	escribir "ingrese hombres";
	leer mujeres;
	
	resultado_total<-hombres+mujeres;
	
	Resultado_hombres<-(hombres/resultado_total)*100;
	resultado_mujeres<-(mujeres/resultado_total)*100;
	
	escribir "El porcentaje hombres:  ", Resultado_hombres, "%";
	escribir "El porcentaje mujeres:  ", resultado_mujeres, "%";
	
FinProceso
