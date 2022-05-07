package com.bem.votebemunilak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bem.votebemunilak.databinding.ActivityMainBinding
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSave.setOnClickListener { saveData() }
    }

    private fun saveData() {
        val nama = binding.etName.text.toString().trim()
        val email = binding.etEmail.text.toString().trim()

        if (nama.isEmpty()) {
            binding.etName.error = "isi nama"
            return
        }
        if (email.isEmpty()) {
            binding.etEmail.error = "isi email"
            return
        }
        val ref = FirebaseDatabase.getInstance().getReference("Testing")
        val testId: String? = ref.push().key
        val test = mahasiswa(testId, nama, email)
        if (testId != null) {
            ref.child(testId).setValue(test).addOnCompleteListener {
                Toast.makeText(applicationContext, "datamasuk", Toast.LENGTH_SHORT).show()
            }
        }
    }
}