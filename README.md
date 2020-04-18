# VoodooTemplate

## idea

recommended IDE / editor: https://www.jetbrains.com/idea/download/#section=windows
or install via jetbrains toolbox for easier updating of tools: https://www.jetbrains.com/toolbox-app/

open the repository folder in idea and the gradle plugin will be automatically imported

## changelogs

to use changelogs copy `hooks/post-commit` to `.git/hooks/post-commit`
to compare versions voodoo needs to automatically create tags when the version changes and the packs were modified

## editing the sample pack

the sample pack sources are at `packs/irritatered.voodoo.kts`
Rename the irritatered pack to whatever you like..
it needs to be alphanumerical and end with `.voodoo.kts`

the filename without extension will henceforth be referred to as `pack identifier` or `packid`

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

packs are identified by their  `packid` derived from filename in `packs/`
and tasks use the `pack identifier` as prefix and group name, go figure the rest out on your own

## my voodoo is broken and there should be a fix ?

gradle might not always autoupdate plugins
run `./gradlew voodooVersion --refresh-dependencies` to force it
