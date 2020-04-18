VoodooTemplate

## Building a pack
This means updating mods and rerunning dependency logic, etc

`./gradlew irritatered_build`

## testing a pack

`./gradlew irritatered_test_mmc`

## packaging a pack

`./gradlew irritatered_pack_all`

## changelogs

to use changelogs copy `hooks/post-commit` to `.git/hooks/post-commit`
to compare versions voodoo needs to automatically create tags when the version changes and the packs were modified