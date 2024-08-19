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

public val LightGroup.Pepper: ImageVector
    get() {
        if (_pepper != null) {
            return _pepper!!
        }
        _pepper = Builder(name = "Pepper", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(165.57f, 42.26f)
                arcTo(38.07f, 38.07f, 0.0f, false, false, 128.0f, 10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 25.38f, 20.35f)
                arcTo(62.08f, 62.08f, 0.0f, false, false, 98.0f, 104.0f)
                curveToRelative(0.0f, 47.75f, -26.23f, 79.68f, -78.0f, 94.93f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 1.56f, 27.24f)
                arcTo(262.5f, 262.5f, 0.0f, false, false, 66.81f, 230.0f)
                curveToRelative(40.36f, 0.0f, 85.23f, -9.0f, 116.19f, -35.0f)
                curveToRelative(25.88f, -21.71f, 39.0f, -52.33f, 39.0f, -91.0f)
                arcTo(62.06f, 62.06f, 0.0f, false, false, 165.57f, 42.26f)
                close()
                moveTo(160.0f, 54.0f)
                arcToRelative(50.09f, 50.09f, 0.0f, false, true, 47.82f, 35.38f)
                lineTo(192.0f, 97.28f)
                lineTo(162.68f, 82.62f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f)
                lineTo(128.0f, 97.28f)
                lineToRelative(-15.81f, -7.91f)
                arcTo(50.07f, 50.07f, 0.0f, false, true, 160.0f, 54.0f)
                close()
                moveTo(175.28f, 185.82f)
                curveTo(150.15f, 206.89f, 95.36f, 227.0f, 23.67f, 214.33f)
                arcTo(1.88f, 1.88f, 0.0f, false, true, 22.0f, 212.44f)
                arcToRelative(1.81f, 1.81f, 0.0f, false, true, 1.43f, -2.0f)
                curveTo(80.06f, 193.73f, 110.0f, 156.92f, 110.0f, 104.0f)
                curveToRelative(0.0f, -0.76f, 0.0f, -1.51f, 0.06f, -2.26f)
                lineToRelative(15.26f, 7.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 0.0f)
                lineTo(160.0f, 94.69f)
                lineToRelative(29.32f, 14.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 0.0f)
                lineToRelative(15.26f, -7.63f)
                curveToRelative(0.0f, 0.75f, 0.06f, 1.5f, 0.06f, 2.26f)
                curveTo(210.0f, 139.0f, 198.32f, 166.49f, 175.28f, 185.81f)
                close()
            }
        }
        .build()
        return _pepper!!
    }

private var _pepper: ImageVector? = null
