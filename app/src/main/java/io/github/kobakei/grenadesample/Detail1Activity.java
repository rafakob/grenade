package io.github.kobakei.grenadesample;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.github.kobakei.grenade.annotation.Extra;
import io.github.kobakei.grenade.annotation.Launcher;

/**
 * Simple sample
 */
@Launcher
public class Detail1Activity extends AppCompatActivity {

    @Extra
    public String foo;
    @Extra
    int bar;
    @Extra @Nullable
    String hoge;
    @Extra @Nullable
    String fuga;


    @Bind(R.id.foo)
    TextView fooView;
    @Bind(R.id.bar)
    TextView barView;
    @Bind(R.id.hoge)
    TextView hogeView;
    @Bind(R.id.fuga)
    TextView fugaView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail1);
        ButterKnife.bind(this);

        Detail1ActivityIntentBuilder.inject(this, getIntent());

        fooView.setText(foo);
        barView.setText(String.valueOf(bar));
        hogeView.setText(hoge);
        fugaView.setText(fuga);
    }
}
