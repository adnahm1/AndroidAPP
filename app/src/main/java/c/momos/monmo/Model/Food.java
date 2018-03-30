package c.momos.monmo.Model;

/**
 * Created by adnanahmed on 26/03/2018.
 */

public class Food {
    private String Name, Price, Description, MenuId, Image;

    public Food() {

    }

    public Food(String name, String price, String description, String menuId, String image) {
        Name = name;
        Price = price;
        Description = description;
        MenuId = menuId;
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String menuId) {
        MenuId = menuId;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
