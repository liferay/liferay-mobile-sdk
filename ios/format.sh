#! /bin/sh

if [ -z "$1" ]; then
	for file in $(find . -name "*.[hm]" -not -path "./Source/Service/*"); do
		uncrustify -l OC -c uncrustify.cfg --no-backup $file
	done
else
	uncrustify -l OC -c uncrustify.cfg --no-backup $1
fi