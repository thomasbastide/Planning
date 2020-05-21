/*
 * Classe objet correspondant au type de cours enseigné
 */
package controleur;

/**
 *
 * @author Bastide_Fiorenza_Jacquesy TD05
 */
public class TypeCours 
{
    /// ATTRIBUTS
    private int m_idCours;
    private String m_nom;
    
    /// CONSTRUCTEURS
    TypeCours(){
        
    }
    
    TypeCours(int id, String nom){
        m_idCours   = id;
        m_nom       = nom;
    }
    
    /// METHODES
    /** Fonction de récupération l'ID */
    public int getID(){
        return m_idCours;
    }
    
    /** Fonction de récupération ou pour set le type de cours */
    public void setNom(String nom){
        m_nom       = nom;
    }
    public String getNom(){
        return m_nom;
    }
    
}