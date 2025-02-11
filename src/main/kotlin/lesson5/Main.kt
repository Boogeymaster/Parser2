package lesson5

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {

    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/").get()
    val phrases: Elements = doc.select("#__next .sc-2aegk7-2")
    for (phrase: Element in phrases){
        println(phrase.ownText())
    }
}