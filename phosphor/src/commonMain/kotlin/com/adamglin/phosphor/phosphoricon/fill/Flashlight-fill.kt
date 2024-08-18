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

public val FillGroup.`Flashlight-fill`: ImageVector
    get() {
        if (`_flashlight-fill` != null) {
            return `_flashlight-fill`!!
        }
        `_flashlight-fill` = Builder(name = "Flashlight-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 16.0f)
                horizontalLineTo(72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 32.0f)
                verticalLineTo(77.33f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, false, 3.2f, 9.6f)
                lineTo(80.0f, 114.67f)
                verticalLineTo(224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(114.67f)
                lineToRelative(20.8f, -27.74f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, false, 3.2f, -9.6f)
                verticalLineTo(32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 184.0f, 16.0f)
                close()
                moveTo(136.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(72.0f, 56.0f)
                verticalLineTo(32.0f)
                horizontalLineTo(184.0f)
                verticalLineTo(56.0f)
                close()
            }
        }
        .build()
        return `_flashlight-fill`!!
    }

private var `_flashlight-fill`: ImageVector? = null
