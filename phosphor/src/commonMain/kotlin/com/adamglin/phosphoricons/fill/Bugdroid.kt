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

public val FillGroup.Bugdroid: ImageVector
    get() {
        if (_bugdroid != null) {
            return _bugdroid!!
        }
        _bugdroid = Builder(name = "Bugdroid", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(191.83f, 51.48f)
                lineToRelative(13.83f, -13.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(179.79f, 40.9f)
                arcToRelative(87.81f, 87.81f, 0.0f, false, false, -103.58f, 0.0f)
                lineTo(61.66f, 26.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 50.34f, 37.66f)
                lineTo(64.17f, 51.48f)
                arcTo(87.72f, 87.72f, 0.0f, false, false, 40.0f, 112.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                lineTo(216.0f, 112.0f)
                arcTo(87.72f, 87.72f, 0.0f, false, false, 191.83f, 51.48f)
                close()
                moveTo(128.0f, 40.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, 72.0f, 72.0f)
                verticalLineToRelative(8.0f)
                lineTo(56.0f, 120.0f)
                verticalLineToRelative(-8.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 40.0f)
                close()
                moveTo(144.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 92.0f)
                close()
                moveTo(88.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 92.0f)
                close()
            }
        }
        .build()
        return _bugdroid!!
    }

private var _bugdroid: ImageVector? = null
