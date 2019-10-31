Funcion  contrasena_valida<-validar_contrasena(valor_contrasena)
	Definir contrasena_valida Como Logico;
	definir long_contrasena como entero;
	long_contrasena<-Longitud(valor_contrasena);
	
	Si Longitud(valor_contrasena)>=8 y Subcadena(valor_contrasena,1,2)='BA' Entonces
		contrasena_valida <-Verdadero;
	Sino
		contrasena_valida <-falso;
		cadena<-Subcadena(valor_contrasena,0,1);
	
	
	FinSi
	
FinFuncion

Proceso AAA
	definir contrasena, cadena como cadena;
	definir validacion_contrasena Como Logico;
	
	Repetir
		escribir "ingrese la contraseña";
		leer contrasena;
		validacion_contrasena<-validar_contrasena(contrasena);
		Escribir cadena;
			Escribir validacion_contrasena;
	Hasta Que validacion_contrasena=Verdadero;
	
FinProceso

		