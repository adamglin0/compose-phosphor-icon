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

public val FillGroup.`Four-k-fill`: ImageVector
    get() {
        if (`_four-k-fill` != null) {
            return `_four-k-fill`!!
        }
        `_four-k-fill` = Builder(name = "Four-k-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(79.55f, 136.0f)
                lineTo(96.0f, 113.0f)
                verticalLineToRelative(23.0f)
                close()
                moveTo(232.0f, 56.0f)
                lineTo(232.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(124.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(112.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.51f, -4.65f)
                lineToRelative(-40.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 64.0f, 152.0f)
                lineTo(96.0f, 152.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(112.0f, 152.0f)
                horizontalLineToRelative(4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 124.0f, 144.0f)
                close()
                moveTo(173.59f, 121.77f)
                lineTo(198.07f, 93.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.14f, -10.42f)
                lineTo(157.8f, 115.6f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineTo(152.0f, 122.37f)
                lineTo(152.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(152.0f, 147.0f)
                lineToRelative(10.62f, -12.39f)
                lineToRelative(22.52f, 37.55f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.72f, -8.24f)
                close()
            }
        }
        .build()
        return `_four-k-fill`!!
    }

private var `_four-k-fill`: ImageVector? = null
