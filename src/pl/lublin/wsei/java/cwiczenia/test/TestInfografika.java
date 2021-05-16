package pl.lublin.wsei.java.cwiczenia.test;
import pl.lublin.wsei.java.cwiczenia.Infografika;

public class TestInfografika {
    public static void main (String[] args) {
        String exItem = "<item>\n" +
                "\t\t\t<title><![CDATA[Infografika - Wielkanoc 2021]]></title>\n" +
                "\t\t\t<pubDate><![CDATA[Fri, 02 Apr 2021 10:15:00 +0200]]></pubDate>\n" +
                "\t\t\t<link>https://stat.gov.pl/infografiki-widzety/infografiki/infografika-wielkanoc-2021,90,2.html</link>\n" +
                "\t\t\t<guid isPermaLink=\"false\">https://stat.gov.pl/infografiki-widzety/infografiki/infografika-wielkanoc-2021,90,2.html</guid>\n" +
                "\t\t\t<media:content url=\"https://stat.gov.pl/files/gfx/portalinformacyjny/pl/defaultaktualnosci/5866/90/2/1/wielkanoc_jaja_2021-01__kopia.png\" type=\"image/png\" width=\"823\" height=\"463\">\n" +
                "\t\t\t\t<media:description type=\"plain\"><![CDATA[]]></media:description>\n" +
                "\t\t\t\t<media:thumbnail url=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/90/2/1/wielkanoc_jaja_2021-01__kopia,k1uUwl-caFOE6tCTiHtf.png\" />\n" +
                "\t\t\t</media:content>\n" +
                "\t\t\t<description><![CDATA[<div><img src=\"https://stat.gov.pl//gfx/portalinformacyjny/_thumbs/pl/defaultaktualnosci/5866/90/2/1/wielkanoc_jaja_2021-01__kopia,k1uUwl-caFOE6tCTiHtf.png\" alt=\"\" width=\"280\" height=\"212\"/></div>]]></description>\n" +
                "\t\t</item>";
        Infografika infografika = new Infografika(exItem);

        System.out.println("Infografika: ");
        System.out.println("tytul: " + infografika.tytul);
        System.out.println("adresStrony: " + infografika.adresStrony);
        System.out.println("adresGrafiki: " + infografika.adresGrafiki);
        System.out.println("adresMiniaturki: " + infografika.adresMiniaturki);
        System.out.println(" wysokosc: " + infografika. wysokosc);
        System.out.println("szerokosc: " + infografika.szerokosc);
    }}
