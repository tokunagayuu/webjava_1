package jp.co.systena.tigerscave.Work1.application.service;

import java.util.HashMap;
import java.util.Map;

import jp.co.systena.tigerscave.Work1.application.model.Item;

public class ListService {

    /**
     * リストを取得します
     * @return アイテム
     */
	  public Map<String, Item> getItemList(){
		    Item item1 =new Item();
		    item1.getItemId1();
		    item1.getName1();
		    item1.getPrice1();
		    Item item2 =new Item();
		    item2.getItemId2();
		    item2.getName2();
		    item2.getPrice2();
		    Item item3 =new Item();
		    item3.getItemId3();
		    item3.getName3();
		    item3.getPrice3();
		    Map<String, Item> items = new HashMap<String, Item>();
		    items.put("1",item1);
		    items.put("2",item2);
		    items.put("3",item3);
		    return items;

	}
}
