package com.example.gbisewanmawar.ui.renungan;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class RenunganViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RenunganViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Berkat Atas Kerukunan\n\n" +
                "Nyanyian ziarah Daug. Sungguh,\n" +
                "alangkah baiknya dan indahnya,\n" +
                "apabila saudara-saudara diam\n" +
                "bersama dengan rukun! (Mazmur 133:1)\n\n" +
                "Kerukunan, di masa sekarang sepertinya sudah" +
                "menjadi sesuatu yang sulit" +
                "ditemukan. Beberapa puluh tahun yang lalu, slogan" +
                "'gotong royong' di kampung-kampung menggambarkan" +
                "betapa indahnya hidup dalam kebersamaan. Di" +
                "lingkup yang lebih kecil, keluarga, kerukunan pun" +
                "mulai memudar. Mengapa hal ini bisa terjadi?" +
                "Semua ini berawal dari sikap egois" +
                "yang telah meracuni pola pikir masing-masing individu." +
                "Hubungan antar anggota dalam keluarga retak karena" +
                "egoime yang mendominasi. Kita seakan lupa tentang janji" +
                "Tuhan yang diberikan-Nya bahwa:\n\n" +
                "Allah melimpahkan berkat dalam kerukunan." +
                "Cara hidup yang penuh konflik dengan sesama dan keluarga" +
                "tidak akan pernah mendatangkan kebaikan. Sebaliknya, " +
                "keegoisan, kemarahan, dan pertengkaran hanya akan menimbulkan " +
                "kehancuran yang begitu parah. Ketiadaan kerukunan akan " +
                "meretakkan dan menghancurkan sebuah keluarga. Namun, " +
                "mereka yang hidupnya rukun memiliki keuntungan besar! " +
                "Di sanalah berkat-berkat Tuhan dicurahkan dan Allah " +
                "hadir dan berdiam dalam keluarga yang rukun.\n\n" +
                "Kerinduan hati Tuhan adalah\n" +
                "memberkati keluarga yang" +
                "rukun yang dibangun di atas" +
                "firman-Nya. Seperti Tuhan" +
                "memberkati jemaat mula-mula" +
                "yang setiap hari selalu berkumpul, bersehati, berdoa, memuji Tuhan, belajar " +
                "firman, dan saling berbagi! Sungguh betapa indahnya sebuah keluarga yang" +
                "menunjukkan kerukunan seperti itu. Ketika Sang Sumber Berkat itu berdiam di " +
                "tengah-tengah keluarga yang rukun, maka keluarga itu pun menikmati kehadiran " +
                "Pribadi-Nya yang limpah dengan ketenangan dan kedamaian sebab ia memerintahkan " +
                "berkat-berkat-Nya. --SYS/www.renunganharian.net"
        );
    }

    public LiveData<String> getText() {
        return mText;
    }
}