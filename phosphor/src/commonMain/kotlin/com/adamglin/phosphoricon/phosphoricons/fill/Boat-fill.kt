package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Boat-fill`: ImageVector
    get() {
        if (`_boat-fill` != null) {
            return `_boat-fill`!!
        }
        `_boat-fill` = Builder(name = "Boat-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.06f, 110.59f)
                lineTo(208.0f, 106.23f)
                lineTo(208.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(136.0f, 40.0f)
                lineTo(136.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 40.0f)
                lineTo(64.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 56.0f)
                verticalLineToRelative(50.23f)
                lineToRelative(-13.06f, 4.36f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 125.77f)
                lineTo(24.0f, 152.0f)
                curveToRelative(0.0f, 61.54f, 97.89f, 86.72f, 102.06f, 87.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.88f, 0.0f)
                curveTo(134.11f, 238.72f, 232.0f, 213.54f, 232.0f, 152.0f)
                lineTo(232.0f, 125.77f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 221.06f, 110.59f)
                close()
                moveTo(136.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 104.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(192.0f, 100.9f)
                lineTo(130.53f, 80.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.06f, 0.0f)
                lineTo(64.0f, 100.9f)
                lineTo(64.0f, 56.0f)
                lineTo(192.0f, 56.0f)
                close()
            }
        }
        .build()
        return `_boat-fill`!!
    }

private var `_boat-fill`: ImageVector? = null
