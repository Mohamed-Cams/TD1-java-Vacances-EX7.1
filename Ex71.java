//Mohamed Camara
//DBE

//bibliothéque random
import java.util.Random;

public class Ex71{
    
     int numero;
     char typeCompte;
     double solde;
     int codeSecret;
//structure
    public Ex71(int num,char typecompte, double soldes){
        this.numero = num;
        this.typeCompte = typecompte;
        this.solde = soldes;
        this.CodeSecret();
    }
// randomizer du code secret
    private void CodeSecret() {
    
        Random random = new Random();
        this.codeSecret = random.nextInt(9900) + 100;

    }
// affichage
    public void affichage() {
        System.out.println("Numéro du compte: " + this.numero);
        System.out.println("Type de compte: " + this.typeCompte);
        System.out.println("Solde: " + this.solde);
        System.out.println("Code secret: " + this.codeSecret);
    }
//Methode depot d'argent
    public void deposer(double montant) {
        this.solde += montant;
        System.out.println("Dépôt de " + montant);
        System.out.println("Nouveau solde: " + this.solde);
    }
//Merhode retrait d'argent
    public void retirer(double montant) {
        if (montant <= this.solde) {
            this.solde -= montant;
            System.out.println("Retrait de " + montant);
            System.out.println("Nouveau solde: " + this.solde);
        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait.");
        }
    }
    public static void main(String[] args) {

        Ex71 p1 = new Ex71(2341,'E',2000.00);
        p1.affichage();
        p1.deposer(5000.00);
        p1.retirer(3000.00);
        p1.affichage();
    
    }

}