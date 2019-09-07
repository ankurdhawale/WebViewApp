package c.ankur.webviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button loadWebPage,loadFromStaticHtml;
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadWebPage=findViewById(R.id.loadWebPage);
        loadFromStaticHtml=findViewById(R.id.loadFromStaticHtml);
        webView=findViewById(R.id.simpleWebView);

        loadWebPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        loadFromStaticHtml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String customHtml = "<html><body><h1>Hello, Android App Developer</h1>" +
                        "<h1>Heading 1</h1><h2>Heading 2</h2><h3>Heading 3</h3>" +
                        "<p>This is a sample paragraph of static HTML In Web view</p>" +
                        "</body></html>";
                webView.loadData(customHtml, "text/html", "UTF-8"); // load html string data in a web view

            }
        });
    }
}
