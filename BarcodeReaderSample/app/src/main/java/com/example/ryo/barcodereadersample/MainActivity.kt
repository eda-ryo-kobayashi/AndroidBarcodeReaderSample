package com.example.ryo.barcodereadersample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.vision.barcode.BarcodeDetector

class MainActivity : AppCompatActivity() {

    private var detector: BarcodeDetector? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Detector生成
        detector = BarcodeDetector.Builder(this).build()
        // トラッキングプロセッサ生成
        val barcodeFactory: BarcodeTrackerFactory
    }
}
