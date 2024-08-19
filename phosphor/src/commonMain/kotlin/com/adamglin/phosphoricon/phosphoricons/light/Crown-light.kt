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

public val LightGroup.`Crown-light`: ImageVector
    get() {
        if (`_crown-light` != null) {
            return `_crown-light`!!
        }
        `_crown-light` = Builder(name = "Crown-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 80.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -46.6f, 15.84f)
                lineToRelative(-29.83f, 36.72f)
                lineToRelative(-26.0f, -59.76f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -31.16f, 0.0f)
                lineToRelative(-26.0f, 59.76f)
                lineTo(56.6f, 95.84f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -22.36f, 10.09f)
                lineTo(49.0f, 194.3f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 62.78f, 206.0f)
                horizontalLineTo(193.22f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 207.0f, 194.3f)
                lineToRelative(14.73f, -88.37f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 246.0f, 80.0f)
                close()
                moveTo(128.0f, 38.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 128.0f, 38.0f)
                close()
                moveTo(22.0f, 80.0f)
                arcTo(14.0f, 14.0f, 0.0f, true, true, 36.0f, 94.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 22.0f, 80.0f)
                close()
                moveTo(195.2f, 192.33f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 1.67f)
                horizontalLineTo(62.78f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -1.67f)
                lineTo(46.08f, 104.0f)
                lineToRelative(1.22f, -0.55f)
                lineToRelative(36.0f, 44.36f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 88.0f, 150.0f)
                arcToRelative(5.52f, 5.52f, 0.0f, false, false, 0.81f, -0.06f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.69f, -3.55f)
                lineToRelative(29.92f, -68.8f)
                arcToRelative(25.79f, 25.79f, 0.0f, false, false, 9.16f, 0.0f)
                lineToRelative(29.92f, 68.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.69f, 3.55f)
                arcToRelative(5.52f, 5.52f, 0.0f, false, false, 0.81f, 0.06f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.66f, -2.22f)
                lineToRelative(36.0f, -44.36f)
                lineToRelative(1.22f, 0.55f)
                close()
                moveTo(220.0f, 94.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 220.0f, 94.0f)
                close()
            }
        }
        .build()
        return `_crown-light`!!
    }

private var `_crown-light`: ImageVector? = null
