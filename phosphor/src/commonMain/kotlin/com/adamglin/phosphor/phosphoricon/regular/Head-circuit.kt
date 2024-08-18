package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Head-circuit`: ImageVector
    get() {
        if (`_head-circuit` != null) {
            return `_head-circuit`!!
        }
        `_head-circuit` = Builder(name = "Head-circuit", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.5f, 171.47f)
                arcTo(88.34f, 88.34f, 0.0f, false, false, 224.0f, 101.93f)
                curveToRelative(-1.0f, -45.71f, -37.61f, -83.4f, -83.24f, -85.8f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 48.0f, 102.0f)
                lineTo(25.55f, 145.18f)
                curveToRelative(-0.09f, 0.18f, -0.18f, 0.36f, -0.26f, 0.54f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.55f, 20.62f)
                lineToRelative(0.25f, 0.11f)
                lineTo(56.0f, 176.94f)
                lineTo(56.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(72.0f, 208.0f)
                lineTo(72.0f, 171.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.67f, -7.28f)
                lineTo(40.0f, 152.0f)
                lineToRelative(23.07f, -44.34f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 64.0f, 104.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 56.0f, -70.21f)
                lineTo(120.0f, 49.38f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 16.0f, 0.0f)
                lineTo(136.0f, 32.0f)
                curveToRelative(1.3f, 0.0f, 2.6f, 0.0f, 3.9f, 0.1f)
                arcTo(72.26f, 72.26f, 0.0f, false, true, 203.84f, 80.0f)
                lineTo(184.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.15f, 2.88f)
                lineTo(152.34f, 113.5f)
                arcToRelative(24.06f, 24.06f, 0.0f, true, false, 12.28f, 10.25f)
                lineTo(187.75f, 96.0f)
                horizontalLineToRelative(19.79f)
                quadToRelative(0.36f, 3.12f, 0.44f, 6.3f)
                arcToRelative(72.26f, 72.26f, 0.0f, false, true, -28.78f, 59.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.14f, 7.39f)
                lineToRelative(8.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.93f, 7.0f)
                arcToRelative(8.39f, 8.39f, 0.0f, false, false, 1.0f, -0.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.95f, -8.93f)
                close()
                moveTo(128.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 80.0f)
                close()
                moveTo(144.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 144.0f)
                close()
            }
        }
        .build()
        return `_head-circuit`!!
    }

private var `_head-circuit`: ImageVector? = null
