import java.util.Date;
import java.util.List;

public class groupe extends artiste{
    List<String> solo;


    public groupe(int id, String nomDeScene, Date anneeDebut, String nationalite, String genreDeMusique, List<String> songs, List<album> albums, List<String> solo) {
        super(id, nomDeScene, anneeDebut, nationalite, genreDeMusique, songs, albums);
        this.solo = solo;
    }
}
