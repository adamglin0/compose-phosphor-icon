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

public val LightGroup.AmazonLogo: ImageVector
    get() {
        if (_amazonLogo != null) {
            return _amazonLogo!!
        }
        _amazonLogo = Builder(name = "AmazonLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 168.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(182.48f)
                lineToRelative(-5.66f, 5.66f)
                curveTo(225.6f, 191.15f, 188.86f, 230.0f, 128.0f, 230.0f)
                curveToRelative(-62.0f, 0.0f, -98.92f, -40.27f, -100.46f, -42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.92f, -8.0f)
                curveToRelative(0.34f, 0.37f, 35.09f, 38.0f, 91.54f, 38.0f)
                reflectiveCurveToRelative(91.2f, -37.64f, 91.55f, -38.0f)
                lineToRelative(0.21f, -0.22f)
                lineToRelative(5.76f, -5.76f)
                horizontalLineTo(208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 168.0f)
                close()
                moveTo(162.0f, 99.56f)
                verticalLineTo(84.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 90.14f, 66.73f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.68f, -5.46f)
                arcTo(50.0f, 50.0f, 0.0f, false, true, 174.0f, 84.0f)
                verticalLineToRelative(92.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(164.44f)
                arcToRelative(50.0f, 50.0f, 0.0f, true, true, 0.0f, -64.88f)
                close()
                moveTo(162.0f, 132.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, -38.0f, 38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 162.0f, 132.0f)
                close()
            }
        }
        .build()
        return _amazonLogo!!
    }

private var _amazonLogo: ImageVector? = null
