class Solution {
    public String simplifyPath(String path) {
        String[] components = path.split("/");
        List<String> finalPath = new ArrayList<>();

        for (String component: components) {
            if(component.equals(".") || component.isEmpty()){
                continue;
            }
            else if(component.equals("..")){
                if(finalPath.isEmpty()) continue;
                else finalPath.removeLast();
            }
            else finalPath.add(component);
        }

        if(finalPath.isEmpty()) return "/";

        StringBuilder result = new StringBuilder();
        for (String component : finalPath) {
            result.append("/").append(component);
        }

        return result.toString();
    }
}