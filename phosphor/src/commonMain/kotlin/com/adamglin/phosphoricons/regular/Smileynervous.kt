package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.SmileyNervous: ImageVector
    get() {
        if (_smileyNervous != null) {
            return _smileyNervous!!
        }
        _smileyNervous = Builder(name = "SmileyNervous", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(80.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 108.0f)
                close()
                moveTo(152.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 108.0f)
                close()
                moveTo(184.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                curveToRelative(-10.0f, 0.0f, -15.06f, -6.74f, -18.4f, -11.2f)
                curveToRelative(-3.0f, -4.0f, -3.92f, -4.8f, -5.6f, -4.8f)
                reflectiveCurveToRelative(-2.57f, 0.76f, -5.6f, 4.8f)
                curveTo(143.06f, 169.26f, 138.0f, 176.0f, 128.0f, 176.0f)
                reflectiveCurveToRelative(-15.06f, -6.74f, -18.4f, -11.2f)
                curveToRelative(-3.0f, -4.0f, -3.92f, -4.8f, -5.6f, -4.8f)
                reflectiveCurveToRelative(-2.57f, 0.76f, -5.6f, 4.8f)
                curveTo(95.06f, 169.26f, 90.0f, 176.0f, 80.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                curveToRelative(1.68f, 0.0f, 2.57f, -0.76f, 5.6f, -4.8f)
                curveTo(88.94f, 150.74f, 94.0f, 144.0f, 104.0f, 144.0f)
                reflectiveCurveToRelative(15.06f, 6.74f, 18.4f, 11.2f)
                curveToRelative(3.0f, 4.0f, 3.92f, 4.8f, 5.6f, 4.8f)
                reflectiveCurveToRelative(2.57f, -0.76f, 5.6f, -4.8f)
                curveToRelative(3.34f, -4.46f, 8.4f, -11.2f, 18.4f, -11.2f)
                reflectiveCurveToRelative(15.06f, 6.74f, 18.4f, 11.2f)
                curveToRelative(3.0f, 4.0f, 3.92f, 4.8f, 5.6f, 4.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 168.0f)
                close()
            }
        }
        .build()
        return _smileyNervous!!
    }

private var _smileyNervous: ImageVector? = null
