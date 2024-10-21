package com.example.logintablayout

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.logintablayout.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener {
            val username = binding.etUsername.text.toString()
            val password = binding.etPassword.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(requireContext(), "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else {
                // Proceed with login logic (e.g., validate username and password)
                // If login is successful, navigate to MainActivity2
                val intent = Intent(requireContext(), MainActivity2::class.java)
                intent.putExtra("USERNAME", username) // Pass the username to the next activity
                startActivity(intent)
                requireActivity().finish() // Optional: Finish the current activity if you don't want to return to it
            }
        }

        binding.tvRegister.setOnClickListener {
            // Logic to navigate to the registration fragment
            Toast.makeText(requireContext(), "Navigate to Register", Toast.LENGTH_SHORT).show()
        }

        binding.tvTerms.setOnClickListener {
            // Logic to handle forgotten password scenario
            Toast.makeText(requireContext(), "Forgot Password Clicked", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null  // Prevent memory leaks
    }
}
