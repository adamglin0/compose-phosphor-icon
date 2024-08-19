package com.adamglin.phosphoricon.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.DuotoneGroup

public val DuotoneGroup.`Wechat-logo-duotone`: ImageVector
    get() {
        if (`_wechat-logo-duotone` != null) {
            return `_wechat-logo-duotone`!!
        }
        `_wechat-logo-duotone` = Builder(name = "Wechat-logo-duotone", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(163.94f, 80.11f)
                horizontalLineToRelative(0.0f)
                curveTo(162.63f, 80.0f, 161.32f, 80.0f, 160.0f, 80.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -67.93f, 95.88f)
                horizontalLineToRelative(0.0f)
                arcToRelative(71.53f, 71.53f, 0.0f, false, true, -30.0f, -8.39f)
                lineToRelative(-27.76f, 8.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.93f, -9.93f)
                lineTo(32.5f, 138.0f)
                arcTo(72.0f, 72.0f, 0.0f, true, true, 163.94f, 80.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 140.0f)
                close()
                moveTo(188.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 188.0f, 128.0f)
                close()
                moveTo(239.34f, 211.47f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -19.87f, 19.87f)
                lineToRelative(-24.71f, -7.27f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 86.43f, 183.42f)
                arcToRelative(79.0f, 79.0f, 0.0f, false, true, -25.19f, -7.35f)
                lineToRelative(-24.71f, 7.27f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -19.87f, -19.87f)
                lineToRelative(7.27f, -24.71f)
                arcTo(80.0f, 80.0f, 0.0f, true, true, 169.58f, 72.59f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 62.49f, 114.17f)
                close()
                moveTo(81.3f, 166.3f)
                arcToRelative(79.94f, 79.94f, 0.0f, false, true, 70.38f, -93.87f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 39.55f, 134.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.63f, 6.0f)
                lineTo(32.0f, 168.0f)
                lineToRelative(27.76f, -8.17f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.0f, 0.63f)
                arcTo(63.45f, 63.45f, 0.0f, false, false, 81.3f, 166.3f)
                close()
                moveTo(216.45f, 182.19f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -26.26f, 26.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.0f, -0.63f)
                lineTo(224.0f, 216.0f)
                lineToRelative(-8.17f, -27.76f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.45f, 182.19f)
                close()
            }
        }
        .build()
        return `_wechat-logo-duotone`!!
    }

private var `_wechat-logo-duotone`: ImageVector? = null
