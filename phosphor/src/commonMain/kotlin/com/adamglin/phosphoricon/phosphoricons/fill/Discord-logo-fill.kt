package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Discord-logo-fill`: ImageVector
    get() {
        if (`_discord-logo-fill` != null) {
            return `_discord-logo-fill`!!
        }
        `_discord-logo-fill` = Builder(name = "Discord-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.51f, 174.39f)
                lineTo(218.0f, 58.0f)
                arcToRelative(16.08f, 16.08f, 0.0f, false, false, -13.0f, -11.88f)
                lineToRelative(-36.06f, -5.92f)
                arcToRelative(16.22f, 16.22f, 0.0f, false, false, -18.26f, 11.88f)
                lineToRelative(-0.21f, 0.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.27f, 4.93f)
                arcToRelative(155.62f, 155.62f, 0.0f, false, true, 24.41f, 5.62f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 5.62f, 9.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.19f, 5.64f)
                arcToRelative(155.4f, 155.4f, 0.0f, false, false, -90.8f, -0.1f)
                arcToRelative(8.22f, 8.22f, 0.0f, false, true, -10.28f, -4.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.08f, -10.33f)
                arcToRelative(156.85f, 156.85f, 0.0f, false, true, 24.72f, -5.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.27f, -4.93f)
                lineToRelative(-0.21f, -0.85f)
                arcTo(16.21f, 16.21f, 0.0f, false, false, 87.08f, 40.21f)
                lineTo(51.0f, 46.13f)
                arcTo(16.08f, 16.08f, 0.0f, false, false, 38.0f, 58.0f)
                lineTo(8.49f, 174.39f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, 9.06f, 18.51f)
                lineToRelative(67.0f, 29.71f)
                arcToRelative(16.17f, 16.17f, 0.0f, false, false, 21.71f, -9.1f)
                lineToRelative(3.49f, -9.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.27f, -5.35f)
                arcToRelative(158.13f, 158.13f, 0.0f, false, true, -28.63f, -6.2f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -5.61f, -9.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.2f, -5.66f)
                arcToRelative(155.59f, 155.59f, 0.0f, false, false, 91.12f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.19f, 5.65f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, true, -5.61f, 9.68f)
                arcToRelative(157.84f, 157.84f, 0.0f, false, true, -28.62f, 6.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.27f, 5.35f)
                lineToRelative(3.49f, 9.45f)
                arcToRelative(16.18f, 16.18f, 0.0f, false, false, 21.71f, 9.1f)
                lineToRelative(67.0f, -29.71f)
                arcTo(15.94f, 15.94f, 0.0f, false, false, 247.51f, 174.39f)
                close()
                moveTo(92.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 152.0f)
                close()
                moveTo(164.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_discord-logo-fill`!!
    }

private var `_discord-logo-fill`: ImageVector? = null
