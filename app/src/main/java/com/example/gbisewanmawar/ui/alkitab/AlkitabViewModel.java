package com.example.gbisewanmawar.ui.alkitab;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlkitabViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AlkitabViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Mazmur 107:23-43\n\n" +
                "107:23     Ada orang-orang yang mengarungi\n" +
                "laut dengan kapal-kapal, yang melakukan perdagangandi lautan luas; 107:24   mereka melihat\n" +
                "pekerjaan-pekerjaan TUHAN, dan perbuatan-perbuatan-Nya yang ajaib di tempat yang dalam.\n" +
                "107:25     Ia berfirman, maka dibangkitkan-Nya angin badai yang meninggikan gelombang-gelombangnya.\n" +
                "107:26     Mereka naik sampai ke langit dan turun ke samudera raya, jiwa mereka hancur karena celaka\n" +
                "107:27     mereke pusing dan terhuyung-huyung seperti orang mabuk, dan kehilangan akal.\n" +
                "107:28     Maka berseru-serulah mereka kepada TUHAN dalam kesesakan mereka, dan dikeluarkan-\n" +
                "-Nya mereka dari kecemasan mereka,\n" +
                "107:29     dibuat-Nyalah badai itu diam, sehingga gelombang-gelombangnya tenang.\n" +
                "107:30     Mereka bersukacita, sebab semuanya reda, dan dituntun-Nya mereka ke pelabuhan kesukaan mereka.\n" +
                "107:31     Biarlah mereka bersyukur kepada TUHAN karena kasih setia-Nya, karena perbuatan-perbuatan-Nya \n" +
                "yang ajaib terhadap anak-anak manusia.\n" +
                "107:32     Biarlah mereka meninggalkan Dia dalam jemaat umat itu, dan memuji-muji Dia dalam majelis para tua-tua. \n" +
                "107:33     Dibuat-Nya sungai-sungai menjadi padang gurun, dan pancaran-pacaran air menjadi tanah gersang.\n"
        );
    }

    public LiveData<String> getText() {
        return mText;
    }
}