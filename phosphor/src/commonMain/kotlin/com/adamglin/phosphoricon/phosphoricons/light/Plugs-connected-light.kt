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

public val LightGroup.`Plugs-connected-light`: ImageVector
    get() {
        if (`_plugs-connected-light` != null) {
            return `_plugs-connected-light`!!
        }
        `_plugs-connected-light` = Builder(name = "Plugs-connected-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.24f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineTo(173.94f, 73.57f)
                lineToRelative(-6.79f, -6.78f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -42.42f, 0.0f)
                lineTo(100.0f, 91.51f)
                lineToRelative(-7.76f, -7.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(91.51f, 100.0f)
                lineTo(66.79f, 124.73f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, 42.42f)
                lineToRelative(6.78f, 6.79f)
                lineTo(19.76f, 227.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(53.82f, -53.81f)
                lineToRelative(6.79f, 6.78f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 42.42f, 0.0f)
                lineTo(156.0f, 164.49f)
                lineToRelative(7.76f, 7.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineTo(164.49f, 156.0f)
                lineToRelative(24.72f, -24.73f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, -42.42f)
                lineToRelative(-6.78f, -6.79f)
                lineToRelative(53.81f, -53.82f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 236.24f, 19.76f)
                close()
                moveTo(122.79f, 180.76f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -25.46f, 0.0f)
                lineTo(75.27f, 158.67f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, -25.46f)
                lineTo(100.0f, 108.49f)
                lineTo(147.51f, 156.0f)
                close()
                moveTo(180.73f, 122.82f)
                lineTo(156.0f, 147.51f)
                lineTo(108.49f, 100.0f)
                lineToRelative(24.72f, -24.73f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 25.46f, 0.0f)
                lineToRelative(22.06f, 22.06f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, 25.46f)
                close()
                moveTo(90.43f, 34.23f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.14f, -4.46f)
                lineToRelative(8.0f, 20.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.14f, 4.46f)
                close()
                moveTo(26.43f, 93.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.8f, -3.34f)
                lineToRelative(20.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -4.46f, 11.14f)
                lineToRelative(-20.0f, -8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 26.43f, 93.77f)
                close()
                moveTo(229.57f, 162.23f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.8f, 3.34f)
                lineToRelative(-20.0f, -8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.46f, -11.14f)
                lineToRelative(20.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 229.57f, 162.23f)
                close()
                moveTo(165.57f, 221.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.14f, 4.46f)
                lineToRelative(-8.0f, -20.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.14f, -4.46f)
                close()
            }
        }
        .build()
        return `_plugs-connected-light`!!
    }

private var `_plugs-connected-light`: ImageVector? = null
