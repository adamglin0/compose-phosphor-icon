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

public val FillGroup.`Hand-withdraw-fill`: ImageVector
    get() {
        if (`_hand-withdraw-fill` != null) {
            return `_hand-withdraw-fill`!!
        }
        `_hand-withdraw-fill` = Builder(name = "Hand-withdraw-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 56.0f)
                lineTo(112.0f, 56.0f)
                lineTo(112.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(192.0f, 123.62f)
                lineTo(192.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(128.0f, 56.0f)
                verticalLineToRelative(60.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 93.66f, 98.34f)
                lineTo(112.0f, 116.69f)
                lineTo(112.0f, 56.0f)
                lineTo(64.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 72.0f)
                lineTo(48.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(74.7f)
                curveToRelative(0.32f, 0.67f, 0.67f, 1.34f, 1.05f, 2.0f)
                lineToRelative(0.24f, 0.38f)
                lineToRelative(22.26f, 34.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.39f, -8.76f)
                lineToRelative(-22.13f, -33.79f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 166.4f, 190.0f)
                curveToRelative(0.07f, 0.13f, 0.15f, 0.26f, 0.23f, 0.38f)
                lineToRelative(10.68f, 16.31f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 202.31f)
                lineTo(192.0f, 144.0f)
                arcToRelative(74.84f, 74.84f, 0.0f, false, true, 24.0f, 54.69f)
                lineTo(216.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(232.0f, 198.65f)
                arcTo(90.89f, 90.89f, 0.0f, false, false, 192.0f, 123.62f)
                close()
            }
        }
        .build()
        return `_hand-withdraw-fill`!!
    }

private var `_hand-withdraw-fill`: ImageVector? = null
