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

public val RegularGroup.`Hand-withdraw`: ImageVector
    get() {
        if (`_hand-withdraw` != null) {
            return `_hand-withdraw`!!
        }
        `_hand-withdraw` = Builder(name = "Hand-withdraw", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 198.65f)
                lineTo(232.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(216.0f, 198.65f)
                arcTo(74.84f, 74.84f, 0.0f, false, false, 192.0f, 144.0f)
                verticalLineToRelative(58.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.69f, 4.38f)
                lineToRelative(-10.68f, -16.31f)
                curveToRelative(-0.08f, -0.12f, -0.16f, -0.25f, -0.23f, -0.38f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.89f, 11.83f)
                lineToRelative(22.13f, 33.79f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.39f, 8.76f)
                lineToRelative(-22.26f, -34.0f)
                lineToRelative(-0.24f, -0.38f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 176.0f, 176.4f)
                lineTo(176.0f, 64.0f)
                lineTo(160.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(59.62f)
                arcTo(90.89f, 90.89f, 0.0f, false, true, 232.0f, 198.65f)
                close()
                moveTo(88.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(64.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 64.0f)
                lineTo(48.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(64.0f, 64.0f)
                lineTo(80.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 56.0f)
                close()
                moveTo(157.66f, 98.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineTo(128.0f, 116.69f)
                lineTo(128.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(112.0f, 116.69f)
                lineTo(93.66f, 98.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 157.66f, 98.34f)
                close()
            }
        }
        .build()
        return `_hand-withdraw`!!
    }

private var `_hand-withdraw`: ImageVector? = null
