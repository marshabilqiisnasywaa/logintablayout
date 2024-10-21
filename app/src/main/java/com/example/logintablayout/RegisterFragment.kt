package com.example.logintablayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.logintablayout.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set up the registration button click listener
        binding.btnRegister.setOnClickListener {
            val username = binding.etUsername.text.toString()
            val email = binding.etEmail.text.toString()
            val phone = binding.etPhone.text.toString()
            val password = binding.etPassword.text.toString()
            val isTermsChecked = binding.checkTerms.isChecked

            // Basic validation
            if (username.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty()) {
                Toast.makeText(requireContext(), "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else if (!isTermsChecked) {
                Toast.makeText(requireContext(), "You must agree to the Terms and Conditions", Toast.LENGTH_SHORT).show()
            } else {
                // Proceed with registration logic
                // You can call your registration API here

                Toast.makeText(requireContext(), "Registration Successful", Toast.LENGTH_SHORT).show()
                // Optionally, you can navigate to another fragment or activity
            }
        }

        // Handle the "Log In" text click
        binding.tvRegister.setOnClickListener {
            // Logic to navigate to the login fragment (if applicable)
            Toast.makeText(requireContext(), "Navigate to Login", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null  // Prevent memory leaks
    }
}
