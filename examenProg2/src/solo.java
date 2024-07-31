import java.util.Date;
import java.util.List;

public class solo extends artiste {
    String nom;
    String prenom;
    Date dateDeNaissance;

    public solo(int id, String nomDeScene, Date anneeDebut, String nationalite, String genreDeMusique, List<String> songs, List<album> albums, String nom, String prenom, Date dateDeNaissance) {
        super(id, nomDeScene, anneeDebut, nationalite, genreDeMusique, songs, albums);
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
    }
}
