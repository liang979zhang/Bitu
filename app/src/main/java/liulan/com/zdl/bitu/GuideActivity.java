package liulan.com.zdl.bitu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import liulan.com.zdl.bitu.when.PageFrameLayout;

public class GuideActivity extends AppCompatActivity {

    private PageFrameLayout pageFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        pageFrameLayout = findViewById(R.id.contentFrameLayout);
        pageFrameLayout.setUpViews(this, new int[]{R.layout.page_tab1, R.layout.page_tab2, R.layout.page_tab3}, R.mipmap.banner_on, R.mipmap.banner_off);


    }

}
