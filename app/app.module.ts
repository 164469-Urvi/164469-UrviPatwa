import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import {MatCardModule} from '@angular/material/card';
import { HttpClientModule } from '@angular/common/http';
import { ChartsModule } from 'ng2-charts';

import { AppComponent } from './app.component';
import { PlayerDetailsComponent } from './player-details/player-details.component';
import { UpcomingMatchesComponent } from './upcoming-matches/upcoming-matches.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { NewsComponent } from './news/news.component';
import { FooterComponent } from './footer/footer.component';
import { VideosComponent } from './videos/videos.component';


@NgModule({
  declarations: [
    AppComponent,
    PlayerDetailsComponent,
    UpcomingMatchesComponent,
    AboutUsComponent,
    HomeComponent,
    HeaderComponent,
    NewsComponent,
    FooterComponent,
    VideosComponent,
    
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatCardModule,
    HttpClientModule,
    ChartsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
