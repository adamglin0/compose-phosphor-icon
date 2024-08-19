package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Parachute-thin`: ImageVector
    get() {
        if (`_parachute-thin` != null) {
            return `_parachute-thin`!!
        }
        `_parachute-thin` = Builder(name = "Parachute-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 120.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, -200.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.3f, 2.94f)
                arcToRelative(2.81f, 2.81f, 0.0f, false, false, 0.3f, 0.26f)
                lineTo(124.0f, 194.0f)
                verticalLineToRelative(26.0f)
                lineTo(112.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(132.0f, 220.0f)
                lineTo(132.0f, 194.0f)
                lineToRelative(94.4f, -70.8f)
                horizontalLineToRelative(0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 228.0f, 120.0f)
                close()
                moveTo(219.91f, 116.0f)
                lineTo(172.0f, 116.0f)
                curveTo(171.0f, 67.38f, 152.13f, 40.86f, 140.0f, 28.79f)
                arcTo(92.14f, 92.14f, 0.0f, false, true, 219.91f, 116.0f)
                close()
                moveTo(128.0f, 28.89f)
                arcTo(76.67f, 76.67f, 0.0f, false, true, 145.0f, 47.64f)
                curveToRelative(8.36f, 12.69f, 18.27f, 34.71f, 19.0f, 68.36f)
                lineTo(92.05f, 116.0f)
                curveToRelative(0.73f, -33.65f, 10.64f, -55.67f, 19.0f, -68.36f)
                arcTo(76.47f, 76.47f, 0.0f, false, true, 128.0f, 28.89f)
                close()
                moveTo(161.2f, 124.0f)
                lineTo(128.0f, 183.76f)
                lineTo(94.8f, 124.0f)
                close()
                moveTo(85.65f, 124.0f)
                lineTo(115.39f, 177.54f)
                lineTo(44.0f, 124.0f)
                close()
                moveTo(170.35f, 124.0f)
                lineTo(212.0f, 124.0f)
                lineToRelative(-71.39f, 53.54f)
                close()
                moveTo(116.0f, 28.79f)
                curveTo(103.87f, 40.86f, 85.0f, 67.38f, 84.0f, 116.0f)
                lineTo(36.09f, 116.0f)
                arcTo(92.14f, 92.14f, 0.0f, false, true, 116.0f, 28.79f)
                close()
            }
        }
        .build()
        return `_parachute-thin`!!
    }

private var `_parachute-thin`: ImageVector? = null
