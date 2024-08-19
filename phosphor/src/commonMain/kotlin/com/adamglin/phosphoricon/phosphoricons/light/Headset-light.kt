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

public val LightGroup.`Headset-light`: ImageVector
    get() {
        if (`_headset-light` != null) {
            return `_headset-light`!!
        }
        `_headset-light` = Builder(name = "Headset-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.47f, 56.07f)
                arcTo(101.37f, 101.37f, 0.0f, false, false, 128.77f, 26.0f)
                lineTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 26.0f, 128.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                lineTo(64.0f, 206.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                lineTo(86.0f, 144.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, -22.0f)
                lineTo(38.2f, 122.0f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 128.0f, 38.0f)
                horizontalLineToRelative(0.68f)
                arcToRelative(89.71f, 89.71f, 0.0f, false, true, 89.13f, 84.0f)
                lineTo(192.0f, 122.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, 22.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                horizontalLineToRelative(26.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, 26.0f)
                lineTo(136.0f, 234.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f)
                lineTo(230.0f, 128.0f)
                arcTo(101.44f, 101.44f, 0.0f, false, false, 200.47f, 56.07f)
                close()
                moveTo(64.0f, 134.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f)
                lineTo(48.0f, 194.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(38.0f, 134.0f)
                close()
                moveTo(182.0f, 184.0f)
                lineTo(182.0f, 144.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, -10.0f)
                horizontalLineToRelative(26.0f)
                verticalLineToRelative(60.0f)
                lineTo(192.0f, 194.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 182.0f, 184.0f)
                close()
            }
        }
        .build()
        return `_headset-light`!!
    }

private var `_headset-light`: ImageVector? = null
