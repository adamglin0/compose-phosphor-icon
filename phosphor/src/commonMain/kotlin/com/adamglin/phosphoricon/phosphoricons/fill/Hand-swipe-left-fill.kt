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

public val FillGroup.`Hand-swipe-left-fill`: ImageVector
    get() {
        if (`_hand-swipe-left-fill` != null) {
            return `_hand-swipe-left-fill`!!
        }
        `_hand-swipe-left-fill` = Builder(name = "Hand-swipe-left-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 128.0f)
                verticalLineToRelative(50.93f)
                curveToRelative(0.0f, 25.59f, -8.48f, 39.93f, -8.84f, 40.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 224.0f)
                lineTo(64.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.9f, -3.95f)
                lineTo(26.15f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 6.53f, -22.23f)
                curveToRelative(7.66f, -4.0f, 17.1f, -0.84f, 21.4f, 6.62f)
                lineToRelative(21.0f, 36.44f)
                arcToRelative(6.09f, 6.09f, 0.0f, false, false, 6.0f, 3.09f)
                lineToRelative(0.12f, 0.0f)
                arcTo(8.19f, 8.19f, 0.0f, false, false, 88.0f, 175.74f)
                lineTo(88.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.77f, -16.0f)
                curveToRelative(8.61f, 0.4f, 15.23f, 7.82f, 15.23f, 16.43f)
                lineTo(120.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, 8.0f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, 7.47f, -8.25f)
                lineTo(136.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.77f, -16.0f)
                curveToRelative(8.61f, 0.4f, 15.23f, 7.82f, 15.23f, 16.43f)
                lineTo(168.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, 8.0f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, false, 7.47f, -8.25f)
                verticalLineToRelative(-7.28f)
                curveToRelative(0.0f, -8.61f, 6.62f, -16.0f, 15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 128.0f)
                close()
                moveTo(248.0f, 48.0f)
                lineTo(195.31f, 48.0f)
                lineToRelative(18.35f, -18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.32f, -11.32f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                lineTo(195.31f, 64.0f)
                lineTo(248.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return `_hand-swipe-left-fill`!!
    }

private var `_hand-swipe-left-fill`: ImageVector? = null
