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

public val RegularGroup.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) {
            return _phoneSlash!!
        }
        _phoneSlash = Builder(name = "PhoneSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.93f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.09f, 45.38f)
                lineTo(69.68f, 75.74f)
                arcToRelative(141.26f, 141.26f, 0.0f, false, false, -45.27f, 30.44f)
                curveToRelative(-20.0f, 20.0f, -21.92f, 49.46f, -4.69f, 71.67f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 18.38f, 5.07f)
                lineToRelative(49.0f, -17.37f)
                lineToRelative(0.29f, -0.11f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.75f, -11.72f)
                lineToRelative(5.9f, -29.51f)
                arcToRelative(75.89f, 75.89f, 0.0f, false, true, 8.56f, -2.4f)
                lineToRelative(90.51f, 99.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(97.63f, 109.14f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -10.32f, 11.94f)
                lineToRelative(-5.9f, 29.5f)
                lineToRelative(-48.78f, 17.3f)
                curveToRelative(-0.1f, 0.0f, -0.17f, 0.13f, -0.27f, 0.17f)
                curveToRelative(-12.33f, -15.9f, -11.0f, -36.22f, 3.36f, -50.56f)
                arcToRelative(125.79f, 125.79f, 0.0f, false, true, 45.47f, -29.1f)
                lineToRelative(18.3f, 20.14f)
                curveTo(98.87f, 108.73f, 98.25f, 108.92f, 97.63f, 109.14f)
                close()
                moveTo(236.28f, 177.85f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -18.38f, 5.07f)
                lineToRelative(-9.25f, -3.28f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 214.0f, 164.56f)
                lineToRelative(9.37f, 3.32f)
                lineToRelative(0.3f, 0.12f)
                curveToRelative(12.3f, -15.85f, 11.0f, -36.17f, -3.39f, -50.51f)
                curveToRelative(-25.66f, -25.66f, -61.88f, -39.27f, -99.35f, -37.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -0.83f, -16.0f)
                curveToRelative(42.0f, -2.19f, 82.63f, 13.1f, 111.49f, 42.0f)
                curveTo(251.58f, 126.17f, 253.51f, 155.64f, 236.28f, 177.85f)
                close()
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
