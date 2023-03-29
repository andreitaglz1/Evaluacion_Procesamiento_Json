package com.andrea.myuca

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andrea.myuca.databinding.ListaCoordinadorBinding


class CoordinadorAdapter(var coordinadores: List<Coordinador>) :
    RecyclerView.Adapter<CoordinadorAdapter.CoordinadorViewHolder>() {

    inner class CoordinadorViewHolder(private val binding: ListaCoordinadorBinding):
        RecyclerView.ViewHolder(binding.root) {

        fun bind(coordinador: Coordinador) {
            binding.tvNombres.text = coordinador.nombres
            binding.tvApellidos.text = coordinador.apellidos
            binding.tvFechaNac.text = coordinador.fechaNac
            binding.tvTitulo.text = coordinador.titulo
            binding.tvFacultad.text = coordinador.facultad
            binding.tvEmail.text = coordinador.email
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoordinadorViewHolder {
        val binding = ListaCoordinadorBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CoordinadorViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CoordinadorViewHolder, position: Int) {
        val coordinador = coordinadores[position]
        holder.bind(coordinador)
    }

    override fun getItemCount(): Int = coordinadores.size
}
