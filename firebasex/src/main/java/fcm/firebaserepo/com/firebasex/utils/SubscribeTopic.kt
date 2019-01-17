package fcm.firebaserepo.com.firebasex.utils

import android.util.Log
import com.google.firebase.messaging.FirebaseMessaging

open class SubscribeTopic {


    companion object {
        fun subscribaTopics(topic: String) {
            FirebaseMessaging.getInstance().subscribeToTopic(topic)
        }

        fun logi(tag: String, message: String) {
            Log.d(tag, message)
        }
    }

}