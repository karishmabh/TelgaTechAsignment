package com.example.telgatech.data.model

data class GetData(
	val perPage: Int? = null,
	val total: Int? = null,
	val data: List<Data?>? = null,
	val page: Int? = null,
	val totalPages: Int? = null,
	val support: Support? = null
)

data class Data(
	val lastName: String? = null,
	val id: Int? = null,
	val avatar: String? = null,
	val firstName: String? = null,
	val email: String? = null
)

data class Support(
	val text: String? = null,
	val url: String? = null
)

