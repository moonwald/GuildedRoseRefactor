public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("Test!");

        Item[] items = new Item[] {
                new Item("Kronborg Castle", 10, 20), //
                new Item("Odiham Castle", 2, 0), //
                new Item("Nathria Castle", 5, 7), //
                new Item("Corvins Castle", 0, 80), //
                new Item("Corvins Castle", -1, 80),
                new Item("Backstage passes to a ColdPlay concert", 15, 20),
                new Item("Backstage passes to a ColdPlay concert", 7, 20),
                new Item("Backstage passes to a ColdPlay concert", 5, 49),
                // this conjured item does not work properly yet
                new Item("Neuschwanstein Castle", 3, 24) };

        GildedRose app = new GildedRose(items);

        int days = 8;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }
}