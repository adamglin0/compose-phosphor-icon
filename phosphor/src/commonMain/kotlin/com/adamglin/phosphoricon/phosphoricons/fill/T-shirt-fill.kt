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

public val FillGroup.`T-shirt-fill`: ImageVector
    get() {
        if (`_t-shirt-fill` != null) {
            return `_t-shirt-fill`!!
        }
        `_t-shirt-fill` = Builder(name = "T-shirt-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.59f, 61.22f)
                lineTo(195.83f, 33.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 32.0f)
                lineTo(160.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(64.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.84f, 1.0f)
                lineTo(8.41f, 61.22f)
                arcTo(15.76f, 15.76f, 0.0f, false, false, 1.82f, 82.48f)
                lineToRelative(19.27f, 36.81f)
                arcTo(16.37f, 16.37f, 0.0f, false, false, 35.67f, 128.0f)
                lineTo(56.0f, 128.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(184.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(200.0f, 128.0f)
                horizontalLineToRelative(20.34f)
                arcToRelative(16.37f, 16.37f, 0.0f, false, false, 14.58f, -8.71f)
                lineToRelative(19.27f, -36.81f)
                arcTo(15.76f, 15.76f, 0.0f, false, false, 247.59f, 61.22f)
                close()
                moveTo(35.67f, 112.0f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, -0.41f, -0.13f)
                lineTo(16.09f, 75.26f)
                lineTo(56.0f, 53.48f)
                lineTo(56.0f, 112.0f)
                close()
                moveTo(220.74f, 111.86f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.41f, 0.14f)
                lineTo(200.0f, 112.0f)
                lineTo(200.0f, 53.48f)
                lineToRelative(39.92f, 21.78f)
                close()
            }
        }
        .build()
        return `_t-shirt-fill`!!
    }

private var `_t-shirt-fill`: ImageVector? = null
