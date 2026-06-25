/*

var
tipos de dados
op com var
in/out

\n -> muda de linha

 */

import static java.lang.IO.*; // para já é receita


void main() {
/*
    println("ola Mundo");


    Scanner sc = new Scanner(System.in);
    System.out.println("Qual o teu nome: ");
    String nome2 = sc.next();   // abc
                                // asd
                                // zxc
    println(nome2);

    System.out.println("Qual o teu nome 2: ");
    String nome3 = sc.next();
    println(nome3);

    nome3 = sc.next();
    println(nome3);

    sc.close();

    println("-----------");


    String nome = readln("Qual o teu nome: "); // <=> Scanner

    println("nome: " + nome);


    println("ola Mundo\nTudo bem"); // tem o \n no final


    print("ola"); // não tem \n
    print("linha 2");


    System.out.printf("linha 1, %d\n", 331); // print formatado

*/
    // condições

    /*

     ==
     !=
     >=
     >
     <=
     <

     &&
     ||

     */

    int idade = 10;

    if (idade >= 18) {
        println("Adulto");
    } else {
        println("Menor");
    }

    println("fim do código");


     /*

    faça uma app java com que recaba um num do usr, verifique se esse número é postivo ou nagativo,
            pode assumir o 0 é positivo

     */
/*
    //ler um valor do teclado
    String numInput = readln("Digite um núnmero: ");

    // conveter o numInput para int
    int num = Integer.parseInt(numInput); // "10" -> 10

    //println("o num foi: " + num);


    //verrificar se o num e pos ou neg


    //String resultado = "";
    if (num >= 0){
        // resultado = "positivo";
        println("Positivo");
    }else{
       // resultado = "negativo";
        println("Negativo");
    }

    // println("O número " + num + " é " + resultado);

*/
/*
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um núnmero: ");
    num = sc.nextInt();

    if (num >= 0){
        // resultado = "positivo";
        println("Positivo");
    }else{
        // resultado = "negativo";
        println("Negativo");
    }

*/
    // else if


    int num = 0;

    if (num > 0) {
        // resultado = "positivo";
        println("Positivo");
    } else if (num < 0) {
        // resultado = "negativo";
        println("Negativo");
    } else {
        // resultado = "negativo";
        println("O num é  zero");
    }

    // and / or

    double media = 6;
    double faltas = 8;
    int maxFaltas = 5;
    int maxFaltas2 = 8;

                    //or
    if (media >= 8.5 || faltas <= maxFaltas2) {
        println("oral");
                        //and
    } else if (media >= 10 && faltas <= maxFaltas){

        println("Aprovados");
    }

    // switch

    int mes = 1;

    switch (mes){
        case 1:
            println("jan");
            break; // neste caso, termina o switch-case
        case 2:
            println("fev");
            break;
        case 3:
            println("mar");
            break;
        default:
            println("mes invalido");
    }

println("continua");


}
