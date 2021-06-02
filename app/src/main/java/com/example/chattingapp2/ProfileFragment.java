//package com.example.chattingapp2;
//
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.fragment.app.Fragment;
//
//import com.example.chattingapp2.model.Users;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//import de.hdodenhof.circleimageview.CircleImageView;
//
//
//public class ProfileFragment extends Fragment {
//
//    CircleImageView image_profile;
//    TextView username;
//
//    DatabaseReference reference;
//    FirebaseUser fuser;
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_profile, container, false);
//
//        image_profile = view.findViewById(R.id.profile_image);
//        username = view.findViewById(R.id.username);
//
//        fuser = FirebaseAuth.getInstance().getCurrentUser();
//        reference = FirebaseDatabase.getInstance("https://hello-2d0a6-default-rtdb.asia-southeast1.firebasedatabase.app/").getReference("MyUsers").child(fuser.getUid());
//
//        reference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                Users user = snapshot.getValue(Users.class);
//                username.setText(user.getUsername());
//                if(user.getImageURL().equals("default")){
//                    image_profile.setImageResource(R.mipmap.ic_launcher);
//                }else{
//
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });
//
//        return view;
//    }
//}