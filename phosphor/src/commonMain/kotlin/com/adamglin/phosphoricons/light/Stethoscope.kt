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

public val LightGroup.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) {
            return _stethoscope!!
        }
        _stethoscope = Builder(name = "Stethoscope", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.0f, 160.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 218.0f, 160.0f)
                close()
                moveTo(213.65f, 197.58f)
                arcTo(46.05f, 46.05f, 0.0f, false, true, 168.0f, 238.0f)
                lineTo(144.0f, 238.0f)
                arcToRelative(46.06f, 46.06f, 0.0f, false, true, -46.0f, -46.0f)
                lineTo(98.0f, 149.71f)
                arcTo(62.0f, 62.0f, 0.0f, false, true, 42.0f, 88.0f)
                lineTo(42.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(72.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(54.0f, 46.0f)
                lineTo(54.0f, 88.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, 50.0f, 50.0f)
                horizontalLineToRelative(0.67f)
                curveToRelative(27.2f, -0.36f, 49.33f, -23.16f, 49.33f, -50.83f)
                lineTo(154.0f, 46.0f)
                lineTo(136.0f, 46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                lineTo(166.0f, 87.17f)
                curveToRelative(0.0f, 32.43f, -24.68f, 59.44f, -56.0f, 62.52f)
                lineTo(110.0f, 192.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 34.0f, 34.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(34.05f, 34.05f, 0.0f, false, false, 33.56f, -28.56f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, 12.09f, 0.14f)
                close()
                moveTo(234.0f, 160.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 234.0f, 160.0f)
                close()
            }
        }
        .build()
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
