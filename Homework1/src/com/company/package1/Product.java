package com.company.package1;

public class Product {
    private int upvotes;
    private int downvotes;
    private boolean notProperValue = false;
    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        if(upvotes>=0) {
            this.upvotes = upvotes;
        }
        else{
            notProperValue = true;
            System.out.println("Incorrect number of upvotes");
        }
    }

    public int getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(int downvotes) {
        if(downvotes>=0) {
            this.downvotes = downvotes;
        }
        else{
            notProperValue = true;
            System.out.println("Incorrect number of downvotes");
        }
    }
    public int getVoteCount(){
        int count;
        if(notProperValue)
        {
            System.out.println("Arithmetic Error!!");
            count = 0;
        }
        else {
            count = this.getUpvotes() - this.getDownvotes();
        }
        return count;
    }
}
