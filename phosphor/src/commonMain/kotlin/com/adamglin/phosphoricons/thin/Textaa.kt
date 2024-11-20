package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.TextAa: ImageVector
    get() {
        if (_textAa != null) {
            return _textAa!!
        }
        _textAa = Builder(name = "TextAa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(83.62f, 54.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.24f, 0.0f)
                lineToRelative(-64.0f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.24f, 3.4f)
                lineTo(37.36f, 156.0f)
                horizontalLineToRelative(85.28f)
                lineToRelative(17.74f, 37.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.24f, -3.4f)
                close()
                moveTo(41.13f, 148.0f)
                lineTo(80.0f, 65.39f)
                lineTo(118.87f, 148.0f)
                close()
                moveTo(200.0f, 100.0f)
                curveToRelative(-11.67f, 0.0f, -20.69f, 3.08f, -26.82f, 9.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.64f, 5.68f)
                curveToRelative(4.57f, -4.54f, 11.7f, -6.84f, 21.18f, -6.84f)
                curveToRelative(15.44f, 0.0f, 28.0f, 10.77f, 28.0f, 24.0f)
                verticalLineToRelative(11.92f)
                arcTo(37.78f, 37.78f, 0.0f, false, false, 200.0f, 132.0f)
                curveToRelative(-19.85f, 0.0f, -36.0f, 14.35f, -36.0f, 32.0f)
                reflectiveCurveToRelative(16.15f, 32.0f, 36.0f, 32.0f)
                arcToRelative(37.78f, 37.78f, 0.0f, false, false, 28.0f, -11.92f)
                lineTo(228.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(236.0f, 132.0f)
                curveTo(236.0f, 114.36f, 219.85f, 100.0f, 200.0f, 100.0f)
                close()
                moveTo(200.0f, 188.0f)
                curveToRelative(-15.44f, 0.0f, -28.0f, -10.77f, -28.0f, -24.0f)
                reflectiveCurveToRelative(12.56f, -24.0f, 28.0f, -24.0f)
                reflectiveCurveToRelative(28.0f, 10.77f, 28.0f, 24.0f)
                reflectiveCurveTo(215.44f, 188.0f, 200.0f, 188.0f)
                close()
            }
        }
        .build()
        return _textAa!!
    }

private var _textAa: ImageVector? = null
