package git_demo;
/*HERE I WILL TRY TO WRITE DOWN ALL THE USEFUL NOTES*/


/*README MACKDOWN FILE
 * create a normal file with extend of .md
 * this file appear infron of the project
 * the purpose it to let the viewer know that the purpose of the project*/


/*GITIGNORE FILE 
 * the purpose of this file is to ignore and hide uneccessary files
 * also you should know that this file will also be ignored
 * to create this file just name a normal file .gitignore
 * and post the following inside your file 
 
.metadata
bin/
tmp/
*.tmp
*.bak
*.swp
*~.nib
local.properties
.settings/
.loadpath
.recommenders

# External tool builders
.externalToolBuilders/

# Locally stored "Eclipse launch configurations"
*.launch

# PyDev specific (Python IDE for Eclipse)
*.pydevproject

# CDT-specific (C/C++ Development Tooling)
.cproject

# CDT- autotools
.autotools

# Java annotation processor (APT)
.factorypath

# PDT-specific (PHP Development Tools)
.buildpath

# sbteclipse plugin
.target

# Tern plugin
.tern-project

# TeXlipse plugin
.texlipse

# STS (Spring Tool Suite)
.springBeans

# Code Recommenders
.recommenders/

# Annotation Processing
.apt_generated/
.apt_generated_test/

# Scala IDE specific (Scala & Java development for Eclipse)
.cache-main
.scala_dependencies
.worksheet

# Uncomment this line if you wish to ignore the project description file.
# Typically, this file would be tracked if it contains build/dependency configurations:
#.project
 
*/
 
/*TO CREATE A LOCAL REPOSITORY
 * simply search for git or you can add as perspective in eclipse
 * then open git perspective 
 * there create a repo
 * browse the file you wanna create for I mean the java file 
 * */
 
/*COMMIT TO LOCAL REPO
 * if it is your first time 
 * just right after you create the repo
 * go to local repo and add the working tree to the indext
 * now go the repo project file and commit */

/*COMMIT TO GITHUB or PUSH
 * go to githumb and create the repo with same name with local repo you wanna push
 * then copy the http url of it 
 * then go to eclipse right click the local repo with the same name you created on github
 * say push then paste the http link you copied from github
 * select master and click add spec*/

/*MAKING SOME CHANGES
 * everytime you make some change just save them in the class
 * then go to local repository and add work tree to the index 
 * save the local repo file I mean commit */

/*PUSHING PROBLEM
 *  
Login to your GitHub account
go to https://github.com/settings/tokens
click on "Generate new token"
make necessary selections (but must select repo)
click on "save"
System will have a token
use this token instead of a password in the eclipse or other tools you are using
Now push your code from Github and it will work.
 *
 */

