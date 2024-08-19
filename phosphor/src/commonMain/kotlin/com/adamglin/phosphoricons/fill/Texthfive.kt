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

public val FillGroup.Texthfive: ImageVector
    get() {
        if (_texthfive != null) {
            return _texthfive!!
        }
        _texthfive = Builder(name = "Texthfive", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(112.0f, 128.0f)
                lineTo(72.0f, 128.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(56.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(40.0f)
                lineTo(112.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(168.0f, 120.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -21.34f, 55.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.67f, -11.92f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.17f, -7.61f)
                lineToRelative(8.0f, -38.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 88.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(166.49f, 104.0f)
                lineTo(163.0f, 120.37f)
                arcTo(34.08f, 34.08f, 0.0f, false, true, 168.0f, 120.0f)
                close()
            }
        }
        .build()
        return _texthfive!!
    }

private var _texthfive: ImageVector? = null
