/***********************************************************************
 * Module:  开课计划.java
 * Author:  coco
 * Purpose: Defines the Class 开课计划
 ***********************************************************************/

import java.util.*;

/** @pdOid 79735083-064f-4f25-b28e-d74a73d9b53d */
public class 开课计划 {
   /** @pdOid f00a586c-712b-4704-85da-abc05cd2a1a6 */
   public java.lang.String 计划序号;
   /** @pdOid 79032a2b-7fb1-491a-971c-6a0a3e872266 */
   public java.lang.String 学期;
   /** @pdOid 0d49736a-549b-45a3-9e7d-ebde2f784c5e */
   public double 学时;
   /** @pdOid 2d21d429-0543-421d-9b4e-c37f7a06dd01 */
   public double 学分;
   /** @pdOid bf7160e7-cd32-4252-90e0-3edf93cfa2ee */
   public java.lang.String 课程性质;
   /** @pdOid 0e3e3a51-24ed-424c-8826-8fb221d3786c */
   public java.lang.String 教学方式;
   
   /** @pdRoleInfo migr=no name=课程 assc=课程开课计划 mult=1..1 side=A */
   public 课程 课程;
   /** @pdRoleInfo migr=no name=专业 assc=专业开课计划 mult=0..1 side=A */
   public 专业 专业;
   
   
   /** @pdGenerated default parent getter */
   public 课程 get课程() {
      return 课程;
   }
   
   /** @pdGenerated default parent setter
     * @param new课程 */
   public void set课程(课程 new课程) {
      if (this.课程 == null || !this.课程.equals(new课程))
      {
         if (this.课程 != null)
         {
            课程 old课程 = this.课程;
            this.课程 = null;
            old课程.remove开课计划(this);
         }
         if (new课程 != null)
         {
            this.课程 = new课程;
            this.课程.add开课计划(this);
         }
      }
   }

}