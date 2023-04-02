package com.geco.rambulalulintas.ujian

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.geco.rambulalulintas.R
import com.geco.rambulalulintas.databinding.ActivityUjianBinding
import java.util.*
import java.util.concurrent.TimeUnit
import android.content.res.ColorStateList
import android.widget.*
import androidx.activity.OnBackPressedCallback
import com.geco.rambulalulintas.MainActivity

class UjianActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUjianBinding

    //    timer
    private var countDownTimer: CountDownTimer? = null
    private val countDownInMilliSecond: Long = 30000
    private val countDownInterval: Long = 1000
    private var timeLeftMilliSeconds: Long = 0
    private var defaultColor: ColorStateList? = null
    private var score = 0
    private var correct = 0
    private var wrong = 0
    private var skip = 0
    private var qIndex = 0
    private var updateQueNo = 1

    // create string for question, answer and options
    private var questions = arrayOf(
        "1. Yang tidak termasuk Surat Izin Mengemudi untuk kendaraan roda 4 atau lebih adalah..",
        "2. Pengereman mendadak di jalan yang licin terutama pada kecepatan tinggi akan mengakibatkan, kecuali:",
        "3. Manakah yang tidak termasuk dalam peralatan pendukung kendaraan beroda dua?",
        "4. Mengapa anda diharuskan menyalakan lampu kendaraan walaupun di siang hari?",
        "5. Pada saat berkendara di jalan yang tidak ada larangan mendahului, pengemudi dapat melewati kendaraan lain, kecuali:",
        "6. Faktor yang sering menimbulkan kecelakaan lalu lintas pada saat mendahului kendaraan lain, meski kondisi jalan baik, jarak pandang cukup dan jalur jalan lurus adalah:",
        "7. Isyarat peringatan dengan bunyi yang berupa klakson dapat digunakan apabila:",
        "8. Fungsi dari lampu isyarat peringatan bahaya (hazard) adalah…\n",
        "9. Jika Anda mengendari Motor Gede (Moge) diatas 1000 cylinder capacity (cc), jenis SIM apakah yang harus dimiliki?",
        "10. Posisi mengemudi pada saat mengendarai kendaraan penting untuk menghindari kelelahan, menurut anda posisi duduk saat mengemudi yang baik adalah:",
        "11. Dalam keadaan tertentu petugas polisi negara Republik Indonesia dapat melakukan tindakan:",
        "12. Pada saat mengendarai kendaraan di jalan umum, manakah menurut anda pemakai jalan yang perlu mendapatkan perhatian dan kewaspadaan khusus:",
        "13. Pada saat mengemudikan kendaraan di jalan dua arah, apa yang anda lakukan apabila ada kendaran lain memberi isyarat akan mendahului?",
        "14. Klakson pada kendaraan motor berfungsi sebagai",
        "15. Untuk kepentingan tertentu, kendaraan bermotor dapat dilengkapi dengan lampu isyarat/sirine. Penggunaan lampu isyarat/sirine sesuai dengan ketentuan hanya boleh di pasang pada kendaraan bermotor:",
        "16. Pada waktu lampu pengatur lalu lintas berganti menjadi hijau, seorang penyeberang jalan masih berada di atas “zebra cross”, maka yang mendapat kesempatan berjalan terlebih dahulu adalah:",
        "17. Golongan SIM apakah yang diperlukan jika anda hendak mengendarai motor 250 cc?",
        "18. Yang tidak termasuk syarat administratif untuk mendapatkan SIM adalah",
        "19. Pada saat mengendarai kendaraan bermotor di jalan, lokasi manakah yang dilarang bagi pengendara untuk memberhentikan kendaraan:",
        "20. Pada saat mengendarai kendaraan bermotor di jalan, lokasi manakah yang dilarang bagi pengendara untuk memberhentikan kendaraan:",
        "21. Bagaimana tindakan anda pada saat akan berpapasan dengan kendaraan lain yang datang dari arah depan?",
        "22. Yang tidak termasuk Surat Izin Mengemudi untuk kendaraan roda 4 atau lebih adalah…",
        "23. Pengereman mendadak di jalan yang licin terutama pada kecepatan tinggi akan mengakibatkan, kecuali:",
        "24. Penggunaan jalan selain jalur sebelah kiri hanya dapat dilakukan apabila:",
        "25. Saat berkendara di jalan, faktor apa yang paling utama yang harus anda perhatikan dalam menentukan jarak aman antara kendaraan anda dan kendaraan di depan?",)
    private var answer = arrayOf(
        "SIM C",
        "Tidak berakibat apa-apa kalau pengemudi mahir",
        "Kacamata hitam",
        "Agar kendaraan lebih terlihat oleh pengguna jalan yang lain",
        "Rombongan jenazah",
        "Salah perhitungan jarak dan kecepatan yang diperlukan untuk mendahului secara aman",
        "Butir a dan b benar semua",
        "Untuk memberi tanda bahwa kita sedang dalam keadaan darurat",
        "SIM C II",
        "Mengambil sikap duduk yang nyaman, posisi tangan dan kaki tidak tegang",

        "Semuanya benar",
        "Anak-anak yang bermain di jalanan",
        "Memberi ruang yang cukup dan aman bila situasi memungkinkan kendaraan tersebut mendahului bila perlu memperlambat kendaraan",
        "Peralatan pendukung yang dapat memberikan tanda kepada sesama pengguna jalan",
        "Petugas penegak hukum tertentu, dinas pemadam kebakaran dan Ambulan",

        "Pejalan kaki yang masih berada di atas zebra cross",
        "Golongan SIM C I dan C II benar",
        "Kartu keluarga",
        "Pada belokan, persimpangan, jembatan dan lokasi yang terdapat rambu larangan berhenti",
        "Diperoleh dari Polisi lalu lintas yang mengeluarkan STNK dan TNKB",

        "Memberi ruang cukup pada saat berpapasan dan bila perlu memperlambat kendaraan",
        "SIM C",
        "Tidak berakibat apa-apa kalau pengemudi mahir",
        "Butir a dan b benar semua",
        "Kecepatan kendaraan dan jarak berhenti apabila direm"
        )
    private var options = arrayOf(
        //1
        "SIM C",
        "SIM A",
        "SIM B1",
        "SIM B2",

        //2
        "Tidak berakibat apa-apa kalau pengemudi mahir",
        "Kendaraan akan slip (tergelincir)",
        "Membahayakan kendaraan lain di belakang",
        "Kendaraan sulit dikendalikan",

        //3
        "Helm yang berstandar SNI",
        "Rompi pemantul cahaya",
        "Sepatu yang menutup tumit",
        "Kacamata hitam",

        //4
        "Karena diatur oleh Undang-undang",
        "Supaya tetap bisa melihat jalan kalau tiba-tiba cuaca menjadi gelap",
        "Agar pengisian aki kendaraan lebih baik",
        "Agar kendaraan lebih terlihat oleh pengguna jalan yang lain",

        //5
        "Rombongan anak sekolah yang menggunakan sepeda",
        "Kendaraan lain yang sedang memberi kesempatan menyeberang kepada pejalan kaki atau pengendara sepeda",
        "Rombongan pawai/karnaval",
        "Rombongan jenazah",

        //6
        "Kendaraan yang akan didahului memberi ruang yang cukup untuk didahului",
        "Salah perhitungan jarak dan kecepatan yang diperlukan untuk mendahului secara aman",
        "Memberi tanda berulang - ulang lampu sein kanan sebagai tanda permintaan mendahului",
        "Pengemudi tidak membawa surat-surat kelengkapan berkendaraan",

        //7
        "Diperlukan untuk keselamatan lalu lintas",
        "Melewati kendaraan bermotor lainnya",
        "Butir a dan b benar semua",
        "Butir a dan b salah semua",

        //8
        "Untuk menunjukkan bahwa kita akan berjalan lurus depan di suatu persimpangan",
        "Untuk tanda bahwa kendaraan kita sedang mundur",
        "Untuk memberi tanda bahwa kita sedang dalam keadaan darurat",
        "Untuk memberi tanda pada saat kendaraan akan berbelok",

        //9
        "SIM A",
        "SIM C",
        "SIM C I",
        "SIM C II",

        //10
        "Mengambil sikap duduk setegak mungkin",
        "Mengambil sikap duduk condong ke depan agar pandangan pengemudi lebih luas",
        "Mengambil sikap duduk yang nyaman, posisi tangan dan kaki tidak tegang",
        "Mengambil sikap duduk seenaknya",

        //11
        "Memberhentikan arus lalu lintas dan/atau pemakai jalan tertentu",
        "Memerintahkan pemakai jalan untuk jalan terus dan mempercepat arus lalu lintas",
        "Memperlambat arus lalu lintas dan atau mengubah arah arus lalu lintas",
        "Semuanya benar",

        //12
        "Truck yang membawa muatan",
        "Anak-anak yang bermain di jalanan",
        "Pengendara sepeda motor",
        "Kendaraan yang parkir di bahu jalan",

        //13
        "Menambah kecepatan",
        "Memberi ruang yang cukup dan aman bila situasi memungkinkan kendaraan tersebut mendahului bila perlu memperlambat kendaraan",
        "Tidak memberi tanda lampu sein kanan bila dipandang keadaan tidak memungkinkan untuk didahului",
        "Mempertahankan kecepatan dan membiarkan kendaraan yang akan mendahului memperhitungkan keamanannya sendiri",

        //14
        "Peralatan pendukung yang dapat mengejutkan seseorang",
        "Peralatan pendukung yang dapat memberikan tanda kepada sesama pengguna jalan",
        "Peralatan pendukung yang digunakan pada saat konvoi kendaaraan",
        "Peralatan pendukung yang digunakan pada saat meminta prioritas jalan",

        //15
        "Petugas penegak hukum tertentu, dinas pemadam kebakaran dan Ambulan",
        "Iring-iringan konvoi kendaraan pribadi",
        "Mobil mewah dan motor besar",
        "Mobil dinas pejabat",

        //16
        "Pengemudi kendaraan yang berada pada lajur paling kanan",
        "Pengemudi kendaraan yang berada paling depan",
        "Pejalan kaki yang masih berada di atas zebra cross",
        "Pengemudi kendaraan yang berada pada lajur paling kiri",

        //17
        "Golongan SIM C",
        "Golongan SIM C I",
        "Golongan SIM C II",
        "Golongan SIM C I dan C II benar",

        //18
        "KTP",
        "Pengisian formulir permohonan",
        "Rumusan sidik jari",
        "Kartu keluarga",

        //19
        "Halte bus",
        "Pada belokan, persimpangan, jembatan dan lokasi yang terdapat rambu larangan berhenti",
        "Di depan kantor polisi",
        "Di depan kantor pemerintah",

        //20
        "Dibuat oleh masing-masing pemilik kendaraan bermotor, sesuai selera pemilik kendaraan asalkan sesuai dengan nomor polisi kendaraan",
        "Dipasang pelat TNKB yang ada walaupun tidak sesuai dengan STNK sambil menuggu pelat nomor asli dari Polisi",
        "Diperoleh dari Polisi lalu lintas yang mengeluarkan STNK dan TNKB",
        "Dibuat sendiri dan dimodifikasi ukurannya sesuai dengan kendaraan",

        //21
        "Memberi ruang cukup pada saat berpapasan dan bila perlu memperlambat kendaraan",
        "Tetap mempertahankan kecepatan karena berada pada jalur jalan yang benar",
        "Memberi tanda sinar dengan mengedipkan lampu jarak jauh berulang kali agar kendaraan dari depan memberi ruang jalan",
        "Memberikan tanda dengan membunyikan klakson agar pengendara dari arah depan tidak mengambil jalur jalan yang berlawanan",

        //22
        "SIM C",
        "SIM A",
        "SIM B1",
        "SIM B2",

        //23
        "Tidak berakibat apa-apa kalau pengemudi mahir",
        "Kendaraan akan slip (tergelincir)",
        "Membahayakan kendaraan lain di belakang",
        "Kendaraan sulit dikendalikan",

        //24
        "Pengemudi bermaksud akan melewati kendaraan didepannya",
        "Ditunjuk atau ditetapkan oleh petugas yang berwenang, untuk digunakan sebagai jalur kiri yang bersifat sementara",
        "Butir a dan b benar semua",
        "Butir a dan b salah semua",

        //25
        "Kondisi cuaca",
        "Kecepatan kendaraan dan jarak berhenti apabila direm",
        "Asap tebal dari knalpot kendaraan di depan",
        "Kondisi kesehatan pengemudi"
        )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUjianBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
        onBackPressedDispatcher.addCallback(this,onBackInvokedCallback)
    }

    @SuppressLint("SetTextI18n")
    private fun showNextQuestion() {
        checkAnswer()
        binding.apply {
            if (updateQueNo < 25) {
                tvNoOfQues.text = "${updateQueNo + 1}/25"
                updateQueNo++
            }
            if (qIndex <= questions.size - 1) {
                tvQuestion.text = questions[qIndex]
                radioButton1.text = options[qIndex * 4] // 2*4=8
                radioButton2.text = options[qIndex * 4 + 1] //  2*4+1=9
                radioButton3.text = options[qIndex * 4 + 2] //  2*4+2=10
                radioButton4.text = options[qIndex * 4 + 3] //  2*4+3=11
            } else {
                score = correct
                val intent = Intent(this@UjianActivity, ResultActivity::class.java)
                intent.putExtra("correct", correct)
                intent.putExtra("wrong", wrong)
                intent.putExtra("skip", skip)
                startActivity(intent)
                finish()
            }
            radiogrp.clearCheck()
        }
    }
    @SuppressLint("SetTextI18n")
    private fun checkAnswer() {
        binding.apply {
            if (radiogrp.checkedRadioButtonId == -1) {
                skip++
                timeOverAlertDialog()
            } else {
                val checkRadioButton =
                    findViewById<RadioButton>(radiogrp.checkedRadioButtonId)
                val checkAnswer = checkRadioButton.text.toString()
                if (checkAnswer == answer[qIndex]) {
                    correct++
                    txtPlayScore.text = "Score : $correct"
                    correctAlertDialog()
                    countDownTimer?.cancel()
                } else {
                    wrong++
                    wrongAlertDialog()
                    countDownTimer?.cancel()
                }
            }
            qIndex++
        }
    }
    @SuppressLint("SetTextI18n")
    private fun initViews() {
        binding.apply {
            tvQuestion.text = questions[qIndex]
            radioButton1.text = options[0]
            radioButton2.text = options[1]
            radioButton3.text = options[2]
            radioButton4.text = options[3]
            // check options selected or not
            // if selected then selected option correct or wrong
            nextQuestionBtn.setOnClickListener {
                if (radiogrp.checkedRadioButtonId == -1) {
                    Toast.makeText(this@UjianActivity,
                        "Please select an options",
                        Toast.LENGTH_SHORT)
                        .show()
                } else {
                    showNextQuestion()
                }
            }
            tvNoOfQues.text = "$updateQueNo/25"
            tvQuestion.text = questions[qIndex]
            defaultColor = quizTimer.textColors
            timeLeftMilliSeconds = countDownInMilliSecond
            statCountDownTimer()
        }
    }
    private fun statCountDownTimer() {
        countDownTimer = object : CountDownTimer(timeLeftMilliSeconds, countDownInterval) {
            override fun onTick(millisUntilFinished: Long) {
                binding.apply {
                    timeLeftMilliSeconds = millisUntilFinished
                    val second = TimeUnit.MILLISECONDS.toSeconds(timeLeftMilliSeconds).toInt()
                    // %02d format the integer with 2 digit
                    val timer = String.format(Locale.getDefault(), "Time: %02d", second)
                    quizTimer.text = timer
                    if (timeLeftMilliSeconds < 10000) {
                        quizTimer.setTextColor(Color.RED)
                    } else {
                        quizTimer.setTextColor(defaultColor)
                    }
                }
            }
            override fun onFinish() {
                showNextQuestion()
            }
        }.start()
    }
    @SuppressLint("SetTextI18n")
    private fun correctAlertDialog() {
        val builder = AlertDialog.Builder(this@UjianActivity)
        val view = LayoutInflater.from(this@UjianActivity).inflate(R.layout.correct_answer, null)
        builder.setView(view)
        val tvScore = view.findViewById<TextView>(R.id.tvDialog_score)
        val correctOkBtn = view.findViewById<Button>(R.id.correct_ok)
        tvScore.text = "Score : $correct"
        val alertDialog = builder.create()
        correctOkBtn.setOnClickListener {
            timeLeftMilliSeconds = countDownInMilliSecond
            statCountDownTimer()
            alertDialog.dismiss()
        }
        alertDialog.show()
    }
    @SuppressLint("SetTextI18n")
    private fun wrongAlertDialog() {
        val builder = AlertDialog.Builder(this@UjianActivity)
        val view = LayoutInflater.from(this@UjianActivity).inflate(R.layout.wrong_answer, null)
        builder.setView(view)
        val tvWrongDialogCorrectAns = view.findViewById<TextView>(R.id.tv_wrongDialog_correctAns)
        val wrongOk = view.findViewById<Button>(R.id.wrong_ok)
        tvWrongDialogCorrectAns.text = "Correct Answer : " + answer[qIndex]
        val alertDialog = builder.create()
        wrongOk.setOnClickListener {
            timeLeftMilliSeconds =
                countDownInMilliSecond
            statCountDownTimer()
            alertDialog.dismiss()
        }
        alertDialog.show()
    }
    @SuppressLint("SetTextI18n")
    private fun timeOverAlertDialog() {
        val builder = AlertDialog.Builder(this@UjianActivity)
        val view = LayoutInflater.from(this@UjianActivity).inflate(R.layout.time_over, null)
        builder.setView(view)
        val timeOverOk = view.findViewById<Button>(R.id.timeOver_ok)
        val alertDialog = builder.create()
        timeOverOk.setOnClickListener {
            timeLeftMilliSeconds = countDownInMilliSecond
            statCountDownTimer()
            alertDialog.dismiss()
        }
        alertDialog.show()
    }

    private val onBackInvokedCallback = object : OnBackPressedCallback(true){
        override fun handleOnBackPressed(){
            val intent = Intent(this@UjianActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}