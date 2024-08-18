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

public val RegularGroup.`Telegram-logo`: ImageVector
    get() {
        if (`_telegram-logo` != null) {
            return `_telegram-logo`!!
        }
        `_telegram-logo` = Builder(name = "Telegram-logo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.88f, 26.19f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.16f, -1.57f)
                lineTo(17.06f, 103.93f)
                arcToRelative(14.22f, 14.22f, 0.0f, false, false, 2.43f, 27.21f)
                lineTo(72.0f, 141.45f)
                lineTo(72.0f, 200.0f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, false, 10.0f, 14.83f)
                arcToRelative(15.91f, 15.91f, 0.0f, false, false, 17.51f, -3.73f)
                lineToRelative(25.32f, -26.26f)
                lineTo(165.0f, 220.0f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, false, 10.51f, 4.0f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, false, 5.0f, -0.79f)
                arcToRelative(15.85f, 15.85f, 0.0f, false, false, 10.67f, -11.63f)
                lineTo(231.77f, 35.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 228.88f, 26.19f)
                close()
                moveTo(167.74f, 62.19f)
                lineTo(78.15f, 126.35f)
                lineToRelative(-49.6f, -9.73f)
                close()
                moveTo(88.0f, 200.0f)
                lineTo(88.0f, 152.52f)
                lineToRelative(24.79f, 21.74f)
                close()
                moveTo(175.53f, 208.0f)
                lineTo(92.85f, 135.5f)
                lineToRelative(119.0f, -85.29f)
                close()
            }
        }
        .build()
        return `_telegram-logo`!!
    }

private var `_telegram-logo`: ImageVector? = null
