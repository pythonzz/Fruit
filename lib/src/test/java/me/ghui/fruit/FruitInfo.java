package me.ghui.fruit;

import me.ghui.fruit.annotations.Pick;

import java.util.List;

/**
 * Created by ghui on 08/05/2017.
 */
public class FruitInfo {
    @Pick("div#only")
    private String favorite;
    @Pick(value = "div#only", attr = Attrs.HTML)
    private String favoriteHtml;
    @Pick(value = "div#only", attr = Attrs.INNER_HTML)
    private String favoriteInnerHtml;
    @Pick(value = "div#only", attr = Attrs.OWN_TEXT)
    private String favoriteOne;
    @Pick(value = "img.apple", attr = Attrs.SRC)
    private String img;
    @Pick(value = "a.author", attr = Attrs.HREF)
    private String blog;
    @Pick("div.fruit")
    private List<Item> items;
    private String fieldWithOutAnnotation = "_fieldWithOutAnnotation_";

    public String getFavorite() {
        return favorite;
    }

    public String getFavoriteOne() {
        return favoriteOne;
    }

    public String getFavoriteHtml() {
        return favoriteHtml;
    }

    public String getFavoriteInnerHtml() {
        return favoriteInnerHtml;
    }

    public String getFieldWithOutAnnotation() {
        return fieldWithOutAnnotation;
    }

    public String getImg() {
        return img;
    }

    public String getBlog() {
        return blog;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "FruitInfo{" +
                "favorite='" + favorite + '\'' +
                ", favoriteOne='" + favoriteOne + '\'' +
                ", favoriteHtml='" + favoriteHtml + '\'' +
                ", favoriteHtml='" + favoriteInnerHtml + '\'' +
                ", fieldWithOutAnnotation='" + fieldWithOutAnnotation + '\'' +
                ", img='" + img + '\'' +
                ", blog='" + blog + '\'' +
                ", items=" + items +
                '}';
    }

    public static class Item {
        @Pick("strong.name")
        private String name;
        @Pick(".color")
        private String color;

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
