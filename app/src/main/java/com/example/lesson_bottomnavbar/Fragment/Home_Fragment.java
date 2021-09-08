package com.example.lesson_bottomnavbar.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.lesson_bottomnavbar.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import Book.Book;
import Categories.Category;
import Categories.CategoryAdapter;
import Silde.Photo;
import Silde.PhotoAdapter;
import me.relex.circleindicator.CircleIndicator;

public class Home_Fragment extends Fragment {
    View view;
    private RecyclerView revCategory;
    private CategoryAdapter categoryAdapter;

    /////
    private ViewPager viewPager;
    private CircleIndicator circleIndicator;
    private PhotoAdapter photoAdapter;

    private List<Photo> listPhoto;
    private Timer mTimer;

    public Home_Fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       view= inflater.inflate(R.layout.fragment_home,container,false);

       ////
        revCategory = view.findViewById(R.id.rev_category);
        categoryAdapter = new CategoryAdapter(getActivity());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false);
        revCategory.setLayoutManager(linearLayoutManager);
        categoryAdapter.setData(getListcategory());
        revCategory.setAdapter(categoryAdapter);




        return view;
    }



    private List<Category> getListcategory() {

        List<Category> listCategory = new ArrayList<>();
        List< Book> listbook= new ArrayList<>();
        listbook.add(new Book(R.drawable.indie,"Indie"));
        listbook.add(new Book(R.drawable.hiphop,"HipHop"));
        listbook.add(new Book(R.drawable.aucostic,"Acoutic"));
        listbook.add(new Book(R.drawable.vietnam,"EDM"));
        listbook.add(new Book(R.drawable.vietnam,"JAZZ"));
        listbook.add(new Book(R.drawable.vietnam,"Rock"));


//        listbook.add(new Book(R.drawable.canada,"Canada"));
//        listbook.add(new Book(R.drawable.usa,"USA"));
//        listbook.add(new Book(R.drawable.lao,"Lào"));
//        listbook.add(new Book(R.drawable.cam,"Campuchia"));
        listCategory.add(new Category("Thể Loại",listbook ));
        return listCategory;
    }

}
