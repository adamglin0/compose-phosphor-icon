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

public val ThinGroup.`Rocket-thin`: ImageVector
    get() {
        if (`_rocket-thin` != null) {
            return `_rocket-thin`!!
        }
        `_rocket-thin` = Builder(name = "Rocket-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(112.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 148.0f, 224.0f)
                close()
                moveTo(128.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 108.0f)
                close()
                moveTo(219.72f, 155.0f)
                lineTo(207.35f, 210.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -7.72f, 8.71f)
                arcToRelative(12.17f, 12.17f, 0.0f, false, true, -4.0f, 0.69f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, true, -7.43f, -2.6f)
                lineTo(159.85f, 196.0f)
                lineTo(96.15f, 196.0f)
                lineTo(67.81f, 217.4f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, true, -7.43f, 2.6f)
                arcToRelative(12.17f, 12.17f, 0.0f, false, true, -4.0f, -0.69f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -7.72f, -8.71f)
                lineTo(36.28f, 155.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 2.5f, -10.28f)
                lineToRelative(29.35f, -35.23f)
                curveToRelative(3.3f, -53.33f, 41.83f, -86.68f, 52.52f, -94.94f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 14.7f, 0.0f)
                curveToRelative(10.69f, 8.26f, 49.22f, 41.61f, 52.52f, 94.94f)
                lineToRelative(29.35f, 35.23f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 219.72f, 155.0f)
                close()
                moveTo(97.11f, 188.0f)
                horizontalLineToRelative(61.78f)
                curveTo(214.07f, 92.49f, 145.0f, 32.05f, 130.46f, 20.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.92f, 0.0f)
                curveTo(111.0f, 32.05f, 41.93f, 92.49f, 97.11f, 188.0f)
                close()
                moveTo(89.59f, 190.93f)
                curveTo(75.12f, 165.56f, 68.93f, 142.52f, 68.0f, 122.06f)
                lineTo(44.92f, 149.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.83f, 3.43f)
                lineToRelative(12.36f, 55.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.41f, 2.26f)
                lineToRelative(0.09f, -0.07f)
                close()
                moveTo(211.08f, 149.8f)
                lineTo(188.0f, 122.06f)
                curveToRelative(-0.89f, 20.46f, -7.08f, 43.5f, -21.55f, 68.87f)
                lineToRelative(26.64f, 20.12f)
                lineToRelative(0.09f, 0.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.41f, -2.26f)
                lineToRelative(12.36f, -55.63f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 211.08f, 149.8f)
                close()
            }
        }
        .build()
        return `_rocket-thin`!!
    }

private var `_rocket-thin`: ImageVector? = null
