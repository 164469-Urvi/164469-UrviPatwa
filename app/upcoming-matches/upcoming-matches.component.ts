import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

interface RootObject {
  matches: Match[];
}

interface Match {
  date: string;
  dateTimeGMT: string;
  "team-1": string;
  "team-2": string;
  "type": string;
  squad: boolean;
  toss_winner_team?: string;
  winner_team?: string;
  matchStarted: boolean;
}

@Component({
  selector: 'app-upcoming-matches',
  templateUrl: './upcoming-matches.component.html',
  styleUrls: ['./upcoming-matches.component.css']
})
export class UpcomingMatchesComponent implements OnInit {
  liveMatches: any = [];
  matchArray: Match[];
  startIndex: number;
  secondColStartIndex: number;
  endIndex: number;


  isMatchStarted(status: boolean): string {
    return status ? "Match started" : "Match Not Started";
  }

  matchWinnerCheck(winnerTeam: string): string {
    if (winnerTeam == null)
      return "Not yet started"
  }

  constructor(private http: HttpClient) {
  }

  ngOnInit() {

    this.http.get<RootObject>
      ('https://cricapi.com/api/matches?apikey=EiRoTVCRIgaL3Au9QowfgzhqQbk2')

      .subscribe(data => {
        this.matchArray = data.matches;
        this.startIndex = this.matchArray.length / 2;
        this.endIndex = this.matchArray.length;
        
        console.log("Number of data: " + this.matchArray.length);

        this.matchArray.forEach(element => {
          if (element.matchStarted==true && element.type != "First-class" && element.type != "ListA") {
            this.liveMatches.push(element);
            console.log(this.liveMatches);
          }
        },

          err => {
            console.log("Error occured.")
          });
      },
      err => console.error(err),
    )
    }

}
