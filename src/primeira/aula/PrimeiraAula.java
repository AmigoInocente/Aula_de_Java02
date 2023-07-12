package primeira.aula;

public class PrimeiraAula {

    public static void main(String[] args) {
        
        
        //VAR FRUTAS = {"LARANJA", "MAÇA"}
        String[] frutas = new String[5];
        frutas[0] = "LARANJA";
        frutas[1] = "MAÇA";
        frutas[2] = "PERA";
        
        String[] frutaDois = {"LARANJA", "MAÇA", "PERA"};
        
        int[] numeros = {1,2,3,4,5,6,7,8};
        int[] numeroDois = new int [8];
        numeroDois[0] = 0;
        numeroDois[1] = 1;
        
        //ESTRUTURA DE REPETIÇÃO
        for(int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }
        
        for(String fruta: frutas){
            System.out.println(fruta);
        }
        
        /////////////////////////////////
        
        int i = 0;
        while(i < frutas.length){
            System.out.println(frutas[i]);
            i++;
        }
        
        /////////////////////////////////
        i = 0;
        do{
            System.out.println(frutas[i]);
            i++;
        
        }while(i < frutas.length);
        
        
        
        // CLASSES WEAPPER(INVOLUCRO)
        int variavelPrimitiva = 10;
        Integer variavelEnvolucra = new Integer(10);
        
        double valor = 2.10;
        Double valorEnvolucro = 2.10;
        
        boolean valorBool = false;
        Boolean valorBool2 = false; 
        
        int MaxValor = Integer.max(0, 0);
        
        valorBool2.equals(valorBool);        
        
        String nome = "Alisson Guilherme";
        
        int idade = 25;
        double altura = 1.55;        
        boolean aluno = true;
        float centimetros = (float) 1.76;
        short valor = 1;
        char genero = 'N';
        int idadeDois = qualidade(2005);
        
        System.out.println(idadeDois);
        System.out.println("Oi "+ nome + " você tem "+ qualidade(2005) +" anos de idade?");
        
        
        if(qualidade(idade) >= 18) {
            System.out.println("Bora toma uma!");
        }else{
            System.out.println("Nois não pode tomar uma... :(");
        }   
        
        
    }
    
    static int qualidade(int anoNascimento){
        int idade = 2023 - anoNascimento;
        return idade;
    }
    
}
