class MedianFinder {
    List<Integer> pList;

    public MedianFinder() {
        this.pList = new ArrayList<>();
    }
    
    public void addNum(int num) {
        pList.add(num);
    }
    
    public double findMedian() {
        Collections.sort(pList);
        int n = pList.size();
        if(n%2 != 0){
            return pList.get((n-1)/2);
        }else{
            return (double)(pList.get((n-1)/2) + pList.get(n/2))/2;
        }
    }
}
