package com.example.myapplication
import android.content.Context
import android.content.res.AssetManager
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import java.io.IOException
import java.lang.reflect.Type

class JsonReader(private val context: Context){
    fun readJsonData(fileName: String): MyData? { //  Замените MyData на ваш класс данных
        val assetManager: AssetManager = context.assets
        try {
            val inputStream = assetManager.open(fileName)
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()
            val json = String(buffer, Charsets.UTF_8)

            val gson = GsonBuilder().create() // Или используйте Gson() без кастомной настройки
            val type: Type = object : TypeToken<MyData>() {}.type //  Замените MyData на ваш класс данных
            return gson.fromJson(/* json = */ json, /* typeOfT = */ type)

        } catch (e: IOException) {
            e.printStackTrace()
            return null
        }
    }
}

class MyData(val name: String, val age: Int, val city: String) {

}
