package fcm.firebaserepo.com.firebase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.messaging.FirebaseMessaging
import fcm.firebaserepo.com.firebasex.utils.SubscribeTopic

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun subscribeTopic(topic:String){
        FirebaseMessaging.getInstance().subscribeToTopic(topic)
    }


}
