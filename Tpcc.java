/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tpcc;

import tpcc.model.Etudiant;
import tpcc.service.TpccService;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author flannelle
 */
public class Tpcc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
       
        Etudiant et1,et2,et3,et,et10,et4,et5,et6,et9;
         Etudiant e;
        int chx;
        int niv;
        String matricul;
        String fil;
        String name;
        TpccService service;
        service =new TpccService();
        
       
       
                // methode d'enregistrement d'un etudiant
                System.out.println("Entrer le matricule ");
                matricul= sc.nextLine();
                System.out.println("Entrer le nom ");
                name= sc.nextLine();
                System.out.println("Entrer la filiere ");
                fil= sc.nextLine();
                System.out.println("Entrer le niveau");
                niv= sc.nextInt(); 
                e = new Etudiant(matricul,name,fil,niv);
                service.nouvelEtudiant(e);
                System.out.println(" Enregistrement  effectué ");
           
                //methode afficher 
                service.affichelisteEtudiant();
          
                // afficher les etudiants d'une filiere donnée
                System.out.println("Entrer la filiere ");
                fil= sc.nextLine();
                service.ListeEtudiantFiliere(fil);
           
                // methode de recherche d'un etudiant
                System.out.println("Entrer le matricule de l etudiant à rechercher :");
                matricul= sc.nextLine();
                System.out.println("l'etudiant rechercher est:");
                service.RechercheEtudiant(matricul);
            
                    //supprimer
                System.out.println("Entrer le matricule de l etudiant à supprimer :");
                matricul= sc.nextLine();
                service.deleteEtudiant(matricul);
                service.affichelisteEtudiant();
                System.out.println("suppression reussie");
           
                // modifier
               System.out.println("Entrer le matricule  de l etudiant à modifier :");
               matricul= sc.nextLine();
               System.out.println("Modifier le niveau de l etudiant :");
               niv= sc.nextInt();
               service.modifierniveauEtudiant(matricul,niv);
               service.affichelisteEtudiant();
               System.out.println("Mise à jour effectuée!!!");      
  }
}
       