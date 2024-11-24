package com.guolihong.tuwei.T1031;

import java.util.*;

//TODO 模拟+贪心+自定义排序
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        menu[] menus=new menu[m];
        for (int i = 0; i < m; i++) {
            int id=scanner.nextInt();
            int cost=scanner.nextInt();
            int profit=scanner.nextInt();
            menus[i]=new menu(i,id,cost,profit);
        }
        Arrays.sort(menus, (o1, o2) -> {
            if (o1.cost!=o2.cost){
                return o1.cost-o2.cost;
            }else if (o1.profit!=o2.profit){
                return o2.profit-o1.profit;
            }else{
                return o1.id-o2.id;
            }
        });
        int n=scanner.nextInt();
        Map<Integer,Integer> limits=new HashMap<>();
        for (int i = 0; i < n; i++) {
            int id=scanner.nextInt();
            int mostNum=scanner.nextInt();
            limits.put(id,mostNum);
        }
        int num=scanner.nextInt();
        List<Integer> selected=new LinkedList<>();
        Map<Integer,Integer> used=new HashMap<>();
        for (menu menu : menus) {
            Integer currentUse = used.getOrDefault(menu.id, 0);
            Integer cnt = limits.get(menu.id);
            if (cnt==null||currentUse<cnt){
                selected.add(menu.idx);
                used.put(menu.id,currentUse+1);
                if (selected.size()==num) break;
            }
        }
        if (!selected.isEmpty()){
            Collections.sort(selected);
            for (Integer id : selected) {
                System.out.print(id+" ");
            }
        }else{
            System.out.println(-1);
        }

    }

    static class menu{
        int idx;
        int id;
        int cost;
        int profit;

        public menu(int idx, int id, int cost, int profit) {
            this.idx = idx;
            this.id = id;
            this.cost = cost;
            this.profit = profit;
        }
    }
}
