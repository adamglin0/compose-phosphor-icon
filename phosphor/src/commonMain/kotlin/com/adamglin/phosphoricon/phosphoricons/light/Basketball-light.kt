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

public val LightGroup.`Basketball-light`: ImageVector
    get() {
        if (`_basketball-light` != null) {
            return `_basketball-light`!!
        }
        `_basketball-light` = Builder(name = "Basketball-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(60.0f, 69.09f)
                arcTo(89.23f, 89.23f, 0.0f, false, true, 81.78f, 122.0f)
                lineTo(38.2f, 122.0f)
                arcTo(89.65f, 89.65f, 0.0f, false, true, 60.0f, 69.09f)
                close()
                moveTo(38.2f, 134.0f)
                lineTo(81.78f, 134.0f)
                arcTo(89.23f, 89.23f, 0.0f, false, true, 60.0f, 186.91f)
                arcTo(89.65f, 89.65f, 0.0f, false, true, 38.2f, 134.0f)
                close()
                moveTo(122.0f, 217.8f)
                arcToRelative(89.66f, 89.66f, 0.0f, false, true, -53.5f, -22.34f)
                arcTo(101.18f, 101.18f, 0.0f, false, false, 93.82f, 134.0f)
                lineTo(122.0f, 134.0f)
                close()
                moveTo(122.0f, 122.0f)
                lineTo(93.82f, 122.0f)
                arcTo(101.18f, 101.18f, 0.0f, false, false, 68.5f, 60.54f)
                arcTo(89.66f, 89.66f, 0.0f, false, true, 122.0f, 38.2f)
                close()
                moveTo(217.8f, 122.0f)
                lineTo(174.22f, 122.0f)
                arcTo(89.23f, 89.23f, 0.0f, false, true, 196.0f, 69.09f)
                arcTo(89.65f, 89.65f, 0.0f, false, true, 217.8f, 122.0f)
                close()
                moveTo(134.0f, 38.2f)
                arcToRelative(89.66f, 89.66f, 0.0f, false, true, 53.5f, 22.34f)
                arcTo(101.18f, 101.18f, 0.0f, false, false, 162.18f, 122.0f)
                lineTo(134.0f, 122.0f)
                close()
                moveTo(134.0f, 217.8f)
                lineTo(134.0f, 134.0f)
                horizontalLineToRelative(28.18f)
                arcToRelative(101.18f, 101.18f, 0.0f, false, false, 25.32f, 61.46f)
                arcTo(89.66f, 89.66f, 0.0f, false, true, 134.0f, 217.8f)
                close()
                moveTo(196.0f, 186.91f)
                arcTo(89.23f, 89.23f, 0.0f, false, true, 174.22f, 134.0f)
                lineTo(217.8f, 134.0f)
                arcTo(89.65f, 89.65f, 0.0f, false, true, 196.0f, 186.91f)
                close()
            }
        }
        .build()
        return `_basketball-light`!!
    }

private var `_basketball-light`: ImageVector? = null
