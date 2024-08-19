package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Parachute-light`: ImageVector
    get() {
        if (`_parachute-light` != null) {
            return `_parachute-light`!!
        }
        `_parachute-light` = Builder(name = "Parachute-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 120.0f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, false, -204.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.27f, 4.69f)
                lineToRelative(0.13f, 0.11f)
                lineTo(122.0f, 195.0f)
                verticalLineToRelative(23.0f)
                lineTo(112.0f, 218.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(134.0f, 218.0f)
                lineTo(134.0f, 195.0f)
                lineToRelative(93.6f, -70.2f)
                horizontalLineToRelative(0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 230.0f, 120.0f)
                close()
                moveTo(217.8f, 114.0f)
                lineTo(173.9f, 114.0f)
                curveToRelative(-1.3f, -42.92f, -16.5f, -68.62f, -28.43f, -82.3f)
                arcTo(90.2f, 90.2f, 0.0f, false, true, 217.8f, 114.0f)
                close()
                moveTo(128.0f, 31.43f)
                arcTo(77.14f, 77.14f, 0.0f, false, true, 143.42f, 49.0f)
                curveTo(157.26f, 70.08f, 161.24f, 95.0f, 161.89f, 114.0f)
                lineTo(94.11f, 114.0f)
                curveToRelative(1.06f, -31.88f, 10.49f, -52.86f, 18.47f, -65.0f)
                arcTo(76.69f, 76.69f, 0.0f, false, true, 128.0f, 31.43f)
                close()
                moveTo(157.8f, 126.0f)
                lineTo(128.0f, 179.65f)
                lineTo(98.2f, 126.0f)
                close()
                moveTo(84.47f, 126.0f)
                lineTo(109.09f, 170.32f)
                lineTo(50.0f, 126.0f)
                close()
                moveTo(171.53f, 126.0f)
                lineTo(206.0f, 126.0f)
                lineToRelative(-59.09f, 44.32f)
                close()
                moveTo(110.53f, 31.7f)
                curveTo(98.6f, 45.38f, 83.4f, 71.08f, 82.1f, 114.0f)
                lineTo(38.2f, 114.0f)
                arcTo(90.2f, 90.2f, 0.0f, false, true, 110.53f, 31.7f)
                close()
            }
        }
        .build()
        return `_parachute-light`!!
    }

private var `_parachute-light`: ImageVector? = null
