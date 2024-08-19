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

public val LightGroup.`Disco-ball-light`: ImageVector
    get() {
        if (`_disco-ball-light` != null) {
            return `_disco-ball-light`!!
        }
        `_disco-ball-light` = Builder(name = "Disco-ball-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(118.0f, 66.23f)
                lineTo(118.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(106.0f, 66.23f)
                arcToRelative(86.0f, 86.0f, 0.0f, true, false, 12.0f, 0.0f)
                close()
                moveTo(185.74f, 146.0f)
                lineTo(149.87f, 146.0f)
                curveToRelative(-1.3f, -32.59f, -13.0f, -54.15f, -22.36f, -66.35f)
                arcTo(74.15f, 74.15f, 0.0f, false, true, 185.74f, 146.0f)
                close()
                moveTo(86.14f, 158.0f)
                horizontalLineToRelative(51.72f)
                curveToRelative(-1.63f, 37.69f, -18.33f, 58.46f, -25.86f, 66.0f)
                curveTo(104.46f, 216.45f, 87.77f, 195.67f, 86.14f, 158.0f)
                close()
                moveTo(86.14f, 146.0f)
                curveToRelative(1.63f, -37.69f, 18.33f, -58.46f, 25.86f, -66.0f)
                curveToRelative(7.54f, 7.51f, 24.23f, 28.29f, 25.86f, 66.0f)
                close()
                moveTo(96.49f, 79.65f)
                curveTo(87.11f, 91.85f, 75.43f, 113.41f, 74.13f, 146.0f)
                lineTo(38.26f, 146.0f)
                arcTo(74.15f, 74.15f, 0.0f, false, true, 96.49f, 79.65f)
                close()
                moveTo(38.26f, 158.0f)
                lineTo(74.13f, 158.0f)
                curveToRelative(1.3f, 32.59f, 13.0f, 54.15f, 22.36f, 66.35f)
                arcTo(74.15f, 74.15f, 0.0f, false, true, 38.26f, 158.0f)
                close()
                moveTo(127.51f, 224.35f)
                curveToRelative(9.38f, -12.2f, 21.06f, -33.76f, 22.36f, -66.35f)
                horizontalLineToRelative(35.87f)
                arcTo(74.15f, 74.15f, 0.0f, false, true, 127.51f, 224.35f)
                close()
                moveTo(254.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(238.0f, 94.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(226.0f, 94.0f)
                lineTo(216.0f, 94.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(10.0f)
                lineTo(226.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(238.0f, 82.0f)
                horizontalLineToRelative(10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 254.0f, 88.0f)
                close()
                moveTo(208.0f, 46.0f)
                lineTo(190.0f, 46.0f)
                lineTo(190.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(178.0f, 46.0f)
                lineTo(160.0f, 46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(18.0f)
                lineTo(178.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(190.0f, 34.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
            }
        }
        .build()
        return `_disco-ball-light`!!
    }

private var `_disco-ball-light`: ImageVector? = null
