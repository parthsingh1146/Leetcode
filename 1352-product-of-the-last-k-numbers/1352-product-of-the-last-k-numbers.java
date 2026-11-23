class ProductOfNumbers {
    List<Integer> prefixProduct;
    public ProductOfNumbers() {
        prefixProduct = new ArrayList<>();
    }
    
    public void add(int num) {
        if(num == 0){
            prefixProduct.clear();
        }
        else if(prefixProduct.isEmpty()){
            prefixProduct.add(num);
        }
        else{
            int prev = prefixProduct.get(prefixProduct.size() - 1);
            prefixProduct.add(prev * num);
        }
    }
    
    public int getProduct(int k) {
        int indx = prefixProduct.size() - k;
        if(indx < 0){
            return 0;
        }
        if(indx == 0){
        return prefixProduct.get(prefixProduct.size() - 1);
        }
        return prefixProduct.get(prefixProduct.size() - 1) / prefixProduct.get(prefixProduct.size() - k - 1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */