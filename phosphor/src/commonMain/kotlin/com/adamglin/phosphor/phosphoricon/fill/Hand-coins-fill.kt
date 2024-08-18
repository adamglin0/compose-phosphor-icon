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

public val FillGroup.`Hand-coins-fill`: ImageVector
    get() {
        if (`_hand-coins-fill` != null) {
            return `_hand-coins-fill`!!
        }
        `_hand-coins-fill` = Builder(name = "Hand-coins-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.09f, 57.38f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 55.17f, -27.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.56f, 7.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 152.0f, 84.0f)
                curveToRelative(0.0f, 1.17f, 0.0f, 2.34f, 0.12f, 3.49f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, 3.76f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.09f, 57.38f)
                close()
                moveTo(240.0f, 160.61f)
                arcToRelative(24.47f, 24.47f, 0.0f, false, true, -13.6f, 22.0f)
                lineToRelative(-0.44f, 0.2f)
                lineToRelative(-38.83f, 16.54f)
                arcToRelative(6.94f, 6.94f, 0.0f, false, true, -1.19f, 0.4f)
                lineToRelative(-64.0f, 16.0f)
                arcTo(7.93f, 7.93f, 0.0f, false, true, 120.0f, 216.0f)
                lineTo(16.0f, 216.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 0.0f, 200.0f)
                lineTo(0.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                lineTo(44.69f, 144.0f)
                lineToRelative(22.62f, -22.63f)
                arcTo(31.82f, 31.82f, 0.0f, false, true, 89.94f, 112.0f)
                lineTo(140.0f, 112.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 27.25f, 34.45f)
                lineToRelative(41.84f, -9.62f)
                arcTo(24.61f, 24.61f, 0.0f, false, true, 240.0f, 160.61f)
                close()
                moveTo(224.0f, 160.61f)
                arcToRelative(8.61f, 8.61f, 0.0f, false, false, -10.87f, -8.3f)
                lineToRelative(-0.31f, 0.08f)
                lineToRelative(-67.0f, 15.41f)
                arcToRelative(8.32f, 8.32f, 0.0f, false, true, -1.79f, 0.2f)
                lineTo(112.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(89.94f, 128.0f)
                arcToRelative(15.86f, 15.86f, 0.0f, false, false, -11.31f, 4.69f)
                lineTo(56.0f, 155.31f)
                lineTo(56.0f, 200.0f)
                horizontalLineToRelative(63.0f)
                lineToRelative(62.43f, -15.61f)
                lineToRelative(38.0f, -16.18f)
                arcTo(8.56f, 8.56f, 0.0f, false, false, 224.0f, 160.61f)
                close()
                moveTo(168.0f, 84.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 168.0f, 84.0f)
                close()
            }
        }
        .build()
        return `_hand-coins-fill`!!
    }

private var `_hand-coins-fill`: ImageVector? = null
