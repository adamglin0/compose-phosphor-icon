package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Ear-slash`: ImageVector
    get() {
        if (`_ear-slash` != null) {
            return `_ear-slash`!!
        }
        `_ear-slash` = Builder(name = "Ear-slash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.92f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineToRelative(-35.0f, -38.45f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 136.0f, 160.0f)
                arcToRelative(40.83f, 40.83f, 0.0f, false, true, 1.21f, -10.0f)
                lineTo(96.0f, 104.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 80.0f, 104.0f)
                arcToRelative(47.84f, 47.84f, 0.0f, false, true, 2.22f, -14.46f)
                lineTo(64.5f, 70.0f)
                arcTo(71.47f, 71.47f, 0.0f, false, false, 56.0f, 104.0f)
                curveToRelative(0.0f, 26.7f, 8.53f, 34.92f, 17.57f, 43.64f)
                curveTo(82.21f, 156.0f, 92.0f, 165.41f, 92.0f, 188.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                curveToRelative(10.24f, 0.0f, 18.45f, -4.16f, 25.83f, -13.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.34f, 10.18f)
                curveTo(155.81f, 233.64f, 143.0f, 240.0f, 128.0f, 240.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, true, -52.0f, -52.0f)
                curveToRelative(0.0f, -15.79f, -5.68f, -21.27f, -13.54f, -28.84f)
                curveTo(52.46f, 149.5f, 40.0f, 137.5f, 40.0f, 104.0f)
                arcTo(87.26f, 87.26f, 0.0f, false, true, 53.21f, 57.62f)
                lineTo(42.08f, 45.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f)
                close()
                moveTo(91.09f, 42.17f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 200.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 82.87f, 28.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.22f, 13.73f)
                close()
                moveTo(160.32f, 127.17f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.78f, -3.44f)
                arcTo(41.93f, 41.93f, 0.0f, false, false, 176.0f, 104.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -63.57f, -45.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.19f, 15.14f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 160.0f, 104.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -3.12f, 12.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.32f, 127.12f)
                close()
            }
        }
        .build()
        return `_ear-slash`!!
    }

private var `_ear-slash`: ImageVector? = null
