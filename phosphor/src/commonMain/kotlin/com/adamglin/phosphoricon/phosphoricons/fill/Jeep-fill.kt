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

public val FillGroup.`Jeep-fill`: ImageVector
    get() {
        if (`_jeep-fill` != null) {
            return `_jeep-fill`!!
        }
        `_jeep-fill` = Builder(name = "Jeep-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 103.47f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 239.73f, 96.0f)
                lineTo(232.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.18f, -1.68f)
                lineTo(221.18f, 44.65f)
                arcTo(16.08f, 16.08f, 0.0f, false, false, 205.53f, 32.0f)
                lineTo(50.47f, 32.0f)
                arcTo(16.08f, 16.08f, 0.0f, false, false, 34.82f, 44.65f)
                lineTo(24.18f, 94.32f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 96.0f)
                lineTo(16.27f, 96.0f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 8.0f, 103.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 112.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(64.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(80.0f, 184.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(104.0f, 128.27f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, 7.47f, -8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(136.0f, 128.27f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, true, 7.47f, -8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 112.0f)
                horizontalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 248.0f, 103.47f)
                close()
                moveTo(68.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 68.0f, 144.0f)
                close()
                moveTo(188.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 188.0f, 144.0f)
                close()
                moveTo(40.18f, 96.0f)
                lineTo(50.47f, 48.0f)
                lineTo(205.53f, 48.0f)
                lineToRelative(10.29f, 48.0f)
                close()
            }
        }
        .build()
        return `_jeep-fill`!!
    }

private var `_jeep-fill`: ImageVector? = null
