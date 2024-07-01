package com.example.ecorecicla;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VersionAdapter extends RecyclerView.Adapter<VersionAdapter.VersionViewHolder> {
    private final List<Version> versionList;

    public VersionAdapter(List<Version> versionList) {
        this.versionList = versionList;
    }

    @NonNull
    @Override
    public VersionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new VersionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VersionViewHolder holder, int position) {
        Version version = versionList.get(position);
        holder.bind(version);
    }

    @Override
    public int getItemCount() {
        return versionList.size();
    }

    public class VersionViewHolder extends RecyclerView.ViewHolder {
        private final TextView bill_number;
        private final TextView user_name;
        private final TextView address;
        private final TextView buyer_name;
        private final TextView vehicle_plate;
        private final LinearLayout linearLayout;
        private final RelativeLayout expandableLayout;

        public VersionViewHolder(@NonNull View itemView) {
            super(itemView);
            bill_number = itemView.findViewById(R.id.bill_number);
            user_name = itemView.findViewById(R.id.user_name);
            address = itemView.findViewById(R.id.address);
            buyer_name = itemView.findViewById(R.id.buyer_name);
            vehicle_plate = itemView.findViewById(R.id.vehicle_plate);
            linearLayout = itemView.findViewById(R.id.linear_layout);
            expandableLayout = itemView.findViewById(R.id.expandable_layout);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Version version = versionList.get(getAdapterPosition());
                    version.setExpanded(!version.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }

        public void bind(Version version) {
            bill_number.setText(version.getBill_number());
            user_name.setText(version.getUserName());
            address.setText(version.getAddress());
            buyer_name.setText(version.getBuyer_name());
            vehicle_plate.setText(version.getVehicle_plate());
            expandableLayout.setVisibility(version.isExpanded() ? View.VISIBLE : View.GONE);
        }
    }
}
