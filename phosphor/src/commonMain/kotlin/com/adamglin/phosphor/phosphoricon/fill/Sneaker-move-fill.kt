package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Sneaker-move-fill`: ImageVector
    get() {
        if (`_sneaker-move-fill` != null) {
            return `_sneaker-move-fill`!!
        }
        `_sneaker-move-fill` = Builder(name = "Sneaker-move-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(70.8f, 184.0f)
                lineTo(32.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(70.8f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                close()
                moveTo(102.8f, 200.0f)
                lineTo(48.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(54.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f)
                close()
                moveTo(231.16f, 166.63f)
                lineTo(202.53f, 152.32f)
                arcTo(47.74f, 47.74f, 0.0f, false, true, 176.0f, 109.39f)
                lineTo(176.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.93f, -8.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 120.0f, 24.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.83f, -6.44f)
                lineTo(45.11f, 64.68f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.41f, 6.0f)
                lineToRelative(51.44f, 51.44f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, true, 0.6f, 11.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.71f, 0.43f)
                lineToRelative(-53.0f, -53.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.44f, 1.09f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 3.12f, 18.22f)
                lineTo(142.4f, 213.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, 2.34f)
                lineTo(224.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(240.0f, 180.94f)
                arcTo(15.92f, 15.92f, 0.0f, false, false, 231.16f, 166.63f)
                close()
            }
        }
        .build()
        return `_sneaker-move-fill`!!
    }

private var `_sneaker-move-fill`: ImageVector? = null
