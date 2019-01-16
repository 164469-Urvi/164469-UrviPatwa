import { Component, OnInit } from '@angular/core';
import { $ } from 'jquery';
@Component({
  selector: 'app-videos',
  templateUrl: './videos.component.html',
  styleUrls: ['./videos.component.css']
})
export class VideosComponent implements OnInit {
 
  constructor() { }

  ngOnInit() {
    $('#modal1').on('hidden.bs.modal', function (e) {
      // do something...
      $('#modal1 iframe').attr("src", $("#modal1 iframe").attr("src"));
    });
    
    $('#modal6').on('hidden.bs.modal', function (e) {
      // do something...
      $('#modal6 iframe').attr("src", $("#modal6 iframe").attr("src"));
    });
    
    $('#modal4').on('hidden.bs.modal', function (e) {
      // do something...
      $('#modal4 iframe').attr("src", $("#modal4 iframe").attr("src"));
    });
  }

}
