package qunzai.test01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






        //就不告诉你，，哈哈哈哈哈哈，，，

        lv = (ListView) findViewById(R.id.lv);
        LvAdapter adapter = new LvAdapter();

        //傻儿子
    }
}
