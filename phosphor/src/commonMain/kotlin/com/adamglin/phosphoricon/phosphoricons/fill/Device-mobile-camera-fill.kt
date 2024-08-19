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

public val FillGroup.`Device-mobile-camera-fill`: ImageVector
    get() {
        if (`_device-mobile-camera-fill` != null) {
            return `_device-mobile-camera-fill`!!
        }
        `_device-mobile-camera-fill` = Builder(name = "Device-mobile-camera-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 16.0f)
                horizontalLineTo(80.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 56.0f, 40.0f)
                verticalLineTo(216.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(40.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 176.0f, 16.0f)
                close()
                moveTo(128.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 72.0f)
                close()
            }
        }
        .build()
        return `_device-mobile-camera-fill`!!
    }

private var `_device-mobile-camera-fill`: ImageVector? = null
