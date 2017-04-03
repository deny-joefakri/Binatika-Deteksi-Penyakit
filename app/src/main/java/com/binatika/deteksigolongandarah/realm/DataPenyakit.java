package com.binatika.deteksigolongandarah.realm;

import android.app.Activity;

import com.binatika.deteksigolongandarah.model.PenyakitModel;

import java.util.ArrayList;

/**
 * Created by dev_deny on 3/26/17.
 */

public class DataPenyakit {

    public static ArrayList<PenyakitModel> getPenyakitModels(Activity activity){
        RealmController.with(activity).clearPenyakit();
        ArrayList<PenyakitModel> penyakitModels = new ArrayList<>();

        PenyakitModel penyakitModel = new PenyakitModel();
        penyakitModel.setId(System.currentTimeMillis()+1);
        penyakitModel.setKode_penyakit("P1");
        penyakitModel.setNama_penyakit("Jantung");
        penyakitModel.setPenyebab("Merokok, kolesterol tinggi, kebiasaan mengkonsumsi makanan berlemak, berat badan lebih atau obesitas, kemudian karena tersumbatnya pembuluh darah utama yang memasok darah ke jantung (pembuluh koroner). Sumbatan ini disebabkan oleh timbunan kolesterol berupa plak yang menempel di dinding pembuluh darah.");
        penyakitModel.setPengobatan("Untuk penanganan pertama, segera konsumsi aspirin dengan dosis normal 300 mg, tapi sebelumnya pastikan bahwa penderita tidak alergi terhadap aspirin. Obat ini bisa membantu mengencerkan darah dan mengurangi risiko serangan jantung lebih lanjut. Mengurangi makan berkolesterol tinggi, hindari merokok, jangan sering merasa stress, berolahraga dengan teratur, mengkonsumsi makanan yang berantioksidan.");
        penyakitModels.add(penyakitModel);

        penyakitModel = new PenyakitModel();
        penyakitModel.setId(System.currentTimeMillis()+2);
        penyakitModel.setKode_penyakit("P2");
        penyakitModel.setNama_penyakit("Diabetes Mellitus");
        penyakitModel.setPenyebab("Kurangnya produksi insulin atau kurang sensitifnya jaringan tubuh terhadap insulin, tingginya asupan gula menyebabkan kadar gula darah melonjak tinggi, sering stress, kurang tidur, merokok.");
        penyakitModel.setPengobatan("Menghindari berbagai jenis makanan yang terlalu banyak mengandung glukosa, dan berbagai jenis makanan olahan yang tinggi glukosa, serta rajin berolah raga dan melakukan aktivitas fisik minimal 30 menit perhari. Tidur tidak kurang dari 6 jam sehari, atau sebaiknya 8 jam sehari.");
        penyakitModels.add(penyakitModel);

        penyakitModel = new PenyakitModel();
        penyakitModel.setId(System.currentTimeMillis()+3);
        penyakitModel.setKode_penyakit("P3");
        penyakitModel.setNama_penyakit("Kanker");
        penyakitModel.setPenyebab("Merokok (meningkatkan resiko kanker paru-paru), konsumsi alkohol yang berlebihan telah dikaitkan dengan kanker, menggunakan obat-obatan terlarang juga memainkan peran dalam beberapa jenis kanker. Asupan tinggi lemak dikaitkan dengan kanker payudara, usus besar, ovarium, ginjal, paru-paru. Asupan serat yang rendah dikaitkan dengan tingkat resiko terkena kanker usus besar yang lebih tinggi.");
        penyakitModel.setPengobatan("Makanlah sayuran dan buah buahan yang banyak, wortel yang masih segar di parut dan di saring dapat di tambah dengan madu murni lalu diminum, Ambillah daun cermai muda, daun pepaya muda, daun belimbing muda ukurannya sebanding dengan tiga genggam tangan kemudian dicuci bersih lalu direbus dengan air kurang lebih 3 gelas sampai mendidih kemudian didinginkan lalu dapat diminum dengan madu asli secukupnya, sekali minum cukup setengah gelas pagi dan sore hari.");
        penyakitModels.add(penyakitModel);

        penyakitModel = new PenyakitModel();
        penyakitModel.setId(System.currentTimeMillis()+4);
        penyakitModel.setKode_penyakit("P4");
        penyakitModel.setNama_penyakit("Hepatitis");
        penyakitModel.setPenyebab("infeksi virus, bahan kimia, mengkonsumsi alkohol, dan penggunaan obat-obatan tertentu. Penyebab lainnya diakibatkan oleh pola hidup dengan pola makanan tinggilemak dan kalori, kurangnya gerak fisik atau olahraga dan paparan zat berbahaya.");
        penyakitModel.setPengobatan("Dokter biasanya memberikan obat untuk penderita hepatitis adalah obat telan Lamivudine dari kelompok nukleosida analog yang dikenal dengan nama 3TC. Obat itu dapat meningkatkan enzime hati (ALT). Karena itu selama pengobatan pasien harus rutin berkonsultasi dengan dokter untuk menghindari efek buruk mengonsumsi obat. Buah noni/mengkudu dan mahkota dewa sangat bermanfaat untuk mencegah dan pengobatan penyakit hepatitis.");
        penyakitModels.add(penyakitModel);

        penyakitModel = new PenyakitModel();
        penyakitModel.setId(System.currentTimeMillis()+5);
        penyakitModel.setKode_penyakit("P6");
        penyakitModel.setNama_penyakit("Sindrom Letih Lesu Kronis");
        penyakitModel.setPenyebab("Disebabkan oleh komplikasi infeksi virus, tapi tidak ada virus yang telah teridentifikasi. Respon terhadap infeksi pada sistem kekebalan tubuh (sistem yang melawan infeksi) yang abnormal atau stres mungkin berperan dalam sindrom ini.");
        penyakitModel.setPengobatan("Solusi paling tepat untuk Sindrom Letih Lesu Kronis adalah dengan mengatur pola makan yang sehat dan gizi yang seimbang, berolahraga secara teratur, cukup istirahat dan tidur yang teratur, serta mengelola stres dengan baik.");
        penyakitModels.add(penyakitModel);

        penyakitModel = new PenyakitModel();
        penyakitModel.setId(System.currentTimeMillis()+6);
        penyakitModel.setKode_penyakit("P7");
        penyakitModel.setNama_penyakit("Autoimun Lupus");
        penyakitModel.setPenyebab("Obat-obatan yang dapat memicu lupus akibat obat. Lupus ini biasanya akan hilang saat konsumsi obat yang menjadi penyebabnya dihentikan, Virus,  paparan terhadap sinar matahari, perubahan hormon yang terjadi pada wanita, misalnya pada saat pubertas atau hamil.");
        penyakitModel.setPengobatan("Untuk pencegahan kenakan pakaian yang menutupi seluruh bagian kulit, mengoleskan tabir surya berdosis tinggi agar kulit tidak terbakar matahari. Obat-obatan yang mungkin dibutuhkan oleh penderita SLE yaitu obat anti inflamasi nonsteroid, Hydroxychloroquine, obat Imunosupresan, Rituximab.");
        penyakitModels.add(penyakitModel);

        penyakitModel = new PenyakitModel();
        penyakitModel.setId(System.currentTimeMillis()+7);
        penyakitModel.setKode_penyakit("P10");
        penyakitModel.setNama_penyakit("Asam Urat");
        penyakitModel.setPenyebab("Terlalu banyak konsumsi obat-obatan, minum terlalu banyak alkohol, mengkonsumsi makanan yang memiliki kandungan zat purin yang tinggi seperti : daging merah, jeroan (hati, ginjal), ikan kalengan, kembang kol, kacang, dan jamur. Mandi malam juga dapat menyebabkan asam urat.");
        penyakitModel.setPengobatan("Untuk meringankan gejala penyakit asam urat, bisa menempelkan kantong es pada bagian sendi yang terasa sakit dan juga bisa mengonsumsi obat pereda rasa sakit, misalnya Colchicine, OAINS (obat anti-inflamasi nonsteroid), dan obat-obatan golongan steroid.");
        penyakitModels.add(penyakitModel);

        penyakitModel = new PenyakitModel();
        penyakitModel.setId(System.currentTimeMillis()+8);
        penyakitModel.setKode_penyakit("P11");
        penyakitModel.setNama_penyakit("Tiroid Rendah");
        penyakitModel.setPenyebab("Kekurangan iodium sangat menjadi malasah bagi kelenjar tiroid. Hal ini juga menyebabkan banyak efek samping, misalnya penambahan berat badan, retensi cairan, dan mudah lelah.");
        penyakitModel.setPengobatan("Apabila menderita penyakit ini sebaiknya mengobatinya, karena apabila penyakit tiroid parah bisa menyebabkan sel kanker atau penyakit yang lebih membahayakan lagi. Pada saat melakukan pengobatan juga banyak minum air putih, makan makanan sehat, kelola stress serta olahraga secara teratur sehingga akan membantu proses penyembuhan lebih cepat.");
        penyakitModels.add(penyakitModel);

        penyakitModel = new PenyakitModel();
        penyakitModel.setId(System.currentTimeMillis()+9);
        penyakitModel.setKode_penyakit("P12");
        penyakitModel.setNama_penyakit("Tukak Lambung");
        penyakitModel.setPenyebab("Bakteri yang dapat menyebabkan infeksi perut dan peradangan, merokok, minum banyak alkohol, produksi asam  berlebih, makanan tertentu seperti makanan asam dan pedas.");
        penyakitModel.setPengobatan("Mengonsumsi produk berbahan dasar susu, seperti keju. Para pakar menduga bahwa susu dapat melindungi lambung dan menetralisasi dampak asam lambung, dan Mengurangi konsumsi teh dan kopi karena keduanya dapat meningkatkan kadar asam lambung.");
        penyakitModels.add(penyakitModel);

        penyakitModel = new PenyakitModel();
        penyakitModel.setId(System.currentTimeMillis()+10);
        penyakitModel.setKode_penyakit("P13");
        penyakitModel.setNama_penyakit("Alergi");
        penyakitModel.setPenyebab("Bahan makanan seperti kacang-kacangan, susu sapi, terlur, ikan laut dan produk olahannya pada orang tertentu dapat menjadi alergi kulit. Serbuk sari tanaman dan jamur, terkena bulu binatang, karena cuaca dingin, panas, asap rokok, polusi udara, deterjen.");
        penyakitModel.setPengobatan("Dalam mencegah alergi adalah menghindari diri dari substansi pemicunya atau allergen serta gunakan krim hydrocortisone atau krim protopic untuk mengurangi gatal.");
        penyakitModels.add(penyakitModel);
        return penyakitModels;
    }
}
