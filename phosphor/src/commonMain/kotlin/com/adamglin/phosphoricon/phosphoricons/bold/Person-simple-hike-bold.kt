package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Person-simple-hike-bold`: ImageVector
    get() {
        if (`_person-simple-hike-bold` != null) {
            return `_person-simple-hike-bold`!!
        }
        `_person-simple-hike-bold` = Builder(name = "Person-simple-hike-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 84.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 152.0f, 84.0f)
                close()
                moveTo(152.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 36.0f)
                close()
                moveTo(204.0f, 144.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(180.0f, 155.24f)
                curveToRelative(-24.92f, -3.37f, -33.94f, -17.29f, -41.38f, -28.76f)
                curveToRelative(-1.55f, -2.39f, -3.05f, -4.71f, -4.67f, -6.88f)
                lineToRelative(-9.54f, 22.0f)
                lineTo(159.0f, 166.23f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.0f, 9.77f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(140.0f, 182.17f)
                lineToRelative(-25.37f, -18.12f)
                lineTo(83.0f, 236.78f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -22.0f, -9.57f)
                lineTo(118.52f, 94.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 135.0f, 89.0f)
                arcToRelative(45.53f, 45.53f, 0.0f, false, true, 8.84f, 6.0f)
                curveToRelative(6.78f, 5.89f, 11.09f, 12.53f, 14.89f, 18.39f)
                curveTo(166.27f, 125.0f, 170.8f, 132.0f, 192.0f, 132.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 204.0f, 144.0f)
                close()
                moveTo(64.6f, 153.88f)
                lineTo(39.27f, 143.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 33.0f, 127.27f)
                lineToRelative(24.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.73f, 65.0f)
                lineTo(98.34f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 88.89f, 98.0f)
                lineTo(74.3f, 91.76f)
                lineTo(59.76f, 125.7f)
                lineToRelative(14.29f, 6.12f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -9.45f, 22.06f)
                close()
            }
        }
        .build()
        return `_person-simple-hike-bold`!!
    }

private var `_person-simple-hike-bold`: ImageVector? = null
