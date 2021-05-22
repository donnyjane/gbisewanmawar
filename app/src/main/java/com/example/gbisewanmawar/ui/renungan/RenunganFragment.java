package com.example.gbisewanmawar.ui.renungan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;

import com.example.gbisewanmawar.R;
import com.example.gbisewanmawar.databinding.FragmentRenunganBinding;

public class RenunganFragment extends Fragment {

    private RenunganViewModel renunganViewModel;
    private FragmentRenunganBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        renunganViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(RenunganViewModel.class);

        binding = FragmentRenunganBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textRenungan;
        renunganViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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