package com.nujat.assignment5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemList = new ArrayList<>();
        itemList.add(new Item(R.drawable.img, "C++", "High-performance language", "C++ is a powerful, high-performance programming language used for system/software development and game programming.", R.drawable.icon1));
        itemList.add(new Item(R.drawable.img_1, "Python", "Easy to learn", "Python is an easy-to-learn, interpreted language that emphasizes readability and simplicity, widely used in data science and web development.", R.drawable.icon3));
        itemList.add(new Item(R.drawable.img_2, "Java", "Platform-independent", "Java is a widely-used, object-oriented language known for its portability and being the backbone of many enterprise applications.", R.drawable.icon2));

        itemList.add(new Item(R.drawable.img_3, "JavaScript", "Web development", "JavaScript is the backbone of web interactivity and dynamic front-end development.", R.drawable.icon4));
        itemList.add(new Item(R.drawable.img_4, "C#", "Microsoft’s flagship language", "C# is a modern, object-oriented language commonly used in game development and enterprise applications.", R.drawable.icon5));
        itemList.add(new Item(R.drawable.img_5, "Swift", "iOS development", "Swift is Apple's preferred language for developing iOS and macOS applications.", R.drawable.icon6));
        itemList.add(new Item(R.drawable.img_6, "PHP", "Web backend", "PHP is a server-side scripting language mainly used for web development and backend systems.", R.drawable.icon7));
        itemList.add(new Item(R.drawable.img_7, "Ruby", "Dynamic scripting language", "Ruby is best known for web development, especially with the Ruby on Rails framework.", R.drawable.icon8));
        adapter = new ItemAdapter(this, itemList);
        recyclerView.setAdapter(adapter);
    }
}
