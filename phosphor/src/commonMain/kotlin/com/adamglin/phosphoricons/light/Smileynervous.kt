package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.SmileyNervous: ImageVector
    get() {
        if (_smileyNervous != null) {
            return _smileyNervous!!
        }
        _smileyNervous = Builder(name = "SmileyNervous", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(82.0f, 108.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 82.0f, 108.0f)
                close()
                moveTo(154.0f, 108.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 154.0f, 108.0f)
                close()
                moveTo(182.0f, 168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                curveToRelative(-9.0f, 0.0f, -13.51f, -6.0f, -16.8f, -10.4f)
                curveToRelative(-3.0f, -4.06f, -4.46f, -5.6f, -7.2f, -5.6f)
                reflectiveCurveToRelative(-4.15f, 1.54f, -7.2f, 5.6f)
                curveTo(141.51f, 168.0f, 137.0f, 174.0f, 128.0f, 174.0f)
                reflectiveCurveToRelative(-13.51f, -6.0f, -16.8f, -10.4f)
                curveToRelative(-3.0f, -4.06f, -4.46f, -5.6f, -7.2f, -5.6f)
                reflectiveCurveToRelative(-4.15f, 1.54f, -7.2f, 5.6f)
                curveTo(93.51f, 168.0f, 89.0f, 174.0f, 80.0f, 174.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                curveToRelative(2.74f, 0.0f, 4.15f, -1.54f, 7.2f, -5.6f)
                curveTo(90.49f, 152.0f, 95.0f, 146.0f, 104.0f, 146.0f)
                reflectiveCurveToRelative(13.51f, 6.0f, 16.8f, 10.4f)
                curveToRelative(3.0f, 4.06f, 4.46f, 5.6f, 7.2f, 5.6f)
                reflectiveCurveToRelative(4.15f, -1.54f, 7.2f, -5.6f)
                curveTo(138.49f, 152.0f, 143.0f, 146.0f, 152.0f, 146.0f)
                reflectiveCurveToRelative(13.51f, 6.0f, 16.8f, 10.4f)
                curveToRelative(3.0f, 4.06f, 4.46f, 5.6f, 7.2f, 5.6f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 182.0f, 168.0f)
                close()
            }
        }
        .build()
        return _smileyNervous!!
    }

private var _smileyNervous: ImageVector? = null
