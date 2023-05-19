while($true) {
	$date = date
	git add --all
	git commit -m "David Ballesteros: $($date.Hour):$($date.Minute)"
	git push

	sleep -seconds $(15 * 60)
}