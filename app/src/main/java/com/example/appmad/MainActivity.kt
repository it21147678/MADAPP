package com.example.appmad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.appmad.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.payButton.setOnClickListener{

            var firstname = binding.firstname.text.toString()
            var secondname = binding.secondname.text.toString()
            var strtaddress = binding.strtaddress.text.toString()
            var city = binding.city.text.toString()
            var postalcode = binding.postalcode.text.toString()
            var phonenum = binding.phonenum.text.toString()
            var email = binding.email.text.toString()
            var notes = binding.notes.text.toString()

            database = FirebaseDatabase.getInstance().getReference("BillingAddress")
            var billAddress = BillingDetails(firstname,secondname,strtaddress,city,postalcode,phonenum,email,notes)

            database.child(phonenum).setValue(billAddress).addOnSuccessListener {
                Toast.makeText(this, "Address Saved..!", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener{

                Toast.makeText(this,"Failed..!",Toast.LENGTH_SHORT).show()
            }

            val intent = Intent(this, Summery::class.java)
            startActivity(intent)

        }
    }
//    private fun saveData(){
//        var firstname = binding.firstname.text.toString()
//        var secondname = binding.secondname.text.toString()
//        var strtaddress = binding.strtaddress.text.toString()
//        var city = binding.city.text.toString()
//        var postalcode = binding.postalcode.text.toString()
//        var phonenum = binding.phonenum.text.toString()
//        var email = binding.email.text.toString()
//        var notes = binding.notes.text.toString()


//        val billAddress = BillingDetails(firstname,secondname,strtaddress,city,postalcode,phonenum,email,notes)
//
//        database = FirebaseDatabase.getInstance().getReference("BillingAddress")
//            database.child(email).setValue(billAddress).addOnCompleteListener { task ->
//                if (task.isSuccessful) {
//
////            binding.firstname.text.clear()
////            binding.secondname.text.clear()
////            binding.strtaddress.text.clear()
////            binding.city.text.clear()
////            binding.postalcode.text.clear()
////            binding.phonenum.text.clear()
////            binding.email.text.clear()
////            binding.notes.text.clear()
//
//                    Toast.makeText(this, "Address Saved..!", Toast.LENGTH_SHORT).show()
//                    finish()
//                }
//        }.addOnFailureListener{ e ->
//
//            Toast.makeText(this,"Failed..!",Toast.LENGTH_SHORT).show()
//        }
}
//}