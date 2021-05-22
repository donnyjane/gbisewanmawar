package com.example.gbisewanmawar.ui.alkitab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.gbisewanmawar.databinding.FragmentAlkitabBinding;

public class AlkitabFragment extends Fragment {

    private AlkitabViewModel alkitabViewModel;
    private FragmentAlkitabBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        alkitabViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(AlkitabViewModel.class);

        binding = FragmentAlkitabBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAlkitab;
        alkitabViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}