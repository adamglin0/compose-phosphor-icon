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

public val FillGroup.`Boxing-glove-fill`: ImageVector
    get() {
        if (`_boxing-glove-fill` != null) {
            return `_boxing-glove-fill`!!
        }
        `_boxing-glove-fill` = Builder(name = "Boxing-glove-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 16.0f)
                lineTo(120.0f, 16.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 64.0f, 72.0f)
                verticalLineToRelative(31.73f)
                arcTo(8.17f, 8.17f, 0.0f, false, true, 56.53f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 104.0f)
                lineTo(48.0f, 78.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.63f, -3.65f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 24.0f, 104.0f)
                verticalLineToRelative(29.19f)
                arcToRelative(16.14f, 16.14f, 0.0f, false, false, 3.5f, 10.0f)
                quadToRelative(0.3f, 0.36f, 0.63f, 0.69f)
                lineTo(64.0f, 179.34f)
                lineTo(64.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(192.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(208.0f, 177.12f)
                lineToRelative(15.38f, -53.84f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.62f, -4.4f)
                lineTo(224.0f, 72.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 168.0f, 16.0f)
                close()
                moveTo(171.58f, 184.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, 14.32f)
                lineTo(136.0f, 184.94f)
                lineToRelative(-28.42f, 14.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -7.16f, -14.32f)
                lineTo(118.11f, 176.0f)
                lineToRelative(-17.69f, -8.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.16f, -14.32f)
                lineTo(136.0f, 167.06f)
                lineToRelative(28.42f, -14.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 7.16f, 14.32f)
                lineTo(153.89f, 176.0f)
                close()
            }
        }
        .build()
        return `_boxing-glove-fill`!!
    }

private var `_boxing-glove-fill`: ImageVector? = null
