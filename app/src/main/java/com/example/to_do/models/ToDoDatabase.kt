package com.example.to_do.models

import javax.security.auth.Subject

data class ToDoDatabase(var header:String?="",
                        var subject:String?="",
                        var body:String?="")