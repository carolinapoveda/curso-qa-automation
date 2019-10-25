//Calcular la area y perimetro de un circulo tomando el valor del radio
Proceso calculo_porcentaje
	Definir vcompra como  entero;
	Definir vdescuento,vtotal como  real;
	vdescuento<-0;
	
	escribir "Ingrese valor compra";
	leer vcompra;
	
	Si vcompra >= 10000 entonces 
		vdescuento<-(vcompra*20)/100;
		vtotal<-vcompra-vdescuento;
		
	Sino 
		vtotal<-vcompra;
	FinSi
	

	escribir "Valor Compra:  ", vcompra;
	escribir "Valor Descuento :  ", vdescuento;
	escribir "Valor a Pagar:  ", vtotal;
	
	
FinProceso
