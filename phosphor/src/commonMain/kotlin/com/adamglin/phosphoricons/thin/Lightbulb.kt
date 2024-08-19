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

public val ThinGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(88.0f, 236.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 232.0f)
                close()
                moveTo(212.0f, 104.0f)
                arcToRelative(83.59f, 83.59f, 0.0f, false, true, -32.11f, 66.06f)
                arcTo(20.2f, 20.2f, 0.0f, false, false, 172.0f, 186.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(96.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -7.76f, -15.81f)
                arcTo(83.58f, 83.58f, 0.0f, false, true, 44.0f, 104.47f)
                curveTo(43.75f, 59.0f, 80.52f, 21.09f, 126.0f, 20.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 86.0f, 84.0f)
                close()
                moveTo(204.0f, 104.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -77.83f, -76.0f)
                curveTo(85.0f, 29.0f, 51.77f, 63.27f, 52.0f, 104.43f)
                arcToRelative(75.62f, 75.62f, 0.0f, false, false, 29.17f, 59.43f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 92.0f, 186.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(28.14f, 28.14f, 0.0f, false, true, 10.94f, -22.2f)
                arcTo(75.62f, 75.62f, 0.0f, false, false, 204.0f, 104.0f)
                close()
                moveTo(136.66f, 52.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.32f, 7.88f)
                curveTo(153.53f, 63.0f, 169.0f, 78.45f, 172.06f, 96.67f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 176.0f, 100.0f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, false, 0.67f, -0.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.27f, -4.61f)
                arcTo(53.51f, 53.51f, 0.0f, false, false, 136.66f, 52.06f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
