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

public val FillGroup.`Thumbs-up-fill`: ImageVector
    get() {
        if (`_thumbs-up-fill` != null) {
            return `_thumbs-up-fill`!!
        }
        `_thumbs-up-fill` = Builder(name = "Thumbs-up-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 80.12f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 216.0f, 72.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(56.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 4.42f)
                lineTo(75.06f, 96.0f)
                horizontalLineTo(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(204.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 23.82f, -21.0f)
                lineToRelative(12.0f, -96.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 234.0f, 80.12f)
                close()
                moveTo(32.0f, 112.0f)
                horizontalLineTo(72.0f)
                verticalLineToRelative(88.0f)
                horizontalLineTo(32.0f)
                close()
            }
        }
        .build()
        return `_thumbs-up-fill`!!
    }

private var `_thumbs-up-fill`: ImageVector? = null
