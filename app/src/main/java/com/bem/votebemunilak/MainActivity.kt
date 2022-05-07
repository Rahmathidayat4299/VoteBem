package com.bem.votebemunilak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        binding.btnSave.setOnClickListener { saveData() }
//        setupActionBarWithNavController(findNavController(R.id.fragment))
    }

//    override fun onSupportNavigateUp(): Boolean {
//        val navController = findNavController(R.id.fragment)
//        return navController.navigateUp() || super.onSupportNavigateUp()
//    }

    //    private fun saveData() {
//        val nama = binding.etName.text.toString().trim()
//        val email = binding.etEmail.text.toString().trim()
//
//        if (nama.isEmpty()) {
//            binding.etName.error = "isi nama"
//            return
//        }
//        if (email.isEmpty()) {
//            binding.etEmail.error = "isi email"
//            return
//        }
//        val ref = FirebaseDatabase.getInstance().getReference("Testing")
//        val testId: String? = ref.push().key
//        val test = mahasiswa(testId, nama, email)
//        if (testId != null) {
//            ref.child(testId).setValue(test).addOnCompleteListener {
//                Toast.makeText(applicationContext, "datamasuk", Toast.LENGTH_SHORT).show()
//            }
//        }
//    }
}