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

public val LightGroup.Tilde: ImageVector
    get() {
        if (_tilde != null) {
            return _tilde!!
        }
        _tilde = Builder(name = "Tilde", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.68f, 129.34f)
                curveToRelative(-14.17f, 17.62f, -28.06f, 26.92f, -42.46f, 28.44f)
                arcTo(40.75f, 40.75f, 0.0f, false, true, 174.0f, 158.0f)
                curveToRelative(-18.64f, 0.0f, -34.44f, -12.87f, -49.76f, -25.35f)
                reflectiveCurveTo(94.57f, 108.51f, 79.0f, 110.16f)
                curveToRelative(-11.06f, 1.16f, -22.3f, 9.0f, -34.36f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.36f, -7.52f)
                curveToRelative(14.17f, -17.61f, 28.06f, -26.92f, 42.46f, -28.43f)
                curveToRelative(20.52f, -2.18f, 37.54f, 11.7f, 54.0f, 25.12f)
                curveTo(147.0f, 135.76f, 161.42f, 147.48f, 177.0f, 145.84f)
                curveToRelative(11.06f, -1.16f, 22.3f, -9.0f, 34.36f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.36f, 7.52f)
                close()
            }
        }
        .build()
        return _tilde!!
    }

private var _tilde: ImageVector? = null
