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

public val ThinGroup.`Pencil-simple-slash-thin`: ImageVector
    get() {
        if (`_pencil-simple-slash-thin` != null) {
            return `_pencil-simple-slash-thin`!!
        }
        `_pencil-simple-slash-thin` = Builder(name = "Pencil-simple-slash-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(95.81f, 98.54f)
                lineToRelative(-56.3f, 56.29f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 163.31f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(92.69f, 220.0f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 8.48f, -3.51f)
                lineToRelative(53.36f, -53.36f)
                lineTo(205.0f, 218.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(95.52f, 210.83f)
                arcTo(4.06f, 4.06f, 0.0f, false, true, 92.69f, 212.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 163.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.17f, -2.82f)
                lineToRelative(56.0f, -56.0f)
                lineToRelative(47.94f, 52.74f)
                close()
                moveTo(224.52f, 76.2f)
                lineTo(179.8f, 31.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(121.16f, 73.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.65f)
                lineTo(136.0f, 69.66f)
                lineTo(186.35f, 120.0f)
                lineTo(174.5f, 131.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.65f, 5.66f)
                lineToRelative(44.34f, -44.34f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.49f, 76.2f)
                close()
                moveTo(218.86f, 87.51f)
                lineTo(192.0f, 114.34f)
                lineTo(141.66f, 64.0f)
                lineToRelative(26.83f, -26.83f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(44.68f, 44.69f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 218.83f, 87.51f)
                close()
            }
        }
        .build()
        return `_pencil-simple-slash-thin`!!
    }

private var `_pencil-simple-slash-thin`: ImageVector? = null
