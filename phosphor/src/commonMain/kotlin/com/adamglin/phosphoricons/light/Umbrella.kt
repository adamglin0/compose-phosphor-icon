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

public val LightGroup.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 126.79f)
                arcTo(110.43f, 110.43f, 0.0f, false, false, 53.11f, 55.22f)
                arcToRelative(109.51f, 109.51f, 0.0f, false, false, -35.06f, 71.57f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 32.0f, 142.0f)
                horizontalLineToRelative(90.0f)
                verticalLineToRelative(58.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 60.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -36.0f, 0.0f)
                lineTo(134.0f, 142.0f)
                horizontalLineToRelative(90.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -15.21f)
                close()
                moveTo(94.11f, 130.0f)
                curveTo(95.8f, 78.79f, 118.81f, 49.84f, 128.0f, 40.27f)
                curveToRelative(9.2f, 9.58f, 32.2f, 38.53f, 33.89f, 89.73f)
                close()
                moveTo(30.54f, 129.35f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.53f, -1.56f)
                arcToRelative(98.14f, 98.14f, 0.0f, false, true, 82.91f, -88.62f)
                curveToRelative(-12.0f, 15.0f, -29.43f, 44.44f, -30.83f, 90.83f)
                lineTo(32.0f, 130.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 30.54f, 129.35f)
                close()
                moveTo(225.46f, 129.35f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 224.0f, 130.0f)
                lineTo(173.91f, 130.0f)
                curveToRelative(-1.4f, -46.39f, -18.81f, -75.87f, -30.83f, -90.83f)
                arcTo(98.14f, 98.14f, 0.0f, false, true, 226.0f, 127.79f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 225.46f, 129.35f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
