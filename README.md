VoodooTemplate

Rename the irritatered pack to whatever you like.. or make more silly things like it

## changelogs

to use changelogs copy `hooks/post-commit` to `.git/hooks/post-commit`
to compare versions voodoo needs to automatically create tags when the version changes and the packs were modified

## Building a pack
This means updating mods and rerunning dependency logic, etc

`./gradlew irritatered_build`

this will create a folder `irritatered` in the repository root, add config files and such there

folders named `_CLIENT` and `_SERVER` will deposit their content only on one "side", they are invisible to the users
`config/_CLIENT/defaultconfig/file.cfg` will be `config/defaultconfig/file.cfg` and install on the server is skipped

## testing a pack

`./gradlew irritatered_test_mmc`

## packaging a pack

`./gradlew irritatered_pack_all`

## other tasks

look what idea show you in the `irritatered` section in the gradle tool window

## other packs

packs are identified by their filename in `packs/`
and tasks use the pack identifier as prefix, go figure the rest out on your own

## my voodoo is broken and there should be a fix ?

gradle might not always autoupdate plugins
run `./gradlew voodooVersion --refresh-dependencies` to force it
