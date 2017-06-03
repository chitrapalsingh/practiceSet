package lruCache;

import java.util.HashMap;
import java.util.Map;

import lruCache.DoublyLinkedList.Node;

public class LRUCache {
	
	private DoublyLinkedList pageList;
	
	private Map<Integer, Node> pageMap;
	
	private final int cacheSize;
	
	public LRUCache(int cacheSize) {
		this.cacheSize = cacheSize;
		pageList = new DoublyLinkedList(cacheSize);
		pageMap = new HashMap<Integer, Node>();
	}
	
	public void accessCachePage(int pageNumber) {
		Node pageNode = null;
		
		if (pageMap.containsKey(pageNumber)) {
			pageNode = pageMap.get(pageNumber);
			pageList.movePageToHead(pageNode);
		} else {
			if (pageList.getCurrSize() == pageList.getSize()) {
				pageMap.remove(pageList.getTail().getPageNumber());
			}
			pageNode = pageList.addPageToList(pageNumber);
			pageMap.put(pageNumber, pageNode);
		}
	}
	
	public void printCacheState() {
		pageList.printList();
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int cacheSize = 4;
        LRUCache cache = new LRUCache(cacheSize);
        cache.accessCachePage(4);
        cache.printCacheState();
        cache.accessCachePage(2);
        cache.printCacheState();
        cache.accessCachePage(1);
        cache.printCacheState();
        cache.accessCachePage(1);
        cache.printCacheState();
        cache.accessCachePage(4);
        cache.printCacheState();
        cache.accessCachePage(3);
        cache.printCacheState();
        cache.accessCachePage(7);
        cache.printCacheState();
        cache.accessCachePage(8);
        cache.printCacheState();
        cache.accessCachePage(3);
        cache.printCacheState();
	}

}
