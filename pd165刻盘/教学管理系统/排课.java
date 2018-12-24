/***********************************************************************
 * Module:  排课.java
 * Author:  coco
 * Purpose: Defines the Class 排课
 ***********************************************************************/

import java.util.*;

/** @pdOid 0ebb1e41-110d-4e82-b43a-2dfa7f4679a8 */
public class 排课 {
   /** @pdOid 266c6932-ad91-4947-9214-a97103ad0383 */
   public java.lang.String 上课时间;
   
   /** @pdRoleInfo migr=no name=教师 assc=教师排课 mult=1..1 side=A */
   public 教师 教师;
   /** @pdRoleInfo migr=no name=课程 assc=课程排课 mult=1..1 side=A */
   public 课程 课程;
   /** @pdRoleInfo migr=no name=教室 assc=教室排课 mult=1..1 side=A */
   public 教室 教室;
   
   
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
            old教师.remove排课(this);
         }
         if (new教师 != null)
         {
            this.教师 = new教师;
            this.教师.add排课(this);
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
            old课程.remove排课(this);
         }
         if (new课程 != null)
         {
            this.课程 = new课程;
            this.课程.add排课(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 教室 get教室() {
      return 教室;
   }
   
   /** @pdGenerated default parent setter
     * @param new教室 */
   public void set教室(教室 new教室) {
      if (this.教室 == null || !this.教室.equals(new教室))
      {
         if (this.教室 != null)
         {
            教室 old教室 = this.教室;
            this.教室 = null;
            old教室.remove排课(this);
         }
         if (new教室 != null)
         {
            this.教室 = new教室;
            this.教室.add排课(this);
         }
      }
   }

}