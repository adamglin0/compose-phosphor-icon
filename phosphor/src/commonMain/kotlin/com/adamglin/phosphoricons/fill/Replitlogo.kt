package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Replitlogo: ImageVector
    get() {
        if (_replitlogo != null) {
            return _replitlogo!!
        }
        _replitlogo = Builder(name = "Replitlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 160.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(72.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(56.0f, 176.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 72.0f, 160.0f)
                close()
                moveTo(128.0f, 24.0f)
                lineTo(72.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 40.0f)
                lineTo(56.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 72.0f, 96.0f)
                horizontalLineToRelative(72.0f)
                lineTo(144.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(216.0f, 96.0f)
                lineTo(144.0f, 96.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 112.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 96.0f)
                close()
            }
        }
        .build()
        return _replitlogo!!
    }

private var _replitlogo: ImageVector? = null
