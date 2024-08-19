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

public val FillGroup.`Dress-fill`: ImageVector
    get() {
        if (`_dress-fill` != null) {
            return `_dress-fill`!!
        }
        `_dress-fill` = Builder(name = "Dress-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(66.26f, 80.23f)
                arcToRelative(15.26f, 15.26f, 0.0f, false, true, -1.65f, -12.17f)
                arcToRelative(15.54f, 15.54f, 0.0f, false, true, 2.0f, -4.76f)
                lineTo(88.0f, 32.7f)
                lineTo(88.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, -8.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 104.0f, 8.27f)
                lineTo(104.0f, 32.42f)
                lineTo(109.25f, 39.0f)
                arcToRelative(23.91f, 23.91f, 0.0f, false, false, 19.13f, 9.0f)
                arcToRelative(24.67f, 24.67f, 0.0f, false, false, 18.71f, -9.43f)
                lineTo(152.0f, 32.42f)
                lineTo(152.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, -8.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 168.0f, 8.27f)
                lineTo(168.0f, 32.7f)
                lineToRelative(21.42f, 30.6f)
                arcToRelative(15.54f, 15.54f, 0.0f, false, true, 2.0f, 4.76f)
                arcToRelative(15.26f, 15.26f, 0.0f, false, true, -1.65f, 12.17f)
                arcToRelative(1.74f, 1.74f, 0.0f, false, false, -0.11f, 0.18f)
                lineToRelative(-13.86f, 21.74f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.4f, 104.0f)
                lineTo(83.6f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.37f, -1.85f)
                lineTo(66.37f, 80.41f)
                arcTo(1.74f, 1.74f, 0.0f, false, false, 66.26f, 80.23f)
                close()
                moveTo(214.76f, 209.79f)
                arcToRelative(2.52f, 2.52f, 0.0f, false, false, -0.15f, -0.34f)
                lineTo(173.69f, 122.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.63f, -2.3f)
                lineTo(85.94f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.63f, 2.3f)
                lineTo(41.39f, 209.45f)
                arcToRelative(2.52f, 2.52f, 0.0f, false, false, -0.15f, 0.34f)
                arcTo(16.19f, 16.19f, 0.0f, false, false, 41.6f, 223.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 232.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.39f, -9.0f)
                arcTo(16.19f, 16.19f, 0.0f, false, false, 214.76f, 209.79f)
                close()
            }
        }
        .build()
        return `_dress-fill`!!
    }

private var `_dress-fill`: ImageVector? = null
