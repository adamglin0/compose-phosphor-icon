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

public val ThinGroup.`Eraser-thin`: ImageVector
    get() {
        if (`_eraser-thin` != null) {
            return `_eraser-thin`!!
        }
        `_eraser-thin` = Builder(name = "Eraser-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.15f, 83.22f)
                lineTo(180.77f, 41.85f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineTo(33.85f, 160.48f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.29f)
                lineToRelative(30.06f, 30.06f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 66.74f, 220.0f)
                horizontalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(121.66f)
                lineTo(222.15f, 111.51f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 222.15f, 83.22f)
                close()
                moveTo(110.34f, 212.0f)
                horizontalLineTo(68.4f)
                lineTo(39.51f, 183.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineTo(96.0f, 109.65f)
                lineTo(154.35f, 168.0f)
                close()
                moveTo(216.49f, 105.85f)
                lineTo(160.0f, 162.34f)
                lineTo(101.65f, 104.0f)
                lineToRelative(56.49f, -56.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineToRelative(41.37f, 41.37f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 216.49f, 105.85f)
                close()
            }
        }
        .build()
        return `_eraser-thin`!!
    }

private var `_eraser-thin`: ImageVector? = null
