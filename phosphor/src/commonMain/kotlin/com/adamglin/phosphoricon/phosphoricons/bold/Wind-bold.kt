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

public val BoldGroup.`Wind-bold`: ImageVector
    get() {
        if (`_wind-bold` != null) {
            return `_wind-bold`!!
        }
        `_wind-bold` = Builder(name = "Wind-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                arcToRelative(15.07f, 15.07f, 0.0f, false, false, -10.26f, 4.45f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -16.9f)
                arcTo(39.34f, 39.34f, 0.0f, false, true, 120.0f, 32.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                close()
                moveTo(208.0f, 68.0f)
                arcToRelative(39.34f, 39.34f, 0.0f, false, false, -27.3f, 11.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 16.9f)
                arcTo(15.07f, 15.07f, 0.0f, false, true, 208.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(32.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(208.0f, 140.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -72.0f)
                close()
                moveTo(152.0f, 152.0f)
                lineTo(40.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(152.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                arcToRelative(15.11f, 15.11f, 0.0f, false, true, -10.27f, -4.45f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, 16.9f)
                arcTo(39.34f, 39.34f, 0.0f, false, false, 152.0f, 224.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -72.0f)
                close()
            }
        }
        .build()
        return `_wind-bold`!!
    }

private var `_wind-bold`: ImageVector? = null
