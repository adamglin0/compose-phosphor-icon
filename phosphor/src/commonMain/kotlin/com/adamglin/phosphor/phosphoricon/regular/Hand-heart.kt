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

public val RegularGroup.`Hand-heart`: ImageVector
    get() {
        if (`_hand-heart` != null) {
            return `_hand-heart`!!
        }
        `_hand-heart` = Builder(name = "Hand-heart", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.33f, 141.06f)
                arcToRelative(24.34f, 24.34f, 0.0f, false, false, -18.61f, -4.77f)
                curveTo(230.5f, 117.33f, 240.0f, 98.48f, 240.0f, 80.0f)
                curveToRelative(0.0f, -26.47f, -21.29f, -48.0f, -47.46f, -48.0f)
                arcTo(47.58f, 47.58f, 0.0f, false, false, 156.0f, 48.75f)
                arcTo(47.58f, 47.58f, 0.0f, false, false, 119.46f, 32.0f)
                curveTo(93.29f, 32.0f, 72.0f, 53.53f, 72.0f, 80.0f)
                curveToRelative(0.0f, 11.0f, 3.24f, 21.69f, 10.06f, 33.0f)
                arcToRelative(31.87f, 31.87f, 0.0f, false, false, -14.75f, 8.4f)
                lineTo(44.69f, 144.0f)
                lineTo(16.0f, 144.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 0.0f, 160.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(120.0f, 216.0f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, false, 1.94f, -0.24f)
                lineToRelative(64.0f, -16.0f)
                arcToRelative(6.94f, 6.94f, 0.0f, false, false, 1.19f, -0.4f)
                lineTo(226.0f, 182.82f)
                lineToRelative(0.44f, -0.2f)
                arcToRelative(24.6f, 24.6f, 0.0f, false, false, 3.93f, -41.56f)
                close()
                moveTo(119.46f, 48.0f)
                arcTo(31.15f, 31.15f, 0.0f, false, true, 148.6f, 67.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.8f, 0.0f)
                arcToRelative(31.15f, 31.15f, 0.0f, false, true, 29.14f, -19.0f)
                curveTo(209.59f, 48.0f, 224.0f, 62.65f, 224.0f, 80.0f)
                curveToRelative(0.0f, 19.51f, -15.79f, 41.58f, -45.66f, 63.9f)
                lineToRelative(-11.09f, 2.55f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 140.0f, 112.0f)
                lineTo(100.68f, 112.0f)
                curveTo(92.05f, 100.36f, 88.0f, 90.12f, 88.0f, 80.0f)
                curveTo(88.0f, 62.65f, 102.41f, 48.0f, 119.46f, 48.0f)
                close()
                moveTo(16.0f, 160.0f)
                lineTo(40.0f, 160.0f)
                verticalLineToRelative(40.0f)
                lineTo(16.0f, 200.0f)
                close()
                moveTo(219.43f, 168.21f)
                lineTo(181.43f, 184.39f)
                lineTo(119.0f, 200.0f)
                lineTo(56.0f, 200.0f)
                lineTo(56.0f, 155.31f)
                lineToRelative(22.63f, -22.62f)
                arcTo(15.86f, 15.86f, 0.0f, false, true, 89.94f, 128.0f)
                lineTo(140.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(112.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.32f, 8.32f, 0.0f, false, false, 1.79f, -0.2f)
                lineToRelative(67.0f, -15.41f)
                lineToRelative(0.31f, -0.08f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, true, 6.3f, 15.9f)
                close()
            }
        }
        .build()
        return `_hand-heart`!!
    }

private var `_hand-heart`: ImageVector? = null
