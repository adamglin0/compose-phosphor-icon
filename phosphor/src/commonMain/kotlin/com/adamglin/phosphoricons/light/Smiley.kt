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

public val LightGroup.Smiley: ImageVector
    get() {
        if (_smiley != null) {
            return _smiley!!
        }
        _smiley = Builder(name = "Smiley", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(173.19f, 155.0f)
                curveToRelative(-9.92f, 17.16f, -26.39f, 27.0f, -45.19f, 27.0f)
                reflectiveCurveToRelative(-35.27f, -9.84f, -45.19f, -27.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.38f, -6.0f)
                curveToRelative(7.84f, 13.54f, 20.2f, 21.0f, 34.81f, 21.0f)
                reflectiveCurveToRelative(27.0f, -7.46f, 34.81f, -21.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 10.38f, 6.0f)
                close()
                moveTo(230.0f, 128.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, true, 128.0f, 26.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, true, 230.0f, 128.0f)
                close()
                moveTo(218.0f, 128.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, false, -90.0f, 90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, false, 218.0f, 128.0f)
                close()
                moveTo(92.0f, 118.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 92.0f, 118.0f)
                close()
                moveTo(164.0f, 98.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 164.0f, 98.0f)
                close()
            }
        }
        .build()
        return _smiley!!
    }

private var _smiley: ImageVector? = null
