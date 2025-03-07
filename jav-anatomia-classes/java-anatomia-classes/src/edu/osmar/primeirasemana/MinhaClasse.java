package edu.osmar.primeirasemana;
public class MinhaClasse {
   public static void main(String [] args) {
        String primeiroNome = "Osmar";
        String segundoNome = "Junior";
        
        System.out.println(nomeCompleto(primeiroNome, segundoNome));
    
   }

   public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
   }

}
