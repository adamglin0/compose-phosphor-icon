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

public val ThinGroup.`Hammer-thin`: ImageVector
    get() {
        if (`_hammer-thin` != null) {
            return `_hammer-thin`!!
        }
        `_hammer-thin` = Builder(name = "Hammer-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.5f, 114.81f)
                lineTo(181.05f, 46.9f)
                arcTo(92.1f, 92.1f, 0.0f, false, false, 50.9f, 47.0f)
                lineTo(37.12f, 61.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.75f, 5.56f)
                lineTo(56.6f, 52.56f)
                arcToRelative(83.75f, 83.75f, 0.0f, false, true, 22.34f, -16.0f)
                lineTo(130.34f, 88.0f)
                lineTo(31.51f, 186.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineTo(52.2f, 224.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineTo(168.0f, 125.63f)
                lineToRelative(17.17f, 17.18f)
                horizontalLineToRelative(0.0f)
                lineToRelative(17.66f, 17.66f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(28.69f, -28.69f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 248.5f, 114.81f)
                close()
                moveTo(63.5f, 218.81f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(37.17f, 198.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineTo(108.0f, 121.63f)
                lineTo(134.34f, 148.0f)
                close()
                moveTo(165.17f, 117.15f)
                lineTo(140.0f, 142.32f)
                lineTo(113.65f, 116.0f)
                lineTo(138.83f, 90.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.66f)
                lineToRelative(-52.0f, -52.0f)
                arcToRelative(84.11f, 84.11f, 0.0f, false, true, 88.52f, 19.38f)
                lineToRelative(47.0f, 47.35f)
                lineTo(188.0f, 134.32f)
                lineToRelative(-17.17f, -17.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 165.17f, 117.15f)
                close()
                moveTo(242.83f, 126.15f)
                lineTo(214.15f, 154.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(193.66f, 140.0f)
                lineToRelative(34.39f, -34.4f)
                lineToRelative(14.78f, 14.88f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 242.83f, 126.12f)
                close()
            }
        }
        .build()
        return `_hammer-thin`!!
    }

private var `_hammer-thin`: ImageVector? = null
