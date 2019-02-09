import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
interface RootObject {
  pid: number;
  profile: string;
  imageURL: string;
  battingStyle: string;
  bowlingStyle: string;
  majorTeams: string;
  currentAge: string;
  born: string;
  fullName: string;
  name: string;
  country: string;
  playingRole: string;
  v: string;
  //data: Data;
  ttl: number;
  
  creditsLeft: number;
}


// interface Data {
//   bowling: Bowling;
//   batting: Batting;
// }

// interface Batting {
//   listA: ListA2;
//   firstClass: ListA2;
//   T20Is: ListA2;
//   ODIs: ListA2;
//   tests: ListA2;
// }

// interface ListA2 {
//   '50': string;
//   '100': string;
//   St: string;
//   Ct: string;
//   '6s': string;
//   '4s': string;
//   SR: string;
//   BF: string;
//   Ave: string;
//   HS: string;
//   Runs: string;
//   NO: string;
//   Inns: string;
//   Mat: string;
// }

// interface Bowling {
//   listA: ListA;
//   firstClass: ListA;
//   T20Is: ListA;
//   ODIs: ListA;
//   tests: ListA;
// }

// interface ListA {
//   '10': string;
//   '5w': string;
//   '4w': string;
//   SR: string;
//   Econ: string;
//   Ave: string;
//   BBM: string;
//   BBI: string;
//   Wkts: string;
//   Runs: string;
//   Balls: string;
//   Inns: string;
//   Mat: string;
// }

@Component({
  selector: 'app-player-details',
  templateUrl: './player-details.component.html',
  styleUrls: ['./player-details.component.css']
})
export class PlayerDetailsComponent implements OnInit {

player : RootObject;

  chart = [];

  public barChartOptions = {
    scaleShowVerticalLines: false,
    responsive: true
  };
  public barChartLabels =['2006', '2007', '2008', '2009', '2010', '2011', '2012'];
  
    public barChartType = 'line';
  public barChartLegend = true;

  public barChartData = [
    { data: [65, 0, 80, 81, 56, 0, 40], label: 'Series A' },
    { data: [28, 48, 40, 19, 86, 27, 90], label: 'Series B' },
  ];

  constructor(private http: HttpClient) {
  }

  ngOnInit() {
   
    this.http.get<RootObject>
      ('https://cricapi.com/api/playerStats?apikey=EiRoTVCRIgaL3Au9QowfgzhqQbk2&pid=35320')

      .subscribe(data => {

        this.player=data;
              console.log("Profile: " + this.player.profile);
      

      },
      err => console.error(err),
    )
  }
}
