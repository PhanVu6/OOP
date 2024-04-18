package hus.oop.decorator;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class BreadStore {
	private List<Bread> breads;

	public BreadStore() {
		breads = new LinkedList<>();
	}

	/**
	 * Giả sử bánh mỳ được làm không cho một loại gia vị nhiều hơn một lần.
	 * Bắt đầu, tạo ra và cho vào cửa hàng:
	 * 5 bánh mỳ ThickcrustBread chỉ có cheese,
	 * 5 bánh mỳ ThickcrustBread chỉ có olives,
	 * 5 bánh mỳ ThickcrustBread có cả cheese và olives,
	 * 5 bánh mỳ ThincrustBread chỉ có cheese,
	 * 5 bánh mỳ ThincrustBread chỉ có olives,
	 * 5 bánh mỳ ThincrustBread có cả cheese và olives.
	 */
	public void init() {
		for (int i = 0; i < 5; i++) {
			// * 5 bánh mỳ ThickcrustBread chỉ có cheese,
			breads.add(new Cheese(new ThickcrustBread()));
			// * 5 bánh mỳ ThickcrustBread chỉ có olives,
			breads.add(new Olives(new ThickcrustBread()));
			// * 5 bánh mỳ ThickcrustBread có cả cheese và olives,
			breads.add(new Cheese(new Olives(new ThickcrustBread())));
			// * 5 bánh mỳ ThincrustBread chỉ có cheese,
			breads.add(new Cheese(new ThincrustBread()));
			// * 5 bánh mỳ ThincrustBread chỉ có olives,
			breads.add(new Olives(new ThincrustBread()));
			// * 5 bánh mỳ ThincrustBread có cả cheese và olives.
			breads.add(new Cheese(new Olives(new ThincrustBread())));
		}

	}

	/**
	 * Thêm bánh mỳ vào cửa hàng.
	 */
	public void add(Bread bread) {
		breads.add(bread);
	}

	/**
	 * Giả sử cửa hàng bán một cái bánh mỳ nào đó,
	 * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên có giá bằng giá
	 * bánh mỳ yêu cầu.
	 * Nếu còn bánh mỳ để bán thì trả về giá trị true,
	 * nếu không còn trả về giá trị false.
	 */
	public boolean sell(Bread bread) {
		boolean checkStore = false;
		for (int i = 0; i < breads.size(); i++) {
			if (breads.get(i).cost() == bread.cost()) {
				breads.remove(i);
				checkStore = true;
				break;
			}
		}
		return checkStore;
	}

	/**
	 * In ra những bánh mỳ còn trong cửa hàng.
	 */
	public void print() {
		Iterator<Bread> iterator = breads.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
	}

	/**
	 * Sắp xếp các bánh mỳ còn lại theo thứ tự được cho bởi order,
	 * nếu order là true, sắp xếp theo thứ tự tăng dần,
	 * nếu order là false, sắp xếp theo thứ tự giảm dần.
	 * Việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
	 */
	public List<Bread> sort(boolean order) {
		List<Bread> tempBreads = new ArrayList<Bread>(breads);
		MyCostComparator myCostComparator = new MyCostComparator();
		Comparator<Bread> comparator = new Comparator<Bread>() {
			@Override
			public int compare(Bread o1, Bread o2) {
				if (order) {
					return myCostComparator.compare(o1, o2);
				}
				return -myCostComparator.compare(o1, o2);
			}
		};
		Collections.sort(tempBreads, comparator);

		return tempBreads;
	}

	/**
	 * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
	 * nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
	 * nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
	 */
	public List<Bread> filter(int howMany, boolean order) {
		List<Bread> tempBreads = new ArrayList<Bread>(breads);
		List<Bread> howManyBreads = new ArrayList<Bread>();
		MyCostComparator myCostComparator = new MyCostComparator();
		Comparator<Bread> comparator = new Comparator<Bread>() {
			@Override
			public int compare(Bread o1, Bread o2) {
				if (order) {
					return myCostComparator.compare(o1, o2);
				}
				return -myCostComparator.compare(o1, o2);
			}
		};
		Collections.sort(tempBreads, comparator);

		for (int i = 0; i < howMany; i++) {
			howManyBreads.add(tempBreads.get(i));
		}
		return howManyBreads;
	}

	public static void main(String args[]) {
		BreadStore breadStore = new BreadStore();
		breadStore.init();

		/*
		 * Sau khi khởi tạo số bánh mỳ cho cửa hàng, viết chương trình demo:
		 * - Thêm một số bánh mỳ vào cửa hàng
		 * - Bán một số bánh mỳ từ cửa hàng
		 * - In ra số bánh mỳ còn lại theo thứ tự giá tăng dần.
		 * - In ra nhiều nhất 10 cái bánh mỳ có giá thấp nhất còn trong cửa hàng.
		 */
		// Print store
		System.out.println("Store init:");
		breadStore.print();

		// Sell
		ThincrustBread thincrustBread = new ThincrustBread();
		Bread bread = new Cheese(thincrustBread);
		System.out.print("\nSell a bread " + bread);
		System.out.println("Store has " + breadStore.sell(bread));
		breadStore.print();

		// Sort follow cost
		System.out.println("\nSort increase by cost: \n" + breadStore.sort(true));

		// Filter the 10 breads of store are cheap
		System.out.println("\nFilter the 10 breads of store are cheap: \n " + breadStore.filter(10, true));

	}
}
