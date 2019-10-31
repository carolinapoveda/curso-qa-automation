//Calcular la area y perimetro de un circulo tomando el valor del radio
Proceso calculo_porcentaje
	Definir vcompra como  entero;
	Definir vdescuento,vtotal como  real;
	
	
	escribir "Ingrese valor compra";
	leer vcompra;
	
	vdescuento<-(vcompra*20)/100;
	vtotal<-vcompra-vdescuento;
	

	escribir "Valor Compra:  ", vcompra;
	escribir "Valor Descuento 20%:  ", vdescuento;
	escribir "Valor a Pagar:  ", vtotal;
	
	
FinProceso
