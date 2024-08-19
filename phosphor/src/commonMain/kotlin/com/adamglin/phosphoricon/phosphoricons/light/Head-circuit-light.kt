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

public val LightGroup.`Head-circuit-light`: ImageVector
    get() {
        if (`_head-circuit-light` != null) {
            return `_head-circuit-light`!!
        }
        `_head-circuit-light` = Builder(name = "Head-circuit-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.37f, 170.62f)
                arcTo(86.27f, 86.27f, 0.0f, false, false, 222.0f, 102.0f)
                curveToRelative(-1.0f, -44.68f, -36.76f, -81.51f, -81.34f, -83.86f)
                arcTo(86.0f, 86.0f, 0.0f, false, false, 50.0f, 102.51f)
                lineToRelative(-22.69f, 43.6f)
                curveToRelative(-0.07f, 0.13f, -0.13f, 0.26f, -0.19f, 0.4f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 6.61f, 18.0f)
                lineToRelative(0.18f, 0.09f)
                lineToRelative(24.08f, 11.0f)
                lineTo(57.99f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(72.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(70.0f, 171.81f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.5f, -5.46f)
                lineTo(39.0f, 153.78f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.93f, -2.4f)
                lineToRelative(23.21f, -44.61f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 62.0f, 104.0f)
                arcToRelative(74.05f, 74.05f, 0.0f, false, true, 60.0f, -72.68f)
                lineTo(122.0f, 50.84f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, false, 12.0f, 0.0f)
                lineTo(134.0f, 30.05f)
                curveToRelative(2.0f, -0.05f, 4.0f, -0.05f, 6.0f, 0.06f)
                arcTo(74.29f, 74.29f, 0.0f, false, true, 206.63f, 82.0f)
                lineTo(184.0f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.61f, 2.16f)
                lineTo(152.94f, 115.9f)
                arcToRelative(22.06f, 22.06f, 0.0f, true, false, 9.21f, 7.69f)
                lineTo(186.81f, 94.0f)
                horizontalLineToRelative(22.5f)
                arcToRelative(72.44f, 72.44f, 0.0f, false, true, 0.67f, 8.26f)
                arcTo(74.24f, 74.24f, 0.0f, false, true, 180.4f, 163.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.35f, 5.54f)
                lineToRelative(8.0f, 64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 192.0f, 238.0f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 0.75f, -0.05f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.21f, -6.7f)
                close()
                moveTo(138.0f, 72.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 72.0f)
                close()
                moveTo(144.0f, 146.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 144.0f, 146.0f)
                close()
            }
        }
        .build()
        return `_head-circuit-light`!!
    }

private var `_head-circuit-light`: ImageVector? = null
