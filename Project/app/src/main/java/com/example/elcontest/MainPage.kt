package com.example.elcontest

import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.elcontest.ui.theme.ELContestTheme

class MainPage : ComponentActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationDrawer: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainpage)

        drawerLayout = findViewById(R.id.MainPage)
        navigationDrawer = findViewById(R.id.NavigationDrawer)

        // 设置侧边栏的宽度为屏幕的75%
        val params = navigationDrawer.layoutParams as DrawerLayout.LayoutParams
        params.width = (resources.displayMetrics.widthPixels * 0.75).toInt()
        navigationDrawer.layoutParams = params

        // 设置ToggleButton的点击监听器
        val toggleButton: Button = findViewById(R.id.ToggleButton)
        toggleButton.setOnClickListener {
            // 根据抽屉的状态打开或关闭
            if (drawerLayout.isDrawerOpen(GravityCompat.END)) {
                drawerLayout.closeDrawer(GravityCompat.END)
            } else {
                drawerLayout.openDrawer(GravityCompat.END)
            }
        }
    }
}