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

public val RegularGroup.`Drop-slash`: ImageVector
    get() {
        if (`_drop-slash` != null) {
            return `_drop-slash`!!
        }
        `_drop-slash` = Builder(name = "Drop-slash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(64.72f, 70.29f)
                curveTo(48.32f, 95.0f, 40.0f, 119.78f, 40.0f, 144.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 149.21f, 63.22f)
                lineToRelative(12.87f, 14.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, -72.0f)
                curveToRelative(0.0f, -19.93f, 6.68f, -40.57f, 19.86f, -61.46f)
                lineTo(178.43f, 195.36f)
                arcTo(71.84f, 71.84f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(90.0f, 50.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.27f, -11.31f)
                arcTo(247.8f, 247.8f, 0.0f, false, true, 123.41f, 9.45f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.18f, 0.0f)
                curveTo(136.0f, 11.83f, 216.0f, 68.7f, 216.0f, 144.0f)
                arcToRelative(88.08f, 88.08f, 0.0f, false, true, -3.15f, 23.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.71f, 5.88f)
                arcTo(7.79f, 7.79f, 0.0f, false, true, 203.0f, 173.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.59f, -9.83f)
                arcTo(72.55f, 72.55f, 0.0f, false, false, 200.0f, 144.0f)
                curveToRelative(0.0f, -57.24f, -55.48f, -105.0f, -72.0f, -118.0f)
                arcToRelative(252.23f, 252.23f, 0.0f, false, false, -26.66f, 24.23f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 90.0f, 50.51f)
                close()
            }
        }
        .build()
        return `_drop-slash`!!
    }

private var `_drop-slash`: ImageVector? = null
