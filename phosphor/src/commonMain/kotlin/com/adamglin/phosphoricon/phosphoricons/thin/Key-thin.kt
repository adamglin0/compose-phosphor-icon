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

public val ThinGroup.`Key-thin`: ImageVector
    get() {
        if (`_key-thin` != null) {
            return `_key-thin`!!
        }
        `_key-thin` = Builder(name = "Key-thin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.74f, 42.26f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 88.51f, 121.84f)
                lineToRelative(-57.0f, 57.0f)
                arcTo(11.93f, 11.93f, 0.0f, false, false, 28.0f, 187.31f)
                lineTo(28.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(72.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(76.0f, 204.0f)
                lineTo(96.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(100.0f, 180.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, -1.17f)
                lineToRelative(11.33f, -11.34f)
                arcTo(75.72f, 75.72f, 0.0f, false, false, 160.0f, 172.0f)
                horizontalLineToRelative(0.1f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 213.74f, 42.26f)
                close()
                moveTo(227.96f, 98.26f)
                curveToRelative(-1.15f, 36.22f, -31.6f, 65.72f, -67.87f, 65.77f)
                lineTo(160.0f, 164.03f)
                arcToRelative(67.52f, 67.52f, 0.0f, false, true, -25.21f, -4.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.45f, 0.83f)
                lineToRelative(-12.0f, 12.0f)
                lineTo(96.0f, 172.03f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(20.0f)
                lineTo(72.0f, 196.03f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(20.0f)
                lineTo(40.0f, 220.03f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 187.31f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, true, 1.17f, -2.83f)
                lineTo(96.0f, 125.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.83f, -4.45f)
                arcTo(67.51f, 67.51f, 0.0f, false, true, 92.0f, 95.91f)
                curveTo(92.0f, 59.64f, 121.55f, 29.19f, 157.77f, 28.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 228.0f, 98.23f)
                close()
                moveTo(188.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 188.0f, 76.0f)
                close()
            }
        }
        .build()
        return `_key-thin`!!
    }

private var `_key-thin`: ImageVector? = null
