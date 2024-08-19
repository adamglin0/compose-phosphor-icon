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

public val BoldGroup.`Angular-logo-bold`: ImageVector
    get() {
        if (`_angular-logo-bold` != null) {
            return `_angular-logo-bold`!!
        }
        `_angular-logo-bold` = Builder(name = "Angular-logo-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.61f, 60.92f)
                lineToRelative(-96.0f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.24f, 0.0f)
                lineToRelative(-96.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.28f, 12.67f)
                lineToRelative(16.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.52f, 9.14f)
                lineToRelative(80.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.74f, 0.0f)
                lineToRelative(80.0f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.52f, -9.14f)
                lineToRelative(16.0f, -120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 228.61f, 60.92f)
                close()
                moveTo(197.0f, 184.11f)
                lineTo(128.0f, 218.58f)
                lineTo(59.05f, 184.11f)
                lineTo(45.11f, 79.54f)
                lineTo(128.0f, 45.0f)
                lineToRelative(82.89f, 34.54f)
                close()
                moveTo(117.51f, 82.17f)
                lineToRelative(-40.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.0f, 11.66f)
                lineTo(106.17f, 152.0f)
                horizontalLineToRelative(43.66f)
                lineToRelative(7.68f, 13.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.0f, -11.66f)
                lineToRelative(-40.0f, -72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.0f, 0.0f)
                close()
                moveTo(119.51f, 128.0f)
                lineTo(128.0f, 112.71f)
                lineTo(136.49f, 128.0f)
                close()
            }
        }
        .build()
        return `_angular-logo-bold`!!
    }

private var `_angular-logo-bold`: ImageVector? = null
