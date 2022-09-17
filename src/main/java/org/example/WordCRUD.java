package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD{
    ArrayList<Word> list;
    Scanner s;

    //생성자
    WordCRUD(Scanner s) {
        list = new ArrayList<>();
        this.s = s;
    }

    public void addWord() {
        Word one = (Word)add();
        //id 설정 (나)
        list.add(one);
        System.out.println("새 단어가 단어장에 추가되었습니다. ");
    }

    public void listAll() {
        System.out.println("-------------------------");
        for(int i=0; i<list.size(); i++) {
            System.out.print((i+1) + " ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("-------------------------");
    }

    public ArrayList<Integer> listAll(String keyword) {
        ArrayList<Integer> idlist = new ArrayList<>();
        int j = 0;
        System.out.println("-------------------------");
        for(int i=0; i<list.size(); i++) {
            String word = list.get(i).getWord();
            if (!word.contains(keyword)) continue;
            System.out.print((j + 1) + " ");
            System.out.println(list.get(i).toString());
            idlist.add(i);
            j++;
        }
        System.out.println("-------------------------");
        return idlist;
    }

    public void changeWord() {

        String find = s.nextLine();
        System.out.println("-------------------------");
        //find
        
        System.out.println("-------------------------");
        
        int num = 0;
        while(num > 0 && num < 2) {
            System.out.print("=> 수정할 번호 선택 : ");
            num = s.nextInt();
        }
        System.out.print("=> 뜻 입력 : ");
        String meaning = s.nextLine();
        //단어에 저장해주기
    }

    public void updateItem() {
        System.out.print("=> 수정할 단어 검색 : ");
        String keyword = s.next();
        ArrayList<Integer> idlist = this.listAll(keyword);
        System.out.print("=> 수정할 번호 선택 : ");
        int id = s.nextInt();
        s.nextLine();
        System.out.print("=> 뜻 입력 : ");
        String meaning = s.nextLine();
        Word word = list.get(idlist.get(id-1));
        word.setMeaning(meaning);
        System.out.println("단어가 수정되었습니다. ");


    }
    public void deleteWord() {
        System.out.print("=> 삭제할 단어 검색 : ");
        String find = s.nextLine();
        System.out.println("-------------------------");
        //find

        System.out.println("-------------------------");

        int num = 0;
        while(num > 0 && num < 2) {
            System.out.print("=> 삭제할 번호 선택 : ");
            num = s.nextInt();
        }
        System.out.print("=> 정말로 삭제하실래요(Y/n)? ");
        //읽고 Y면 삭제하기
        System.out.println("선택한 단어 삭제 완료! ");
    }

    public void save() {
        //저장해주기
        System.out.println("모든 단어 파일 저장 완료!");
    }


    @Override
    public Object add() {
        System.out.print("=> 난의도(1,2,3) & 새 단어 입력 : ");
        int level = s.nextInt();
        String word = s.nextLine();

        System.out.print("뜻 입력 : ");
        String meaning = s.nextLine();


        return new Word(0, level, word, meaning);
    }

    @Override
    public int update(Object obj) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(Object obj) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void selectOne(int id) {
        // TODO Auto-generated method stub
    }



}
