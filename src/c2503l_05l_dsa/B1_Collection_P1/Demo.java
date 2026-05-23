/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2503l_05l_dsa.B1_Collection_P1;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author hangnt
 */
public class Demo {

    public static void main(String[] args) {
        // Mang String co 3 phan tu lan luot su dung Array, ArrrayList, LinkedList => Hien thi danh sach 
        // Mảng nói chung: 
        // chỉ số/vị trí: 0 
        // giá trị 
        // 1. Mang co dinh => Array  
        String[] arrayString = new String[3]; // Khai bao 1 mang array co dinh 
        arrayString[0] = "Test0";
        arrayString[1] = "test1";
        arrayString[2] = "test2";
        // Gia tri cua mang co dinh: tenMang[vitri]
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayString[i]);
        }
        // Da co dinh size => k them them duoc phan tu moi 
        // 2. Mang dong => ArrayList 
        ArrayList<String> arrayList = new ArrayList();
        // size = 0: so luong cac phan tu trong mang  
        // capacity: suc chua that cua mang: Tuy thuoc Java/JDK quan ly suc chua
        // Vi du: capacity = 5 : [trong, trong,trong,trong,trong]
        arrayList.add("Test");
        arrayList.add("Testt");
        arrayList.add("test");
        // [Test, Testt,test,trong,trong]
        // Gia tri cua mang co dinh: tenMang.get(vitri)
        // for i => biet duoc vi tri 
        // C1
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        // arrayList.size => 501 phan tu 
        // i = 0 <500( bien moi vong khai bao)...
        // i = 0 +1 =1 <500
        // => tang hon 
        // C2
        int size1 = arrayList.size();
        for (int i = 0; i < size1; i++) {
            System.out.println(arrayList.get(i));
        }
        // mang dong: linh hoat 
        arrayList.add("Du lieu moi");
        // [Test, Testt,test,Du lieu moi,trong]
        // khi them so luong chua day -> them tiep: arrayList.add("Du lieu moi");
        // Buoc 1: Tao 1 capacity lon hon 
        //  [trong, trong,trong,trong,trong, trong,trong,trong,trong,trong, trong]
        // Buoc 2: Copy lai du lieu cu sang
        // [Test, Testt,test,Du lieu moi,trong,trong, trong,trong,trong,trong,]
        // resize trong ArrayList 
        // Buoc 3: Them 
//        int a = 0;
        // for each(for co dau :) => k co san vi tri => chi biet duoc gia tri 
        for (String s : arrayList) {
            System.out.println(s);
        }
        // for each + method references(::)
        arrayList.forEach(System.out::println);
        // for each + lamda ex... 
        arrayList.forEach(p -> System.out.println(p));
        // 3. LinkedList => cau truc LinkedList 
        LinkedList<String> linkedListString = new LinkedList<>();
        // Them phan tu: add 
        linkedListString.add("Du lieu 1");
        linkedListString.add("Du lieu 2");
        linkedListString.add("Du lieu 3");
        // In danh sach LinkedList 
        for (String s : linkedListString) {
            System.out.println(s);
        }
        // Them vao dau: 
        linkedListString.addFirst("Test 111");
        System.out.println("Du lieu sau khi them");
        for (String s : linkedListString) {
            System.out.println(s);
        }
        // LinkedList k co resize. K dung mang => Them 1 node moi 
        // Du lieu dau <- Du lieu 1 -> Du lieu 2
//        CEO 
//           TGD1
//                TP1
//                   NV1
//                   NV2
//                TP2
//                   NV3
//                   NV4
//            TGD2
// Tree tap hop cua cac phan tu nhung k chua gia tri trung lap 
// Cac thanh phan trong Tree
// Node => tat cac cac phan tu deu la note 
// Root Node => Thang diem bat dau cua cay 
// Parent Node - nut cha -> not co it nhat 1 node con thi goi la not cha 
// Child Node  - nut con -> node ban duoi 1 node khac 
// Leaf Node - nut la -> node ma k con 
// edge - duong noi giua cha va con 
// Cac loai Tree 
// 1. Binary Tree: Cay moi node co toi da 2 node con
// 0,1,2 
//       A 
//         B 
//            F
//         C 
//            D
//            E
//         H
// 2. Binary Search Tree - BST: La dang dac biet cua binary tree 
// Van la cay ma moi node co toi da 2 con nhung phai co them quy tac sap xep 
// Node ben trai < node hien tai < node ben phai 
//        50 
//           30 
//                20 
//                40 
//           70 
//                60 
//                80 
// 3. General Tree: node co the chua bat ky so luong node con nao 
    }
}
