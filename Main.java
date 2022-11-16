class Main {
  public static void main(String[] args) {
    int numerolf = -2;
    //ejercicio 1
    if (numerolf<0){
      System.out.println("el numero es negativo");
      }
    else{
      System.out.println("el numero es positivo");
    }
    //ejercicio 2 while
    int numerowhile = 0;

    while(numerowhile<3){
      System.out.println(numerowhile);
      numerowhile++;
    }
    // ejercicio 3 do while
    int numerowhile2 = 0;


    
    do{
      System.out.println(numerowhile);
    }while(numerowhile2>3);

    //ejercicio con for 
    for(int numeroFor = 0; numeroFor < 3 ; numeroFor++){
    System.out.println(numeroFor);
  }

  // ejercicio de switch con estaciones
  String estacion = "verano";

    switch(estacion){

      case "invierno":
        System.out.println("invierno");
        break;
      case "verano":
        System.out.println("verano");
        break;
      case "otoño":
        System.out.println("otoño");
        break;
      case "primavera":
        System.out.println("primavera");
        break;
      
    }
  }
    



}