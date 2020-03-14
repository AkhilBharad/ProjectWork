import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IPO } from './models/ipos';
import { environment } from 'src/environments/environment';
@Injectable({
  providedIn: 'root'
})
export class IpoService {
  //httpUrl='http://localhost:8005/ipos/';
  httpUrl=environment.host + `initital-public-offering-service/ipos`;
  
  
  constructor(private httpClient: HttpClient,@Inject(HttpClient) private ht) { }
  getAllIPOS(): Observable<IPO[]> {
    return this.httpClient.get<IPO[]>(this.httpUrl);
  }
  saveIPO(ipo:IPO):Observable<IPO>{
    return this.ht.post(this.httpUrl , ipo);
  }
  deleteIPO(id:number):Observable<IPO>{
    return this.ht.delete(this.httpUrl+id);
    //return this.ht.delete(this.httpUrl+id);
  }
  updateIPOInfo(ipo :IPO):Observable<IPO>{
    return this.ht.put(environment.host + `initital-public-offering-service/ipos/` , ipo);
  }
  getIPOById(id :number):Observable<IPO>{
    return this.ht.get(environment.host + `initital-public-offering-service/ipos/${id}`);
  }
}