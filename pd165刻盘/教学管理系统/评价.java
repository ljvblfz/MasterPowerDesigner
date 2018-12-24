/***********************************************************************
 * Module:  评价.java
 * Author:  coco
 * Purpose: Defines the Class 评价
 ***********************************************************************/

import java.util.*;

/** @pdOid 505dc289-37ca-4845-a98b-326dc37018d1 */
public class 评价 {
   /** @pdOid 30f2dbd4-d7b8-4502-9683-ca32f39cf120 */
   public double 评教分数;
   /** @pdOid 7e186a1c-1ffa-4feb-a8cd-4d90373494cf */
   public double 评学分数;
   
   /** @pdRoleInfo migr=no name=教师 assc=教师评价 mult=1..1 side=A */
   public 教师 教师;
   /** @pdRoleInfo migr=no name=课程 assc=课程评价 mult=1..1 side=A */
   public 课程 课程;
   /** @pdRoleInfo migr=no name=班级 assc=班级评价 mult=1..1 side=A */
   public 班级 班级;
   
   
   /** @pdGenerated default parent getter */
   public 教师 get教师() {
      return 教师;
   }
   
   /** @pdGenerated default parent setter
     * @param new教师 */
   public void set教师(教师 new教师) {
      if (this.教师 == null || !this.教师.equals(new教师))
      {
         if (this.教师 != null)
         {
            教师 old教师 = this.教师;
            this.教师 = null;
            old教师.remove评价(this);
         }
         if (new教师 != null)
         {
            this.教师 = new教师;
            this.教师.add评价(this);
         }
      }
   }
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
            old课程.remove评价(this);
         }
         if (new课程 != null)
         {
            this.课程 = new课程;
            this.课程.add评价(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 班级 get班级() {
      return 班级;
   }
   
   /** @pdGenerated default parent setter
     * @param new班级 */
   public void set班级(班级 new班级) {
      if (this.班级 == null || !this.班级.equals(new班级))
      {
         if (this.班级 != null)
         {
            班级 old班级 = this.班级;
            this.班级 = null;
            old班级.remove评价(this);
         }
         if (new班级 != null)
         {
            this.班级 = new班级;
            this.班级.add评价(this);
         }
      }
   }

}