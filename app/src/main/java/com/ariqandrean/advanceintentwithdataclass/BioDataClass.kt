package com.ariqandrean.advanceintentwithdataclass

import java.io.Serializable

data class BioDataClass(
    val name: String,
    val npm: Int,
    val kelas: String
) :Serializable
