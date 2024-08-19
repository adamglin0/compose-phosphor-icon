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

public val BoldGroup.Footprints: ImageVector
    get() {
        if (_footprints != null) {
            return _footprints!!
        }
        _footprints = Builder(name = "Footprints", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 180.0f)
                lineTo(156.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 80.0f, 0.0f)
                lineTo(224.0f, 192.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 212.0f, 180.0f)
                close()
                moveTo(184.0f, 220.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 184.0f, 220.0f)
                close()
                moveTo(100.0f, 156.0f)
                lineTo(44.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 80.0f, 0.0f)
                lineTo(112.0f, 168.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 156.0f)
                close()
                moveTo(72.0f, 196.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(88.0f, 180.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 72.0f, 196.0f)
                close()
                moveTo(72.0f, 12.0f)
                curveToRelative(-14.06f, 0.0f, -27.7f, 12.33f, -37.41f, 33.83f)
                curveToRelative(-12.45f, 27.57f, -16.78f, 67.52f, 3.14f, 90.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.0f, 4.06f)
                lineTo(97.25f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.0f, -4.06f)
                curveToRelative(19.92f, -22.59f, 15.59f, -62.54f, 3.14f, -90.11f)
                curveTo(99.68f, 24.33f, 86.0f, 12.0f, 72.0f, 12.0f)
                close()
                moveTo(91.07f, 116.0f)
                lineTo(52.9f, 116.0f)
                curveToRelative(-6.71f, -12.13f, -7.67f, -35.45f, 3.56f, -60.3f)
                curveTo(63.16f, 40.85f, 70.28f, 36.0f, 72.0f, 36.0f)
                reflectiveCurveToRelative(8.82f, 4.85f, 15.53f, 19.7f)
                curveTo(98.73f, 80.55f, 97.77f, 103.87f, 91.07f, 116.0f)
                close()
                moveTo(158.75f, 164.0f)
                horizontalLineToRelative(50.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.0f, -4.06f)
                curveToRelative(19.92f, -22.59f, 15.59f, -62.54f, 3.14f, -90.11f)
                curveTo(211.72f, 48.33f, 198.08f, 36.0f, 184.0f, 36.0f)
                reflectiveCurveToRelative(-27.7f, 12.33f, -37.41f, 33.83f)
                curveToRelative(-12.45f, 27.57f, -16.78f, 67.52f, 3.14f, 90.11f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 158.75f, 164.0f)
                close()
                moveTo(168.49f, 79.7f)
                curveTo(175.2f, 64.85f, 182.32f, 60.0f, 184.0f, 60.0f)
                reflectiveCurveToRelative(8.82f, 4.85f, 15.52f, 19.7f)
                curveToRelative(11.23f, 24.85f, 10.27f, 48.17f, 3.56f, 60.3f)
                lineTo(164.93f, 140.0f)
                curveTo(158.23f, 127.87f, 157.27f, 104.55f, 168.49f, 79.7f)
                close()
            }
        }
        .build()
        return _footprints!!
    }

private var _footprints: ImageVector? = null
