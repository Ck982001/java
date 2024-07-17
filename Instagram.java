class Instagram {
    static int postId;
    static String username;
    static String postContent;
    static String postDate;
    static int likes;

    public static void createPost(int postId, String username, String postContent, String postDate, int likes) {
        Instagram.postId = postId;
        Instagram.username = username;
        Instagram.postContent = postContent;
        Instagram.postDate = postDate;
        Instagram.likes = likes;
    }

    public static void getPost() {
        System.out.println("Post Id: " + postId);
        System.out.println("Username: " + username);
        System.out.println("Post Content: " + postContent);
        System.out.println("Post Date: " + postDate);
        System.out.println("Likes: " + likes);
    }
}
