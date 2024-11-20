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

public val BoldGroup.TextAa: ImageVector
    get() {
        if (_textAa != null) {
            return _textAa!!
        }
        _textAa = Builder(name = "TextAa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(90.86f, 50.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.72f, 0.0f)
                lineToRelative(-64.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 21.71f, 10.22f)
                lineTo(42.44f, 164.0f)
                horizontalLineToRelative(75.12f)
                lineToRelative(15.58f, 33.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 21.72f, -10.22f)
                close()
                moveTo(53.74f, 140.0f)
                lineTo(80.0f, 84.18f)
                lineTo(106.27f, 140.0f)
                close()
                moveTo(200.0f, 84.0f)
                curveToRelative(-13.85f, 0.0f, -24.77f, 3.86f, -32.45f, 11.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 16.9f, 17.0f)
                curveToRelative(3.0f, -3.0f, 8.26f, -4.52f, 15.55f, -4.52f)
                curveToRelative(11.0f, 0.0f, 20.0f, 7.18f, 20.0f, 16.0f)
                verticalLineToRelative(4.39f)
                arcTo(47.28f, 47.28f, 0.0f, false, false, 200.0f, 124.0f)
                curveToRelative(-24.26f, 0.0f, -44.0f, 17.94f, -44.0f, 40.0f)
                reflectiveCurveToRelative(19.74f, 40.0f, 44.0f, 40.0f)
                arcToRelative(47.18f, 47.18f, 0.0f, false, false, 22.0f, -5.38f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 244.0f, 192.0f)
                lineTo(244.0f, 124.0f)
                curveTo(244.0f, 101.94f, 224.26f, 84.0f, 200.0f, 84.0f)
                close()
                moveTo(200.0f, 180.0f)
                curveToRelative(-11.0f, 0.0f, -20.0f, -7.18f, -20.0f, -16.0f)
                reflectiveCurveToRelative(9.0f, -16.0f, 20.0f, -16.0f)
                reflectiveCurveToRelative(20.0f, 7.18f, 20.0f, 16.0f)
                reflectiveCurveTo(211.0f, 180.0f, 200.0f, 180.0f)
                close()
            }
        }
        .build()
        return _textAa!!
    }

private var _textAa: ImageVector? = null
