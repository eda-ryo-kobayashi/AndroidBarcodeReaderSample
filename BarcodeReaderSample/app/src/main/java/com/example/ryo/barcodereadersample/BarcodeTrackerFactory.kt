package com.example.ryo.barcodereadersample

import com.google.android.gms.vision.MultiProcessor
import com.google.android.gms.vision.Tracker
import com.google.android.gms.vision.barcode.Barcode

/**
 * Created by Ryo on 2017/08/31.
 *
 * バーコードの
 */
class BarcodeTrackerFactory() : MultiProcessor.Factory<Barcode> {
    



    override fun create(p0: Barcode?): Tracker<Barcode> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}