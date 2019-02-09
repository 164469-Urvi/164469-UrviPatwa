import { Component } from '@angular/core';
//import { HttpClient } from '@angular/common/http';

interface RootObject {
  matches: Match[];
  v: string;
}


interface Match {
  date: string;
  dateTimeGMT: string;
  'team-1': string;
  'team-2': string;
  type: string;
  squad: boolean;
  toss_winner_team?: string;
  winner_team?: string;
  matchStarted: boolean;
}
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

}
