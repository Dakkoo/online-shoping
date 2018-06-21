package net.kzn.shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	private static List<Category> categories = new ArrayList<Category>();

	static {
		// adding first category
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Television");
		category1.setDescription("Samsung TV(LED)");
		category1.setImageURL("D:\\walls\\Himalaya");
		category1.setActive(true);

		categories.add(category1);

		// adding second category
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Laptop");
		category2.setDescription("Lenovo Laptop 14Inch.");
		category2.setImageURL("D:\\walls\\dogy");
		category2.setActive(true);
		categories.add(category2);

		// adding second category
		Category category3 = new Category();
		category3.setId(2);
		category3.setName("Mobile");
		category3.setDescription("oppo 5Inch.");
		category3.setImageURL("D:\\walls\\dogy");
		category3.setActive(true);
		categories.add(category3);

	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// enhanced for loop
		for (Category category : categories) {
			if (category.getId() == id)
				return category;
		}
		return null;
	}

}
