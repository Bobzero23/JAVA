/* THIS IS A REVIEW OF GIT AND GITHUB NOTES THAT I DELETED SOMEHOW..*/
/* I WILL BE WORKING WITH GIT COMMAND LINE*/

             /*GIT IS LOCAL AND GIT HUB IS ONLINE */

                 /*DONT FORGET TO INGNORE ANGLE BRACKETS*/
/* I WROTE ALL THE COMMANDS INSIDE THESE ANGLE BRACKETS <> */
/* I ALSO WROTE ALL THE INSIDE-COMMAND COMMENTS USING ANGLE BRACKETS */



/* after installing git you can open up a  <git bash> and try to write this command to see if it works
 * <git --version> this command wil give you the version of the git you installed yo can also run this 
 * in your local command line tho..
 * 
 * TELL THE GIT COMMAND LINE WHO IS WORKING WITH
 * <git config --global user.name "<useraname>"> write this command to configure who is using the git 
 * <git config --global user.email <githubEmail>> writhe this to configure your account email too
 * <git config --list> after write all these up, then use this command to see if everything is configured
 * you will get a lot of words but at the end must be your username and also your email 
 * <clear> to clear the git command line
 * 
 * CREATING THE FOLDER 
 * <git mkdir <folderName>> this is how you create a folder
 * <git -Rf <folderName>> to delete the folder 
 * 
 * NAVIGATING A FOLDER / DOUBLE CLICK THE FOLDER
 * <cd <folderName>> this will double clik the folder
 * 
 * AFTER DOUBLE CLICK YOU CAN ALSO CREATE A REPO INSIDE A FOLDER
 * 
 * INITIALIZING A GIT REPO
 * dont get confused REPO is just like a normal folder
 * but if you initialize it you will hava <.git> folder inside it tho
 * this <.git> folder is hidden all the time so to see it, you must unhide it
 * <git init> if you write this command inside a folder you double clicked the <.git> will be created inside
 *
 * DEFAULT BRANCH
 * whenever you create a git repo for the first time there will be a default branch called master 
 * 
 * CREATING A FILE
 * <touch <fileName.txt>> okay this will create a text file named fileName
 * 
 * OPENING A FILE
 * <notepad <fileName.txt>> this will open directly the text file we created
 * 
 * CHECKING GIT STAUS
 * <git status> this command will tell you whatever is going on with your repo
 * 
 * UNTRACTED FILE
 * if you just create a file in the repo without adding it and if you ask for git status
 * then git will tell you that there is un UNTRACTED file by adding the file, the file will tracked
 *
 * ADDING A FILE TO GIT INDEX
 * <git add .> this will add all of untracked files
 * after doing this command the file will be tracked and so whenever there is a change you will have to 
 * commit or save it so that you dont lose your data and whenever you put some changes in the file, the file
 * will be on STAGING area so that you add and commit or save the file again
 * 
 * UNSTAGING THE FILE
 * <git rm --cached <fileName>>
 * 
 * 
 * COMMITTING THE FILE 
 * <git commit -m "<here you write your comment for the commit>"> this is how you commit/save the file 
 * is better to check the status after doing this just incase it didnt commit 
 * 
 * TO SEE THE LOG
 * see, log means something history on chrome or youtube I guess...hahahaha
 * it actually shows the history of the commits
 * <git log> this is how you do it
 * 
 * AFTER DOING ALL THIS YOU GONNA HAVE TO PUT THOSE REPOSITORIES ONLINE,
 * SO THAT YOU CAN SHARE TO OTHER DEVELOPERS AND TO DO THAT....
 * MAKE SURE YOU HAVE A GIT ACCOUNT ALL SET AND DO THE FOLLOWINGS...
 * 
 * CREATE A REPO ON GITHUB
 * + just go to your github account and there try to creata a new repository with the same 
 *   name as the local repo so that you dont get confused but you can rename it as you wish 
 * AFTER YOU HAVE DONE THAT, YOU WILL BE GIVEN TWO URL https and ssh FOR NOW WE WILL USE https
 * + <git remote add origin <paste the http link here>> this is how you connect those two files
 *   by two files I mean the local and the one we created on github
 * AFTER YOU CONNECT THOSE TWO FILES RUN THIS COMMAND JUST TO CONFIRM
 * <git remote -v> after running this command you will be given two links for PUSHING and FETCHING
 * 
 * PUSH THE REPO TO GIT HUB
 * <git pust -u origin <name of the branch>> this will push your repo to git hub
 * but if you're doing this for the first time you will be ask to enter username and password
 *  
 * WORK WITH SSH KEYS
 * to work with ssh keys, first you gonna have to create the the public and private key
 * CREATE THE KEYS
 * <ssh-keygen -t rsa -C <enter your email here>> this is a command for generating the key
 * after that the command line will ask you where to create the key, I mean which folder of file you want
 * and will also make a default folder for you, so if you click ENTER the keys will go to the defaul folder
 * and then the cammand line will ask  you to enter the PASSPHRASE is not neccessary tho but if fun to make one 
 * just make sure you dont forget it, coz it wont be fun anymore
 * GET THE KEYS
 * go the folder which keys are located then copy the public key
 * GET AUTHENTICATED WITH THE KEYS
 * go to git hub--> settings --> generate new keys --> paste the key there and generate
 * CHECK IF THE KEYS ARE WORKING WELL 
 * <ssh -T git@github.com> then you will say yes and then yes
 * you might wanted to enter the passphrase if you have one
 * ---> I really dont know how to work with these ssh perfectly but anyway Imma learn it by the time you read this
 * 
 * CLONE A REPOSITORY FROM GIT HUB
 * + go to github and create a repo there 
 * + get the copy ssh url
 * + now go the gitbash/git command line then enter the folder you want the clone to be in 
 * <git clone <paste the ssh url here>> this the command to clone the repository
 * you might be asked to enter some passphrase if you have then you are all done
 * 
 * CHECK THE LOCAL REPO
 * <ls -ltr> this command will show you all the available repo in your current folder
 *
 *
 */
 