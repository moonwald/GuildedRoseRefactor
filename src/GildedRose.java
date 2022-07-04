public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item: items) {
            if (!item.name.equals("Sulfuras, Hand of Ragnaros")){
                item.sellIn--;

                if (item.name.equals("Aged Brie")){
                    if (item.sellIn < 0) {
                        item.quality = item.quality + 2;
                    } else {
                        item.quality++;
                    }
                }

                else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.sellIn < 0) {
                        item.quality = 0;
                    }
                    else if (item.sellIn < 5) {
                        item.quality += 3;
                    }
                    else if (item.sellIn < 10) {
                        item.quality += 2;
                    }
                    else {
                        item.quality++;
                    }
                }

                else if (item.name.equals("Conjured Mana Cake")) {
                    if (item.sellIn < 0) {
                        item.quality -= 4;
                    }
                    else {
                        item.quality -= 2;
                    }
                }

                else { //normal item
                    if (item.sellIn < 0) {
                        item.quality -= 2;
                    }
                    else {
                        item.quality--;
                    }
                }

                //quality remains within range
                if (item.quality < 0) {
                    item.quality = 0;
                }
                if (item.quality > 50) {
                    item.quality = 50;
                }
            }
        }
    }
}
