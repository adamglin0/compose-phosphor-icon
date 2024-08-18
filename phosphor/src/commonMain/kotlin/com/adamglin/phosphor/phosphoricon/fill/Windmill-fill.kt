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

public val FillGroup.`Windmill-fill`: ImageVector
    get() {
        if (`_windmill-fill` != null) {
            return `_windmill-fill`!!
        }
        `_windmill-fill` = Builder(name = "Windmill-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 231.47f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, -8.25f, -7.47f)
                horizontalLineTo(182.94f)
                lineToRelative(-6.3f, -44.12f)
                lineToRelative(3.24f, 1.91f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 21.91f, -5.67f)
                lineToRelative(11.81f, -20.0f)
                arcToRelative(16.49f, 16.49f, 0.0f, false, false, 2.11f, -11.49f)
                arcToRelative(15.92f, 15.92f, 0.0f, false, false, -7.6f, -10.74f)
                lineTo(148.93f, 99.0f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, -3.33f, -10.63f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.21f, -3.3f)
                lineToRelative(20.95f, 12.33f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 183.24f, 96.0f)
                lineToRelative(30.55f, -51.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.67f, -21.92f)
                lineToRelative(-20.34f, -12.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -21.91f, 5.67f)
                lineToRelative(-35.0f, 59.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.79f, 2.27f)
                arcTo(8.13f, 8.13f, 0.0f, false, true, 117.21f, 67.0f)
                lineToRelative(12.23f, -20.78f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 40.76f)
                lineTo(76.12f, 10.22f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -21.91f, 5.67f)
                lineToRelative(-11.81f, 20.0f)
                arcToRelative(16.47f, 16.47f, 0.0f, false, false, -2.11f, 11.48f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.6f, 10.75f)
                lineTo(107.08f, 93.0f)
                arcToRelative(8.16f, 8.16f, 0.0f, false, true, 3.47f, 10.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.36f, 3.62f)
                lineToRelative(-21.0f, -12.34f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 72.76f, 96.0f)
                lineToRelative(-30.55f, 51.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 5.67f, 21.91f)
                lineToRelative(20.34f, 12.0f)
                arcToRelative(15.57f, 15.57f, 0.0f, false, false, 10.58f, 2.0f)
                lineTo(73.06f, 224.0f)
                horizontalLineTo(32.27f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 24.0f, 231.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 240.0f)
                horizontalLineTo(224.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 231.47f)
                close()
                moveTo(89.22f, 224.0f)
                lineTo(98.0f, 162.8f)
                lineToRelative(12.77f, -21.7f)
                horizontalLineToRelative(0.0f)
                lineTo(125.0f, 116.93f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, 10.62f, -3.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.3f, 11.21f)
                lineToRelative(-12.33f, 21.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.42f, 5.47f)
                lineToRelative(31.0f, 18.25f)
                lineTo(166.78f, 224.0f)
                close()
            }
        }
        .build()
        return `_windmill-fill`!!
    }

private var `_windmill-fill`: ImageVector? = null
