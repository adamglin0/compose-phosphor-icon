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

public val LightGroup.`Plugs-light`: ImageVector
    get() {
        if (`_plugs-light` != null) {
            return `_plugs-light`!!
        }
        `_plugs-light` = Builder(name = "Plugs-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.24f, 139.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineTo(120.0f, 159.51f)
                lineTo(96.49f, 136.0f)
                lineToRelative(19.75f, -19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineTo(88.0f, 127.51f)
                lineTo(68.24f, 107.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(67.51f, 124.0f)
                lineTo(42.79f, 148.73f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, 42.42f)
                lineToRelative(6.78f, 6.79f)
                lineTo(19.76f, 227.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(29.82f, -29.81f)
                lineToRelative(6.79f, 6.78f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 42.42f, 0.0f)
                lineTo(132.0f, 188.49f)
                lineToRelative(7.76f, 7.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineTo(128.49f, 168.0f)
                lineToRelative(19.75f, -19.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 148.24f, 139.76f)
                close()
                moveTo(98.79f, 204.76f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -25.46f, 0.0f)
                lineTo(51.27f, 182.67f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, -25.46f)
                lineTo(76.0f, 132.49f)
                lineTo(123.51f, 180.0f)
                close()
                moveTo(236.24f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineTo(197.94f, 49.57f)
                lineToRelative(-6.79f, -6.78f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -42.42f, 0.0f)
                lineTo(124.0f, 67.51f)
                lineToRelative(-7.76f, -7.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineToRelative(80.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineTo(188.49f, 132.0f)
                lineToRelative(24.72f, -24.73f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, -42.42f)
                lineToRelative(-6.78f, -6.79f)
                lineToRelative(29.81f, -29.82f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 236.24f, 19.76f)
                close()
                moveTo(204.73f, 98.76f)
                lineTo(180.0f, 123.51f)
                lineTo(132.49f, 76.0f)
                lineToRelative(24.72f, -24.73f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 25.46f, 0.0f)
                lineToRelative(22.06f, 22.06f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, 25.46f)
                close()
            }
        }
        .build()
        return `_plugs-light`!!
    }

private var `_plugs-light`: ImageVector? = null
