package com.example.healther

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RemoteViews
import com.example.healther.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var notificationManager: NotificationManager
    lateinit var notificationChannel: NotificationChannel
    lateinit var builder: Notification.Builder
    private val channelId = "com.example.yvedomlenie"
    private val decscription = "Toast notification"

    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val received = intent.extras?.getString("Email")
        val fragment = supportFragmentManager.findFragmentById(binding.fragmentContainerView.id) as
                HomeMenuFragment
        fragment.email = received

        binding.bottomNavigationViewHome.setOnItemSelectedListener { menu ->
            when(menu.itemId){
                R.id.menu -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainerView, HomeMenuFragment())
                        .commit()
                }
                R.id.setting -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainerView, HomeSettingFragment())
                        .commit()
                }
                R.id.analysis -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainerView, HomeAnalysisFragment())
                        .commit()
                }
                R.id.notify -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainerView, HomeNotifyFragment())
                        .commit()
                }
            }
            true
        }

            val intent = Intent(this, MedicalHistoryActivity::class.java)
            val pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
            val contentView = RemoteViews(packageName, R.layout.notification_layout)
            contentView.setTextViewText(R.id.tvTitle, "Attention!")
            contentView.setTextViewText(R.id.tvContent, "Don't forget to add a notification about a doctor's visit")

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                notificationChannel = NotificationChannel(channelId, decscription, NotificationManager.IMPORTANCE_HIGH)
                notificationChannel.enableLights(true)
                notificationChannel.lightColor = Color.BLUE
                notificationChannel.enableVibration(false)
                notificationManager.createNotificationChannel(notificationChannel)

                builder = Notification.Builder(this, channelId)
                    .setContent(contentView)
                    .setSmallIcon(R.drawable.ic_notification)
                    .setContentIntent(pendingIntent)
            } else{
                builder = Notification.Builder(this)
                    .setContent(contentView)
                    .setSmallIcon(R.drawable.ic_notification)
                    .setContentIntent(pendingIntent)
            }
            notificationManager.notify(1234, builder.build())

    }
}