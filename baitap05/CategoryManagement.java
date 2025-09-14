package baitap05;

public class CategoryManagement implements ICRUD {
    private Category [] categories = new Category[100];
    private int count = 0;

    public void  addCategory(Category category){
        if(count<= categories.length){
            categories[count++] = category;
        }
        else {
            System.out.println("Mảng đã đầy, không thể thêm danh mục.");
        }
    }

    @Override
    public void deleteById(int id) {
        for(int i = 0; i<count; i++){
            if(categories[i].getId() == id){
                for(int j = 0; j<count-1; j++){
                    if(categories[j].getId() == id){
                        categories[j] = categories[j+1];
                    }
                    categories[--count] = null;
                    System.out.println("Danh mục đã được xóa.");
                    return;
                }
            }
            System.out.println("Không tìm thấy danh mục với ID: " + id);
        }
    }

    @Override
    public void updateCategory(Category category) {
        for(int i = 0; i<count; i++){
            if(categories[i].getId() == category.getId()){
                categories[i] = category;
                return;
            } else
                System.out.println("Danh mục không tìm thấy.");
        }

    }

    @Override
    public Category[] findAll() {
        Category [] result = new Category[count];
        System.arraycopy(categories, 0, result, 0, count);
        return result;
    }

}
