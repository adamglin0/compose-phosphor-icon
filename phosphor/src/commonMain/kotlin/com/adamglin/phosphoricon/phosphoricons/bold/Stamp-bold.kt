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

public val BoldGroup.`Stamp-bold`: ImageVector
    get() {
        if (`_stamp-bold` != null) {
            return `_stamp-bold`!!
        }
        `_stamp-bold` = Builder(name = "Stamp-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(40.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(216.0f, 212.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 224.0f)
                close()
                moveTo(228.0f, 144.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(48.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(28.0f, 144.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f)
                lineTo(96.0f, 124.0f)
                lineTo(83.55f, 54.33f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 119.0f, 12.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 35.44f, 42.33f)
                lineTo(160.0f, 124.0f)
                horizontalLineToRelative(48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 228.0f, 144.0f)
                close()
                moveTo(107.17f, 50.11f)
                lineTo(120.37f, 124.0f)
                horizontalLineToRelative(15.26f)
                lineToRelative(13.2f, -73.89f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 137.0f, 36.0f)
                lineTo(119.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.82f, 14.11f)
                close()
                moveTo(204.0f, 148.0f)
                lineTo(52.0f, 148.0f)
                verticalLineToRelative(24.0f)
                lineTo(204.0f, 172.0f)
                close()
            }
        }
        .build()
        return `_stamp-bold`!!
    }

private var `_stamp-bold`: ImageVector? = null
