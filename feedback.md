# Assignment Two Feedback

## Group members: u6071714, u5917277, u6233112

## Tutor Comment
Nice game! I like the background images. I also particularly like the "rule" page, since that helps me with knowing how to play the game - nice touch! There are some grammatical errors in your rule section, however, best to double-check those before submitting.
I also noticed that the double-clicking action doesn't always flip the piece (it just deletes the other pieces?), and that "star" (I'm guessing that's hint?) only works once. There's also no way to reset the game which can be a problem. You lost a few marks as a result of this.

It also appears you have no JUnit tests outside of the ones provided by Steve. You have a few helper classes which could have used some JUnit tests.

Regardless, great job on this assignment! You should be very pleased, considering the hardships your group faced this semester. :)

## Mark

**  7.0/11.0**

## Miscellaneous marks

| Level | Requirement | Result |
|:-:|---|:-:|
||All files correct                     | .25/.25 |
||Authorship clear for all classes      | .25/.25 |
||Appropriate use of git                | .5/.5  |
||Program runs from jar                 | .25/.25 |
|P|Appropriate use of OO features       | .5/.5  |
|P|Presentation pdf complete            | .5/.5  |
|CR|Program well designed               | .25/.5  | -- see feedback
|CR|Comments clear and sufficient       | .5/.5  |
|CR|Coding style good                   | .5/.5  |
|CR|Appropriate use of JUnit tests      | 0/.5  | -- no personal JUnit tests?
|D|Design and code of very high quality | 0/.25 |
|D|Demonstrates interesting extensions  | 0/.25 |
|D|Works well and easy to run           | 0/.25 |
|HD|Game is exceptional                 | 0/.5  |

**Total for miscellaneous marks:**  3.5/5.5

## Game marks (manual)

| Level | Requirement | Result |
|:-:|---|:-:|
|CR|Pieces snap into place           | .25/.25 |
|CR|Pieces can be rotated            | .25/.25 |
|CR|Pieces can be flipped            | 0/.25 |
|CR|Only valid placements allowed    | .25/.25 |
|D |Basic starting placements        | 0/.25 |
|HD|Hints                            | 0/.25 |
|HD|Interesting starting placements  | 0/.25 |

**Total for manual marks:** .75/1.75

## Test results

| Task | Test | Result | Marks |
|:-:|---|:-:|:-:|
| |Compiled|.25/.25|.25|
|2|PiecePlacementWellFormed|5/5|.5|
|3|PlacementWellFormed|5/5|.5|
|5|PlacementSequenceValid|6/6|.5|
|6|ViablePiecePlacement|5/5|1|
|10|Solutions|0/3|0|

**Total for tests:** 2.75/3.75

## Originality statements

#### Originality statement G
We declare that the work we have submitted for Stage G of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

* The idea of using this great framework to make the game run faster came from a discussion with Yuze Gong(u5640420).

* The code in class <StepsGame> the function of noduplication is based on a solution we found when researching the problem.(URL provided in source code comments)

* The code in class <GameBoard> uses an idea suggested by Yuze Gong(u5640420).

* The idea of <fix the piece on to peg> came from a discussion with Hengrui Wang (u6202156).

* The code in class <DraggablePiece> uses an idea suggested by the assignment1 Game class.

* The idea of game screen design is suggested by Chan Xu (u6233112).

Signed: Chan Xu (u6233112), Yiwen Peng (u6071714)

#### Originality statement F
We declare that the work we have submitted for Stage F of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)

* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)

* ....

Signed: Chan Xu (u6233112), Yiwen Peng (u6071714)

#### Originality statements E
I declare that the work I have submitted for Stage E of this assignment and all stages before it is entirely my own work, with the
following documented exceptions:

* The idea of <...> came from a discussion with <...>

* The code in class <...> uses an idea suggested by <...>

Signed: Mary Jones (u23445678)
I declare that the work I have submitted for Stage E of this assignment and all stages before it is entirely my own work, with the
following documented exceptions:

* The idea of <...> came from a discussion with <...>

* The code in class <GetPositionTest> uses an idea suggested by comp1110.lectures.S03

* The code in class <ValidPieceStringTest> uses an idea suggested by comp1110.lectures.S03

Signed: Chan Xu (u6233112)

#### Originality statements D
I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:

* The idea of <...> came from a discussion with <...>

* The code in class <...> uses an idea suggested by <...>
Signed: Yiwen Peng (u6071714);
I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:

* The idea of <...> came from a discussion with <...>

* The code in class <...> uses an idea suggested by <...>

Signed: Qingsen Kuang (u5917277)
I declare that the work I have submitted for Stage D of this assignment and all stages before it is entirely my own work, with the following documented exceptions:

* The idea of <...> came from a discussion with <...>

* The code in class <...> uses an idea suggested by <...>

Signed: Chan Xu (u6233112)

#### Originality statement C
We declare that the work we have submitted for Stage C of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)

* The code in class <stepgame> the function of noduplication  is based on a solution we found when researching the problem (https://stackoverflow.com/questions/13119926/find-duplicate-characters-in-a-string-and-count-the-number-of-occurances-using-j)

*  ....

Signed: Yiwen Peng (u607171), Qingsen Kuang(u5917277), and Chan Xu (u6233112)

#### Originality statement B
We declare that the work we have submitted for Stage B of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)

* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)

*  ....

Signed: Yiwen Peng (u607171), Qingsen Kuang(u5917277), and Chan Xu (u6233112)

## Git Log
```
commit eb5c47bb33faf4b34d9335e12c67ed5a631c4336
Author: Chan <u6233112@anu.edu.au>
Date:   Fri Oct 20 10:37:43 2017 +1100

    delete no useful file

commit 7b13468a118a47dd865ee345d056b166d95da2e1
Author: Chan <u6233112@anu.edu.au>
Date:   Fri Oct 20 10:36:36 2017 +1100

    delete jar

commit 1a633c82a69df78605d93910cf11da9da08957b6
Author: Chan <u6233112@anu.edu.au>
Date:   Fri Oct 20 10:36:02 2017 +1100

    Update presentation

commit 684c59c5638e1af6c63817e90f739fbddb5c2ffb
Author: Chan <u6233112@anu.edu.au>
Date:   Fri Oct 20 10:30:27 2017 +1100

    Edit admin

commit 161582639b164782976fc9580649c42acd27d986
Merge: 64cf0be 228a332
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Fri Oct 20 10:10:41 2017 +1100

    Merge remote-tracking branch 'origin/master'

    # Conflicts:
    #	admin/G-features.md
    #	game.jar

commit 64cf0be6077e1162fdd1f80d536fef507ed63bd6
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Fri Oct 20 10:08:41 2017 +1100

    fix the layout

commit 228a332737ed3a7e6c801a5c9484770b9bf4777d
Author: U6233112 <u6233112@anu.edu.au>
Date:   Fri Oct 20 09:30:08 2017 +1100

    Edit features

commit 13fd863cd09fd9a94dcd40d6905d2603f9fba9a0
Merge: 80310b3 8fe3599
Author: Chan <u6233112@anu.edu.au>
Date:   Fri Oct 20 09:20:03 2017 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/u6071714/comp1110-ass2-tue11b

    # Conflicts:
    #	game.jar

commit 80310b3d5a856510df88fff0da8aa22d8fee2314
Author: Chan <u6233112@anu.edu.au>
Date:   Fri Oct 20 09:13:23 2017 +1100

    Commit before pull.

commit 8fe35997c57356f948307fc97e458aa53ecce533
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Fri Oct 20 02:35:55 2017 +1100

    commit G-best
    commit G-features

commit d45fd8989cb7e54f21ca628eb3c67a31420f93ca
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Fri Oct 20 01:24:11 2017 +1100

    flip
    task 8 show
    randomly one piece on the board

commit 39224c814328d50ccc5d24d6153952b75fe629c0
Merge: 37de7a1 1f9a0b7
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Fri Oct 20 01:22:09 2017 +1100

    Merge remote-tracking branch 'origin/master'

    # Conflicts:
    #	game.jar

commit 37de7a161973cd67ed1d5c7ab0565c0869a8a577
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Fri Oct 20 01:21:16 2017 +1100

    flip
    task 8 show
    randomly one piece on the board

commit 1f9a0b7885ae1fae4f405452c31287125cbb00c9
Author: Chan <u6233112@anu.edu.au>
Date:   Thu Oct 19 23:27:24 2017 +1100

    Update admin

commit fc5f2d3a0c3293e3039480a6b753de7e8ce6e053
Author: Chan <u6233112@anu.edu.au>
Date:   Thu Oct 19 22:36:31 2017 +1100

    Debug of Task3.

commit 939a3e98d9bb7403e572d7652e538b1431790e5d
Author: Chan <u6233112@anu.edu.au>
Date:   Thu Oct 19 21:54:40 2017 +1100

    Add presentation(draft) pdf for chan's part.

commit 3c29ce930b7e5f5bd1bfbc4b373e8b835c9de8e6
Author: Chan <u6233112@anu.edu.au>
Date:   Thu Oct 19 21:30:11 2017 +1100

    Add my statements of best code.

commit 53b28707d3dc123f8b7bcc73e3f45610d8f2c9d4
Author: Chan <u6233112@anu.edu.au>
Date:   Thu Oct 19 20:56:58 2017 +1100

    Update admin of G

commit 002f83ce62adf38ffc2da21b9447f03d53290536
Author: Chan <u6233112@anu.edu.au>
Date:   Thu Oct 19 20:56:21 2017 +1100

    Update some commits

commit 8b29f74faef755dfc46b8a7f9fa2ccab9ccfcc54
Author: U6233112 <u6233112@anu.edu.au>
Date:   Thu Oct 19 18:48:52 2017 +1100

    recreate game.jar

commit 1510287a7530335cc06464834b6cdd3fe311e21f
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Thu Oct 19 17:42:00 2017 +1100

    finish justify

commit abc7aeccb819155d76c1ffa90109804badbb8926
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Thu Oct 19 01:16:45 2017 +1100

    to rotate try to get vaild

commit 7e96ebce252ed89a1a05f0b5fd70a93c2d6fe860
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Oct 17 23:54:50 2017 +1100

    to get the char after rotate

commit 7062ea576bf6ee2bfdf89c262db9682ea3266e7f
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Oct 17 19:18:02 2017 +1100

    to rotate the piece

commit 5d63743e3ea1ebf101f1dac7b01d515c6ffd1839
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Oct 17 15:36:09 2017 +1100

    to make the homeing one the peg

commit 42f2ef22287c8b0454668396db205e43654316a0
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Mon Oct 16 20:13:29 2017 +1100

    to snap the piece

commit 4142c013173dd4265a67e420d65e25c1eb78f379
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Thu Oct 12 00:46:11 2017 +1100

    TO MAKR A BOARD

commit ed17e4939fe56327f35df910a978a4c67a058256
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Sat Oct 7 16:56:48 2017 +1100

    to draggable

commit 29ef7a7ef4c17568302d99927242aac546243645
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Sat Oct 7 13:37:37 2017 +1100

    CHANGE GAME

commit 01ca17f73bbbfd0d7f058aae524c120c86525e0f
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Oct 3 12:29:43 2017 +1100

    CHANGE GAME

commit 54a709033e68aef73d21085e87b04a11cfe0cd03
Author: U6233112 <u6233112@anu.edu.au>
Date:   Wed Oct 18 18:16:35 2017 +1100

    change the code layout.

commit ca9c332a4a56d737dd749a37c49fa2c8fa07a930
Author: Chan <u6233112@anu.edu.au>
Date:   Wed Oct 18 18:08:41 2017 +1100

    Update the commits of Task 6.

commit e4d05f08722789af8b2be1e80f5dbfd23585cdfa
Author: U6233112 <u6233112@anu.edu.au>
Date:   Wed Oct 18 17:58:18 2017 +1100

    add some commits of task5 & task6

commit 1886143cf280588f8bc00e4f190c86559673186c
Author: Chan <u6233112@anu.edu.au>
Date:   Wed Oct 18 16:57:06 2017 +1100

    Update G-contribution and my originality.

commit b1540634ca992c69650c10879bc91418b11ea3f8
Author: Chan <u6233112@anu.edu.au>
Date:   Wed Oct 18 16:55:36 2017 +1100

    add my file of G-best-u6233112

commit b9c56254ceb7761a91c1b1cd809685e377727822
Merge: 755fbb0 99e58ef
Author: U6233112 <u6233112@anu.edu.au>
Date:   Wed Oct 18 16:44:10 2017 +1100

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 755fbb0cabc0053c977d55a48aca6c4a94f226b0
Author: U6233112 <u6233112@anu.edu.au>
Date:   Wed Oct 18 02:43:59 2017 +1100

    task6 all done

commit f1069424ad2d9c79c501c23b8839b6c7be74f670
Author: U6233112 <u6233112@anu.edu.au>
Date:   Fri Oct 13 06:53:13 2017 +1100

    redesign Task5 all done.

commit ef20ae04b4e304aa7c8f9b2adce8d65dcee70e87
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Oct 10 10:55:57 2017 +1100

    Debug of Task3

commit 9b15b63522ae11e87b879f68ec7cc784dceb2325
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Oct 10 10:52:37 2017 +1100

    Delete useless tests because of new framework.

commit 8f0ea3d4a81ebf58cbad158a8317d88e11147e44
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Oct 10 10:51:26 2017 +1100

    Redesign StepsGame framework & add two new classes(Piece, GameBoard)

commit e351757c51b02e61df06bdf4bf9cbc0ff785d93b
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Oct 3 12:34:54 2017 +1100

    Update Board.java

commit da30c968c666570bbe83a5c72cf5b9620679dd6a
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Oct 3 10:35:07 2017 +1100

    Update F-review for Chan

commit c771532c441a4763fc90f0601721a64019e8f3df
Merge: a4fce19 7d026da
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Oct 3 10:32:14 2017 +1100

    Merge remote-tracking branch 'origin/master'

commit a4fce19218f440271cc3e4e390938c48810c702f
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Oct 3 10:32:07 2017 +1100

    Update F-review for Chan

commit 7d026da75d00c69814310d2f9b6beb635da347b4
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Oct 3 10:30:52 2017 +1100

    add review

commit 62de6b97dc0a9da4365eff6f0c37fae8fa4a440e
Merge: a7d88fb 961416e
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Oct 3 10:24:17 2017 +1100

    Merge remote-tracking branch 'origin/master'

commit a7d88fb5233874024374f91f311cd723d85b1d56
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Oct 3 10:23:42 2017 +1100

    Task9 finished partly.

commit 961416e8045bbc4c07be065c9d07a1ff0c407c2d
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Oct 3 10:00:47 2017 +1100

    add author detials for task 4 and 7

commit 839ff2215968207d6fadb50576c5625ca5037823
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Oct 3 09:54:18 2017 +1100

    fix task7 add handle event to task7

commit b64b2e73396f3e1c653a9cc328a0f5b9c021f6b7
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Oct 3 09:35:21 2017 +1100

    fix task7 add rotate method

commit 723b757a19a9c0705b3fb3909ee5aa07f38a68ea
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Oct 3 09:33:30 2017 +1100

    Update F-contribution

commit 6a0cc9a7d6b882e78dbf1dcfd3ad7d5b929a3d8c
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Oct 3 09:32:04 2017 +1100

    Add authorship details for Task4 &7

commit f09f6044f9d195c2aee48bbee1fe942ae7bcd793
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Oct 3 06:09:23 2017 +1100

    Add game.jar

commit 9903e9795f68aecd911d60945c3bfb72f8c7b9fb
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Oct 3 06:08:37 2017 +1100

    the fist draft of D2F admin

commit eda914820dc39e8f616acd9c324e6b4cb46094f2
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Oct 3 02:42:38 2017 +1100

    Edit AGAIN D-originality which was edited wrong by another group member

commit ace0940f5731bacf638b65352a75182c0621e76b
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Oct 3 02:41:44 2017 +1100

    Edit AGAIN D-originality which was edited wrong by another group member

commit b18529866abbbb5060fd857c1bb7478bdcab20b9
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Oct 3 02:34:57 2017 +1100

    Add some authorship details of Task2,3,5&9

commit f8daa94b6b8c1ebff9191d4e2ec3ea2037efb608
Merge: e5c3287 624bafd
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Oct 3 02:05:01 2017 +1100

    Merge remote-tracking branch 'origin/master'

commit e5c328739b49fe3a88320fd9e2fd8f3346d2fcbc
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Oct 3 01:59:34 2017 +1100

    Add more commits about Task5

commit 624bafdd62c0a965f7a4e7ef11b5dba701608eaf
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Oct 3 01:18:25 2017 +1100

    FIX TASK4 TO SHOW IMAGE
    TO choose which picture

commit dfaf4a45249f935f2a8648365f2f861db3ed3f13
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Oct 3 01:16:39 2017 +1100

    FIX TASK4 TO SHOW IMAGE

commit 5d0defc5c53467b8e09c382ab4d01b74afb19b61
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Oct 3 00:53:15 2017 +1100

    task7 the board show

commit 16635f1acaaf027a08423082929fcd19a09f31b8
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Oct 3 00:36:33 2017 +1100

    FIX TASK 4

commit 6e442355d39f9cb2e8bf68897c779301e6042d90
Merge: eb0ad36 0defa19
Author: U6233112 <u6233112@anu.edu.au>
Date:   Mon Oct 2 18:30:26 2017 +1100

    Merge remote-tracking branch 'origin/master'

commit 99e58ef6dbbc6710da3bc2945bf02a92b7d65da0
Author: COMP1110 2017 S2 <steve.blackburn+comp1110-2017s2@anu.edu.au>
Date:   Mon Oct 2 10:49:54 2017 +1100

    Cleaned up pngs

commit eb0ad3691b3217768fdf8cc23dbea0e10ba0bf87
Merge: 66ed62a 0ebfd76
Author: U6233112 <u6233112@anu.edu.au>
Date:   Sat Sep 30 22:31:22 2017 +1000

    Merge branch 'master' of https://gitlab.cecs.anu.edu.au/comp1110/comp1110-ass2

commit 66ed62ac789d53bf7fb12a24e442e66d8b6bf9ff
Author: U6233112 <u6233112@anu.edu.au>
Date:   Sat Sep 30 22:01:11 2017 +1000

    Add two tests to test methods written by Chan

commit 612ab56632d65b90bedb99a916b59d143c4f0681
Author: U6233112 <u6233112@anu.edu.au>
Date:   Sat Sep 30 22:00:59 2017 +1000

    add AGAIN my originality.

commit 70bfaa2391369de146850ceb6cb3ba65aa23abca
Author: U6233112 <u6233112@anu.edu.au>
Date:   Sat Sep 30 21:59:49 2017 +1000

    add some advice to edit my code.

commit 0defa19c05d3c07fbd149e0c5329b1c4a806d126
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Sat Sep 30 15:29:29 2017 +1000

    to debug

commit 5b24964ba7865711c4e2249a54636bca466fd506
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Sat Sep 30 15:28:03 2017 +1000

    add originality and test

commit 1b6698e46379f3edd80a2a0a8500e130bee60c36
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Sep 19 12:18:49 2017 +1000

    individual task add originality

commit e0e47146aef4c9b3afc5b9cb2e279233c2b49a0e
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Sep 19 11:04:29 2017 +1000

    individual task add originality

commit 0ebfd765a675416e29cf9869f8171e13e7b73e0b
Author: Josh Milthorpe <josh.milthorpe@anu.edu.au>
Date:   Thu Sep 28 11:26:39 2017 +1000

    add review template for D2F

commit 8f231d746d7c905072635be26681d16a673d25e2
Merge: 64d4e9b 6d7776e
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Sep 26 10:49:14 2017 +1000

    Merge remote-tracking branch 'origin/master'

commit 6d7776e8c3365e89ba96b3965fd78b0f3a79a473
Author: Yiwen  Peng <u6071714@anu.edu.au>
Date:   Tue Sep 26 10:30:35 2017 +1000

    Add new file

commit 64d4e9b64e317d3c2d0e61a9e003d2b1a7e56efe
Author: Chan <u6233112@anu.edu.au>
Date:   Tue Sep 26 05:52:38 2017 +1000

    Add two tests to test methods written by Chan

commit f7c62286c5b100b893f2d3d81ae9d1e1a2a53da1
Author: Chan <u6233112@anu.edu.au>
Date:   Tue Sep 26 05:37:32 2017 +1000

    Add E-original for Chan

commit 7bbf399b53801a16a798f8d8c93921b908399acf
Author: Chan <u6233112@anu.edu.au>
Date:   Sun Sep 24 23:03:08 2017 +1000

    Finished Task5

commit f38bae620607e8734538593825c27a0e85a5669a
Author: U6233112 <u6233112@anu.edu.au>
Date:   Sun Sep 24 16:13:15 2017 +1000

    Task5 in process. Haven't checked the rings without overlap

commit 51dd8050913b5ccf9ea36454c6b0f4e0e93e9cac
Author: Chan <u6233112@anu.edu.au>
Date:   Sun Sep 24 15:39:56 2017 +1000

    Task5 in process. Haven't finish the last situation.

commit 9b0f387102f9bcf81e758d3f4a2099c9ffdd1a8c
Author: U6233112 <u6233112@anu.edu.au>
Date:   Sun Sep 24 12:21:32 2017 +1000

    edit C-contribution for Chan

commit 7092c0bbf99d679bfb22ddfac9e7c4a409e9b028
Author: U6233112 <u6233112@anu.edu.au>
Date:   Sat Sep 23 21:58:02 2017 +1000

    add again my deleted file - D originality by Chan Xu

commit 9f2eb6124e4018452784e4f6bcd5924b19fef7cd
Author: U6233112 <u6233112@anu.edu.au>
Date:   Sat Sep 23 21:56:20 2017 +1000

    add again my deleted file - D originality by Chan Xu

commit c06e414baf93ff84b537cf7cb4d7435f91307359
Author: Yiwen  Peng <u6071714@anu.edu.au>
Date:   Tue Sep 19 12:37:28 2017 +1000

    yiwen peng finish originality

commit 0675f60cba8f61b2ee45a00ad6ee320ac8b880c7
Author: Qingsen Kuang <u5917277@anu.edu.au>
Date:   Tue Sep 19 11:11:40 2017 +1000

    my originality completed!!

commit 94c62017991918a49ccee58644e67160dcda57a7
Merge: 2f9c456 24db94d
Author: Qingsen Kuang <u5917277@anu.edu.au>
Date:   Tue Sep 19 11:07:29 2017 +1000

    Merge remote-tracking branch 'origin/master'

    # Conflicts:
    #	admin/D-originality-u6233112.md
    #	src/comp1110/ass2/StepsGame.java

commit 2f9c456b8c2c66c3c82a91c19f44e243fbae9359
Author: Qingsen Kuang <u5917277@anu.edu.au>
Date:   Tue Sep 19 11:05:21 2017 +1000

    complete the file submission!!

commit 24db94de432cdd29369eee304ded191a7bbd244d
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Sep 19 09:09:57 2017 +1000

    add commit in Task5

commit 8a96b457a56cae83e80f54dbcbf69805787d5b9c
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Sep 19 09:02:34 2017 +1000

    do some Task5 & Task6

commit 8ce50824f24a56cf9d5c6b3f5631ef8316470b34
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Sep 19 09:00:54 2017 +1000

    update D-originality

commit aff2575c502fc0130d54b2938f836983492932b6
Author: COMP1110 2017 S2 <steve.blackburn+comp1110-2017s2@anu.edu.au>
Date:   Sat Sep 9 17:13:31 2017 +1000

    Improved error message for test.

commit 386177c4ef84d714d6e8fc044234bac6027fe606
Author: COMP1110 2017 S2 <steve.blackburn+comp1110-2017s2@anu.edu.au>
Date:   Sat Sep 9 17:12:46 2017 +1000

    Removed duplicated/redundant tests.

commit b600a6c236fc9f90f552f1da9908922fd189c125
Author: COMP1110 2017 S2 <steve.blackburn+comp1110-2017s2@anu.edu.au>
Date:   Fri Sep 1 07:12:36 2017 +1000

    Note that solutions are unordered sequences.

commit f58b3d04f1773dd45b21f60b9021817acf073316
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Aug 29 11:17:41 2017 +1000

    fix task 4 and add commit to task5

commit d99bc26d2a515ccece151a22897e937a817eed92
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Aug 29 11:11:47 2017 +1000

    add commit to contribition and originality

commit 2cf57f771385c36797d1364356437fff3b5124e0
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Mon Aug 28 21:20:46 2017 +1000

    task 4 to show image

commit ec8b89802aadb0b3403fda9561936988e0d1e282
Author: U6233112 <u6233112@anu.edu.au>
Date:   Sat Aug 26 17:02:00 2017 +1000

    We defined a new static boolean Duplicate to check if there are duplicates,
    and passed all the tests .

commit 67cd65fcda7a95b31aef07b98de1c3a96102c1cf
Author: U6233112 <u6233112@anu.edu.au>
Date:   Sat Aug 26 16:59:26 2017 +1000

    Task3 finished.

commit b050a4b59016aea47f16cfba97288479c0a53e4a
Author: U6233112 <u6233112@anu.edu.au>
Date:   Sat Aug 26 16:36:53 2017 +1000

    method isDuplicate has some problem.

commit ae3b2371fe91366cd3b3668bd68632b3b4c8efe3
Author: U6233112 <u6233112@anu.edu.au>
Date:   Sat Aug 26 15:03:33 2017 +1000

    Task3 in process

commit 0a8d0aef32c22de5dbd27cb1e64a6298f21c7bf9
Merge: 13869a0 8fa05a8
Author: U6233112 <u6233112@anu.edu.au>
Date:   Sat Aug 26 15:02:54 2017 +1000

    finished Task2

commit f7e9adcb4438f7dcff678a3b017bc7e12f7278ed
Author: Qingsen <u5917277@anu.edu.au>
Date:   Fri Aug 25 01:12:26 2017 +1000

    complete Task 2 and Testing some of the solutions in task 3.

commit 13869a0192a7933282047d8274cb1bc13f29408f
Author: U6233112 <u6233112@anu.edu.au>
Date:   Tue Aug 22 20:14:13 2017 +1000

    local commit

commit 8fa05a836d2a4b2698d6f1b549abb4b56cf560b8
Author: u6071714 <u6071714@anu.edu.au>
Date:   Tue Aug 22 12:59:36 2017 +1000

    write the task4 thinking

commit b1f6ca931f699f30572a3e9d1200b7c27c5a07b3
Merge: 3ea8219 de80616
Author: u6233112 <u6233112@anu.edu.au>
Date:   Tue Aug 22 12:28:18 2017 +1000

    Merge remote-tracking branch 'origin/master'

    # Conflicts:
    #	src/gittest/Main.java

commit 3ea8219826acbcea6315919031740efd189043fc
Merge: 0248db2 93d7e89
Author: u6233112 <u6233112@anu.edu.au>
Date:   Tue Aug 22 12:28:00 2017 +1000

    Merge remote-tracking branch 'origin/master'

    # Conflicts:
    #	src/gittest/Main.java

commit de80616fff419f24733e5533c67368eca7072349
Author: u6071714 <u6071714@anu.edu.au>
Date:   Tue Aug 22 12:17:47 2017 +1000

    change main

commit 93d7e8903a2c349b5bad3c33b4216e7215228df2
Author: Qingsen Kuang <u5917277@anu.edu.au>
Date:   Tue Aug 22 12:09:58 2017 +1000

    ADD Main and Class A.

commit 0248db221f69b7b5856c0212c1f6b793b05f48b1
Author: Chan <u6233112@anu.edu.au>
Date:   Tue Aug 22 12:07:51 2017 +1000

    Created an instance of C within Main

commit 04ee3f9dee45ccca7abbbcf26ea8bce1a446431e
Merge: df7e710 071cba0
Author: u6071714 <u6071714@anu.edu.au>
Date:   Tue Aug 22 11:46:59 2017 +1000

    Merge remote-tracking branch 'origin/master'

commit 071cba0852c6a2da923869855fbad13c73f83e74
Author: Chan <u6233112@anu.edu.au>
Date:   Tue Aug 22 11:46:08 2017 +1000

    Added C

commit df7e71091b0f54acece19c150c1e5bd3371ccb27
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Aug 22 11:41:17 2017 +1000

    add B

commit abb146db8b2bc6de212326c5c306e8e7a74f205c
Author: Qingsen <u5917277@anu.edu.au>
Date:   Tue Aug 22 11:36:24 2017 +1000

    ADD Main and Class A.

commit 8efd47a0b46b58c611fbd4ee78dc4888b460be0b
Merge: 3883207 bd618e4
Author: u6071714 <u6071714@anu.edu.au>
Date:   Tue Aug 22 11:17:32 2017 +1000

    Merge remote-tracking branch 'origin/master'

commit bd618e4f3e94cc6d02ab9e296e6792aa7a91ceb6
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Aug 22 10:46:40 2017 +1000

    add method

commit beeb661e848535adcea19b9233032be2e53571e6
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Aug 22 10:34:51 2017 +1000

    add method

commit bb9474f87392f6b319cf802a6f414d2a1cb6664b
Author: Yiwen Peng <u6071714@anu.edu.au>
Date:   Tue Aug 22 00:16:59 2017 +1000

    unfinish

commit 388320754e18ed3a9b394ca1d1a90a580f94b5f4
Author: COMP1110 2017 S2 <steve.blackburn+comp1110-2017s2@anu.edu.au>
Date:   Sun Aug 20 07:46:25 2017 +1000

    Fix bug in test

commit dd70f1f1abcca8e6d572c09c7327119b208c95d4
Author: COMP1110 2017 S2 <steve.blackburn+comp1110-2017s2@anu.edu.au>
Date:   Wed Aug 16 21:57:49 2017 +1000

    Renamed test numbers, added more cases to tests, fixed bug in duplicate detection test

commit 7c14e5960af2343c66037d439dd0399779e75882
Author: COMP1110 2017 S2 <steve.blackburn+comp1110-2017s2@anu.edu.au>
Date:   Tue Aug 15 06:03:52 2017 +1000

    Fix task numbers

commit e58b1d0f0c9a76f2b720d0d7bfcd1a8c37a0bfe4
Author: COMP1110 2017 S2 <steve.blackburn+comp1110-2017s2@anu.edu.au>
Date:   Tue Aug 15 05:39:47 2017 +1000

    Initial import
```
## Changes
```
Only in ../master/comp1110-ass2/.idea: .name
Only in comp1110-ass2/.idea: artifacts
Only in comp1110-ass2/.idea: kotlinc.xml
Only in comp1110-ass2/.idea: libraries
diff -ru -x .git ../master/comp1110-ass2/.idea/misc.xml comp1110-ass2/.idea/misc.xml
--- ../master/comp1110-ass2/.idea/misc.xml	2017-10-20 11:04:29.733912138 +1100
+++ comp1110-ass2/.idea/misc.xml	2017-10-20 11:04:33.133917989 +1100
@@ -1,6 +1,11 @@
 <?xml version="1.0" encoding="UTF-8"?>
 <project version="4">
-  <component name="ProjectRootManager" version="2" languageLevel="JDK_1_8" default="false" project-jdk-name="1.8" project-jdk-type="JavaSDK">
+  <component name="HaskellBuildOptions">
+    <ghcPath>D:\8.0.2\bin\ghc.exe</ghcPath>
+    <cabalPath>D:\8.0.2\lib\extralibs\bin\cabal.exe</cabalPath>
+    <stackPath>C:\Users\lenovo\AppData\Roaming\local\bin\stack.exe</stackPath>
+  </component>
+  <component name="ProjectRootManager" version="2" languageLevel="JDK_1_8" project-jdk-name="1.8" project-jdk-type="JavaSDK">
     <output url="file://$PROJECT_DIR$/out" />
   </component>
 </project>
\ No newline at end of file
diff -ru -x .git ../master/comp1110-ass2/.idea/modules.xml comp1110-ass2/.idea/modules.xml
--- ../master/comp1110-ass2/.idea/modules.xml	2017-10-20 11:04:29.733912138 +1100
+++ comp1110-ass2/.idea/modules.xml	2017-10-20 11:04:33.133917989 +1100
@@ -2,7 +2,8 @@
 <project version="4">
   <component name="ProjectModuleManager">
     <modules>
-      <module fileurl="file://$PROJECT_DIR$/comp1110-ass2-dev.iml" filepath="$PROJECT_DIR$/comp1110-ass2-dev.iml" />
+      <module fileurl="file://$PROJECT_DIR$/comp1110-ass2-tue11b.iml" filepath="$PROJECT_DIR$/comp1110-ass2-tue11b.iml" />
+      <module fileurl="file://D:\WorkSpace\IntellijIDEA\Java\comp1110-ass2-tue11b\comp1110-ass2-tue11b.iml" filepath="D:\WorkSpace\IntellijIDEA\Java\comp1110-ass2-tue11b\comp1110-ass2-tue11b.iml" />
     </modules>
   </component>
 </project>
\ No newline at end of file
Only in ../master/comp1110-ass2/.idea: runConfigurations
Only in comp1110-ass2: META-INF
diff -ru -x .git ../master/comp1110-ass2/admin/B-contribution.md comp1110-ass2/admin/B-contribution.md
--- ../master/comp1110-ass2/admin/B-contribution.md	2017-10-20 11:04:29.745912159 +1100
+++ comp1110-ass2/admin/B-contribution.md	2017-10-20 11:04:33.141918003 +1100
@@ -1,7 +1,7 @@
 We declare that the work toward our submission of Stage B was distributed among the group members as follows:

-* u2345678 30
-* u3456789 40
-* u0234567 30
+* u6071714 30
+* u5917277 30
+* u6233112 30

-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0234567)
+Signed: Qingsen Kuang(u5917277), Yiwen Peng (u607171), and Chan Xu (u6233112)
diff -ru -x .git ../master/comp1110-ass2/admin/B-originality.md comp1110-ass2/admin/B-originality.md
--- ../master/comp1110-ass2/admin/B-originality.md	2017-10-20 11:04:29.745912159 +1100
+++ comp1110-ass2/admin/B-originality.md	2017-10-20 11:04:33.141918003 +1100
@@ -6,4 +6,4 @@

 *  ....

-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Yiwen Peng (u607171), Qingsen Kuang(u5917277), and Chan Xu (u6233112)
diff -ru -x .git ../master/comp1110-ass2/admin/C-contribution.md comp1110-ass2/admin/C-contribution.md
--- ../master/comp1110-ass2/admin/C-contribution.md	2017-10-20 11:04:29.749912165 +1100
+++ comp1110-ass2/admin/C-contribution.md	2017-10-20 11:04:33.141918003 +1100
@@ -1,7 +1,7 @@
 We declare that the work toward our submission of Stage C was distributed among the group members as follows:

-* u2345678 30
-* u3456789 40
-* u0234567 30
+* u6071714 33
+* u5917277 34
+* u6233112 33 -- Finished Task2 and half of the Task3

-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0234567)
+Signed: Qingsen Kuang(u5917277), Yiwen Peng (u607171), and Chan Xu (u6233112)
diff -ru -x .git ../master/comp1110-ass2/admin/C-originality.md comp1110-ass2/admin/C-originality.md
--- ../master/comp1110-ass2/admin/C-originality.md	2017-10-20 11:04:29.749912165 +1100
+++ comp1110-ass2/admin/C-originality.md	2017-10-20 11:04:33.145918010 +1100
@@ -2,8 +2,8 @@

 * The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)

-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
+* The code in class <stepgame> the function of noduplication  is based on a solution we found when researching the problem (https://stackoverflow.com/questions/13119926/find-duplicate-characters-in-a-string-and-count-the-number-of-occurances-using-j)

 *  ....

-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Yiwen Peng (u607171), Qingsen Kuang(u5917277), and Chan Xu (u6233112)
Only in comp1110-ass2/admin: D-originality-_u6071714.md
Only in ../master/comp1110-ass2/admin: D-originality-u1234567.md
Only in comp1110-ass2/admin: D-originality-u5917277.md
Only in comp1110-ass2/admin: D-originality-u6233112.md
Only in comp1110-ass2/admin: E-originality-u6071714
Only in comp1110-ass2/admin: E-originality-u6233112.md
diff -ru -x .git ../master/comp1110-ass2/admin/F-contribution.md comp1110-ass2/admin/F-contribution.md
--- ../master/comp1110-ass2/admin/F-contribution.md	2017-10-20 11:04:29.765912193 +1100
+++ comp1110-ass2/admin/F-contribution.md	2017-10-20 11:04:33.153918024 +1100
@@ -1,8 +1,8 @@
 We declare that the work toward our submission of Stage F was distributed among the group members as follows:

-* u2345678 30
-* u3456789 40
-* u0123456 30
+* u6233112 50 -- Task7
+* u6071714 50 -- Packaging the game.jar file & Task9 is in process.
+* u

-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Chan Xu (u6233112), Yiwen Peng (u6071714)

diff -ru -x .git ../master/comp1110-ass2/admin/F-originality.md comp1110-ass2/admin/F-originality.md
--- ../master/comp1110-ass2/admin/F-originality.md	2017-10-20 11:04:29.769912200 +1100
+++ comp1110-ass2/admin/F-originality.md	2017-10-20 11:04:33.153918024 +1100
@@ -6,4 +6,4 @@

 * ....

-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Chan Xu (u6233112), Yiwen Peng (u6071714)
Only in ../master/comp1110-ass2/admin: F-review-u1234567.md
Only in comp1110-ass2/admin: F-review-u6071714.md
Only in comp1110-ass2/admin: F-review-u6233112.md
Only in ../master/comp1110-ass2/admin: G-best-u1234567.md
Only in comp1110-ass2/admin: G-best-u6071714.md
Only in comp1110-ass2/admin: G-best-u6233112.md
diff -ru -x .git ../master/comp1110-ass2/admin/G-contribution.md comp1110-ass2/admin/G-contribution.md
--- ../master/comp1110-ass2/admin/G-contribution.md	2017-10-20 11:04:29.773912206 +1100
+++ comp1110-ass2/admin/G-contribution.md	2017-10-20 11:04:33.161918038 +1100
@@ -1,8 +1,8 @@
 We declare that the work toward our submission of Stage G was distributed among the group members as follows:

-* u2345678 30
-* u3456789 40
-* u0123456 30
+* u6233112 60
+* u6071714 40
+* u5917277 0

-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+Signed: Chan Xu (u6233112), Yiwen Peng (u6071714)

diff -ru -x .git ../master/comp1110-ass2/admin/G-features.md comp1110-ass2/admin/G-features.md
--- ../master/comp1110-ass2/admin/G-features.md	2017-10-20 11:04:29.773912206 +1100
+++ comp1110-ass2/admin/G-features.md	2017-10-20 11:04:33.161918038 +1100
@@ -3,13 +3,23 @@

 *(Remove those that are unimplemented)*

- - A simple placement viewer (Task 5)
- - A basic playable link game
- - A basic playable link game that snaps pieces to pegs and checks for validity (Task 8)
- - A basic implementation  of starting piece placements (Task 9)
- - Solution hints
- - Interesting starting placements, generated by our code.
+ - A simple placement viewer.(Task 4)
+ - A basic playable step game.(Task 5)
+ - A basic playable link game that snaps pieces to pegs and checks for validity (Task 6)
+ - Solution hints(Task 7)
+ - A basic implementation of starting piece placements.(Task 8)
+
+*(additional features...)*
+
+- Using numbers '0','1','2' to represent the piece information
+(including shape and orientation).
+- Using axis of coordinates to represent the board.
+- Using for loop to combine pieces and board.
+- Using math function to represent the position instead of using it to discuss.
+- Add background image.
+- Add the rule bottom to tell how to play it.
+- Switch the scene between the rule screen and the game screen.
+

-additional features...


diff -ru -x .git ../master/comp1110-ass2/admin/G-originality.md comp1110-ass2/admin/G-originality.md
--- ../master/comp1110-ass2/admin/G-originality.md	2017-10-20 11:04:29.773912206 +1100
+++ comp1110-ass2/admin/G-originality.md	2017-10-20 11:04:33.165918045 +1100
@@ -1,9 +1,15 @@
 We declare that the work we have submitted for Stage G of this assignment and all stages before it is entirely our own work, with the following documented exceptions:

-* The idea of using <...> to make the game run faster came from a discussion with <...> (noted in source code comments)
+* The idea of using this great framework to make the game run faster came from a discussion with Yuze Gong(u5640420).

-* The code in class <...> is based on a solution we found when researching the problem (URL provided in source code comments)
+* The code in class <StepsGame> the function of noduplication is based on a solution we found when researching the problem.(URL provided in source code comments)

-* ....
+* The code in class <GameBoard> uses an idea suggested by Yuze Gong(u5640420).
+  
+* The idea of <fix the piece on to peg> came from a discussion with Hengrui Wang (u6202156).

-Signed: Mary Jones (u2345678), Bob Smith (u3456789), and Sue Black (u0123456)
+* The code in class <DraggablePiece> uses an idea suggested by the assignment1 Game class.
+
+* The idea of game screen design is suggested by Chan Xu (u6233112).
+
+Signed: Chan Xu (u6233112), Yiwen Peng (u6071714)
Only in ../master/comp1110-ass2: comp1110-ass2-dev.iml
Only in comp1110-ass2: comp1110-ass2-tue11b.iml
Only in comp1110-ass2: feedback.md
Only in comp1110-ass2: game.jar
Only in comp1110-ass2: presentation.pdf
Only in comp1110-ass2/src: META-INF
Only in comp1110-ass2/src/comp1110/ass2: GameBoard$Coord.class
Only in comp1110-ass2/src/comp1110/ass2: GameBoard.class
Only in comp1110-ass2/src/comp1110/ass2: GameBoard.java
Only in comp1110-ass2/src/comp1110/ass2: Piece.class
Only in comp1110-ass2/src/comp1110/ass2: Piece.java
Only in comp1110-ass2/src/comp1110/ass2: StepsGame.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/StepsGame.java comp1110-ass2/src/comp1110/ass2/StepsGame.java
--- ../master/comp1110-ass2/src/comp1110/ass2/StepsGame.java	2017-10-20 11:04:29.857912351 +1100
+++ comp1110-ass2/src/comp1110/ass2/StepsGame.java	2017-10-20 11:04:33.337918340 +1100
@@ -1,10 +1,12 @@
 package comp1110.ass2;

-import java.util.Set;
+import comp1110.ass2.gui.Board;
+
+import java.util.*;

 /**
  * This class provides the text interface for the Steps Game
- *
+ * <p>
  * The game is based directly on Smart Games' IQ-Steps game
  * (http://www.smartgames.eu/en/smartgames/iq-steps)
  */
@@ -21,24 +23,83 @@
      * @return True if the piece placement is well-formed
      */
     static boolean isPiecePlacementWellFormed(String piecePlacement) {
-        // FIXME Task 2: determine whether a piece placement is well-formed
+        // FIXME Task 2: determine whether a piece placement is well-forme
+        // Authorship details: Task2 is written by Chan Xu (u6233112).
+
+        /* Determine whether it consists of exactly three characters.*/
+        if (piecePlacement.length() == 3) {
+            char[] placementChar = piecePlacement.toCharArray();
+            if (placementChar[0] >= 'A' && placementChar[0] <= 'H') {                    // Check the first char
+                if (placementChar[1] >= 'A' && placementChar[1] <= 'H') {                // Check the second char
+                    return ((placementChar[2] >= 'A' && placementChar[2] <= 'Y') ||     // Check the third char
+                            (placementChar[2] >= 'a' && placementChar[2] <= 'y'));
+                }
+            }
+        }
         return false;
     }

+
     /**
      * Determine whether a placement string is well-formed:
-     *  - it consists of exactly N three-character piece placements (where N = 1 .. 8);
-     *  - each piece placement is well-formed
-     *  - no shape appears more than once in the placement
+     * - it consists of exactly N three-character piece placements (where N = 1 .. 8);
+     * - each piece placement is well-formed
+     * - no shape appears more than once in the placement
      *
      * @param placement A string describing a placement of one or more pieces
      * @return True if the placement is well-formed
      */
     static boolean isPlacementWellFormed(String placement) {
         // FIXME Task 3: determine whether a placement is well-formed
-        return false;
+        // Authorship details: Task3 is written by the group.
+
+        /* Determine whether the placement is null.*/
+        if (placement == null)
+        {
+            return false;
+            /* Determine whether the length of placement is divided by three.*/
+        }else if (placement.length() % 3 != 0)
+        {
+            return false;
+        }else
+        {
+            for (int i = 0; i < placement.length(); i += 3) {
+                if (!isPiecePlacementWellFormed(placement.substring(i, i + 3))) {
+                    return false;
+                }
+            }
+
+            String[] a = new String[placement.length() / 3];
+
+            for (int i = 0; i < placement.length() / 3; i++) {
+                a[i] = placement.substring(3 * i, 3 * i + 3);
+                if (isPiecePlacementWellFormed(a[i]) && NoDuplicate(placement)) {
+                    return true;
+                }
+            }
+            return false;
+        }
     }

+
+    /**
+     * Helper for Task 3.
+     * The idea is from StackOverflow: https://stackoverflow.com/questions/13119926/find-duplicate-characters-in-a-string-and-count-the-number-of-occurances-using-j
+     *
+     * @param placement A placement sequence string
+     * @return False If the placements are not duplicate
+     */
+    static boolean NoDuplicate(String placement) {
+        boolean Duplicate = true;
+        char[] b = placement.toCharArray();
+        for (int i = 0; i < b.length; i += 3)
+            for (int k = 0; k < b.length; k += 3)
+                if (i != k && b[i] == b[k])
+                    Duplicate = false;
+        return Duplicate;
+    }
+
+
     /**
      * Determine whether a placement sequence is valid.  To be valid, the placement
      * sequence must be well-formed and each piece placement must be a valid placement
@@ -47,11 +108,36 @@
      * @param placement A placement sequence string
      * @return True if the placement sequence is valid
      */
-    static boolean isPlacementSequenceValid(String placement) {
+   public static boolean isPlacementSequenceValid(String placement) {
         // FIXME Task 5: determine whether a placement sequence is valid
-        return false;
+        // Authorship details: Task5 is written by Chan Xu (u6233112).
+
+        /* Determine whether the placement is well formed.*/
+        if (!isPlacementWellFormed(placement))
+        {
+            return false;
+        } else
+        {
+            /* Create a board.*/
+            GameBoard brd = new GameBoard();
+
+            for (int i = 0; i < placement.length(); i += 3)
+            {
+                String pieceState = placement.substring(i, i+2);        // separate into pieces string
+                Piece pce = new Piece(pieceState);                     // create the piece with its shape information by using number 0,1,2
+                char pos = placement.charAt(i+2);                      // get piece position
+
+                /* Determine whether the piece can be placed on the board.*/
+                if (!brd.isPiecePlaced(pce, pos))
+                {
+                    return false;
+                }
+            }
+            return true;
+        }
     }

+
     /**
      * Given a string describing a placement of pieces and a string describing
      * an (unordered) objective, return a set of all possible next viable
@@ -65,21 +151,68 @@
      */
     static Set<String> getViablePiecePlacements(String placement, String objective) {
         // FIXME Task 6: determine the correct order of piece placements
-        return null;
+        // Authorship details: Task6 is written by Chan Xu (u6233112).
+
+        /* Create a box storing objective string which is different from placement string.*/
+        Set<String> box = new HashSet<>();
+
+        for (int i = 0; i < objective.length(); i+=3)
+        {
+            box.add(objective.substring(i, i+3));
+        }
+        for (int i = 0; i < placement.length(); i+=3)
+        {
+            box.remove(placement.substring(i, i+3));
+        }
+
+        /* To get viable pieces.*/
+        Set<String> viablePieces = new HashSet<>();
+
+        for (String obj: box)
+        {
+            if (isViablePiece(obj, box))
+            {
+                viablePieces.add(obj);
+            }
+        }
+        return viablePieces;
+    }
+
+
+    /**
+     * Helper for Task 6.
+     * @param obj
+     * @param box
+     * @return True if A viable piece placement will not obstruct any other unplaced piece.
+     */
+    private static boolean isViablePiece(String obj, Set<String> box)
+    {
+        for (String sub: box)
+        {
+            if (!obj.equals(sub))
+            {
+                if (!isPlacementSequenceValid(obj+sub))
+                {
+                    return false;
+                }
+            }
+        }
+        return true;
     }

+
     /**
-     * Return an array of all unique (unordered) solutions to the game, given a
-     * starting placement.   A given unique solution may have more than one than
-     * one placement sequence, however, only a single (unordered) solution should
-     * be returned for each such case.
-     *
-     * @param placement  A valid piece placement string.
-     * @return An array of strings, each describing a unique unordered solution to
-     * the game given the starting point provided by placement.
-     */
-    static String[] getSolutions(String placement) {
-        // FIXME Task 9: determine all solutions to the game, given a particular starting placement
-        return null;
+         * Return an array of all unique (unordered) solutions to the game, given a
+         * starting placement.   A given unique solution may have more than one than
+         * one placement sequence, however, only a single (unordered) solution should
+         * be returned for each such case.
+         *
+         * @param placement  A valid piece placement string.
+         * @return An array of strings, each describing a unique unordered solution to
+         * the game given the starting point provided by placement.
+         */
+        static String[] getSolutions(String placement) {
+            // FIXME Task 9: determine all solutions to the game, given a particular starting placement
+            return null;
+        }
     }
-}
Only in comp1110-ass2/src/comp1110/ass2/gui: Board$DraggablePiece.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Board$Piece.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Board.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/gui/Board.java comp1110-ass2/src/comp1110/ass2/gui/Board.java
--- ../master/comp1110-ass2/src/comp1110/ass2/gui/Board.java	2017-10-20 11:04:29.861912358 +1100
+++ comp1110-ass2/src/comp1110/ass2/gui/Board.java	2017-10-20 11:04:33.337918340 +1100
@@ -1,15 +1,310 @@
 package comp1110.ass2.gui;
-
+import comp1110.ass2.StepsGame;
 import javafx.application.Application;
+import javafx.scene.Scene;
+import javafx.scene.image.Image;
+import javafx.scene.image.ImageView;
+import javafx.scene.control.Button;
+import javafx.scene.text.Font;
+import javafx.scene.text.*;
+import javafx.scene.input.MouseEvent;
 import javafx.stage.Stage;
+import javafx.scene.Group;
+
+
+import javafx.scene.paint.Color;
+import javafx.scene.shape.Circle;
+import java.util.ArrayList;

 public class Board extends Application {
-    private static final int BOARD_WIDTH = 933;
-    private static final int BOARD_HEIGHT = 700;

+    private static final int BOARD_WIDTH = 1200;
+    private static final int BOARD_HEIGHT = 900;
+    // Piece
+    private static final int Piece_Size=150;
+    // the board
+    private static final int START_X=2*Piece_Size;
+    private static final int START_Y=Piece_Size;
+    private static final int r =12;
+    private static  final int WIDTH = Piece_Size*4;
+    private static final int Space=Piece_Size/4;
+    private static final int PieceR=Piece_Size/3;
+    private static final String URI_BASE = "assets/";
+
+    private final Group root = new Group();
+    private final Group peg= new Group();
+    private final Group firstImage= new Group();
+    private final Group flipImage =new Group();
+    private final Group starPiece=new Group();
+    private final Group instruction=new Group();
+    private static final char not=' ';
+    //to save the flip and rotation
+    char[]flipRot = new char[8];
+    // save the postion
+    char[] pos=new char[8];
+    // create an array to save the onboard piece
+    String[]onBoardPiece=new String[8];
+    private static  final String not_string=" ";
     // FIXME Task 7: Implement a basic playable Steps Game in JavaFX that only allows pieces to be placed in valid places
+    //Authorship details: Task7 is written by Yiwen Peng (u6071714).
+    // to create a piece class
+
+    class Piece extends ImageView{
+        int originx,originy;
+        char piece,flip;
+        int index;
+        Piece(char piece, char flip){
+            if(!(piece>='A'&&piece<='H')){
+                throw new IllegalArgumentException("no this picture");
+            }else if (flip=='A'||flip=='E'){
+                setImage(new Image((getClass().getResource(URI_BASE+piece+flip+".png").toString())));
+                this.piece = piece;
+                this.flip = flip;
+                index=piece-'A';
+            }
+            else { throw new IllegalArgumentException("no this picture");
+            }
+                originx=BOARD_WIDTH/8*(piece-'A');
+                originy=3*Piece_Size;
+            setFitHeight(Piece_Size);
+            setFitWidth(Piece_Size);
+            setLayoutX(originx);
+            setLayoutY(originy);
+        }
+    }
+    public class DraggablePiece extends Piece {
+        private double mouseX ;
+        private double mouseY ;
+
+        public DraggablePiece(char piece,char flip) {
+            super(piece,flip);
+            flipRot[index]=not;
+            pos[index]=not;
+            onBoardPiece[index]=not_string;
+            // to rotate the picture
+            setOnScroll(event-> rotate());
+            // to move the piece
+            setOnMousePressed(event -> {
+                mouseX = event.getSceneX() ;
+                mouseY = event.getSceneY() ;
+            });
+
+            setOnMouseDragged(event -> {
+                double deltaX = event.getSceneX() - mouseX ;
+                double deltaY = event.getSceneY() - mouseY ;
+                relocate(getLayoutX() + deltaX, getLayoutY() + deltaY);
+                mouseX = event.getSceneX() ;
+                mouseY = event.getSceneY() ;
+                event.consume();
+            });
+            // to set on the nearst peg
+            setOnMouseReleased((MouseEvent event) -> {
+                if(onBoard()){
+                    snapToGrid();
+                }
+                else {
+                    snapToHome();
+                }
+
+                if(StepsGame.isPlacementSequenceValid(Board.this.toString(onBoardPiece))){
+                    snapToGrid();
+                }else{
+                    snapToHome();
+                }
+                System.out.println(Board.this.toString(onBoardPiece));
+            });
+            // to flip the picture;
+            setOnMouseClicked(event ->{
+                int clickTimes = event.getClickCount();
+                if (clickTimes == 2){
+                    firstImage.getChildren().remove((0));
+                    flipImage.getChildren().add(new DraggablePiece(this.piece,'E'));
+                }
+            });
+        }
+        // to check whether the piece is on board
+        private boolean onBoard(){
+            return getLayoutX()>=(START_X-80)&&getLayoutX()<=(START_X+WIDTH+Space-Piece_Size)
+                    &&getLayoutY()>=(START_Y-80)&&getLayoutY()<=(START_Y+(Space*5+r)-Piece_Size);
+        }

+        // make the piece come back to the original position
+        private void snapToHome(){
+            setLayoutX(originx);
+            setLayoutY(originy);
+            flipRot[index]=not;
+            pos[index]=not;
+        }
+        // make the piece to the nearst position
+        private void snapToGrid(){
+            double centreX,centreY;
+            centreX=getLayoutX()+Piece_Size/2;
+            centreY=getLayoutY()+Piece_Size/2;
+            int setCentreX=(int)(centreX-START_X+PieceR/2)/(Space)*(Space);
+            int setX=setCentreX+START_X-Piece_Size/2;
+            int setCentreY=(int)(centreY-START_Y+PieceR/2)/(Space)*(Space);
+            int setY=setCentreY+START_Y-Piece_Size/2;
+            setLayoutX(setX);
+            setLayoutY(setY);
+            setPosition();
+            getFlipRot();
+            total();
+            System.out.println(""+setX+" "+setY);
+        }
+
+        // to rotate the picture
+        private void rotate(){
+            setRotate((getRotate()+90)%360);
+            setPosition();
+            getFlipRot();
+            total();
+        }
+        // to flip the picture   find corresponded char
+        private void getFlipRot(){
+            int rotate=(int)getRotate()/90;
+            char val=(char) (flip+rotate);
+            flipRot[index]=val;
+        }
+        // find the char of the position (A,B...)
+        private void setPosition(){
+            char position;
+            int x= (int)(getLayoutX()+Piece_Size/2-START_X+PieceR/2)/(Space);
+            int y=(int)(getLayoutY()+Piece_Size/2-START_Y+PieceR/2)/(Space)*10;
+            if (x+y<26){
+                position= (char)('A'+x+y);
+            }else{
+                position=(char)('A'+x+y+7);
+            }
+            pos[index]=position;
+        }
+        //get the information string of piece;
+        private void total(){
+            onBoardPiece[index]=(String.valueOf(piece)+String.valueOf(flipRot[index])+String.valueOf(pos[index]));
+        }
+    }
+    public String toString(String[] a){
+        StringBuffer valid =new StringBuffer();
+        for (int i=0;i<a.length;i++){
+            if(a[i].equals(" ")){
+
+            }else{
+                valid.append(a[i]);
+            }
+        }
+        String str=valid.toString();
+        return  str;
+    }
+      // draw the peg
+    private void makeBoard(){
+        for (int row =0;row<5;row++){
+            for (int col=0;col<5;col++){
+                double x;
+                if (row%2==0){
+                    x=START_X+Space*2*col;
+                }else{
+                    x =START_X+Space+Space*2*col;
+                }
+                double y =START_Y+Space*row;
+                Circle circle = new Circle(x, y, r);
+                circle.setFill(Color.GRAY);
+                peg.getChildren().add(circle);
+
+                // change this root to board
+                // add board to root;
+            }
+        }
+    }
+     // draw the piece
+    private void makePiece(){
+        for (char z = 'A'; z <= 'H'; z++) {
+            firstImage.getChildren().add(new DraggablePiece(z,'A'));
+        }
+    }
     // FIXME Task 8: Implement starting placements
+    //Authorship details: Task8 is written Yiwen Peng (u6071714)
+
+    // randomly choose a piece on the board
+    private void star(){
+        firstImage.getChildren().remove(0,7);
+        ArrayList<String> list=new ArrayList<>();
+
+        list.add("AA");
+        list.add("BA");
+        list.add("CA");
+        list.add("DA");
+        list.add("EA");
+        list.add("FA");
+        list.add("GA");
+        list.add("HA");
+        int random=(int)(1+Math.random()*7);
+        String str =  list.get(random);
+        list.remove(random);
+        for(String piece:list){
+            char[] singlePiece=piece.toCharArray();
+            starPiece.getChildren().add(new DraggablePiece(singlePiece[0],singlePiece[1]));
+        }
+        char[] boardPiece = str.toCharArray();
+        DraggablePiece a =new DraggablePiece(boardPiece[0],boardPiece[1]);
+        a.relocate(262,112);
+
+        starPiece.getChildren().add(a);
+        makeBoard();
+
+    }
+    // to design the layout of game
+    // design the game board
+    private void design(){
+         Image image = new Image((getClass().getResource(URI_BASE+"bg.jpg").toString()));
+         ImageView bg=new ImageView(image);
+         Text title= new Text("IQ-Step");
+         title.setFont(Font.font("Tahoma",FontWeight.NORMAL, 50));
+         title.setX(BOARD_WIDTH/2-200);
+         title.setY(50);
+         bg.setFitHeight(BOARD_HEIGHT);
+         bg.setFitWidth(BOARD_WIDTH);
+         bg.setX(0);
+         bg.setY(0);
+         bg.setOpacity(0.75f);
+         root.getChildren().addAll(bg,title);
+    }
+    // add start button to start the game;
+    private void makeControl(){
+        Button star=new Button("Star");
+        star.setOnAction(event -> {
+            star();
+        });
+        star.setLayoutX(4.5*Piece_Size);
+        star.setLayoutY(2*Piece_Size);
+        root.getChildren().add(star);
+    }                                        
+
+    // design the rule board
+    private void tellRule(){
+        Image image = new Image((getClass().getResource(URI_BASE+"bg1.jpg").toString()));
+        ImageView bg=new ImageView(image);
+          bg.setFitHeight(BOARD_HEIGHT);
+          bg.setFitWidth(BOARD_WIDTH);
+          bg.setX(0);
+          bg.setY(0);
+          bg.setOpacity(0.75f);
+        Text title =new Text("HOW TO PLAY");
+        title.setX(80);
+        title.setY(50);
+        title.setFont(Font.font("Tahoma",FontWeight.NORMAL, 50));
+        Text r1=new Text("1.click Start to play the game.");
+        r1.setFont(Font.font("Tahoma",FontWeight.NORMAL, 20));
+        r1.setX(30);
+        r1.setY(100);
+        Text r2=new Text("2.one the picture could not move to the board,the game is over.");
+        r2.setX(30);
+        r2.setY(130);
+        r2.setFont(Font.font("Tahoma",FontWeight.NORMAL, 20));
+        Text r3=new Text("scroll the mouse to rotate the piece,double to flip the picture.");
+        r3.setFont(Font.font("Tahoma",FontWeight.NORMAL, 20));
+        r3.setX(30);
+        r3.setY(150);
+        instruction.getChildren().addAll(bg,title,r1,r2,r3);
+    }

     // FIXME Task 10: Implement hints

@@ -17,6 +312,41 @@

     @Override
     public void start(Stage primaryStage) throws Exception {
+        primaryStage.setTitle("IQ game");
+        Scene scene1 = new Scene(root, BOARD_WIDTH, BOARD_HEIGHT);
+        Scene scene2= new Scene(instruction,BOARD_WIDTH/2+20,BOARD_HEIGHT/2+20);
+        design();
+        makeBoard();
+        makePiece();
+        tellRule();
+        makeControl();
+        tellRule();
+       // TO SWITCH THE SCENE
+        Button rule=new Button("rule");
+        rule.setLayoutX(4.5*Piece_Size);
+        rule.setLayoutY(2.2*Piece_Size);
+        rule.setOnAction(e->primaryStage.setScene(scene2));
+        Button comeback=new Button("back");
+        comeback.setLayoutX(BOARD_WIDTH/2/4*3);
+        comeback.setLayoutY(BOARD_HEIGHT/2/4*3);
+        comeback.setOnAction(e->primaryStage.setScene(scene1));
+        instruction.getChildren().addAll(comeback);
+        root.getChildren().addAll(peg,firstImage,flipImage,starPiece,rule);
+
+        primaryStage.setScene(scene1);
+        primaryStage.show();
+    }
+
+
+
+
+
+
+
+
+

+    public static void main(String[] args){
+        launch(args);
     }
 }
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$1.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer$Piece.class
Only in comp1110-ass2/src/comp1110/ass2/gui: Viewer.class
diff -ru -x .git ../master/comp1110-ass2/src/comp1110/ass2/gui/Viewer.java comp1110-ass2/src/comp1110/ass2/gui/Viewer.java
--- ../master/comp1110-ass2/src/comp1110/ass2/gui/Viewer.java	2017-10-20 11:04:29.861912358 +1100
+++ comp1110-ass2/src/comp1110/ass2/gui/Viewer.java	2017-10-20 11:04:33.341918347 +1100
@@ -8,6 +8,8 @@
 import javafx.scene.control.Button;
 import javafx.scene.control.Label;
 import javafx.scene.control.TextField;
+import javafx.scene.image.Image;
+import javafx.scene.image.ImageView;
 import javafx.scene.layout.HBox;
 import javafx.stage.Stage;

@@ -22,33 +24,63 @@

     /* board layout */
     private static final int SQUARE_SIZE = 60;
-    private static final int PIECE_IMAGE_SIZE = (int) ((3*SQUARE_SIZE)*1.33);
+    private static final int PIECE_IMAGE_SIZE = (int) ((3 * SQUARE_SIZE) * 1.33);
     private static final int VIEWER_WIDTH = 750;
     private static final int VIEWER_HEIGHT = 500;

-    private static final String URI_BASE = "assets/";
+    private static final String URI_BASE = "comp1110/ass2/gui/assets/";

     private final Group root = new Group();
     private final Group controls = new Group();
+    private final Group piece=new Group();
     TextField textField;

+    class Piece extends ImageView{
+        Piece(char a1, char a2){
+            if(!(a1>='A'&&a1<='H')){
+                throw new IllegalArgumentException("no this picture");
+            }else if (a2=='A'||a2=='E'){
+                setImage(new Image((getClass().getResource("comp1110/ass2/gui/assets/" +a1+a2+".png").toString())));
+            }
+            else {           throw new IllegalArgumentException("no this picture");
+            }  setFitHeight(PIECE_IMAGE_SIZE);
+            setFitWidth(PIECE_IMAGE_SIZE);
+        }
+
+        Piece(char a1,char a2,char pos){
+            this(a1,a2);

+            setLayoutY(pos);
+        }
+    }
     /**
      * Draw a placement in the window, removing any previously drawn one
      *
-     * @param placement  A valid placement string
+     * @param placement A valid placement string
      */
+
     void makePlacement(String placement) {
-        // FIXME Task 4: implement the simple placement viewer
+////        // FIXME Task 4: implement the simple placement viewer
+        // Authorship details: Task4 is written by Yiwen Peng (u6071714);
+
+        char[] string = placement.toCharArray();
+        piece.getChildren().add(new Piece(string[0], string[1], string[2]));
+        controls.getChildren().add(piece);
+
     }


-    /**
-     * Create a basic text field for input and a refresh button.
-     */
+//
+//
+
+
+        /**
+         * Create a basic text field for input and a refresh button.
+         */
+
     private void makeControls() {
         Label label1 = new Label("Placement:");
-        textField = new TextField ();
+        textField = new TextField();
         textField.setPrefWidth(300);
         Button button = new Button("Refresh");
         button.setOnAction(new EventHandler<ActionEvent>() {
@@ -56,16 +88,23 @@
             public void handle(ActionEvent e) {
                 makePlacement(textField.getText());
                 textField.clear();
+
             }
         });
+        // add the button to remove the previous piece;
+        Button clear = new Button("clear");
+        clear.setOnAction(e-> piece.getChildren().clear());
+        clear.setLayoutX(130);
+        clear.setLayoutY(130);
         HBox hb = new HBox();
-        hb.getChildren().addAll(label1, textField, button);
+        hb.getChildren().addAll(label1, textField, button,clear);
         hb.setSpacing(10);
         hb.setLayoutX(130);
         hb.setLayoutY(VIEWER_HEIGHT - 50);
         controls.getChildren().add(hb);
     }

+
     @Override
     public void start(Stage primaryStage) throws Exception {
         primaryStage.setTitle("StepsGame Viewer");
@@ -79,3 +118,6 @@
         primaryStage.show();
     }
 }
+
+
+
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: bg.jpg
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: bg1.jpg
Only in comp1110-ass2/src/comp1110/ass2/gui/assets: locations.png
Only in comp1110-ass2/src: gittest
Only in comp1110-ass2/tests/comp1110/ass2: NoduplicateTest.java
```
## Test log
```
--javac output--
----
java -cp comp1110-ass2/src:/students/u3789498/ass2/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3789498/ass2/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3789498/ass2/comp1110-tutors/bin/../ass2/junit-4.12.jar org.junit.runner.JUnitCore comp1110.ass2.PiecePlacementWellFormedTest
---
JUnit version 4.12
.....
Time: 0.019

OK (5 tests)

java -cp comp1110-ass2/src:/students/u3789498/ass2/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3789498/ass2/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3789498/ass2/comp1110-tutors/bin/../ass2/junit-4.12.jar org.junit.runner.JUnitCore comp1110.ass2.PlacementWellFormedTest
---
JUnit version 4.12
.....
Time: 0.021

OK (5 tests)

java -cp comp1110-ass2/src:/students/u3789498/ass2/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3789498/ass2/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3789498/ass2/comp1110-tutors/bin/../ass2/junit-4.12.jar org.junit.runner.JUnitCore comp1110.ass2.PlacementSequenceValidTest
---
JUnit version 4.12
......
Time: 0.026

OK (6 tests)

java -cp comp1110-ass2/src:/students/u3789498/ass2/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3789498/ass2/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3789498/ass2/comp1110-tutors/bin/../ass2/junit-4.12.jar org.junit.runner.JUnitCore comp1110.ass2.ViablePiecePlacementTest
---
JUnit version 4.12
.....
Time: 0.034

OK (5 tests)

java -cp comp1110-ass2/src:/students/u3789498/ass2/comp1110-tutors/bin/../ass2/ass2-1110-tests.jar:/students/u3789498/ass2/comp1110-tutors/bin/../ass2/hamcrest-core-1.3.jar:/students/u3789498/ass2/comp1110-tutors/bin/../ass2/junit-4.12.jar org.junit.runner.JUnitCore comp1110.ass2.SolutionsTest
---
JUnit version 4.12
.E.E.E
Time: 0.018
There were 3 failures:
1) testMulti(comp1110.ass2.SolutionsTest)
java.lang.AssertionError: Placement 'DFOGGQEDI' has solutions, but you returned a null array
	at org.junit.Assert.fail(Assert.java:88)
	at org.junit.Assert.assertTrue(Assert.java:41)
	at comp1110.ass2.SolutionsTest.testMulti(SolutionsTest.java:59)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:497)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:298)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:292)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.lang.Thread.run(Thread.java:745)
2) testSimple(comp1110.ass2.SolutionsTest)
java.lang.AssertionError: Placement 'CEQEHuGEOBDxFGSHCiAAL' has solution 'CEQEHuGEOBDxFGSHCiAALDBg', but you returned a null array
	at org.junit.Assert.fail(Assert.java:88)
	at org.junit.Assert.assertTrue(Assert.java:41)
	at comp1110.ass2.SolutionsTest.testSingle(SolutionsTest.java:26)
	at comp1110.ass2.SolutionsTest.testSimple(SolutionsTest.java:39)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:497)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:298)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:292)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.lang.Thread.run(Thread.java:745)
3) testSingle(comp1110.ass2.SolutionsTest)
java.lang.AssertionError: Placement 'CEQEHu' has solution 'CEQEHuGEOBDxFGSHCiAALDBg', but you returned a null array
	at org.junit.Assert.fail(Assert.java:88)
	at org.junit.Assert.assertTrue(Assert.java:41)
	at comp1110.ass2.SolutionsTest.testSingle(SolutionsTest.java:26)
	at comp1110.ass2.SolutionsTest.testSingle(SolutionsTest.java:48)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:497)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:298)
	at org.junit.internal.runners.statements.FailOnTimeout$CallableStatement.call(FailOnTimeout.java:292)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.lang.Thread.run(Thread.java:745)

FAILURES!!!
Tests run: 3,  Failures: 3

```
