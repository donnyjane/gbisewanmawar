package com.example.gbisewanmawar.ui.renungan;

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