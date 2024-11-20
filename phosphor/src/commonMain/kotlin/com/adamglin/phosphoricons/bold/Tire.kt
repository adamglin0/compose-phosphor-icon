package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Tire: ImageVector
    get() {
        if (_tire != null) {
            return _tire!!
        }
        _tire = Builder(name = "Tire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 128.0f)
                curveToRelative(0.0f, -22.09f, 7.16f, -40.0f, 16.0f, -40.0f)
                reflectiveCurveToRelative(16.0f, 17.91f, 16.0f, 40.0f)
                reflectiveCurveToRelative(-7.16f, 40.0f, -16.0f, 40.0f)
                reflectiveCurveTo(152.0f, 150.09f, 152.0f, 128.0f)
                close()
                moveTo(244.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(92.0f, 236.0f)
                curveToRelative(-18.5f, 0.0f, -35.3f, -12.22f, -47.32f, -34.4f)
                curveTo(33.92f, 181.74f, 28.0f, 155.6f, 28.0f, 128.0f)
                reflectiveCurveToRelative(5.92f, -53.74f, 16.68f, -73.6f)
                curveTo(56.7f, 32.22f, 73.5f, 20.0f, 92.0f, 20.0f)
                horizontalLineToRelative(72.0f)
                curveToRelative(18.5f, 0.0f, 35.3f, 12.22f, 47.32f, 34.4f)
                curveTo(222.08f, 74.26f, 228.0f, 100.4f, 228.0f, 128.0f)
                reflectiveCurveToRelative(-5.92f, 53.74f, -16.68f, 73.6f)
                arcToRelative(95.07f, 95.07f, 0.0f, false, true, -6.51f, 10.4f)
                lineTo(232.0f, 212.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 244.0f, 224.0f)
                close()
                moveTo(164.0f, 44.0f)
                curveToRelative(-18.92f, 0.0f, -40.0f, 34.5f, -40.0f, 84.0f)
                reflectiveCurveToRelative(21.08f, 84.0f, 40.0f, 84.0f)
                reflectiveCurveToRelative(40.0f, -34.5f, 40.0f, -84.0f)
                reflectiveCurveTo(182.92f, 44.0f, 164.0f, 44.0f)
                close()
                moveTo(54.33f, 155.59f)
                lineTo(73.0f, 142.24f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.94f, 0.0f)
                lineToRelative(14.66f, 10.46f)
                arcTo(186.77f, 186.77f, 0.0f, false, true, 100.0f, 128.0f)
                curveToRelative(0.0f, -3.61f, 0.11f, -7.2f, 0.31f, -10.75f)
                lineTo(80.0f, 102.75f)
                lineTo(52.09f, 122.68f)
                curveTo(52.0f, 124.44f, 52.0f, 126.21f, 52.0f, 128.0f)
                arcTo(160.1f, 160.1f, 0.0f, false, false, 54.33f, 155.59f)
                close()
                moveTo(56.54f, 90.0f)
                lineTo(73.0f, 78.24f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.94f, 0.0f)
                lineToRelative(16.91f, 12.07f)
                arcToRelative(134.79f, 134.79f, 0.0f, false, true, 12.8f, -35.91f)
                arcTo(95.07f, 95.07f, 0.0f, false, true, 123.19f, 44.0f)
                lineTo(92.0f, 44.0f)
                curveTo(78.44f, 44.0f, 63.77f, 61.73f, 56.54f, 90.0f)
                close()
                moveTo(92.0f, 212.0f)
                horizontalLineToRelative(31.19f)
                arcToRelative(95.07f, 95.07f, 0.0f, false, true, -6.51f, -10.4f)
                arcToRelative(115.79f, 115.79f, 0.0f, false, true, -6.0f, -12.91f)
                lineTo(80.0f, 166.75f)
                lineTo(61.14f, 180.22f)
                curveTo(69.0f, 200.08f, 80.88f, 212.0f, 92.0f, 212.0f)
                close()
            }
        }
        .build()
        return _tire!!
    }

private var _tire: ImageVector? = null
