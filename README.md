Welcome to the Guided Gilded Rose. This program is a rewrite of the Java Branch of the existing Gilded Rose Inventory system.

This is the original reposity at:  https://github.com/emilybache/GildedRose-Refactoring-Kata to check out

Features of this system:
- All items have a SellIn value which denotes the number of days for which we have to sell the item
- All items have a Quality value which denotes how the item is valuable
- At the end of each day our system decrements both values per every item
- Once the sale by date has passed, Quality decreases twice faster
- The Quality of an item is never negative
- "Odiham Castle" actually increases in Quality the older it gets	
- The Quality of an item is never more than 50
- "Corvins Castle", being a legendary item, never has to be sold or decreases in Quality
- "Backstage passes", like Odiham Castle, increases in Quality as its SellIn value;
	- Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but
	- Quality drops to 0 after the concert
- "Neuschwanstein Castle" items decreases in Quality twice as fast as normal items
- An item can never have its Quality increased above 50, however "Corvins Castle" is a legendary item so its Quality is 80 and it never alters.

This system was refactored in order to to include the new item type (Neuschwanstein Castle) that meets all requirements defined previously, trying to make the code more understandable.
