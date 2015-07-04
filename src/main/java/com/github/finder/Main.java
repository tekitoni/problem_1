package com.github.finder;

public class Main{
    public Main(String[] arguments){
    Args args = new Args();
        try {
            CmdLineParser parser = new CmdLineParser(args);
            parser.parseArgument(arguments);
        } catch (CmdLineException e) {
        }
        return args;

    }

    public static void main(String[] args){
        new Main(args);
    }
}

    private boolean isTarget(File file){
        boolean flag = true;
        if(args.getName() != null){
            flag &= checkTargetName(file, args.getName());
        }
        return flag;
    }
    private boolean checkTargetName(File file, String pattern){
        String name = file.getName();
        return name.indexOf(pattern) >= 0;
    }