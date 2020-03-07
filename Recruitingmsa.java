public class Recruitingmsa {

public static void main(String[] args) {
    int[] dato = new int[] {1,2,3};	//interesa guardar solo ultimos 3 resultados
    Long num = 2020202020202020L;	//numero a evaluar

    //al repetirse ciclicamente los resultados, achicamos el espacio muestral 
    num = 2020202020202020L % seRepiteCada(num);
    int result = 0;
    for (Long i = 3L; i < num; i++) {
    	//nos interesan los 4 ultimos digitos del resultado solamente
    	result = (dato[0] + dato[1] + dato[2]) % 10000;	
        dato[0] = dato[1];
        dato[1] = dato[2];
        dato[2] = result;
    }
    System.out.println("En la posición 2020202020202020 la evaluación termina en: " + result);
}

//funcion que calcula cada cuanto se repiten los resultados
public static long seRepiteCada(Long num){
	long i;
	int result;
	int[] datos = new int[] {1,2,3};
	for (i = 0L; i < num; i++) {
        result = (datos[0] + datos[1] + datos[2]) % 10000;
        if (datos[0] == 1 && datos[1] == 2 && datos[2] == 3 && i!=0) {	
        	//si se repiten los valores escapa del bucle
    		System.out.println("Ciclo encontrado en iteración: " + i);
    		break;
    	}
    	datos[0] = datos[1];
        datos[1] = datos[2];
        datos[2] = result;
    }
    return (i);
}

}
