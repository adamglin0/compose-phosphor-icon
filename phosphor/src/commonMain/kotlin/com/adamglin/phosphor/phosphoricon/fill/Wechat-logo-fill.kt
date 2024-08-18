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

public val FillGroup.`Wechat-logo-fill`: ImageVector
    get() {
        if (`_wechat-logo-fill` != null) {
            return `_wechat-logo-fill`!!
        }
        `_wechat-logo-fill` = Builder(name = "Wechat-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.07f, 186.76f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 169.58f, 72.59f)
                arcTo(80.0f, 80.0f, 0.0f, true, false, 23.93f, 138.76f)
                lineToRelative(-7.27f, 24.71f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 19.87f, 19.87f)
                lineToRelative(24.71f, -7.27f)
                arcToRelative(79.0f, 79.0f, 0.0f, false, false, 25.19f, 7.35f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 108.33f, 40.65f)
                lineToRelative(24.71f, 7.27f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 19.87f, -19.87f)
                close()
                moveTo(132.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 132.0f, 152.0f)
                close()
                moveTo(80.0f, 152.0f)
                arcToRelative(80.32f, 80.32f, 0.0f, false, false, 1.3f, 14.3f)
                arcToRelative(63.45f, 63.45f, 0.0f, false, true, -15.49f, -5.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.0f, -0.63f)
                lineTo(32.0f, 168.0f)
                lineToRelative(8.17f, -27.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.63f, -6.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 151.68f, 72.43f)
                arcTo(80.12f, 80.12f, 0.0f, false, false, 80.0f, 152.0f)
                close()
                moveTo(188.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 188.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_wechat-logo-fill`!!
    }

private var `_wechat-logo-fill`: ImageVector? = null
