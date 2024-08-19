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

public val FillGroup.`Image-broken-fill`: ImageVector
    get() {
        if (`_image-broken-fill` != null) {
            return `_image-broken-fill`!!
        }
        `_image-broken-fill` = Builder(name = "Image-broken-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.59f, -5.47f)
                lineToRelative(14.83f, -44.48f)
                lineTo(163.0f, 151.43f)
                arcToRelative(8.07f, 8.07f, 0.0f, false, false, 4.46f, -4.46f)
                lineToRelative(14.62f, -36.55f)
                lineToRelative(44.48f, -14.83f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 88.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(117.0f, 152.57f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.62f, 4.9f)
                lineTo(98.23f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 160.69f)
                lineToRelative(46.34f, -46.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(32.84f, 32.84f)
                close()
                moveTo(232.0f, 121.73f)
                lineTo(232.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(137.73f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.59f, -10.53f)
                lineToRelative(7.94f, -23.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.61f, -4.9f)
                lineToRelative(35.77f, -14.31f)
                lineToRelative(14.31f, -35.77f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.9f, -4.61f)
                lineToRelative(23.8f, -7.94f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 121.73f)
                close()
            }
        }
        .build()
        return `_image-broken-fill`!!
    }

private var `_image-broken-fill`: ImageVector? = null
