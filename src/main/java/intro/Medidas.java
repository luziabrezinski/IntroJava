//1 - Nome do pacote
package intro;

// 2 - Referência as bibliotecas

// 3 - Classe onde escrevemos o programa
public class Medidas {
    //3.1 - Atributos - Caracteristicas da medida (tamanho, medida)
    //3.2 - Metodos e Funções são o que o metodo sabe fazer (calcula, testa, informa)
    //3.2.1 A primeira função tem o nome de statitc main pra ser inicializada ao rodar o programa
    //3.2.2Parente sente para receber e enviar valores
    public static void main(String[] args){
        System.out.println("Cálculo de Area");
    }
    public void calcularAreaModoExtenco(){
        //Calculo de area - Exemplo: o tamanho do tapete ou do piso
        int l = 8;
        int c = 3;
        int r;

        r = l * c;
        System.out.println("Para a largurda de " + l + " e o comprimento "+ c + " a área do tapete é de:" + r + "m²");
        System.out.println("Bom dia");

    }


    public void calcularAreaModoCompacto(){
       int largura = 4;
       int comprimento = 3;

        System.out.println();
        System.out.println("Para a largurda de " + largura + " e o comprimento "+ comprimento + " a área do tapete é de:" + largura * comprimento + "m²");
    }

}
