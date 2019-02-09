import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { UpcomingMatchesComponent } from './upcoming-matches/upcoming-matches.component';
import { PlayerDetailsComponent } from './player-details/player-details.component';
import { NewsComponent } from './news/news.component';
import { VideosComponent } from './videos/videos.component';


const routes: Routes = [
  {path:'',component:HomeComponent},
  {path:'about-us',component:AboutUsComponent},
  {path:'upcoming-matches',component:UpcomingMatchesComponent},
  {path:'player-details',component:PlayerDetailsComponent},
  {path:'news',component:NewsComponent},
  {path:'videos',component:VideosComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes) ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
