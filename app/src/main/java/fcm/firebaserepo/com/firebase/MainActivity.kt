package fcm.firebaserepo.com.firebase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import fcm.firebaserepo.com.firebasex.utils.SubscribeTopic
import fcm.firebaserepo.com.firebasex.utils.FirebasrDB

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SubscribeTopic.logi("thianks","thian")
        FirebasrDB.logi("thinks")
    }

//    fun subscribeTopic(topic:String){
//        FirebaseMessaging.getInstance().subscribeToTopic(topic)
//    }


}
