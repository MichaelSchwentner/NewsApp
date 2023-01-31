package com.example.recyclerwiederholung_news.data

import com.example.recyclerwiederholung_news.R
import com.example.recyclerwiederholung_news.data.model.NewsArticle

class Repository {

    fun loadNews(): List<NewsArticle> {
        return listOf(
            NewsArticle(
                1,
                "Die Top 10 gefährlichsten Tiere Deutschlands!",
                R.drawable.raubtier,
                "Deutschland",
                "23.01.2023",
                "auchtung achtung!\nDie fressen dich",
                mutableListOf("top", "flop", "Erster")
            ),
            NewsArticle(
                2,
                "Wird künstliche Intelligenz uns bald alle ersetzen?!? Das sagen Wissenschaftler…",
                R.drawable.ai,
                "Welt",
                "26.01.2023",
                "glaubt doch niemand",
                mutableListOf()
            ),
            NewsArticle(
                3,
                "Die Hochhauspflicht - das Ende von Einfamilienhäusern? Lies alles dazu…",
                R.drawable.hochhaus,
                "Schweiz",
                "28.01.2023",
                "das ist ein Test",
                mutableListOf()
            ),
            NewsArticle(
                4,
                "Ist Leonardo Di Caprio der neue Spiderman? Hollywood spielt verrückt",
                R.drawable.leo,
                "USA",
                "30.01.2023",
                "Fände ich super",
                mutableListOf()
            ),
            NewsArticle(
                5,
                "Kommt bald Cast Away Teil 2? Tom Hanks leaked die Infos!",
                R.drawable.cast_away,
                "USA",
                "13.01.2023",
                "ojdifuiaberubfvchcbdskau jbhuhbuzbvuz",
                mutableListOf()
            )
        )
    }
}
