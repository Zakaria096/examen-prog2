import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class artiste {
    int id ;
    String nomDeScene;
    Date AnneeDebut;
    String nationalite;
    String genreDeMusique;
    public List<String> songs;
    List<album> albums;

    public artiste(int id, String nomDeScene, Date anneeDebut, String nationalite, String genreDeMusique, List<String> songs, List<album> albums) {
        this.id = id;
        this.nomDeScene = nomDeScene;
        AnneeDebut = anneeDebut;
        this.nationalite = nationalite;
        this.genreDeMusique = genreDeMusique;
        this.songs = songs;
        this.albums = albums;

    }
    public void addToplayList() {

    }
    public static void main(String[] args){

    }
}
