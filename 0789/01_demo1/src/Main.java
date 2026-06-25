
void main() {


    System.out.println("Ola Mundo"); // desde o inicio

    IO.println("Ola Mundo"); // desde java 25


    int idade = 10;
    double altura = 1.50; // 12 a 14 cd
    float peso = 40.6f; // 7 cd
    boolean aprovado = true;
    char l1 = 'e';
    String nome = "Gonçalo";

    idade = 32;
    // idade = "txt";

    IO.println(idade + 4);
    IO.println(idade + 4.4);
    IO.println(idade + 4.5f);
    IO.println(10/2);
    IO.println(10/6d);

    double mySoma = 12.0f + 12.5f;



    IO.println("----------------------------");

    Scanner sc = new Scanner(System.in); //  receita para criar o sc que me permite ler dados

    System.out.println("Qual o seu nome: ");  // msg que aparece
    String myNome = sc.nextLine();  // ler dados

    System.out.println("O nome é: " + myNome); // mostra o nome


    IO.println("----------------------------");

    String txt = "ola";
    String myNome2 = IO.readln("Qual o " + txt + " seu nome: ");
    IO.println("o nome é: " + myNome2);


}
