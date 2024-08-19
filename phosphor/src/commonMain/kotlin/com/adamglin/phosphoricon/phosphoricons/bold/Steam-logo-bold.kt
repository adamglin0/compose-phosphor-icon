package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Steam-logo-bold`: ImageVector
    get() {
        if (`_steam-logo-bold` != null) {
            return `_steam-logo-bold`!!
        }
        `_steam-logo-bold` = Builder(name = "Steam-logo-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(178.16f, 142.22f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -57.25f, -55.34f)
                lineTo(92.57f, 123.6f)
                lineTo(55.18f, 86.21f)
                arcToRelative(83.55f, 83.55f, 0.0f, true, true, -9.39f, 24.55f)
                lineToRelative(32.76f, 32.76f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 49.51f, 37.41f)
                close()
                moveTo(117.0f, 131.27f)
                arcTo(40.26f, 40.26f, 0.0f, false, false, 132.73f, 147.0f)
                lineTo(113.3f, 162.0f)
                lineToRelative(-0.25f, 0.2f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, true, -5.0f, 1.79f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, true, 1.79f, -5.05f)
                lineToRelative(0.2f, -0.25f)
                close()
                moveTo(152.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 152.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_steam-logo-bold`!!
    }

private var `_steam-logo-bold`: ImageVector? = null
