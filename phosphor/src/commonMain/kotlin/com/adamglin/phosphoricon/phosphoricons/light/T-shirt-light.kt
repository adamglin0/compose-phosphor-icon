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

public val LightGroup.`T-shirt-light`: ImageVector
    get() {
        if (`_t-shirt-light` != null) {
            return `_t-shirt-light`!!
        }
        `_t-shirt-light` = Builder(name = "T-shirt-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.64f, 63.0f)
                lineTo(194.87f, 34.74f)
                arcTo(5.93f, 5.93f, 0.0f, false, false, 192.0f, 34.0f)
                lineTo(160.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -52.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(64.0f, 34.0f)
                arcToRelative(5.93f, 5.93f, 0.0f, false, false, -2.88f, 0.74f)
                lineTo(9.36f, 63.0f)
                arcTo(13.77f, 13.77f, 0.0f, false, false, 3.58f, 81.55f)
                lineToRelative(19.28f, 36.81f)
                arcTo(14.38f, 14.38f, 0.0f, false, false, 35.67f, 126.0f)
                lineTo(58.0f, 126.0f)
                verticalLineToRelative(82.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(184.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(198.0f, 126.0f)
                horizontalLineToRelative(22.34f)
                arcToRelative(14.38f, 14.38f, 0.0f, false, false, 12.81f, -7.64f)
                lineToRelative(19.28f, -36.81f)
                arcTo(13.77f, 13.77f, 0.0f, false, false, 246.64f, 63.0f)
                close()
                moveTo(35.64f, 114.0f)
                arcToRelative(2.42f, 2.42f, 0.0f, false, true, -2.18f, -1.21f)
                lineTo(14.21f, 76.0f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, true, 0.9f, -2.47f)
                lineTo(58.0f, 50.11f)
                lineTo(58.0f, 114.0f)
                close()
                moveTo(186.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(72.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(70.0f, 46.0f)
                lineTo(90.48f, 46.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 75.0f, 0.0f)
                lineTo(186.0f, 46.0f)
                close()
                moveTo(241.8f, 76.0f)
                lineTo(222.52f, 112.8f)
                arcToRelative(2.42f, 2.42f, 0.0f, false, true, -2.18f, 1.21f)
                lineTo(198.0f, 114.01f)
                lineTo(198.0f, 50.11f)
                lineToRelative(42.9f, 23.4f)
                arcTo(1.83f, 1.83f, 0.0f, false, true, 241.79f, 76.0f)
                close()
            }
        }
        .build()
        return `_t-shirt-light`!!
    }

private var `_t-shirt-light`: ImageVector? = null
