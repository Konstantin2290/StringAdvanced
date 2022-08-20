package com.konstad.stringadvanced;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String nameString = "Andrey, Aleksey, Roman, Michail";
//        String[] names = nameString.split(", ");
//        for (String name : names){
//            Log.i("MyName", name);
//        }

//        String geometry = "Geometry";
//        String meter = geometry.substring(3, 7);
//        Log.i("Meter", meter);

        String url = "<img class=\"styles_image__lSxoD image styles_root__DZigd\" alt=\"Николь Кидман\" src=\"//avatars.mds.yandex.net/get-kinopoisk-image/1600647/7a0955d0-e82c-47a9-b456-256b7c912687/280x420\" srcset=\"//avatars.mds.yandex.net/get-kinopoisk-image/1600647/7a0955d0-e82c-47a9-b456-256b7c912687/280x420 1x, //avatars.mds.yandex.net/get-kinopoisk-image/1600647/7a0955d0-e82c-47a9-b456-256b7c912687/600x900 2x\" data-tid=\"d813cf42\">";
        Pattern patternImage = Pattern.compile("src=\"(.*?)\"");
        Pattern patternName = Pattern.compile("alt=\"(.*?)\"");
        Matcher matcherImage = patternImage.matcher(url);
        Matcher matcherName = patternName.matcher(url);

        while (matcherImage.find()){
            Log.i("Matcher", matcherImage.group(1));
        }
        while (matcherName.find()){
            Log.i("Matcher", matcherName.group(1));
        }

    }
}