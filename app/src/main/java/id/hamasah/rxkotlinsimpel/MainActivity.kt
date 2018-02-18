package id.hamasah.rxkotlinsimpel

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import io.reactivex.Flowable
import io.reactivex.Observable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sample 1 beberapa
        //TODO 1 : Observable - stream datanya
        Observable.fromArray("ahmad", "arif", "faizin")
                .filter { data -> data.contains("arif") }
                .subscribe{
                    data -> Log.d("dataObserv", data.toString())
                }

        //TODO 2 : Run Lihat di Log

        //TODO 3 : Tes filter data dengan operator filter


        //Sample 2 banyaak
        Flowable.just(12, 14,  16, 17, 19 )
                .map { t -> t.toDouble() }
                .filter { t: Double -> t < 15 }
                .subscribe { t: Double -> Log.d("dataFlow", t.toString())}

    }
}
